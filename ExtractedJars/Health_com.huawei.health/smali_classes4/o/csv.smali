.class public Lo/csv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Lo/crc;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/csv;->e:Landroid/content/Context;

    .line 42
    iget-object v0, p0, Lo/csv;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/crc;->b(Landroid/content/Context;)Lo/crc;

    move-result-object v0

    iput-object v0, p0, Lo/csv;->d:Lo/crc;

    .line 43
    return-void
.end method

.method private b(Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;II)Lcom/huawei/hihealth/HiHealthData;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 124
    sparse-switch p3, :sswitch_data_0

    goto :goto_0

    .line 126
    :sswitch_0
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lo/csv;->b(Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;I)Lcom/huawei/hihealth/HiHealthData;
    :try_end_0
    .catch Lo/csq; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 128
    :sswitch_1
    :try_start_1
    invoke-virtual {p0, p1, p2}, Lo/csv;->c(Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;I)Lcom/huawei/hihealth/HiHealthData;
    :try_end_1
    .catch Lo/csq; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    return-object v0

    .line 130
    :goto_0
    const-string v0, "Debug_MotionPathDataSwitch"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "oneCloudTrackToLocal no such hiSyncModel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lo/csq; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 131
    const/4 v0, 0x0

    return-object v0

    .line 134
    :catch_0
    move-exception v4

    .line 135
    throw v4

    .line 137
    :catch_1
    move-exception v4

    .line 138
    const-string v0, "Debug_MotionPathDataSwitch"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "oneCloudTrackToLocal e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " error track is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    const/4 v0, 0x0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 77
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 78
    const/4 v0, 0x0

    return v0

    .line 80
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v4

    .line 81
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 82
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 85
    :cond_2
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 86
    const-string v0, "\n"

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 87
    const/4 v7, 0x0

    .line 88
    const/4 v8, 0x0

    :goto_0
    array-length v0, v6

    if-ge v8, v0, :cond_8

    .line 89
    aget-object v9, v6, v8

    .line 90
    const-string v0, ";"

    invoke-virtual {v9, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 91
    array-length v11, v10

    .line 92
    const-string v0, "tp=lbs"

    invoke-virtual {v9, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 93
    add-int/lit8 v0, v11, -0x2

    new-array v12, v0, [D

    .line 94
    const/4 v0, 0x1

    aget-object v0, v10, v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v13

    .line 95
    const/4 v15, 0x2

    :goto_1
    if-ge v15, v11, :cond_3

    .line 96
    add-int/lit8 v0, v15, -0x2

    aget-object v1, v10, v15

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1

    aput-wide v1, v12, v0

    .line 95
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 99
    :cond_3
    if-nez v7, :cond_6

    .line 100
    const/4 v0, 0x0

    aget-wide v0, v12, v0

    const/4 v2, 0x1

    aget-wide v2, v12, v2

    invoke-static {v0, v1, v2, v3}, Lo/cuf;->e(DD)I

    move-result v15

    .line 101
    const/4 v0, 0x3

    if-eq v0, v15, :cond_4

    const/4 v0, 0x1

    if-ne v0, v15, :cond_5

    .line 102
    :cond_4
    const/4 v7, 0x1

    goto :goto_2

    .line 104
    :cond_5
    const/4 v0, 0x0

    return v0

    .line 107
    :cond_6
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/csv;->e:Landroid/content/Context;

    invoke-static {v0, v12}, Lo/cui;->c(Landroid/content/Context;[D)[D

    move-result-object v12

    .line 108
    new-instance v15, Ljava/lang/StringBuffer;

    invoke-direct {v15}, Ljava/lang/StringBuffer;-><init>()V

    .line 109
    const-string v0, "tp=lbs"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "lat="

    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x0

    aget-wide v1, v12, v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "lon="

    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x1

    aget-wide v1, v12, v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "alt="

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x2

    aget-wide v1, v12, v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "t="

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x3

    aget-wide v1, v12, v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 114
    invoke-virtual {v15}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v9

    .line 116
    :cond_7
    invoke-virtual {v5, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 88
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 118
    :cond_8
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 119
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(Ljava/util/List;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;>;"
        }
    .end annotation

    .line 144
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 146
    :sswitch_0
    iget-object v0, p0, Lo/csv;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ctb;->a(Landroid/content/Context;)Lo/ctb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ctb;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 148
    :sswitch_1
    iget-object v0, p0, Lo/csv;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ctb;->a(Landroid/content/Context;)Lo/ctb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ctb;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 150
    :goto_0
    const-string v0, "Debug_MotionPathDataSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "localTrackToCloud no such hiSyncModel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    const/4 v0, 0x0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method public b(Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;I)Lcom/huawei/hihealth/HiHealthData;
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 157
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 158
    const/4 v0, 0x0

    return-object v0

    .line 160
    :cond_0
    iget-object v0, p0, Lo/csv;->d:Lo/crc;

    iget-object v1, p0, Lo/csv;->e:Landroid/content/Context;

    invoke-static {v1}, Lo/cui;->e(Landroid/content/Context;)I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getDeviceCode()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move/from16 v4, p2

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/crc;->d(IIJ)Lo/crd;

    move-result-object v5

    .line 161
    if-nez v5, :cond_1

    .line 162
    const/4 v0, 0x0

    return-object v0

    .line 164
    :cond_1
    iget-object v0, p0, Lo/csv;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ctb;->a(Landroid/content/Context;)Lo/ctb;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v0, v5, v1}, Lo/ctb;->c(Lo/crd;Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v6

    .line 165
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getAttribute()Ljava/lang/String;

    move-result-object v7

    .line 166
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "(null)"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 167
    :cond_2
    new-instance v8, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-direct {v8}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;-><init>()V

    .line 168
    iget-object v0, p0, Lo/csv;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ctb;->a(Landroid/content/Context;)Lo/ctb;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v0, v8, v1}, Lo/ctb;->d(Lcom/huawei/hihealth/data/model/HiTrackMetaData;Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;)Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;

    move-result-object v9

    .line 169
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v8, v0}, Lo/cnj;->d(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 170
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getLocation()Ljava/util/List;

    move-result-object v10

    .line 171
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 173
    if-eqz v10, :cond_3

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 174
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/hwcloudmodel/model/unite/Location;

    .line 175
    const/4 v0, 0x4

    new-array v12, v0, [D

    .line 176
    invoke-virtual {v14}, Lcom/huawei/hwcloudmodel/model/unite/Location;->getLatitude()D

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, v12, v2

    .line 177
    invoke-virtual {v14}, Lcom/huawei/hwcloudmodel/model/unite/Location;->getLongitude()D

    move-result-wide v0

    const/4 v2, 0x1

    aput-wide v0, v12, v2

    .line 178
    invoke-virtual {v14}, Lcom/huawei/hwcloudmodel/model/unite/Location;->getAltitude()D

    move-result-wide v0

    const/4 v2, 0x2

    aput-wide v0, v12, v2

    .line 179
    invoke-virtual {v14}, Lcom/huawei/hwcloudmodel/model/unite/Location;->getTimestamp()Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v11, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    goto :goto_0

    .line 182
    :cond_3
    invoke-virtual {v9, v11}, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->setLbsDataMap(Ljava/util/Map;)V

    .line 183
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getHeartRateList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->setHeartRateList(Ljava/util/List;)V

    .line 184
    invoke-virtual {v9}, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 185
    goto/16 :goto_1

    .line 188
    :cond_4
    const-string v0, "&&"

    invoke-virtual {v7, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 189
    const/4 v9, 0x0

    .line 190
    const/4 v10, 0x0

    .line 191
    array-length v0, v8

    const/4 v1, 0x1

    if-le v0, v1, :cond_6

    .line 192
    const/4 v0, 0x0

    aget-object v11, v8, v0

    .line 193
    const-string v0, "@is"

    invoke-virtual {v11, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    .line 194
    array-length v0, v12

    const/4 v1, 0x1

    if-le v0, v1, :cond_5

    .line 195
    const/4 v0, 0x1

    aget-object v9, v12, v0

    .line 196
    invoke-virtual {v6, v9}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 198
    :cond_5
    const/4 v0, 0x1

    aget-object v13, v8, v0

    .line 199
    const-string v0, "@is"

    invoke-virtual {v13, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    .line 200
    array-length v0, v14

    const/4 v1, 0x1

    if-le v0, v1, :cond_6

    .line 201
    const/4 v0, 0x1

    aget-object v10, v14, v0

    .line 202
    invoke-virtual {v6, v10}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 205
    :cond_6
    invoke-static {v9}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {v10}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 206
    :cond_7
    const-string v0, "Debug_MotionPathDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "oneCloudTrackToLocalByUnite sequenceData or metaData is null , cloudTrack is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getRecordId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    const/4 v0, 0x0

    return-object v0

    .line 210
    :cond_8
    :goto_1
    return-object v6
.end method

.method public c(Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;I)Lcom/huawei/hihealth/HiHealthData;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 214
    iget-object v0, p0, Lo/csv;->d:Lo/crc;

    iget-object v1, p0, Lo/csv;->e:Landroid/content/Context;

    invoke-static {v1}, Lo/cui;->e(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getDeviceCode()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0, v1, p2, v2, v3}, Lo/crc;->d(IIJ)Lo/crd;

    move-result-object v4

    .line 215
    if-nez v4, :cond_0

    .line 216
    const/4 v0, 0x0

    return-object v0

    .line 218
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;->getSamplePoints()Ljava/util/List;

    move-result-object v5

    .line 219
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 220
    :cond_2
    const/4 v6, 0x0

    .line 221
    const/4 v7, 0x0

    .line 222
    const/4 v8, 0x0

    :goto_0
    const/4 v0, 0x2

    if-ge v8, v0, :cond_6

    .line 223
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getKey()Ljava/lang/String;

    move-result-object v9

    .line 224
    if-nez v9, :cond_3

    const/4 v0, 0x0

    return-object v0

    .line 225
    :cond_3
    const-string v0, "TRACK_METADATA"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 226
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 228
    :cond_4
    const-string v0, "TRACK_SEQUENCE_DATA"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 229
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;->getValue()Ljava/lang/String;

    move-result-object v7

    .line 222
    :cond_5
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 232
    :cond_6
    if-eqz v6, :cond_7

    if-nez v7, :cond_8

    .line 233
    :cond_7
    const/4 v0, 0x0

    return-object v0

    .line 235
    :cond_8
    iget-object v0, p0, Lo/csv;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ctb;->a(Landroid/content/Context;)Lo/ctb;

    move-result-object v0

    invoke-virtual {v0, v4, p1, v6, v7}, Lo/ctb;->d(Lo/crd;Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/util/List;II)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;>;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 46
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 49
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 51
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;

    .line 52
    const/4 v0, 0x0

    if-ne v0, v7, :cond_2

    .line 53
    goto :goto_0

    .line 55
    :cond_2
    invoke-direct {p0, v7, p2, p3}, Lo/csv;->b(Lcom/huawei/hwcloudmodel/model/unite/MotionPathDetail;II)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v5

    .line 56
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 57
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 60
    invoke-virtual {v8}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTrackType()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v1, v0, :cond_5

    const-string v0, "WGS84"

    invoke-virtual {v8}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getCoordinate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 63
    :try_start_0
    invoke-direct {p0, v5}, Lo/csv;->d(Lcom/huawei/hihealth/HiHealthData;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 64
    const-string v0, "Debug_MotionPathDataSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "need transfer point"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    const-string v0, "GCJ02"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setCoordinate(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :cond_4
    goto :goto_1

    .line 67
    :catch_0
    move-exception v9

    .line 68
    const-string v0, "Debug_MotionPathDataSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferGPSLocation exception ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    :cond_5
    :goto_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    goto/16 :goto_0

    .line 73
    :cond_6
    return-object v4
.end method
