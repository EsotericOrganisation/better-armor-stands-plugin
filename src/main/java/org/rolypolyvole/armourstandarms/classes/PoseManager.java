package org.rolypolyvole.armourstandarms.classes;

import org.bukkit.entity.ArmorStand;
import org.bukkit.util.EulerAngle;

public class PoseManager {
    public static void setPoseByInt(ArmorStand stand, int pose) {
        switch (pose) {
            case 0 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(Math.toRadians(-10), 0, Math.toRadians(-10)),
                            new EulerAngle(Math.toRadians(-1), 0, Math.toRadians(-1)),
                            new EulerAngle(Math.toRadians(-15), 0, Math.toRadians(10)),
                            new EulerAngle(Math.toRadians(1), 0, Math.toRadians(1))
                    }
            );
            case 1 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(0, 0, 0)
                    }
            );
            case 2 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, 0, Math.toRadians(2)),
                            new EulerAngle(Math.toRadians(15), 0, 0),
                            new EulerAngle(Math.toRadians(-30), Math.toRadians(15), Math.toRadians(15)),
                            new EulerAngle(Math.toRadians(-1), 0, Math.toRadians(-1)),
                            new EulerAngle(Math.toRadians(-60), Math.toRadians(-20), Math.toRadians(-10)),
                            new EulerAngle(Math.toRadians(1), 0, Math.toRadians(1))
                    }
            );
            case 3 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, 0, Math.toRadians(2)),
                            new EulerAngle(Math.toRadians(-5), 0, 0),
                            new EulerAngle(Math.toRadians(10), 0, Math.toRadians(-5)),
                            new EulerAngle(Math.toRadians(-3), Math.toRadians(-3), Math.toRadians(-3)),
                            new EulerAngle(Math.toRadians(-60), Math.toRadians(20), Math.toRadians(-10)),
                            new EulerAngle(Math.toRadians(3), Math.toRadians(3), Math.toRadians(3))
                    }
            );
            case 4 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, 0, Math.toRadians(-2)),
                            new EulerAngle(Math.toRadians(-15), 0, 0),
                            new EulerAngle(Math.toRadians(20), 0, Math.toRadians(-10)),
                            new EulerAngle(Math.toRadians(5), Math.toRadians(-3), Math.toRadians(-3)),
                            new EulerAngle(Math.toRadians(-110), Math.toRadians(50), 0),
                            new EulerAngle(Math.toRadians(-5), Math.toRadians(3), Math.toRadians(3))
                    }
            );
            case 5 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(Math.toRadians(-15), 0, 0),
                            new EulerAngle(Math.toRadians(-110), Math.toRadians(35), 0),
                            new EulerAngle(Math.toRadians(5), Math.toRadians(-3), Math.toRadians(-3)),
                            new EulerAngle(Math.toRadians(-110), Math.toRadians(-35), 0),
                            new EulerAngle(Math.toRadians(-5), Math.toRadians(3), Math.toRadians(3))
                    }
            );
            case 6 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(Math.toRadians(-15), 0, 0),
                            new EulerAngle(Math.toRadians(-110), Math.toRadians(-35), 0),
                            new EulerAngle(Math.toRadians(5), Math.toRadians(-3), Math.toRadians(-3)),
                            new EulerAngle(Math.toRadians(-110), Math.toRadians(35), 0),
                            new EulerAngle(Math.toRadians(-5), Math.toRadians(3), Math.toRadians(3))
                    }
            );
            case 7 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(Math.toRadians(10), 0, Math.toRadians(-5)),
                            new EulerAngle(Math.toRadians(-1), 0, Math.toRadians(-1)),
                            new EulerAngle(Math.toRadians(-70), Math.toRadians(-40), 0),
                            new EulerAngle(Math.toRadians(1), 0, Math.toRadians(1))
                    }
            );
            case 8 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(Math.toRadians(16), Math.toRadians(20), 0),
                            new EulerAngle(Math.toRadians(4), Math.toRadians(8), Math.toRadians(237)),
                            new EulerAngle(Math.toRadians(-14), Math.toRadians(-18), Math.toRadians(-16)),
                            new EulerAngle(Math.toRadians(246), 0, Math.toRadians(89)),
                            new EulerAngle(Math.toRadians(8), Math.toRadians(20), Math.toRadians(4))
                    }
            );
            case 9 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, 0, 0),
                            new EulerAngle(Math.toRadians(-10), 0, Math.toRadians(-5)),
                            new EulerAngle(Math.toRadians(-105), 0, 0),
                            new EulerAngle(Math.toRadians(7), 0, 0),
                            new EulerAngle(Math.toRadians(-100), 0, 0),
                            new EulerAngle(Math.toRadians(-46), 0, 0)
                    }
            );
            case 10 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, Math.toRadians(22), 0),
                            new EulerAngle(Math.toRadians(-5), Math.toRadians(18), 0),
                            new EulerAngle(Math.toRadians(8), 0, Math.toRadians(-114)),
                            new EulerAngle(Math.toRadians(-111), Math.toRadians(55), 0),
                            new EulerAngle(0, Math.toRadians(84), Math.toRadians(111)),
                            new EulerAngle(0, Math.toRadians(23), Math.toRadians(-13))
                    }
            );
            case 11 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, Math.toRadians(-18), 0),
                            new EulerAngle(Math.toRadians(-10), Math.toRadians(-20), 0),
                            new EulerAngle(0, 0, Math.toRadians(-112)),
                            new EulerAngle(0, 0, Math.toRadians(13)),
                            new EulerAngle(Math.toRadians(8), Math.toRadians(90), Math.toRadians(111)),
                            new EulerAngle(Math.toRadians(-119), Math.toRadians(-42), 0)
                    }
            );
            case 12 -> setRotations(
                    stand,
                    new EulerAngle[] {
                            new EulerAngle(0, Math.toRadians(8), 0),
                            new EulerAngle(Math.toRadians(-4), Math.toRadians(67), 0),
                            new EulerAngle(Math.toRadians(16), Math.toRadians(32), Math.toRadians(-8)),
                            new EulerAngle(0, Math.toRadians(-75), Math.toRadians(-8)),
                            new EulerAngle(Math.toRadians(-99), Math.toRadians(63), 0),
                            new EulerAngle(Math.toRadians(4), Math.toRadians(63), Math.toRadians(8))
                    }
            );
        }
    }

    private static void setRotations(ArmorStand stand, EulerAngle[] rotations) {
        stand.setBodyPose(rotations[0]);
        stand.setHeadPose(rotations[1]);
        stand.setLeftArmPose(rotations[2]);
        stand.setLeftLegPose(rotations[3]);
        stand.setRightArmPose(rotations[4]);
        stand.setRightLegPose(rotations[5]);
    }
}