.class public Lo/dwx;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;Landroid/content/Context;)V
    .locals 8

    .line 34
    const-string v0, "personal"

    invoke-static {p2, v0}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 35
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    const-string v1, "flag is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    return-void

    .line 39
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v4

    .line 40
    const/4 v5, 0x0

    .line 41
    instance-of v0, v4, Lo/dwm;

    if-eqz v0, :cond_1

    .line 42
    move-object v5, v4

    check-cast v5, Lo/dwm;

    .line 44
    :cond_1
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 45
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    const-string v1, "singleDayRecord is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    return-void

    .line 48
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireType()I

    move-result v6

    .line 49
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireDistance()F

    move-result v7

    .line 50
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "==trackType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "===distance="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-static {v6}, Lo/dxc;->e(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 52
    invoke-static {v5, p0, p1}, Lo/dwx;->b(Lo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;)V

    goto :goto_0

    .line 53
    :cond_3
    invoke-static {v6}, Lo/dxc;->c(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 54
    invoke-static {v5, p0, p1}, Lo/dwx;->a(Lo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;)V

    goto :goto_0

    .line 56
    :cond_4
    invoke-static {v5, p0, p1}, Lo/dwx;->c(Lo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;)V

    .line 58
    :goto_0
    return-void
.end method

.method private static a(Lo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;)V
    .locals 12

    .line 68
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireDistance()F

    move-result v6

    .line 69
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireBestPace()F

    move-result v7

    .line 70
    invoke-virtual {p0}, Lo/dwm;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->a(Ljava/lang/String;)Lo/dyx;

    move-result-object v8

    .line 71
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v0

    invoke-virtual {v8}, Lo/dyx;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 72
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "distance="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    invoke-static {v6}, Lo/dzr;->e(F)D

    move-result-wide v0

    invoke-virtual {v8}, Lo/dyx;->c()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Lo/dzr;->b(DD)I

    move-result v0

    if-lez v0, :cond_1

    .line 74
    const/16 v0, 0xa

    invoke-static {p1, p2, p0, v0}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;Lo/dwm;I)V

    goto :goto_0

    .line 77
    :cond_0
    const/16 v0, 0xa

    invoke-static {p1, p0, p2, v0}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwm;Lo/dwr;I)V

    .line 79
    :cond_1
    :goto_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v6, v0

    if-gez v0, :cond_2

    .line 80
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    const-string v1, "distanc<1"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    return-void

    .line 83
    :cond_2
    invoke-static {v7}, Lo/dzr;->e(F)D

    move-result-wide v9

    .line 84
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, v9

    if-nez v0, :cond_3

    .line 85
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    const-string v1, "bestPace is 0"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    return-void

    .line 88
    :cond_3
    invoke-virtual {p0}, Lo/dwm;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->e(Ljava/lang/String;)Lo/dyv;

    move-result-object v11

    .line 89
    const/4 v0, 0x0

    if-eq v0, v11, :cond_4

    .line 90
    invoke-virtual {v11}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-static {v9, v10, v0, v1}, Lo/dzr;->e(DD)I

    move-result v0

    if-gez v0, :cond_5

    .line 91
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bestPace="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Lo/dyv;->c()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    move-object v0, p1

    float-to-double v1, v7

    move-object v3, p2

    move-object v4, p0

    const/16 v5, 0xb

    invoke-static/range {v0 .. v5}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;DLo/dwr;Lo/dwm;I)V

    goto :goto_1

    .line 95
    :cond_4
    float-to-double v0, v7

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    const/16 v5, 0xb

    invoke-static/range {v0 .. v5}, Lo/dwx;->b(DLo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;I)V

    .line 97
    :cond_5
    :goto_1
    return-void
.end method

