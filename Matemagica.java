/* 
 * Grupo 1: Dayana do Prado Silva, Denise Trevizo e Ednacio da Silva Souza.
 * Novembro de 2019.
 *
 * "Matemágica", jogo textual com operações aritméticas e temática medieval, 
 * desenvolvido para a disciplina Projeto Integrador: Desenvolvimento de Lógica, 
 * sob a orientação da Prof. Ana Cristina dos Santos.
 *
 * Referências:
 * Conversão das imagens em texto ASCII: 
 * <https://www.text-image.com/convert/ascii.html>)
 * Imagem de fogos de artifício: 
 * <https://clipart-library.com/fireworks-clipart.html>
 */

package Matemagica;

import java.util.Scanner;

public class Matemagica {
    
    // Imagens
    static void apresentarTitulo(){
System.out.print("                                                                                                       \n" +
"                                                               _,o9              ,,                    \n" +
"`7MMM.     ,MMF'           mm                                ,'                  db                    \n" +
"  MMMb    dPMM             MM                                                                          \n" +
"  M YM   ,M MM   ,6\"Yb.  mmMMmm   .gP\"Ya  `7MMpMMMb.pMMMb.   ,6\"Yb.   .P\"Ybmmm `7MM   ,p6\"bo   ,6\"Yb.  \n" +
"  M  Mb  M' MM  8)   MM    MM    ,M'   Yb   MM    MM    MM  8)   MM  :MI  I8     MM  6M'  OO  8)   MM  \n" +
"  M  YM.P'  MM   ,pm9MM    MM    8M\"\"\"\"\"\"   MM    MM    MM   ,pm9MM   WmmmP\"     MM  8M        ,pm9MM  \n" +
"  M  `YM'   MM  8M   MM    MM    YM.    ,   MM    MM    MM  8M   MM  8M          MM  YM.    , 8M   MM  \n" +
".JML. `'  .JMML.`Moo9^Yo.  `Mbmo  `Mbmmd' .JMML  JMML  JMML.`Moo9^Yo. YMMMMMb  .JMML. YMbmd'  `Moo9^Yo.\n" +
"                                                                     6'     dP                         \n" +
"                                                                     Ybmmmd'                           ");
}
    static void apresentarSomatroll(){
        System.out.println("                                                                                          \n" +
"                                                                                          \n" +
"                         `::://///-.                                                      \n" +
"                      :smmhsoooooshmNds:                                                  \n" +
"                    `ymo:`          `/ymNyo`                                              \n" +
"                    dh`                `:dmNds:.                                          \n" +
"                   oM/                     `:shmNmhso+/--`                                \n" +
"                   mM-                         ``.:+osyydmms-                             \n" +
"                   mM-                                   `-yNh.                           \n" +
"                   hM/                                      :Nm`                          \n" +
"                   hM/                                       oM+                          \n" +
"                   mMo     `.:/yy:          ``               +M:`:+sddmmmmds+`            \n" +
"                 -yMd.  +dmNNNmho.          yNy.            :mNhmhs+/////:-+hm+           \n" +
"                +NN+`   -//-..`             `oNNy/:`      `+mNy/-+ymNmddhmh:`hM/          \n" +
"               `NM-                           `/ydh+     -dmo. :mMd+.````-My -Md          \n" +
"         -+ydddyMm                               ``     oNh.  sMm:`       .` :Md          \n" +
"       /mmy/-..:yMs      +dddh+                        :Ns`  /Mm- /hy+.     -mN:          \n" +
"      +Ny- :/-`  /:      :yddh+         .hdmdo`        `.    sN-  `yMMm` `/yNy.           \n" +
"     .Mh  +Ndyhy .`        ``           `oydmd:              `.   .NMMd-omho-             \n" +
"     yM/  yM+ `.-Ns     .--://:-.          ```                  :hNMdosNd/`               \n" +
"     -dm+-.hNs+dmMy  .smdysooossyh/                           -hNms-`:Mm`                 \n" +
"      `/ydh/yMMMMN- /md:`       ```      :+:                  yMd`:oddh/                  \n" +
"         .sNy/sMM: -Md`                  NN/                  /doyNy:.`                   \n" +
"           +NhyMs  +Mo                   shmo`             `-```+Mm`                      \n" +
"            :NMy   /Ms             `-+yhy. oMy             +Nd` mMN.                      \n" +
"            /Mm`   `dN-            yNMhys::hm/             hMN /MNMh`                     \n" +
"            `hMs`   .mm`          +Md/sssyy+.            `+MN/ sM/yMdo:.`                 \n" +
"             `+md/` `hm.         .NN.   `        `o+    -dNy-  sM- :shmmmhs/-`            \n" +
"               `hMs hm.          oMo             oM+   `mMd    hM.    .-:+ydmmh+.         \n" +
"                -MN:M+          -mN.           `/No    +MMmy../Mh          `.:sNNo`       \n" +
"                `MM+M+         /NN+          .:hms     hMm:ysshy`              :dMd`      \n" +
"                 dMoymo:....-/yNy:      `-:oyy+:.     /MM/                      `dMs      \n" +
"                 .dN--+yhhhhhy+-   .:osyyys/.        .NMy                        -MM.     \n" +
"                  .My..``.``  `./shds/-.`           `hMh`                         NM+     \n" +
"                  -MmNmmdhsssydNMN+`               .yMs`                          NM`     \n" +
"                `/mN-odmNMMMNNmy/.                +NN/                            sm`     \n" +
"              `/dNd:   .-:::-.`                  -NM+              +/              .      \n" +
"             -hNy-                         ``.-/smms              oM/                     \n" +
"            oMd:         ``..-:/+/ooooossyhhddmdy/` /s:`         :Mm                      \n" +
"            oNdo:....:oyhddddmmdhhyyyyysss+/:-`     .+hhys/-`    oMy                      \n" +
"             ./smMNNdds+/--..`                         `-/ohdy-  oMy                      \n" +
"               -mMd+--`                                     .oNy``mN`                     \n" +
"               sMN.hNm+`````````      ```ss:`         `.`     :Nh -md.                    \n" +
"               :NMmddhhhyyyyyyyy:     oyymNNhs/-`    -hmdo     .:  .dmo.                  \n" +
"           `-+hmmhs/-.`                   `--:+yhs/.```--.````       :mN+                 \n" +
"         `+hNms:`                               `:+syyyyyyyyyy/       .NM/                \n" +
"       .smms-                                              ```         dMm.               \n" +
"      .mNo`                                                          `yNMMd-              \n" +
"     `mm-                                                            +MMMMMMo             \n" +
"     sM+                                                            /NMMMMMMMy/`          \n" +
"    `Nm                                                            `smMMMMMd//do          \n" +
"    .My                                                          `+mMMMMMMm`              \n" +
"     Nd     ohhh/                                               .mMNdhhys:`               \n" +
"    `yM/    `:::`                                       ``...`:hds/.                      \n" +
"    yMhNh+.`                        `  ``..`.---:-:+osyhdddydmNM:                         \n" +
"    sM-`+sdmhhso+//:--..````-/:.```dmddddhhdhysyyyso/:-`     `..                          \n" +
"    `dy    `.-:/+osyyhhdmmmdhsshdddd/                                                     \n" +
"      -                                                                                   \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          ");
    }
    static void apresentarSubtraelfo(){
        System.out.println("                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                   ./+++:-`                                               \n" +
"                                -ymMMMMMMMNmhyyyyhdNNmhhso/`                              \n" +
"                              -hMMMMMMMMMMMMMMMMMMMMMMMMMMMNo                             \n" +
"                             sNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMs                            \n" +
"                           `yMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMy`                          \n" +
"                           hMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm:         `.              \n" +
"                          oMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmo.      oN-             \n" +
"              hh         /MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNs    `dN.             \n" +
"              yM+       :MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMd. -hN-              \n" +
"              .dM+     +NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMmmNM+               \n" +
"               `yMy-  +MMMMMMMMMMMMMMMMMNNmho-.:yMMMMMMMMMMMMMMMMMMMMMMMMm`               \n" +
"                 yMNy:dMMMMMMMMMMMNho/:.```     `.-odNMMMMMMMMMMMMMMMmoNM/                \n" +
"                 `dMNmMMMMMMMMMNy/`                 `.:/shdNMMMMMMMm+`+Mm`                \n" +
"                  :MN.+dMMMMMMM/                          ``/NMMMMy`  mM+                 \n" +
"                   mM: `-yMMMMy                              /NMMN.  `MM-                 \n" +
"                   sM+    -oNM:     /:--..              .-..` +dy+   .MM.                 \n" +
"                   sM+      -mN-    .:+osyds:      ./+yhyo/:: ``     -MM.                 \n" +
"                   yM+       .+.         ``:+      -o+:`     -m/     /MM.                 \n" +
"                   :Mh                 `/:             ++    +My     dM+                  \n" +
"                    oNh-     `         `o/             oo    +My   `sMs                   \n" +
"                     -ymh-  /d`                              yMo `omN+`                   \n" +
"                       -yN: -M:                              oMo yMh.                     \n" +
"                        .MMs`yd`                             /Ms.NM/                      \n" +
"                         hMMh-No              +/:oo-         +M+yMMh                      \n" +
"                         sMMMmNm.             :::/:`        `dMmMMMM.                     \n" +
"                         mMMMMMMm-                        `:dMMMMMMM`                     \n" +
"                         yMMMMMMMNy/.       -++/`       :smMMMMMMMMd                      \n" +
"                         yMMMMMMMMMMNh/`     `..`     `yMMMMMMMMMMMo                      \n" +
"                        .NMMMMMMMMMMMMMdo-`         `+mNyMMMMMMMMMd`                      \n" +
"                       :dMMMMMMMMMMMMMm-ohdo:-...:/+dmy./MMMMMMMMM+                       \n" +
"                      oNMMMMMMMMMMMMMMN  `-/syyyhdhs+.  +MMMMMMMMN`                       \n" +
"                    :hMMMMMMMMMMMMMMMMN`       ```      :MMMMMMMM/                        \n" +
"                  .sNMMMMMMMMMMMMMMMMMd                 -MMMMMMN/                         \n" +
"                 -mMMMMMMMMMMMMMMMMMMM+                  NMMMMN/                          \n" +
"                 dMMMMMMMMMMMMMMMMMMMM.                  sMMMm-                           \n" +
"                 MMMMMMMMMMMMMMMMMMMMm                   -MNm-                            \n" +
"                 MMMMMMMMMMMMMMMMMMMMo                    yNds:..```                      \n" +
"               .-hMMMMMMMMMMMMMMMMMNs`                    `:.-+oossssso-.                 \n" +
"              +m+-NMMMMMMMMMMMMMMMh-                       +-      ``./sdo`               \n" +
"             omo  :mMMMMMMMMMMMMMM.                       .N:           -mo               \n" +
"            +M/    `:mMMMMMMMMMMMMs`                     :md             :M+              \n" +
"           .Nh       mMMMMMMMMMMMMMh:`                  /NN.              mN              \n" +
"           hM-      -MMMMMMMMMMMMMMMMd/`               -NN-               yM-             \n" +
"          /Mh       /MMMMMMMMMMMMMMMMMMd-             /Nd-                oMo             \n" +
"          NM:       oMMMMMMMMMMMMMMMMMMMN:           +Nd`                 :Md             \n" +
"         :Mm        yMMMMMMMMMMMMMMMMMMMMNh/.       +Md`                  `NM.            \n" +
"         /Mm        oMMMMMMMMMMMMMMMMMMMMh+dmh:    -Md.                    sMs            \n" +
"         -MM        /MMMMMMMMMMMMMMMMMMMm:  :hNh:``yM/                      dM:           \n" +
"        `yMs        `NMMMMMMMMMMMMMMMMMh.     -yNmhNM`                      .dN:`         \n" +
"        yN+``        yMMMMMMMMMMMMMMMMs`        yMMMM`     `y-               .hNd:`       \n" +
"       :Ms`yo        /MMMMMMMMMMMMMMMy          -odMM`     oM+                 :smds:     \n" +
"       .mmhM/        `dMMMMMMMMMMMMMMy            .dy      yM/                   `/NM.    \n" +
"        .mMd          :MMMMMMMMMMMMMMM:                    sM/           `:/-``   oM+     \n" +
"        :Md`           yMMMMMMMMMMMMMMMo`                  oM:      ````omhydmhysymd.     \n" +
"       :Nm`     :o-````-NMMMMMMMMMMm:+smh-                 `h-.:+osyyyyyy:   `://:.       \n" +
"     .yMNso+:``+m+syyyhymMMMMMMMMMMM    -`                 -hdy+:-`                       \n" +
"    `hdso//+yhyo`       `mMMMMMMMMMm                       `:.                            \n" +
"                         mMMMMMMMMMo                                                      \n" +
"                        `MMMMMMMMMN`                                                      \n" +
"                  .:.`  :MMMMMMMMN:                                                       \n" +
"                  -ymmddNMMMMMMMh-                                                        \n" +
"                    `:sNMMMMMNy-                                                          \n" +
"                        .---.                                                             \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          ");
    }
    static void apresentarMultidragon(){
        System.out.println("       `                                                                                  \n" +
"       ss`                   +-                                                           \n" +
"       .MNo`                 oMo.                                                         \n" +
"        yNsmdo/-``            oMNo`                                                       \n" +
"        .mh.-+oyhdmd+-`       `NNhNdo-`                                                   \n" +
"         `+yhhhy/-`:shNyo.     -hmo+oddmdhso+-`                                           \n" +
"              `-oym/` ./hNo      .omd+.`.:/ohMN/                                          \n" +
"                  -yms/  +Mo`      `-ymdo.   :yNh:                                        \n" +
"                    `sM`  :mm/        `:ymd+.  .dMs.                                      \n" +
"                     -dh.  `oM+          `:ymyo `yMN.                                     \n" +
"                      `hd/   sNo.           .NM.  +mN+                                    \n" +
"                        hN:   :dN+           /hN-  -NN.                                   \n" +
"                        `/M:   `/Ns`   ::-.`  `yN/  hM:                                   \n" +
"                          ody`   -My   -omyhhyo-hN` -dN-                                  \n" +
"                           .yd/   +mdo-  ..``/sdmM/ `dMo                                  \n" +
"                    `...`    -dh+. `-odm:     `-/os. `:dd`                                \n" +
"                ./ydmhhhhdyo/-.-om:   `sm-:/odmdmmd+   :d/-`                              \n" +
"                +yyhddy:`.-+syhho/hy/`.`+ssoo/-`.``     :shmh/`                           \n" +
"                    `.+ms`    `-+o:-omd.                  `.omd-                          \n" +
"                       .hh     `:mh +s.                      .yNo                         \n" +
"                        `y/   -dmo`          .::.`            `yM+                        \n" +
"                       `oNN` :Ny-     .+.    `/sdmyo:.`        `sN-                       \n" +
"                 `...-odhsM:`do`      :Md       `:yNNNmmds-     `dm`                      \n" +
"              `/hhssydNh+sMm .        +Mm          -sdNMMMNo.    .Nh`                     \n" +
"            .omms/-` `.-/oMd         :Nm-            `.-:+oo-     :dd-                    \n" +
"           `hdho+yNds-   /N-        sNh-                           `ym:    ..             \n" +
"            `` `oms.smo `N/        hMy`           yo`               `smy-  dN/            \n" +
"              `hm/   :my.o         mM/            /Nd/`               .sds.mMNs           \n" +
"             /dm-     :My`         -mN+.           sMMmy:.`             .sdNN/Ny`         \n" +
"           `sNh.     /mMd.          `omm:          :MMMMMhhso/-.          -Nd :Ny`        \n" +
"           sMh`     oNmm.             .sN/         +MMMMN`.-/ohhho:`      oM:  :No        \n" +
"          :MN.     :doN:                oN:-`      hMMMMs    -ddo/hd+.    -/o+::mm-       \n" +
"         `dMo     `y.oy                 /N+yhho... /NMMMh     .dNo`/mmh+..` `-//+dm`      \n" +
"         oMm`     `` /. .:/-`          .Ns  .sdyhms:/hNMMo     .hMs`:Nmhmdd+-``.:NN`      \n" +
"         dM+         ``smysddo:        sN`      `-sNo`-yNMy`     +Nd.:. :m:hNdmdsmd       \n" +
"        `MM-        -ddh- .sNd+        dm          +mh:`-yMh.     /Ms   .Nsh//My.mo       \n" +
"        :MM`        oMd` :mh-`         mm           .omh. /mm+.   `Nm   .o:`.sMmy/        \n" +
"        oMh         -dN`/Ns`           yM-            .dN: `:yds/-:NN`     -hhs:`         \n" +
"        yMy          +M+Nh             -Mh             .Nm`.-`./oyyNN`      .             \n" +
"        dMo          `dNN.              sM/             hMdNM+..  .md                     \n" +
"        dMo           -Mo   ``.---.     `dN:            yNh+MdNm. mMh                     \n" +
"        dM+            hy./syyhNMd:      .hN:           .-``NMMNh hN-                     \n" +
"        yM-            :mds:.+hy/`        `smo-             .+/:mo:Mo                     \n" +
"        yM.            -/: `yd.             -mN:`               .yhdM+`                   \n" +
"        yM.              - om`       `       .+dd+.               -ohd+                   \n" +
"        yM.                o:     :syd/         :ymy/.                                    \n" +
"        oM/                /h-   om:yh            ./hdy/.                                 \n" +
"        :My                 oN+ :N- ms               ./ymy:`                              \n" +
"        `NN                  sd.ms  ms   ```            ./dds:`                           \n" +
"         yM:                  `hN`  my `+hmm               -omh/`                         \n" +
"         -Mh                  `Mm`  Ny/md/mM                 `/dm/`                       \n" +
"          oMo                 `MMy` mNMy` mM                   `/md-                      \n" +
"           dM-                 sdhh.sNh`  mM                     `hN+                     \n" +
"           .dN/                 ``+my:`   hM`                      sM+                    \n" +
"            `dN/                   `sm+`  :M+                       sM/                   \n" +
"             `+Ns`                   -hd/` ym`                      `mN-                  \n" +
"               :mm-                    -yd:`yh-                      :Md                  \n" +
"                `yN+                     ``  od`                      NM.                 \n" +
"                  /Nh:                        ``                      yM:                 \n" +
"                   `+hs                                               NM.                 \n" +
"                                                                     `Mm                  \n" +
"                                                                      /.                  \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          ");
    }
    static void apresentarDividuende(){
        System.out.println("                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                      .--:::.                                                             \n" +
"                  -oymmhhhhhmmo.                                                          \n" +
"                :dNy/-```  `.omNo:`                                                       \n" +
"              `yNy-           `+hdmmhyyo/.                                                \n" +
"             .hMs`               `.-/+oymNs.                                              \n" +
"           `omd: .+hms`                 .sMN+:.                                           \n" +
"          :hN+``+mN+yNms:                 -ohNm/                                          \n" +
"        `ymh.`/mNo.  .+dNh.                  :NNs`                                        \n" +
"       -mm:-odmy-      `oMh                   -hmdy:                                      \n" +
"       :mmhNh+.          hM-                    .:ymds.                                   \n" +
"        .sNMd/.          `md.                      .+mmo                                  \n" +
"          -omNmy.         sMs                        .MM-                                 \n" +
"            `-:/.         oMh                         dMo                                 \n" +
"                        .+yMd     `.----```...---::::/mMmsys/                             \n" +
"                        dMNNNhs++sdmmmmNmhhhdddmddddddhysoyMM.                            \n" +
"                        NMo-/oydMMs-...NMd``.`````        -MM.                            \n" +
"                        mMs    `NMy    hMN`               :MM.                            \n" +
"                        yMy     dMm    sMM-               +MN`                            \n" +
"                        /Mh     yMM` ``+MM:`````````````` dMh                             \n" +
"                       `.dd/oossdMMhhhhdNNddddddddddddhhhhMMy/:::::::::::::::::/+syo      \n" +
"                   `-+yhmmdyo+++//::::----...........--::+osydddddddddmmmmmmmNMMMMms`     \n" +
"               `.ohmdy+:`                                            ````-/+ydmmy:`       \n" +
"            `.odmy/.        `````````.........````````         ``./ohdmNMMNyo/.           \n" +
"          .+dNy/`  ```-:+oshddNNNmNNMMmyyhhhNMNNNNmdddhhhhhhhhdmddyo+/sdNMNs-             \n" +
"        `+NMNyyyyydmmmdhysomh-..``:oyNN+odNMNmddys.  `......oMs          :hMMo            \n" +
"        /////++Nd:-`       mo    .o+-``..-:-`  -:/+:         sh`       .oNNdmN/           \n" +
"              sMdhy-      :My    -hMMN/       sMMMm+         +Md`    `+NMs`               \n" +
"              `` `ydddddd.dMy      .::`  /`   /dy            `dMNmdddmNd.                 \n" +
"                        .dMy`           :N.                    .MM/                       \n" +
"                       /NMo            /Mo                      NMo                       \n" +
"                       NMo           -oNy`   `:o:               NMsoh/                    \n" +
"                       :dNmo-     -odmy-   -sNhy/  `/s+        -MMNNMd`                   \n" +
"                        `.+hNs`  `NNs++o+sys/.   :hdy+`  `/yhmNNms.yMM+                   \n" +
"                            -dm.  :oosso:`       ```  `:yNNy+/-.`  yMMo                   \n" +
"                             `sd:           -+sy/   `+mNy/.        yMMo                   \n" +
"                      .:/+++++/dmd+/:--::+hmmdmMm:/smMs.           sMMo                   \n" +
"                   -ymmdyssssso/.+MMsydddho//dNms/+sNMm            -MMh                   \n" +
"                  `mMy.`       -yNN+  ````/sNd/`  `mMN-       `.:/++NMN`                  \n" +
"                  .MM+       .yNMMho`    oNh:`    oMM+    .:ohmNNNmdmMM+                  \n" +
"                  sMN-       `ohsyMm` -oyN/`     /MMh`.:sdmNNhs/-.```://yy-               \n" +
"                 .NMs        -dm`oM++dNMm/       yMM+smMmy+-.           -NN/              \n" +
"                 /MM:    `./yNh:-hhss/hy.        mMMmdo:`                yMd              \n" +
"                 oMM`  +ddmmy:`  ..`  `   `      dMM:`                   sMm              \n" +
"                 oMM.  smNMs:   +dmmy.-ydddo  -oymMMd`      `            hMN`             \n" +
"                 +MM.   .-sNMy. -smNNmNmdhs:`.dMMho/.     `sds`         `NMd              \n" +
"                 +MM`      .sMm:  `.-my.` `-hNNmy`        +MMN`         yMM/              \n" +
"                 +MM`        oMN-   :N:  .hNNh:`         -mMMo         :MMy               \n" +
"                 /MM          hMd.  hm. :mMd-           -NMMd`        `mMm`               \n" +
"                 .mM          `mMy oMm-oNMo`           .mMMy.         oMM/                \n" +
"                  :m           +MM:MMyhMm/            `dMMy           +dy`                \n" +
"                               `NMmmMMMy.             :MMs                                \n" +
"                                /dy`os+               .ms                                 \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          ");
    }
    static void apresentarProblemago(){
        System.out.println("                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                      .:/so/-`                            \n" +
"                                                   +hNdsoohmMNhs/:---.`                   \n" +
"                                                 -dMy`      -+ydNMMMMMNo                  \n" +
"                                                oMm/            ````.sMy                  \n" +
"                                               oMm.                  yMy                  \n" +
"                                              oMd.                   NM+                  \n" +
"                                            .oMm-                    NMo                  \n" +
"                                           -NNs.        /h`          yMd                  \n" +
"                                          sNNs          `mm:         .NMo                 \n" +
"                                         yMh:.           .hNh+.       :MM:                \n" +
"                                        sMm`               -NMNds/-`   +MN/               \n" +
"                                       oMMd                 Md-+sdmNmdyohMMdo.            \n" +
"                                      `hMd.                 Mm   ``.:/oyhddmmd.           \n" +
"                                     `hMy`                  yM+          `````         `  \n" +
"                                    .dMy                    .MN`             `-:+oyhhdmm- \n" +
"                                   +mNs`                     +Mh`        .:+hdhyosNMdo:.  \n" +
"                                `/dMMNdhdddyysssss+oyhhmmmmyo+mMd-` `.:+hdyo/.``oNm/`     \n" +
"                               `yNh+:......:/+oosdyo/::-..::///ydmhdmdyo:`  `-sdNo.       \n" +
"                             -sdd-`         ``   `            `--.`.-`    `ommh+.         \n" +
"                        `:oymNm/`           yhdhyhs:  .``  `-+dNm.   `.:+ymms.            \n" +
"                     -:smmyo/-`           `.-:...+mNy`:-`.ymNNNNo/:+ymmdyo/.              \n" +
"        .o+/:---:+sydmdy+.          .:oyhdmdhs    .NMs`  dMh/..mhooss+.`                  \n" +
"        `+shdmNNNds+-.`        `-/sdNMms/-..`    ` -dNd` /o.:--m`                         \n" +
"            `./shhddhsooooooyhddNMMdssho        hmd.`..    sNdyy                          \n" +
"                 `..:+oooooo/:--MN:`  ``.:      /so`      -+/-hh`                         \n" +
"   ``` `                       -Mm`     +M/       `-`     `smo:Nh`                        \n" +
" /ydddhmd+`                     oNd/`   `NN.      .hho/-.`  /NdsNy                        \n" +
" dMs.-yNNmmo---           .:`    -yNd:   yMh       `:sdhdds: -dNMs                        \n" +
" `hNs` ...+mmNNy`        :mNd:`    :dNo  :MN-.       .--:/yNh-`+Nm/                       \n" +
"   :dm/    `.:MM:       .NmomNdo.   :Md  .MMNd+-`   /dmmmmhyhNh/:yNh+.                    \n" +
"    `sdh/     yMo       yM+ `-+NNdysoNN- `NMyyhNddds/+sssoysoNNMmydMMd                    \n" +
"      .yMy-   -Mh      :Md.+yyoyMN/:/:mm+:+omd :+++hdddhddddhhMMyhMo-.                    \n" +
"       `/dN+ `dN:      dM/dMo-/odMd`  .+sy/ Nd      ``  `..`  hMmMm`                      \n" +
"         `yN-oMh.     `MMdNs    `dMo        yo                /MMMm                       \n" +
"        `-`mosmsm:    /MMN+      sMh        +s                 NMyM-                      \n" +
"       +ms +yhmymN:   /Mm:       yMy       -MM`               `MM/+/                      \n" +
"      +Mh`.+/oNM+dN/  :M:        dMo       .MM+`              oMh`/s.                     \n" +
"      oMo  .-/dh `mN` dm         mM/        /hMh.            +Mm-  +ds`                   \n" +
"     `-Ny  -:/N+  :Ny:Mo         +h`         `sNm/           NM/    .mh`                  \n" +
"    :d+om` -+omy   :MNd`                       -mM/          NM:     -Ny`                 \n" +
"   -Nm`/ho/:dmy-   `yo.                         /Md          :mN+`    -Ny                 \n" +
"   sMy  `ssM:`s.                                `mM:          .sMd     +M/                \n" +
"   mM/  -MoMy hm`                                -Nm`           mM:     sN+               \n" +
"  `MM. `hd/Md oM/                                 oMs           hM:      oMo`             \n" +
"  +Md -dh./Md +M+                                  sNs`         hM:       +Ny`            \n" +
"  hMy+mo` +Md oMo                   -+              /Ny-`       sM/        :Nh.           \n" +
" .MMmh:`` +Mm oMo                 `sNs               :ymho:     :M+         :dm+.         \n" +
" `ddyyyhhyyMm oMo                -mMo                  ./ym.`   -M+          `/hmy+.`     \n" +
"     ``../yMN`hM+               :NN/                     `shh/`  my             ./hNd+    \n" +
"          .MM.dM-`.`           -NN:                ````-:+shNmh+`+N-            `:smmo    \n" +
"          .MM.dM-/dds/.       `mM/ `.-........-/osyhddhdhso/:`.sd/hd`        `.+hh/.      \n" +
"          .MM.dM-  :odNs.     yMs  -yydddmmmmmdyo+:-.`          -mhMo      `omm/.         \n" +
"          .MM`dM:    `/Nm:   /Mm`                                .ym/    `omNy`           \n" +
"          /Mm yMo      -hMs``mM:                                        `hMd-             \n" +
"          sMy oMs       `sMdyMy                                         sMN.              \n" +
"          hMo sMo         :dMM:                                    `/` :MM:               \n" +
"          dM: dM:           :/`                                     od/dMs                \n" +
"          mN` mM.                                                    -dMd`                \n" +
"          y+  NN                                                      /y.                 \n" +
"          .`  hN                                                                          \n" +
"              /d                                                                          \n" +
"               .                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          ");
    }
    static void apresentarPrincesa(){
        System.out.println("                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                               ./                `                        \n" +
"                                                        ++                                \n" +
"                 o-                                             -.                        \n" +
"                 ``                                             +:                        \n" +
"             ``      o:        `                          `                               \n" +
"             +/      -`       +ms-                       -s` `     .                      \n" +
"                 `-         :yMNmNh+.                                   :o                \n" +
"                 `/       -yMmo.`/yMN+ossso/`                     `     .:                \n" +
"                          NMo./yddohMMdMMMMm:+hs/.               :h-                      \n" +
"                    :+syhhMM/-MMMMNdMMNmdhdNNNyohms.+so:`         `                       \n" +
"                  /hMNhdMMMdmhMMMMMMddMd- `.oMM/`:dm-.+ddy/`         `/.                  \n" +
"                  NMh. .yy+/sNMMMMMNs/+/. -+hMN-:hsMd` `-yNmo.       `o-                  \n" +
"                  sNNs:-sdmMMMMMMMMMMMNmhyNMdo- `+NMM-    -hMd`                           \n" +
"                  :+ymMNMMNmhso/////://+syhmo.    .dMd`    .MM/                           \n" +
"                 -NMmmMms/-`           .:. .o.     `NMo.+:` dMh-.                         \n" +
"       -s       -mMMmy:`             `:mM/ oM+     `NM+`oddhmMd-hh:                       \n" +
"      :``       -Nmo.            `./ydNd+  dM/     `MM/  `:sMMo .dNy                      \n" +
"     `/`    .   :Ny        .ohyohdmNh+-`   dMy.     dMy     mMm. `NM+                     \n" +
"         .  /   yMs    ``.omNdoso::-       -hNms:.` :NN     /MM:  sMN`    -/              \n" +
"        `s.     sMd`:shddNmh:                -smNmdhoos     -MM:  +MM`    :+`             \n" +
"                .NMdMm+/:-`   :syys+:           .:NMNMms.   dMs   :MM-                    \n" +
"    -o`          +MMo`       oMMmNy:              mMo:dMm/ -MM`   .NM-          .`        \n" +
"    `-            /ys...`    dmmy-            `  yMd` `sMM+oMy ./` hd    `      +:        \n" +
"      `            .dMMMo                   -hds`Nh` +h`+NMdM/ `hm:```.  s.               \n" +
"     .h.            `dMs                    -NMN+h: -MM. -h+N:  `NM- :N`    :.    `       \n" +
"                     /Ms   `                 -sMo   sMN`    .`   hM+ .M:    -.   -s       \n" +
"          `          .My  /y `               sNd`   hMN`         hM+ .M+                  \n" +
"      :+ yNh          dd  :ddm`    `       `yMMo    sMM:        :NM- :M+                  \n" +
"       ` `+.          `hy`.-.  `++m-      :mh-Nm`   :MMN`      -mM+  sM-                  \n" +
"         +mo   +m/      +do.  hNMm+     -hm:  :mN/   yMMo     `mMo  .Nh                   \n" +
"                `         /dy-:.`    -omh/`    `oNd. `NMMm.   sMm.  hM:                   \n" +
"            /s              /dy` `:sdh+`         `hN- `oNMNo`+Mm.  -My                    \n" +
"            `-               `+oss+-`dd            odo--:hMMmMh.   sM/             `      \n" +
"                                     oM:            +NMNd.NMMN`  .mMMh:                   \n" +
"                                     oM:          -dMmo.` mMM+  .m:+dMMh.      :          \n" +
"                                    `mm`         :NMh`    mMM/  .Mo `/NMN-     .          \n" +
"                               ..` `sdMs.     `/dNMM:     mMMd. oMo   -mMm`               \n" +
"                        -ossydmhs+s.``+dNyo::+hhy+MM/     dMM+/ hMo    :MMo      .`       \n" +
"               ys     `sNNso/:.`/Ny`   `-+hNMh``.oMMy     hMN.  -NN:    hMN`              \n" +
"               ..    `hMd-      dM:       `.-.:smNsMM+    /MM-   /MN:`  .NM:              \n" +
"       /.            oMm`       /Mm`      `-omNh+. /NMo    /d:    /hNdo:-:mh              \n" +
"       -`            mM/         yMh-   .+mNdo-`    -dMh.   `      `-ohdh-mM.             \n" +
"             -/      Nd          `:mN+`ommy/`        `oNNo`            `` /Nh             \n" +
"             `.      d/   .os`     -mMdNs.             -yNm+               oM:            \n" +
"       ``           `h`  -md:       /MM/                 .hM+            .:dMs            \n" +
"       .:           oM/  dm.        -MM.                  `yN: ````    `/dyhMm            \n" +
"            s:      oMh .M:         oNo               `:/``sMhhdhhhy++ydm/ sMm            \n" +
"            `       .dMo.h          -.             `-odNd`oMM+/--+hysso:` `NM+            \n" +
"       .s-           +Mh   `                ::...:ohNms-`-NMh    +MN      `MM/            \n" +
"       ./.           oN/   os+///++.        :ydddmho:`  `mMM-    -MM`      NMo            \n" +
"                     s:     -:+o+/-            ``       :MMm      NM.      sMm`           \n" +
"                    `ooso-    :-                        :MMm      sM`      `mMs           \n" +
"                     .:oMy    /+                         dMM/     `+        .dM-          \n" +
"                       `MN.   hMo                        .NMN:               `/`          \n" +
"                        mMs   `NM.                        -mMN:                           \n" +
"                        sMh   .MN`                         `/ss`                          \n" +
"                        `+.   sM/                                                         \n" +
"                              -:                                                          \n" +
"                                                                                          \n" +
"                                                                                          \n" +
"                                                                                          ");
    }
    static void apresentarFogos(){
        System.out.println("                                                                                              :o//o:                                                                                                    \n" +
"                                                                                             `/dmmh/`                                                                                                   \n" +
"                                                                                             -+smds+.                                                                                                   \n" +
"                                                                                                //                                                                                                      \n" +
"                                                                                                                                           `````                                                        \n" +
"                                                                                                                                             ``...`                                                     \n" +
"                                                                                                                                                ``..                                                    \n" +
"                                                                                                                                                  `..                  `.-----.`                        \n" +
"                                `....                                    `.`    `.`                                      `.-:/+ooooo/:.`           `.`            `-/yyyysoo+/::::.`                    \n" +
"                               `.....`                                   `+s+::+s+`                                  `.-/////////+osyyys+:`         `.          -ohdyo:.`                               \n" +
"                                 `..                                      /yyyyyy+                                 `.-.``         ``-/oyyys/`        .`       .oddo-`                                   \n" +
"                                                                        `:syyyyyys:`                              ``                  `./syyo:       ``      -yds-                                      \n" +
"                                                                       `/oosyyyysoo/.                                                    `/syy/`      `     -dh:`           `...-...`                   \n" +
"                                                                           `/yy/`                                                          .+yy+`     `    .dy.        `.:+ssyyyyyyysso/-.`             \n" +
"                                                                             /+                                    ``-::////::-.`            :sy+`        `yy.       `/oyyso+++////+++ossso/-`          \n" +
"                                                                                                                `./+ossoooooossoo+:.          -oy/`       +h.      `/sso:-``          ``..:/oo/-`       \n" +
"                                                                                                              `:+oo:-.````````.-:/oo+:`        .oy-      `y:      :ss:`                     ``-:+:`     \n" +
"                                                                                                            `:++-`                 .:+o:.       .os`     /+`    `/o:                             `--`   \n" +
"                                                                                                          `-/:`                       ./+:.      .s+     o-    ./:`                                 ``  \n" +
"            ``    ``                                                                                     `:-`                           `:/:`     .s`   `-`   ./.       ``........```                   \n" +
"            -ss+/oy-                                                                                    .-`                               `-+.     :+   ..   `:`     `.......``.......``                \n" +
"            .smmmmh`                                                                                   ``                `.-://:-.``        `::`    +`  ``   :`    `...``           ``....`             \n" +
"           :ydmmmmdh/`                                   `-`                                                         `./oyyyyyysssyso/-`      .-`   `:      .`   `..`                   ``..`           \n" +
"          `---odmo---`                                   -ss-                                                      `:syyyo+:-.````..-:+++:`    `-.   .     ``   `.`                         `.`         \n" +
"               +o                                        /yyy+`                                                   -syyo:.               `-:/-    `.   `    `   ``                             ```       \n" +
"                                                         /yyyys:                                                 +yyo-                     `.:-    `          `          .-://:-`                ``     \n" +
"                                                         +yyyyyys-                                             .syo.                          `.`            `      `./+sooossyyys:`               `    \n" +
"                                                        .oyyyyyyyyo-                                          .sy:              `-:+ooo/:-.      `          `     `-:-.`      .:oyys:                   \n" +
"                                                        :syyyyyyyyyyo.                                       .so.            `:shddys+/::://:..                  ```             .+yy/                  \n" +
"                                                        /yyyyyyyyyyyyy+.                                    .o/`            -ydmho.`         ````              `-///:`            `:sy:                 \n" +
"                                                       `/yyyyyyyyyyyyyyy+.                                 `//`            /dmd+`                           `:+ssshddd+`            -sy.                \n" +
"                                                       .syyyyyyyyyyyyyyyyy+-                               :/`            /dmy-          `:+oo/:.`         `-.``  `./hmy.            -yo                \n" +
"                                                       :yyyyyyyyyyyyyyyyyyyyo-`                           .:`            .dds.          -sys/-...`                   .sms.            :y-               \n" +
"                                                      `/yyyyyyyyyyyyyyyyyyyyyyo:`                        `-`             ymy.          :sy+`       `..`               `od+             oo               \n" +
"                                                      .syyyyyyyyyyyyyyyyyyyyyyyys/.                      ``             -dh.          .oy:        `..                  .sy-            .o`              \n" +
"                                                      -yyyyyyyyyyyyyyyyyyyyyyyyyyyy+-                                   yd/           /y/`        ..`                   :h/            `/:              \n" +
"                                                     `oyyyyyyyyyyyyyyyyyyyyyyyyyyyys:                                  `hy           .oo.        `..                    `os.            -+              \n" +
"                                                     .yyyyyyyyyyyyyyyyyyyyyyyyyyyy+.                                   -h-           -y:         `.`                     :h-            .:              \n" +
"                                                     +yyyyyyyyyyyyyyyyyyyyyyyyyys+`                                    +y`           :o.         `.                      `s:             .`             \n" +
"                                                    .yyyyyyyyyyyyyyyyyyyyyyyys+..o-                                    s:            :/          ..                       o/             ``             \n" +
"                                                    oyyyyyyyyyyyyyyyyyyyyso+-`  `+/                                    s.           `:/          ..                       :+`            ``             \n" +
"                                                    ossyyyyyyyyyyyyysso/:.`    -oys-                                   +`           `:-          ``                       `+.                           \n" +
"                                                     ``.-+s/::::::-.``       .+yyyy:                                   -`           `-`          ``                        o.                           \n" +
"                     `.`.`                               `+:              `-+yyyyyyo.                                  `            `-`          `                         o.                           \n" +
"                     :ssy-                                .o.         ``-/syyyyyyyyy:                                               `.                                     +.                           \n" +
"                    `/oyo/.                                -s`   ``.-/osyyyyyyyyyyyyo`                                              ``                                     /`                           \n" +
"                      `:`                                   /o/++ssyyyyyyyyyyyyyyyyyy-                                               `                                     -`                           \n" +
"                                                             oyyyyyyyyyyyyyyyyyyyys:/o`                                                                                    .`                           \n" +
"                                                             .yyyyyyyyyyyyyyyyyyy+.  o.                                                                                    .`                           \n" +
"                                                              :yyyyyyyyyyyyyyys+.    /o                                                                                    `                            \n" +
"                                                              `/yyyyyyyyyyys+-`      `s`                                                                                   `                            \n" +
"                                                               .oyyyyyys+:.          .so                                                             `/+`                                               \n" +
"                                                                -s+:.`             `/yys.                                                           -yms.                                               \n" +
"        `...`                                                    //`             ./syyyy+                                                         -smmmy-                                               \n" +
"       `.....`                                                   `+-          `:osyyyyyys.                     `    `                           .odmmmmd/                               `   `           \n" +
"         `.`                                                      -o.     .-/osyyyyyyyyyy+                     os/+s/                         .+dmmmmmmm/                               -soo/`          \n" +
"                                                                   /o//+ssyyyyyyyyyyyyyyso.                   .syyyy+`                      .+hmmmmmmmmm+`                             .+yyyo-          \n" +
"                                                                    +yyyyyyyyyyyyyyyyys:`//                  -+osyyso+.                   .+hmmmmmmmmmmmy.                             `./s/.`          \n" +
"                                                                    `syyyyyyyyyyyyyys:`  -+.                  ``.so.``                  .ohmmmmmmmmmmmmmd:                                ``            \n" +
"                                                                     -yyyyyyyyyyys+-`    `+:                     .`                   -ohmmmmmmmmmmmmmmmm+`                                             \n" +
"                                                                      +yyyyyys+/.`        /+`                                      `/sdmmmmmmmmmmmmmmmmmmh.                                             \n" +
"                                                                      `so:-.``          ./yy:                                      :hmmmmmmmmmmmmmmmmmmmmm:                                             \n" +
"                                                                       -o.           `.+syyy+`                                      -smmmmmmmmmmmmmmmmmmmmy`                                            \n" +
"                          ```                                          `//`       `./osyyyyyy-                                       /yshmmmmmmmmmmmmmmmmmm-                                            \n" +
"                           ``.`                                         .+/...--/osyyyyyyyyyy+`                                     .o/.-/shddmmmmmmmmmmmmmy`                                           \n" +
"                `````         ``          ``----.`                       -syyyyyyyyyyyyyyyyo:o.             -/:+`                   /s-....-:/osyyhhhhhdyoo/                                            \n" +
"           `.-:/++ooo/:.       ``      `:+so//--.```                      /yyyyyyyyyyyyyyo:` /+            `+dmd/                  .hy+:--.......---::o+`                                  ``    `      \n" +
"         `...``````.:+ss+-     ``    `:ss/.`                              .oyyyyyyyyyss/-`   `s`           `./s:.                  +mmddhsso++//++oosyo`                                   `..`...      \n" +
"                      `:oy+`    `   `+y/`                                  :syssso+:-.`      `oo              `                   `dmmmmmmmmmddddmmmmy.                                    `......      \n" +
"                        `:so.      `/y.     `-/+oooo+/-.`                   ++`            `:oyy.                                 smmmmmmmmmmmmmmmmmh.                                   `.........`    \n" +
"        `.-:/++/:-.`      .oo.     -y.    .+oo+/::--:++++/-`                `s.        ``-/syyyy+                                -dddmmmmmmmmmmmmmmd-                                      ``...```     \n" +
"      `:+//:----:/++:.     `++`    s.   `/+:.`          `.:::`               :s`````-:/osyyyyyy+.                                y/:+syhddddddddhyd/                                          .`        \n" +
"    `::-`          `-//.    `+:   `+   -/.                  `..`              ossssyyyyyyyyys/.                                 /s-...----::::---o+`                                                    \n" +
"   .-`                `:/`   ./.  :   .-`     `````                           `/sssyyyyysss/`                                  `y/..............+o`                                                     \n" +
"  .`                    `:-   --  .  ..   `...........`                          `..---s` :/`                                  +dhs+/:-------:/+s.                                                      \n" +
"           `-/+ooo+:-.    `-`  -`   ``  ``.`         ``.``                             ++ .+-                                 -ymmmmmddhhhhhhdmh:                                                       \n" +
"         `/syo+:....-//:.   .` ``   `  ``                ```                           `s. :+`                                ommmmmmmmmmmmmmmd/                                                        \n" +
"        :ys:`           .-.  ``       ``      ```          ``                           :+ `+-                               :hddmmmmmmmmmmmmd+                                                         \n" +
"      `+s:                 .`        `    `-:+osss+-                                    `o: -o`                             .o+.:+oyhhhhhhyoys`                                                         \n" +
"     `++`        -/oso+/--`             `..`    `-+y+`                                   -+` +:                             /s-............/y`                        -o//.                             \n" +
"    `/:`       -ydy/-.```.`.`          -::`        .so`                                  `+: .s`                           .hy+:..........-h.                        .smmh/`                            \n" +
"    :-        /hh:`      ```        `:++oyh+        `o/                                   -+. /o                          `ommmddyo++++oosh-                          .:s.`                             \n" +
"   .-        :hy.      .oo/:-`      `    `:hs        .o.                                  `/: `s.                         -mmmmmmmmmmmmmmm/                                                             \n" +
"   `        `sy.      -o+`    ```          .h/        :/                                   -o. :o                        `yoshdmmmmmmmmmmo`                                                             \n" +
"            :h:      `+/`     .`            :y`       .:`                                   //` o: `                     +o.--//+syyysoys.                                                              \n" +
"            ++`      -o.     `.             `o:        ..                                   .o. -o-`                    -d/-......----/s-                                                               \n" +
"           `+:       ::      ``              -o        ..                                 `.`++ `++.` ````              :ddhy+/::---:/s:                                                                \n" +
"           -/`       :-      ``              .+        ``                                  `.-s- -o-.....                -sdmmdddhhhdh/                                                                 \n" +
"           -:       `-.      ``              `-`                                           `..:+/+/-...`                  `:yhhdhhhhy+`                                                                 \n" +
"           `.       `.`      ``               ..                                        ``.....---......``                 :s-o+.````                                                                   \n" +
"                    ``                        ..                                         ````............``               .y:/o.                                                                        \n" +
"                     `                        `.                                            `........`                    s+:o:                                                                         \n" +
"                                              `.                                            `.`   `..`                   /y-+o`                                                                         \n" +
"                                              ``                                                    `                   .h-/s.                                                                          \n" +
"                                               `                                                                       `y/-s:                                                                           \n" +
"                                                                                                                       +o-oo                                                                            \n" +
"                                                                                                                    `.:s::y`                                                                            \n" +
"                                                                                                                `.``.-s/-h:.                                                                            \n" +
"                                                                                                                 `...+o:so.                                                                             \n" +
"                                                                                                                `....-/o+..``                                                                           \n" +
"                                                                                                               ````.......````                                                                          \n" +
"                                                                                                                   `..``..                                                                              \n" +
"                                                                                                                   ``    ``                                                                             ");
    
    
    }

