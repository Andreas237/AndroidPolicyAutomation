.class public Lo/adl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:[B

.field static d:Ljava/lang/String;

.field static e:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const/4 v0, 0x0

    sput-object v0, Lo/adl;->e:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()[B
    .locals 15

    .line 635
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send sync system time cmd."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 636
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 637
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 638
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v6, v0, 0x1

    .line 639
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v7

    .line 640
    const/16 v0, 0xb

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 641
    const/16 v0, 0xc

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v9

    .line 642
    const/16 v0, 0xd

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v10

    .line 645
    const/4 v0, 0x7

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v11

    .line 646
    const/4 v0, 0x1

    if-ne v11, v0, :cond_0

    const/4 v11, 0x7

    goto :goto_0

    :cond_0
    add-int/lit8 v11, v11, -0x1

    .line 648
    :goto_0
    and-int/lit16 v12, v5, 0xff

    .line 649
    shr-int/lit8 v0, v5, 0x8

    and-int/lit16 v13, v0, 0xff

    .line 650
    const/16 v0, 0xb

    new-array v14, v0, [B

    const/16 v0, -0x25

    const/4 v1, 0x0

    aput-byte v0, v14, v1

    const/16 v0, 0x9

    const/4 v1, 0x1

    aput-byte v0, v14, v1

    const/16 v0, 0x8

    const/4 v1, 0x2

    aput-byte v0, v14, v1

    int-to-byte v0, v12

    const/4 v1, 0x3

    aput-byte v0, v14, v1

    int-to-byte v0, v13

    const/4 v1, 0x4

    aput-byte v0, v14, v1

    int-to-byte v0, v6

    const/4 v1, 0x5

    aput-byte v0, v14, v1

    int-to-byte v0, v7

    const/4 v1, 0x6

    aput-byte v0, v14, v1

    int-to-byte v0, v8

    const/4 v1, 0x7

    aput-byte v0, v14, v1

    int-to-byte v0, v9

    const/16 v1, 0x8

    aput-byte v0, v14, v1

    int-to-byte v0, v10

    const/16 v1, 0x9

    aput-byte v0, v14, v1

    int-to-byte v0, v11

    const/16 v1, 0xa

    aput-byte v0, v14, v1

    .line 664
    invoke-static {v14}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 4

    .line 920
    invoke-static {p0}, Lo/adl;->f(Ljava/lang/String;)[B

    move-result-object v2

    .line 921
    const/16 v0, 0xa

    new-array v3, v0, [B

    .line 922
    const/16 v0, -0x25

    const/4 v1, 0x0

    aput-byte v0, v3, v1

    .line 923
    const/16 v0, 0x8

    const/4 v1, 0x1

    aput-byte v0, v3, v1

    .line 924
    const/16 v0, 0x25

    const/4 v1, 0x2

    aput-byte v0, v3, v1

    .line 926
    const/4 v0, 0x0

    aget-byte v0, v2, v0

    const/4 v1, 0x3

    aput-byte v0, v3, v1

    .line 927
    const/4 v0, 0x1

    aget-byte v0, v2, v0

    const/4 v1, 0x4

    aput-byte v0, v3, v1

    .line 928
    const/4 v0, 0x2

    aget-byte v0, v2, v0

    const/4 v1, 0x5

    aput-byte v0, v3, v1

    .line 929
    const/4 v0, 0x3

    aget-byte v0, v2, v0

    const/4 v1, 0x6

    aput-byte v0, v3, v1

    .line 930
    const/4 v0, 0x4

    aget-byte v0, v2, v0

    const/4 v1, 0x7

    aput-byte v0, v3, v1

    .line 931
    const/4 v0, 0x5

    aget-byte v0, v2, v0

    const/16 v1, 0x8

    aput-byte v0, v3, v1

    .line 932
    const/4 v0, 0x6

    aget-byte v0, v2, v0

    const/16 v1, 0x9

    aput-byte v0, v3, v1

    .line 934
    invoke-static {v3}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static a(Lo/ady;)[B
    .locals 4

    .line 672
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send user body info cmd."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    invoke-virtual {p0}, Lo/ady;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/adl;->f(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ady;->c([B)V

    .line 674
    invoke-virtual {p0}, Lo/ady;->a()[B

    move-result-object v0

    invoke-static {v0}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0
.end method

.method static a([B)[B
    .locals 8

    .line 990
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0xdb

    if-ne v0, v1, :cond_3

    .line 991
    invoke-virtual {p0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [B

    .line 992
    const/4 v5, 0x3

    const/4 v6, 0x0

    :goto_0
    array-length v0, v4

    if-ge v5, v0, :cond_0

    .line 993
    aget-byte v0, v4, v5

    sget-object v1, Lo/adl;->a:[B

    rem-int/lit8 v2, v6, 0x6

    aget-byte v1, v1, v2

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, v4, v5

    .line 992
    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 995
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "send data to device, data encrypt is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lo/adl;->c([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 998
    const/4 v0, 0x2

    aget-byte v0, v4, v0

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0x24

    if-ne v0, v1, :cond_1

    .line 999
    const/4 v0, 0x7

    new-array v5, v0, [B

    .line 1000
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-static {v4, v0, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1001
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "set auth keyArr:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v5}, Lo/adl;->c([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1002
    invoke-static {v5}, Lo/adm;->a([B)V

    .line 1005
    :cond_1
    const/4 v0, 0x2

    aget-byte v0, v4, v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_2

    .line 1007
    array-length v0, v4

    add-int/lit8 v0, v0, -0x3

    new-array v5, v0, [B

    .line 1008
    array-length v0, v5

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v4, v1, v5, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1009
    const/4 v6, 0x0

    .line 1012
    :try_start_0
    invoke-static {v5}, Lo/adm;->c([B)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1015
    goto :goto_1

    .line 1013
    :catch_0
    move-exception v7

    .line 1014
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataparse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1017
    :goto_1
    if-eqz v6, :cond_2

    .line 1019
    array-length v0, v6

    add-int/lit8 v0, v0, 0x3

    new-array v7, v0, [B

    .line 1020
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v4, v0, v7, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1021
    array-length v0, v6

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v6, v1, v7, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1022
    const/16 v0, -0x24

    const/4 v1, 0x0

    aput-byte v0, v7, v1

    .line 1023
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "aes\u52a0\u5bc6\u540e\u7684\u7528\u6237\u4fe1\u606f\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v7}, Lo/adl;->c([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1024
    move-object v4, v7

    .line 1027
    :cond_2
    return-object v4

    .line 1029
    :cond_3
    return-object p0
.end method

.method public static b()[B
    .locals 2

    .line 872
    const/4 v1, 0x3

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    .line 878
    invoke-static {v1}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0

    nop

    :array_0
    .array-data 1
        -0x25t
        0x1t
        0x20t
    .end array-data
.end method

.method public static b(Ljava/lang/String;)[B
    .locals 4

    .line 899
    invoke-static {p0}, Lo/adl;->f(Ljava/lang/String;)[B

    move-result-object v2

    .line 900
    const/16 v0, 0xa

    new-array v3, v0, [B

    .line 901
    const/16 v0, -0x25

    const/4 v1, 0x0

    aput-byte v0, v3, v1

    .line 902
    const/16 v0, 0x8

    const/4 v1, 0x1

    aput-byte v0, v3, v1

    .line 903
    const/16 v0, 0x24

    const/4 v1, 0x2

    aput-byte v0, v3, v1

    .line 905
    const/4 v0, 0x0

    aget-byte v0, v2, v0

    const/4 v1, 0x3

    aput-byte v0, v3, v1

    .line 906
    const/4 v0, 0x1

    aget-byte v0, v2, v0

    const/4 v1, 0x4

    aput-byte v0, v3, v1

    .line 907
    const/4 v0, 0x2

    aget-byte v0, v2, v0

    const/4 v1, 0x5

    aput-byte v0, v3, v1

    .line 908
    const/4 v0, 0x3

    aget-byte v0, v2, v0

    const/4 v1, 0x6

    aput-byte v0, v3, v1

    .line 909
    const/4 v0, 0x4

    aget-byte v0, v2, v0

    const/4 v1, 0x7

    aput-byte v0, v3, v1

    .line 910
    const/4 v0, 0x5

    aget-byte v0, v2, v0

    const/16 v1, 0x8

    aput-byte v0, v3, v1

    .line 911
    const/4 v0, 0x6

    aget-byte v0, v2, v0

    const/16 v1, 0x9

    aput-byte v0, v3, v1

    .line 913
    invoke-static {v3}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static b([B)[B
    .locals 5

    .line 959
    const/16 v0, 0x13

    new-array v2, v0, [B

    .line 960
    const/16 v0, -0x25

    const/4 v1, 0x0

    aput-byte v0, v2, v1

    .line 961
    const/16 v0, 0x10

    const/4 v1, 0x1

    aput-byte v0, v2, v1

    .line 962
    const/4 v0, 0x5

    const/4 v1, 0x2

    aput-byte v0, v2, v1

    .line 964
    const/4 v3, 0x3

    const/4 v4, 0x0

    :goto_0
    array-length v0, v2

    const/16 v0, 0x13

    if-ge v3, v0, :cond_0

    .line 965
    aget-byte v0, p0, v4

    aput-byte v0, v2, v3

    .line 964
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 968
    :cond_0
    invoke-static {v2}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0
.end method

.method static c([B)Ljava/lang/String;
    .locals 7

    .line 976
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 977
    move-object v3, p0

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-byte v6, v3, v5

    .line 978
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 979
    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 977
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 981
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {v2, v1, v0}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c()[B
    .locals 5

    .line 724
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send get version cmd."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    const/4 v4, 0x3

    new-array v4, v4, [B

    fill-array-data v4, :array_0

    .line 730
    invoke-static {v4}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0

    :array_0
    .array-data 1
        -0x25t
        0x1t
        0xct
    .end array-data
.end method

.method public static c(Ljava/lang/String;)[B
    .locals 6

    .line 684
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "send get record cmd, uid is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 685
    invoke-static {p0}, Lo/adl;->f(Ljava/lang/String;)[B

    move-result-object v4

    .line 687
    const/16 v0, 0xb

    new-array v5, v0, [B

    const/16 v0, -0x25

    const/4 v1, 0x0

    aput-byte v0, v5, v1

    const/4 v0, 0x7

    const/4 v1, 0x1

    aput-byte v0, v5, v1

    const/16 v0, 0xb

    const/4 v1, 0x2

    aput-byte v0, v5, v1

    const/4 v0, 0x0

    aget-byte v0, v4, v0

    const/4 v1, 0x3

    aput-byte v0, v5, v1

    const/4 v0, 0x1

    aget-byte v0, v4, v0

    const/4 v1, 0x4

    aput-byte v0, v5, v1

    const/4 v0, 0x2

    aget-byte v0, v4, v0

    const/4 v1, 0x5

    aput-byte v0, v5, v1

    const/4 v0, 0x3

    aget-byte v0, v4, v0

    const/4 v1, 0x6

    aput-byte v0, v5, v1

    const/4 v0, 0x4

    aget-byte v0, v4, v0

    const/4 v1, 0x7

    aput-byte v0, v5, v1

    const/4 v0, 0x5

    aget-byte v0, v4, v0

    const/16 v1, 0x8

    aput-byte v0, v5, v1

    const/4 v0, 0x6

    aget-byte v0, v4, v0

    const/16 v1, 0x9

    aput-byte v0, v5, v1

    const/4 v0, 0x0

    const/16 v1, 0xa

    aput-byte v0, v5, v1

    .line 700
    invoke-static {v5}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static d([B)Lo/adw;
    .locals 62

    .line 51
    new-instance v8, Lo/adw;

    invoke-direct {v8}, Lo/adw;-><init>()V

    .line 54
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0xbc

    if-ne v0, v1, :cond_7

    .line 55
    const/4 v0, 0x2

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0xe

    if-ne v0, v1, :cond_0

    .line 57
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6d4b\u91cf\u7ed3\u679c-\u52a0\u5bc6\u5185\u5bb9\u7b2c1\u5305:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lo/adl;->c([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    const/16 v0, 0x10

    new-array v0, v0, [B

    sput-object v0, Lo/adl;->e:[B

    .line 59
    sget-object v0, Lo/adl;->e:[B

    move-object/from16 v1, p0

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    goto :goto_0

    .line 60
    :catch_0
    move-exception v9

    .line 61
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataparse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    :goto_0
    return-object v8

    .line 64
    :cond_0
    const/4 v0, 0x2

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0x8e

    if-ne v0, v1, :cond_3

    sget-object v0, Lo/adl;->e:[B

    if-eqz v0, :cond_3

    .line 66
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6d4b\u91cf\u7ed3\u679c-\u52a0\u5bc6\u5185\u5bb9\u7b2c2\u5305:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lo/adl;->c([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    const/16 v0, 0x10

    new-array v9, v0, [B

    .line 69
    move-object/from16 v0, p0

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/16 v3, 0x10

    invoke-static {v0, v1, v9, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x0

    .line 74
    :try_start_2
    sget-object v0, Lo/adl;->e:[B

    invoke-static {v0}, Lo/adm;->e([B)[B

    move-result-object v0

    move-object v10, v0

    .line 75
    invoke-static {v9}, Lo/adm;->e([B)[B
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    move-object v11, v0

    .line 79
    goto :goto_1

    .line 77
    :catch_1
    move-exception v12

    .line 78
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataparse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 81
    :goto_1
    if-eqz v10, :cond_1

    if-nez v11, :cond_2

    .line 82
    :cond_1
    move-object v12, v8

    .line 98
    const/4 v0, 0x0

    sput-object v0, Lo/adl;->e:[B

    .line 82
    return-object v12

    .line 84
    :cond_2
    :try_start_4
    array-length v0, v10

    add-int/lit8 v0, v0, 0x3

    array-length v1, v11

    add-int/2addr v0, v1

    new-array v12, v0, [B

    .line 85
    const/16 v0, -0x43

    const/4 v1, 0x0

    aput-byte v0, v12, v1

    .line 86
    const/4 v0, 0x1

    aget-byte v0, p0, v0

    const/4 v1, 0x1

    aput-byte v0, v12, v1

    .line 87
    const/16 v0, 0xe

    const/4 v1, 0x2

    aput-byte v0, v12, v1

    .line 89
    array-length v0, v10

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v10, v1, v12, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    array-length v0, v10

    add-int/lit8 v0, v0, 0x3

    array-length v1, v11

    const/4 v2, 0x0

    invoke-static {v11, v2, v12, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 92
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6d4b\u91cf\u7ed3\u679c\u89e3\u5bc6\u540e\u6570\u636e\u5185\u5bb9\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v12}, Lo/adl;->c([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 94
    move-object/from16 p0, v12

    .line 98
    const/4 v0, 0x0

    sput-object v0, Lo/adl;->e:[B

    .line 99
    goto :goto_2

    .line 95
    :catch_2
    move-exception v9

    .line 96
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_5
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataparse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 98
    const/4 v0, 0x0

    sput-object v0, Lo/adl;->e:[B

    .line 99
    goto :goto_2

    .line 98
    :catchall_0
    move-exception v13

    const/4 v0, 0x0

    sput-object v0, Lo/adl;->e:[B

    .line 99
    throw v13

    :goto_2
    goto/16 :goto_5

    .line 100
    :cond_3
    const/4 v0, 0x2

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 102
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5386\u53f2\u8bb0\u5f55-\u52a0\u5bc6\u5185\u5bb9\u7b2c1\u5305:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lo/adl;->c([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const/16 v0, 0x10

    new-array v0, v0, [B

    sput-object v0, Lo/adl;->e:[B

    .line 104
    sget-object v0, Lo/adl;->e:[B

    move-object/from16 v1, p0

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-static {v1, v2, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 107
    goto :goto_3

    .line 105
    :catch_3
    move-exception v9

    .line 106
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataparse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :goto_3
    return-object v8

    .line 109
    :cond_4
    const/4 v0, 0x2

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0x90

    if-ne v0, v1, :cond_7

    sget-object v0, Lo/adl;->e:[B

    if-eqz v0, :cond_7

    .line 111
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_7
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5386\u53f2\u8bb0\u5f55-\u52a0\u5bc6\u5185\u5bb9\u7b2c2\u5305:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lo/adl;->c([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    const/16 v0, 0x10

    new-array v9, v0, [B

    .line 114
    move-object/from16 v0, p0

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/16 v3, 0x10

    invoke-static {v0, v1, v9, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 115
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataparse ----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 116
    const/4 v10, 0x0

    .line 117
    const/4 v11, 0x0

    .line 119
    :try_start_8
    sget-object v0, Lo/adl;->e:[B

    invoke-static {v0}, Lo/adm;->e([B)[B

    move-result-object v0

    move-object v10, v0

    .line 120
    invoke-static {v9}, Lo/adm;->e([B)[B

    move-result-object v0

    move-object v11, v0

    .line 121
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataparse ----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 124
    goto :goto_4

    .line 122
    :catch_4
    move-exception v12

    .line 123
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_9
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataparse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    :goto_4
    if-eqz v10, :cond_5

    if-nez v11, :cond_6

    .line 127
    :cond_5
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataparse encryData2 == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 128
    move-object v12, v8

    .line 144
    const/4 v0, 0x0

    sput-object v0, Lo/adl;->e:[B

    .line 128
    return-object v12

    .line 130
    :cond_6
    :try_start_a
    array-length v0, v10

    add-int/lit8 v0, v0, 0x3

    array-length v1, v11

    add-int/2addr v0, v1

    new-array v12, v0, [B

    .line 131
    const/16 v0, -0x43

    const/4 v1, 0x0

    aput-byte v0, v12, v1

    .line 132
    const/4 v0, 0x1

    aget-byte v0, p0, v0

    const/4 v1, 0x1

    aput-byte v0, v12, v1

    .line 133
    const/16 v0, 0x10

    const/4 v1, 0x2

    aput-byte v0, v12, v1

    .line 134
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataparse encryData2 != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    array-length v0, v10

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v10, v1, v12, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 136
    array-length v0, v10

    add-int/lit8 v0, v0, 0x3

    array-length v1, v11

    const/4 v2, 0x0

    invoke-static {v11, v2, v12, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 138
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5386\u53f2\u6570\u636e\u89e3\u5bc6\u540e\u6570\u636e\u5185\u5bb9\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v12}, Lo/adl;->c([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 140
    move-object/from16 p0, v12

    .line 144
    const/4 v0, 0x0

    sput-object v0, Lo/adl;->e:[B

    .line 145
    goto :goto_5

    .line 141
    :catch_5
    move-exception v9

    .line 142
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_b
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataparse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 144
    const/4 v0, 0x0

    sput-object v0, Lo/adl;->e:[B

    .line 145
    goto :goto_5

    .line 144
    :catchall_1
    move-exception v14

    const/4 v0, 0x0

    sput-object v0, Lo/adl;->e:[B

    .line 145
    throw v14

    .line 151
    :cond_7
    :goto_5
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0xbd

    if-ne v0, v1, :cond_9

    .line 152
    invoke-virtual/range {p0 .. p0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, [B

    .line 153
    const/4 v10, 0x3

    const/4 v11, 0x0

    :goto_6
    array-length v0, v9

    if-ge v10, v0, :cond_8

    .line 154
    aget-byte v0, p0, v10

    sget-object v1, Lo/adl;->a:[B

    rem-int/lit8 v2, v11, 0x6

    aget-byte v1, v1, v2

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    aput-byte v0, p0, v10

    .line 153
    add-int/lit8 v10, v10, 0x1

    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    .line 156
    :cond_8
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data deEncrypt is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lo/adl;->c([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    :cond_9
    move-object/from16 v0, p0

    array-length v0, v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_20

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0xbd

    if-ne v0, v1, :cond_20

    move-object/from16 v0, p0

    array-length v0, v0

    const/4 v1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v1, v1, 0x3

    if-ne v0, v1, :cond_20

    .line 169
    const/4 v0, 0x2

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v31, v1

    .line 170
    packed-switch v31, :pswitch_data_0

    goto/16 :goto_1e

    .line 172
    :pswitch_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive scale wakeup."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 174
    goto/16 :goto_1e

    .line 176
    :pswitch_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive scale change unit."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    const/16 v0, 0x10

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 178
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_a

    sget-object v32, Lo/adv;->b:Lo/adv;

    goto :goto_7

    :cond_a
    sget-object v32, Lo/adv;->c:Lo/adv;

    .line 179
    :goto_7
    move-object/from16 v0, v32

    invoke-virtual {v8, v0}, Lo/adw;->b(Ljava/lang/Object;)V

    .line 180
    goto/16 :goto_1e

    .line 182
    :pswitch_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive scale sleeped."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 184
    goto/16 :goto_1e

    .line 186
    :pswitch_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive scale version info."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const/4 v0, 0x4

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 189
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v33, v1

    .line 190
    const/4 v0, 0x4

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v34, v1

    .line 192
    const/4 v0, 0x5

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v35, v1

    .line 193
    const/4 v0, 0x6

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v36, v1

    .line 195
    const/4 v0, 0x7

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v37, v1

    .line 196
    const/16 v0, 0x8

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v38, v1

    .line 198
    const/16 v0, 0x9

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v39, v1

    .line 199
    const/16 v0, 0xa

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v40, v1

    .line 201
    shl-int/lit8 v0, v34, 0x8

    or-int v41, v0, v33

    .line 202
    shl-int/lit8 v0, v36, 0x8

    or-int v42, v0, v35

    .line 203
    shl-int/lit8 v0, v38, 0x8

    or-int v43, v0, v37

    .line 204
    shl-int/lit8 v0, v40, 0x8

    or-int v44, v0, v39

    .line 206
    new-instance v0, Lo/adq;

    move/from16 v1, v41

    move/from16 v2, v42

    move/from16 v3, v43

    move/from16 v4, v44

    invoke-direct {v0, v1, v2, v3, v4}, Lo/adq;-><init>(IIII)V

    move-object/from16 v45, v0

    .line 208
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "receive scale version info.bleVer:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v41

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "scaleVer:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v42

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "coefficientVer:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v43

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "arithmeticVer:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v44

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    move-object/from16 v0, v45

    invoke-virtual {v8, v0}, Lo/adw;->b(Ljava/lang/Object;)V

    .line 214
    goto/16 :goto_1e

    .line 216
    :pswitch_4
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive scale alarm data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v18, v1

    .line 219
    const/16 v0, 0x8

    aget-byte v0, p0, v0

    and-int/lit16 v14, v0, 0xff

    .line 220
    const/16 v0, 0x9

    aget-byte v0, p0, v0

    and-int/lit16 v15, v0, 0xff

    .line 221
    const/16 v0, 0xb

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v46, v1

    .line 222
    move/from16 v0, v46

    and-int/lit16 v0, v0, 0x80

    move/from16 v47, v0

    .line 223
    const/16 v0, 0xc

    aget-byte v48, p0, v0

    .line 225
    const/4 v0, 0x7

    new-array v0, v0, [I

    move-object/from16 v49, v0

    and-int/lit8 v0, v46, 0x40

    if-lez v0, :cond_b

    const/4 v0, 0x1

    goto :goto_8

    :cond_b
    const/4 v0, 0x0

    :goto_8
    const/4 v1, 0x0

    aput v0, v49, v1

    and-int/lit8 v0, v46, 0x20

    if-lez v0, :cond_c

    const/4 v0, 0x1

    goto :goto_9

    :cond_c
    const/4 v0, 0x0

    :goto_9
    const/4 v1, 0x1

    aput v0, v49, v1

    and-int/lit8 v0, v46, 0x10

    if-lez v0, :cond_d

    const/4 v0, 0x1

    goto :goto_a

    :cond_d
    const/4 v0, 0x0

    :goto_a
    const/4 v1, 0x2

    aput v0, v49, v1

    and-int/lit8 v0, v46, 0x8

    if-lez v0, :cond_e

    const/4 v0, 0x1

    goto :goto_b

    :cond_e
    const/4 v0, 0x0

    :goto_b
    const/4 v1, 0x3

    aput v0, v49, v1

    and-int/lit8 v0, v46, 0x4

    if-lez v0, :cond_f

    const/4 v0, 0x1

    goto :goto_c

    :cond_f
    const/4 v0, 0x0

    :goto_c
    const/4 v1, 0x4

    aput v0, v49, v1

    and-int/lit8 v0, v46, 0x2

    if-lez v0, :cond_10

    const/4 v0, 0x1

    goto :goto_d

    :cond_10
    const/4 v0, 0x0

    :goto_d
    const/4 v1, 0x5

    aput v0, v49, v1

    and-int/lit8 v0, v46, 0x1

    if-lez v0, :cond_11

    const/4 v0, 0x1

    goto :goto_e

    :cond_11
    const/4 v0, 0x0

    :goto_e
    const/4 v1, 0x6

    aput v0, v49, v1

    .line 235
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "receive clock data,no: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v18

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",hour: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",minute: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",clockRepeat: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 239
    invoke-static/range {v46 .. v46}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 235
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    new-instance v0, Lo/adt;

    move/from16 v1, v18

    move v2, v14

    move v3, v15

    move-object/from16 v5, v49

    if-lez v47, :cond_12

    const/4 v6, 0x1

    goto :goto_f

    :cond_12
    const/4 v6, 0x0

    :goto_f
    if-nez v48, :cond_13

    const/4 v7, 0x1

    goto :goto_10

    :cond_13
    const/4 v7, 0x0

    :goto_10
    const/4 v4, 0x0

    invoke-direct/range {v0 .. v7}, Lo/adt;-><init>(IIII[IZZ)V

    move-object/from16 v50, v0

    .line 242
    const/4 v0, 0x5

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 243
    move-object/from16 v0, v50

    invoke-virtual {v8, v0}, Lo/adw;->b(Ljava/lang/Object;)V

    .line 245
    goto/16 :goto_1e

    .line 247
    :pswitch_5
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive scale clock."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v9, v0, 0xff

    .line 250
    const/4 v0, 0x4

    aget-byte v0, p0, v0

    and-int/lit16 v10, v0, 0xff

    .line 251
    shl-int/lit8 v0, v10, 0x8

    or-int v11, v0, v9

    .line 253
    const/4 v0, 0x5

    aget-byte v0, p0, v0

    and-int/lit16 v12, v0, 0xff

    .line 254
    const/4 v0, 0x6

    aget-byte v0, p0, v0

    and-int/lit16 v13, v0, 0xff

    .line 256
    const/4 v0, 0x7

    aget-byte v0, p0, v0

    and-int/lit16 v14, v0, 0xff

    .line 257
    const/16 v0, 0x8

    aget-byte v0, p0, v0

    and-int/lit16 v15, v0, 0xff

    .line 258
    const/16 v0, 0x9

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v16, v1

    .line 259
    const/16 v0, 0xa

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v17, v1

    .line 261
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "got scale curr clock info.year:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "month:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "date:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "hour:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "minute:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "second:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v16

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "weekOfYear:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    new-instance v0, Lo/adr;

    move v1, v11

    move v2, v12

    move v3, v13

    move v4, v14

    move v5, v15

    move/from16 v6, v16

    move/from16 v7, v17

    invoke-direct/range {v0 .. v7}, Lo/adr;-><init>(IIIIIII)V

    move-object/from16 v51, v0

    .line 271
    const/4 v0, 0x6

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 272
    move-object/from16 v0, v51

    invoke-virtual {v8, v0}, Lo/adw;->b(Ljava/lang/Object;)V

    .line 273
    goto/16 :goto_1e

    .line 275
    :pswitch_6
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive fat result."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v19, v1

    .line 278
    const/4 v0, 0x4

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v20, v1

    .line 279
    const/4 v0, 0x5

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v21, v1

    .line 280
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive fat result.1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    shl-int/lit8 v0, v21, 0x8

    or-int v22, v0, v20

    .line 282
    const/4 v0, 0x6

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v23, v1

    .line 283
    const/4 v0, 0x7

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v24, v1

    .line 284
    shl-int/lit8 v0, v24, 0x8

    or-int v25, v0, v23

    .line 285
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive fat result.time start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    const/16 v0, 0x8

    aget-byte v0, p0, v0

    and-int/lit16 v9, v0, 0xff

    .line 288
    const/16 v0, 0x9

    aget-byte v0, p0, v0

    and-int/lit16 v10, v0, 0xff

    .line 289
    shl-int/lit8 v0, v10, 0x8

    or-int v11, v0, v9

    .line 290
    const/16 v0, 0xa

    aget-byte v0, p0, v0

    and-int/lit16 v12, v0, 0xff

    .line 291
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive fat result resistance 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    const/16 v0, 0xb

    aget-byte v0, p0, v0

    and-int/lit16 v13, v0, 0xff

    .line 293
    const/16 v0, 0xc

    aget-byte v0, p0, v0

    and-int/lit16 v14, v0, 0xff

    .line 294
    const/16 v0, 0xd

    aget-byte v0, p0, v0

    and-int/lit16 v15, v0, 0xff

    .line 295
    const/16 v0, 0xe

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v16, v1

    .line 296
    const/16 v0, 0xf

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v17, v1

    .line 297
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive fat result resistance start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    const/16 v0, 0x10

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v26, v1

    .line 300
    const/16 v0, 0x11

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v27, v1

    .line 301
    shl-int/lit8 v0, v27, 0x8

    or-int v28, v0, v26

    .line 302
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive fat result bean"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    new-instance v29, Lo/ads;

    invoke-direct/range {v29 .. v29}, Lo/ads;-><init>()V

    .line 304
    move-object/from16 v0, v29

    invoke-virtual {v0, v15}, Lo/ads;->h(I)V

    .line 305
    move-object/from16 v0, v29

    invoke-virtual {v0, v11}, Lo/ads;->a(I)V

    .line 306
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fat result bean"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    move-object/from16 v0, v29

    invoke-virtual {v0, v13}, Lo/ads;->b(I)V

    .line 308
    move-object/from16 v0, v29

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/ads;->i(I)V

    .line 309
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fat result bean"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    move-object/from16 v0, v29

    invoke-virtual {v0, v12}, Lo/ads;->c(I)V

    .line 311
    move-object/from16 v0, v29

    invoke-virtual {v0, v14}, Lo/ads;->d(I)V

    .line 312
    move-object/from16 v0, v29

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Lo/ads;->e(I)V

    .line 313
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fat result bean"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    move-object/from16 v0, v29

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/ads;->g(I)V

    .line 316
    move/from16 v0, v22

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Lo/ads;->b(F)V

    .line 317
    move/from16 v0, v25

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Lo/ads;->e(F)V

    .line 319
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v29 .. v29}, Lo/ads;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    const/4 v0, 0x7

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 322
    move-object/from16 v0, v29

    invoke-virtual {v8, v0}, Lo/adw;->b(Ljava/lang/Object;)V

    .line 323
    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    invoke-static {v0}, Lo/adl;->a([B)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/adw;->a([B)V

    .line 330
    goto/16 :goto_1e

    .line 332
    :pswitch_7
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive weight measureing data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v19, v1

    .line 334
    const/4 v0, 0x4

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v20, v1

    .line 335
    const/4 v0, 0x5

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v21, v1

    .line 336
    shl-int/lit8 v0, v21, 0x8

    or-int v22, v0, v20

    .line 339
    const/4 v0, 0x6

    aget-byte v0, p0, v0

    and-int/lit16 v9, v0, 0xff

    .line 340
    const/4 v0, 0x7

    aget-byte v0, p0, v0

    and-int/lit16 v10, v0, 0xff

    .line 341
    shl-int/lit8 v0, v10, 0x8

    or-int v11, v0, v9

    .line 342
    const/16 v0, 0x8

    aget-byte v0, p0, v0

    and-int/lit16 v12, v0, 0xff

    .line 343
    const/16 v0, 0x9

    aget-byte v0, p0, v0

    and-int/lit16 v13, v0, 0xff

    .line 344
    const/16 v0, 0xa

    aget-byte v0, p0, v0

    and-int/lit16 v14, v0, 0xff

    .line 345
    const/16 v0, 0xb

    aget-byte v0, p0, v0

    and-int/lit16 v15, v0, 0xff

    .line 346
    const/16 v0, 0xc

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v16, v1

    .line 347
    const/16 v0, 0xd

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v17, v1

    .line 349
    new-instance v29, Lo/ads;

    invoke-direct/range {v29 .. v29}, Lo/ads;-><init>()V

    .line 350
    move-object/from16 v0, v29

    invoke-virtual {v0, v11}, Lo/ads;->a(I)V

    .line 351
    move-object/from16 v0, v29

    invoke-virtual {v0, v12}, Lo/ads;->c(I)V

    .line 352
    move-object/from16 v0, v29

    invoke-virtual {v0, v13}, Lo/ads;->b(I)V

    .line 353
    move-object/from16 v0, v29

    invoke-virtual {v0, v14}, Lo/ads;->d(I)V

    .line 354
    move-object/from16 v0, v29

    invoke-virtual {v0, v15}, Lo/ads;->h(I)V

    .line 355
    move-object/from16 v0, v29

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/ads;->i(I)V

    .line 356
    move-object/from16 v0, v29

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/ads;->g(I)V

    .line 357
    move-object/from16 v0, v29

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ads;->e(I)V

    .line 359
    move/from16 v0, v22

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Lo/ads;->b(F)V

    .line 360
    move-object/from16 v0, v29

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ads;->e(F)V

    .line 362
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v29 .. v29}, Lo/ads;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    const/4 v0, 0x7

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 364
    move-object/from16 v0, v29

    invoke-virtual {v8, v0}, Lo/adw;->b(Ljava/lang/Object;)V

    .line 365
    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    invoke-static {v0}, Lo/adl;->a([B)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/adw;->a([B)V

    .line 371
    goto/16 :goto_1e

    .line 373
    :pswitch_8
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive weight measureing data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v19, v1

    .line 376
    const/4 v0, 0x4

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v20, v1

    .line 377
    const/4 v0, 0x5

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v21, v1

    .line 378
    shl-int/lit8 v0, v21, 0x8

    or-int v22, v0, v20

    .line 379
    const/4 v0, 0x6

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v23, v1

    .line 380
    const/4 v0, 0x7

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v24, v1

    .line 381
    shl-int/lit8 v0, v24, 0x8

    or-int v25, v0, v23

    .line 384
    const/16 v0, 0x8

    aget-byte v0, p0, v0

    and-int/lit16 v9, v0, 0xff

    .line 385
    const/16 v0, 0x9

    aget-byte v0, p0, v0

    and-int/lit16 v10, v0, 0xff

    .line 386
    shl-int/lit8 v0, v10, 0x8

    or-int v11, v0, v9

    .line 387
    const/16 v0, 0xa

    aget-byte v0, p0, v0

    and-int/lit16 v12, v0, 0xff

    .line 388
    const/16 v0, 0xb

    aget-byte v0, p0, v0

    and-int/lit16 v13, v0, 0xff

    .line 389
    const/16 v0, 0xc

    aget-byte v0, p0, v0

    and-int/lit16 v14, v0, 0xff

    .line 390
    const/16 v0, 0xd

    aget-byte v0, p0, v0

    and-int/lit16 v15, v0, 0xff

    .line 391
    const/16 v0, 0xe

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v16, v1

    .line 392
    const/16 v0, 0xf

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v17, v1

    .line 395
    const/16 v0, 0x10

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v26, v1

    .line 396
    const/16 v0, 0x11

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v27, v1

    .line 397
    shl-int/lit8 v0, v27, 0x8

    or-int v28, v0, v26

    .line 400
    const/16 v0, 0x12

    aget-byte v52, p0, v0

    .line 403
    new-instance v29, Lo/ads;

    invoke-direct/range {v29 .. v29}, Lo/ads;-><init>()V

    .line 404
    move-object/from16 v0, v29

    invoke-virtual {v0, v11}, Lo/ads;->a(I)V

    .line 405
    move-object/from16 v0, v29

    invoke-virtual {v0, v12}, Lo/ads;->c(I)V

    .line 406
    move-object/from16 v0, v29

    invoke-virtual {v0, v13}, Lo/ads;->b(I)V

    .line 407
    move-object/from16 v0, v29

    invoke-virtual {v0, v14}, Lo/ads;->d(I)V

    .line 408
    move-object/from16 v0, v29

    invoke-virtual {v0, v15}, Lo/ads;->h(I)V

    .line 409
    move-object/from16 v0, v29

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/ads;->i(I)V

    .line 410
    move-object/from16 v0, v29

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/ads;->g(I)V

    .line 411
    move-object/from16 v0, v29

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Lo/ads;->e(I)V

    .line 413
    move/from16 v0, v22

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Lo/ads;->b(F)V

    .line 414
    move/from16 v0, v25

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Lo/ads;->e(F)V

    .line 420
    move/from16 v0, v52

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0xaa

    if-ne v0, v1, :cond_14

    const/4 v0, 0x1

    goto :goto_11

    :cond_14
    const/4 v0, 0x0

    :goto_11
    move-object/from16 v1, v29

    invoke-virtual {v1, v0}, Lo/ads;->b(Z)V

    .line 422
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v29 .. v29}, Lo/ads;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 425
    move-object/from16 v0, v29

    invoke-virtual {v8, v0}, Lo/adw;->b(Ljava/lang/Object;)V

    .line 426
    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    invoke-static {v0}, Lo/adl;->a([B)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/adw;->a([B)V

    .line 432
    goto/16 :goto_1e

    .line 434
    :pswitch_9
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v53, v1

    .line 435
    const/4 v0, 0x4

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v54, v1

    .line 436
    shl-int/lit8 v0, v54, 0x8

    or-int v55, v0, v53

    .line 437
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "redevice packageupgradeResponse is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v55

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    new-instance v30, Lorg/json/JSONObject;

    invoke-direct/range {v30 .. v30}, Lorg/json/JSONObject;-><init>()V

    .line 441
    const-string v0, "pkgNo"

    move-object/from16 v1, v30

    move/from16 v2, v55

    :try_start_c
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_6

    .line 444
    goto :goto_12

    .line 442
    :catch_6
    move-exception v56

    .line 443
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataparse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v56 .. v56}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    :goto_12
    const/4 v0, 0x5

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    if-gt v0, v1, :cond_16

    .line 447
    const-string v0, "result"

    const/4 v1, 0x5

    :try_start_d
    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    if-nez v1, :cond_15

    const/4 v1, 0x1

    goto :goto_13

    :cond_15
    const/4 v1, 0x0

    :goto_13
    move-object/from16 v2, v30

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_7

    .line 450
    goto :goto_14

    .line 448
    :catch_7
    move-exception v56

    .line 449
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataparse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v56 .. v56}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    goto :goto_14

    .line 453
    :cond_16
    const-string v0, "result"

    move-object/from16 v1, v30

    const/4 v2, 0x1

    :try_start_e
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_e
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_8

    .line 456
    goto :goto_14

    .line 454
    :catch_8
    move-exception v56

    .line 455
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataparse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v56 .. v56}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 458
    :goto_14
    const/16 v0, 0x9

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 459
    move-object/from16 v0, v30

    invoke-virtual {v8, v0}, Lo/adw;->b(Ljava/lang/Object;)V

    .line 460
    goto/16 :goto_1e

    .line 462
    :pswitch_a
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v56, v1

    .line 463
    const/4 v0, 0x4

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v57, v1

    .line 464
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "package upgrade result:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v56

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    new-instance v30, Lorg/json/JSONObject;

    invoke-direct/range {v30 .. v30}, Lorg/json/JSONObject;-><init>()V

    .line 468
    const-string v0, "result"

    move-object/from16 v1, v30

    move/from16 v2, v56

    :try_start_f
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 469
    const-string v0, "type"

    move-object/from16 v1, v30

    move/from16 v2, v57

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_f
    .catch Lorg/json/JSONException; {:try_start_f .. :try_end_f} :catch_9

    .line 472
    goto :goto_15

    .line 470
    :catch_9
    move-exception v58

    .line 471
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataparse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v58 .. v58}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    :goto_15
    const/16 v0, 0xa

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 474
    move-object/from16 v0, v30

    invoke-virtual {v8, v0}, Lo/adw;->b(Ljava/lang/Object;)V

    .line 475
    goto/16 :goto_1e

    .line 477
    :pswitch_b
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v58, v1

    .line 478
    and-int/lit8 v0, v58, 0x40

    if-lez v0, :cond_17

    const/16 v59, 0x1

    goto :goto_16

    :cond_17
    const/16 v59, 0x0

    .line 479
    :goto_16
    if-eqz v59, :cond_20

    .line 480
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weight over load."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    const/16 v0, 0xb

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    goto/16 :goto_1e

    .line 485
    :pswitch_c
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive device low power message."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    const/16 v0, 0xc

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 487
    goto/16 :goto_1e

    .line 489
    :pswitch_d
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive fat measure error message."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    const/16 v0, 0xd

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 491
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/adw;->b(Ljava/lang/Object;)V

    .line 492
    goto/16 :goto_1e

    .line 494
    :pswitch_e
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive set clock ack."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    const/16 v0, 0xe

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 496
    goto/16 :goto_1e

    .line 498
    :pswitch_f
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive OTA upgrade ready."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 499
    const/16 v0, 0xf

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 500
    goto/16 :goto_1e

    .line 502
    :pswitch_10
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v60, v1

    .line 503
    new-instance v61, Ljava/lang/StringBuilder;

    invoke-direct/range {v61 .. v61}, Ljava/lang/StringBuilder;-><init>()V

    .line 504
    const/4 v0, 0x4

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_18

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_17

    :cond_18
    const/4 v0, 0x4

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    :goto_17
    move-object/from16 v1, v61

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    const-string v0, ":"

    move-object/from16 v1, v61

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    const/4 v0, 0x5

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_19

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x5

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_18

    :cond_19
    const/4 v0, 0x5

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    :goto_18
    move-object/from16 v1, v61

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    const-string v0, ":"

    move-object/from16 v1, v61

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    const/4 v0, 0x6

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x6

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_19

    :cond_1a
    const/4 v0, 0x6

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    :goto_19
    move-object/from16 v1, v61

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    const-string v0, ":"

    move-object/from16 v1, v61

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    const/4 v0, 0x7

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1b

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x7

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1a

    :cond_1b
    const/4 v0, 0x7

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1a
    move-object/from16 v1, v61

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    const-string v0, ":"

    move-object/from16 v1, v61

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    const/16 v0, 0x8

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1c

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x8

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1b

    :cond_1c
    const/16 v0, 0x8

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1b
    move-object/from16 v1, v61

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 513
    const-string v0, ":"

    move-object/from16 v1, v61

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    const/16 v0, 0x9

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1d

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x9

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1c

    :cond_1d
    const/16 v0, 0x9

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1c
    move-object/from16 v1, v61

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "receive user mark response.mark:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v60

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",mac:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 517
    invoke-virtual/range {v61 .. v61}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 516
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    goto :goto_1e

    .line 520
    :pswitch_11
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scale history uploaded done."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    const/16 v0, 0x11

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 522
    goto :goto_1e

    .line 524
    :pswitch_12
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scale response update list."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 526
    goto :goto_1e

    .line 528
    :pswitch_13
    const/16 v0, 0x12

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 529
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1e

    const/4 v0, 0x1

    goto :goto_1d

    :cond_1e
    const/4 v0, 0x0

    :goto_1d
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/adw;->b(Ljava/lang/Object;)V

    .line 530
    goto :goto_1e

    .line 532
    :pswitch_14
    const/16 v0, 0x13

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 533
    goto :goto_1e

    .line 535
    :pswitch_15
    const/4 v0, 0x3

    aget-byte v0, p0, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1f

    .line 536
    const/16 v0, 0x14

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    goto :goto_1e

    .line 538
    :cond_1f
    const/16 v0, 0x15

    invoke-virtual {v8, v0}, Lo/adw;->c(I)V

    .line 540
    .line 546
    :cond_20
    :goto_1e
    :pswitch_16
    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_5
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_3
        :pswitch_16
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_12
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_13
        :pswitch_14
        :pswitch_15
    .end packed-switch

    :array_0
    .array-data 1
        -0x25t
        0x2t
        0x13t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        -0x25t
        0x2t
        0x13t
        0x0t
    .end array-data

    :array_2
    .array-data 1
        -0x25t
        0x2t
        0xbt
        0x1t
    .end array-data
.end method

.method public static d(Ljava/lang/String;)V
    .locals 5

    .line 34
    sput-object p0, Lo/adl;->d:Ljava/lang/String;

    .line 36
    if-eqz p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 37
    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 38
    const/4 v0, 0x6

    new-array v0, v0, [B

    sput-object v0, Lo/adl;->a:[B

    .line 39
    const/4 v4, 0x0

    :goto_0
    array-length v0, v3

    if-ge v4, v0, :cond_0

    .line 40
    sget-object v0, Lo/adl;->a:[B

    aget-object v1, v3, v4

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    int-to-byte v1, v1

    aput-byte v1, v0, v4

    .line 39
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 43
    :cond_0
    return-void
.end method

.method public static d()[B
    .locals 2

    .line 885
    const/4 v1, 0x4

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    .line 892
    invoke-static {v1}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0

    nop

    :array_0
    .array-data 1
        -0x25t
        0x2t
        0x11t
        0x0t
    .end array-data
.end method

.method public static d(IIB)[B
    .locals 7

    .line 754
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "send ota updarge request cmd. cs:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 755
    and-int/lit16 v4, p1, 0xff

    .line 756
    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v5, v0, 0xff

    .line 758
    const/16 v0, 0x8

    new-array v6, v0, [B

    const/16 v0, -0x25

    const/4 v1, 0x0

    aput-byte v0, v6, v1

    const/4 v0, 0x6

    const/4 v1, 0x1

    aput-byte v0, v6, v1

    const/16 v0, 0xd

    const/4 v1, 0x2

    aput-byte v0, v6, v1

    int-to-byte v0, p0

    const/4 v1, 0x3

    aput-byte v0, v6, v1

    int-to-byte v0, v4

    const/4 v1, 0x4

    aput-byte v0, v6, v1

    int-to-byte v0, v5

    const/4 v1, 0x5

    aput-byte v0, v6, v1

    const/4 v0, 0x6

    aput-byte p2, v6, v0

    const/4 v0, 0x0

    const/4 v1, 0x7

    aput-byte v0, v6, v1

    .line 769
    invoke-static {v6}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static d([BI)[B
    .locals 10

    .line 809
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send ota package data cmd."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 810
    array-length v4, p0

    .line 811
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pkg data len:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",data is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Lo/adl;->c([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 812
    and-int/lit16 v5, p1, 0xff

    .line 813
    shr-int/lit8 v0, p1, 0x8

    and-int/lit16 v6, v0, 0xff

    .line 815
    const/16 v0, 0x14

    new-array v7, v0, [B

    .line 816
    const/16 v0, -0x23

    const/4 v1, 0x0

    aput-byte v0, v7, v1

    .line 817
    const/16 v0, 0x12

    const/4 v1, 0x1

    aput-byte v0, v7, v1

    .line 818
    int-to-byte v0, v5

    const/4 v1, 0x2

    aput-byte v0, v7, v1

    .line 819
    int-to-byte v0, v6

    const/4 v1, 0x3

    aput-byte v0, v7, v1

    .line 822
    const/4 v8, 0x4

    const/4 v9, 0x0

    :goto_0
    const/16 v0, 0x14

    if-ge v8, v0, :cond_1

    .line 823
    if-lt v9, v4, :cond_0

    .line 824
    const/4 v0, -0x1

    aput-byte v0, v7, v8

    goto :goto_1

    .line 826
    :cond_0
    aget-byte v0, p0, v9

    aput-byte v0, v7, v8

    .line 822
    :goto_1
    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 832
    :cond_1
    const/4 v8, 0x0

    .line 833
    const/4 v9, 0x2

    :goto_2
    array-length v0, v7

    const/16 v0, 0x14

    if-ge v9, v0, :cond_2

    .line 834
    aget-byte v0, v7, v9

    xor-int/2addr v0, v8

    int-to-byte v8, v0

    .line 833
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 836
    :cond_2
    const/4 v0, 0x1

    aput-byte v8, v7, v0

    .line 838
    invoke-static {v7}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0
.end method

.method private static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1033
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 1034
    const-string v0, ""

    return-object v0

    .line 1038
    :cond_0
    :try_start_0
    new-instance v4, Lo/ado;

    invoke-direct {v4}, Lo/ado;-><init>()V

    .line 1040
    const-string v0, "utf-8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lo/adl;->h([B)[B

    move-result-object v0

    invoke-static {v0}, Lo/ado;->a([B)Ljava/lang/String;

    move-result-object v5

    .line 1041
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "abcd"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 1042
    :catch_0
    move-exception v4

    .line 1043
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataparse "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1045
    const-string v0, ""

    return-object v0
.end method

.method public static e()[B
    .locals 5

    .line 776
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send ota finish cmd."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 777
    const/4 v4, 0x7

    new-array v4, v4, [B

    fill-array-data v4, :array_0

    .line 786
    invoke-static {v4}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0

    :array_0
    .array-data 1
        -0x25t
        0x5t
        0xdt
        -0x56t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static e([B)[B
    .locals 5

    .line 942
    const/16 v0, 0x13

    new-array v2, v0, [B

    .line 943
    const/16 v0, -0x25

    const/4 v1, 0x0

    aput-byte v0, v2, v1

    .line 944
    const/16 v0, 0x10

    const/4 v1, 0x1

    aput-byte v0, v2, v1

    .line 945
    const/4 v0, 0x4

    const/4 v1, 0x2

    aput-byte v0, v2, v1

    .line 947
    const/4 v3, 0x3

    const/4 v4, 0x0

    :goto_0
    array-length v0, v2

    const/16 v0, 0x13

    if-ge v3, v0, :cond_0

    .line 948
    aget-byte v0, p0, v4

    aput-byte v0, v2, v3

    .line 947
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 951
    :cond_0
    invoke-static {v2}, Lo/adl;->a([B)[B

    move-result-object v0

    return-object v0
.end method

.method private static f(Ljava/lang/String;)[B
    .locals 17

    .line 1054
    invoke-static/range {p0 .. p0}, Lo/adl;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1055
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    .line 1056
    const/4 v0, 0x7

    new-array v4, v0, [B

    .line 1057
    const/4 v5, 0x0

    .line 1058
    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    array-length v0, v3

    if-ge v6, v0, :cond_0

    .line 1059
    aget-char v0, v3, v6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 1060
    add-int/lit8 v0, v6, 0x1

    aget-char v0, v3, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 1061
    add-int/lit8 v0, v6, 0x2

    aget-char v0, v3, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 1062
    add-int/lit8 v0, v6, 0x3

    aget-char v0, v3, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 1063
    add-int/lit8 v0, v6, 0x4

    aget-char v0, v3, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v12

    .line 1064
    add-int/lit8 v0, v6, 0x5

    aget-char v0, v3, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v13

    .line 1065
    add-int/lit8 v0, v6, 0x6

    aget-char v0, v3, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v14

    .line 1066
    add-int/lit8 v0, v6, 0x7

    aget-char v0, v3, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v15

    .line 1067
    xor-int v0, v8, v9

    xor-int/2addr v0, v10

    xor-int/2addr v0, v11

    xor-int/2addr v0, v12

    xor-int/2addr v0, v13

    xor-int/2addr v0, v14

    xor-int v16, v0, v15

    .line 1068
    move/from16 v0, v16

    int-to-byte v0, v0

    aput-byte v0, v4, v7

    .line 1069
    xor-int v5, v5, v16

    .line 1058
    add-int/lit8 v6, v6, 0x8

    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 1071
    :cond_0
    int-to-byte v0, v5

    const/4 v1, 0x6

    aput-byte v0, v4, v1

    .line 1072
    return-object v4
.end method

.method public static h([B)[B
    .locals 5

    .line 1083
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4

    .line 1084
    invoke-virtual {v4, p0}, Ljava/security/MessageDigest;->digest([B)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 1085
    :catch_0
    move-exception v4

    .line 1086
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NoSuchAlgorithmException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1088
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method
