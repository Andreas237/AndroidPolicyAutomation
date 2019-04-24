.class public Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static construstPointData(JJIDIILjava/lang/String;)Lcom/huawei/hihealth/HiHealthData;
    .locals 1

    .line 80
    new-instance v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 81
    invoke-virtual {v0, p0, p1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 82
    invoke-virtual {v0, p2, p3}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 83
    invoke-virtual {v0, p4}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 84
    invoke-virtual {v0, p5, p6}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 85
    invoke-virtual {v0, p7}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 86
    invoke-virtual {v0, p9}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v0, p8}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 88
    return-object v0
.end method

.method private static construstSessionData(JJIILjava/lang/String;)Lcom/huawei/hihealth/HiHealthData;
    .locals 1

    .line 92
    new-instance v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 93
    invoke-virtual {v0, p0, p1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 94
    invoke-virtual {v0, p2, p3}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 95
    invoke-virtual {v0, p4}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 96
    invoke-virtual {v0, p6}, Lcom/huawei/hihealth/HiHealthData;->setTimeZone(Ljava/lang/String;)V

    .line 97
    invoke-virtual {v0, p5}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 98
    return-object v0
.end method

.method private static getHiHealthDataType(I)I
    .locals 2

    .line 103
    const/4 v1, 0x0

    .line 104
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 106
    :sswitch_0
    const/16 v1, 0x4e23

    .line 107
    goto :goto_0

    .line 109
    :sswitch_1
    const/16 v1, 0x4e22

    .line 110
    goto :goto_0

    .line 112
    :sswitch_2
    const/16 v1, 0x4e24

    .line 113
    goto :goto_0

    .line 115
    :sswitch_3
    const/16 v1, 0x4e25

    .line 116
    goto :goto_0

    .line 118
    :sswitch_4
    const/16 v1, 0x4e24

    .line 119
    goto :goto_0

    .line 121
    :sswitch_5
    const/16 v1, 0x4e26

    .line 122
    .line 126
    :goto_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x101 -> :sswitch_1
        0x102 -> :sswitch_0
        0x103 -> :sswitch_3
        0x104 -> :sswitch_2
        0x105 -> :sswitch_4
        0xb00 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public switchSportData(Lcom/huawei/hihealthservice/old/model/SportData;I)Ljava/util/List;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealthservice/old/model/SportData;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 32
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 33
    const/4 v0, 0x0

    return-object v0

    .line 35
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getStartTime()J

    move-result-wide v10

    .line 36
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getSteps()[I

    move-result-object v12

    .line 37
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getDistances()[I

    move-result-object v13

    .line 38
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getCalories()[I

    move-result-object v14

    .line 39
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getStoreys()[I

    move-result-object v15

    .line 40
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealthservice/old/model/SportData;->getSubType()I

    move-result v16

    .line 41
    array-length v0, v12

    move/from16 v17, v0

    .line 42
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cnk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 43
    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 51
    const/16 v29, 0x0

    :goto_0
    move/from16 v0, v29

    move/from16 v1, v17

    if-ge v0, v1, :cond_6

    .line 53
    move/from16 v0, v29

    int-to-long v0, v0

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    add-long v25, v10, v0

    .line 54
    const-wide/32 v0, 0xea60

    add-long v27, v25, v0

    .line 55
    aget v20, v12, v29

    .line 56
    if-lez v20, :cond_1

    .line 57
    move-wide/from16 v0, v25

    move-wide/from16 v2, v27

    move/from16 v4, v20

    int-to-double v5, v4

    move/from16 v8, p2

    move-object/from16 v9, v18

    const/4 v4, 0x2

    const/4 v7, 0x1

    invoke-static/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;->construstPointData(JJIDIILjava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    :cond_1
    aget v21, v13, v29

    .line 60
    if-lez v21, :cond_2

    .line 61
    move-wide/from16 v0, v25

    move-wide/from16 v2, v27

    move/from16 v4, v21

    int-to-double v5, v4

    move/from16 v8, p2

    move-object/from16 v9, v18

    const/4 v4, 0x3

    const/4 v7, 0x2

    invoke-static/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;->construstPointData(JJIDIILjava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    :cond_2
    aget v22, v14, v29

    .line 64
    if-lez v22, :cond_3

    .line 65
    move-wide/from16 v0, v25

    move-wide/from16 v2, v27

    move/from16 v4, v22

    int-to-double v5, v4

    move/from16 v8, p2

    move-object/from16 v9, v18

    const/4 v4, 0x4

    const/4 v7, 0x3

    invoke-static/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;->construstPointData(JJIDIILjava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    :cond_3
    aget v0, v15, v29

    mul-int/lit8 v23, v0, 0x1e

    .line 68
    if-lez v23, :cond_4

    .line 69
    move-wide/from16 v0, v25

    move-wide/from16 v2, v27

    move/from16 v4, v23

    int-to-double v5, v4

    move/from16 v8, p2

    move-object/from16 v9, v18

    const/4 v4, 0x5

    const/4 v7, 0x4

    invoke-static/range {v0 .. v9}, Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;->construstPointData(JJIDIILjava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    :cond_4
    invoke-static/range {v16 .. v16}, Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;->getHiHealthDataType(I)I

    move-result v24

    .line 72
    if-lez v24, :cond_5

    .line 73
    move-wide/from16 v0, v25

    move-wide/from16 v2, v27

    move/from16 v4, v24

    move/from16 v5, p2

    move-object/from16 v6, v18

    invoke-static/range {v0 .. v6}, Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;->construstSessionData(JJIILjava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    :cond_5
    add-int/lit8 v29, v29, 0x1

    goto/16 :goto_0

    .line 76
    :cond_6
    return-object v19
.end method

.method public switchSportDatas([Lcom/huawei/hihealthservice/old/model/SportData;I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Lcom/huawei/hihealthservice/old/model/SportData;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 20
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-gtz v0, :cond_1

    .line 21
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 23
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 25
    invoke-virtual {p0, v5, p2}, Lcom/huawei/hihealthservice/old/dataswitch/SportDataToHiHealthData;->switchSportData(Lcom/huawei/hihealthservice/old/model/SportData;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 24
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 27
    :cond_2
    return-object v1
.end method