    // Chegadas aos Castelos
    static void chegarAd(){
        System.out.println("\nChegamos ao primeiro castelo, "
                + "o Castelo da Adição. "
                + "\nAqui, você ajudará os Somatrolls em suas atividades "
                + "diárias. \nBoa sorte!");
    }
    static void chegarSub(){
        System.out.println("\nChegamos ao segundo castelo, "
                + "o Castelo da Subtração. "
                + "\nAqui, você enfrentará a sabedoria dos Subtraelfos! "
                + "\nBoa sorte!");
    }
    static void chegarMult(){
        System.out.println("\nChegamos ao terceiro castelo, "
                + "o Castelo da Multiplicação. "
                + "\nAqui, você irá se deparar com a vaidade dos Multidragons! "
                + "\nBoa sorte!");
    }
    static void chegarDiv(){
        System.out.println("\nChegamos ao quarto castelo, "
                + "o Castelo da Divisão."
                + "\nAqui, você encontrará os Dividuendes. Mas, cuidado! "
                + "Eles tentarão nos enganar... \nBoa sorte!");
    }
    
    // Perguntas do Castelo da Adição (Somatrolls)  
    static void perguntarAd1A() {
        Scanner leitor = new Scanner(System.in);
        char ad1A;
        do {
            System.out.println("\nQuestão 1: \nEm uma noite de lua cheia,"
                    + " 73 Somatrolls reuniram-se na floresta para fazer uma "
                    + "fogueira. Outros 37 juntarem-se a eles. "
                    + "\nQuantos Somatrolls estavam na floresta naquela noite?");
            System.out.println("A) 105");
            System.out.println("B) 111");
            System.out.println("C) 110");
            System.out.println("D) 115");
            ad1A = leitor.next().charAt(0);
        } while (ad1A != 'c' && ad1A != 'C');
        if (ad1A == 'a'){
            System.out.println("Você é burro?!");
        }
        else{
            System.out.println("\nÉ isso aí! Vamos nessa!");
        }
    }
    static void perguntarAd2A() {
        Scanner leitor = new Scanner(System.in);
        char ad2A;
        do {
            System.out.println("\nQuestão 2: \nUm Somatroll criança pesa "
                    + "aproximadamente 130kg. Até a sua adolescência, "
                    + "ele pode engordar 111kg. "
                    + "\nQual o peso de um Somatroll adolescente?");
            System.out.println("A) 241kg");
            System.out.println("B) 240kg");
            System.out.println("C) 200kg");
            System.out.println("D) 221kg");
            ad2A = leitor.next().charAt(0);
        } while (ad2A != 'a' && ad2A != 'A');
        System.out.println("\nUau! Resposta Correta!");
    }
    static void perguntarAd3A() {
        Scanner leitor = new Scanner(System.in);
        char ad3A;
        do {
            System.out.println("\nQuestão 3: "
                    + "\nSobre os trolls do Castelo da Adição, responda:\n"
                    + "\na)Um Somatroll transforma-se em pedra quando exposto "
                    + "à luz solar. Se ele ficar exposto ao sol por 37 minutos"
                    + " e depois por mais 67 minutos, \nquantos minutos ele ficará"
                    + " transformado em pedra, no total?\n"
                    + "b)Dependendo do tamanho de um Somatroll macho, "
                    + "o seu narigão pode medir 190cm. Já uma Somatroll fêmea "
                    + "pode ter um nariz de 135cm. \nSe somarmos o nariz do macho"
                    + " com o da fêmea, qual tamanho teremos?");
            System.out.println("\nA) 104 minutos e 290cm");
            System.out.println("B) 210 minutos e 120cm");
            System.out.println("C) 104 minutos e 325cm");
            System.out.println("D) 110 minutos e 300cm");
            ad3A = leitor.next().charAt(0);
        } while (ad3A != 'c' && ad3A != 'C');
        System.out.println("\nIncrível! Acertou mais uma vez!");
    }
    static void perguntarAdEnigA() {
        Scanner leitor = new Scanner(System.in);
        char adEnigA;
        do {
            System.out.println("\nENIIIGMAAA!"
                    + "\nA professora de 6º ano dos Somatrolls indicou "
                    + "aos seus alunos os livros sobre grutas e cavernas que "
                    + "deverão ler no primeiro bimestre. "
                    + "\nO primeiro tem 64 páginas e o segundo tem 72. "
                    + "Quantas páginas, ao todo, os alunos irão ler?");
            System.out.println("A) 136 páginas");
            System.out.println("B) 138 paginas");
            System.out.println("C) 140 paginas ");
            System.out.println("D) 132 paginas");
            adEnigA = leitor.next().charAt(0);
        } while (adEnigA != 'a' && adEnigA != 'A');
        System.out.println("\nQue Maravilha! "
                + "Agora, estamos mais perto de salvar nossa querida Dezena!");
    }
    
