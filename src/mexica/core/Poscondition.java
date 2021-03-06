package mexica.core;

/**
 *
 * @author Ivan Guerrero (UNAM, Mexico)
 */
public class Poscondition extends Condition {
    /**
     * Converts a numeric position into an element of the enum Position and 
     * establishes as the position to reach when the poscondition is triggered.<br>
     * Note: If the position is set to other character's position,
     * the attribute character's position is enabled and the characterB is set to 'b'
     * @param pos numeric value for position <br>
     * NoWhere-0, Lake-1, Mountains-2, Market-3, Palace-4, City-5, Temple-6, Jail-7, {b_Pos}, UnknowknPos-9
     */
    public void setPosition(String pos) {
        if (pos.equals("0"))
            position = Position.NoWhere;
        else if (pos.equals("1")) 
            position = Position.Lake;
        else if (pos.equals("2")) 
            position = Position.Mountains;
        else if (pos.equals("3")) 
            position = Position.Market;
        else if (pos.equals("4")) 
            position = Position.Palace;
        else if (pos.equals("5")) 
            position = Position.City;
        else if (pos.equals("6")) 
            position = Position.Temple;
        else if (pos.equals("7")) 
            position = Position.Jail;
        else if (pos.equals("9")) 
            position = Position.UnknownPosition;
        else {
            position = Position.OtherCharactersPosition;
            charactersPosition = pos;
            setCharacterB("b");
        }
    }

    public String toFileString() {
        String res = "";
        switch(type) {
            case Emotion:
                res += "E " + characterA + " " + ((characterB != null) ? characterB : "") + 
                       " " + getIntensityAsString() + " " + EmotionType.getEmotionAsString(emotion);
                break;
            case Position:
                res += "P " + characterA + " " + Position.getPositionAsString(position);
                break;
        }
        
        return res.trim();
    }
}
