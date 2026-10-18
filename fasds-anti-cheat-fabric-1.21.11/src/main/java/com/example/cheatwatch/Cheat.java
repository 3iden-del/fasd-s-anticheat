package com.example.cheatwatch;

public enum Cheat {
    SPEED("Speed", "moving faster than vanilla allows"),
    FLY("Fly / Hover / Spider", "staying up or climbing in the air with no support"),
    HIGH_JUMP("High Jump", "jumping much higher than vanilla allows"),
    JESUS("Jesus / Water Walk", "walking on top of water"),
    REACH("Reach", "hitting players from too far away"),
    KILLAURA("KillAura / Aimbot", "hitting players behind them or snapping aim"),
    AUTOCLICK("AutoClicker", "swinging at the max visible rate for a long time");

    public final String label;
    public final String desc;

    Cheat(String label, String desc) {
        this.label = label;
        this.desc = desc;
    }
}
