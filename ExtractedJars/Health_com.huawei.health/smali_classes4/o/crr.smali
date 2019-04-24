.class public Lo/crr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crr$e;
    }
.end annotation


# instance fields
.field private c:Lo/cqe;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-static {p1}, Lo/cqe;->b(Landroid/content/Context;)Lo/cqe;

    move-result-object v0

    iput-object v0, p0, Lo/crr;->c:Lo/cqe;

    .line 32
    return-void
.end method

.method private a(Lcom/huawei/hihealth/data/model/HiTrackMetaData;Lcom/huawei/hihealth/data/model/HiTrackMetaData;)Z
    .locals 4

    .line 169
    invoke-virtual {p1}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v2

    .line 170
    invoke-virtual {p2}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v3

    .line 172
    if-ne v2, v3, :cond_0

    .line 174
    const/4 v0, 0x0

    return v0

    .line 177
    :cond_0
    invoke-virtual {p1, v3}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->setmDuplicated(I)V

    .line 179
    invoke-static {p1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 181
    const/4 v0, 0x1

    return v0

    .line 183
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 46
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crr;->c:Lo/cqe;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v3

    move-object/from16 v4, p3

    invoke-virtual {v0, v4, v1, v2, v3}, Lo/cqe;->a(Ljava/util/List;JI)Ljava/util/List;

    move-result-object v7

    .line 47
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 49
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crr;->c:Lo/cqe;

    move-object/from16 v1, p1

    move/from16 v2, p2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/cqe;->d(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v8

    .line 50
    const-string v0, "Debug_HiDataSequenceMerge"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sequenceDataMerge insertSequenceData insert =  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 56
    :cond_2
    const/4 v8, 0x1

    .line 57
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 59
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    move/from16 v1, p2

    if-eq v0, v1, :cond_3

    .line 60
    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    .line 64
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 66
    const-string v0, "HiH_HiDataSequenceMerge"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "same sequence data, does not merge!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    const/4 v0, 0x1

    return v0

    .line 69
    :cond_4
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 70
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 72
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 73
    move-object/from16 v0, p0

    invoke-direct {v0, v11, v12}, Lo/crr;->a(Lcom/huawei/hihealth/data/model/HiTrackMetaData;Lcom/huawei/hihealth/data/model/HiTrackMetaData;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 75
    invoke-virtual {v13}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getmDuplicated()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 76
    const-string v0, "HiH_HiDataSequenceMerge"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "meta data only dumplicate diff, does not merge!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const/4 v0, 0x1

    return v0

    .line 82
    :cond_5
    const-string v0, "merged"

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 83
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getSequenceData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 84
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 85
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getSyncStatus()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 86
    const/4 v8, 0x0

    .line 87
    .line 91
    :cond_6
    if-eqz v8, :cond_7

    .line 92
    move-object/from16 v0, p1

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setClientID(I)V

    .line 93
    const-string v0, "merged"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 94
    move-object/from16 v0, p1

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v9

    .line 99
    new-instance v0, Lo/crr$e;

    invoke-direct {v0, v9}, Lo/crr$e;-><init>(I)V

    invoke-static {v7, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 102
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 104
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    move/from16 v1, p2

    if-ne v0, v1, :cond_8

    .line 105
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crr;->c:Lo/cqe;

    move/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {v0, v10, v1, v2}, Lo/cqe;->c(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v11

    .line 106
    const-string v0, "Debug_HiDataSequenceMerge"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sequenceDataMerge insertOrUpdateSequenceData maxData merge isSuccess =  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 108
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crr;->c:Lo/cqe;

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v10, v1, v2}, Lo/cqe;->e(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v12

    .line 109
    const-string v0, "Debug_HiDataSequenceMerge"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sequenceDataMerge updateSequenceDataMerge maxData update =  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    const-wide/16 v0, 0x0

    cmp-long v0, v12, v0

    if-lez v0, :cond_9

    const/4 v11, 0x1

    goto :goto_2

    :cond_9
    const/4 v11, 0x0

    .line 114
    :goto_2
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v13

    .line 115
    const/4 v14, 0x1

    :goto_3
    if-ge v14, v13, :cond_c

    .line 116
    invoke-interface {v7, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/hihealth/HiHealthData;

    .line 117
    const-string v0, "merged"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_b

    .line 118
    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    move/from16 v1, p2

    if-ne v0, v1, :cond_a

    .line 119
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crr;->c:Lo/cqe;

    move/from16 v1, p2

    const/4 v2, 0x1

    invoke-virtual {v0, v15, v1, v2}, Lo/cqe;->c(Lcom/huawei/hihealth/HiHealthData;II)Z

    move-result v12

    .line 120
    const-string v0, "Debug_HiDataSequenceMerge"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sequenceDataMerge insertOrUpdateSequenceData unmerge change "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    if-nez v12, :cond_b

    .line 122
    const/4 v11, 0x0

    goto :goto_4

    .line 125
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/crr;->c:Lo/cqe;

    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v15, v1, v2}, Lo/cqe;->e(Lcom/huawei/hihealth/HiHealthData;II)J

    move-result-wide v16

    .line 126
    const-string v0, "Debug_HiDataSequenceMerge"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sequenceDataMerge updateSequenceDataMerge unmerge "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const-wide/16 v0, 0x0

    cmp-long v0, v16, v0

    if-gtz v0, :cond_b

    .line 128
    const/4 v11, 0x0

    .line 115
    :cond_b
    :goto_4
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_3

    .line 134
    :cond_c
    const-string v0, "Debug_HiDataSequenceMerge"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sequenceDataMerge use time is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v5

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    return v11
.end method
