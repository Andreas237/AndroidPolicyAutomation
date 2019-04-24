.class public Lo/crn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Lo/cqe;Landroid/content/Context;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Lo/cqe;Landroid/content/Context;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 39
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() type == HiHealthDataType.SEQUENCE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v7

    .line 41
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v9

    .line 42
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiDataReadOption;->getReadType()I

    move-result v11

    .line 45
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_3

    .line 48
    :pswitch_0
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() SEQUENCE  DATA_SEQUENCE_TRACK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    if-nez v11, :cond_0

    .line 50
    move-object/from16 v0, p4

    move-wide v1, v7

    move-wide v3, v9

    move-object v6, p1

    const/16 v5, 0x7531

    invoke-virtual/range {v0 .. v6}, Lo/cqe;->c(JJILjava/util/List;)Ljava/util/List;

    move-result-object v12

    goto :goto_0

    .line 52
    :cond_0
    move-object/from16 v0, p4

    move-wide v1, v7

    move-wide v3, v9

    move-object v6, p1

    const/16 v5, 0x7531

    invoke-virtual/range {v0 .. v6}, Lo/cqe;->e(JJILjava/util/List;)Ljava/util/List;

    move-result-object v12

    .line 54
    :goto_0
    move-object/from16 v0, p5

    invoke-static {v12, v0}, Lo/crn;->b(Ljava/util/List;Landroid/content/Context;)Ljava/util/List;

    move-result-object v13

    .line 55
    move-object/from16 v0, p3

    invoke-static {p0, v13, v0}, Lo/cnm;->d(ILjava/util/List;Lo/clj;)V

    .line 56
    goto/16 :goto_4

    .line 58
    :pswitch_1
    if-nez v11, :cond_1

    .line 59
    move-object/from16 v0, p4

    move-object/from16 v1, p2

    const/16 v2, 0x7531

    invoke-virtual {v0, p1, v1, v2}, Lo/cqe;->a(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List;

    move-result-object v12

    goto :goto_1

    .line 61
    :cond_1
    move-object/from16 v0, p4

    move-object/from16 v1, p2

    const/16 v2, 0x7531

    invoke-virtual {v0, p1, v1, v2}, Lo/cqe;->e(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List;

    move-result-object v12

    .line 63
    :goto_1
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() SEQUENCE  DATA_SEQUENCE_TRACK_METADATA_R"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ", size is "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    move-object/from16 v0, p5

    invoke-static {v12, v0}, Lo/crn;->b(Ljava/util/List;Landroid/content/Context;)Ljava/util/List;

    move-result-object v13

    .line 65
    move-object/from16 v0, p3

    invoke-static {p0, v13, v0}, Lo/cnm;->a(ILjava/util/List;Lo/clj;)V

    .line 66
    goto :goto_4

    .line 68
    :pswitch_2
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() SEQUENCE  DATA_SEQUENCE_TRACK_FOR_CREATETIME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    if-nez v11, :cond_2

    .line 70
    move-object/from16 v0, p4

    move-object/from16 v1, p2

    const/16 v2, 0x7531

    invoke-virtual {v0, p1, v1, v2}, Lo/cqe;->b(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List;

    move-result-object v12

    goto :goto_2

    .line 72
    :cond_2
    move-object/from16 v0, p4

    move-object/from16 v1, p2

    const/16 v2, 0x7531

    invoke-virtual {v0, p1, v1, v2}, Lo/cqe;->c(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List;

    move-result-object v12

    .line 74
    :goto_2
    move-object/from16 v0, p3

    invoke-static {p0, v12, v0}, Lo/cnm;->a(ILjava/util/List;Lo/clj;)V

    .line 75
    goto :goto_4

    .line 102
    :goto_3
    invoke-static/range {p0 .. p5}, Lo/crn;->b(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Lo/cqe;Landroid/content/Context;)V

    .line 105
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7531
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private static a(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Ljava/util/List;Lo/cqe;Landroid/content/Context;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/cqe;Landroid/content/Context;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 162
    invoke-static {p3}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSequenceDetailData() sequenceHealthDatas is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const/4 v0, 0x0

    const/16 v1, 0x7533

    const/4 v2, 0x1

    invoke-interface {p2, v0, v1, v2}, Lo/clj;->e(Ljava/util/List;II)V

    .line 165
    return-void

    .line 167
    :cond_0
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 168
    const/4 v0, 0x0

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 169
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setReadType(I)V

    .line 170
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 171
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    move-object v5, p5

    const/16 v0, 0x7533

    invoke-static/range {v0 .. v5}, Lo/crn;->a(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Lo/cqe;Landroid/content/Context;)V

    .line 172
    return-void

    nop

    :array_0
    .array-data 4
        0x7533
    .end array-data
.end method

.method private static b(Ljava/util/List;I)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 177
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 179
    invoke-static {p0}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSequenceDatasByReadType() sequenceMetaDatas is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    return-object v6

    .line 183
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 184
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v4

    .line 185
    const-class v0, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    invoke-static {v4, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/data/model/HiTrackMetaData;

    .line 186
    invoke-virtual {v5}, Lcom/huawei/hihealth/data/model/HiTrackMetaData;->getSportType()I

    move-result v7

    .line 187
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 190
    :pswitch_0
    const/16 v0, 0x101

    if-ne v0, v7, :cond_2

    .line 191
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 196
    :pswitch_1
    const/16 v0, 0x102

    if-eq v0, v7, :cond_1

    const/16 v0, 0x108

    if-eq v0, v7, :cond_1

    const/16 v0, 0x118

    if-ne v0, v7, :cond_2

    .line 197
    :cond_1
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 202
    :pswitch_2
    const/16 v0, 0x103

    if-ne v0, v7, :cond_2

    .line 203
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 208
    :pswitch_3
    invoke-static {v7}, Lo/crn;->d(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 209
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 215
    :cond_2
    :goto_1
    goto/16 :goto_0

    .line 216
    :cond_3
    return-object v6

    :pswitch_data_0
    .packed-switch 0x7535
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static b(Ljava/util/List;Landroid/content/Context;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Landroid/content/Context;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 225
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 226
    if-eqz p0, :cond_0

    .line 227
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hihealth/HiHealthData;

    .line 228
    invoke-virtual {v3}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v4

    .line 229
    invoke-static {p1}, Lo/cqx;->d(Landroid/content/Context;)Lo/cqx;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cqx;->a(I)I

    move-result v5

    .line 230
    const-string v0, "trackdata_deviceType"

    invoke-virtual {v3, v0, v5}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 231
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 232
    goto :goto_0

    .line 234
    :cond_0
    return-object v1
.end method

.method private static b(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Lo/cqe;Landroid/content/Context;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Lo/cqe;Landroid/content/Context;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 109
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() type == HiHealthDataType.SEQUENCE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getReadType()I

    move-result v4

    .line 113
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_1

    .line 118
    :pswitch_0
    if-nez v4, :cond_0

    .line 119
    const/16 v0, 0x7531

    invoke-virtual {p4, p1, p2, v0}, Lo/cqe;->a(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List;

    move-result-object v5

    goto :goto_0

    .line 121
    :cond_0
    const/16 v0, 0x7531

    invoke-virtual {p4, p1, p2, v0}, Lo/cqe;->e(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List;

    move-result-object v5

    .line 123
    :goto_0
    invoke-static {v5, p0}, Lo/crn;->b(Ljava/util/List;I)Ljava/util/List;

    move-result-object v5

    .line 124
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() SEQUENCE  ReadSequenceDatasByReadType, sequenceType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", size is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    invoke-static {v5, p5}, Lo/crn;->b(Ljava/util/List;Landroid/content/Context;)Ljava/util/List;

    move-result-object v6

    .line 126
    invoke-static {p0, v6, p3}, Lo/cnm;->a(ILjava/util/List;Lo/clj;)V

    .line 127
    goto :goto_2

    .line 129
    :goto_1
    invoke-static/range {p0 .. p5}, Lo/crn;->d(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Lo/cqe;Landroid/content/Context;)V

    .line 132
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7535
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static d(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Lo/cqe;Landroid/content/Context;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Lo/cqe;Landroid/content/Context;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 136
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() type == HiHealthDataType.SEQUENCE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 140
    :pswitch_0
    const/16 v0, 0x7531

    invoke-virtual {p4, p1, p2, v0}, Lo/cqe;->a(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List;

    move-result-object v6

    .line 141
    invoke-static {v6}, Lo/csg;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 142
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() SEQUENCE  ReadSequenceDatas, sequenceType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", size is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", sequenceData is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, v6

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lo/crn;->a(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Ljava/util/List;Lo/cqe;Landroid/content/Context;)V

    .line 144
    goto :goto_1

    .line 148
    :pswitch_1
    const/16 v0, 0x7531

    invoke-virtual {p4, p1, p2, v0}, Lo/cqe;->a(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;I)Ljava/util/List;

    move-result-object v6

    .line 149
    invoke-static {v6, p0}, Lo/csg;->c(Ljava/util/List;I)Ljava/util/List;

    move-result-object v6

    .line 150
    invoke-static {v6}, Lo/csg;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    .line 151
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() SEQUENCE  ReadSequenceDatas, sequenceType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", size is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", sequenceData is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, v6

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lo/crn;->a(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;Ljava/util/List;Lo/cqe;Landroid/content/Context;)V

    .line 153
    goto :goto_1

    .line 155
    :goto_0
    :pswitch_2
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p3, v0, p0, v1}, Lo/clj;->e(Ljava/util/List;II)V

    .line 158
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x753d
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static d(I)Z
    .locals 3

    .line 220
    const/4 v0, 0x5

    new-array v2, v0, [Ljava/lang/Integer;

    const/16 v0, 0x101

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const/16 v0, 0x102

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const/16 v0, 0x108

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v2, v1

    const/16 v0, 0x103

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v2, v1

    const/16 v0, 0x118

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v2, v1

    .line 221
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
