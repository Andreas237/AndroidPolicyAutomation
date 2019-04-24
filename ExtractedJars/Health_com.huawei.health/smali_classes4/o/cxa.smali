.class public Lo/cxa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 8
    const-class v0, Lo/cxa;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/cxa;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Landroid/content/Context;)Z
    .locals 2

    .line 800
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 801
    const/4 v0, 0x0

    return v0

    .line 803
    :cond_0
    const-string v0, "el"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 804
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 803
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 805
    const/4 v0, 0x1

    return v0

    .line 807
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static B(Landroid/content/Context;)Z
    .locals 2

    .line 767
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 768
    const/4 v0, 0x0

    return v0

    .line 770
    :cond_0
    const-string v0, "es"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 771
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 770
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 772
    const/4 v0, 0x1

    return v0

    .line 774
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static C(Landroid/content/Context;)Z
    .locals 2

    .line 778
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 779
    const/4 v0, 0x0

    return v0

    .line 781
    :cond_0
    const-string v0, "tl"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 782
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 781
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 783
    const/4 v0, 0x1

    return v0

    .line 785
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static D(Landroid/content/Context;)Z
    .locals 2

    .line 789
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 790
    const/4 v0, 0x0

    return v0

    .line 792
    :cond_0
    const-string v0, "gl"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 793
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 792
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 794
    const/4 v0, 0x1

    return v0

    .line 796
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static E(Landroid/content/Context;)Z
    .locals 2

    .line 855
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 856
    const/4 v0, 0x0

    return v0

    .line 858
    :cond_0
    const-string v0, "mi"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 859
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 858
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 860
    const/4 v0, 0x1

    return v0

    .line 862
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static F(Landroid/content/Context;)Z
    .locals 2

    .line 811
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 812
    const/4 v0, 0x0

    return v0

    .line 814
    :cond_0
    const-string v0, "in"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 815
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 814
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 816
    const/4 v0, 0x1

    return v0

    .line 818
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static G(Landroid/content/Context;)Z
    .locals 2

    .line 822
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 823
    const/4 v0, 0x0

    return v0

    .line 825
    :cond_0
    const-string v0, "it"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 826
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 825
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 827
    const/4 v0, 0x1

    return v0

    .line 829
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static H(Landroid/content/Context;)Z
    .locals 2

    .line 844
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 845
    const/4 v0, 0x0

    return v0

    .line 847
    :cond_0
    const-string v0, "ml"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 848
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 847
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 849
    const/4 v0, 0x1

    return v0

    .line 851
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static I(Landroid/content/Context;)Z
    .locals 2

    .line 833
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 834
    const/4 v0, 0x0

    return v0

    .line 836
    :cond_0
    const-string v0, "es-rUS"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 837
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 836
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 838
    const/4 v0, 0x1

    return v0

    .line 840
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static J(Landroid/content/Context;)Z
    .locals 2

    .line 899
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 900
    const/4 v0, 0x0

    return v0

    .line 902
    :cond_0
    const-string v0, "sr"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 903
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 902
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 904
    const/4 v0, 0x1

    return v0

    .line 906
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static K(Landroid/content/Context;)Z
    .locals 2

    .line 910
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 911
    const/4 v0, 0x0

    return v0

    .line 913
    :cond_0
    const-string v0, "ta"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 914
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 913
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 915
    const/4 v0, 0x1

    return v0

    .line 917
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static L(Landroid/content/Context;)Z
    .locals 2

    .line 888
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 889
    const/4 v0, 0x0

    return v0

    .line 891
    :cond_0
    const-string v0, "kk"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 892
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 891
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 893
    const/4 v0, 0x1

    return v0

    .line 895
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static M(Landroid/content/Context;)Z
    .locals 2

    .line 877
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 878
    const/4 v0, 0x0

    return v0

    .line 880
    :cond_0
    const-string v0, "or"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 881
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 880
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 882
    const/4 v0, 0x1

    return v0

    .line 884
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static N(Landroid/content/Context;)Z
    .locals 2

    .line 866
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 867
    const/4 v0, 0x0

    return v0

    .line 869
    :cond_0
    const-string v0, "mn"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 870
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 869
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 871
    const/4 v0, 0x1

    return v0

    .line 873
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static O(Landroid/content/Context;)Z
    .locals 2

    .line 943
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 944
    const/4 v0, 0x0

    return v0

    .line 946
    :cond_0
    const-string v0, "tr"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 947
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 946
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 948
    const/4 v0, 0x1

    return v0

    .line 950
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static P(Landroid/content/Context;)Z
    .locals 2

    .line 932
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 933
    const/4 v0, 0x0

    return v0

    .line 935
    :cond_0
    const-string v0, "uz"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 936
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 935
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 937
    const/4 v0, 0x1

    return v0

    .line 939
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static Q(Landroid/content/Context;)Z
    .locals 4

    .line 955
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 956
    sget-object v0, Lo/cxa;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isChinese() context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 957
    const/4 v0, 0x0

    return v0

    .line 960
    :cond_0
    const-string v0, "zh"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 961
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 960
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 962
    const/4 v0, 0x1

    return v0

    .line 964
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static R(Landroid/content/Context;)Z
    .locals 2

    .line 921
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 922
    const/4 v0, 0x0

    return v0

    .line 924
    :cond_0
    const-string v0, "te"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 925
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 924
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 926
    const/4 v0, 0x1

    return v0

    .line 928
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static S(Landroid/content/Context;)Z
    .locals 2

    .line 969
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 970
    const/4 v0, 0x0

    return v0

    .line 972
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 973
    const-string v0, "ar"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "as"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "bn"

    .line 974
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "fa"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ne"

    .line 975
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ur"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 976
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 978
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static W(Landroid/content/Context;)Z
    .locals 2

    .line 983
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 984
    const/4 v0, 0x0

    return v0

    .line 986
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 987
    const-string v0, "uz"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "uk"

    .line 988
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "sl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 989
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 991
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 4

    .line 294
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 295
    sget-object v0, Lo/cxa;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeutschLanguage() context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    const/4 v0, 0x0

    return v0

    .line 299
    :cond_0
    const-string v0, "de"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 300
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 299
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 301
    const/4 v0, 0x1

    return v0

    .line 303
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 4

    .line 226
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 227
    sget-object v0, Lo/cxa;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isChineseSimplified() context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    const/4 v0, 0x0

    return v0

    .line 231
    :cond_0
    const-string v0, "zh"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 232
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 231
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "TW"

    .line 233
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 234
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 235
    const/4 v0, 0x1

    return v0

    .line 237
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 4

    .line 213
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 214
    sget-object v0, Lo/cxa;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isEnglish() context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    const/4 v0, 0x0

    return v0

    .line 218
    :cond_0
    const-string v0, "en"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 219
    const/4 v0, 0x1

    return v0

    .line 221
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 4

    .line 255
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 256
    sget-object v0, Lo/cxa;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRTLLanguage() context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    const/4 v0, 0x0

    return v0

    .line 260
    :cond_0
    const-string v0, "ar"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 261
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 260
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "iw"

    .line 262
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 263
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 262
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "fa"

    .line 264
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 265
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 264
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ur"

    .line 266
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 267
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 268
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 270
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 4

    .line 197
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 198
    sget-object v0, Lo/cxa;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isChineseSimplified() context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    const/4 v0, 0x0

    return v0

    .line 202
    :cond_0
    const-string v0, "zh"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 203
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "CN"

    .line 204
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 205
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 206
    const/4 v0, 0x1

    return v0

    .line 208
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static f(Landroid/content/Context;)Z
    .locals 2

    .line 319
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 320
    const/4 v0, 0x0

    return v0

    .line 323
    :cond_0
    const-string v0, "et"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 324
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 323
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 325
    const/4 v0, 0x1

    return v0

    .line 327
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static g(Landroid/content/Context;)Z
    .locals 2

    .line 307
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 308
    const/4 v0, 0x0

    return v0

    .line 311
    :cond_0
    const-string v0, "fr"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 312
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 311
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    const/4 v0, 0x1

    return v0

    .line 315
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static h(Landroid/content/Context;)Z
    .locals 2

    .line 379
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 380
    const/4 v0, 0x0

    return v0

    .line 383
    :cond_0
    const-string v0, "da"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 384
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 383
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 385
    const/4 v0, 0x1

    return v0

    .line 387
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static i(Landroid/content/Context;)Z
    .locals 2

    .line 331
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 332
    const/4 v0, 0x0

    return v0

    .line 335
    :cond_0
    const-string v0, "eu"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 336
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 337
    const/4 v0, 0x1

    return v0

    .line 339
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static j(Landroid/content/Context;)Z
    .locals 2

    .line 756
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 757
    const/4 v0, 0x0

    return v0

    .line 759
    :cond_0
    const-string v0, "et"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 760
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 759
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 761
    const/4 v0, 0x1

    return v0

    .line 763
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static k(Landroid/content/Context;)Z
    .locals 2

    .line 367
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 368
    const/4 v0, 0x0

    return v0

    .line 371
    :cond_0
    const-string v0, "pl"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 372
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 371
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 373
    const/4 v0, 0x1

    return v0

    .line 375
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static l(Landroid/content/Context;)Z
    .locals 2

    .line 391
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 392
    const/4 v0, 0x0

    return v0

    .line 395
    :cond_0
    const-string v0, "ru"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 396
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 395
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 397
    const/4 v0, 0x1

    return v0

    .line 399
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static m(Landroid/content/Context;)Z
    .locals 2

    .line 463
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 464
    const/4 v0, 0x0

    return v0

    .line 467
    :cond_0
    const-string v0, "uk"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 468
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 467
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 469
    const/4 v0, 0x1

    return v0

    .line 471
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static n(Landroid/content/Context;)Z
    .locals 2

    .line 439
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 440
    const/4 v0, 0x0

    return v0

    .line 443
    :cond_0
    const-string v0, "pt"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 444
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 443
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 445
    const/4 v0, 0x1

    return v0

    .line 447
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static o(Landroid/content/Context;)Z
    .locals 2

    .line 475
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 476
    const/4 v0, 0x0

    return v0

    .line 479
    :cond_0
    const-string v0, "es"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 480
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 479
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 481
    const/4 v0, 0x1

    return v0

    .line 483
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static p(Landroid/content/Context;)Z
    .locals 2

    .line 415
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 416
    const/4 v0, 0x0

    return v0

    .line 419
    :cond_0
    const-string v0, "ka"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 420
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 419
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 421
    const/4 v0, 0x1

    return v0

    .line 423
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static q(Landroid/content/Context;)Z
    .locals 2

    .line 523
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 524
    const/4 v0, 0x0

    return v0

    .line 527
    :cond_0
    const-string v0, "hi"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 528
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 527
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 529
    const/4 v0, 0x1

    return v0

    .line 531
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static r(Landroid/content/Context;)Z
    .locals 2

    .line 619
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 620
    const/4 v0, 0x0

    return v0

    .line 623
    :cond_0
    const-string v0, "nl"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 624
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 623
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 625
    const/4 v0, 0x1

    return v0

    .line 627
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static s(Landroid/content/Context;)Z
    .locals 4

    .line 607
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 608
    sget-object v0, Lo/cxa;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isArabra() context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 609
    const/4 v0, 0x0

    return v0

    .line 611
    :cond_0
    const-string v0, "ar"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 612
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 611
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 613
    const/4 v0, 0x1

    return v0

    .line 615
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static t(Landroid/content/Context;)Z
    .locals 2

    .line 583
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 584
    const/4 v0, 0x0

    return v0

    .line 587
    :cond_0
    const-string v0, "my"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 588
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 587
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 589
    const/4 v0, 0x1

    return v0

    .line 591
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static u(Landroid/content/Context;)Z
    .locals 2

    .line 559
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 560
    const/4 v0, 0x0

    return v0

    .line 563
    :cond_0
    const-string v0, "si"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 564
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 563
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 565
    const/4 v0, 0x1

    return v0

    .line 567
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static v(Landroid/content/Context;)Z
    .locals 2

    .line 711
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 712
    const/4 v0, 0x0

    return v0

    .line 714
    :cond_0
    const-string v0, "be"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 715
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 714
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 716
    const/4 v0, 0x1

    return v0

    .line 718
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static w(Landroid/content/Context;)Z
    .locals 2

    .line 722
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 723
    const/4 v0, 0x0

    return v0

    .line 725
    :cond_0
    const-string v0, "bn"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 726
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 725
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 727
    const/4 v0, 0x1

    return v0

    .line 729
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static x(Landroid/content/Context;)Z
    .locals 2

    .line 631
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 632
    const/4 v0, 0x0

    return v0

    .line 635
    :cond_0
    const-string v0, "ro"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 636
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 635
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 637
    const/4 v0, 0x1

    return v0

    .line 639
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static y(Landroid/content/Context;)Z
    .locals 2

    .line 733
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 734
    const/4 v0, 0x0

    return v0

    .line 736
    :cond_0
    const-string v0, "ca"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 737
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 736
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 738
    const/4 v0, 0x1

    return v0

    .line 740
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static z(Landroid/content/Context;)Z
    .locals 2

    .line 745
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 746
    const/4 v0, 0x0

    return v0

    .line 748
    :cond_0
    const-string v0, "cs"

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 749
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 748
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 750
    const/4 v0, 0x1

    return v0

    .line 752
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