.method private static b(DLo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;I)V
    .locals 4

    .line 323
    new-instance v2, Lo/dyv;

    invoke-direct {v2}, Lo/dyv;-><init>()V

    .line 324
    invoke-virtual {v2, p0, p1}, Lo/dyv;->d(D)V

    .line 325
    invoke-virtual {p3}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/dyv;->b(J)V

    .line 326
    invoke-virtual {p3}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireEndTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/dyv;->a(J)V

    .line 327
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/dyv;->c(I)V

    .line 328
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lo/dyv;->c(J)V

    .line 329
    invoke-static {v2}, Lo/dzr;->b(Lo/dyv;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v3, ""

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lo/dzr;->b(Lo/dyv;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->c(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 330
    :goto_0
    invoke-static {p5, p2, v3}, Lo/dzr;->e(ILo/dwm;Ljava/lang/String;)Lo/dwm;

    move-result-object v0

    invoke-virtual {p4, v0}, Lo/dwr;->d(Lo/dvf;)Z

    .line 331
    return-void
.end method

.method private static b(Lo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;)V
    .locals 16

    .line 107
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireDistance()F

    move-result v6

    .line 108
    invoke-virtual/range {p0 .. p0}, Lo/dwm;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->a(Ljava/lang/String;)Lo/dyx;

    move-result-object v7

    .line 109
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v0

    invoke-virtual {v7}, Lo/dyx;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 110
    invoke-static {v6}, Lo/dzr;->e(F)D

    move-result-wide v0

    invoke-virtual {v7}, Lo/dyx;->c()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Lo/dzr;->b(DD)I

    move-result v0

    if-lez v0, :cond_1

    .line 111
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p0

    const/4 v3, 0x3

    invoke-static {v0, v1, v2, v3}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;Lo/dwm;I)V

    goto :goto_0

    .line 114
    :cond_0
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    const/4 v3, 0x3

    invoke-static {v0, v1, v2, v3}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwm;Lo/dwr;I)V

    .line 117
    :cond_1
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireBestPace()F

    move-result v8

    .line 118
    invoke-static {v8}, Lo/dzr;->e(F)D

    move-result-wide v9

    .line 119
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, v9

    if-nez v0, :cond_2

    .line 120
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    const-string v1, "bestPace is 0"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    return-void

    .line 123
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lo/dwm;->t()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->e(Ljava/lang/String;)Lo/dyv;

    move-result-object v11

    .line 124
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bestPaceD="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const/4 v0, 0x0

    if-eq v0, v11, :cond_3

    .line 126
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " bestMotionPace="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Lo/dyv;->c()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    invoke-virtual {v11}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-static {v9, v10, v0, v1}, Lo/dzr;->e(DD)I

    move-result v0

    if-gez v0, :cond_4

    .line 128
    move-object/from16 v0, p1

    float-to-double v1, v8

    move-object/from16 v3, p2

    move-object/from16 v4, p0

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;DLo/dwr;Lo/dwm;I)V

    goto :goto_1

    .line 131
    :cond_3
    move-wide v0, v9

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Lo/dwx;->b(DLo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;I)V

    .line 134
    :cond_4
    :goto_1
    float-to-double v0, v6

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_5

    .line 135
    return-void

    .line 137
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquirePartTimeMap()Ljava/util/Map;

    move-result-object v12

    .line 138
    const/4 v0, 0x0

    if-ne v0, v12, :cond_6

    .line 139
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    const-string v1, "map is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    return-void

    .line 142
    :cond_6
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 143
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    .line 144
    invoke-virtual/range {p0 .. p0}, Lo/dwm;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->e(Ljava/lang/String;)Lo/dyv;

    move-result-object v15

    .line 145
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "THREE_KM pace="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const/4 v0, 0x0

    if-eq v0, v15, :cond_7

    .line 147
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " bestMotionPace="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v15}, Lo/dyv;->c()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    invoke-virtual {v15}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-static {v13, v14, v0, v1}, Lo/dzr;->e(DD)I

    move-result v0

    if-gez v0, :cond_8

    .line 149
    move-object/from16 v0, p1

    move-wide v1, v13

    move-object/from16 v3, p2

    move-object/from16 v4, p0

    const/4 v5, 0x5

    invoke-static/range {v0 .. v5}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;DLo/dwr;Lo/dwm;I)V

    goto :goto_2

    .line 152
    :cond_7
    move-wide v0, v13

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    const/4 v5, 0x5

    invoke-static/range {v0 .. v5}, Lo/dwx;->b(DLo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;I)V

    .line 154
    :cond_8
    :goto_2
    goto :goto_3

    .line 155
    :cond_9
    return-void

    .line 157
    :goto_3
    const-wide/high16 v0, 0x4014000000000000L    # 5.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 158
    const-wide/high16 v0, 0x4014000000000000L    # 5.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    .line 159
    invoke-virtual/range {p0 .. p0}, Lo/dwm;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->e(Ljava/lang/String;)Lo/dyv;

    move-result-object v15

    .line 160
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FIVE_KM pace="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    const/4 v0, 0x0

    if-eq v0, v15, :cond_a

    .line 162
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " bestMotionPace="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v15}, Lo/dyv;->c()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    invoke-virtual {v15}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-static {v13, v14, v0, v1}, Lo/dzr;->e(DD)I

    move-result v0

    if-gez v0, :cond_b

    .line 164
    move-object/from16 v0, p1

    move-wide v1, v13

    move-object/from16 v3, p2

    move-object/from16 v4, p0

    const/4 v5, 0x6

    invoke-static/range {v0 .. v5}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;DLo/dwr;Lo/dwm;I)V

    goto :goto_4

    .line 167
    :cond_a
    move-wide v0, v13

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    const/4 v5, 0x6

    invoke-static/range {v0 .. v5}, Lo/dwx;->b(DLo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;I)V

    .line 169
    :cond_b
    :goto_4
    goto :goto_5

    .line 170
    :cond_c
    return-void

    .line 173
    :goto_5
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 174
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    .line 175
    invoke-virtual/range {p0 .. p0}, Lo/dwm;->n()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->e(Ljava/lang/String;)Lo/dyv;

    move-result-object v15

    .line 176
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TEN_KM pace="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const/4 v0, 0x0

    if-eq v0, v15, :cond_d

    .line 178
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " bestMotionPace="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v15}, Lo/dyv;->c()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    invoke-virtual {v15}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-static {v13, v14, v0, v1}, Lo/dzr;->e(DD)I

    move-result v0

    if-gez v0, :cond_e

    .line 180
    move-object/from16 v0, p1

    move-wide v1, v13

    move-object/from16 v3, p2

    move-object/from16 v4, p0

    const/4 v5, 0x7

    invoke-static/range {v0 .. v5}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;DLo/dwr;Lo/dwm;I)V

    goto :goto_6

    .line 183
    :cond_d
    move-wide v0, v13

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    const/4 v5, 0x7

    invoke-static/range {v0 .. v5}, Lo/dwx;->b(DLo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;I)V

    .line 185
    :cond_e
    :goto_6
    goto :goto_7

    .line 186
    :cond_f
    return-void

    .line 189
    :goto_7
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_12

    .line 190
    const-wide v0, 0x403518f5c28f5c29L    # 21.0975

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    .line 191
    invoke-virtual/range {p0 .. p0}, Lo/dwm;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->e(Ljava/lang/String;)Lo/dyv;

    move-result-object v15

    .line 192
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HM pace="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    const/4 v0, 0x0

    if-eq v0, v15, :cond_10

    .line 194
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " bestMotionPace="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v15}, Lo/dyv;->c()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    invoke-virtual {v15}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-static {v13, v14, v0, v1}, Lo/dzr;->e(DD)I

    move-result v0

    if-gez v0, :cond_11

    .line 196
    invoke-virtual {v15}, Lo/dyv;->d()J

    move-result-wide v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_11

    .line 197
    move-object/from16 v0, p1

    move-wide v1, v13

    move-object/from16 v3, p2

    move-object/from16 v4, p0

    const/16 v5, 0x8

    invoke-static/range {v0 .. v5}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;DLo/dwr;Lo/dwm;I)V

    goto :goto_8

    .line 200
    :cond_10
    move-wide v0, v13

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    const/16 v5, 0x8

    invoke-static/range {v0 .. v5}, Lo/dwx;->b(DLo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;I)V

    .line 202
    :cond_11
    :goto_8
    goto :goto_9

    .line 203
    :cond_12
    return-void

    .line 207
    :goto_9
    const-wide v0, 0x404518f5c28f5c29L    # 42.195

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_15

    .line 208
    const-wide v0, 0x404518f5c28f5c29L    # 42.195

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    .line 209
    invoke-virtual/range {p0 .. p0}, Lo/dwm;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->e(Ljava/lang/String;)Lo/dyv;

    move-result-object v15

    .line 210
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FM pace="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    const/4 v0, 0x0

    if-eq v0, v15, :cond_13

    .line 212
    const-string v0, "PLGACHIEVE_AchieveSurmountRecordService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " bestMotionPace="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v15}, Lo/dyv;->c()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    invoke-virtual {v15}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-static {v13, v14, v0, v1}, Lo/dzr;->e(DD)I

    move-result v0

    if-gez v0, :cond_14

    .line 214
    invoke-virtual {v15}, Lo/dyv;->d()J

    move-result-wide v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_14

    .line 215
    move-object/from16 v0, p1

    move-wide v1, v13

    move-object/from16 v3, p2

    move-object/from16 v4, p0

    const/16 v5, 0x9

    invoke-static/range {v0 .. v5}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;DLo/dwr;Lo/dwm;I)V

    goto :goto_a

    .line 218
    :cond_13
    move-wide v0, v13

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    const/16 v5, 0x9

    invoke-static/range {v0 .. v5}, Lo/dwx;->b(DLo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;I)V

    .line 220
    :cond_14
    :goto_a
    goto :goto_b

    .line 221
    :cond_15
    return-void

    .line 224
    :goto_b
    return-void
