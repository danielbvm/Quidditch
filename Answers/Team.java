class Team {
    Keeper keeper;
    Seeker seeker;
    Chaser[] chasers;
    Beater[] beaters;
    int goals;

    Team(Keeper keeper,Seeker seeker,Chaser[]chasers,Beater[]beaters){
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = chasers;
        this.beaters = beaters;
        this.goals = 0;
    }
    private void setGoal() {
        goals++;
    }
    public void play() {
        boolean keeperSuccess = keeper.isSuccessful();
        boolean atLeastOneBeaterSuccess = false;
        for (Beater beater : beaters) {
            if (beater.isSuccessful()){
                atLeastOneBeaterSuccess = true;
                break;
            }
        }
        int successfulChasers = 0;
        for (Chaser chaser : chasers) {
            if (chaser.isSuccessful()){
                successfulChasers++;
            }
        }
        if (keeperSuccess && atLeastOneBeaterSuccess && successfulChasers >= 2) {
            setGoal();
        }
    }
}

