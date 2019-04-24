.class public Lo/csy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/csy$c;
    }
.end annotation


# static fields
.field private static d:Landroid/content/Context;


# instance fields
.field private a:Lo/cpw;

.field private e:Lo/cpu;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    sget-object v0, Lo/csy;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    iput-object v0, p0, Lo/csy;->e:Lo/cpu;

    .line 39
    sget-object v0, Lo/csy;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    iput-object v0, p0, Lo/csy;->a:Lo/cpw;

    .line 40
    return-void
.end method

.method synthetic constructor <init>(Lo/csy$3;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/csy;-><init>()V

    return-void
.end method

.method private c(JJLjava/lang/String;DI)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;
    .locals 2

    .line 129
    new-instance v1, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    invoke-direct {v1}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;-><init>()V

    .line 130
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->setStartTime(Ljava/lang/Long;)V

    .line 131
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->setEndTime(Ljava/lang/Long;)V

    .line 132
    invoke-static {p8}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->setUnit(Ljava/lang/String;)V

    .line 133
    invoke-static {p6, p7}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->setValue(Ljava/lang/String;)V

    .line 134
    invoke-virtual {v1, p5}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->setKey(Ljava/lang/String;)V

    .line 135
    return-object v1
.end method

.method private c(Ljava/util/List;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportDetail;>;"
        }
    .end annotation

    .line 194
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 195
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 197
    :cond_1
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 201
    iget-object v0, p0, Lo/csy;->a:Lo/cpw;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cpw;->f(I)Lo/crd;

    move-result-object v10

    .line 202
    const/4 v0, 0x0

    if-ne v0, v10, :cond_2

    .line 203
    const/4 v0, 0x0

    return-object v0

    .line 205
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 206
    new-instance v8, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;

    invoke-direct {v8}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;-><init>()V

    .line 207
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cva;->a(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setSportType(Ljava/lang/Integer;)V

    .line 208
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static/range {v0 .. v6}, Lo/cue;->d(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    move-result-object v9

    .line 209
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setStartTime(Ljava/lang/Long;)V

    .line 210
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setEndTime(Ljava/lang/Long;)V

    .line 211
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setTimeZone(Ljava/lang/String;)V

    .line 212
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setMetadata(Ljava/lang/String;)V

    .line 213
    invoke-virtual {v10}, Lo/crd;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setDeviceCode(Ljava/lang/Long;)V

    .line 214
    iget-object v0, p0, Lo/csy;->e:Lo/cpu;

    invoke-virtual {v10}, Lo/crd;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cpu;->c(I)Lcom/huawei/hihealth/HiAppInfo;

    move-result-object v13

    .line 215
    const/4 v0, 0x0

    if-ne v0, v13, :cond_3

    .line 216
    goto/16 :goto_0

    .line 218
    :cond_3
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    const/4 v1, 0x0

    aput-object v9, v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setSportBasicInfos([Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V

    .line 219
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cuz;->a(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setAppType(Ljava/lang/Integer;)V

    .line 220
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    goto/16 :goto_0

    .line 222
    :cond_4
    return-object v7
.end method

.method private e(Lcom/huawei/hihealth/HiHealthData;)Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;>;"
        }
    .end annotation

    .line 102
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 103
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v10

    .line 104
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v12

    .line 105
    move-object v0, p0

    move-wide v1, v10

    move-wide v3, v12

    const-string v5, "BASIC_STEP"

    const-string v6, "step"

    .line 106
    move-object/from16 v7, p1

    invoke-virtual {v7, v6}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 105
    const/4 v8, 0x1

    invoke-direct/range {v0 .. v8}, Lo/csy;->c(JJLjava/lang/String;DI)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v14

    .line 107
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    move-object v0, p0

    move-wide v1, v10

    move-wide v3, v12

    const-string v5, "BASIC_DISTANCE"

    const-string v6, "calorie"

    .line 110
    move-object/from16 v7, p1

    invoke-virtual {v7, v6}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 109
    const/4 v8, 0x3

    invoke-direct/range {v0 .. v8}, Lo/csy;->c(JJLjava/lang/String;DI)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v14

    .line 111
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    move-object v0, p0

    move-wide v1, v10

    move-wide v3, v12

    const-string v5, "BASIC_CALORIE"

    const-string v6, "distance"

    .line 114
    move-object/from16 v7, p1

    invoke-virtual {v7, v6}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 113
    const/4 v8, 0x2

    invoke-direct/range {v0 .. v8}, Lo/csy;->c(JJLjava/lang/String;DI)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v14

    .line 115
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    move-object v0, p0

    move-wide v1, v10

    move-wide v3, v12

    const-string v5, "BASIC_ALTITUDE"

    const-string v6, "altitude_offset"

    .line 118
    move-object/from16 v7, p1

    invoke-virtual {v7, v6}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 117
    const/4 v8, 0x4

    invoke-direct/range {v0 .. v8}, Lo/csy;->c(JJLjava/lang/String;DI)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v14

    .line 119
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    move-object v0, p0

    move-wide v1, v10

    move-wide v3, v12

    const-string v5, "BASIC_SESSION_TYPE"

    .line 122
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v6

    int-to-double v6, v6

    .line 121
    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lo/csy;->c(JJLjava/lang/String;DI)Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    move-result-object v14

    .line 123
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    return-object v9
.end method

.method private e(Ljava/util/List;)Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportDetail;>;"
        }
    .end annotation

    .line 139
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 140
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 142
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 150
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 151
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;-><init>()V

    .line 152
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-static {v0}, Lo/cva;->a(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setSportType(Ljava/lang/Integer;)V

    .line 153
    const/4 v0, 0x1

    new-array v6, v0, [Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    .line 154
    new-instance v7, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;-><init>()V

    .line 155
    const-string v0, "step"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 156
    const-string v0, "calorie"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 157
    const-string v0, "altitude_offset"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v11

    .line 159
    invoke-static {v9}, Lo/cno;->e(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {v10}, Lo/cno;->c(I)Z

    move-result v0

    if-eqz v0, :cond_2

    float-to-double v0, v11

    invoke-static {v0, v1}, Lo/cno;->b(D)Z

    move-result v0

    if-nez v0, :cond_3

    .line 160
    :cond_2
    const-string v0, "Debug_SportDataSwtich"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "localSportToCloud data is out of rang data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    goto/16 :goto_0

    .line 163
    :cond_3
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configSteps(Ljava/lang/Integer;)V

    .line 164
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configCalorie(Ljava/lang/Integer;)V

    .line 165
    const/high16 v0, 0x41200000    # 10.0f

    div-float v0, v11, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configAltitude(Ljava/lang/Float;)V

    .line 166
    const-string v0, "distance"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configDistance(Ljava/lang/Integer;)V

    .line 167
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configFloor(Ljava/lang/Integer;)V

    .line 169
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->configDuration(Ljava/lang/Integer;)V

    .line 171
    const/4 v0, 0x0

    aput-object v7, v6, v0

    .line 172
    invoke-virtual {v5, v6}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setSportBasicInfos([Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V

    .line 173
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setStartTime(Ljava/lang/Long;)V

    .line 174
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setEndTime(Ljava/lang/Long;)V

    .line 175
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setTimeZone(Ljava/lang/String;)V

    .line 176
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setMetadata(Ljava/lang/String;)V

    .line 177
    iget-object v0, p0, Lo/csy;->a:Lo/cpw;

    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cpw;->f(I)Lo/crd;

    move-result-object v8

    .line 178
    const/4 v0, 0x0

    if-ne v0, v8, :cond_4

    .line 179
    goto/16 :goto_0

    .line 181
    :cond_4
    invoke-virtual {v8}, Lo/crd;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setDeviceCode(Ljava/lang/Long;)V

    .line 182
    iget-object v0, p0, Lo/csy;->e:Lo/cpu;

    invoke-virtual {v8}, Lo/crd;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cpu;->c(I)Lcom/huawei/hihealth/HiAppInfo;

    move-result-object v14

    .line 183
    const/4 v0, 0x0

    if-ne v0, v14, :cond_5

    .line 184
    goto/16 :goto_0

    .line 186
    :cond_5
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cuz;->a(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setAppType(Ljava/lang/Integer;)V

    .line 187
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    goto/16 :goto_0

    .line 189
    :cond_6
    return-object v4
.end method

.method public static e(Landroid/content/Context;)Lo/csy;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 50
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/csy;->d:Landroid/content/Context;

    .line 51
    sget-object v0, Lo/csy$c;->e:Lo/csy;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportDetail;>;"
        }
    .end annotation

    .line 65
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 66
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 73
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 74
    if-nez v7, :cond_2

    .line 75
    goto :goto_0

    .line 77
    :cond_2
    invoke-direct {p0, v7}, Lo/csy;->e(Lcom/huawei/hihealth/HiHealthData;)Ljava/util/List;

    move-result-object v3

    .line 78
    new-instance v4, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;-><init>()V

    .line 79
    invoke-virtual {v4, v3}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setSamplePoints(Ljava/util/List;)V

    .line 80
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setStartTime(Ljava/lang/Long;)V

    .line 81
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setEndTime(Ljava/lang/Long;)V

    .line 82
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setTimeZone(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setMetadata(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lo/csy;->a:Lo/cpw;

    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cpw;->f(I)Lo/crd;

    move-result-object v5

    .line 85
    if-nez v5, :cond_3

    .line 86
    goto :goto_0

    .line 88
    :cond_3
    invoke-virtual {v5}, Lo/crd;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setDeviceCode(Ljava/lang/Long;)V

    .line 89
    iget-object v0, p0, Lo/csy;->e:Lo/cpu;

    invoke-virtual {v5}, Lo/crd;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cpu;->c(I)Lcom/huawei/hihealth/HiAppInfo;

    move-result-object v8

    .line 90
    if-nez v8, :cond_4

    .line 91
    goto/16 :goto_0

    .line 93
    :cond_4
    invoke-virtual {v8}, Lcom/huawei/hihealth/HiAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cuz;->a(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->setAppType(Ljava/lang/Integer;)V

    .line 94
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    goto/16 :goto_0

    .line 97
    :cond_5
    return-object v2
.end method

.method public e(Ljava/util/List;I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportDetail;>;"
        }
    .end annotation

    .line 54
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 56
    :sswitch_0
    invoke-direct {p0, p1}, Lo/csy;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 58
    :sswitch_1
    invoke-direct {p0, p1}, Lo/csy;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 60
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method