.end method

.method private static c(Lo/dwm;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;)V
    .locals 8

    .line 235
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireDistance()F

    move-result v6

    .line 237
    invoke-virtual {p0}, Lo/dwm;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->a(Ljava/lang/String;)Lo/dyx;

    move-result-object v7

    .line 238
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v0

    invoke-virtual {v7}, Lo/dyx;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 239
    float-to-double v0, v6

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    invoke-virtual {v7}, Lo/dyx;->c()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Lo/dzr;->b(DD)I

    move-result v0

    if-lez v0, :cond_1

    .line 240
    const/4 v0, 0x1

    invoke-static {p1, p2, p0, v0}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;Lo/dwm;I)V

    goto :goto_0

    .line 243
    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, p0, p2, v0}, Lo/dwx;->d(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwm;Lo/dwr;I)V

    .line 245
    :cond_1
    :goto_0
    return-void
.end method

.method private static d(Lcom/huawei/pluginachievement/manager/model/TrackData;DLo/dwr;Lo/dwm;I)V
    .locals 5

    .line 281
    new-instance v3, Lo/dyv;

    invoke-direct {v3}, Lo/dyv;-><init>()V

    .line 282
    invoke-virtual {v3, p1, p2}, Lo/dyv;->d(D)V

    .line 283
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dyv;->b(J)V

    .line 284
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireEndTime()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dyv;->a(J)V

    .line 285
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/dyv;->c(I)V

    .line 286
    const-wide/16 v0, 0x0

    invoke-virtual {v3, v0, v1}, Lo/dyv;->c(J)V

    .line 287
    invoke-static {p5, p4}, Lo/dzr;->e(ILo/dwm;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lo/dzr;->a(Ljava/lang/String;Lo/dyy;)Ljava/lang/String;

    move-result-object v4

    .line 288
    invoke-static {p5, p4, v4}, Lo/dzr;->e(ILo/dwm;Ljava/lang/String;)Lo/dwm;

    move-result-object v0

    invoke-virtual {p3, v0}, Lo/dwr;->d(Lo/dvf;)Z

    .line 289
    invoke-static {p5}, Lo/dzr;->g(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 290
    invoke-static {p1, p2}, Lo/dzr;->b(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v1

    invoke-virtual {p3, p5, v0, v1, v2}, Lo/dwr;->a(ILjava/lang/String;J)V

    goto :goto_0

    .line 292
    :cond_0
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, p1

    double-to-int v0, v0

    invoke-static {v0}, Lo/dzr;->i(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v1

    invoke-virtual {p3, p5, v0, v1, v2}, Lo/dwr;->a(ILjava/lang/String;J)V

    .line 294
    :goto_0
    return-void
.end method

.method private static d(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwm;Lo/dwr;I)V
    .locals 4

    .line 304
    new-instance v2, Lo/dyx;

    invoke-direct {v2}, Lo/dyx;-><init>()V

    .line 305
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireDistance()F

    move-result v0

    float-to-long v0, v0

    invoke-virtual {v2, v0, v1}, Lo/dyx;->c(J)V

    .line 306
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/dyx;->b(J)V

    .line 307
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireEndTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/dyx;->a(J)V

    .line 308
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/dyx;->d(I)V

    .line 309
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lo/dyx;->e(J)V

    .line 310
    invoke-static {v2}, Lo/dzr;->e(Lo/dyx;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v3, ""

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lo/dzr;->e(Lo/dyx;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->c(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 311
    :goto_0
    invoke-static {p3, p1, v3}, Lo/dzr;->e(ILo/dwm;Ljava/lang/String;)Lo/dwm;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/dwr;->d(Lo/dvf;)Z

    .line 312
    return-void
.end method

.method private static d(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;Lo/dwm;I)V
    .locals 5

    .line 257
    new-instance v2, Lo/dyx;

    invoke-direct {v2}, Lo/dyx;-><init>()V

    .line 258
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireDistance()F

    move-result v0

    float-to-long v0, v0

    invoke-virtual {v2, v0, v1}, Lo/dyx;->c(J)V

    .line 259
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/dyx;->b(J)V

    .line 260
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireEndTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/dyx;->a(J)V

    .line 261
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/dyx;->d(I)V

    .line 262
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lo/dyx;->e(J)V

    .line 263
    invoke-static {p3, p2}, Lo/dzr;->e(ILo/dwm;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lo/dzr;->a(Ljava/lang/String;Lo/dyy;)Ljava/lang/String;

    move-result-object v3

    .line 264
    invoke-static {p3, p2, v3}, Lo/dzr;->e(ILo/dwm;Ljava/lang/String;)Lo/dwm;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/dwr;->d(Lo/dvf;)Z

    .line 265
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireDistance()F

    move-result v0

    float-to-long v0, v0

    invoke-static {v0, v1}, Lo/dzr;->e(J)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v4

    .line 266
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 267
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireDistance()F

    move-result v0

    float-to-long v0, v0

    invoke-static {v0, v1}, Lo/dzr;->d(J)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v4

    .line 269
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v0

    invoke-virtual {p1, p3, v4, v0, v1}, Lo/dwr;->a(ILjava/lang/String;J)V

    .line 270
    return-void
.end method
