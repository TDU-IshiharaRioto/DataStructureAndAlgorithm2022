public class D2_K1_other {
    /*
     * ������̉𓚂ł��ǂ��B
     */
    public static void main(String[] args) {
        /*
         * SnackList�I�u�W�F�N�g���쐬
         */
        SnackList snackList = new SnackList();

        /*
         * SnackList�I�u�W�F�N�g�ł���AsnackList�ɓ����Snack�I�u�W�F�N�g��3���B
         */
        Snack snack1 = new Snack ("�`���R���[�g", 200);
        Snack snack2 = new Snack ("�N�b�L�[", 100);
        Snack snack3 = new Snack ("�L�����f�B�[", 300);

        /*
         * Snack�I�u�W�F�N�g3���ASnackList�I�u�W�F�N�g�ł���AsnackList�ɓ����
         */
        snackList.add(snack1);
        snackList.add(snack2);
        snackList.add(snack3);

        /*
         * print���\�b�h���Ăяo���āAsnackList��n��
         */
        print (snackList);
    }

    public static void print (SnackList snackList) {
        /*
         * �����i�Ђ������j�́AsnackList����ASnack�I�u�W�F�N�g�����o��
         * ���o����Snack�I�u�W�F�N�g�́A�ϐ��ɓ���Ă����Ȃ���Ώ����Ă��܂��̂ŁA�����󂯎M��p�ӂ���
         */
        Snack snack1 = snackList.get(0);
        Snack snack2 = snackList.get(1);
        Snack snack3 = snackList.get(2);

        /*
         * ���o�������ꂼ���Snack�I�u�W�F�N�g����Aname�ƁAprice�����o���āA�󂯎M�ɓ����
         */
        String name1 = snack1.getName();
        int price1 = snack1.getPrice();
        String name2 = snack1.getName();
        int price2 = snack2.getPrice();
        String name3 = snack3.getName();
        int price3 = snack3.getPrice();

        /*
         * ���o����name��price��\������
         */
        System.out.println (name1 + " " + price1);
        System.out.println (name2 + " " + price2);
        System.out.println (name3 + " " + price3);
    }
}

/*
 * ���s���ʂ͎��̒ʂ�
 * C:\java>java D2_K1
 * �`���R���[�g 200
 * �N�b�L�[ 100
 * �L�����f�B�[ 300
 */

 /*
  * ������Ƃ��J��Ԃ��Ă��邱�Ƃɒ��ڂ��āAfor�����g���ȂǁA�v���O�����̍H�v������΁A�s���̍팸�ɂȂ���B
  * ���̂悤�ȁA�����v���O�����𓮍���e��ς��邱�ƂȂ��A�Z�����邱�Ƃ����t�@�N�^�����O�Ƃ����B
  */