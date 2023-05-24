import dk.sdu.mmmi.cbse.common.bullet.BulletSPI;

module CommonPlayer {
    requires Common;
    requires CommonBullet;

    uses BulletSPI;

    exports dk.sdu.mmmi.cbse.common.player;
}