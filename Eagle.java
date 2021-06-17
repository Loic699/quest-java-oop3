public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    @Override
    public boolean isflying() {
        System.out.println("Yap!");
        return true;
    }

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	public void takeOff() {
		 if (!this.flying && this.altitude == 0) {
	            this.flying = true;
	            System.out.printf("%s takes off in the Sky.%n", this.getName());
	        }
		
	}

	public int ascend(int meters) {
		 if (this.isFlying()) {
	            this.altitude = Math.min(this.altitude + meters, 325);
	            System.out.printf("%s flying upward, altitude : %d%n", this.getName(), this.altitude);
	        }
	        return this.altitude;
		
	}

	public void glide() {
		// TODO Auto-generated method stub
		System.out.println("it glides into the air");
	}

	public int descend(int meters) {
		// TODO Auto-generated method stub
		 if (this.flying) {
	            this.altitude = Math.min(this.altitude - meters, 325);
	            System.out.printf("%s flying downward, altitude : %d%n", this.getName(), this.altitude);
	        }
	        return this.altitude;
	}

	public void land() {
		// TODO Auto-generated method stub
		if (this.flying && this.altitude <= 1) {
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't lands.%n", this.getName());
        }
    }
	
}