    static void perguntarAd1B(){
        Scanner leitor = new Scanner(System.in);
        char ad1B; 
        do{
            System.out.println("\nQuestão 1: \nEm uma briga para ver quem "
                    + "poderia cochilar sobre o grande salgueiro da floresta, "
                    + "um Somatroll levou, para sua defesa: \numa erva venenosa "
                    + "que provoca coceira, duas flores causadoras de ataques de "
                    + "risada e, de quebra, ainda levou cinco bolas de fumaça." 
                    + "\nCalcule 1 erva + 2 flores + 5 bolas de fumaça, "
                    + "para saber quantas armas esse Somatroll levou.");
            System.out.println("A) 7");
            System.out.println("B) 8");
            System.out.println("C) 10");
            System.out.println("D) 9");
            ad1B = leitor.next().charAt(0);
        } while (ad1B != 'b' && ad1B != 'B');
        System.out.println("\nParabéns! Sua resposta está correta. "
                + "Seguiremos para a próxima questão...");
    }
    static void perguntarAd2B(){
        Scanner leitor = new Scanner(System.in);
        char ad2B; 
        do{
            System.out.println("\nQuestão 2: \nPor noite, um Somatroll "
                    + "recém-nascido  pode comer  mil e duas lesmas da floresta"
                    + ", dois caracóis e dez mil e vinte cogumelos. "
                    + "\nSabendo disso, quanto come, por noite, "
                    + "um Somatroll recém-nascido?");
            System.out.println("A) 11.030");
            System.out.println("B) 10.200");
            System.out.println("C) 11.024");
            System.out.println("D) 10.500");
            ad2B = leitor.next().charAt(0);
        } while (ad2B != 'c' && ad2B != 'C');
        System.out.println("\nResposta correta!");
    }
    static void perguntarAd3B(){
        Scanner leitor = new Scanner(System.in);
        char ad2B; 
        do{
            System.out.println("\nQuestão 3: \nSomatrolls são conhecidos por "
                    + "ficarem facilmente muito zangados. "
                    + "\nPara fazer uma torta de lesmas, um Somatroll se enrolou "
                    + "e perdeu a conta de quantos ingredientes ele comprou. "
                    + "\nAjude-o a somar corretamente a quantidade de itens, "
                    + "antes que ele se zangue: 889 caixas de leite de cabra , "
                    + "123 lesmas  e 12 cogumelos.");
            System.out.println("A) 1025 ingredientes");
            System.out.println("B) 1020 ingredientes");
            System.out.println("C) 1022 ingredientes");
            System.out.println("D) 1024 ingredientes");
            ad2B = leitor.next().charAt(0);
        } while (ad2B != 'd' && ad2B != 'D');
        System.out.println("\nMais uma resposta correta! "
                + "Mas, prepare-se: agora, você terá que responder o Enigma...");
    }
    static void perguntarAdEnigB(){
        Scanner leitor = new Scanner(System.in);
        char ad1B; 
        do{
            System.out.println("\nENIIIGMAAAA!"
                    + "\nNo ano 2201, os Somatrolls ganharam a Liga de Pedras, "
                    + "alcançando a vitória para o Castelo da Adição por "
                    + "283.356 pontos. \nEm 2214, essa pontuação foi de "
                    + "345.760. \nQuantos pontos os Somatrolls conquistaram "
                    + "para o seu Castelo em dois anos?");
            System.out.println("A) 629.116 pontos");
            System.out.println("B) 639.116 pontos");
            System.out.println("C) 625.226 pontos");
            System.out.println("D) 629.119 pontos");
            ad1B = leitor.next().charAt(0);
        } while (ad1B != 'a' && ad1B != 'A');
        System.out.println("\nUAU! Isso foi incrível! "
                + "Estamos cada vez mais próximos de salvar a Princesa Dezena!");
    }
    
