.class public Lo/csr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/csr;->c:Landroid/content/Context;

    .line 39
    return-void
.end method

.method private a(Ljava/util/List;IIII)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cob;>;IIII)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 105
    if-ltz p2, :cond_0

    .line 106
    int-to-double v0, p2

    const v2, 0xac4b

    const/16 v3, 0x10

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    :cond_0
    if-ltz p3, :cond_1

    .line 109
    int-to-double v0, p3

    const v2, 0xac4a

    const/16 v3, 0x10

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    :cond_1
    if-ltz p4, :cond_2

    .line 112
    int-to-double v0, p4

    const v2, 0xacb0

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    :cond_2
    if-ltz p5, :cond_3

    .line 115
    int-to-double v0, p5

    const v2, 0xac4c

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    :cond_3
    return-object p1
.end method

.method private a(Ljava/util/List;JJII)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cob;>;JJII)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 153
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_0

    .line 154
    long-to-double v0, p2

    const v2, 0xaca9

    const/4 v3, 0x5

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-ltz v0, :cond_1

    .line 157
    long-to-double v0, p4

    const v2, 0xacaa

    const/4 v3, 0x5

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    :cond_1
    if-ltz p6, :cond_2

    .line 160
    int-to-double v0, p6

    const v2, 0xacab

    const/16 v3, 0x11

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    :cond_2
    if-ltz p7, :cond_3

    .line 163
    int-to-double v0, p7

    const v2, 0xacac

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    :cond_3
    return-object p1
.end method

.method private b(Ljava/util/List;IIII)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cob;>;IIII)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 121
    if-ltz p2, :cond_0

    .line 122
    int-to-double v0, p2

    const v2, 0xac46

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    :cond_0
    if-ltz p3, :cond_1

    .line 125
    int-to-double v0, p3

    const v2, 0xac45

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    :cond_1
    if-ltz p4, :cond_2

    .line 128
    int-to-double v0, p4

    const v2, 0xac48

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    :cond_2
    if-ltz p5, :cond_3

    .line 131
    int-to-double v0, p5

    const v2, 0xac49

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    :cond_3
    return-object p1
.end method

.method private c(Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;I)Ljava/util/List;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;I)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 69
    if-nez p1, :cond_0

    .line 70
    const/4 v0, 0x0

    return-object v0

    .line 72
    :cond_0
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 73
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getFallAsleepTime()J

    move-result-wide v9

    .line 74
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getWakeupTime()J

    move-result-wide v11

    .line 75
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getSleepScore()I

    move-result v13

    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getSleepLatency()I

    move-result v14

    .line 77
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getGoBedTime()J

    move-result-wide v15

    .line 78
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getValidData()F

    move-result v17

    .line 79
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getSleepEfficiency()I

    move-result v18

    .line 80
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getLightSleepTime()I

    move-result v19

    .line 81
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getDeepSleepTime()I

    move-result v20

    .line 82
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getDreamTime()I

    move-result v21

    .line 83
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getAwakeTime()I

    move-result v22

    .line 84
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getAllSleepTime()I

    move-result v23

    .line 85
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getWakeupCnt()I

    move-result v24

    .line 86
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getDeepSleepPart()I

    move-result v25

    .line 87
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getSnoreFreq()I

    move-result v26

    .line 88
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->getDaySleepTime()I

    move-result v27

    .line 91
    invoke-static/range {p2 .. p2}, Lo/cnk;->b(I)J

    move-result-wide v28

    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long v0, v0, v28

    const-wide/32 v2, 0x337f9800

    cmp-long v0, v2, v0

    if-lez v0, :cond_1

    .line 93
    const-string v0, "HiH_CoreSleepSwitch"

    const/16 v1, 0x22

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recordday="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ":"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ","

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ","

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0xc

    aput-object v2, v1, v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0xe

    aput-object v2, v1, v3

    .line 94
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x10

    aput-object v2, v1, v3

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x11

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x12

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x13

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x14

    aput-object v2, v1, v3

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x15

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x16

    aput-object v2, v1, v3

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x17

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x18

    aput-object v2, v1, v3

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x19

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x1a

    aput-object v2, v1, v3

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x1b

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x1c

    aput-object v2, v1, v3

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x1d

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x1e

    aput-object v2, v1, v3

    .line 95
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x1f

    aput-object v2, v1, v3

    const-string v2, ","

    const/16 v3, 0x20

    aput-object v2, v1, v3

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x21

    aput-object v2, v1, v3

    .line 93
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    :cond_1
    move-object/from16 v0, p0

    move-object v1, v8

    move-wide v2, v9

    move-wide v4, v11

    move v6, v13

    move v7, v14

    invoke-direct/range {v0 .. v7}, Lo/csr;->a(Ljava/util/List;JJII)Ljava/util/List;

    move-result-object v8

    .line 98
    move-object/from16 v0, p0

    move-object v1, v8

    move-wide v2, v15

    move/from16 v4, v17

    move/from16 v5, v18

    move/from16 v6, v19

    invoke-direct/range {v0 .. v6}, Lo/csr;->e(Ljava/util/List;JFII)Ljava/util/List;

    move-result-object v8

    .line 99
    move-object/from16 v0, p0

    move-object v1, v8

    move/from16 v2, v20

    move/from16 v3, v21

    move/from16 v4, v22

    move/from16 v5, v23

    invoke-direct/range {v0 .. v5}, Lo/csr;->b(Ljava/util/List;IIII)Ljava/util/List;

    move-result-object v8

    .line 100
    move-object/from16 v0, p0

    move-object v1, v8

    move/from16 v2, v24

    move/from16 v3, v25

    move/from16 v4, v26

    move/from16 v5, v27

    invoke-direct/range {v0 .. v5}, Lo/csr;->a(Ljava/util/List;IIII)Ljava/util/List;

    move-result-object v8

    .line 101
    return-object v8
