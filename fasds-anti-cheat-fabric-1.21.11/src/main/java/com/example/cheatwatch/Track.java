package com.example.cheatwatch;

import java.util.EnumMap;
import java.util.Map;

/** Everything we remember about one other player. */
final class Track {
    String name = "?";
    boolean has;
    double px, py, pz;

    // exemption timers (tick numbers when the thing last happened)
    int lastHurt = -1000, lastSpecial = -1000, lastWater = -1000, lastSlip = -1000, lastBounce = -1000;

    // speed window
    final double[] win = new double[10];
    int winI, winN;

    // fly / jump
    boolean wasGround = true;
    double airStartY;
    boolean flaggedJump;
    int hoverTicks, ascendTicks, jesusTicks;

    // combat
    boolean prevSwinging;
    int prevSwingTime;
    int prevHurtTime;
    float lastHeadYaw;
    final int[] swingTicks = new int[16];
    int swingI, swingCount;

    // violation levels
    final Map<Cheat, Double> vl = new EnumMap<>(Cheat.class);
    final Map<Cheat, Integer> lastFlag = new EnumMap<>(Cheat.class);
    final Map<Cheat, String> detail = new EnumMap<>(Cheat.class);

    void resetMovement() {
        winN = 0;
        hoverTicks = ascendTicks = jesusTicks = 0;
        wasGround = true;
        flaggedJump = false;
    }
}