    static void perguntarAd1C(){
        Scanner leitor = new Scanner(System.in);
        char ad1C; 
        do{
            System.out.println("\nQuestão 1: \nEm uma festa de despedida "
                    + "de Somatrolls, foram consumidos 3/4 da bebida verde musgo "
                    + "de um lado do ginásio, e 5/6 do outro. "
                    + "\nQuanto foi consumido ao total?");
            System.out.println("A) 17/11");
            System.out.println("B) 17/12");
            System.out.println("C) 19/12");
            System.out.println("D) 16/11");
            ad1C = leitor.next().charAt(0);
        } while (ad1C != 'c' && ad1C != 'C');
        System.out.println("\nEbaaaa, você acertou!");
    }
    static void perguntarAd2C(){
        Scanner leitor = new Scanner(System.in);
        char ad2C; 
        do{
            System.out.println("\nQuestão 2: \n1/4 dos Somatrolls do leste não "
                    + "tomam banho durante três dias, enquanto 8/3 dos "
                    + "Somatrolls do oeste não se banham durante quatro. "
                    + "\nRealizando a soma, qual é a quantidade de Somatrolls"
                    + "que não toma banho?");
            System.out.println("A) 35/12");
            System.out.println("B) 28/12");
            System.out.println("C) 30/12");
            System.out.println("D) 33/12");
            ad2C = leitor.next().charAt(0);
        } while (ad2C != 'a' && ad2C != 'A');
        System.out.println("\nAcertou de novo, vamos conseguir!");
    }
    static void perguntarAd3C(){
        Scanner leitor = new Scanner(System.in);
        char ad3C; 
        do{
            System.out.println("\nQuestão 3: \n7/10 da população de Somatrolls "
                    + "são lavradores e cultivam milho. Outros 2/3 cultivam "
                    + "batata. E mais outros 8/5 cultivam trigo. "
                    + "\nQuantos Somatrolls lavradores há no Castelo da Adição?");
            System.out.println("A) 80/40");
            System.out.println("B) 89/30");
            System.out.println("C) 81/50");
            System.out.println("D) 88/31");
            ad3C = leitor.next().charAt(0);
        } while (ad3C != 'b' && ad3C != 'B');
        System.out.println("\nVocê conseguiu! Está prestes a enfrentar o Enigma"
                + " dos atletas. Não desista!!");
    }
    static void perguntarAdEnigC(){
         Scanner leitor = new Scanner(System.in);
        char adEnigC; 
        do{
            System.out.println("\nENIIIGMAAA!"
                    + "\nUm Somatroll atleta, ao participar de uma prova de "
                    + "cochilo, dormiu 120 minutos da seguinte maneira: "
                    + "\n1/10 logo após o café da manhã, 7/10 após o seu "
                    + "intervalo de almoço e o restante à tarde. "
                    + "\nQuantos minutos esse atleta dormiu à tarde?");
            System.out.println("A) 30 minutos");
            System.out.println("B) 24 minutos");
            System.out.println("C) 23 minutos");
            System.out.println("D) 26 minutos");
            adEnigC = leitor.next().charAt(0);
        } while (adEnigC != 'b' && adEnigC != 'B');
        System.out.println("\nParabéns por ter acertado esse Enigma tão terrível!");
    }
    