.end method

.method private e(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;
    .locals 3

    .line 187
    new-instance v2, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;

    invoke-direct {v2}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;-><init>()V

    .line 188
    const-string v0, "stat_out_core_sleep_fall_time"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setFallAsleepTime(J)V

    .line 189
    const-string v0, "stat_out_core_sleep_wake_up_time"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setWakeupTime(J)V

    .line 190
    const-string v0, "stat_out_core_sleep_score"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setSleepScore(I)V

    .line 191
    const-string v0, "stat_out_core_sleep_latency"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setSleepLatency(I)V

    .line 192
    const-string v0, "stat_out_core_sleep_go_bed_time"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setGoBedTime(J)V

    .line 193
    const-string v0, "stat_out_core_sleep_valid_data"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setValidData(F)V

    .line 194
    const-string v0, "stat_out_core_sleep_efficiency"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setSleepEfficiency(I)V

    .line 195
    const-string v0, "stat_core_sleep_shallow_duration"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setLightSleepTime(I)V

    .line 196
    const-string v0, "stat_core_sleep_deep_duration"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setDeepSleepTime(I)V

    .line 197
    const-string v0, "stat_core_sleep_dream_duration"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setDreamTime(I)V

    .line 198
    const-string v0, "stat_core_sleep_wake_duration"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setAwakeTime(I)V

    .line 199
    const-string v0, "stat_core_sleep_duration_sum"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setAllSleepTime(I)V

    .line 200
    const-string v0, "stat_core_sleep_wake_count"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setWakeupCnt(I)V

    .line 201
    const-string v0, "stat_core_sleep_deep_part_count"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setDeepSleepPart(I)V

    .line 202
    const-string v0, "stat_out_core_sleep_snore_freq"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setSnoreFreq(I)V

    .line 203
    const-string v0, "stat_core_sleep_noon_duration"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;->setDaySleepTime(I)V

    .line 204
    return-object v2
.end method

.method private e(Ljava/util/List;JFII)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cob;>;JFII)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 137
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_0

    .line 138
    long-to-double v0, p2

    const v2, 0xacad

    const/4 v3, 0x5

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, p4, v0

    if-ltz v0, :cond_1

    .line 141
    float-to-double v0, p4

    const v2, 0xacae

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    :cond_1
    if-ltz p5, :cond_2

    .line 144
    int-to-double v0, p5

    const v2, 0xacaf

    const/16 v3, 0x12

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    :cond_2
    if-ltz p6, :cond_3

    .line 147
    int-to-double v0, p6

    const v2, 0xac47

    const/16 v3, 0xf

    invoke-static {v2, v0, v1, v3}, Lo/cue;->b(IDI)Lo/cob;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    :cond_3
    return-object p1
.end method


# virtual methods
.method public a(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;>;"
        }
    .end annotation

    .line 169
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 171
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 172
    new-instance v6, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;

    invoke-direct {v6}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;-><init>()V

    .line 173
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->setTimeZone(Ljava/lang/String;)V

    .line 174
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->setRecordDay(I)V

    .line 175
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->setDataSource(I)V

    .line 176
    const-wide/16 v0, 0x0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->setDeviceCode(J)V

    .line 177
    const-string v0, "modified_time"

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->setGenerateTime(J)V

    .line 178
    invoke-direct {p0, v5}, Lo/csr;->e(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;

    move-result-object v3

    .line 179
    if-nez v3, :cond_0

    goto :goto_0

    .line 180
    :cond_0
    invoke-virtual {v6, v3}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->setProfessionalSleep(Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;)V

    .line 181
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    goto :goto_0

    .line 183
    :cond_1
    return-object v2
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;I)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 42
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->getDeviceCode()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 43
    const-string v0, "Debug_CoreSleepSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the sportTotal\'s deviceCode should be 0, deviceCode is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->getDeviceCode()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 46
    :cond_0
    iget-object v0, p0, Lo/csr;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lo/cqz;->e(III)Lo/crd;

    move-result-object v4

    .line 47
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 48
    const/4 v0, 0x0

    return-object v0

    .line 50
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->getRecordDay()I

    move-result v5

    .line 51
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->getProfessionalSleep()Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;

    move-result-object v0

    invoke-direct {p0, v0, v5}, Lo/csr;->c(Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleep;I)Ljava/util/List;

    move-result-object v6

    .line 52
    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 53
    :cond_2
    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_3
    invoke-virtual {v4}, Lo/crd;->a()I

    move-result v7

    .line 56
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->getTimeZone()Ljava/lang/String;

    move-result-object v8

    .line 57
    const/4 v9, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_4

    .line 58
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v7}, Lo/cob;->b(I)V

    .line 59
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v8}, Lo/cob;->e(Ljava/lang/String;)V

    .line 60
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, v5}, Lo/cob;->c(I)V

    .line 61
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cob;->f(I)V

    .line 62
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/ProfessionalSleepTotal;->getGenerateTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/cob;->e(J)V

    .line 63
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const/16 v1, 0x5654

    invoke-virtual {v0, v1}, Lo/cob;->d(I)V

    .line 57
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 65
    :cond_4
    return-object v6
.end method
