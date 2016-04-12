package edu.up.cs301.fish;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.actionMsg.GameAction;

/**
 * Hey, That's My Fish MovePenguinAction
 *
 * This class implements the action of moving the
 * penguin across the hexagonal grid.
 *
 * @author Giselle Marston
 * @author Christian Rodriguez
 * @author Elias Paraiso
 * @author Elijah Fisher
 * @version 3/28/16
 */
public class FishMovePenguinAction extends GameAction {

    /**
     * Move Penguin Action constructor
     *
     * @param gamePlayer - player
     */
    public FishMovePenguinAction(GamePlayer gamePlayer){
        super(gamePlayer);
    }

}
