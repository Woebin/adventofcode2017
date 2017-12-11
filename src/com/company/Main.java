package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println(day1());
//        System.out.println(day2());
//        System.out.println(day3());
//        System.out.println(day4());
//        System.out.println(day5());
        System.out.println(day6());
    }

    private static String day1() {
        String day1Input = "951484596541141557316984781494999179679767747627132447513171626424561779662873157761442" +
                "9522122966855734523112634451632334931992113878384615946356666994229829477826233173336839784381232613268639" +
                "597197771792285993193211389484665627437615848361845129841316353541162648991819527482245239539764858162952" +
                "279457925557261219133449594544588294854711744157752788653241427333397898789295962759983417788738895858199" +
                "1645747477325224917936659995145418265722557627783466922298236688468856575469127374595946864895749851132621" +
                "593435396398147159398461755451451962378532688837474214731899342321483475178595695839513348665638845455276" +
                "97225625244157159138699463255513966385933987299385264249943482679351535558515522872233133835836699129413" +
                "64344694725478258297498969517632881187394141593479818536194597976519254215932257653777455227477617957833" +
                "27346321659364239421527531473491471972661892317791834266435195425266725323385881436535172293871662154422" +
                "6598956257753212248859258351363174782742336961425325381561575992352415514168782816173861148859478285339" +
                "52915163142953681928649872181232386177163857434441687947625592992915791298415174261326875477968539612595" +
                "4595318134933366626594498249956388771723777242772654678448815844555372892574747735672368299826548254744" +
                "35937766729476455933465952323314658756826111625315518939418869683169128471126487291434896188825338697199" +
                "4431352474717376878745948769171243242621219912378731755544387249443997382399714738351857752329367997665" +
                "1669564675444598175829154785144865414539321755984135542596721173648631125925159889227471648426683619251" +
                "3555124892344996832838588987751215695272519869174695143144349749645576151648657347618532174852364428349" +
                "41811193998743246839223935476828519314359312762677667727982615631179546485764217413848234941878952725825" +
                "756696852799869883577961387943261258527729954463557232111615231618862225628535464884115634739986338479532" +
                "46787557146187696947831335722888918172961256498971868946237299523474841983527391489962357196433927251798" +
                "76436249396589499559268329665187478738424732664388677496682865739371762659157832117483222243412881787176" +
                "5347278152799425565633521152643686221411129463425496425385516719682884157452772141585743166647191938727" +
                "971366274357874252166721759";
        String[] numbers = day1Input.split("");

        return "Day 1: problem 1: " + day1Problem1(numbers) + ", problem 2: " + day1Problem2(numbers);
    }

    private static int day1Problem1(String[] numbers) {
        int sum = 0;
        int length = numbers.length;

        if (Integer.parseInt(numbers[0]) == Integer.parseInt(numbers[length - 1]))
            sum += Integer.parseInt(numbers[0]);
        for (int i = 1; i < length - 1; i++) {
            if (Integer.parseInt(numbers[i]) == Integer.parseInt(numbers[i + 1]))
                sum += Integer.parseInt(numbers[i]);
        }

        return sum;
    }

    private static int day1Problem2(String[] numbers) {
        int sum = 0;
        int length = numbers.length;
        int half = (length / 2);

        if (Integer.parseInt(numbers[0]) == Integer.parseInt(numbers[half]))
            sum += Integer.parseInt(numbers[0]);
        for (int i = 1; i < length; i++) {
            if (i + half <= length - 1 && Integer.parseInt(numbers[i]) == Integer.parseInt(numbers[i + half]))
                sum += Integer.parseInt(numbers[i]);
            else if (i + half >= length && (i + half) <= (length + half)) {
                int j = ((i + half) - (length));
                if (Integer.parseInt(numbers[i]) == Integer.parseInt(numbers[j]))
                    sum += Integer.parseInt(numbers[j]);
            }
        }

        return sum;
    }


    private static String day2() {
        int[] row1 = new int[]{1208, 412, 743, 57, 1097, 53, 71, 1029, 719, 133, 258, 69, 1104, 373, 367, 365};
        int[] row2 = new int[]{4011, 4316, 1755, 4992, 228, 240, 3333, 208, 247, 3319, 4555, 717, 1483, 4608, 1387, 3542};
        int[] row3 = new int[]{675, 134, 106, 115, 204, 437, 1035, 1142, 195, 1115, 569, 140, 1133, 190, 701, 1016};
        int[] row4 = new int[]{4455, 2184, 5109, 221, 3794, 246, 5214, 4572, 3571, 3395, 2054, 5050, 216, 878, 237, 3880};
        int[] row5 = new int[]{4185, 5959, 292, 2293, 118, 5603, 2167, 5436, 3079, 167, 243, 256, 5382, 207, 5258, 4234};
        int[] row6 = new int[]{94, 402, 126, 1293, 801, 1604, 1481, 1292, 1428, 1051, 345, 1510, 1417, 684, 133, 119};
        int[] row7 = new int[]{120, 1921, 115, 3188, 82, 334, 366, 3467, 103, 863, 3060, 2123, 3429, 1974, 557, 3090};
        int[] row8 = new int[]{53, 446, 994, 71, 872, 898, 89, 982, 957, 789, 1040, 100, 133, 82, 84, 791};
        int[] row9 = new int[]{2297, 733, 575, 2896, 1470, 169, 2925, 1901, 195, 2757, 1627, 1216, 148, 3037, 392, 221};
        int[] row10 = new int[]{1343, 483, 67, 1655, 57, 71, 1562, 447, 58, 1561, 889, 1741, 1338, 88, 1363, 560};
        int[] row11 = new int[]{2387, 3991, 3394, 6300, 2281, 6976, 234, 204, 6244, 854, 1564, 210, 195, 7007, 3773, 3623};
        int[] row12 = new int[]{1523, 77, 1236, 1277, 112, 171, 70, 1198, 86, 1664, 1767, 75, 315, 143, 1450, 1610};
        int[] row13 = new int[]{168, 2683, 1480, 200, 1666, 1999, 3418, 2177, 156, 430, 2959, 3264, 2989, 136, 110, 3526};
        int[] row14 = new int[]{8702, 6973, 203, 4401, 8135, 7752, 1704, 8890, 182, 9315, 255, 229, 6539, 647, 6431, 6178};
        int[] row15 = new int[]{2290, 157, 2759, 3771, 4112, 2063, 153, 3538, 3740, 130, 3474, 1013, 180, 2164, 170, 189};
        int[] row16 = new int[]{525, 1263, 146, 954, 188, 232, 1019, 918, 268, 172, 1196, 1091, 1128, 234, 650, 420};

        int[][] sheet = new int[][]{row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, row11, row12, row13, row14, row15, row16};

        return "Day 2: problem 1: " + day2Problem1(sheet) + ", problem 2: " + day2Problem2(sheet);
    }

    private static int day2Problem1(int[][] input) {
        int checksum = 0;

        for (int i = 0; i < input.length; i++) {
            int lowest = input[i][0];
            int highest = input[i][0];
            for (int j = 1; j < input[i].length; j++) {
                if (input[i][j] > highest)
                    highest = input[i][j];
                if (input[i][j] < lowest)
                    lowest = input[i][j];
            }
            checksum = checksum + (highest - lowest);
        }

        return checksum;
    }

    private static int day2Problem2(int[][] input) {
        int checksum = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                int current = input[i][j];
                for (int k = j + 1; k < input[i].length; k++) {
                    double d1 = (double) current / input[i][k];
                    double d2 = (double) input[i][k] / current;
                    if (Math.floor(d1) == d1) {
                        checksum += d1;
                        break;
                    } else if (Math.floor(d2) == d2) {
                        checksum += d2;
                        break;
                    }
                }
            }
        }

        return checksum;
    }


    private static String day3() {
        int day3Input = 289326;
        return "Day 3: problem 1: " + day3Problem1(day3Input) + ", problem 2: " + day3Problem2(day3Input);
    }

    public static class CoordinatePair {
        final int x;
        final int y;

        CoordinatePair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return x + ", " + y;
        }
    }

    private static int day3Problem1(int input) {
        Map<Integer, CoordinatePair> memoryMap = new HashMap<>();
        int x = 0;
        int y = 0;
        int direction = 0;
        CoordinatePair coords = new CoordinatePair(0, 0);

        memoryMap.put(1, coords);

        for (int i = 2; i <= input; i++) {

            if (direction == 0) {
                x++;
                if (x + y == 1) {
                    direction = 1;
                }
            } else if (direction == 1) {
                y++;
                if (x - y == 0) {
                    direction = 2;
                }
            } else if (direction == 2) {
                x--;
                if (Math.abs(x) == y) {
                    direction = 3;
                }
            } else if (direction == 3) {
                y--;
                if (x == y) {
                    direction = 0;
                }
            }

            coords = new CoordinatePair(x, y);

            memoryMap.put(i, coords);
        }
        coords = memoryMap.get(input);

        return Math.abs(coords.x) + Math.abs(coords.y);
    }

    private static int day3AdditionHelper(int x, int y, HashMap coords) {
        String cp = String.valueOf(x) + ", " + String.valueOf(y);
        if (coords.containsKey(cp)) {
            return (int)coords.get(cp);
        }
        return 0;
    }

    private static int day3Problem2(int input) {
        Map<String, Integer> coordinatesMap = new HashMap<>();
        int x = 0;
        int y = 0;
        String coords = String.valueOf(x) + ", " + String.valueOf(y);

        coordinatesMap.put(coords, 1);

        int direction = 0;
        for (int i = 1; i < input; i *= 1) {
            int sum = 0;

            if (direction == 0) {
                x++;
                if (x + y == 1) {
                    direction = 1;
                }
            } else if (direction == 1) {
                y++;
                if (x - y == 0) {
                    direction = 2;
                }
            } else if (direction == 2) {
                x--;
                if (Math.abs(x) == y) {
                    direction = 3;
                }
            } else if (direction == 3) {
                y--;
                if (x == y) {
                    direction = 0;
                }
            }

            sum += day3AdditionHelper(x - 1, y, (HashMap) coordinatesMap); // left
            sum += day3AdditionHelper(x - 1, y - 1, (HashMap) coordinatesMap); // down left
            sum += day3AdditionHelper(x - 1, y + 1, (HashMap) coordinatesMap); // up left
            sum += day3AdditionHelper(x + 1, y, (HashMap) coordinatesMap); // right
            sum += day3AdditionHelper(x + 1, y + 1, (HashMap) coordinatesMap); // up right
            sum += day3AdditionHelper(x + 1, y - 1, (HashMap) coordinatesMap); // down right
            sum += day3AdditionHelper(x, y - 1, (HashMap) coordinatesMap); // down
            sum += day3AdditionHelper(x, y + 1, (HashMap) coordinatesMap); // up

            coords = String.valueOf(x) + ", " + String.valueOf(y);
            if (coordinatesMap.containsKey(coords))
                System.out.println("Conflict!");
            else
                coordinatesMap.put(coords, sum);

            if (sum >= input)
                return sum;
        }
        return 0;
    }


    private static String day4(){

        String day4input;
        //<editor-fold desc="Input">
        day4input = "bdwdjjo avricm cjbmj ran lmfsom ivsof\n" +
                "mxonybc fndyzzi gmdp gdfyoi inrvhr kpuueel wdpga vkq\n" +
                "bneh ylltsc vhryov lsd hmruxy ebnh pdln vdprrky\n" +
                "fumay zbccai qymavw zwoove hqpd rcxyvy\n" +
                "bcuo khhkkro mpt dxrebym qwum zqp lhmbma esmr qiyomu\n" +
                "qjs giedut mzsubkn rcbugk voxk yrlp rqxfvz kspz vxg zskp\n" +
                "srceh xdwao reshc shecr\n" +
                "dcao isz wwse bbdgn ewsw qkze pwu\n" +
                "lbnvl lviftmr zqiv iadanl fdhrldn dlaani lxy dhfndrl fkoukx\n" +
                "raovmz pdysjsw hqps orsyqw rrwnzcz vrzoam jjljt\n" +
                "wgt gzi icpwp qeefgbe msadakj jbbrma sbj dufuujx zex\n" +
                "cfzx bvyu eswr hafcfy klw bgnhynv qrf aop\n" +
                "rzlq atrzcpb hpl pajjw cdxep ean aptzcrb rzcbapt\n" +
                "xogpf ucc nsukoz umtfbw xfvth ozusnk fopxg ubp iflb\n" +
                "xot nqcdyu kpwix szo cyxv hpmp hwtrc zso nyuqdc aha\n" +
                "mkzf cat tkjprc izxdggf obspan lmlbg bsyspf twox\n" +
                "lfmfrd ooclx tcl clt\n" +
                "dxvnyd nxwojj arutn eyqocj swzao tmh juvpezm\n" +
                "teu eman rlmdmk xkbodv fvrcm zorgy wmwe\n" +
                "hmo fdayx duciqf cgt duciqf\n" +
                "imjnv vfmsha cyrusow xjswoq nclrmjy sjxowq ynjrcml\n" +
                "rwbsay alsi bmzpvw ozq aduui nihwx glwdiz ixmkgfx\n" +
                "vtjzc ntkh zekj qrbkjhn zekj lyfnbg\n" +
                "afaig jqhli oie lhwyduh kqfnraz nfrzaqk mayfg iljqh\n" +
                "inb zum zmu dnl zjxg vrdziq ypdnsvt\n" +
                "uhbzmre mpdxm alkbmsq aopjmkl mqxenry ayvkrf zxvs qkfqva\n" +
                "fimjr ccv cnug crdsv\n" +
                "bqyve lhxdj ydu qbyve vihwjr vyodhc\n" +
                "vmng dyttyf noagpji tdtyfy ewiest ogg\n" +
                "kgscfj klmsv vmksl vmlks\n" +
                "qlvh veo wruft wtm fbrlvjr evo wvwmny dhp bvrlrfj lvt vgzuyyw\n" +
                "mxuro orxmu tivu tjdq ojjvju cdd\n" +
                "kjexme gxbysxp yxrum hinrklv fxehytd qkt tqk umryx nim\n" +
                "kywnux wab tzrft dsaz jgwuw dubarmi fle wjguvr umjp uzncwj mzz\n" +
                "qokwh zrda xywufk tbxhhj eejqaoa hwoqk zer hwt hbjxth xyf hmh\n" +
                "eregs qdx tdequa agrlrg mwwpba qjie yrjvhr txujk\n" +
                "iyot fxwdcb zvwfv vfzwv wvkw ncwbr wdejrr ltcdza\n" +
                "waix eza znmonya ldfghws ialwfvc dey ubsz uhbnh svgekg nonzyam\n" +
                "bryz tfbqn xznfmw xiplgww wwxigpl jxzcgxl rzyb\n" +
                "cqvl rrcoqxs staeuqr hzzow cwv tsvol dio coc ddavii uuojy\n" +
                "txbn qvkkyh gbqnjtq ndpkqr srt bkpqfmm ytycev ypcv bpqmmfk\n" +
                "uqkjmul dour zgq ztango yrrjhrg ufxnmuw\n" +
                "ekxbcv vkxbec xbcevk jiq bar\n" +
                "wczff qdu cwffz hhk wlvyg\n" +
                "zjlconc osgsro dajzo hqih ehml\n" +
                "hnio shccluw cpu ivaby tormn vkef abv vkef ivaby\n" +
                "xgbdeso xiizs omqwy sbtnnt khago evviclw xyu dtvg wsyxfuc humewp\n" +
                "cnzu bia vdyqrf wwb qveum hmh ouupgc owli\n" +
                "pjpmfxa dvd lxgh ndy gwph oebfkqv vtlxdg efl ekj dyn\n" +
                "mvan nmdkc ucyshia mavn ecst poo\n" +
                "oybm pjwm bmyo wovgu xykziaq obmy eiirhqd\n" +
                "xkvomx yxvv oxxpth elh vxvy lhe ycn\n" +
                "okxglw gmaangx gnxaamg yduzrr nzwxtnd rcxcu xjjvno yat cin gaxnamg yss\n" +
                "oicgs rrol zvnbna rrol\n" +
                "abb edpnxuo peoudxn bab ceay\n" +
                "ncpkfz gvwunb fckpzn caafx pkcfzn tsfl\n" +
                "fnrt ymenkpq wodubcm niv nvi ziluu cuowbdm zocg pdakwt mlzxkex nuxqclo\n" +
                "uouxcgl stgua otadr ideannq wizxunv iqsdpj mxddt ldst ucxogul\n" +
                "rbrwyhk wqoz zqwo ikwgexl atpu iza\n" +
                "smo yolp pcahlu muljxkq cbkljmz zlbcmkj zvbmgz eaiv ncv zplifm yplo\n" +
                "ocutdhz zmnaap llgv llzpl loavju guzkfq saay rxyhng cwxzx lcv anrnzs\n" +
                "etyzx tcm upxrtvd imyoiu rdpj fed dmm\n" +
                "gonqa szteh szteh razdqh phyff upf knfqfaf knfqfaf fpsgl kakag\n" +
                "mcju mixskop isrwat lcr nfyi lcr aaevr nfyi pqrbk gnful\n" +
                "xfmr fkmnq fbnhd mxrf litniid xbae frxm zcenf\n" +
                "yuh lzojtj rqsh hyu\n" +
                "vbjgql yeshsuv lokt efqota wpwjfu ykyq rxc fxxh ycqfkk gndts vdf\n" +
                "wnylmr kkuruxm azr xukrkum dohkwx dmdb\n" +
                "bjiyrwf dvf fdv vdf gnokekr\n" +
                "jsaq hcww iayqtu llv gdpxdrd hwlo nosjit wpm lcab fcgwr\n" +
                "fxjp bys nnf xzllckh bys hvojw zcwtgwz wye ccyvjv\n" +
                "grafa hbb ghk wkdpsf ufa uoqmysd\n" +
                "yvacf kssbff iovrm mvrio cfbpb avh zzje\n" +
                "gqd qmsen wkvrfz vhtsa zrwfkv gul zkvwrf\n" +
                "hrbi svaogb aogsvb bgrk hibr jbtkr\n" +
                "ljl ryc mrewrge yky\n" +
                "fcqyymt emk qcmyytf mcfvusb luy qany cbsvumf\n" +
                "oknt mcozuc ccmuoz uoccmz\n" +
                "uziil xobutwf acnof iqgwl diso\n" +
                "sekq fxbtsuv ddnnqg rnemlt dngnqd hhgjfus stxvubf\n" +
                "lajcp qgiw fyz blrlcd pviwv buh wnkk\n" +
                "wolqfk nvpapfc rwcqxfz xobno yzjfz irpj wolqfk wbnwjt\n" +
                "vmabj noiljne hhqf holxkbk swwzx ylgj lnmxy lqodhk abjvm bmsrf\n" +
                "bpnp yrz pjepxxs jlmhuy vihlx zacm inuazhc xsxjepp\n" +
                "tryl kryh eonvaad ucevssk umkxg lqej nswopjj svkeucs bmh stosxxz\n" +
                "cfdwd dmfdrvm ibuhsz nwtgmb pjt dmfdrvm cqdcm fzjjz afa ibuhsz\n" +
                "erwp abn jwx ynmkkj rhgg abn epd atqhs rst rhgg\n" +
                "jtnp cegdsoy gfuvfbg gdmn ahlsc\n" +
                "jgrp diu jrgp onjnml nojmnl vxockc\n" +
                "lakqyuw khq dcpiwt ykwlqua hkq plklx ujbckec hjcvur jnp pvyf\n" +
                "usuvoo jkih ylafyy yhio jureyj\n" +
                "uazisdf cnwlfnf ewodatr woaddkd wbla qmn atdrowe\n" +
                "bnyepaa ntqh xppe ydtsw ppex\n" +
                "yewjwsp jxylmtk ijese ewry ijese kbja nfml zeuwcsh juimz\n" +
                "qbvmf nca zsfreo uurgaiz twe fbqmv ncwi etdcsk atowfp\n" +
                "jeotslx kgdpzp wxlcww pdd dcn ddp\n" +
                "macllv ldl kyluine lbt hbxbr wxcaspp ezwvc qxkeu\n" +
                "ivg gxv zsf ucr uff yrz\n" +
                "tdlwbny bqlrlz tbynwdl lwtbdny\n" +
                "tnekq pdaievs ttwpfh xfm fcaa\n" +
                "zqqhl zbf fbz uqrv bfz ffwavhk foccg\n" +
                "vcw ebqdd cwv eddbq nrmq\n" +
                "hpiusz sizphu xzq sgyehk wgagkv hsygek\n" +
                "vagkxa iou frqdnnr ipcg uxvh vvh eskf katgpiq aqktigp gzvseyi\n" +
                "xkwgd kzfxk pgdy fmtvq ngf rshx zti pamviob ely knz\n" +
                "hwo rteohu qzwoe rotuhe wzb\n" +
                "bsqgg tid dti gtats dit\n" +
                "sjtux djwxv dljwjq xwvjd xnqfvx veqdrtl uxtsj nnkjn wnhilaf unirrp\n" +
                "fruuqjk gtote gooklg bzwhim zfnccmm ezipnf cxwdxa wfu fdca\n" +
                "zcyxb byzxc cxbyz pgcqco ivlxz\n" +
                "wrjh zfdinsf ihw xwosiah hdg xpiabno bilyy azdeczg javuwa\n" +
                "rinlv dcpt qhencba mmb njxw gadc\n" +
                "qwcpua qzyzt cxjsgh kumh byiimas qhsgf qytzz rqqruwp ismyiba xydcxz rwkscqa\n" +
                "xbzefi hltca ibzxfe fkx xizbfe wvaynts\n" +
                "oyuce vzk ouxvj gfh efgbv ubc nyb bxnbhd mtwboe whksy ovmrt\n" +
                "ljrebp tacn bpjler utphw wmfw rcnha\n" +
                "drdnic eyodes rcnidd yseeod\n" +
                "umxmsf kfroz ukhjin awpnnnu ooyyohh tuv rafano jze\n" +
                "bakz lfzpjyg gfkqcgn kzh zwpvk gqfngck\n" +
                "jpaony ojpnya hmro xaaz tovary aaxz iel pbg\n" +
                "swvbgc bbhjp yvrcddd rhj clfu eao afrkegn qvvb yvcx nxjmdo rcvtx\n" +
                "conbjy jeqtri wvujt jeqtri rkhllgw tsdt zowreo qxr qbpragn kuzmplw wvujt\n" +
                "jrpxyp hchljy rkowqb eeaf ltllebb gtksrwx iazx vnsfmc zzrxw hlcjyh\n" +
                "piehb cjdzt eqn kuje rls oaewoz lrqwt lcrrq\n" +
                "hdjowxv uknhlv hluknv pokxg\n" +
                "txiqxfr fyyp pyyf xfxtrqi tvm rtvby cfx trx nwrf kqrxtat alwot\n" +
                "wdaadr stexpow ardawd uejqxc\n" +
                "wwgwjel wwgwjel mtjt wwgwjel\n" +
                "mczx uua lgceb dqru vkcea tcet ruz\n" +
                "jkt yroojr qdrtdu wze ovwz fdmqnr xxsyfd kchytwl hctlkwy gyd\n" +
                "eif irnrce iamhxgh bmis uxye azrwdi sznv yuowb vdlqqxu\n" +
                "dxdjyj hngqwzs yhwku qhsctfe rhbc rchb tqhcfse\n" +
                "fxyxnzs qtxevin rvtxtc iqnxtve\n" +
                "zgbpk mwzxx bgpkz wkpkn\n" +
                "rjiym iub lcyw agbtlb bzhx osv rbtf\n" +
                "emmyu uoflio tinih skpqaj rbor gezbhhv ine mij qlqte uuj ycns\n" +
                "owmwc uhxv pyho ftjh jzsg blqn bszyo bob trbycy mkru\n" +
                "mwgz bbqsmpp fgzs bihhg bbn pjxxexs qrqmt htsxfwo qltqp vqqaxi\n" +
                "lpr wcvy sxjqq ltd rftdgv pdnog ymu\n" +
                "qhcos shuy icdhucu lrikh rwslv yxbgibl rcomhn wakirz\n" +
                "civdmee owlzocl vedecim rogmjnn pix pohcmk dsjm yworm\n" +
                "vzdpxp lvt inufv yofqt omm qfoty qrlseqy amkt kjcvg vgkjc\n" +
                "huhq quhh levzsws sjuun ofgqr cjhp nfxbbft rnt wtbd tbzab\n" +
                "tjftkx xpfcv hvftvhw lpypbjg batrn fhwhtvv uthl arbtn brb sthv\n" +
                "ogr uyuxdco bpjgir edztxv sxtgu jzfmx ihnauz zwegqkr kvkw\n" +
                "mhxthf pervvn gshy jig ezjteq ckkcpy gww\n" +
                "tiljyki rpe prcojy tjkylii moxu\n" +
                "pjsdqc lgqydfd lohck emrtejw axwmo wuuv rfi qzyncmw gjijdfb bljfd xrs\n" +
                "ywjab gynzi relf kziy xmsby izyk ocwoho kqnyh bwayj\n" +
                "bhjlz uonz jhmzuq eiajoos zjnbj tomj bmyv hjlbz fgw jjbnz\n" +
                "kszz xzw xzw prtznyb\n" +
                "ghzk vxhwt thxwv slwpayp qxegmi dawdwo kgzh\n" +
                "ibpcvuf wnuwxu sbf jsj bfjynl cdp jbylnf\n" +
                "epaxr vfhf hvff azepadz pwf sbo pgfzya hslyo rqqj rmklw hwtta\n" +
                "yyolko pwbvxvg xdwl yfje hftep kzzsr kho jeyf yvslxpw kfyv\n" +
                "xmk juyjxy eqno mdwklum reg dgn cirh wmxfyj bnxlgo dlobk\n" +
                "oyv gshqyot jgcqe dsf gyohqst gqgeojo egoogjq dmqpyp\n" +
                "sypianq yss lmhu ulmh itilh ndkda lhiit\n" +
                "qbxxl bxxql ikald nfap qixwbqq\n" +
                "jtqhqty ljysnl nwoj toa bmmyj pal\n" +
                "ahktew sxody nkvsf pbxyt baws wgwfwej bevgzm jus hcvajfy kzrb jwgwewf\n" +
                "jzsb szbj ujngwf nfuuf lfiuxdu uufnf orsy\n" +
                "vgo hto isstyul gau wsmxoqw\n" +
                "uxw itwf epaw hec wape hemol rpwyosc xzxmrll eetz zui kagca\n" +
                "mjncux muv rygdeis rygdeis\n" +
                "qgkqjvf iprzibd fkvqqgj llcrl vbh vlf lllrc zwrunt\n" +
                "dslsa wvoex eqbwj tjem gbx ayn xcan fnacl xggxon gnwjlh\n" +
                "yzosv hcxjiz yvon gcgd\n" +
                "bixpny ecln sda eymt bjiwk\n" +
                "rlcad lrdca adoqfzs rgty mds pwb kmwj\n" +
                "wkai pmryffq rrdmodc wgyx taz yxwg nkap\n" +
                "auynzwc vzg uapdv qkrh\n" +
                "ldmuysp oyu kpn ejbl mfifa bzs hwyn brlw qpzqx uyilao ysdumpl\n" +
                "czoxoj pwnultl wezolbw lyk aonesgb\n" +
                "nqy nhb nle yycp lgtbo ojf dytwyh ufa\n" +
                "rwr eph obg peh pejret prjtee ovgz\n" +
                "vdqf vdqf ycjrg ovzl lelbe vdqf\n" +
                "gvagdqm gvdgqam dmb zaxe nepzwn\n" +
                "emwh bkkbgec qwdgk mhvfsrf wmdfpp ekzuua\n" +
                "mbqw lgkyazt ckyhvnq uladwo owt\n" +
                "qwiwd pbo tkjoqda zapo dygqopv zzdlwfn\n" +
                "qty dhb iinncba ytq kvh idgoevt chx waq\n" +
                "ulffsvk vplsz ulffsvk uxsh cpwgxd ikgcacx nrirke uowcjvn\n" +
                "gknmxr grkxnm fco dilyyj grmxkn\n" +
                "saqxkh uhue nvu fef xsuxq ekyyoc bcaavd\n" +
                "qltwqa vrmpv vhra nof yprauc vkreojm eaq igiy mec\n" +
                "wvheiyg uthy gpvcs nhnjrne mqaejr tfnsly zfbhn entcc nystfl cpq\n" +
                "zxv jzk dwsjgrd gqqxhp xqxu naunwc yeh qzpkz awcnnu aoosa icadax\n" +
                "vpmqmg qmvpgm tqs mvpqmg\n" +
                "inehzu zwxeoy jxia fcyzxc hwikd\n" +
                "bzwnp kamsen ajpn kdls bzh xqcb bzwnp cmjnfa wmgx\n" +
                "hbuhc qgvhxy smzkxh zzebox hbcuh net wyrdppc yvgxqh\n" +
                "oeum oemu iyags xaipdi euom\n" +
                "tqljgoq ghtdhw xhnni lux qltojqg lki zxztda pcqjif acpzvwy\n" +
                "ydijaq kbyjxpu onyd hsfgz geqvbg\n" +
                "rwoih xog dtbzyr ryzbdt tdbyzr\n" +
                "vcdxf zosw pardxfz bmb mscmain lwfc jvq hbszcqh fxomsmm ahnugx\n" +
                "zutsemg pqzil ddv nsstz gmeuzst bedvy xkzzjpw xlqbd\n" +
                "xxf ltnnu yeb hbml agj meovtjr qrul kexerkw xxf\n" +
                "tqrpd hhcx bmdv nlmr pnu pajdtc rpatqi yekedx oeiuew epsshog\n" +
                "ttbfpv plairk toh jagfsg njnqpa tmwh vwqp irtxv\n" +
                "vdky uwc tkkkztp vdky vdky qlcw lza\n" +
                "rzie yundymy pwgx wtwtbg kpiw mewnb liveysj uvsbn\n" +
                "jgfvyny hacg pzra arpz uowswu puzsfu hoe heo vrq naup\n" +
                "hqv vrl uko qgpikho lligvxa wdld qgpikho\n" +
                "whvby yomxwj dieffc jkprinh dsaqy yfrnba woyq yexeb mjn cbszn xeswvvo\n" +
                "wowtgu rciyg rlas bra quyfec ihe thuu asxhscu bsbdpbi ogxosu\n" +
                "vydsaet tvnkjq piedkzj foeiqz zqivt iatsju tjnqvk drauaf vqitz invoz\n" +
                "cppn jqzw zmxr qksuas iifmjg xtkgf cppn cppn jpsd\n" +
                "nkifpsq cxdx bokxhm ebww kghagrp bofhrl grc cheuzyj\n" +
                "ibgrlvm hrcx jjuoh ipmt\n" +
                "hcoqkh fzt rgravb cimauj jxjq blct qhc vjxw pqpg qzp\n" +
                "jycxz xcv czxjy vxc\n" +
                "liljaur cgmg neldxb xfummcq yfhiukd dnqhl iolxn cmewhb\n" +
                "hpvoihj fkwokod txy uuktw vmqqb dpldzh yxmcay cyaxmy xycaym wekr\n" +
                "ccnaf wuxc ecadb vbgpt ccntf sezo skjdkbf fnctc\n" +
                "hqdtwho kdhyman bjtcjvr bwllva ncyffyr\n" +
                "xprn jrrvmj pdw yvexm ewbflbe eapml rvrmjj xmevy rxyzhf\n" +
                "wjcbpy qdgtcp cfjh muww fhg sgfdleo nelpte yucqa aavev\n" +
                "rci vqypsqt xmg rzii\n" +
                "gramh wwprtc ampdhw dajr\n" +
                "ovrm mdyhpbl mdylbph aykz\n" +
                "cbmo fxs nuugu guunu upt ljjuhjw nituh utp kxqc\n" +
                "rhabal rhabal rhabal vah lfrs\n" +
                "nrq qway ftzp rtjcks mbygdtd hsiqbh wypqb rtjcks cllp hsiqbh\n" +
                "ywa anhcf nvd puqkwg molrwck wsctx xvd molrwck\n" +
                "wox jzq jfen wcvus cswvu oxw irg lmu tpj viahm jesic\n" +
                "qenad neqad smlgi ydwzq ppdemvs ucyuf qtunm eoqx jlgv\n" +
                "sucpl nrdwbl ltvetok npbw ozzw hafyay sjmui sjmui jkqlq pyn pbuopx\n" +
                "nxgaiu ybyl meo kgh saqjaz xhbqr otelcyp vkwc\n" +
                "iqrl ldjlwvl ajhrl dnhutr gkknyqs mcvluet fgyu ogiz cxo aiunl orb\n" +
                "psd cyq xpoyqny yqc kozqh vonfd uhozwz pds hcpw\n" +
                "tvaxder tulwmw qiw avddbmh irog vynjzcc refx efxr emnvk\n" +
                "myjx npqk whm egw kpy igrrohg ukglx ldnuqw caqg ynx fckhnsh\n" +
                "dafv bkdoqg zcqvbco xgikoac cvbqczo\n" +
                "rtzhpwk ukuyp bayhzp upkuy ahbpyz\n" +
                "oarcuv pnlkxvw fqdkj hwzsz nauwl lpufibz vzfbgc unkluxy rwh xuknuyl\n" +
                "vxhsaj ppdxw qrswqtu ulwv uqtqwsr ppxwd\n" +
                "cww cww cww scu\n" +
                "wiiikwa bfpewt zbgxfkl iqpk tpbwfe aazdcxj ipqk icggn fwn fjr\n" +
                "net ovxuwpz yvzmzd yvzmzd\n" +
                "xgar czuhp vuhisaq fgrqxy evvrtf mnmar lsk\n" +
                "hld mxuedug itswju vmmejqx snzslqj toe bbmugph mgubhpb mowj nrjnzu\n" +
                "qbz ouhye hsldmp lcf hyhlrb ewvle zko\n" +
                "cke mupaq quapm eck\n" +
                "owu zdt lales tzd apjjo fhpx bmuktbw dvehpz\n" +
                "libvl zxypk azazc vtsom ohdzycb\n" +
                "kiowxnc scxygrf ckxnwio ycxsrgf\n" +
                "vcjj fqz lfawfx mps zhv qykch vhz psu zud spu fnpvkx\n" +
                "scfvum fuktgk tua ieosetl wwmjtt exnsw wwmttj plvd pfb kku pdbom\n" +
                "wkfw snukd wkfw gyaojdf bjw htagy cdsp\n" +
                "beh gatqxcu ibrooxr ssww orrioxb eenkqz\n" +
                "jlv affah mtbemf tylh aafhf\n" +
                "zqfajd uwzrw csouuip qzadjf\n" +
                "gsnlrw tcel hha tfbzrp ild aenqa\n" +
                "iirfxef kdux yvj vbzgj\n" +
                "ibx pfll rgkp nancij llpf xib gbkfy\n" +
                "uvw kkbavj pznsnk okigtxl ogitxkl eobbs xhaz wroabn ltogxki\n" +
                "bivdf lotvmoh vrb kpaeeue tdab qhukcb qmy kuqf kesu\n" +
                "egs hbsfeu esg twxko uib\n" +
                "ocraimu qilp ijmx eco nhevqp juxf ksejr bcqqau uhpt\n" +
                "pyx jmpglf juokd dxszjw cml vcjge pfg\n" +
                "gxwrt btmimse dkpbha idmz mtignka ngakmti\n" +
                "dpjhm jyalra hukf imocr lkgt rqywn quhe fukh\n" +
                "nbau xyc bdh yni xaawxm cyx xwaaxm akx gyodqe htbifc\n" +
                "bywdxe bfrp rvb rndl onal jghiwb nuta aint qlciwcx\n" +
                "fpic yrqce land soxhci qzc zoebsq hcdohcc fzhcl iyxb dqinum hchdcoc\n" +
                "zok ghgp zok lmk\n" +
                "ozfz zofz dkdekzb sqc\n" +
                "gfti zuqvg cexmtyl qwuqnj stepb erduqhy cuoizcs qudyreh kqvfdd guzqv\n" +
                "jrugz jzugr lmqu jgihgo hjfbz duxkn unxkd\n" +
                "ckiys dbqmi ckiys ckiys\n" +
                "iylp uvvdp pluifaa djo\n" +
                "esxec rwvel djxppqf jymwt ilm aiz upn aiz wrfefwi rwvel\n" +
                "nitgjr pokxuy puhdwg qtxpb veylp zqvzkbd lrvpcgu zuy rnigjt ibci\n" +
                "jboyzq ogcldr hlon ywav jqqtz qjzqt vyaw cok\n" +
                "aqdw jxn hqknh azbylg\n" +
                "jya qpxtmsj hqrtsgg qjtpxsm\n" +
                "pofcs sxw dlvru dlvur swx\n" +
                "yphvvb qqyyfsp sjkbff dqyerxe jxzes oof\n" +
                "pwbya txk bbwsj ywgimd kmdpc bawpy lbnt\n" +
                "bkbazff ldmaq tyfl acqurpy ndnrp\n" +
                "asw ctiv mnxzyc weeuwb gsn bzk irbyhxl cgqomj izy zbk\n" +
                "yrxcrbt bcrryxt pofe wwzl\n" +
                "vuaqez kbtuyai vuaqez dxqud uvo gmhtg dxqud\n" +
                "tpzs gqdxpxo zzpgta uurjx xpqxodg\n" +
                "cil lsv vznqw vro zqzvjhm jhgauzw uxnwk lci zpgpu frjvyzo tsv\n" +
                "zfvcuim gwn gnw dxfppok\n" +
                "btb goof iwadca aac tbb jha uvzi\n" +
                "qah ned ipmure kyta ffhrwe njz paq kaag xmlui\n" +
                "rkmw vrblwyy gpax hxsf zpbza gypuwf jbib ypcjwd vrlybyw\n" +
                "yfjljn uxpvg huik jsnah nkhsg yfjljn lqzsz\n" +
                "hagjlqx agnax jqalxgh rvjgtc mjrmph azznzcq gxajlqh\n" +
                "ipki bhoabp rmiyl dmjyxl zzsmap aju\n" +
                "tyjrr rigrf ciq qic avmwu jtr wpq\n" +
                "vuf cosgytm toycgms ufv qzpcbrs\n" +
                "epzgxr lydrsj ezxrpg expzgr\n" +
                "ecm prj kmak makk jpr\n" +
                "ccwyq txy okj matxa socoa\n" +
                "zrjphq gigayv ywkfmru yrwukmf fxjjrha gqkxx zhjy tisutx kufrywm izjfj igg\n" +
                "lfhgsro gsroflh wrpo lofhgsr\n" +
                "kgkgj wkhnab ubrjaoa ubrjaoa ubrjaoa ggdgh\n" +
                "hztutpn epnqmz ffcroq mnqpez niibpn kdloak xjui ozttj lyzsc pzgq inpnib\n" +
                "kruz sjqp mmd hhdxjgc mauouma asevvo upjwqi hxcgjhd etqzagp\n" +
                "zylf qime cho oraid svytv gqrjufv mker cho vnkyiin tjms\n" +
                "dotjul qyv hnh cibtg gdpauyx wzp\n" +
                "fabtira ejxoeor cqyethv ndjrq hnxn joq otng lrr csytrub\n" +
                "txhgepd fwdaanm nawdamf pxine qqrn pronw exnip qwkimt rvy\n" +
                "kuxzhi jln urzxtw rzu ebsuylm tscru qwlhfgq nnu nuchvz vuht\n" +
                "cqgu camlr umkltcf stx izp rtdwxff wkfvs\n" +
                "jhje cxix lefcrsu nebv idfzhic xqri xkft\n" +
                "utzxb znb ietupd uqgbhje aobip oawjwm hetyan uqtqv hpwzyri kwxyu\n" +
                "jvzvbt xuyvp aegdkb srbw bzabpf lyfriez cruyfu\n" +
                "nhi nih aeb ihn\n" +
                "hcf zypt djcm pkjx pvhh\n" +
                "rhvxcfk exydvk ids hybme hnk yfchvs mjbo meocn\n" +
                "rpboxr rxoprb hdzje zhedj\n" +
                "ziildbo apzvatr vsv isndq ebxyy ntm tdttg wkvdh qnids vkdhw xxolip\n" +
                "ywu uyw ipcjz pjzci xjn kvgk vsocprw\n" +
                "euzo njlpv ndrlhi drlnhi ivmjkb fjrtxta skvgmrd\n" +
                "gbyvj dkck gevpfvb lhadhx rgjcdn yraxh bdk oen vqryd bkr\n" +
                "vgkp hncttxb wgxh gdyjo bbdfzvc xhgw rznzgda yxrrlo gxhw\n" +
                "ifjlb fpecyic svhjp ilmj oxgr svhaf\n" +
                "vbqky lhccj xtmm xzjyykn oqmdq qywir bswly\n" +
                "euxxziv totzer vsxfx leo djho uoeaz edaig fbu lumbi\n" +
                "ooqtwq pvo kid vpo jxin bod btqc fbyuz\n" +
                "jhabi mronu htqqyz umjcbv sgnbp wyn cetmt pcjf\n" +
                "tnrkcyl dduuhxh rylkctn pwj rtynkcl mzzfomr\n" +
                "rxx ldqffi ulappk nltawbn tplhb kyb cqyi\n" +
                "vzkw gviooah vxh xeae ohvcad oaiwcj dkx\n" +
                "sdofdjt hcifv dqws sia mlwm vfich kavh myzue roops mzuye\n" +
                "uxs nlbmjp nlbmjp tlaxa tlaxa\n" +
                "ynnisp twx xtw jgkc yinpns\n" +
                "kumorsm wav xhx bpvz clqc ffmadzl ndny ymslo lobv\n" +
                "ljzabj tqhves mezh pwn wue dwfqq lynvtt boeknvi xqbd pkud tzlanis\n" +
                "lgq qiikzl oihnsr pivtjmu qhic yvmeebg rxu qgl yuxnqse dvu faxqez\n" +
                "ldk mlwja vmdqr yzlxiua amlubt ejmzfx nonm zhkxbn gaqbnqq\n" +
                "ttc ctt kneknx smtnaft abljip tct\n" +
                "uybhbiw zwojzlm cfxoopp abulenj znz zzn opllzmm yufk witwxzp\n" +
                "qvkybwi rdbxb qiuizmo fqgne jgot jxz dqhapn\n" +
                "vzinf ehaley amnk laheye invfz\n" +
                "pedakl ivld agzyhr wmzba tzzzg bazwm wjwgux thrnxkn\n" +
                "cmyhae nwfs nfsw kmh pxkaffq\n" +
                "vdf szupev tyunp qiiu deevxmy wozvtt nelnr kgdexy gparqj hajavz biizn\n" +
                "pwspk skpwp ontbjee pkspw cfbj\n" +
                "ihsmh djxtak wkzllao oyr djxtak prc\n" +
                "uhvihqq jrgf hdfek pdrfpt tghz gthz awae wcygi wujti svq fhedk\n" +
                "gnfhsj odqlt netmsul rviio nkzw nkzw\n" +
                "xyvc clxw cyxv lxcw\n" +
                "duegck pkviu npwsp zdx wpvn dmxgnv ixv fybs xteru\n" +
                "vih kgk hads boaddu daiwo hozoufv nef vtcplc isiw\n" +
                "tzqoo dqlgvno jzlay sywx ecej addt ecej addt mnfcu\n" +
                "ymgmby zegudpx ipsjai ger wcwjw brzebb\n" +
                "eqekxlx itra xekelxq exqkexl\n" +
                "rciu ojaa ircu nxjga puvmwou remgu\n" +
                "sltth pprimb slnxopq avtir hvpv ppww fhfap wisn kzs jcuuuuf\n" +
                "xbppc ydpbq zhjh oym iljzvk vsb\n" +
                "ueye shtps uccehi ccheiu dqm yeeu\n" +
                "gwywf lcpv qza qza gzuovj jfzffyh oybfxqv\n" +
                "aawi ynsvdco azdoz cqr tnyquq xlyvbx eca kcalpes\n" +
                "zumgzhy rou kguqa vubw bwgd qprxcg etnbev nqmi\n" +
                "fyd tuoz uwclqn cgl lrpkf irz dizv nxze clg jghx jbpt\n" +
                "kwuanos eorjr tcahp kwuanos cyrpfji zxayggd kwuanos jkqt qqvbork lizk\n" +
                "vtu ovje vhg ovje vtu zcy hrhtr puawfgv\n" +
                "bliz exp wot svxv epx\n" +
                "jiqgxwj yips hjsatc jgsrno msfp vxvbt bba bqmw xjgpgog\n" +
                "vpvypp ggwp wggp gndp hedpse afji hcqgof\n" +
                "hxueubt hiynoa qqzaj ohb qway\n" +
                "akq nfnes sdrlza nfnes weq\n" +
                "udxpdpx gctuv llhxuow rqtetm hdbnpte oebapv civy oeobu ftgivd pykj\n" +
                "pbgbvn jgmr xrz dfn gosjobw ndf\n" +
                "gnf dtbsnc fwcmml tscdnb fgn qgadusl eifpk\n" +
                "vmnv yuxrup qcphi tanc tnca kjrv cphqi\n" +
                "hclggs sghglc fgplp odn pfglp emkrulf whwtmbs qnuyg\n" +
                "wcxtr ani ain sha hsa zxbkf bzxokat qezo ljqxi xqcwfmd dxo\n" +
                "waiq smpbu dbyka uibxjrg nze wiqa rfpts ddjsjv jqqjez bpusm\n" +
                "lpcxf vsbj owjwc tuqj vkrgrh jsjdepv oil lxrjox frsxsi clr\n" +
                "vzunp prwk nnd rfs vpuzn\n" +
                "pqpqv lvsk sqxf nhobsm hakbn ywj\n" +
                "xxu uxx szqnmi lnwtmx\n" +
                "akq nmlw fupwsth jduvhva\n" +
                "nac wwlxqck hpbce vxxqa fyp xvxqa kxwclqw yvlmv bfwi\n" +
                "pzxjbj nvwv mdooiez vvftp enjrsck iypu uhru fpx omtd\n" +
                "llxgp qwf pwaj cuhb scloot hbcu jgp vjw ooclst\n" +
                "sisd akawvzd wvdzkaa gyoij ikt eeeosb jiwiup\n" +
                "tche vxj sbctqv jvx gosur usgor ibo yqxo qqgd zspl\n" +
                "cidd welisl fxblxqk qxbklfx fbdoqcz glhq iylodvz zvds ghlq\n" +
                "cnsa hrxst mrnkqtj bptq jmi cpbcofs kveyeur uzmga modphm rtx kntqjrm\n" +
                "dvyup usfaq rtghoec bvcos fqsua zohwwg\n" +
                "onf vncybi dlaxni oqyqqkn\n" +
                "okfwa qyyx ebnv llql nphq etdt ytgivlo jwgwz kiob\n" +
                "ann vqnqvpx wth lpwid bjvzw xpwqxcj azg ioeyzzp onwf\n" +
                "smy epzomx xep yid zctvrfj astdj cfg fgc eriuxt\n" +
                "rljqgin wzobzrh cuwtx vcsbx tmg tuysq vxipgho\n" +
                "ewp rsrnsj wgeyin lrji ddgt utol xxwut fjiwopa\n" +
                "upu ftvqbk tfkvbq fdwga rmu puu hbiasjw\n" +
                "cfl lmqkb lfc wbtlfi uqsjs ejgmphi tbliwf nzcela gzb\n" +
                "zop unwmiu acull mkwh hvruknw rfk mmhaz iqmenq fifino\n" +
                "iczua bjut tlgf zicau jtbu\n" +
                "mtka ipd mdifj kps\n" +
                "irqkysw xfsjl tedx yckkbx iktxb sqxn pbfvubv uudzppz\n" +
                "mdrn cihat wcext kufs awwtjok pfjg\n" +
                "wdevt tyo zzbp pqlqq wdevt\n" +
                "yhatqkv ntuhw tdfd buxazh xbcsv bas gkv rbzi tddf jbj bsa\n" +
                "malip hiiy qezz yhii wlfojre\n" +
                "zqnfll bssveq lprwbep bhqml tztbt\n" +
                "npnxotu yupdytb jptqo klfydfe fpucmfq svxcqr unopxnt\n" +
                "gdpz gwj iytiohu efk ctjzf asade abhotq brmhu tbtdur zzksbh\n" +
                "kxft klzslf tjdzciy lzslkf\n" +
                "ejei ezmemvg xlt zte tbwhz dgnfpao zotck wus uaz gbwbb\n" +
                "dgednf vypmbs eiytot empfmny\n" +
                "uopmui uehue wdvzt adpfcif mutl ifaztka vydi xumtz orstno\n" +
                "dleero olxiq gxnlfm nfmxlg wloeavr olhrwg hrjd yicj ymyeex qav gxyjgfq\n" +
                "hevj rqcne zycgb qgqtn rqcne ptfvu yyyu zlm hevj\n" +
                "zrkhuh sttnkt hkuzhr vqtu\n" +
                "ppsfm kcao qjq dgadglx cxaawjn pbucfu fed qgioarc dfe ricoaqg\n" +
                "vmawf oktunea zraoir gkt zraoir jcvkqoq\n" +
                "mqgml ecawug ugwace szwul iwbmooj owmiojb\n" +
                "auggaw cypcuw npci vuyxijd pofswjx vdkrgx xylk rom ksj\n" +
                "qmwx jgsrdj ikva xzxw avik\n" +
                "zzhcqu rbg pywjdn wyndpj zchuqz\n" +
                "wzd wqycftu yldezp zovuy oydia hovewe\n" +
                "kfid qkkk thak qhbf rvzlzvu uuxh pbj hkat gow oeqcw knqqzha\n" +
                "sua itv hfpg bdqye bznlrk hfpg bdqye kvir kaai ggtz jqn\n" +
                "ulggl guitamm tkpckso fupacz otxtqpd jxnqc\n" +
                "ueesb ndyik vjftz jgqqv nrcf\n" +
                "krh dqpmsw fybzynl zhjbvkw exefc rhs neq ldprb bhhvxm pjwirun\n" +
                "ymavl qwxr yavml wagwc ekokrpq zewppw iumcgin cxdvwx\n" +
                "wwdukav kuawvwd kowv dkwvuwa\n" +
                "eazot bil tzu vdwwbm fvauwrq\n" +
                "esq tixokph yspf ztoxfut lgzush pwv swh pwv auqhuu tixokph\n" +
                "pdbeyxi poio mugfkb brwbbx aao uszw fokjeb uswz\n" +
                "sbs ryjr ptispi tvnhu htunv vthnu\n" +
                "czjmg hbdjhvi jrkoy fpgwc syafy aar kvnq eaecsb wqzpx\n" +
                "twtp dvl uvyje qtlzj dsvyr qpjnj eyoigx bhgpccy gwn dtuf\n" +
                "mxit xunctu vbyks wmqc jriuupl ybvks uncutx nsoxwrb ykt prc\n" +
                "yye mgf uhc irowpc dsdv iwaxod ftavlj dxzp tcch tcch mefz\n" +
                "rxe xwrrgl xwrrgl duu rxe xbbgoe\n" +
                "ucsz akswcd ojrmqq cox hgfh lxwu ltnnf cenikcp\n" +
                "opjhdp svwezr svwezr opjhdp\n" +
                "qojlkl ircxqnt utfmdg fcvr vehkcvt ufmzcpv xwlh ddavv xel bwlz fii\n" +
                "rzkayeh iursm zhily hdnq fqydfvt uwoy hptpiqu tdqy bgr xdr\n" +
                "ymruz umzry hbltwya jhwhzk flh tahylbw bdbaimb qscbp ntkuf\n" +
                "uxpato owsqyao vaog oenomkc usrmnc epua vzkppls\n" +
                "qxqczbk qyguz alawj xgjawtw wxtjgwa snfcdmz\n" +
                "fjfgos rmpd mgs vbk dlls jkljao eoovdfb ucdvaoq qmjmqku ney porr\n" +
                "nmcrqz zcoxpk dlnzksd ymh zyg spxss ruyk bychq gsgv eusiuid mnrqcz\n" +
                "jbzadnx lzl sdamer okoico frqisrm lxet agriw\n" +
                "xceoqr qai vahc jjzifsn exg\n" +
                "igjpn wfy ukn aag quro wklsq cjq bgtjrdz gmub wyhh\n" +
                "fzlwnm mygfn vkzwvw zvhsex gfki\n" +
                "ijvzgai ebmeq wssfmbq uguh sfuutm nwkgmex dxael liakdxs rnf sky yowpxc\n" +
                "bjzkyjh fced nji esowk qxsubsk qgtts\n" +
                "nkdgo bbjfq fgnxnhd gfjchl jetdb xubsgj eiju ldlm oxsx znft bbqfj\n" +
                "xovcnob pxfe pmstes yzkdm iqlvha nmcziix fexp ivqalh rxecqps\n" +
                "xpyew xudfud wwqe qhfjlcu epv fnrbgyv ihli qngtx yjlfg ozqbzn esp\n" +
                "timl gcohx vqzic gzm shwlkkv icqzv urchuc\n" +
                "xpqq gaqzwo cci dowahsr gaqzwo\n" +
                "jjsagdl umbpxre kyre zvaryft tmw pxpnjy\n" +
                "aqovcz nunq nnuq xjrvvh autjmit jiatumt\n" +
                "elg lps lge zjjot hwz tmqrup xaxxmo zlbzp uftd fukdad kvpymsm\n" +
                "iokwzal ywti zbdmzbu lprywe wbgbwza ypogbga kzliwao wstqi eqm keaeaj gbabwwz\n" +
                "lwfpk mhufe eddzgd ljxyqy vhzkct uemhf\n" +
                "lwqil fzugdo faq feppo usl llwqi\n" +
                "nje hthr ropq qvcepu bexszfj avmzjvv zajmvvv fhcd xnc cnx qnuaux\n" +
                "kvksn dphbyz nsx wrcc ccrw\n" +
                "nzpa pzzunfv ygzjy gxrrtcj hrt trh pwxpg yifgjmo fnupzzv wbzx\n" +
                "aepti rbojui ypvhe ubojri tcema aan dntkw qjx bfvmyos tcm hvoqytn\n" +
                "qpwq exu jvsiwj gsw avr vbemldy\n" +
                "xsbzpf xbzyvx xax sxh vpxt gccy xxa zhgbwoa hwwxoky fhvdxfc pvtx\n" +
                "pnsa ovtjolz tyutl eyjjzt jvtoolz owbypvr tytlu ewtzgec\n" +
                "cyg dwwk eihsp aeuk bbnay aluwyz hdmv uaek mwt ihpse wjhnkeg\n" +
                "fhzx vjetz vjub tejvz\n" +
                "ewwyb jidhu pyvyenn igtnyd tiwr akwkkbi myz xxjwb jjrdeg\n" +
                "jbkuw kwir rkiw ubwkj\n" +
                "bltffuw lftwufb hhsh wfbtulf nrxaa rlszi toijxnz czlci\n" +
                "bqrm pga zgblgcw pgwhhn lcgzwbg bcgzlgw yqb\n" +
                "mhjj vjoa gnjlc kclcr ito ofksy giavy fpqeioj\n" +
                "bkiqmif izidbui sttxxi bswhkxp sduuw\n" +
                "mjgnvw mjgwnv ojzyuv gvj\n" +
                "qxn kkhc whd fgwk auzugg augzgu kqfov wfgk\n" +
                "spdxbnu xpfofsb bpfsoxf ahjywql spbxoff\n" +
                "bwqxhlm wbqlxmh kqgpl fyzgf guhkvgx ovk qhmp gnrmu wvd wedj\n" +
                "vvwf hcnc vvwsngj qedzoxm hcnc qedzoxm kjthdi cbwqep qtvu\n" +
                "gio iqklmro noqablo bab jiqc rwebyg rqkloim wzmgs uunl amqs iwj\n" +
                "snxj szobqt zcgvwv wiyqknu\n" +
                "uto jteikwd cew gqsks hmvjtcy sach\n" +
                "zpgl qnkoex amhufmr figns upv xezrl rjleak nwrna\n" +
                "pzkvrdz dtonazj gtr gfxucuf lstjl lsjtl rgkope kzpdzrv lyptn zfxjys ttk\n" +
                "ddxgm lumlgki jhv doft kok swy ckds swy ddxgm lbfbdv\n" +
                "qfs rcufzgz iaiqw qfs qfs\n" +
                "nvkbo sgv mquwb ritpye nbkov poex hraorm qrrr qdt qefl\n" +
                "irxannd fiud ehyb ggx plqg pvvn uuptop tcvbm abuf bcfnmw\n" +
                "qwya ukblz epmbfr vmlon yqwa\n" +
                "hlo mmv vmm mvm\n" +
                "svzpxun yugbbe sbbpxs dmy xspbbs zhpovyf fyovhzp cpbt pke\n" +
                "zgk gft zybs zrgcoo ypu bue htgo\n" +
                "xnesq srsx pkzaoh cfqzugh\n" +
                "lntd nvxetbv clykjpd svmibpx evxtvnb yldkpjc\n" +
                "jsqq tzwak hephg eqwczd ioisa yim tmdifn mceip\n" +
                "kuwqz wzkqu zwchmj lfec uexne iztp llityt\n" +
                "kvamkpc pvbryqh ion cwizjde gln kcpvmak pzzlw gnl\n" +
                "ydeqf bfaab sydqhbp smsxdjr pynrs cqymt\n" +
                "onb eiab bno nob\n" +
                "mqslq scnelxv hyllrf scnelxv mqslq wmnbk\n" +
                "pttu kubby lgop bbyuk gsk skg ikktlbb inbyvz\n" +
                "xznvl zwtdj vbxdyd clhw\n" +
                "hgy zudelp ickc drfjgn iyws xhc\n" +
                "zzv wik iorhat qkb kjb lykdz vrce yjsjwj\n" +
                "gyw xzgbi efus uuy\n" +
                "hwcy ujdun bjjuvd jbdvju onnk xeyy mmp onkn qyzl\n" +
                "jwfm ptjwrbl hhuv uolz adyweh qpj wxyogp igvnojq jmfw pqs fsnirby";
        //</editor-fold>

        String[] input = day4input.split("\n");

        return "Day 4 problem 1: " + day4Problem1(input) + ", problem 2: " + day4Problem2(input);
    }

    private static int day4Problem1(String[] input) {
        int validPhrases = 0;
        for (int i = 0; i < input.length; i++){
            boolean valid = true;
            String[] phrase = input[i].split(" ");
            for (int j = 0; j < phrase.length; j++){
                for (int k = j+1; k < phrase.length; k++) {
                    if (phrase[j].equals(phrase[k])){
                        valid = false;
                        break;
                    }
                }
            }
            if (valid)
                validPhrases++;
        }
        return validPhrases;

    }

    private static int day4Problem2(String[] input) {
        int validPhrases = 0;
        for (int i = 0; i < input.length; i++){
            boolean valid = true;
            String[] phrase = input[i].split(" ");
            for (int j = 0; j < phrase.length; j++){
                String[] word1 = phrase[j].split("");
                Arrays.sort(word1);
                for (int k = j+1; k < phrase.length; k++) {
                    String[] word2 = phrase[k].split("");
                    Arrays.sort(word2);
                    if (Arrays.equals(word1, word2)){
                        valid = false;
                        break;
                    }
                }
            }
            if (valid)
                validPhrases++;
        }
        return validPhrases;
    }


    private static String day5(){
        String day5input;
        // "\n"
        //<editor-fold desc="Input">
        day5input = "1\n" +
                "2\n" +
                "0\n" +
                "0\n" +
                "0\n" +
                "2\n" +
                "-2\n" +
                "-2\n" +
                "-3\n" +
                "-3\n" +
                "-7\n" +
                "0\n" +
                "-1\n" +
                "0\n" +
                "-10\n" +
                "-8\n" +
                "-12\n" +
                "-8\n" +
                "-3\n" +
                "-6\n" +
                "0\n" +
                "0\n" +
                "-18\n" +
                "-17\n" +
                "-11\n" +
                "-18\n" +
                "1\n" +
                "-7\n" +
                "-10\n" +
                "-4\n" +
                "-18\n" +
                "-8\n" +
                "-26\n" +
                "-15\n" +
                "-24\n" +
                "0\n" +
                "-8\n" +
                "-17\n" +
                "-15\n" +
                "-24\n" +
                "-7\n" +
                "-21\n" +
                "-15\n" +
                "-19\n" +
                "-30\n" +
                "-40\n" +
                "-44\n" +
                "-23\n" +
                "-3\n" +
                "-25\n" +
                "2\n" +
                "-31\n" +
                "-20\n" +
                "-45\n" +
                "-51\n" +
                "-50\n" +
                "-34\n" +
                "-4\n" +
                "-33\n" +
                "-41\n" +
                "0\n" +
                "-49\n" +
                "-43\n" +
                "0\n" +
                "-62\n" +
                "1\n" +
                "1\n" +
                "-32\n" +
                "-50\n" +
                "-22\n" +
                "-10\n" +
                "-60\n" +
                "-13\n" +
                "-46\n" +
                "-57\n" +
                "-40\n" +
                "-28\n" +
                "-33\n" +
                "-34\n" +
                "-13\n" +
                "-40\n" +
                "-5\n" +
                "-49\n" +
                "-17\n" +
                "-25\n" +
                "-71\n" +
                "-5\n" +
                "-16\n" +
                "-23\n" +
                "-58\n" +
                "-69\n" +
                "-22\n" +
                "-28\n" +
                "-84\n" +
                "-70\n" +
                "-71\n" +
                "-73\n" +
                "-87\n" +
                "-8\n" +
                "-11\n" +
                "-99\n" +
                "-65\n" +
                "-27\n" +
                "-32\n" +
                "-48\n" +
                "-87\n" +
                "-96\n" +
                "1\n" +
                "-58\n" +
                "-101\n" +
                "-94\n" +
                "2\n" +
                "-52\n" +
                "-34\n" +
                "-22\n" +
                "2\n" +
                "-25\n" +
                "-7\n" +
                "-36\n" +
                "-66\n" +
                "-84\n" +
                "-100\n" +
                "-45\n" +
                "-65\n" +
                "-69\n" +
                "-52\n" +
                "-5\n" +
                "-4\n" +
                "-93\n" +
                "-100\n" +
                "-7\n" +
                "-13\n" +
                "-50\n" +
                "-87\n" +
                "-87\n" +
                "-4\n" +
                "-119\n" +
                "-25\n" +
                "1\n" +
                "-41\n" +
                "-58\n" +
                "-24\n" +
                "-12\n" +
                "-15\n" +
                "-39\n" +
                "-140\n" +
                "-40\n" +
                "-136\n" +
                "-88\n" +
                "-141\n" +
                "-112\n" +
                "-43\n" +
                "-68\n" +
                "-67\n" +
                "-128\n" +
                "-23\n" +
                "-24\n" +
                "-90\n" +
                "-56\n" +
                "-71\n" +
                "-146\n" +
                "-46\n" +
                "-41\n" +
                "-76\n" +
                "-54\n" +
                "-38\n" +
                "-144\n" +
                "-53\n" +
                "-1\n" +
                "-97\n" +
                "0\n" +
                "0\n" +
                "-70\n" +
                "-60\n" +
                "-171\n" +
                "-12\n" +
                "-97\n" +
                "-147\n" +
                "-21\n" +
                "-174\n" +
                "-108\n" +
                "-101\n" +
                "-91\n" +
                "-56\n" +
                "-76\n" +
                "-13\n" +
                "-177\n" +
                "-1\n" +
                "-40\n" +
                "-2\n" +
                "-177\n" +
                "-136\n" +
                "-168\n" +
                "-126\n" +
                "-5\n" +
                "-175\n" +
                "-177\n" +
                "-144\n" +
                "-104\n" +
                "-174\n" +
                "-4\n" +
                "-172\n" +
                "-114\n" +
                "-69\n" +
                "-18\n" +
                "-24\n" +
                "-157\n" +
                "-47\n" +
                "-110\n" +
                "-6\n" +
                "-155\n" +
                "-79\n" +
                "-157\n" +
                "-93\n" +
                "-93\n" +
                "-114\n" +
                "-77\n" +
                "-148\n" +
                "-32\n" +
                "-100\n" +
                "-192\n" +
                "-144\n" +
                "-123\n" +
                "-192\n" +
                "-65\n" +
                "-220\n" +
                "-143\n" +
                "-1\n" +
                "-40\n" +
                "-149\n" +
                "-69\n" +
                "-230\n" +
                "-202\n" +
                "-69\n" +
                "-52\n" +
                "-112\n" +
                "-175\n" +
                "-72\n" +
                "-69\n" +
                "-168\n" +
                "-198\n" +
                "-181\n" +
                "-156\n" +
                "-37\n" +
                "-179\n" +
                "-168\n" +
                "-81\n" +
                "-51\n" +
                "-205\n" +
                "-2\n" +
                "-104\n" +
                "-25\n" +
                "-199\n" +
                "-83\n" +
                "-176\n" +
                "-115\n" +
                "-174\n" +
                "-204\n" +
                "-207\n" +
                "-127\n" +
                "-161\n" +
                "-219\n" +
                "-27\n" +
                "-107\n" +
                "-160\n" +
                "-141\n" +
                "-34\n" +
                "-39\n" +
                "-182\n" +
                "-46\n" +
                "-41\n" +
                "-90\n" +
                "-267\n" +
                "-234\n" +
                "-48\n" +
                "-72\n" +
                "-49\n" +
                "-110\n" +
                "-266\n" +
                "-167\n" +
                "-194\n" +
                "-124\n" +
                "-183\n" +
                "-184\n" +
                "-108\n" +
                "-49\n" +
                "-130\n" +
                "-166\n" +
                "-198\n" +
                "-87\n" +
                "-196\n" +
                "-183\n" +
                "-275\n" +
                "-130\n" +
                "-275\n" +
                "-39\n" +
                "-70\n" +
                "-143\n" +
                "-257\n" +
                "-22\n" +
                "-53\n" +
                "-12\n" +
                "-93\n" +
                "-30\n" +
                "-141\n" +
                "-32\n" +
                "-239\n" +
                "-284\n" +
                "-186\n" +
                "-211\n" +
                "-160\n" +
                "-145\n" +
                "-21\n" +
                "-167\n" +
                "-258\n" +
                "-67\n" +
                "-56\n" +
                "-262\n" +
                "-272\n" +
                "-19\n" +
                "-194\n" +
                "-244\n" +
                "-95\n" +
                "-261\n" +
                "-27\n" +
                "-109\n" +
                "-271\n" +
                "-7\n" +
                "-146\n" +
                "-328\n" +
                "-266\n" +
                "-207\n" +
                "-76\n" +
                "-204\n" +
                "-273\n" +
                "-177\n" +
                "-159\n" +
                "-68\n" +
                "-231\n" +
                "-215\n" +
                "-75\n" +
                "-264\n" +
                "-27\n" +
                "-342\n" +
                "-298\n" +
                "-338\n" +
                "-178\n" +
                "-268\n" +
                "-303\n" +
                "-78\n" +
                "-283\n" +
                "-149\n" +
                "-147\n" +
                "-209\n" +
                "-146\n" +
                "-147\n" +
                "-282\n" +
                "-131\n" +
                "-204\n" +
                "-129\n" +
                "-319\n" +
                "-166\n" +
                "-256\n" +
                "-114\n" +
                "-267\n" +
                "-211\n" +
                "-15\n" +
                "-194\n" +
                "-53\n" +
                "-114\n" +
                "-236\n" +
                "-127\n" +
                "-33\n" +
                "-316\n" +
                "-123\n" +
                "-180\n" +
                "-234\n" +
                "-131\n" +
                "-107\n" +
                "-21\n" +
                "-209\n" +
                "-174\n" +
                "-174\n" +
                "-24\n" +
                "-1\n" +
                "-281\n" +
                "-367\n" +
                "-251\n" +
                "-42\n" +
                "-17\n" +
                "-158\n" +
                "-33\n" +
                "-181\n" +
                "-26\n" +
                "-286\n" +
                "-235\n" +
                "-262\n" +
                "-1\n" +
                "-374\n" +
                "-121\n" +
                "-253\n" +
                "-215\n" +
                "-19\n" +
                "-114\n" +
                "-8\n" +
                "-372\n" +
                "-89\n" +
                "-185\n" +
                "-50\n" +
                "-71\n" +
                "-130\n" +
                "-248\n" +
                "-274\n" +
                "-9\n" +
                "-99\n" +
                "-66\n" +
                "-402\n" +
                "-256\n" +
                "-294\n" +
                "-313\n" +
                "-256\n" +
                "-36\n" +
                "-229\n" +
                "-64\n" +
                "-47\n" +
                "-32\n" +
                "-259\n" +
                "-178\n" +
                "-278\n" +
                "-416\n" +
                "-334\n" +
                "-286\n" +
                "-229\n" +
                "-377\n" +
                "-50\n" +
                "-424\n" +
                "-359\n" +
                "-182\n" +
                "-41\n" +
                "-270\n" +
                "-96\n" +
                "-372\n" +
                "-1\n" +
                "-100\n" +
                "-45\n" +
                "-88\n" +
                "-111\n" +
                "-373\n" +
                "-247\n" +
                "-185\n" +
                "-356\n" +
                "-66\n" +
                "-246\n" +
                "-157\n" +
                "-326\n" +
                "-196\n" +
                "-258\n" +
                "-325\n" +
                "-218\n" +
                "-43\n" +
                "-224\n" +
                "-429\n" +
                "-461\n" +
                "-159\n" +
                "-101\n" +
                "-21\n" +
                "-187\n" +
                "-416\n" +
                "-154\n" +
                "-416\n" +
                "-311\n" +
                "-54\n" +
                "-189\n" +
                "-379\n" +
                "-375\n" +
                "-300\n" +
                "0\n" +
                "-405\n" +
                "-170\n" +
                "-478\n" +
                "-119\n" +
                "-451\n" +
                "-121\n" +
                "-30\n" +
                "-304\n" +
                "-320\n" +
                "-218\n" +
                "-369\n" +
                "-294\n" +
                "-41\n" +
                "-328\n" +
                "-482\n" +
                "-42\n" +
                "-200\n" +
                "-254\n" +
                "-409\n" +
                "-260\n" +
                "-447\n" +
                "-196\n" +
                "-156\n" +
                "-394\n" +
                "-142\n" +
                "-180\n" +
                "-376\n" +
                "-316\n" +
                "-323\n" +
                "-455\n" +
                "-262\n" +
                "-360\n" +
                "-143\n" +
                "-318\n" +
                "-242\n" +
                "-226\n" +
                "-382\n" +
                "-211\n" +
                "-493\n" +
                "-443\n" +
                "-14\n" +
                "-231\n" +
                "-304\n" +
                "-168\n" +
                "-396\n" +
                "-100\n" +
                "-201\n" +
                "-187\n" +
                "-209\n" +
                "-49\n" +
                "-45\n" +
                "-150\n" +
                "-309\n" +
                "-275\n" +
                "-449\n" +
                "-523\n" +
                "-260\n" +
                "-366\n" +
                "-222\n" +
                "-483\n" +
                "-234\n" +
                "-209\n" +
                "-398\n" +
                "-247\n" +
                "-343\n" +
                "-266\n" +
                "-456\n" +
                "-396\n" +
                "-528\n" +
                "-232\n" +
                "-241\n" +
                "-482\n" +
                "-417\n" +
                "-362\n" +
                "-406\n" +
                "-503\n" +
                "-164\n" +
                "-146\n" +
                "-198\n" +
                "-285\n" +
                "-23\n" +
                "-133\n" +
                "-506\n" +
                "-159\n" +
                "-203\n" +
                "-70\n" +
                "-35\n" +
                "-410\n" +
                "-209\n" +
                "-482\n" +
                "-304\n" +
                "-45\n" +
                "-550\n" +
                "-27\n" +
                "-6\n" +
                "-117\n" +
                "-121\n" +
                "-143\n" +
                "-265\n" +
                "-196\n" +
                "-179\n" +
                "-334\n" +
                "-77\n" +
                "-253\n" +
                "-526\n" +
                "-276\n" +
                "-437\n" +
                "-212\n" +
                "-276\n" +
                "-253\n" +
                "-414\n" +
                "-192\n" +
                "-48\n" +
                "-53\n" +
                "-28\n" +
                "-24\n" +
                "-139\n" +
                "-554\n" +
                "-534\n" +
                "-82\n" +
                "-35\n" +
                "-237\n" +
                "-447\n" +
                "-274\n" +
                "-125\n" +
                "-377\n" +
                "-404\n" +
                "-101\n" +
                "-241\n" +
                "-166\n" +
                "-192\n" +
                "-120\n" +
                "-469\n" +
                "-461\n" +
                "-534\n" +
                "-222\n" +
                "-409\n" +
                "-363\n" +
                "-211\n" +
                "-477\n" +
                "-300\n" +
                "-491\n" +
                "-506\n" +
                "-512\n" +
                "-344\n" +
                "-554\n" +
                "-31\n" +
                "-617\n" +
                "-49\n" +
                "-268\n" +
                "-63\n" +
                "-143\n" +
                "-512\n" +
                "-115\n" +
                "-299\n" +
                "-344\n" +
                "-453\n" +
                "-573\n" +
                "-590\n" +
                "-330\n" +
                "-342\n" +
                "-347\n" +
                "-3\n" +
                "-46\n" +
                "-344\n" +
                "-423\n" +
                "-561\n" +
                "-411\n" +
                "-95\n" +
                "-9\n" +
                "-323\n" +
                "-354\n" +
                "-523\n" +
                "-523\n" +
                "-526\n" +
                "-573\n" +
                "-162\n" +
                "-281\n" +
                "-578\n" +
                "-326\n" +
                "-475\n" +
                "-506\n" +
                "-319\n" +
                "-190\n" +
                "-15\n" +
                "-193\n" +
                "-586\n" +
                "-430\n" +
                "-166\n" +
                "-72\n" +
                "-160\n" +
                "-530\n" +
                "-233\n" +
                "-626\n" +
                "-345\n" +
                "-253\n" +
                "-413\n" +
                "-152\n" +
                "-217\n" +
                "-672\n" +
                "-675\n" +
                "-498\n" +
                "-417\n" +
                "-104\n" +
                "-25\n" +
                "-114\n" +
                "-283\n" +
                "-187\n" +
                "-314\n" +
                "-51\n" +
                "-88\n" +
                "-217\n" +
                "-311\n" +
                "-408\n" +
                "-148\n" +
                "-420\n" +
                "-615\n" +
                "-221\n" +
                "-454\n" +
                "-461\n" +
                "-213\n" +
                "-131\n" +
                "-115\n" +
                "-326\n" +
                "-244\n" +
                "-561\n" +
                "-133\n" +
                "-50\n" +
                "-434\n" +
                "-544\n" +
                "-616\n" +
                "-418\n" +
                "-302\n" +
                "-366\n" +
                "-202\n" +
                "-624\n" +
                "-302\n" +
                "-241\n" +
                "-158\n" +
                "-494\n" +
                "-321\n" +
                "-555\n" +
                "-136\n" +
                "-601\n" +
                "-363\n" +
                "-246\n" +
                "-630\n" +
                "-705\n" +
                "-121\n" +
                "-427\n" +
                "-91\n" +
                "-453\n" +
                "-664\n" +
                "-271\n" +
                "-210\n" +
                "-155\n" +
                "-573\n" +
                "-232\n" +
                "-349\n" +
                "-152\n" +
                "-208\n" +
                "-233\n" +
                "-395\n" +
                "-185\n" +
                "-121\n" +
                "-291\n" +
                "-149\n" +
                "-11\n" +
                "-263\n" +
                "-55\n" +
                "-488\n" +
                "-78\n" +
                "-155\n" +
                "-447\n" +
                "-667\n" +
                "-556\n" +
                "-730\n" +
                "-406\n" +
                "-454\n" +
                "-382\n" +
                "-496\n" +
                "-568\n" +
                "-235\n" +
                "-374\n" +
                "-200\n" +
                "-475\n" +
                "-513\n" +
                "-275\n" +
                "-423\n" +
                "-95\n" +
                "-643\n" +
                "-434\n" +
                "-144\n" +
                "-527\n" +
                "-418\n" +
                "-577\n" +
                "-564\n" +
                "-211\n" +
                "-485\n" +
                "-122\n" +
                "-387\n" +
                "-484\n" +
                "-212\n" +
                "-129\n" +
                "-763\n" +
                "-268\n" +
                "-83\n" +
                "-428\n" +
                "-518\n" +
                "-394\n" +
                "-784\n" +
                "-223\n" +
                "-549\n" +
                "-232\n" +
                "-175\n" +
                "-566\n" +
                "-569\n" +
                "-329\n" +
                "-300\n" +
                "-3\n" +
                "-563\n" +
                "-571\n" +
                "-369\n" +
                "-753\n" +
                "-111\n" +
                "-609\n" +
                "-461\n" +
                "-514\n" +
                "-514\n" +
                "-174\n" +
                "-800\n" +
                "-702\n" +
                "-808\n" +
                "-780\n" +
                "-708\n" +
                "-774\n" +
                "-811\n" +
                "-518\n" +
                "-741\n" +
                "-404\n" +
                "-364\n" +
                "-48\n" +
                "-74\n" +
                "-228\n" +
                "-333\n" +
                "-380\n" +
                "-90\n" +
                "-813\n" +
                "-457\n" +
                "-275\n" +
                "-414\n" +
                "-281\n" +
                "-723\n" +
                "-101\n" +
                "-123\n" +
                "-438\n" +
                "-657\n" +
                "-406\n" +
                "-779\n" +
                "-161\n" +
                "-825\n" +
                "-715\n" +
                "-79\n" +
                "-358\n" +
                "-183\n" +
                "-554\n" +
                "-716\n" +
                "-596\n" +
                "-56\n" +
                "-39\n" +
                "-505\n" +
                "-268\n" +
                "-425\n" +
                "-609\n" +
                "-69\n" +
                "-92\n" +
                "-7\n" +
                "-44\n" +
                "-10\n" +
                "-681\n" +
                "-86\n" +
                "-30\n" +
                "-225\n" +
                "-551\n" +
                "-213\n" +
                "-335\n" +
                "-829\n" +
                "-817\n" +
                "-804\n" +
                "-74\n" +
                "-109\n" +
                "-732\n" +
                "-781\n" +
                "-401\n" +
                "-370\n" +
                "-40\n" +
                "-526\n" +
                "-694\n" +
                "-336\n" +
                "-859\n" +
                "-294\n" +
                "-682\n" +
                "-264\n" +
                "-325\n" +
                "-27\n" +
                "-679\n" +
                "-135\n" +
                "-82\n" +
                "-711\n" +
                "-570\n" +
                "-159\n" +
                "-179\n" +
                "-604\n" +
                "-41\n" +
                "-580\n" +
                "-403\n" +
                "-540\n" +
                "-262\n" +
                "-69\n" +
                "-329\n" +
                "-5\n" +
                "-879\n" +
                "-345\n" +
                "-632\n" +
                "-367\n" +
                "-183\n" +
                "-38\n" +
                "-80\n" +
                "-63\n" +
                "-448\n" +
                "-832\n" +
                "-656\n" +
                "-774\n" +
                "-292\n" +
                "-474\n" +
                "-596\n" +
                "-862\n" +
                "-842\n" +
                "-16\n" +
                "-107\n" +
                "-243\n" +
                "-647\n" +
                "-782\n" +
                "-336\n" +
                "-785\n" +
                "-816\n" +
                "-78\n" +
                "-416\n" +
                "-712\n" +
                "-810\n" +
                "-389\n" +
                "-264\n" +
                "-304\n" +
                "-847\n" +
                "-520\n" +
                "-619\n" +
                "-161\n" +
                "1\n" +
                "-584\n" +
                "-719\n" +
                "-486\n" +
                "-516\n" +
                "-360\n" +
                "-747\n" +
                "-363\n" +
                "-672\n" +
                "-134\n" +
                "-177\n" +
                "-894\n" +
                "-778\n" +
                "-582\n" +
                "-766\n" +
                "-769\n" +
                "-114\n" +
                "-843\n" +
                "-287\n" +
                "-493\n" +
                "-30\n" +
                "-620\n" +
                "-467\n" +
                "-141\n" +
                "-206\n" +
                "-437\n" +
                "-367\n" +
                "-426\n" +
                "-799\n" +
                "-943\n" +
                "-508\n" +
                "-594\n" +
                "-545\n" +
                "-61\n" +
                "-829\n" +
                "-844\n" +
                "-589\n" +
                "-775\n" +
                "-409\n" +
                "-28\n" +
                "-726\n" +
                "-452\n" +
                "-261\n" +
                "-613\n" +
                "-106\n" +
                "-441\n" +
                "-496\n" +
                "-643\n" +
                "-606\n" +
                "-742\n" +
                "-408\n" +
                "-321\n" +
                "-260\n" +
                "-333\n" +
                "-328\n" +
                "-751\n" +
                "-21\n" +
                "-768\n" +
                "-36\n" +
                "-265\n" +
                "-936\n" +
                "-697\n" +
                "-702\n" +
                "-924\n" +
                "-89\n" +
                "-215\n" +
                "-896\n" +
                "-216\n" +
                "-477";
        //</editor-fold>

        String day5testInput =
                "0\n" +
                "3\n" +
                "0\n" +
                "1\n" +
                "-3";

        String[] inputString = day5input.split("\n");
        int[] input = new int[inputString.length];
        for (int i = 0; i < inputString.length; i++) {
//            System.out.println(inputString[i]);
            input[i] = Integer.parseInt(inputString[i]);
//            System.out.println(input[i]);
        }

        return "Day 5: problem 1: " + "nah" + ", problem 2: " + day5Problem2(input);
    }

    private static int day5Problem1(int[] input){
        int steps = 0;

        for (int i = 0; i < input.length; i *= 1){
            steps++;
            int temp = i;
            i += input[i];
            input[temp]++;
        }

        return steps;
    }

    private static int day5Problem2(int[] input) {
        int steps = 0;

        for (int i = 0; i < input.length; i *= 1) {
            steps++;
            int temp = i;
            i += input[temp];
            if (input[temp] >= 3)
                input[temp]--;
            else
                input[temp]++;
        }

        return steps;
    }


    private static String day6(){
        int[] input = new int[]{14,0,15,12,11,11,3,5,1,6,8,4,9,1,8,4};
        int[] testInput = new int[]{0,2,7,0};
        return "Day 6: problem 1: " + day6Problem1(testInput);
    }

    private static int day6Problem1(int[] input){
        int cycles = 0;
        List<int[]> bibs = new ArrayList<int[]>();
        cycles = d1p1Helper(cycles, input, bibs);

        return cycles;
    }

    public static int d1p1Helper(int cycles, int[] input, List<int[]> bibs){
        cycles++;
        int highest = 0;
        int hIndex = 0;

        if (bibs.contains(input))
            return cycles;
        else {
            for (int i = 0; i < input.length; i++){
                if (input[i] > highest){
                    highest = input[i];
                    hIndex = i;
                } //if
            } //for


            input[hIndex] = 0;
            int loops = d6p1CalcLoops(1, highest, hIndex, input);
            for (int i = hIndex + 1; i < input.length; i++){
                input[i]++;
            }
            for (int i = 1; i < loops - 1; i++){
                for (int j = 0; j < input.length; j++){
                    input[j]++;
                }
            }
            for (int i = ())
            bibs.add(input);
            return d1p1Helper(cycles, input, bibs);
        } //else
    }

    private static int d6p1CalcLoops(int loops, int highest, int hIndex, int[] input) {
        if (loops == 1 && highest > input.length - hIndex || highest > (input.length / loops))
            return d6p1CalcLoops(loops++, highest, hIndex, input);
        else
            return loops;
    }
}
