.class public Lo/aii;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/aii;->c:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x2c
        0x2e
        0x2f
        0x60
        0x21
        0x40
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 1

    .line 32
    invoke-static {p0}, Lo/aii;->b(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public static b(Ljava/lang/String;)Landroid/net/wifi/WifiConfiguration;
    .locals 3

    .line 92
    new-instance v2, Landroid/net/wifi/WifiConfiguration;

    invoke-direct {v2}, Landroid/net/wifi/WifiConfiguration;-><init>()V

    .line 93
    iget-object v0, v2, Landroid/net/wifi/WifiConfiguration;->allowedAuthAlgorithms:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 94
    iget-object v0, v2, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 95
    iget-object v0, v2, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 96
    iget-object v0, v2, Landroid/net/wifi/WifiConfiguration;->allowedPairwiseCiphers:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 97
    iget-object v0, v2, Landroid/net/wifi/WifiConfiguration;->allowedProtocols:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    .line 101
    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/net/wifi/WifiConfiguration;->hiddenSSID:Z

    .line 102
    iget-object v0, v2, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 103
    const/4 v0, 0x2

    iput v0, v2, Landroid/net/wifi/WifiConfiguration;->status:I

    .line 104
    return-object v2
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 14

    .line 113
    const/4 v4, 0x1

    .line 114
    const-string v0, "wifi"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/net/wifi/WifiManager;

    .line 115
    invoke-virtual {v5}, Landroid/net/wifi/WifiManager;->getConfiguredNetworks()Ljava/util/List;

    move-result-object v6

    .line 116
    if-eqz v6, :cond_6

    .line 117
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/net/wifi/WifiConfiguration;

    .line 118
    iget-object v0, v8, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 119
    const-string v0, "ProbeReguestUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "restoreWifiConfig ssid is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 120
    goto :goto_0

    .line 122
    :cond_1
    iget-object v0, v8, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    invoke-static {v0}, Lo/akf;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 123
    if-eqz v9, :cond_0

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    .line 124
    goto :goto_0

    .line 126
    :cond_2
    const/4 v10, 0x0

    .line 127
    const/4 v11, 0x0

    :goto_1
    sget-object v0, Lo/aii;->c:[I

    array-length v0, v0

    if-ge v11, v0, :cond_4

    .line 128
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    sget-object v1, Lo/aii;->c:[I

    aget v1, v1, v11

    int-to-char v1, v1

    if-ne v0, v1, :cond_3

    .line 129
    const/4 v10, 0x1

    .line 130
    goto :goto_2

    .line 127
    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 133
    :cond_4
    :goto_2
    if-eqz v10, :cond_5

    iget-boolean v0, v8, Landroid/net/wifi/WifiConfiguration;->hiddenSSID:Z

    if-eqz v0, :cond_5

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 134
    const-string v0, "ProbeReguestUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "restoreWifiConfig "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 135
    iget v11, v8, Landroid/net/wifi/WifiConfiguration;->networkId:I

    .line 137
    invoke-virtual {v5, v11}, Landroid/net/wifi/WifiManager;->removeNetwork(I)Z

    move-result v12

    .line 138
    invoke-virtual {v5}, Landroid/net/wifi/WifiManager;->saveConfiguration()Z

    move-result v13

    .line 139
    const-string v0, "ProbeReguestUtil"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "networkId "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " remove  "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " disable "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "saveConfig "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 140
    if-eqz v4, :cond_5

    if-nez v12, :cond_5

    .line 141
    const/4 v4, 0x0

    .line 144
    :cond_5
    goto/16 :goto_0

    .line 146
    :cond_6
    return v4
.end method

.method public static c([I)[[I
    .locals 17

    .line 41
    invoke-static/range {p0 .. p0}, Lo/ajw;->c([I)[B

    move-result-object v4

    .line 42
    const/4 v0, 0x2

    invoke-static {v4, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    .line 43
    const-string v0, "ProbeReguestUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Base64.encodeToString "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 45
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    .line 46
    invoke-virtual {v5}, Ljava/lang/String;->toCharArray()[C

    move-result-object v7

    .line 48
    rem-int/lit8 v0, v6, 0x1e

    if-nez v0, :cond_0

    const/4 v8, 0x0

    goto :goto_0

    :cond_0
    rem-int/lit8 v0, v6, 0x1e

    rsub-int/lit8 v8, v0, 0x1e

    .line 49
    :goto_0
    if-eqz v8, :cond_1

    div-int/lit8 v0, v6, 0x1e

    add-int/lit8 v9, v0, 0x1

    goto :goto_1

    :cond_1
    div-int/lit8 v9, v6, 0x1e

    .line 51
    :goto_1
    const/4 v0, 0x0

    aget v0, p0, v0

    and-int/lit8 v10, v0, 0x3f

    .line 53
    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="

    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    .line 54
    const-string v0, "ProbeReguestUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "charCrc "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 56
    const/4 v0, 0x6

    if-le v9, v0, :cond_2

    .line 57
    const/4 v0, 0x0

    const/4 v0, 0x0

    return-object v0

    .line 59
    :cond_2
    if-lez v8, :cond_4

    .line 60
    add-int v0, v6, v8

    new-array v12, v0, [I

    .line 61
    const/4 v13, 0x0

    :goto_2
    if-ge v13, v6, :cond_3

    .line 62
    aget-char v0, v7, v13

    aput v0, v12, v13

    .line 61
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    .line 65
    :cond_3
    add-int/lit8 v0, v6, 0x1

    const/16 v1, 0x20

    invoke-static {v12, v6, v0, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 66
    add-int/lit8 v0, v6, 0x1

    add-int v1, v6, v8

    const/16 v2, 0x23

    invoke-static {v12, v0, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    goto :goto_4

    .line 68
    :cond_4
    new-array v12, v6, [I

    .line 69
    const/4 v13, 0x0

    :goto_3
    if-ge v13, v6, :cond_5

    .line 70
    aget-char v0, v7, v13

    aput v0, v12, v13

    .line 69
    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    .line 73
    :cond_5
    :goto_4
    const/16 v0, 0x20

    filled-new-array {v9, v0}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, [[I

    .line 74
    const/4 v14, 0x0

    :goto_5
    if-ge v14, v9, :cond_7

    .line 75
    aget-object v0, v13, v14

    sget-object v1, Lo/aii;->c:[I

    aget v1, v1, v14

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 76
    aget-object v0, v13, v14

    const/4 v1, 0x1

    aput v11, v0, v1

    .line 77
    const/4 v15, 0x2

    :goto_6
    const/16 v0, 0x20

    if-ge v15, v0, :cond_6

    .line 78
    mul-int/lit8 v0, v14, 0x1e

    add-int/2addr v0, v15

    add-int/lit8 v16, v0, -0x2

    .line 79
    aget-object v0, v13, v14

    aget v1, v12, v16

    aput v1, v0, v15

    .line 77
    add-int/lit8 v15, v15, 0x1

    goto :goto_6

    .line 74
    :cond_6
    add-int/lit8 v14, v14, 0x1

    goto :goto_5

    .line 82
    :cond_7
    return-object v13
.end method