    // Perguntas do Castelo da Subtração (Subtraelfos)    
    static void perguntarSub1A() {
        Scanner leitor = new Scanner(System.in);
        char sub1A;
        do {
            System.out.println("\nQuestão 1:"
                    + "\nO Elfo Minuendo tinha 20 carrinhos de madeira."
                    + "\nCerto dia, deu aos seus sobrinhos 5 desses carrinhos, "
                    + "para que realizassem a corrida dos elfos na ladeira, "
                    + "\nInforme quantos carrinhos restaram ao Elfo Minuendo.");
            System.out.println("A) 15");
            System.out.println("B) 48");
            System.out.println("C) 16");
            System.out.println("D) 27");
            sub1A = leitor.next().charAt(0);
        } while (sub1A != 'a' && sub1A != 'A');
        System.out.println("\nUau! Resposta Correta!");
    }
    static void perguntarSub2A() {
        Scanner leitor = new Scanner(System.in);
        char sub2A;
        do {
            System.out.println("\nQuestão 2:"
                    + "\nTrês irmãs elfas receberam 120 moedas élficas de sua "
                    + "mãe Elfiana. "
                    + "\nSabemos que Virgulina recebeu 52 e Aspina 44. "
                    + "\nQuanto recebeu Colsis?");
            System.out.println("A) 41 moedas");
            System.out.println("B) 35 moedas");
            System.out.println("C) 24 moedas");
            System.out.println("D) 16 moedas");
            sub2A = leitor.next().charAt(0);
        } while (sub2A != 'c' && sub2A != 'C');
        System.out.println("\nÉ isso aí, vamos nessa!");
    }
    static void perguntarSub3A() {
        Scanner leitor = new Scanner(System.in);
        char sub3A;
        do {
            System.out.println("\nQuestão 3:"
                    + " \nA cidade Élfica está com um problema: "
                    + "os moradores possuem apenas 23 pedras lunares para a "
                    + "realização da festa semanal, sendo necessárias 58. "
                    + "\nVocê deverá informar aos organizadores da festa "
                    + "quantas pedras faltam.");
            System.out.println("A) 35 pedras");
            System.out.println("B) 36 pedras");
            System.out.println("C) 40 pedras");
            System.out.println("D) 15 pedras");
            sub3A = leitor.next().charAt(0);
        } while (sub3A != 'a' && sub3A != 'A');
        System.out.println("\nÉ isso aí, vamos nessa!");
    }
    static void perguntarSubEnigA() {
        Scanner leitor = new Scanner(System.in);
        char subEnigA;
        do {
            System.out.println("\nENIGMA!!!"
                    + "\nO Sr. Alziro, elfo confeiteiro, precisa de exatos 1,5kg "
                    + "de farinha para a preparação de um bolo mágico."
                    + "\nAcidentalmente, o seu ajudante lhe deu 1,68kg."
                    + "\nQuantos quilogramas de farinha o Sr. Alziro precisará "
                    + "tirar para não errar a receita?");
            System.out.println("A) 1,0kg");
            System.out.println("B) 0,18kg");
            System.out.println("C) 4,0kg");
            System.out.println("D) 5,0kg");
            subEnigA = leitor.next().charAt(0);
        } while (subEnigA != 'b' && subEnigA != 'B');
        System.out.println("\nQue Maravilha! Agora estamos mais perto de salvar nossa querida Dezena!");
    }
    
    static void perguntarSub1B() { 
        Scanner leitor = new Scanner(System.in);
        char sub1B;
        do{           
            System.out.println("\nQuestão 1: "
                    + "\nA fábrica de sapatos da Vila Élfica possui 5235 pares "
                    + "de calçados em estoque e recebe um pedido, de um único "
                    + "cliente misterioso, de 4989 pares de sapatos mágicos. "
                    + "\nQuantas unidades de calçados sobrarão em estoque "
                    + "após a entrega desse pedido?");
            System.out.println("A) 246 unidades");
            System.out.println("B) 492 unidades");
            System.out.println("C) 500 unidades");
            System.out.println("D) 546 unidades");
            System.out.println("E) 546 unidades");
            sub1B = leitor.next().charAt(0);
        } while (sub1B != 'b' && sub1B != 'B');
        System.out.println("\nResposta correta!!");
    }
    static void perguntarSub2B() { 
        Scanner leitor = new Scanner(System.in);
        char sub2B;
        do{           
            System.out.println("\nQuestão 2: "
                    + "\nNo torneio de facas élficas, agruparam-se 2450 elfos "
                    + "na Praça de Cristal. Desses, 1289 eram elfos vermelhos "
                    + "e, o restante, elfos alados. \nQuantos dos elfos que "
                    + "estavam na Praça de Cristal, para esse torneio, "
                    + "eram elfos alados?");
            System.out.println("A) 1000");
            System.out.println("B) 1051");
            System.out.println("C) 1059");
            System.out.println("D) 1149");
            System.out.println("E) 1161");
            sub2B = leitor.next().charAt(0);
        } while (sub2B != 'E' && sub2B != 'e');
        System.out.println("\nMeus parabéns! Mais uma resposta correta!");
    } 
    static void perguntarSub3B() { 
        Scanner leitor = new Scanner(System.in);
        char sub3B;
        do{           
            System.out.println("\nQuestão 3: "
                    + "\nA Subtraelfa da luz acrescentou 7854 novas mágicas "
                    + "ao seu livro de feitiços, e o resultado obtido foi de "
                    + "20000 mágicas. "
                    + "\nQuantos feitiços havia antes?");
            System.out.println("A) 10060 feitiços");
            System.out.println("B) 10056 feitiços");
            System.out.println("C) 12454 feitiços");
            System.out.println("D) 12146 feitiços");
            System.out.println("E) 15004 feitiços");
            sub3B = leitor.next().charAt(0);
        } while (sub3B != 'd' && sub3B != 'D');
        System.out.println("\nFantástico! Seguiremos para o Enigma...");
    }
    static void perguntarSubEnigB(){
        Scanner leitor = new Scanner(System.in);
        char subEnigB;
        do{           
            System.out.println("\nENIIIGMA!"
                    + "\nO Elfo Thriondel comprou 237 doces para uma festa. "
                    + "Desses doces, consumiu 17, deu 42 para sua amada Anidel "
                    + "e 28 para seu cavalo. \nQuantos doces restaram?");
            System.out.println("A) 150 doces");
            System.out.println("B) 155 doces");
            System.out.println("C) 140 doces");
            System.out.println("D) 20 doces");
            subEnigB = leitor.next().charAt(0);
        } while (subEnigB != 'a' && subEnigB != 'A');
        System.out.println("\nIMPRESSIONANTE! Logo, logo conseguiremos salvar a "
                + "Princesa Dezena!");
    }
    
