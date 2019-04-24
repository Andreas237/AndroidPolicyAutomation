.class public Lo/cnk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(J)I
    .locals 6

    .line 658
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 659
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 660
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 661
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 662
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 663
    mul-int/lit16 v0, v3, 0x2710

    mul-int/lit8 v1, v4, 0x64

    add-int/2addr v0, v1

    add-int/2addr v0, v5

    return v0
.end method

.method public static b(JI)I
    .locals 3

    .line 863
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 864
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 865
    neg-int v0, p2

    const/4 v1, 0x6

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 866
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    return v0
.end method

.method public static b(I)J
    .locals 3

    .line 670
    const v0, 0x989680

    if-lt p0, v0, :cond_0

    const v0, 0x5f5e100

    if-le p0, v0, :cond_1

    .line 671
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0

    .line 674
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyyMMdd"

    invoke-static {v0, v1}, Lo/cnk;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 675
    :catch_0
    move-exception v2

    .line 676
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static b(J)J
    .locals 3

    .line 923
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 924
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 925
    const/4 v0, 0x5

    const/4 v1, -0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 926
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 927
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 928
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 929
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 930
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 784
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 786
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 787
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v0, "Z"

    invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 788
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 792
    :cond_1
    return-object p0
.end method

.method public static c(J)I
    .locals 6

    .line 685
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 686
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    .line 688
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 690
    :cond_0
    const/4 v0, 0x5

    const/4 v1, -0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 691
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 692
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 693
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 694
    mul-int/lit16 v0, v3, 0x2710

    mul-int/lit8 v1, v4, 0x64

    add-int/2addr v0, v1

    add-int/2addr v0, v5

    return v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 882
    new-instance v4, Ljava/text/SimpleDateFormat;

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v4, p2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 883
    invoke-virtual {v4, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    .line 884
    invoke-virtual {v4, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 886
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-double v0, v0

    const-wide v2, 0x4194997000000000L    # 8.64E7

    div-double v7, v0, v2

    .line 887
    double-to-int v0, v7

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static d(IILjava/lang/String;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 874
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lo/cnk;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static d(J)J
    .locals 3

    .line 896
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 897
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 898
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 899
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 900
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 901
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 902
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 151
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 153
    const/4 v0, 0x0

    return-object v0

    .line 155
    :cond_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v1, p1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 156
    invoke-virtual {v1, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 283
    new-instance v1, Ljava/text/SimpleDateFormat;

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v1, p1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 284
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 285
    invoke-virtual {v1, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static e(J)J
    .locals 3

    .line 909
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 910
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 911
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 912
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 913
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 914
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 915
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 916
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public static f(J)J
    .locals 3

    .line 976
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 977
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 978
    const/4 v0, 0x5

    const/4 v1, -0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 979
    const/16 v0, 0xb

    const/16 v1, 0x14

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 980
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 981
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 982
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 983
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public static g(J)J
    .locals 3

    .line 990
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 991
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 992
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 993
    const/16 v0, 0xb

    const/16 v1, 0x14

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 994
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 995
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 996
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 997
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public static h(J)J
    .locals 2

    .line 954
    const-wide/32 v0, 0xea60

    rem-long v0, p0, v0

    sub-long v0, p0, v0

    return-wide v0
.end method

.method public static i(J)J
    .locals 3

    .line 939
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 940
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 941
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 942
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 943
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 944
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 945
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public static k(J)J
    .locals 3

    .line 1006
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 1007
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 1008
    const/16 v0, 0xb

    const/16 v1, 0x14

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1009
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1010
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1011
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1012
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public static l(J)J
    .locals 4

    .line 1064
    const-wide/16 v0, 0x3e8

    div-long v0, p0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    return-wide v0
.end method

.method public static m(J)J
    .locals 4

    .line 1033
    invoke-static {p0, p1}, Lo/cnk;->k(J)J

    move-result-wide v2

    .line 1034
    cmp-long v0, p0, v2

    if-ltz v0, :cond_0

    .line 1035
    return-wide v2

    .line 1037
    :cond_0
    invoke-static {p0, p1}, Lo/cnk;->f(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static n(J)J
    .locals 2

    .line 1021
    invoke-static {p0, p1}, Lo/cnk;->k(J)J

    move-result-wide v0

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    .line 1022
    invoke-static {p0, p1}, Lo/cnk;->d(J)J

    move-result-wide v0

    return-wide v0

    .line 1024
    :cond_0
    invoke-static {p0, p1}, Lo/cnk;->e(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static o(J)Ljava/lang/String;
    .locals 2

    .line 1057
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static p(J)J
    .locals 6

    .line 1045
    invoke-static {p0, p1}, Lo/cnk;->k(J)J

    move-result-wide v4

    .line 1046
    cmp-long v0, p0, v4

    if-gez v0, :cond_0

    .line 1047
    const-wide/16 v0, 0x1

    sub-long v0, v4, v0

    return-wide v0

    .line 1049
    :cond_0
    invoke-static {p0, p1}, Lo/cnk;->g(J)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public static q(J)J
    .locals 4

    .line 1071
    const-wide/16 v0, 0x3e8

    div-long v0, p0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    add-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    return-wide v0
.end method
