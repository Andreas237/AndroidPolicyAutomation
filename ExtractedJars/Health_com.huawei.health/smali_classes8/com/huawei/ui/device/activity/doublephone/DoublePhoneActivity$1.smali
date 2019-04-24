.class Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)V
    .locals 0

    .line 293
    iput-object p1, p0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;->c:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 21

    .line 296
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.1.36  err_code : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   objData : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    move-object/from16 v4, p2

    if-ne v3, v4, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    move-object/from16 v3, p2

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    const/4 v5, 0x3

    .line 298
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;->c:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 299
    const/4 v0, 0x0

    move/from16 v1, p1

    if-ne v0, v1, :cond_8

    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_8

    .line 300
    move-object/from16 v0, p2

    check-cast v0, [B

    move-object v6, v0

    check-cast v6, [B

    .line 301
    const/4 v0, 0x1

    aget-byte v0, v6, v0

    const/16 v1, 0x24

    if-ne v1, v0, :cond_7

    .line 302
    invoke-static {v6}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v7

    .line 303
    const/4 v8, 0x4

    .line 304
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v1, v0, :cond_6

    .line 306
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v7, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 307
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v9

    .line 308
    iget-object v10, v9, Lo/dba;->b:Ljava/util/List;

    .line 309
    iget-object v11, v9, Lo/dba;->e:Ljava/util/List;

    .line 310
    const/4 v0, 0x0

    if-eq v0, v11, :cond_2

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 311
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 312
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 314
    :sswitch_0
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.1.36 get error code."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    .line 319
    :goto_2
    goto :goto_1

    :cond_1
    goto :goto_3

    .line 321
    :cond_2
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tlvList is empty."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    :goto_3
    const/4 v0, 0x0

    if-eq v0, v10, :cond_5

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 324
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.1.36 tlvFatherList.size() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/dba;

    .line 326
    iget-object v14, v13, Lo/dba;->b:Ljava/util/List;

    .line 327
    const/4 v0, 0x0

    if-eq v0, v14, :cond_4

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 328
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/dba;

    .line 329
    move-object/from16 v0, v16

    iget-object v0, v0, Lo/dba;->e:Ljava/util/List;

    move-object/from16 v17, v0

    .line 330
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_3

    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 331
    const/16 v18, 0x0

    .line 332
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_6
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lo/daw;

    .line 333
    invoke-virtual/range {v20 .. v20}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_7

    .line 335
    :sswitch_1
    invoke-virtual/range {v20 .. v20}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 336
    .line 340
    :goto_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;->c:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 341
    goto :goto_6

    .line 343
    :cond_3
    goto/16 :goto_5

    .line 345
    :cond_4
    goto/16 :goto_4

    .line 347
    :cond_5
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connectedPhoneNames : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;->c:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->d(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;->c:Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;->e(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity;)Lo/egd;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1$2;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1$2;-><init>(Lcom/huawei/ui/device/activity/doublephone/DoublePhoneActivity$1;)V

    invoke-virtual {v0, v1}, Lo/egd;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    .line 356
    goto :goto_8

    .line 354
    :catch_0
    move-exception v9

    .line 355
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    :cond_6
    :goto_8
    goto :goto_9

    .line 359
    :cond_7
    const-string v0, "DoublePhoneActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "error command id. : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x1

    aget-byte v3, v6, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    :cond_8
    :goto_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x3 -> :sswitch_1
    .end sparse-switch
.end method