    static void perguntarSub1C(){
        Scanner leitor = new Scanner(System.in);
        char sub1C;
        do{           
            System.out.println("\nQuestão 1: "
                    + "\nO mago elfo Subtrizel está fazendo uma poção "
                    + "e precisa saber qual propriedade abaixo é válida na "
                    + "subtração:");
            System.out.println("A) Comutativa");
            System.out.println("B) Existência do elemento neutro");
            System.out.println("C) Associativa");
            System.out.println("D) Fechamento");
            sub1C = leitor.next().charAt(0);
        } while (sub1C != 'd' && sub1C != 'D');
        System.out.println("\nUau! Resposta Correta!");
    }
    static void perguntarSub2C(){
         Scanner leitor = new Scanner(System.in);
        char sub2C;
        do{           
            System.out.println("\nQuestão 2: "
                    + "\nUm Poço Calculador possui a função de uma calculadora, "
                    + "como no mundo dos humanos, e pode apresentar, no máximo, "
                    + "resultados de até oito dígitos. \nSe um Subtrelfo "
                    + "informar ao poço o maior número possível e, em seguida, "
                    + "pedir que subtraia o maior número par possível, "
                    + "qual o resultado obtido?");
            System.out.println("A) 99");
            System.out.println("B) 1");
            System.out.println("C) 45");
            System.out.println("D) 2");
            sub2C = leitor.next().charAt(0);
        } while (sub2C != 'b' && sub2C != 'B');
         System.out.println("\nIncrivel! Acertou mais uma vez!");
    }
    static void perguntarSub3C(){
        Scanner leitor = new Scanner(System.in);
        char sub3C;
        do{           
            System.out.println("\nQuestão 3: "
                    + "\nNa loja Elfimix, uma bolsa de pele de Multidragon "
                    + "e uma pedra de Dividuende custaram, juntas, "
                    + "R$1,10 (convertidos de moedas élficas para Real). "
                    + "\nA bolsa custou um real a mais que a pedra. "
                    + "Quanto custou a bolsa?");
            System.out.println("A) R$1,05");
            System.out.println("B) R$0,50");
            System.out.println("C) R$1,00");
            System.out.println("D) R$0,35");
            sub3C = leitor.next().charAt(0);
        } while (sub3C != 'c' && sub3C != 'C'); 
        System.out.println("\nQue Maravilha ! "
                        + "Agora estamos mais perto para salvar nossa querida Dezena!");
    }
    static void perguntarSubEnigC(){
    Scanner leitor = new Scanner(System.in);
        char subEnigC;
        do{           
            System.out.println("\nEENIGMAA!"
                    + "\nUm Monstro Élfico Vermelho pode transportar 370 "
                    + "passageiros, enquanto um Monstro Élfico Alado pode "
                    + "transportar 285. \nQuantos passageiros o Monstro Élfico "
                    + "Vermelho transporta a mais que o Monstro Élfico Alado?");
            System.out.println("A) 85 passageiros");
            System.out.println("B) 41 passageiros");
            System.out.println("C) 28 passageiros");
            System.out.println("D) 10 passageiros");
            subEnigC = leitor.next().charAt(0);
        } while (subEnigC != 'a' && subEnigC != 'A');  
        System.out.println("\nO Enigma final a partir de agora voce "
                        + "enfrentara uma das maiores dificuldades dos Elfos a Cozinha");
    }
    
    // Perguntas do Castelo da Multiplicação (Multidragons)    
    static void perguntarMult1A() {
        Scanner leitor = new Scanner(System.in);
        char mult1A;
        do {
            System.out.println("\nQuestão 1:"
                    + "\nPara um campeonato de lançamento de chamas, "
                    + "um treinador Multidragon prepara 33 grupos de dragões. "
                    + "Cada grupo é formado por 6 deles. "
                    + "\nQuantos dragões devem participar desse campeonato?");
            System.out.println("A) 215 Multidragons");
            System.out.println("B) 198 Multidragons");
            System.out.println("C) 168 Multidragons");
            System.out.println("D) 98 Multidragons");
            mult1A = leitor.next().charAt(0);
        } while (mult1A != 'b' && mult1A != 'B');
        System.out.println("\nUau! Resposta Correta!");
    }
    static void perguntarMult2A() {
        Scanner leitor = new Scanner(System.in);
        char mult2A;
        do {
            System.out.println("\nQuestão 2: "
                    + "\nCom 12 Multidragons fêmeas botando aproximadamente "
                    + "325 ovos ao ano, quantos ovos haverá no total?");
            System.out.println("A) 2900 ovos");
            System.out.println("B) 3500 ovos");
            System.out.println("C) 3900 ovos");
            System.out.println("D) 1900 ovos");
            mult2A = leitor.next().charAt(0);
        } while (mult2A != 'c' && mult2A != 'C');
        System.out.println("\nÉ isso aí! Vamos nessa!");
    }
    static void perguntarMult3A() {
        Scanner leitor = new Scanner(System.in);
        char mult3A;
        do {
            System.out.println("\nQuestão 3: \nNo Reino da Matemágica, "
                    + "há 18 famílias de Multidragons. Em cada família, "
                    + "existem cerca de 26 dragões filhotes. "
                    + "\nQuantos filhotes há no reino?");
            System.out.println("A) 501 filhotes");
            System.out.println("B) 428 filhotes");
            System.out.println("C) 398 filhotes");
            System.out.println("D) 468 filhotes");
            mult3A = leitor.next().charAt(0);
        } while (mult3A != 'd' && mult3A != 'D');
        System.out.println("\nIncrível! Acertou mais uma vez!");

    }
    static void perguntarMultEnigA() {
        Scanner leitor = new Scanner(System.in);
        char multEnigA;
        do {
            System.out.println("\nENIGMA!!!! "
                    + "\nUm Multidragon possui 4700 escamas no pescoço. "
                    + "Além disso, possui 2300 escamas em cada uma das quatro "
                    + "patas, mais o dobro de 2300 na cauda. "
                    + "\nQuantas escamas esse dragão tem?");
            System.out.println("A) 18500 escamas");
            System.out.println("B) 19800 escamas");
            System.out.println("C) 15300 escamas");
            System.out.println("D) 16000 escamas");
            multEnigA = leitor.next().charAt(0);
        } while (multEnigA != 'a' && multEnigA != 'A');
        System.out.println("\nQue Maravilha! "
                + "Agora, estamos mais perto de salvar nossa querida Dezena!");
    }
    
    static void perguntarMult1B(){
        Scanner leitor = new Scanner(System.in);
        char mult1B;
        do{
            System.out.println("\nQuestão 1: \nUm Multidragon estava na escola "
                    + "e se deparou com a seguinte questão : "
                    + "2(m + 5) = -3(m + 15). \nAjude-o a resolver o problema, "
                    + "descobrindo o valor de m: ");
            System.out.println("A) 11");
            System.out.println("B) -3");
            System.out.println("C) -11");
            System.out.println("D) 2");
            mult1B = leitor.next().charAt(0);
        } while (mult1B != 'c' && mult1B != 'C');
        System.out.println("\nResposta correta!");
    }    
    static void perguntarMult2B(){
        Scanner leitor = new Scanner(System.in);
        char mult2B;
        do{
            System.out.println("\nQuestão 2: \nUm Multidragon adulto é capaz"
                    + " de dar 80 voltas no Castelo da Multiplicação"
                    + " em 20 minutos. \nQuantas voltas dará em 28 minutos?");
            System.out.println("A) 90 voltas");
            System.out.println("B) 100 voltas");
            System.out.println("C) 110 voltas");
            System.out.println("D) 112 voltas");
            mult2B = leitor.next().charAt(0);
        } while (mult2B != 'd' && mult2B != 'D');
        System.out.println("\nIncrível! Você acertou mais uma vez!");
    }    
    static void perguntarMult3B(){
        Scanner leitor = new Scanner(System.in);
        char mult3B;
        do{
            System.out.println("\nQuestão 3: \nUm grupo de dragões guerreiros "
                    + "se deparou com o seguinte desafio: em uma batalha, "
                    + "há perda de dragões, mas ganho de alimentos. "
                    + "\nDescubra quais as perdas e os ganhos a partir da "
                    + "seguinte equação: x² - 2x - 8 = 0.");
            System.out.println("A) -3 e 5");
            System.out.println("B) -2 e 4");
            System.out.println("C) -1 e 4");
            System.out.println("D) -2 e 5");
            mult3B = leitor.next().charAt(0);
        } while (mult3B != 'b' && mult3B != 'B');
        System.out.println("\nUau! Vamos continuar para o Enigma!!");
    }    
    static void perguntarMultEnigB(){
        Scanner leitor = new Scanner(System.in);
        char multEnigB; 
        do{
           System.out.println("\nENIIIIIGMAAA! "
                   + "\nNa preparação de um grande bolo para 6 Multidragons "
                   + "filhotes, temos a seguinte receita:\n" 
                   + "- 1 ovo gigante,\n" 
                   + "- 2 caldeirões de leite,\n" 
                   + "- 4 barris de sal,\n" 
                   + "- 250 pacotes de farinha,\n" 
                   + "- 300 sacos de açúcar.\n" 
                   + "a)Qual será a quantidade de cada ingrediente para" 
                   + "preparar um bolo para 30 dragões?\n" 
                   + "b) Qual será a quantidade de cada ingrediente para "
                   + "preparar um bolo para 210 dragões?\n");
            System.out.println("A) Cada ingrediente: 5, 10, 20, 1250, 1500 e "
                    + "35, 70, 140, 8750, 10500");
            System.out.println("B) Cada ingrediente: 5, 15, 21, 1200, 1501 e "
                    + "37, 79, 130, 8752, 10510");
            System.out.println("C) Cada ingrediente: 10, 15, 25, 1260, 1700 e "
                    + "35, 80, 150, 8750, 10600");
            System.out.println("D) Cada ingrediente: 4, 18, 30, 1230, 1500 e "
                    + "50, 70, 140, 8650, 10510");
            multEnigB = leitor.next().charAt(0);
        } while (multEnigB != 'a' && multEnigB != 'A'); 
        System.out.println("\nIncrível!!! Mais um Enigma solucionado!");
    }   
   
    static void perguntarMult1C(){
        Scanner leitor = new Scanner(System.in);
        char mult1C;
        do{
            System.out.println("\nQuestão 1: \nSe cada Multidragon consegue "
                    + "queimar um milharal inteiro em 8 minutos, "
                    + "então é correto afirmar que 6 Multidragons "
                    + "queimarão esse mesmo milharal em:");
            System.out.println("A) 1min e 40seg");
            System.out.println("B) 1min e 50seg");
            System.out.println("C) 1min e 10seg");
            System.out.println("D) 1min e 20seg");
            mult1C = leitor.next().charAt(0);
        } while (mult1C != 'd' && mult1C != 'D'); 
        System.out.println("\nVocê é muito esperto(a)! Acertou!");
    }    
    static void perguntarMult2C(){
        Scanner leitor = new Scanner(System.in);
        char mult2C;
        do{
            System.out.println("\nQuestão 2: \nO dente de um filhote de dragão,"
                    + " quando visto de frente, mede 12cm de altura e 8cm de base."
                    + "\nSabendo-se que o dente tem formato triangular,"
                    + " qual a sua área?");
            System.out.println("A) 55cm²");
            System.out.println("B) 50cm²");
            System.out.println("C) 48cm²");
            System.out.println("D) 45cm²");
            mult2C = leitor.next().charAt(0);
        } while (mult2C != 'c' && mult2C != 'C'); 
         System.out.println("\nEstamos cada vez mais perto da Princesa!");
    }    
    static void perguntarMult3C(){
        Scanner leitor = new Scanner(System.in);
        char mult3C;
        do{
            System.out.println("\nQuestão 3: "
                    + "\nEm um torneio de luta entre dragões, o Multidragon "
                    + "perdedor teve uma garra e uma escama arrancadas. "
                    + "\nSabendo-se que ambas têm formato triangular, "
                    + "calcule a área de cada uma delas, para que as próteses "
                    + "possam ser preparadas:\n" 
                    + "a) A escama possui todos os lados iguais, sendo cada "
                    + "um deles correspondente a 6cm. \n" 
                    + "b) A garra possui dois lados congruentes de 12cm cada, "
                    + "e o outro lado mede 6cm."); 
            System.out.println("A) (8 raiz de 2 dm²) e (7 raiz de 15 m²)");
            System.out.println("B) (9 raiz de 3 dm²) e (9 raiz de 15 m²)");
            System.out.println("C) (10 raiz de 5 dm²) e (18 raiz de 9 m²)");
            System.out.println("D) (18 raiz de 3 dm²) e (15 raiz de 15 m²)");
            mult3C = leitor.next().charAt(0);
        } while (mult3C != 'b' && mult3C != 'B'); 
        System.out.println("\nParabéns, mais uma correta! Agora, vamos ao Enigma!");
    }    
    static void perguntarMultEnigC(){
        Scanner leitor = new Scanner(System.in);
        char multEnigC;
        do{
            System.out.println("\nEENIIIGMAAA! \nUm Multidragon, "
                    + "voando pelo Reino da Matemágica, encontrou um novo baú "
                    + "de tesouro. Mas, para conseguir abri-lo e pegar todo o "
                    + "tesouro para si, teria que resolver um problema. "
                    + "\nSendo as expressões polinomiais [f(x)= 2x² – 3x+4] "
                    + "e [h(x)= -x² + x-4], "
                    + "qual a resposta do seguinte enigma: f(x).h(x)? ");
            System.out.println("A) (-2x4ª + 5x³ - 15x² + 16x - 16)");
            System.out.println("B) (-3x4ª + 6x³ - 16x² + 19x - 18)");
            System.out.println("C) (-4x4ª + 5x³ - 15x² + 16x - 19)");
            System.out.println("D) (-2x4ª + 7x³ - 16x² + 19x - 19)");
            multEnigC = leitor.next().charAt(0);
        } while (multEnigC != 'a' && multEnigC != 'A');
        System.out.println("\nNão acredito, você conseguiu! Agora, vamos lá! "
                + "Vamos salvar a nossa Princesa!");
    }
    
