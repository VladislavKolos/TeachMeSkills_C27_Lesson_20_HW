package com.teachmeskills.hw20.task1.using_thread.model;

/**
 * Class contains constructor setting the activity name and thread priority
 * method "run" for performing actions within a thread.
 */
public class MorningActivity extends Thread {
    private String activityName;
    private int priority;

    public MorningActivity(String activityName, int priority) {
        this.activityName = activityName;
        this.priority = priority;
    }

    @Override
    public void run() {
        System.out.println("Start " + activityName + " with priority " + priority);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish " + activityName);
    }
}
