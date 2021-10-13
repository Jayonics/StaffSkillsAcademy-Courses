public class lab8 {
    public static void main(String[] args){
        robot Gizmo = new robot();

        Gizmo.move();
        Gizmo.calculate();
        Gizmo.move();
        Gizmo.move();
        Gizmo.calculate();
        Gizmo.charge();
        Gizmo.calculate();
        Gizmo.move();
    }

    public static class robot {
        int batteryCharge = 3;
        int movementSpeed;
        int calculations;

        public boolean can_process(int proposedCharge) {
            if ((this.batteryCharge+proposedCharge) < 0){
                System.out.println("Robot does not have enough charge to perform this action. Please charge.");
                return false;
            } else {
                return true;
            }
        }
        public void move(){
            if(this.can_process(-1)){
                this.batteryCharge = this.batteryCharge-1;
                this.movementSpeed += 1;
                System.out.println("Robot is moving at a speed of " + this.movementSpeed);
                System.out.println("Battery power is now at: " + this.batteryCharge);
            }
        }

        public void calculate(){
            if(this.can_process(-1)){
                this.batteryCharge = this.batteryCharge-1;
                this.calculations += 1;
                System.out.println("Robot is doing " + this.calculations + " calculations");
                System.out.println("Battery power is now at: " + this.batteryCharge);
            }
        }

        public void charge(){
            this.batteryCharge = 3;
            System.out.println("Robot is charged. Battery power is now at " + this.batteryCharge);
        }
    }
}