    // Perguntas do Castelo da Divisão (Dividuendes)   
    static void perguntarDiv1A() {
        Scanner leitor = new Scanner(System.in);
        char div1A;
        do {
            System.out.println("\nQuestão 1: \nUm Dividuende entrou disfarçado"
                    + " na última festa de aniversário da Princesa Dezena."
                    + " Para pregar uma peça nos convidados, ele encheu garrafas"
                    + " de 5 litros com refrigerante falso (na verdade, "
                    + " eram poções do sono). \nSabendo-se que foram 315 litros"
                    + " de refrigerante falso, quantas garrafas foram necessárias?");
            System.out.println("A) 73 garrafas");
            System.out.println("B) 68 garrafas");
            System.out.println("C) 63 garrafas");
            System.out.println("D) 93 garrafas");
            div1A = leitor.next().charAt(0);
        } while (div1A != 'c' && div1A != 'C');
        System.out.println("\nÉ isso aí! Vamos nessa!");
    }
    static void perguntarDiv2A() {
        Scanner leitor = new Scanner(System.in);
        char div2A;
        do {
            System.out.println("\nQuestão 2: \nOs Dividuendes são conhecidos "
                    + "por pegarem objetos emprestados sem avisar, devolvendo-os "
                    + "de repente, depois de muito tempo. "
                    + "\nUm Dividuende é capaz de pegar até 85 objetos "
                    + "em apenas uma noite. \nQuantos duendes "
                    + "seriam necessários caso fossem 6970 objetos?");
            System.out.println("A) 84 Dividuendes");
            System.out.println("B) 72 Dividuendes");
            System.out.println("C) 98 Dividuendes");
            System.out.println("D) 82 Dividuendes");
            div2A = leitor.next().charAt(0);
        } while (div2A != 'd' && div2A != 'D');
        System.out.println("\nUau! Resposta Correta!");
    }
    static void perguntarDiv3A() {
        Scanner leitor = new Scanner(System.in);
        char div3A;
        do {
            System.out.println("\nQuestão 3: \nAo se contratar os serviços"
                    + " de um Dividuende, ele cobra R$23,00 por cada minuto"
                    + " de trabalho. \nQuanto tempo um Dividuende deverá "
                    + "trabalhar para receber R$391,00?");
            System.out.println("A) 15 minutos");
            System.out.println("B) 17 minutos");
            System.out.println("C) 19 minutos");
            System.out.println("D) 20 minutos");
            div3A = leitor.next().charAt(0);
        } while (div3A != 'b' && div3A != 'B');
        System.out.println("\nIncrível! Acertou mais uma vez!");
    }
    static void perguntarDivEnigA() {
        Scanner leitor = new Scanner(System.in);
        char divEnigA;
        do {
            System.out.println("\nENIIGMAAAA! "
                    + "\nNo último banquete realizado no Castelo da Divisão, "
                    + "os Dividuendes decidiram que todo o alimento deveria "
                    + "ser divido da seguinte maneira: o quociente seria dos "
                    + "Dividuendes e o resto seria dos outros convidados. "
                    + "\nDetermine o quociente (Q) e o resto (R) "
                    + "das seguintes divisões:\n"
                    + "a) 79 : 8\n" + "b) 57 : 8\n"
                    + "c) 3214 : 10\n" + "d) 4937 : 32\n");
            System.out.println("A) a) Q = 7, R = 7\n" + "b) Q = 6, R = 2\n"
                    + "c) Q = 321, R = 4\n" + "d) Q = 154, R = 9\n");
            System.out.println("B) a) Q = 7, R = 7\n" + "b) Q = 7, R = 2\n"
                    + "c) Q = 321, R = 4\n" + "d) Q = 155, R = 9\n");
            System.out.println("C) a) Q = 8, R = 6\n" + "b) Q = 7, R = 1\n"
                    + "c) Q = 322, R = 5\n" + "d) Q = 400, R = 9\n");
            System.out.println("D) a) Q = 9, R = 7\n" + "b) Q = 7, R = 1\n"
                    + "c) Q = 321, R = 4\n" + "d) Q = 154, R = 9\n");
            divEnigA = leitor.next().charAt(0);
        } while (divEnigA != 'd' && divEnigA != 'D');
        System.out.println("\nQue Maravilha! "
                + "Agora, estamos mais perto de salvar nossa querida Dezena!");
    }
    
    static void perguntarDiv1B(){
        Scanner leitor = new Scanner(System.in);
        char div1B;
        do{
            System.out.println("\nQuestão 1: \nUma quantidade desconhecida"
                    + " de Dividuendes  está sendo procurada por todo o Reino"
                    + " da Matemágica, por ter escondido os produtos de beleza"
                    + " da Princesa Dezena. \nSabendo-se que esse número de"
                    + " duendes, chamado de “x”, é igual a (x  –4) multiplicado"
                    + " por –3, quantos Dividuendes estão sendo procurados?"); 
            System.out.println("A) 5 duendes");
            System.out.println("B) 3 duendes");
            System.out.println("C) 4 duendes");
            System.out.println("D) 2 duendes");
            div1B = leitor.next().charAt(0);
        } while (div1B != 'b' && div1B != 'B');
        System.out.println("\nParabéns, você acertou!");
    }
    static void perguntarDiv2B(){
        Scanner leitor = new Scanner(System.in);
        char div2B;
        do{
            System.out.println("\nQuestão 2: \nNa construção de uma escola "
                    + "de magia para alunos Dividuendes, foram gastos 15 "
                    + "caminhões de 4 metros cúbicos de areia."
                    + "\nQuantos caminhões de 6 metros cúbicos "
                    + "de areia seriam necessários para fazer o mesmo trabalho?"); 
            System.out.println("A) 11 caminhões");
            System.out.println("B) 9 caminhões");
            System.out.println("C) 10 caminhões");
            System.out.println("D) 12 caminhões");
            div2B = leitor.next().charAt(0);
        } while (div2B != 'c' && div2B != 'C');
        System.out.println("\nQue maravilha! Sua resposta está correta!");
    }
    static void perguntarDiv3B(){
         Scanner leitor = new Scanner(System.in);
        char div3B;
        do{
            System.out.println("\nQuestão 3: \nNa receita de uma poção, um"
                    + " Dividuende teria que utilizar dois ingredientes secretos."
                    + "\nPara saber a quantidade de cada um deles,"
                    + " teria que resolver a seguinte equação de"
                    + " 2º grau: x² – 5x + 6 = 0. "
                    + "\nQuais as quantidades dos ingredientes?"); 
            System.out.println("A) 4 e 5");
            System.out.println("B) 3 e 4");
            System.out.println("C) 2 e 2");
            System.out.println("D) 2 e 3");
            div3B = leitor.next().charAt(0);
        } while (div3B != 'd' && div3B != 'D');
        System.out.println("\nParabéns!!!");
    }
    static void perguntarDivEnigB(){
         Scanner leitor = new Scanner(System.in);
        char divEnigB;
        do{
            System.out.println("\nENIIGMAAA! \nOs duendes da"
                    + "Dividuende Ltda. estiveram analisando a possiblidade "
                    + "de arrecadar um maior número de potes de ouro ao final "
                    + "dos arco-íris do Reino da Matemágica. \nPara a produção "
                    + "de um arco-íris, vinte máquinas são utilizadas, trabalhando "
                    + "16 horas por dia e levando 6 dias para cumprir a tarefa. "
                    + "\nQuantas máquinas serão necessárias para executar o mesmo "
                    + "serviço, se trabalharem 20 horas por dia, durante 12 dias?"); 
            System.out.println("A) 8 máquinas");
            System.out.println("B) 10 máquinas");
            System.out.println("C) 9 máquinas");
            System.out.println("D) 11 máquinas");
            divEnigB = leitor.next().charAt(0);
        } while (divEnigB != 'a' && divEnigB != 'A');
        System.out.println("\nFenomenal! "
                + "Estamos cada vez mais próximos da Princesa!");
    }
    
    static void perguntarDiv1C(){
     Scanner leitor = new Scanner(System.in);
        char div1C; 
        do{
            System.out.println("\nQuestão 1: \nUm Dividuende quer fazer 5 montes "
                    + "iguais com as 42 moedas de ouro que recebeu dos seus "
                    + "clientes. \nQuantas moedas ele deverá colocar em "
                    + "cada monte? E quantas sobrarão?");
            System.out.println("A) 2 moedas, sobrando 20");
            System.out.println("B) 8 moedas, sobrando 4");
            System.out.println("C) 8 moedas, sobrando 2");
            System.out.println("D) 17 moedas, sobrando 0");
            div1C = leitor.next().charAt(0);
        } while (div1C != 'c' && div1C != 'C'); 
        System.out.println("\nAcertou! Vamos lá!");
    }
    static void perguntarDiv2C(){
        Scanner leitor = new Scanner(System.in);
        char div2C; 
        do{
            System.out.println("\nQuestão 2: \nUm Dividuende muito esperto "
                    + "escreveu um contrato de prestação de seus serviços "
                    + "para seu novo cliente Somatroll. "
                    + "\nCaso o cliente assinasse o contrato, ele deveria "
                    + "realizar pagamentos mensais ao Dividuende de acordo com "
                    + "o valor da seguinte expressão, correspondente a anos: "
                    + "11/10 : (1/5 + 1/4 : 3/2). \nO Somatroll, percebendo que "
                    + "a expressão estava repleta de frações, imaginou que "
                    + "o resultado seria bem pequeno e assinou o contrato. "
                    + "\nEm quantos anos o cliente deverá realizar pagamentos "
                    + "ao Dividuende?");
            System.out.println("A) 3");
            System.out.println("B) 2");
            System.out.println("C) 1");
            System.out.println("D) 2/5");
            div2C = leitor.next().charAt(0);
        } while (div2C != 'a' && div2C != 'A');   
        System.out.println("\nEba! Agora, estamos muito perto!");
    }
    static void perguntarDiv3C(){
        Scanner leitor = new Scanner(System.in);
        char div3C; 
        do{
            System.out.println("\nQuestão 3: \nNa compra de um novo cofre para "
                    + "guardar todo o seu ouro, um Dividuende parcelou "
                    + "o pagamento em 12 vezes sem juros. "
                    + "\nFicando desempregado, seu amigo Multidragon "
                    + "comprometeu-se a ajudar e pagar metade do valor "
                    + "das parcelas. \nSabendo-se que o valor do cofre foi de "
                    + "R$1500,00, quanto o Dividuende pagou por mês?");
            System.out.println("A) 61,90");
            System.out.println("B) 64,10");
            System.out.println("C) 63,20");
            System.out.println("D) 62,50");
            div3C = leitor.next().charAt(0);
        } while (div3C != 'd' && div3C != 'D');   
         System.out.println("\nVocê acertou! "
                 + "Mas cuidado com o Enigma que está por vir!");
    }
    static void perguntarDivEnigC(){
        Scanner leitor = new Scanner(System.in);
        char divEnigC; 
        do{
            System.out.println("\nENIIIGMAAAAA! \nEm certo concurso"
                    + " para a Dividuente Ltda., inscreveram-se 192 duendes, "
                    + " sendo a terça parte, machos. Desses, apenas a quarta "
                    + " parte passou. "
                    + "\nO número de machos que passaram no concurso foi:");
            System.out.println("A) 15");
            System.out.println("B) 16");
            System.out.println("C) 19");
            System.out.println("D) 18");
            divEnigC = leitor.next().charAt(0);
        } while (divEnigC != 'b' && divEnigC != 'B'); 
        System.out.println("\nGraças a sua ajuda, a Princesa Dezena agora"
                        + " tem esperanças! Obrigada! Você acertou!");
    }
    
    // Enigmas do Problemago
    static void chegarProb(){
        System.out.println("\nMuito bem! Você conseguiu chegar à Torre "
                + "do Problemago! \nAqui, ele lançará a você um enigma "
                + "contendo o código de quatro números que libertará a "
                + "Princesa Dezena. \n\nO formato da senha é o seguinte: "
                + "X1 X2 X3 X4 \n\nBoa sorte!");
    }
    static void perguntarProbA(){
        System.out.println("\nPROBLEMÃO DO PROBLEMAGO: "
                + "\n\nO Problemago adora comer cerejas. Mas, desde que "
                + "descobriu que elas fazem mal a ele, resolveu parar. "
                + "\nNormalmente, ele comia 45 cerejas em um dia. "
                + "\nPara reduzir o consumo, decidiu dividir esse número "
                + "em quantidades iguais pela semana. "
                + "\nE então, Problemago descobriu uma magia para multiplicar "
                + "as cerejas restantes pela quantidade de dias da próxima "
                + "semana. \n\nSabendo-se disso, calcule: "
                + "\n- quantas cerejas Problemago costumava comer;" 
                + "\n- quantas cerejas ele passou a comer por dia;" 
                + "\n- quantas sobraram, e" 
                + "\n- quantas cerejas ele conseguiu criar, magicamente, "
                + "para a semana seguinte.");
    }
    static void perguntarProbB(){
        System.out.println("\nPROBLEMÃO DO PROBLEMAGO: "
                + "\n\nO Problemago adora comer cerejas. Mas, desde que "
                + "descobriu que elas fazem mal a ele, resolveu parar. "
                + "\nNormalmente, ele comia 27 cerejas em um dia. "
                + "\nPara reduzir o consumo, Problemago decidiu comer 2/3 "
                + "de cada cereja. \nMas, acabou descobrindo um feitiço capaz "
                + "de gerar novas cerejas inteiras, cada uma delas formada por "
                + "três dos pedacinhos restantes. \nDe cada uma delas, ele comeu "
                + "2/3, usou sua magia novamente, e gerou outras novas cerejas. "
                + "\nE realizou o processo mais uma vez." 
                + "\n\nSabendo-se disso, calcule:"
                + "\n- quantos pedaços restaram da primeira vez;" 
                + "\n- quantas novas cerejas esses pedaços geraram;" 
                + "\n- quantas novas cerejas os pedaços formaram depois da "
                + "segunda magia, e" 
                + "\n- quantas novas cerejas foram criadas depois da terceira "
                + "magia.");
    }
    static void perguntarProbC(){
        System.out.println("\nPROBLEMÃO DO PROBLEMAGO: "
                + "\n\nO Problemago adora comer cerejas. Mas, desde que "
                + "descobriu que elas fazem mal a ele, resolveu parar. "
                + "\nEntão, decidiu que comeria as cerejas de acordo com "
                + "os resultados de x e de Delta da seguinte equação do "
                + "2º grau: x² - x - 6 = 0. "
                + "\n\nSabendo-se disso, encontre os seguintes valores:"
                + "\n- quantidade de cerejas que ele comia por dia, "
                + "determinado por Delta;" 
                + "\n- número de cerejas que ele passou a comer por dia, "
                + "determinado por x';" 
                + "\n- número de dias da semana que ele ficou sem comer cerejas, "
                + "determinado por x'', e" 
                + "\n- quantidade de cerejas que ele comeu em uma semana, "
                + "de acordo com os resultados encontrados anteriormente.");
    }
    static void pedirSenha(int[] corretas, int[] respostas){
        Scanner leitor = new Scanner(System.in);
        System.out.println("\nAgora, digite o valor correspondente a cada "
                + "posição da senha:");
        for (int i = 0; i < corretas.length; i++){
            System.out.print("X" + (i + 1) + ": ");
            respostas[i] = leitor.nextInt(); 
        }
    }
    static boolean verificarSenha(int[] corretas, int[] respostas){
        for (int i = 0; i < corretas.length; i++){
            if (respostas[i] != corretas[i]){
                return false;
            }    
        }
        return true;
    }
      
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        char serie;
        char sair;
        int[] corretasA = {45, 6, 3, 21};
        int[] corretasB = {27, 9, 3, 1};
        int[] corretasC = {25, 3, -2, 15};        
        int[] respostas = new int [corretasA.length];
        boolean res = true;
        
