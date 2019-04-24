.class public Lo/erk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:D

.field private e:D


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/erk;->e:D

    return-void
.end method

.method private a(D)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    .locals 3

    .line 160
    const-wide v0, 0x4081e80000000000L    # 573.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_0

    .line 162
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 165
    :cond_0
    const-wide v0, 0x4080500000000000L    # 522.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_1

    .line 167
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x1

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 170
    :cond_1
    const-wide v0, 0x407d300000000000L    # 467.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_2

    .line 172
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x2

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 175
    :cond_2
    const-wide v0, 0x407a200000000000L    # 418.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_3

    .line 177
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x3

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 180
    :cond_3
    const-wide/high16 v0, 0x4078000000000000L    # 384.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_4

    .line 182
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x4

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 185
    :cond_4
    const-wide/16 v0, 0x0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_5

    .line 187
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x5

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 192
    :cond_5
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0
.end method

.method private a(DI)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    .locals 3

    .line 266
    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    .line 267
    invoke-direct {p0, p1, p2}, Lo/erk;->a(D)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v0

    return-object v0

    .line 268
    :cond_0
    if-nez p3, :cond_1

    .line 269
    invoke-direct {p0, p1, p2}, Lo/erk;->d(D)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v0

    return-object v0

    .line 271
    :cond_1
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    return-object v0
.end method

.method private c(Ljava/util/List;I)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)V"
        }
    .end annotation

    .line 73
    const-string v0, "Track_RunHistoryToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "analyzeTrackSimplifyData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    if-nez p1, :cond_0

    .line 76
    const-string v0, "Track_RunHistoryToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "analyzeTrackSimplifyData datas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/erk;->d:D

    .line 85
    :cond_0
    const-wide/16 v4, 0x0

    .line 86
    const/4 v6, 0x0

    .line 87
    const-wide/16 v7, 0x0

    .line 89
    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 90
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 92
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v11

    .line 93
    const/4 v12, 0x0

    .line 95
    :try_start_0
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v11, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/data/model/HiTrackMetaData;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    goto :goto_1

    .line 96
    :catch_0
    move-exception v13

    .line 97
    const-string v0, "Track_RunHistoryToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "analyzeTrackSimplifyData trackMetaData is error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    goto :goto_0

    .line 102
    :goto_1
    invoke-virtual {v12}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v12}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getAbnormalTrack()I

    move-result v0

    if-nez v0, :cond_1

    .line 104
    invoke-virtual {v12}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalDistance()I

    move-result v0

    int-to-double v0, v0

    add-double/2addr v4, v0

    .line 106
    add-int/lit8 v6, v6, 0x1

    .line 107
    invoke-virtual {v12}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getTotalTime()J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 112
    :cond_1
    goto :goto_0

    .line 114
    :cond_2
    if-lez v6, :cond_4

    .line 115
    int-to-double v0, v6

    div-double v0, v4, v0

    iput-wide v0, p0, Lo/erk;->d:D

    .line 116
    const-wide/16 v0, 0x0

    cmpl-double v0, v4, v0

    if-lez v0, :cond_3

    .line 117
    long-to-double v0, v7

    div-double/2addr v0, v4

    iput-wide v0, p0, Lo/erk;->e:D

    goto :goto_2

    .line 119
    :cond_3
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/erk;->e:D

    goto :goto_2

    .line 122
    :cond_4
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/erk;->d:D

    .line 124
    :goto_2
    const-string v0, "Track_RunHistoryToSportLevel"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "analyzeTrackSimplifyData sum="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " count="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " avgPace = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/erk;->e:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " duration ="

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    :cond_5
    return-void
.end method

.method private d(D)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    .locals 3

    .line 204
    const-wide v0, 0x407f400000000000L    # 500.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_0

    .line 206
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 209
    :cond_0
    const-wide v0, 0x407c200000000000L    # 450.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_1

    .line 211
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x1

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 214
    :cond_1
    const-wide v0, 0x4078c00000000000L    # 396.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_2

    .line 216
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x2

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 219
    :cond_2
    const-wide v0, 0x4076200000000000L    # 354.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_3

    .line 221
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x3

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 224
    :cond_3
    const-wide v0, 0x4074100000000000L    # 321.0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_4

    .line 226
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x4

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 229
    :cond_4
    const-wide/16 v0, 0x0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_5

    .line 231
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, 0x5

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 235
    :cond_5
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;"
        }
    .end annotation

    .line 49
    if-nez p2, :cond_0

    .line 50
    const-string v0, "Track_RunHistoryToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calSportLevel userInfomation is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    return-object v0

    .line 54
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v4

    .line 55
    if-eqz v4, :cond_1

    const/4 v0, 0x1

    if-eq v4, v0, :cond_1

    .line 56
    const-string v0, "Track_RunHistoryToSportLevel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "undefined gender"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    return-object v0

    .line 61
    :cond_1
    invoke-direct {p0, p1, v4}, Lo/erk;->c(Ljava/util/List;I)V

    .line 63
    invoke-virtual {p0, v4}, Lo/erk;->c(I)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v0

    return-object v0
.end method

.method public c(I)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    .locals 5

    .line 252
    iget-wide v0, p0, Lo/erk;->d:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 253
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    return-object v0

    .line 255
    :cond_0
    iget-wide v0, p0, Lo/erk;->d:D

    const-wide v2, 0x409f400000000000L    # 2000.0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 256
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    iget-wide v1, p0, Lo/erk;->d:D

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    return-object v0

    .line 261
    :cond_1
    iget-wide v0, p0, Lo/erk;->e:D

    invoke-direct {p0, v0, v1, p1}, Lo/erk;->a(DI)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    move-result-object v0

    return-object v0
.end method
