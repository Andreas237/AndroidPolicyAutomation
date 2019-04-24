.class public Lo/cve;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 17
    if-eqz p0, :cond_0

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 20
    :cond_1
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 21
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 25
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/hihealth/HiHealthData;

    .line 26
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v9

    .line 27
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getUserID()I

    move-result v12

    .line 28
    invoke-static {v9}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v15

    .line 29
    sget-object v0, Lo/cve$2;->d:[I

    invoke-virtual {v15}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 31
    :pswitch_0
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 32
    move-object v0, v8

    move-object v1, v7

    move-object v2, v14

    invoke-static {v9}, Lo/cmk;->a(I)I

    move-result v3

    move-wide v4, v10

    move v6, v12

    invoke-static/range {v0 .. v6}, Lo/cve;->a(Ljava/util/List;Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IJI)V

    .line 33
    goto/16 :goto_2

    .line 36
    :pswitch_1
    const/16 v0, 0x7918

    if-gt v9, v0, :cond_4

    .line 37
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 38
    move-object v0, v8

    move-object v1, v7

    move-object v2, v14

    move-wide v4, v10

    move v6, v12

    const/16 v3, 0x7531

    invoke-static/range {v0 .. v6}, Lo/cve;->a(Ljava/util/List;Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IJI)V

    goto/16 :goto_2

    .line 43
    :pswitch_2
    const/16 v0, 0x2712

    if-ne v9, v0, :cond_4

    .line 44
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 45
    move-object v0, v8

    move-object v1, v7

    move-object v2, v14

    move-wide v4, v10

    move v6, v12

    const/16 v3, 0x2712

    invoke-static/range {v0 .. v6}, Lo/cve;->a(Ljava/util/List;Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IJI)V

    goto/16 :goto_2

    .line 50
    :pswitch_3
    const/16 v0, 0x5208

    if-gt v9, v0, :cond_2

    .line 51
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 52
    move-object v0, v8

    move-object v1, v7

    move-object v2, v14

    move-wide v4, v10

    move v6, v12

    const/16 v3, 0x4e21

    invoke-static/range {v0 .. v6}, Lo/cve;->a(Ljava/util/List;Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IJI)V

    goto/16 :goto_2

    .line 53
    :cond_2
    const/16 v0, 0x5653

    if-gt v9, v0, :cond_3

    .line 54
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->n(J)J

    move-result-wide v10

    .line 55
    move-object v0, v8

    move-object v1, v7

    move-object v2, v14

    move-wide v4, v10

    move v6, v12

    const/16 v3, 0x55f0

    invoke-static/range {v0 .. v6}, Lo/cve;->a(Ljava/util/List;Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IJI)V

    goto :goto_2

    .line 56
    :cond_3
    const/16 v0, 0x56b7

    if-gt v9, v0, :cond_4

    .line 57
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->n(J)J

    move-result-wide v10

    .line 58
    move-object v0, v8

    move-object v1, v7

    move-object v2, v14

    move-wide v4, v10

    move v6, v12

    const/16 v3, 0x5654

    invoke-static/range {v0 .. v6}, Lo/cve;->a(Ljava/util/List;Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IJI)V

    goto :goto_2

    .line 62
    :pswitch_4
    const v0, 0x9c76

    if-ne v0, v9, :cond_4

    .line 63
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 64
    move-object v0, v8

    move-object v1, v7

    move-object v2, v14

    move v3, v9

    move-wide v4, v10

    move v6, v12

    invoke-static/range {v0 .. v6}, Lo/cve;->a(Ljava/util/List;Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IJI)V

    goto :goto_2

    .line 68
    :pswitch_5
    invoke-virtual {v14}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 69
    invoke-static {v9}, Lo/cmi;->e(I)[I

    move-result-object v16

    .line 70
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_4

    .line 71
    const/16 v17, 0x0

    :goto_1
    move-object/from16 v0, v16

    array-length v0, v0

    move/from16 v1, v17

    if-ge v1, v0, :cond_4

    .line 72
    move-object v0, v8

    move-object v1, v7

    move-object v2, v14

    aget v3, v16, v17

    move-wide v4, v10

    move v6, v12

    invoke-static/range {v0 .. v6}, Lo/cve;->a(Ljava/util/List;Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IJI)V

    .line 71
    add-int/lit8 v17, v17, 0x1

    goto :goto_1

    .line 79
    :cond_4
    :goto_2
    goto/16 :goto_0

    .line 80
    :cond_5
    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private static a(Ljava/util/List;Ljava/util/List;Lcom/huawei/hihealth/HiHealthData;IJI)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/util/List<Ljava/lang/String;>;Lcom/huawei/hihealth/HiHealthData;IJI)V"
        }
    .end annotation

    .line 84
    if-lez p3, :cond_0

    if-gtz p6, :cond_1

    .line 85
    :cond_0
    return-void

    .line 87
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 88
    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 89
    return-void

    .line 91
    :cond_2
    invoke-virtual {p2, p3}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 92
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/huawei/hihealth/HiHealthData;->setSequenceData(Ljava/lang/String;)V

    .line 93
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 94
    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    return-void
.end method
