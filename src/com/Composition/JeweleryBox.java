package com.Composition;

    public class JeweleryBox {
        private Jewelery jewelery;
        private JeweleryBox jeweleryBox;

        public JeweleryBox(Jewelery jewelery, JeweleryBox jeweleryBox) {
            this.jeweleryBox = jeweleryBox;
            this.jewelery = jewelery;
        }

        public JeweleryBox(Jewelery jewelery) {
            this(jewelery, null);
        }

        public JeweleryBox(JeweleryBox jeweleryBox) {
            this(null, jeweleryBox);
        }

        public JeweleryBox() {
            this(null, null);
        }

        public int getJeweleryCount() {
            int count = 0;

            if(this.jeweleryBox != null) {
                count += this.jeweleryBox.getJeweleryCount();
            }

            if(this.jewelery != null) {
                count ++;
            }

            return count;
        }
    }

