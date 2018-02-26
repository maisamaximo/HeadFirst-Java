package chapter1;

public class PhaseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7","multi-Tier","30.000","B-to-B","win-win","front-end","web-based","pervasive","smart","sixsigma","critical-path","dynamic"};
        String[] wordListTwo = {"empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","outside-the-box","positioned","newworked","focused","leveranged","aligned","targeted","shared","cooperative","acceleraterd"};
        String[] wordListThree = {"process","tipping-point","solution","architecture","core competency","strategy","mindshare","portal","space","vision","paradigm","mission"};

        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}
