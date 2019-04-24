.class public Lo/exy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejk;


# instance fields
.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/exy;->c:Ljava/util/List;

    .line 57
    iget-object v0, p0, Lo/exy;->c:Ljava/util/List;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    iget-object v0, p0, Lo/exy;->c:Ljava/util/List;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    iget-object v0, p0, Lo/exy;->c:Ljava/util/List;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    iget-object v0, p0, Lo/exy;->c:Ljava/util/List;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiHealthData;)F
    .locals 1

    .line 560
    const-string v0, "bike"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method static synthetic a(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F
    .locals 1

    .line 43
    invoke-direct {p0, p1}, Lo/exy;->e(Lcom/huawei/hihealth/HiHealthData;)F

    move-result v0

    return v0
.end method

.method private a(J)Ljava/util/Calendar;
    .locals 4

    .line 874
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 875
    invoke-virtual {v2, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 879
    const/16 v0, 0xc

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 881
    div-int/lit8 v0, v3, 0x1e

    if-nez v0, :cond_0

    .line 883
    const/16 v0, 0xc

    const/16 v1, 0xe

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 884
    const/16 v0, 0xd

    const/16 v1, 0x1e

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_0

    .line 887
    :cond_0
    const/16 v0, 0xc

    const/16 v1, 0x2c

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 888
    const/16 v0, 0xd

    const/16 v1, 0x1e

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 890
    :goto_0
    return-object v2
.end method

.method static synthetic a(Lo/exy;J)Ljava/util/Calendar;
    .locals 1

    .line 43
    invoke-direct {p0, p1, p2}, Lo/exy;->a(J)Ljava/util/Calendar;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/content/Context;JJILo/ekr;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJILo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 231
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 232
    invoke-virtual {v4, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 233
    invoke-virtual {v4, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 234
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 236
    const/4 v5, 0x5

    .line 237
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "content"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 238
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p6, v0, v1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 240
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 241
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 242
    const-string v0, "StepModuleChartStorageHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessDataDetail aggregateOption="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiAggregateOption;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 245
    invoke-virtual {v6, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 246
    invoke-virtual {v6, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 247
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 248
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "sum"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 249
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p6, v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 251
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 252
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 254
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 255
    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/exy$3;

    invoke-direct {v1, p0, p7}, Lo/exy$3;-><init>(Lo/exy;Lo/ekr;)V

    invoke-interface {v0, v7, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 310
    return-void
.end method

.method private a(I)[I
    .locals 4

    .line 600
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 601
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->b(ILo/eiv;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 603
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->c(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 604
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->b(ILo/eiv;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 606
    :cond_0
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->c(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 607
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->b(ILo/eiv;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 609
    :cond_1
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->c(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 610
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->b(ILo/eiv;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 612
    :cond_2
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->c(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 613
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->b(ILo/eiv;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 615
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-array v2, v0, [I

    .line 616
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_4

    .line 617
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v2, v3

    .line 616
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 619
    :cond_4
    return-object v2
.end method

.method private b(Lcom/huawei/hihealth/HiHealthData;)F
    .locals 1

    .line 552
    const-string v0, "walk"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method static synthetic b(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F
    .locals 1

    .line 43
    invoke-direct {p0, p1}, Lo/exy;->b(Lcom/huawei/hihealth/HiHealthData;)F

    move-result v0

    return v0
.end method

.method private b(ILo/eiv;)I
    .locals 2

    .line 670
    const v0, 0x9c42

    if-ne p1, v0, :cond_4

    .line 671
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_0

    .line 672
    const v0, 0x9c42

    return v0

    .line 673
    :cond_0
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    if-ne p2, v0, :cond_1

    .line 674
    const v0, 0x9c4b

    return v0

    .line 675
    :cond_1
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    if-ne p2, v0, :cond_2

    .line 676
    const v0, 0x9c4c

    return v0

    .line 677
    :cond_2
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    if-ne p2, v0, :cond_3

    .line 678
    const v0, 0x9c4d

    return v0

    .line 680
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "only support walk,run,climb in steps"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 683
    :cond_4
    const v0, 0x9c44

    if-ne p1, v0, :cond_a

    .line 684
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_5

    .line 685
    const v0, 0x9c44

    return v0

    .line 686
    :cond_5
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    if-ne p2, v0, :cond_6

    .line 687
    const v0, 0x9c5f

    return v0

    .line 688
    :cond_6
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    if-ne p2, v0, :cond_7

    .line 689
    const v0, 0x9c60

    return v0

    .line 690
    :cond_7
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    if-ne p2, v0, :cond_8

    .line 691
    const v0, 0x9c61

    return v0

    .line 692
    :cond_8
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    if-ne p2, v0, :cond_9

    .line 693
    const v0, 0x9c62

    return v0

    .line 695
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "only support walk,run,bike,climb in distance"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 698
    :cond_a
    const v0, 0x9c43

    if-ne p1, v0, :cond_10

    .line 699
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_b

    .line 700
    const v0, 0x9c43

    return v0

    .line 701
    :cond_b
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    if-ne p2, v0, :cond_c

    .line 702
    const v0, 0x9c55

    return v0

    .line 703
    :cond_c
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    if-ne p2, v0, :cond_d

    .line 704
    const v0, 0x9c56

    return v0

    .line 705
    :cond_d
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    if-ne p2, v0, :cond_e

    .line 706
    const v0, 0x9c57

    return v0

    .line 707
    :cond_e
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    if-ne p2, v0, :cond_f

    .line 708
    const v0, 0x9c58

    return v0

    .line 710
    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "only support walk,run,bike,climb in calories"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 713
    :cond_10
    const v0, 0x9c45

    if-ne p1, v0, :cond_11

    .line 714
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_11

    .line 715
    const v0, 0x9c45

    return v0

    .line 719
    :cond_11
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "only support steps,distance,calories"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private b(Landroid/content/Context;JJILo/ekr;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJILo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 133
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 134
    invoke-virtual {v2, p2, p3, p4, p5}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 135
    const/4 v0, 0x1

    new-array v3, v0, [I

    const/4 v0, 0x0

    aput p6, v3, v0

    .line 136
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 137
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/exy$4;

    invoke-direct {v1, p0, p7, p6}, Lo/exy$4;-><init>(Lo/exy;Lo/ekr;I)V

    invoke-interface {v0, v2, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 174
    return-void
.end method

.method private c(Lcom/huawei/hihealth/HiHealthData;)F
    .locals 1

    .line 564
    const-string v0, "climb"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F
    .locals 1

    .line 43
    invoke-direct {p0, p1}, Lo/exy;->a(Lcom/huawei/hihealth/HiHealthData;)F

    move-result v0

    return v0
.end method

.method private c(I)I
    .locals 1

    .line 847
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 848
    const v0, 0x9c42

    return v0

    .line 849
    :cond_0
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 850
    const v0, 0x9c43

    return v0

    .line 851
    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 852
    const v0, 0x9c44

    return v0

    .line 853
    :cond_2
    const/4 v0, 0x5

    if-ne p1, v0, :cond_3

    .line 854
    const v0, 0x9c45

    return v0

    .line 855
    :cond_3
    const/4 v0, 0x7

    if-ne p1, v0, :cond_4

    .line 856
    const v0, 0xb7fd

    return v0

    .line 859
    :cond_4
    return p1
.end method

.method private c(ILo/eiv;)Z
    .locals 1

    .line 623
    const v0, 0x9c42

    if-ne p1, v0, :cond_4

    .line 624
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_0

    .line 625
    const/4 v0, 0x1

    return v0

    .line 626
    :cond_0
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    if-ne p2, v0, :cond_1

    .line 627
    const/4 v0, 0x1

    return v0

    .line 628
    :cond_1
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    if-ne p2, v0, :cond_2

    .line 629
    const/4 v0, 0x1

    return v0

    .line 630
    :cond_2
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    if-ne p2, v0, :cond_3

    .line 631
    const/4 v0, 0x1

    return v0

    .line 633
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 636
    :cond_4
    const v0, 0x9c44

    if-ne p1, v0, :cond_a

    .line 637
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_5

    .line 638
    const/4 v0, 0x1

    return v0

    .line 639
    :cond_5
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    if-ne p2, v0, :cond_6

    .line 640
    const/4 v0, 0x1

    return v0

    .line 641
    :cond_6
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    if-ne p2, v0, :cond_7

    .line 642
    const/4 v0, 0x1

    return v0

    .line 643
    :cond_7
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    if-ne p2, v0, :cond_8

    .line 644
    const/4 v0, 0x1

    return v0

    .line 645
    :cond_8
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    if-ne p2, v0, :cond_9

    .line 646
    const/4 v0, 0x1

    return v0

    .line 648
    :cond_9
    const/4 v0, 0x0

    return v0

    .line 651
    :cond_a
    const v0, 0x9c43

    if-ne p1, v0, :cond_10

    .line 652
    sget-object v0, Lo/eiv;->d:Lo/eiv;

    if-ne p2, v0, :cond_b

    .line 653
    const/4 v0, 0x1

    return v0

    .line 654
    :cond_b
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    if-ne p2, v0, :cond_c

    .line 655
    const/4 v0, 0x1

    return v0

    .line 656
    :cond_c
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    if-ne p2, v0, :cond_d

    .line 657
    const/4 v0, 0x1

    return v0

    .line 658
    :cond_d
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    if-ne p2, v0, :cond_e

    .line 659
    const/4 v0, 0x1

    return v0

    .line 660
    :cond_e
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    if-ne p2, v0, :cond_f

    .line 661
    const/4 v0, 0x1

    return v0

    .line 663
    :cond_f
    const/4 v0, 0x0

    return v0

    .line 666
    :cond_10
    const/4 v0, 0x0

    return v0
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;)F
    .locals 1

    .line 556
    const-string v0, "run"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F
    .locals 1

    .line 43
    invoke-direct {p0, p1}, Lo/exy;->d(Lcom/huawei/hihealth/HiHealthData;)F

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/exy;J)Ljava/util/Calendar;
    .locals 1

    .line 43
    invoke-direct {p0, p1, p2}, Lo/exy;->e(J)Ljava/util/Calendar;

    move-result-object v0

    return-object v0
.end method

.method private d(Landroid/content/Context;JJILo/ekr;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJILo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 179
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 180
    invoke-virtual {v2, p2, p3}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 181
    invoke-virtual {v2, p4, p5}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 182
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p6, v0, v1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 183
    invoke-static {p1}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/exy$1;

    invoke-direct {v1, p0, p7, p6}, Lo/exy$1;-><init>(Lo/exy;Lo/ekr;I)V

    invoke-virtual {v0, v2, v1}, Lo/clq;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 227
    return-void
.end method

.method private d(I)[Ljava/lang/String;
    .locals 3

    .line 580
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 581
    const-string v0, "sum"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 583
    sget-object v0, Lo/eiv;->b:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->c(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 584
    const-string v0, "walk"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 586
    :cond_0
    sget-object v0, Lo/eiv;->a:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->c(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 587
    const-string v0, "run"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 589
    :cond_1
    sget-object v0, Lo/eiv;->c:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->c(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 590
    const-string v0, "bike"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 592
    :cond_2
    sget-object v0, Lo/eiv;->e:Lo/eiv;

    invoke-direct {p0, p1, v0}, Lo/exy;->c(ILo/eiv;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 593
    const-string v0, "climb"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 595
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-array v2, v0, [Ljava/lang/String;

    .line 596
    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method private e(Lcom/huawei/hihealth/HiHealthData;)F
    .locals 1

    .line 548
    const-string v0, "sum"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/exy;Lcom/huawei/hihealth/HiHealthData;)F
    .locals 1

    .line 43
    invoke-direct {p0, p1}, Lo/exy;->c(Lcom/huawei/hihealth/HiHealthData;)F

    move-result v0

    return v0
.end method

.method private e(Lo/eic;)I
    .locals 2

    .line 314
    const v1, 0x9c42

    .line 315
    invoke-virtual {p1}, Lo/eic;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 316
    invoke-virtual {p1}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 317
    const v1, 0x9c42

    goto/16 :goto_0

    .line 319
    :cond_0
    const/4 v1, 0x2

    goto/16 :goto_0

    .line 321
    :cond_1
    invoke-virtual {p1}, Lo/eic;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 322
    invoke-virtual {p1}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 323
    const v1, 0x9c43

    goto :goto_0

    .line 325
    :cond_2
    const/4 v1, 0x4

    goto :goto_0

    .line 328
    :cond_3
    invoke-virtual {p1}, Lo/eic;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 329
    invoke-virtual {p1}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 330
    const v1, 0x9c44

    goto :goto_0

    .line 332
    :cond_4
    const/4 v1, 0x3

    goto :goto_0

    .line 334
    :cond_5
    invoke-virtual {p1}, Lo/eic;->k()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 335
    invoke-virtual {p1}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 336
    const v1, 0x9c45

    goto :goto_0

    .line 338
    :cond_6
    const/4 v1, 0x5

    goto :goto_0

    .line 340
    :cond_7
    invoke-virtual {p1}, Lo/eic;->o()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 341
    const/16 v1, 0x102

    goto :goto_0

    .line 342
    :cond_8
    invoke-virtual {p1}, Lo/eic;->m()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 343
    const/16 v1, 0x101

    goto :goto_0

    .line 344
    :cond_9
    invoke-virtual {p1}, Lo/eic;->n()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 345
    const/16 v1, 0x103

    goto :goto_0

    .line 346
    :cond_a
    invoke-virtual {p1}, Lo/eic;->p()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 347
    invoke-virtual {p1}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 348
    const v1, 0xb7fd

    goto :goto_0

    .line 350
    :cond_b
    const/4 v1, 0x7

    .line 353
    :cond_c
    :goto_0
    return v1
.end method

.method private e(J)Ljava/util/Calendar;
    .locals 3

    .line 863
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 864
    invoke-virtual {v2, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 865
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 866
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 867
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 868
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 869
    return-object v2
.end method

.method private e(Landroid/content/Context;JJIFLo/ekr;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJIFLo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 725
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 726
    invoke-virtual {v4, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 727
    invoke-virtual {v4, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 728
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 730
    const/4 v5, 0x0

    .line 731
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "content"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 732
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p6, v0, v1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 733
    const/16 v0, 0x4e21

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAlignType(I)V

    .line 735
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 736
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 739
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 740
    invoke-virtual {v6, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 741
    invoke-virtual {v6, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 742
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 744
    const/4 v7, 0x3

    .line 745
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "sum"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 746
    const/4 v0, 0x1

    new-array v0, v0, [I

    invoke-direct {p0, p6}, Lo/exy;->c(I)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 748
    invoke-virtual {v6, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 749
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 751
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 752
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 753
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 755
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/exy$10;

    move-object/from16 v2, p8

    move/from16 v3, p7

    invoke-direct {v1, p0, v2, v3}, Lo/exy$10;-><init>(Lo/exy;Lo/ekr;F)V

    invoke-interface {v0, v8, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 844
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;JJIFLo/ekr;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJIFLo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 365
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 366
    invoke-virtual {v4, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 367
    invoke-virtual {v4, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 368
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 370
    const/4 v5, 0x3

    .line 371
    invoke-direct {p0, p6}, Lo/exy;->d(I)[Ljava/lang/String;

    move-result-object v6

    .line 372
    invoke-direct {p0, p6}, Lo/exy;->a(I)[I

    move-result-object v7

    .line 373
    invoke-virtual {v4, v6}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 374
    invoke-virtual {v4, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 376
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 377
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 379
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 380
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 382
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/exy$5;

    move-object/from16 v2, p8

    move/from16 v3, p7

    invoke-direct {v1, p0, v2, v3}, Lo/exy$5;-><init>(Lo/exy;Lo/ekr;F)V

    invoke-interface {v0, v8, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 428
    return-void
.end method

.method public d(Landroid/content/Context;JJIFLo/ekr;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJIFLo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 437
    new-instance v4, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 438
    invoke-virtual {v4, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 439
    invoke-virtual {v4, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 440
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 442
    const/4 v5, 0x5

    .line 443
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "content"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 444
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p6, v0, v1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 446
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 447
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 448
    const-string v0, "StepModuleChartStorageHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessDataDetail aggregateOption="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiAggregateOption;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    new-instance v6, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 451
    invoke-virtual {v6, p2, p3}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 452
    invoke-virtual {v6, p4, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 453
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 454
    move/from16 v0, p6

    invoke-direct {p0, v0}, Lo/exy;->d(I)[Ljava/lang/String;

    move-result-object v7

    .line 455
    move/from16 v0, p6

    invoke-direct {p0, v0}, Lo/exy;->a(I)[I

    move-result-object v8

    .line 456
    invoke-virtual {v6, v7}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 457
    invoke-virtual {v6, v8}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 461
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 462
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 465
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 466
    invoke-interface {v9, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 467
    invoke-interface {v9, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 470
    invoke-static {p1}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/exy$2;

    move-object/from16 v2, p8

    move/from16 v3, p7

    invoke-direct {v1, p0, v2, v3}, Lo/exy$2;-><init>(Lo/exy;Lo/ekr;F)V

    invoke-interface {v0, v9, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 545
    return-void
.end method

.method public d(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 80
    const-wide/16 v0, 0x1

    sub-long v9, p4, v0

    .line 82
    move-object/from16 v0, p6

    invoke-direct {p0, v0}, Lo/exy;->e(Lo/eic;)I

    move-result v11

    .line 84
    invoke-virtual/range {p6 .. p6}, Lo/eic;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 85
    invoke-virtual/range {p6 .. p6}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, v9

    move v6, v11

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lo/exy;->a(Landroid/content/Context;JJILo/ekr;)V

    .line 87
    const-string v0, "StepModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isYearData start  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, p2

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  endTime"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  dataType  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    return-void

    .line 90
    :cond_0
    invoke-virtual/range {p6 .. p6}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, v9

    move v6, v11

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lo/exy;->d(Landroid/content/Context;JJILo/ekr;)V

    .line 92
    const-string v0, "StepModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isDayData start  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, p2

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  endTime"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  dataType  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    return-void

    .line 95
    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, v9

    move v6, v11

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lo/exy;->b(Landroid/content/Context;JJILo/ekr;)V

    .line 96
    const-string v0, "StepModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is weekandmonth start  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide v3, p2

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  endTime"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  dataType  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void

    .line 100
    :cond_2
    const/high16 v12, 0x3f800000    # 1.0f

    .line 102
    invoke-virtual/range {p6 .. p6}, Lo/eic;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 103
    const v12, 0x3a83126f    # 0.001f

    .line 105
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 106
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v12, v0

    goto :goto_0

    .line 108
    :cond_3
    invoke-virtual/range {p6 .. p6}, Lo/eic;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 109
    const v12, 0x3dcccccd    # 0.1f

    .line 111
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 112
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float/2addr v12, v0

    goto :goto_0

    .line 114
    :cond_4
    invoke-virtual/range {p6 .. p6}, Lo/eic;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 115
    const v12, 0x3a83126f    # 0.001f

    .line 118
    :cond_5
    :goto_0
    invoke-virtual/range {p6 .. p6}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 119
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, v9

    move v6, v11

    move v7, v12

    move-object/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, Lo/exy;->d(Landroid/content/Context;JJIFLo/ekr;)V

    .line 120
    return-void

    .line 123
    :cond_6
    invoke-virtual/range {p6 .. p6}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 125
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, v9

    move v6, v11

    move v7, v12

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lo/exy;->e(Landroid/content/Context;JJIFLo/ekr;)V

    .line 126
    return-void

    .line 128
    :cond_7
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, v9

    move v6, v11

    move v7, v12

    move-object/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, Lo/exy;->a(Landroid/content/Context;JJIFLo/ekr;)V

    .line 129
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lo/exy;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 67
    iget-object v0, p0, Lo/exy;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 68
    return-void
.end method
