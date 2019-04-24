.class public Lo/crm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crm$b;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# instance fields
.field private a:Lo/cqy;

.field private b:Lo/crl;

.field private c:Lo/cqn;

.field private d:Lo/cqz;

.field private h:Z


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    invoke-direct {p0}, Lo/crm;->b()V

    .line 63
    return-void
.end method

.method synthetic constructor <init>(Lo/crm$4;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lo/crm;-><init>()V

    return-void
.end method

.method private a(Lo/cmk$b;Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;II)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cmk$b;Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List<Ljava/lang/Integer;>;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 305
    const/4 v2, 0x0

    .line 306
    sget-object v0, Lo/crm$4;->d:[I

    invoke-virtual {p1}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 308
    :pswitch_0
    iget-object v0, p0, Lo/crm;->b:Lo/crl;

    invoke-virtual {v0, p5, p3, p2}, Lo/crl;->a(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;

    move-result-object v2

    .line 309
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 310
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 311
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqx;->d(Landroid/content/Context;)Lo/cqx;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cqx;->a(I)I

    move-result v5

    .line 312
    const-string v0, "trackdata_deviceType"

    invoke-virtual {v4, v0, v5}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 313
    goto :goto_0

    :cond_0
    goto :goto_1

    .line 317
    :pswitch_1
    iget-object v0, p0, Lo/crm;->b:Lo/crl;

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiDataReadOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p5, p3, v1}, Lo/crl;->b(ILjava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 318
    goto :goto_1

    .line 320
    :pswitch_2
    iget-object v0, p0, Lo/crm;->b:Lo/crl;

    invoke-virtual {v0, p5, p3, p2}, Lo/crl;->e(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;

    move-result-object v2

    .line 321
    goto :goto_1

    .line 323
    :pswitch_3
    iget-object v0, p0, Lo/crm;->b:Lo/crl;

    invoke-virtual {v0, p5, p4, p2}, Lo/crl;->b(IILcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;

    move-result-object v2

    .line 324
    .line 328
    :cond_1
    :goto_1
    return-object v2

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private a(I)Z
    .locals 1

    .line 471
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 476
    :pswitch_0
    const/4 v0, 0x1

    return v0

    .line 478
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x7f2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private b()V
    .locals 1

    .line 78
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqn;->a(Landroid/content/Context;)Lo/cqn;

    move-result-object v0

    iput-object v0, p0, Lo/crm;->c:Lo/cqn;

    .line 79
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqz;->d(Landroid/content/Context;)Lo/cqz;

    move-result-object v0

    iput-object v0, p0, Lo/crm;->d:Lo/cqz;

    .line 80
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/crm;->a:Lo/cqy;

    .line 81
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/crl;->c(Landroid/content/Context;)Lo/crl;

    move-result-object v0

    iput-object v0, p0, Lo/crm;->b:Lo/crl;

    .line 82
    return-void
.end method

.method private b(I)Z
    .locals 1

    .line 431
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 436
    :pswitch_0
    const/4 v0, 0x1

    return v0

    .line 438
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private c(Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;ILjava/util/List;II)Ljava/util/List;
    .locals 12
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;ILjava/util/List<Ljava/lang/Integer;>;II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 257
    invoke-static/range {p6 .. p6}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v6

    .line 258
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData() sampleType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", category = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    const/4 v7, 0x1

    .line 260
    const/4 v8, 0x0

    .line 261
    sget-object v0, Lo/crm$4;->d:[I

    invoke-virtual {v6}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 263
    :pswitch_0
    iget-object v0, p0, Lo/crm;->b:Lo/crl;

    move/from16 v1, p6

    move-object/from16 v2, p4

    invoke-virtual {v0, v1, v2, p1}, Lo/crl;->d(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;

    move-result-object v8

    .line 264
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 265
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 266
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqx;->d(Landroid/content/Context;)Lo/cqx;

    move-result-object v0

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cqx;->a(I)I

    move-result v11

    .line 267
    const-string v0, "trackdata_deviceType"

    invoke-virtual {v10, v0, v11}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 268
    goto :goto_0

    :cond_0
    goto/16 :goto_3

    .line 272
    :pswitch_1
    iget-object v0, p0, Lo/crm;->b:Lo/crl;

    move/from16 v1, p6

    move/from16 v2, p5

    invoke-virtual {v0, v1, v2, p1}, Lo/crl;->d(IILcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;

    move-result-object v8

    .line 273
    goto/16 :goto_3

    .line 275
    :pswitch_2
    iget-object v0, p0, Lo/crm;->b:Lo/crl;

    move/from16 v1, p6

    move-object/from16 v2, p4

    invoke-virtual {v0, v1, v2, p1}, Lo/crl;->b(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;

    move-result-object v8

    .line 276
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 277
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hihealth/HiHealthData;

    .line 278
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqx;->d(Landroid/content/Context;)Lo/cqx;

    move-result-object v0

    invoke-virtual {v10}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cqx;->a(I)I

    move-result v11

    .line 279
    const-string v0, "trackdata_deviceType"

    invoke-virtual {v10, v0, v11}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 280
    goto :goto_1

    :cond_1
    goto :goto_3

    .line 284
    :pswitch_3
    const/4 v7, 0x0

    .line 285
    iget-object v0, p0, Lo/crm;->b:Lo/crl;

    move/from16 v1, p6

    move-object/from16 v2, p4

    invoke-virtual {v0, v1, v2, p1, p2}, Lo/crl;->b(ILjava/util/List;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;)V

    .line 286
    goto :goto_3

    .line 288
    :pswitch_4
    iget-object v0, p0, Lo/crm;->b:Lo/crl;

    invoke-virtual {v0, p3, p1}, Lo/crl;->c(ILcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;

    move-result-object v8

    .line 289
    goto :goto_3

    .line 291
    :goto_2
    move-object v0, p0

    move-object v1, v6

    move-object v2, p1

    move-object/from16 v3, p4

    move/from16 v4, p5

    move/from16 v5, p6

    invoke-direct/range {v0 .. v5}, Lo/crm;->a(Lo/cmk$b;Lcom/huawei/hihealth/HiDataReadOption;Ljava/util/List;II)Ljava/util/List;

    move-result-object v8

    .line 294
    :cond_2
    :goto_3
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    .line 295
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readDataByType type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ret datas size = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    :cond_3
    if-eqz v7, :cond_4

    .line 298
    move/from16 v0, p6

    invoke-static {v0, v8, p2}, Lo/cnm;->a(ILjava/util/List;Lo/clj;)V

    .line 300
    :cond_4
    return-object v8

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private c(Lo/cmk$b;IIILo/crd;Lcom/huawei/hihealth/HiAggregateOption;Ljava/lang/String;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/cmk$b;IIILo/crd;Lcom/huawei/hihealth/HiAggregateOption;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 108
    sget-object v0, Lo/crm$4;->d:[I

    invoke-virtual {p1}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 110
    :sswitch_0
    invoke-virtual/range {p5 .. p5}, Lo/crd;->d()I

    move-result v0

    move/from16 v1, p3

    move/from16 v2, p4

    move-object/from16 v3, p7

    invoke-direct {p0, v1, v2, v0, v3}, Lo/crm;->d(IIILjava/lang/String;)I

    move-result v5

    .line 111
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readAggregateData statClient is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "hiContext is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    if-gtz v5, :cond_0

    .line 113
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readAggregateData() stat  statClient <= 0 hiContext = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const/4 v0, 0x0

    return-object v0

    .line 116
    :cond_0
    iget-object v0, p0, Lo/crm;->c:Lo/cqn;

    move-object/from16 v1, p6

    invoke-virtual {v0, v5, v1}, Lo/cqn;->a(ILcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v4

    .line 117
    goto/16 :goto_1

    .line 120
    :goto_0
    invoke-virtual/range {p5 .. p5}, Lo/crd;->d()I

    move-result v0

    move/from16 v1, p3

    move/from16 v2, p4

    move-object/from16 v3, p7

    invoke-direct {p0, v1, v2, v0, v3}, Lo/crm;->e(IIILjava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 121
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 122
    :cond_1
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readAggregateData()  default clients is null hiContext = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const/4 v0, 0x0

    return-object v0

    .line 126
    :cond_2
    if-gtz p2, :cond_4

    .line 127
    if-nez p3, :cond_3

    .line 128
    iget-object v0, p0, Lo/crm;->c:Lo/cqn;

    move-object/from16 v1, p6

    invoke-virtual {v0, v6, v1}, Lo/cqn;->b(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    .line 130
    :cond_3
    iget-object v0, p0, Lo/crm;->c:Lo/cqn;

    move-object/from16 v1, p6

    invoke-virtual {v0, v6, v1}, Lo/cqn;->f(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v4

    .line 132
    goto :goto_1

    .line 135
    :cond_4
    if-nez p3, :cond_5

    .line 136
    iget-object v0, p0, Lo/crm;->c:Lo/cqn;

    move-object/from16 v1, p6

    invoke-virtual {v0, v6, v1}, Lo/cqn;->a(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    .line 138
    :cond_5
    iget-object v0, p0, Lo/crm;->c:Lo/cqn;

    move-object/from16 v1, p6

    invoke-virtual {v0, v6, v1}, Lo/cqn;->c(Ljava/util/List;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;

    move-result-object v4

    .line 142
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_8

    .line 143
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 144
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqx;->d(Landroid/content/Context;)Lo/cqx;

    move-result-object v7

    .line 145
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cqx;->a(I)I

    move-result v8

    .line 146
    const-string v0, "trackdata_deviceType"

    invoke-virtual {v6, v0, v8}, Lcom/huawei/hihealth/HiHealthData;->putInt(Ljava/lang/String;I)V

    .line 148
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x385

    if-eq v1, v0, :cond_6

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    const/16 v1, 0x2716

    if-ne v1, v0, :cond_7

    .line 149
    :cond_6
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v0

    invoke-virtual {v7, v0}, Lo/cqx;->d(I)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v9

    .line 150
    invoke-virtual {v7, v9}, Lo/cqx;->d(Lcom/huawei/hihealth/HiDeviceInfo;)Ljava/lang/String;

    move-result-object v10

    .line 151
    invoke-virtual {v7, v9}, Lo/cqx;->e(Lcom/huawei/hihealth/HiDeviceInfo;)Ljava/lang/String;

    move-result-object v11

    .line 152
    invoke-virtual {v7, v9}, Lo/cqx;->c(Lcom/huawei/hihealth/HiDeviceInfo;)Ljava/lang/String;

    move-result-object v12

    .line 153
    const-string v0, "device_model"

    invoke-virtual {v6, v0, v11}, Lcom/huawei/hihealth/HiHealthData;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    const-string v0, "device_name"

    invoke-virtual {v6, v0, v10}, Lcom/huawei/hihealth/HiHealthData;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    const-string v0, "device_uniquecode"

    invoke-virtual {v6, v0, v12}, Lcom/huawei/hihealth/HiHealthData;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    :cond_7
    goto/16 :goto_2

    .line 159
    :cond_8
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private c(I[IJJILjava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[IJJILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 333
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startBackInsert  types[0]="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    aget v3, p2, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n readStartTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n readEndTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, p5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    const/4 v5, -0x1

    .line 335
    const/4 v6, -0x1

    .line 336
    const/4 v0, 0x0

    aget v0, p2, v0

    invoke-direct {p0, v0}, Lo/crm;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 337
    const/16 v5, 0x271e

    .line 338
    const/16 v6, 0x271b

    goto :goto_0

    .line 339
    :cond_0
    const/4 v0, 0x0

    aget v0, p2, v0

    invoke-direct {p0, v0}, Lo/crm;->c(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 340
    const/16 v5, 0x2720

    .line 341
    const/16 v6, 0x271c

    goto :goto_0

    .line 342
    :cond_1
    const/4 v0, 0x0

    aget v0, p2, v0

    invoke-direct {p0, v0}, Lo/crm;->d(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 343
    const/16 v5, 0x2721

    .line 344
    const/16 v6, 0x271d

    goto :goto_0

    .line 345
    :cond_2
    const/4 v0, 0x0

    aget v0, p2, v0

    invoke-direct {p0, v0}, Lo/crm;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 346
    const/16 v5, 0x2724

    .line 347
    const/16 v6, 0x2723

    goto :goto_0

    .line 348
    :cond_3
    const/4 v0, 0x0

    aget v0, p2, v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_4

    .line 349
    const/16 v5, 0x2726

    .line 350
    const/16 v6, 0x2725

    goto :goto_0

    .line 352
    :cond_4
    return-void

    .line 355
    :goto_0
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0, p1, v5}, Lo/cui;->b(Landroid/content/Context;II)I

    move-result v7

    .line 356
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cum;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 358
    const/4 v0, 0x0

    if-ne v0, v7, :cond_5

    .line 359
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "already download detail day is 0, don\'t need download again!, syncType="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 360
    return-void

    .line 362
    :cond_5
    sub-long v0, p5, p3

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    .line 364
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "read time interval larger than one day ,type is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    .line 365
    return-void

    .line 368
    :cond_6
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x4

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDownload Data  syncDay  is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  startTime is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    invoke-static {p3, p4}, Lo/cnk;->a(J)I

    move-result v0

    const-string v1, "yyyyMMdd"

    invoke-static {v7, v0, v1}, Lo/cnk;->d(IILjava/lang/String;)I

    move-result v0

    const/4 v1, 0x7

    if-lt v1, v0, :cond_7

    .line 371
    invoke-static {p3, p4}, Lo/cnk;->a(J)I

    move-result v0

    const-string v1, "yyyyMMdd"

    invoke-static {v7, v0, v1}, Lo/cnk;->d(IILjava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-gt v1, v0, :cond_7

    .line 372
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startBackInsert seven Day download  syncDay  is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "startTime is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    new-instance v8, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 375
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 376
    invoke-virtual {v8, v6}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 377
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 378
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 379
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 380
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    sget-object v1, Lo/crm;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v9

    .line 381
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    invoke-virtual {v0, v8, v9}, Lo/csk;->d(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 389
    :cond_7
    invoke-static {p3, p4}, Lo/cnk;->a(J)I

    move-result v0

    if-le v7, v0, :cond_9

    if-eqz p8, :cond_8

    invoke-interface/range {p8 .. p8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 390
    :cond_8
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startBackInsert single Day download  syncDay  is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "startTime is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Lo/cnk;->a(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    new-instance v8, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 392
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 393
    invoke-virtual {v8, p3, p4}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDay(J)V

    .line 394
    invoke-virtual {v8, v6}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 395
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 396
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 397
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 398
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpu;->b(Landroid/content/Context;)Lo/cpu;

    move-result-object v0

    sget-object v1, Lo/crm;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cpu;->a(Ljava/lang/String;)I

    move-result v9

    .line 399
    sget-object v0, Lo/crm;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    invoke-virtual {v0, v8, v9}, Lo/csk;->b(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 400
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/crm;->h:Z
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_0

    .line 404
    :cond_9
    goto :goto_1

    .line 402
    :catch_0
    move-exception v8

    .line 403
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startBackInsert parseException e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    goto :goto_1

    .line 406
    :cond_a
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "network is disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    :goto_1
    return-void
.end method

.method private c(I)Z
    .locals 1

    .line 443
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 454
    :sswitch_0
    const/4 v0, 0x1

    return v0

    .line 456
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x55f0 -> :sswitch_0
        0x55f1 -> :sswitch_0
        0x55f2 -> :sswitch_0
        0x55f3 -> :sswitch_0
        0x5654 -> :sswitch_0
        0x5655 -> :sswitch_0
        0x5656 -> :sswitch_0
        0x5657 -> :sswitch_0
        0x5658 -> :sswitch_0
        0x5659 -> :sswitch_0
    .end sparse-switch
.end method

.method private d(IIILjava/lang/String;)I
    .locals 6

    .line 208
    const-string v0, "HiH_HiHealthDataReadStore"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStatClientID() readType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",who =  "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",app = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",device = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object p4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    const/4 v4, 0x0

    .line 210
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 212
    :pswitch_0
    iget-object v0, p0, Lo/crm;->d:Lo/cqz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lo/cqz;->a(III)I

    move-result v4

    .line 213
    goto :goto_0

    .line 215
    :pswitch_1
    iget-object v0, p0, Lo/crm;->d:Lo/cqz;

    const/4 v1, 0x0

    invoke-virtual {v0, p3, p2, v1}, Lo/cqz;->a(III)I

    move-result v4

    .line 216
    goto :goto_0

    .line 218
    :pswitch_2
    iget-object v0, p0, Lo/crm;->d:Lo/cqz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2, p4}, Lo/cqz;->e(IILjava/lang/String;)Lo/crd;

    move-result-object v5

    .line 219
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 220
    invoke-virtual {v5}, Lo/crd;->a()I

    move-result v4

    .line 226
    :cond_0
    :goto_0
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStatClientID() statClient = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    return v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private d(I)Z
    .locals 1

    .line 461
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 464
    :sswitch_0
    const/4 v0, 0x1

    return v0

    .line 466
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x7d2 -> :sswitch_0
        0x7e2 -> :sswitch_0
    .end sparse-switch
.end method

.method private e(IIILjava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIILjava/lang/String;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 190
    const/4 v1, 0x0

    .line 191
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 193
    :pswitch_0
    iget-object v0, p0, Lo/crm;->a:Lo/cqy;

    invoke-virtual {v0, p2}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v1

    .line 194
    goto :goto_0

    .line 196
    :pswitch_1
    iget-object v0, p0, Lo/crm;->a:Lo/cqy;

    invoke-virtual {v0, p3, p2}, Lo/cqy;->e(II)Ljava/util/List;

    move-result-object v1

    .line 197
    goto :goto_0

    .line 199
    :pswitch_2
    iget-object v0, p0, Lo/crm;->a:Lo/cqy;

    invoke-virtual {v0, p2, p4}, Lo/cqy;->c(ILjava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 200
    .line 204
    :goto_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static e(Landroid/content/Context;)Lo/crm;
    .locals 1

    .line 73
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/crm;->e:Landroid/content/Context;

    .line 74
    sget-object v0, Lo/crm$b;->e:Lo/crm;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/huawei/hihealth/HiDataReadOption;Lo/crd;Lo/clj;)V
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 232
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiDataReadOption;->getReadType()I

    move-result v9

    .line 233
    invoke-virtual/range {p2 .. p2}, Lo/crd;->f()I

    move-result v10

    .line 234
    invoke-virtual/range {p2 .. p2}, Lo/crd;->d()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiDataReadOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v9, v10, v0, v1}, Lo/crm;->e(IIILjava/lang/String;)Ljava/util/List;

    move-result-object v11

    .line 235
    invoke-virtual/range {p2 .. p2}, Lo/crd;->d()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiDataReadOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v9, v10, v0, v1}, Lo/crm;->d(IIILjava/lang/String;)I

    move-result v12

    .line 236
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readDataByType who is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " statClient is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    invoke-static {v11}, Lo/cne;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readDataByType clients null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    return-void

    .line 241
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiDataReadOption;->getType()[I

    move-result-object v13

    .line 242
    move-object v14, v13

    array-length v15, v14

    const/16 v16, 0x0

    :goto_0
    move/from16 v0, v16

    if-ge v0, v15, :cond_3

    aget v17, v14, v16

    .line 243
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/crm;->h:Z

    .line 244
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move v3, v10

    move-object v4, v11

    move v5, v12

    move/from16 v6, v17

    invoke-direct/range {v0 .. v6}, Lo/crm;->c(Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;ILjava/util/List;II)Ljava/util/List;

    move-result-object v18

    .line 245
    const/4 v0, 0x0

    aget v0, v13, v0

    move/from16 v1, v17

    if-ne v1, v0, :cond_1

    .line 246
    move-object/from16 v0, p0

    move v1, v10

    move-object v2, v13

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiDataReadOption;->getStartTime()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiDataReadOption;->getEndTime()J

    move-result-wide v5

    move-object/from16 v8, v18

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v8}, Lo/crm;->c(I[IJJILjava/util/List;)V

    .line 248
    :cond_1
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/crm;->h:Z

    if-eqz v0, :cond_2

    .line 249
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move v3, v10

    move-object v4, v11

    move v5, v12

    move/from16 v6, v17

    invoke-direct/range {v0 .. v6}, Lo/crm;->c(Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;ILjava/util/List;II)Ljava/util/List;

    .line 242
    :cond_2
    add-int/lit8 v16, v16, 0x1

    goto :goto_0

    .line 253
    :cond_3
    return-void
.end method

.method public c(ILo/crd;Lcom/huawei/hihealth/HiDataReadOption;Lo/clj;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 165
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiDataReadOption;->getReadType()I

    move-result v4

    .line 166
    invoke-virtual {p2}, Lo/crd;->f()I

    move-result v5

    .line 167
    invoke-virtual {p2}, Lo/crd;->d()I

    move-result v0

    invoke-virtual {p3}, Lcom/huawei/hihealth/HiDataReadOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v4, v5, v0, v1}, Lo/crm;->e(IIILjava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 168
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    :cond_0
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readDataByAlignType()  clients is null hiContext = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    return-void

    .line 173
    :cond_1
    sparse-switch p1, :sswitch_data_0

    goto :goto_1

    .line 176
    :sswitch_0
    if-nez v4, :cond_2

    .line 177
    iget-object v0, p0, Lo/crm;->c:Lo/cqn;

    invoke-virtual {v0, v6, p3}, Lo/cqn;->d(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;

    move-result-object v7

    goto :goto_0

    .line 179
    :cond_2
    iget-object v0, p0, Lo/crm;->c:Lo/cqn;

    invoke-virtual {v0, v6, p3}, Lo/cqn;->c(Ljava/util/List;Lcom/huawei/hihealth/HiDataReadOption;)Ljava/util/List;

    move-result-object v7

    .line 181
    :goto_0
    invoke-static {p1, v7, p4}, Lo/cnm;->a(ILjava/util/List;Lo/clj;)V

    .line 182
    goto :goto_2

    .line 184
    :goto_1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p4, v0, p1, v1}, Lo/clj;->e(Ljava/util/List;II)V

    .line 187
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x4e21 -> :sswitch_0
    .end sparse-switch
.end method

.method public d(Lo/crd;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/crd;Lcom/huawei/hihealth/HiAggregateOption;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 86
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getAlignType()I

    move-result v9

    .line 87
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getReadType()I

    move-result v10

    .line 88
    invoke-virtual/range {p1 .. p1}, Lo/crd;->f()I

    move-result v11

    .line 89
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getDeviceUUID()Ljava/lang/String;

    move-result-object v12

    .line 91
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getType()[I

    move-result-object v13

    .line 93
    const/4 v0, 0x0

    aget v0, v13, v0

    invoke-static {v0}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v14

    .line 94
    move-object/from16 v0, p0

    move-object v1, v14

    move v2, v9

    move v3, v10

    move v4, v11

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object v7, v12

    invoke-direct/range {v0 .. v7}, Lo/crm;->c(Lo/cmk$b;IIILo/crd;Lcom/huawei/hihealth/HiAggregateOption;Ljava/lang/String;)Ljava/util/List;

    move-result-object v15

    .line 95
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lo/crm;->h:Z

    .line 96
    move-object/from16 v0, p0

    move v1, v11

    move-object v2, v13

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getStartTime()J

    move-result-wide v3

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hihealth/HiAggregateOption;->getEndTime()J

    move-result-wide v5

    move-object v8, v15

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v8}, Lo/crm;->c(I[IJJILjava/util/List;)V

    .line 97
    const/4 v0, 0x0

    if-eq v0, v15, :cond_0

    .line 98
    const-string v0, "HiH_HiHealthDataReadStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readAggregateData types = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ret hiHealthDatas size = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    :cond_0
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/crm;->h:Z

    if-eqz v0, :cond_1

    .line 101
    move-object/from16 v0, p0

    move-object v1, v14

    move v2, v9

    move v3, v10

    move v4, v11

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object v7, v12

    invoke-direct/range {v0 .. v7}, Lo/crm;->c(Lo/cmk$b;IIILo/crd;Lcom/huawei/hihealth/HiAggregateOption;Ljava/lang/String;)Ljava/util/List;

    move-result-object v15

    .line 103
    :cond_1
    return-object v15
.end method
