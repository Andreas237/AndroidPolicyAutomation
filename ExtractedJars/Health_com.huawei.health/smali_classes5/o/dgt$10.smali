.class Lo/dgt$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgt;->e(JIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:[Ljava/lang/String;

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:I

.field final synthetic e:Lo/dgt;


# direct methods
.method constructor <init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I[Ljava/lang/String;)V
    .locals 0

    .line 619
    iput-object p1, p0, Lo/dgt$10;->e:Lo/dgt;

    iput-object p2, p0, Lo/dgt$10;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput p3, p0, Lo/dgt$10;->d:I

    iput-object p4, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 624
    invoke-static {}, Lo/dgt;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFitnessDataDetailByData aggregateHiHealthData onResult datas = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 625
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 626
    :cond_0
    iget-object v0, p0, Lo/dgt$10;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 627
    return-void

    .line 629
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 630
    new-instance v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;

    invoke-direct {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;-><init>()V

    .line 631
    iget v0, p0, Lo/dgt$10;->d:I

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->setDataType(I)V

    .line 632
    const/4 v6, 0x0

    .line 633
    const/4 v7, 0x0

    .line 634
    const/4 v8, 0x0

    .line 635
    const/4 v9, 0x0

    .line 636
    const/4 v10, 0x0

    .line 637
    const/4 v11, 0x0

    .line 638
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 639
    iget v0, p0, Lo/dgt$10;->d:I

    invoke-static {v0}, Lo/dhc;->e(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 641
    :pswitch_0
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 642
    if-lez v11, :cond_2

    .line 643
    add-int/2addr v6, v11

    goto :goto_1

    .line 645
    :cond_2
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v6, v0

    .line 647
    :goto_1
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v7, v0

    .line 648
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v8, v0

    .line 649
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v9, v0

    .line 650
    goto/16 :goto_3

    .line 653
    :pswitch_1
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 654
    if-lez v11, :cond_3

    .line 655
    add-int/2addr v6, v11

    goto :goto_2

    .line 657
    :cond_3
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v6, v0

    .line 659
    :goto_2
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v7, v0

    .line 660
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v8, v0

    .line 661
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v10, v0

    .line 662
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v9, v0

    .line 663
    goto :goto_3

    .line 665
    :pswitch_2
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v6, v0

    .line 666
    iget-object v0, p0, Lo/dgt$10;->b:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v9, v0

    .line 667
    .line 671
    :goto_3
    goto/16 :goto_0

    .line 673
    :cond_4
    invoke-virtual {v5, v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->setAll(I)V

    .line 674
    invoke-virtual {v5, v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->setWalk(I)V

    .line 675
    invoke-virtual {v5, v8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->setRun(I)V

    .line 676
    invoke-virtual {v5, v10}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->setRide(I)V

    .line 677
    invoke-virtual {v5, v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->setClimb(I)V

    .line 682
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 684
    iget-object v0, p0, Lo/dgt$10;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 685
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
