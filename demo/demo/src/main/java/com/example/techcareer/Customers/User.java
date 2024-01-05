package com.example.techcareer.Customers;

    public class User {
        private String userType; // "Individual" or "Corporate"
        private String username;
        private String password;

        public User(String userType, String username, String password) {
            this.userType = userType;
            this.username = username;
            this.password = password;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
}
