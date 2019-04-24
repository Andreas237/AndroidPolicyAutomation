.class public Lo/crj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crj$b;
    }
.end annotation


# static fields
.field private static b:Landroid/content/Context;


# instance fields
.field private a:Lo/crr;

.field private e:Lo/cqd;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Lo/crr;

    sget-object v1, Lo/crj;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/crr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crj;->a:Lo/crr;

    .line 42
    sget-object v0, Lo/crj;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    iput-object v0, p0, Lo/crj;->e:Lo/cqd;

    .line 43
    return-void
.end method

.method synthetic constructor <init>(Lo/crj$3;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lo/crj;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/crj;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 54
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/crj;->b:Landroid/content/Context;

    .line 55
    sget-object v0, Lo/crj$b;->b:Lo/crj;

    return-object v0
.end method


# virtual methods
.method public a(ILcom/huawei/hihealth/HiHealthData;ILjava/util/List;Lo/crq;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;Lo/crq;)Z"
        }
    .end annotation

    .line 112
    invoke-static/range {p1 .. p1}, Lo/cmk;->e(I)[I

    move-result-object v4

    .line 113
    new-instance v5, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 114
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 115
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 116
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 117
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 118
    array-length v6, v4

    .line 122
    const/4 v10, 0x0

    .line 124
    move-object v13, v4

    array-length v14, v13

    const/4 v15, 0x0

    :goto_0
    if-ge v15, v14, :cond_2

    aget v16, v13, v15

    .line 125
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSetData() type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", pointType = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    move/from16 v0, v16

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 127
    invoke-static/range {v16 .. v16}, Lo/clv;->e(I)Ljava/lang/String;

    move-result-object v8

    .line 128
    move-object/from16 v0, p2

    invoke-virtual {v0, v8}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v11

    .line 129
    const-wide/16 v0, 0x0

    cmpg-double v0, v11, v0

    if-gtz v0, :cond_0

    .line 130
    add-int/lit8 v10, v10, 0x1

    .line 131
    goto :goto_1

    .line 133
    :cond_0
    invoke-virtual {v5, v11, v12}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 134
    invoke-static {v8}, Lo/clv;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 135
    invoke-virtual {v5, v7}, Lcom/huawei/hihealth/HiHealthData;->setPointUnit(I)V

    .line 136
    move-object/from16 v0, p5

    move/from16 v1, p3

    move-object/from16 v2, p4

    invoke-virtual {v0, v5, v1, v2}, Lo/crq;->d(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z

    move-result v9

    .line 137
    if-eqz v9, :cond_1

    .line 138
    add-int/lit8 v10, v10, 0x1

    .line 124
    :cond_1
    :goto_1
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_0

    .line 141
    :cond_2
    if-lt v10, v6, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method public a(Lcom/huawei/hihealth/HiHealthData;II)Z
    .locals 5

    .line 145
    if-gtz p2, :cond_0

    .line 146
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStatData() statClient <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const/4 v0, 0x0

    return v0

    .line 149
    :cond_0
    const-string v0, "HiH_HiHealthSaveData"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveStatData() type ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",time = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",statClient = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 150
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",who is "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 149
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    new-instance v4, Lo/cob;

    invoke-direct {v4}, Lo/cob;-><init>()V

    .line 152
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/cob;->a(J)V

    .line 153
    invoke-virtual {v4, p3}, Lo/cob;->e(I)V

    .line 154
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/cob;->f(I)V

    .line 155
    const-string v0, "hihealth_type"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/cob;->d(I)V

    .line 156
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/cob;->a(I)V

    .line 157
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getPointUnit()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/cob;->i(I)V

    .line 158
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/cob;->e(D)V

    .line 159
    invoke-virtual {v4, p2}, Lo/cob;->b(I)V

    .line 160
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getModifiedTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/cob;->e(J)V

    .line 161
    iget-object v0, p0, Lo/crj;->e:Lo/cqd;

    invoke-virtual {v0, v4}, Lo/cqd;->d(Lo/cob;)Z

    move-result v0

    return v0
.end method

.method public b(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 59
    const-string v0, "HiH_HiHealthSaveTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSequenceData start clientID is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const-string v4, ""

    .line 61
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 63
    :sswitch_0
    const-string v0, "HiH_HiHealthSaveTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSequenceData DATA_SEQUENCE_TRACK 1 clientID is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    const-string v0, "is_sequence_zip"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    const-string v0, "is_dividing"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    invoke-static {}, Lo/cqv;->d()Lo/cqv;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cqv;->b(Lcom/huawei/hihealth/HiHealthData;)V

    .line 67
    const/4 v0, 0x1

    return v0

    .line 69
    :cond_0
    const-string v0, "HiH_HiHealthSaveTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSequenceData DATA_SEQUENCE_TRACK 1 end ! clientID is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    invoke-static {}, Lo/cqv;->d()Lo/cqv;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cqv;->a(Lcom/huawei/hihealth/HiHealthData;)Ljava/lang/String;

    move-result-object v4

    .line 71
    const/16 v0, 0x7531

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    goto :goto_0

    .line 74
    :cond_1
    const-string v0, "HiH_HiHealthSaveTrack"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSequenceData DATA_SEQUENCE_TRACK 2 clientID is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    invoke-static {}, Lo/cqv;->d()Lo/cqv;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cqv;->a(Lcom/huawei/hihealth/HiHealthData;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cnp;->d(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 79
    goto :goto_0

    .line 76
    :catch_0
    move-exception v5

    .line 77
    const-string v0, "HiH_HiHealthSaveTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSequenceData DATA_SEQUENCE_TRACK compress e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x0

    return v0

    .line 81
    :goto_0
    invoke-virtual {p1, v4}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 82
    goto :goto_2

    .line 84
    :sswitch_1
    const-string v0, "HiH_HiHealthSaveTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSequenceData DATA_SEQUENCE_TRACK_FILE clientID is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSequenceFileUrl()Ljava/lang/String;

    move-result-object v5

    .line 86
    sget-object v0, Lo/crj;->b:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/cnl;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 88
    :try_start_1
    invoke-static {v6}, Lo/cnp;->d(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v4

    .line 92
    goto :goto_1

    .line 89
    :catch_1
    move-exception v7

    .line 90
    const-string v0, "HiH_HiHealthSaveTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSequenceData DATA_SEQUENCE_TRACK_FILE compress e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const/4 v0, 0x0

    return v0

    .line 93
    :goto_1
    const/16 v0, 0x7531

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 94
    invoke-virtual {p1, v4}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 95
    .line 100
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 101
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    .line 100
    invoke-static {v0}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 102
    :cond_2
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSequenceData track data error ,track startTime is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const/4 v0, 0x0

    return v0

    .line 105
    :cond_3
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSequenceData sequence length = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", startTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 106
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 105
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    iget-object v0, p0, Lo/crj;->a:Lo/crr;

    invoke-virtual {v0, p1, p2, p3}, Lo/crr;->a(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x7531 -> :sswitch_0
        0x7533 -> :sswitch_1
    .end sparse-switch
.end method

.method public c(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 195
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 197
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 198
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v7

    .line 199
    const/4 v8, 0x0

    .line 200
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/crj$c;

    .line 201
    iget v0, v10, Lo/crj$c;->b:I

    if-ne v0, v7, :cond_2

    .line 202
    iget-wide v0, v10, Lo/crj$c;->c:J

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 203
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    iput-wide v0, v10, Lo/crj$c;->c:J

    .line 205
    :cond_0
    iget-wide v0, v10, Lo/crj$c;->e:J

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 206
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    iput-wide v0, v10, Lo/crj$c;->e:J

    .line 208
    :cond_1
    iget v0, v10, Lo/crj$c;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v10, Lo/crj$c;->d:I

    .line 209
    const/4 v8, 0x1

    .line 210
    goto :goto_2

    .line 212
    :cond_2
    goto :goto_1

    .line 213
    :cond_3
    :goto_2
    if-nez v8, :cond_4

    .line 214
    new-instance v9, Lo/crj$c;

    invoke-direct {v9, p0}, Lo/crj$c;-><init>(Lo/crj;)V

    .line 215
    const/4 v0, 0x1

    iput v0, v9, Lo/crj$c;->d:I

    .line 216
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    iput-wide v0, v9, Lo/crj$c;->c:J

    .line 217
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    iput-wide v0, v9, Lo/crj$c;->e:J

    .line 218
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    iput v0, v9, Lo/crj$c;->b:I

    .line 219
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    :cond_4
    goto/16 :goto_0

    .line 222
    :cond_5
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert datas is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/crj$c;

    .line 224
    const-string v0, "HiH_HiHealthSaveData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Lo/crj$c;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    goto :goto_3

    .line 227
    :cond_6
    return-void
.end method
