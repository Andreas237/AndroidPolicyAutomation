.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/QDTCardSpecialOperation;
.super Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;-><init>()V

    return-void
.end method

.method private getCardFaceNo(Ljava/lang/String;)Ljava/lang/String;
    .locals 20

    .line 33
    if-eqz p1, :cond_0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    .line 35
    :cond_0
    return-object p1

    .line 37
    :cond_1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 40
    move-object/from16 v0, p0

    :try_start_0
    invoke-direct {v0, v2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/QDTCardSpecialOperation;->getCardId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 41
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    move-object/from16 v0, p1

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    .line 46
    const/16 v5, 0x1f

    .line 47
    const/16 v6, 0xa

    new-array v6, v6, [I

    fill-array-data v6, :array_0

    .line 48
    const/16 v7, 0xa

    new-array v7, v7, [I

    fill-array-data v7, :array_1

    .line 49
    const/16 v8, 0xa

    new-array v8, v8, [I

    fill-array-data v8, :array_2

    .line 50
    const/16 v9, 0xa

    new-array v9, v9, [I

    fill-array-data v9, :array_3

    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    const/16 v16, 0x0

    .line 57
    :goto_0
    move/from16 v0, v16

    const/16 v1, 0xc

    if-ge v0, v1, :cond_2

    .line 59
    aget-char v0, v4, v16

    add-int/lit8 v14, v0, -0x30

    .line 60
    add-int/2addr v15, v14

    .line 61
    aget v0, v6, v14

    add-int/2addr v15, v0

    .line 62
    add-int/lit8 v16, v16, 0x1

    goto :goto_0

    .line 64
    :cond_2
    add-int/lit8 v0, v15, 0x1f

    rem-int/lit8 v10, v0, 0x9

    .line 65
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    const/16 v17, 0x0

    .line 69
    const/16 v16, 0x0

    .line 70
    :goto_1
    move/from16 v0, v16

    const/16 v1, 0xc

    if-ge v0, v1, :cond_3

    .line 72
    aget-char v0, v4, v16

    add-int/lit8 v14, v0, -0x30

    .line 73
    add-int v17, v17, v14

    .line 74
    aget v0, v7, v14

    add-int v17, v17, v0

    .line 75
    add-int/lit8 v16, v16, 0x1

    goto :goto_1

    .line 77
    :cond_3
    add-int/lit8 v0, v17, 0x1f

    rem-int/lit8 v11, v0, 0x9

    .line 78
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    const/16 v18, 0x0

    .line 82
    const/16 v16, 0x0

    .line 83
    :goto_2
    move/from16 v0, v16

    const/16 v1, 0xc

    if-ge v0, v1, :cond_4

    .line 85
    aget-char v0, v4, v16

    add-int/lit8 v14, v0, -0x30

    .line 86
    add-int v18, v18, v14

    .line 87
    aget v0, v8, v14

    add-int v18, v18, v0

    .line 88
    add-int/lit8 v16, v16, 0x1

    goto :goto_2

    .line 90
    :cond_4
    add-int/lit8 v0, v18, 0x1f

    rem-int/lit8 v12, v0, 0x9

    .line 91
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    const/16 v19, 0x0

    .line 95
    const/16 v16, 0x0

    .line 96
    :goto_3
    move/from16 v0, v16

    const/16 v1, 0xc

    if-ge v0, v1, :cond_5

    .line 98
    aget-char v0, v4, v16

    add-int/lit8 v14, v0, -0x30

    .line 99
    add-int v19, v19, v14

    .line 100
    aget v0, v9, v14

    add-int v19, v19, v0

    .line 101
    add-int/lit8 v16, v16, 0x1

    goto :goto_3

    .line 103
    :cond_5
    add-int/lit8 v0, v19, 0x1f

    rem-int/lit8 v13, v0, 0x9

    .line 104
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 107
    :catch_0
    move-exception v3

    .line 109
    const-string v0, "RuntimeException number transfer failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 110
    return-object v2

    .line 112
    :catch_1
    move-exception v3

    .line 114
    const-string v0, "Exception number transfer failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 115
    return-object v2

    nop

    :array_0
    .array-data 4
        0x5
        0x6
        0x8
        0x1
        0x0
        0x2
        0x3
        0x7
        0x9
        0x4
    .end array-data

    :array_1
    .array-data 4
        0x4
        0x8
        0x1
        0x3
        0x7
        0x2
        0x5
        0x9
        0x0
        0x6
    .end array-data

    :array_2
    .array-data 4
        0x1
        0x7
        0x2
        0x6
        0x8
        0x5
        0x9
        0x3
        0x4
        0x0
    .end array-data

    :array_3
    .array-data 4
        0x7
        0x9
        0x0
        0x3
        0x1
        0x2
        0x6
        0x8
        0x4
        0x5
    .end array-data
.end method

.method private getCardId(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 123
    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 125
    const/16 v0, 0x8

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/QDTCardSpecialOperation;->getCardId2(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 127
    return-object v4
.end method

.method private getCardId2(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 132
    const/16 v0, 0x10

    invoke-static {p1, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 133
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    .line 135
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    rsub-int/lit8 v3, v0, 0x8

    .line 136
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 136
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 141
    :cond_0
    return-object v2
.end method


# virtual methods
.method protected handleData(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/QDTCardSpecialOperation;->param:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    const-string v1, " QDTCardSpecialOperation param is null"

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 23
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/QDTCardSpecialOperation;->getCardFaceNo(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