        // Apresentação do jogo e nome do usuário
        apresentarTitulo();
        System.out.println("\nSOCORRO! SOCORRO! "
            + "\nEu sou a Fada Delta e nós precisamos da sua ajuda! "
            + "\nO Reino da Matemágica está em perigo! "
            + "Nossa amada Princesa Dezena foi capturada pelo malvado "
            + "Problemago. "
            + "\nE será somente com a sua ajuda que conseguiremos resolver "
            + "os enigmas deixados por ele e salvá-la. "
            + "\n\nComo devemos chamá-lo(a)? ");
        nome = leitor.next();

        // Série do usuário        
        System.out.println("\nQue belo nome, " + nome + "! "
            + "Agora, para que nós possamos levá-lo(a) ao nosso Reino, "
            + "só precisamos de mais uma informação: "
            + "em qual série escolar você está?");
        System.out.println("A) 6º - 7ºano");
        System.out.println("B) 8º - 9ºano");
        System.out.println("C) 1º - 3ºano do Ensino Médio");
        serie = leitor.next().charAt(0);

        // Início do jogo        
        switch (serie) {
            case 'A':
            case 'a':
                System.out.println("\nSeremos eternamente gratos por sua ajuda, " 
                        + nome + "! \nAgora que você chegou ao Reino da Matemágica, "
                        + "mostre seu conhecimento passando pelos "
                        + "Castelos das Operações e resgatando a Princesa Dezena. "
                        + "\nA partir deste instante, eu irei apenas guiá-lo(a) "
                        + "pelos castelos, sendo você a única pessoa capaz de "
                        + "enfrentar os problemas de matemática que encontrará "
                        + "pelo caminho. "
                        + "\nBoa jornada, " + nome + "! Contamos com você!");
                
                // Perguntas do Castelo da Adição 6º - 7ºano
                chegarAd();
                apresentarSomatroll();
                perguntarAd1A();
                perguntarAd2A();
                perguntarAd3A();
                perguntarAdEnigA();
                System.out.println("\nAgora, vamos em direção ao próximo Castelo.");

                // Perguntas do Castelo da Subtração 6º - 7ºano
                chegarSub();
                apresentarSubtraelfo();
                perguntarSub1A();
                perguntarSub2A();
                perguntarSub3A();
                perguntarSubEnigA();
                System.out.println("\nVamos seguir para mais um Castelo...");

                // Perguntas do Castelo da Multiplicação 6º - 7ºano
                chegarMult();
                apresentarMultidragon();
                perguntarMult1A();
                perguntarMult2A();
                perguntarMult3A();
                perguntarMultEnigA();
                System.out.println("\nEm direção ao último Castelo das Operações!");

                // Perguntas do Castelo da Divisão 6º - 7ºano
                chegarDiv();
                apresentarDividuende();
                perguntarDiv1A();
                perguntarDiv2A();
                perguntarDiv3A();
                perguntarDivEnigA();
                
                // Pergunta final: Problemago
                chegarProb();
                apresentarProblemago();
                perguntarProbA();
                do{
                    pedirSenha(corretasA, respostas);
                    res = verificarSenha(corretasA, respostas);
                    if (res == true){
                        System.out.println("Resposta correta!");
                    }
                    else{
                        System.out.println("Resposta incorreta. Tente novamente.");
                    }
                } while(res == false);
                break;
            case 'B':
            case 'b':
                System.out.println("\nSeremos eternamente gratos por sua ajuda, " 
                        + nome + "! \nAgora que você chegou ao Reino da Matemágica, "
                        + "mostre seu conhecimento passando pelos "
                        + "Castelos das Operações e resgatando a Princesa Dezena. "
                        + "\nA partir deste instante, eu irei apenas guiá-lo(a) "
                        + "pelos castelos, sendo você a única pessoa capaz de "
                        + "enfrentar os problemas de matemática que encontrará "
                        + "pelo caminho. "
                        + "\nBoa jornada, " + nome + "! Contamos com você!");
                  
                // Perguntas do Castelo da Adição 6º - 7º
                chegarAd();
                apresentarSomatroll();
                perguntarAd1A();
                perguntarAd2A();
                perguntarAd3A();
                perguntarAdEnigA();
                System.out.println("\nVocê está indo muito bem, " + nome + "! "
                        + "Mas, agora, ficará um pouco mais difícil...");
                // Perguntas do Castelo da Adição 8º - 9º
                perguntarAd1B();
                perguntarAd2B();
                perguntarAd3B();
                perguntarAdEnigB();
                System.out.println("\nAgora, vamos em direção ao próximo Castelo.");
                
                // Perguntas do Castelo da Subtração 6º - 7º
                chegarSub();
                apresentarSubtraelfo();
                perguntarSub1A();
                perguntarSub2A();
                perguntarSub3A();
                perguntarSubEnigA();
                System.out.println("\nOlha só onde nós chegamos, " + nome + "! " 
                        + "A dificuldade irá aumentar um pouco, mas não desista!");
                // Perguntas do Castelo da Subtração 8º - 9º
                perguntarSub1B();                
                perguntarSub2B();               
                perguntarSub3B();                
                perguntarSubEnigB();
                System.out.println("\nVamos seguir para mais um Castelo...");                
                
                // Perguntas do Castelo da Multiplicação 6º - 7º
                chegarMult();
                apresentarMultidragon();
                perguntarMult1A();
                perguntarMult2A();
                perguntarMult3A();
                perguntarMultEnigA();
                System.out.println("\nAos poucos, nós chegaremos lá, " + nome + "!"
                        + "\nAs próximas questões serão um pouco mais "
                        + "complicadas, mas nós acreditamos em você!");                
                // Perguntas do Castelo da Multiplicação 8º - 9º
                perguntarMult1B();
                perguntarMult2B();
                perguntarMult3B();
                perguntarMultEnigB();
                System.out.println("\nEm direção ao último Castelo das Operações!");
                
                // Perguntas do Castelo da Divisão 6º - 7º
                chegarDiv();
                apresentarDividuende();
                perguntarDiv1A();
                perguntarDiv2A();
                perguntarDiv3A();
                perguntarDivEnigA();
                System.out.println("\nAvançamos mais um nível, " + nome + "!");
                // Perguntas do Castelo da Divisão 8º - 9º
                perguntarDiv1B();
                perguntarDiv2B();
                perguntarDiv3B();
                perguntarDivEnigB();

                // Pergunta final: Problemago
                chegarProb();
                apresentarProblemago();
                perguntarProbB();
                do{
                    pedirSenha(corretasB, respostas);
                    res = verificarSenha(corretasB, respostas);
                    if (res == true){
                        System.out.println("Resposta correta!");
                    }
                    else{
                        System.out.println("Resposta incorreta. Tente novamente.");
                    }
                } while(res == false);
                break;
            case 'C':
            case 'c':
                  System.out.println("\nSeremos eternamente gratos por sua ajuda, " 
                        + nome + "! \nAgora que você chegou ao Reino da Matemágica, "
                        + "mostre seu conhecimento passando pelos "
                        + "Castelos das Operações e resgatando a Princesa Dezena. "
                        + "\nA partir deste instante, eu irei apenas guiá-lo(a) "
                        + "pelos castelos, sendo você a única pessoa capaz de "
                        + "enfrentar os problemas de matemática que encontrará "
                        + "pelo caminho. "
                        + "\nBoa jornada, " + nome + "! Contamos com você!");
                
                  // Perguntas do Castelo da Adição 6º - 7º
                chegarAd();
                apresentarSomatroll();
                perguntarAd1A();
                perguntarAd2A();
                perguntarAd3A();
                perguntarAdEnigA();
                System.out.println("\nVocê está indo muito bem! "
                        + "Mas, agora, ficará um pouco mais difícil...");
                // Perguntas do Castelo da Adição 8º - 9º
                perguntarAd1B();
                perguntarAd2B();
                perguntarAd3B();
                perguntarAdEnigB();
                System.out.println("\nSubimos de nível, " + nome + "!");                
                // Perguntas do Castelo da Adição 1º - 3º
                perguntarAd1C();
                perguntarAd2C();
                perguntarAd3C();
                perguntarAdEnigC();
                System.out.println("\nAgora, vamos em direção ao próximo Castelo.");
                
                // Perguntas do Castelo da Subtração 6º - 7º
                chegarSub();
                apresentarSubtraelfo();
                perguntarSub1A();
                perguntarSub2A();
                perguntarSub3A();
                perguntarSubEnigA();
                System.out.println("\nOlha só onde nós chegamos, " + nome + "! " 
                        + "A dificuldade irá aumentar um pouco, mas não desista!");
                // Perguntas do Castelo da Subtração 8º - 9º
                perguntarSub1B();                
                perguntarSub2B();               
                perguntarSub3B();                
                perguntarSubEnigB();
                System.out.println("Agora, as perguntas serão mais complicadas, " 
                        + nome + "... Prepare-se!");
                // Perguntas do Castelo da Subtração 1º - 3º
                perguntarSub1C();
                perguntarSub2C();
                perguntarSub3C();
                perguntarSubEnigC();
                System.out.println("\nVamos seguir para mais um Castelo...");
                
                // Perguntas do Castelo da Multiplicação 6º - 7º
                chegarMult();
                apresentarMultidragon();
                perguntarMult1A();
                perguntarMult2A();
                perguntarMult3A();
                perguntarMultEnigA();
                System.out.println("\nAos poucos, nós chegaremos lá, " + nome + "!"
                        + "\nAs próximas questões serão um pouco mais "
                        + "complicadas, mas nós acreditamos em você!");
                // Perguntas do Castelo da Divisão 8º - 9º
                perguntarMult1B();
                perguntarMult2B();
                perguntarMult3B();
                perguntarMultEnigB();
                System.out.println("Preparado(a) para subir de nível? Vamos lá, " 
                        + nome + "!");
                // Perguntas do Castelo da Multiplicação 1º - 3º
                perguntarMult1C();
                perguntarMult2C();
                perguntarMult3C();
                perguntarMultEnigC();
                System.out.println("\nEm direção ao último Castelo das Operações!");
                
                // Perguntas do Castelo da Divisão 6º - 7º
                chegarDiv();
                apresentarDividuende();
                perguntarDiv1A();
                perguntarDiv2A();
                perguntarDiv3A();
                perguntarDivEnigA();
                System.out.println("\nAvançamos mais um nível, " + nome + "!");
                // Perguntas do Castelo da Divisão 8º - 9º
                perguntarDiv1B();
                perguntarDiv2B();
                perguntarDiv3B();
                perguntarDivEnigB();
                System.out.println("Temos apenas mais um nível adiante, " 
                        + nome + ". Estou certa de que conseguiremos avançar!");
                // Perguntas do Castelo da Divisão 1º - 3º
                perguntarDiv1C();
                perguntarDiv2C();
                perguntarDiv3C();
                perguntarDivEnigC();
                
                // Pergunta final: Problemago
                chegarProb();
                apresentarProblemago();
                perguntarProbC();
                do{
                    pedirSenha(corretasC, respostas);
                    res = verificarSenha(corretasC, respostas);
                    if (res == true){
                        System.out.println("Resposta correta!");
                    }
                    else{
                        System.out.println("Resposta incorreta. Tente novamente.");
                    }
                } while(res == false);
                break;
        }
        
        // Final: Princesa Dezena
        System.out.println("\nFinalmente! Conseguimos libertar a Princesa "
                + "Dezena!");
        apresentarPrincesa();
        System.out.println("\n\n- " + nome + ", você foi incrível! O seu "
                + "conhecimento nos ajudou a derrotar o Problemago e nosso "
                + "Reino voltará a ser feliz! \nAgora, a Fada Delta o(a) "
                + "acompanhará no retorno ao seu mundo. Mas você será sempre "
                + "bem-vindo(a) no Reino da Matemágica!\n\n\n");
        apresentarFogos();
        System.out.println("Sair do jogo? ");
        System.out.println("A) Sim");
        System.out.println("B) Não");
        sair = leitor.next().charAt(0);

    }

}