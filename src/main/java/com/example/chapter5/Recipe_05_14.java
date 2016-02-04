package com.example.chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apovarkov on 04.02.16.
 */
public class Recipe_05_14 {
    private Player player;
    private List<Player> playerList;
    private int size = 4;

    class Player {
        private String firstName = null;
        private String lastName = null;
        private String position = null;
        private int status = -1;

        public Player() {
        }

        public Player(String position, int status) {
            this.position = position;
            this.status = status;
        }

        protected String playerStatus() {
            String returnValue = null;
            switch (getStatus()) {
                case 0:
                    returnValue = "ACTIVE";
                    break;
                case 1:
                    returnValue = "INACTIVE";
                    break;
                case 2:
                    returnValue = "INJURY";
                    break;
                default:
                    returnValue = "ON_BENCH";
                    break;
            }
            return returnValue;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            if (firstName.length() > 30) {
                this.firstName = firstName.substring(0, 29);
            } else {
                this.firstName = firstName;
            }
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String playerString() {
            return getFirstName() + " " + getLastName() + " - " + getPosition();
        }

        @Override
        public String toString() {
            return this.firstName + " " + this.lastName + " - " +
                    this.position + ": " + this.playerStatus();
        }
    }

    /**
     * Inner class that constructs the Player objects and adds them to an array
     * that was declared in the outer class;
     */
    public Recipe_05_14() {
        final int ACTIVE = 0;
        // In reality, this would probably read records from a database using
        // a loop...but for this example we will manually enter the player data.
        playerList = new ArrayList();
        playerList.add(constructPlayer("Josh", "Juneau", "Right Wing", ACTIVE));
        playerList.add(constructPlayer("Joe", "Blow", "Left Wing", ACTIVE));
        playerList.add(constructPlayer("John", "Smith", "Center", ACTIVE));
        playerList.add(constructPlayer("Bob", "Coder", "Defense", ACTIVE));
        playerList.add(constructPlayer("Jonathan", "Gennick", "Goalie", ACTIVE));
    }

    Player constructPlayer(String first, String last, String position, int status) {
        Player player = new Player();
        player.firstName = first;
        player.lastName = last;
        player.position = position;
        player.status = status;
        return player;
    }

    List<Player> getPlayerList() {
        return this.playerList;
    }
}

