.class Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field private c:J

.field private d:I

.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;IZIJ)V
    .locals 1

    .line 480
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 475
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->a:I

    .line 481
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->e:Ljava/lang/ref/WeakReference;

    .line 482
    iput p2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->a:I

    .line 483
    iput-boolean p3, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->b:Z

    .line 484
    iput p4, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->d:I

    .line 485
    iput-wide p5, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->c:J

    .line 486
    return-void
.end method

.method private a(ILcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)Ljava/lang/String;
    .locals 4

    .line 490
    const-string v2, ""

    .line 491
    iget-object v3, p2, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a:Landroid/content/Context;

    .line 492
    if-nez v3, :cond_0

    .line 493
    return-object v2

    .line 495
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 497
    :pswitch_0
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sunday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 498
    goto :goto_0

    .line 500
    :pswitch_1
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_monday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 501
    goto :goto_0

    .line 503
    :pswitch_2
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_tuesday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 504
    goto :goto_0

    .line 506
    :pswitch_3
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_wednesday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 507
    goto :goto_0

    .line 509
    :pswitch_4
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_thursday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 510
    goto :goto_0

    .line 512
    :pswitch_5
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_friday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 513
    goto :goto_0

    .line 515
    :pswitch_6
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_saturday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 516
    .line 520
    :goto_0
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private b(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;ILjava/util/List;)Ljava/util/ArrayList;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/ArrayList<Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;>;"
        }
    .end annotation

    .line 574
    move-object/from16 v0, p1

    iget v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->O:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 576
    :pswitch_0
    const-string v0, "Track_Ride_Distance_Sum"

    move-object/from16 v1, p1

    iput-object v0, v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->S:Ljava/lang/String;

    .line 577
    goto :goto_1

    .line 579
    :pswitch_1
    const-string v0, "Track_Walk_Distance_Sum"

    move-object/from16 v1, p1

    iput-object v0, v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->S:Ljava/lang/String;

    .line 580
    goto :goto_1

    .line 583
    :goto_0
    :pswitch_2
    const-string v0, "Track_Run_Distance_Sum"

    move-object/from16 v1, p1

    iput-object v0, v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->S:Ljava/lang/String;

    .line 586
    :goto_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 587
    move-object/from16 v0, p0

    iget-wide v6, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->c:J

    .line 588
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v8

    .line 589
    packed-switch p2, :pswitch_data_1

    goto/16 :goto_d

    .line 591
    :pswitch_3
    invoke-static {v6, v7}, Lo/ffk;->c(J)J

    move-result-wide v6

    .line 592
    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_2
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->d:I

    if-ge v9, v0, :cond_3

    .line 593
    neg-int v0, v9

    invoke-static {v6, v7, v0}, Lo/ffk;->b(JI)J

    move-result-wide v11

    .line 594
    new-instance v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    invoke-direct {v13}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;-><init>()V

    .line 595
    invoke-virtual {v8, v11, v12}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 596
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v14, v0, 0x1

    .line 597
    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->C:Z

    if-eqz v0, :cond_0

    .line 598
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    goto :goto_3

    .line 600
    :cond_0
    const-string v0, "M"

    invoke-static {v0, v11, v12}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    .line 602
    :goto_3
    const/16 v0, 0xc

    if-eq v14, v0, :cond_1

    .line 603
    iput v14, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->right_skip:I

    .line 604
    rsub-int/lit8 v0, v14, 0xc

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->left_skip:I

    goto :goto_4

    .line 606
    :cond_1
    const/4 v0, 0x0

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->right_skip:I

    .line 607
    const/4 v0, 0x0

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->left_skip:I

    .line 609
    :goto_4
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_2

    .line 610
    move-object/from16 v0, p3

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ffk;->b(JI)J

    move-result-wide v0

    cmp-long v0, v11, v0

    if-nez v0, :cond_2

    .line 611
    move-object/from16 v0, p3

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    move-object/from16 v1, p1

    iget-object v1, v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->S:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 612
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 614
    :cond_2
    const-wide/16 v0, 0x0

    iput-wide v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 616
    :goto_5
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 592
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_2

    .line 618
    :cond_3
    goto/16 :goto_18

    .line 620
    :pswitch_4
    invoke-static {v6, v7}, Lo/ffk;->a(J)J

    move-result-wide v6

    .line 621
    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_6
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->d:I

    if-ge v9, v0, :cond_b

    .line 622
    neg-int v0, v9

    invoke-static {v6, v7, v0}, Lo/ffk;->c(JI)J

    move-result-wide v11

    .line 623
    invoke-virtual {v8, v11, v12}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 624
    new-instance v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    invoke-direct {v13}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;-><init>()V

    .line 625
    const/4 v0, 0x5

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->get(I)I

    move-result v14

    .line 626
    const/4 v0, 0x0

    invoke-static {v11, v12, v0}, Lo/ffk;->h(JI)I

    move-result v15

    .line 627
    if-ne v14, v15, :cond_4

    .line 628
    const/4 v0, 0x0

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->left_skip:I

    .line 629
    const/4 v0, 0x0

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->right_skip:I

    goto :goto_7

    .line 631
    :cond_4
    const/4 v0, -0x1

    invoke-static {v11, v12, v0}, Lo/ffk;->h(JI)I

    move-result v0

    add-int/2addr v0, v14

    add-int/lit8 v0, v0, -0x1f

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->right_skip:I

    .line 632
    const/4 v0, 0x1

    invoke-static {v11, v12, v0}, Lo/ffk;->h(JI)I

    move-result v0

    add-int/2addr v0, v15

    sub-int/2addr v0, v14

    add-int/lit8 v0, v0, -0x1f

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->left_skip:I

    .line 634
    :goto_7
    rem-int/lit8 v0, v14, 0x5

    if-nez v0, :cond_8

    .line 635
    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->C:Z

    if-eqz v0, :cond_6

    .line 636
    const/4 v0, 0x5

    if-ne v14, v0, :cond_5

    .line 637
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v8, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    goto :goto_8

    .line 639
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    goto :goto_8

    .line 642
    :cond_6
    const/4 v0, 0x5

    if-ne v14, v0, :cond_7

    .line 643
    const-string v0, "M/d"

    invoke-static {v0, v11, v12}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    goto :goto_8

    .line 645
    :cond_7
    const-string v0, "d"

    invoke-static {v0, v11, v12}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    .line 649
    :cond_8
    :goto_8
    invoke-static {v11, v12}, Lo/ffk;->f(J)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 650
    const/4 v0, 0x5

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->flag:I

    .line 651
    const/4 v0, 0x1

    invoke-static {v11, v12, v0}, Lo/ffk;->h(JI)I

    move-result v0

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->flag_next:I

    .line 653
    :cond_9
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_a

    .line 654
    move-object/from16 v0, p3

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ffk;->c(JI)J

    move-result-wide v0

    cmp-long v0, v11, v0

    if-nez v0, :cond_a

    .line 655
    move-object/from16 v0, p3

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    move-object/from16 v1, p1

    iget-object v1, v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->S:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 656
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    .line 658
    :cond_a
    const-wide/16 v0, 0x0

    iput-wide v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 660
    :goto_9
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 621
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_6

    .line 662
    :cond_b
    goto/16 :goto_18

    .line 664
    :pswitch_5
    invoke-static {v6, v7}, Lo/ffk;->a(J)J

    move-result-wide v6

    .line 665
    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_a
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->d:I

    if-ge v9, v0, :cond_12

    .line 666
    neg-int v0, v9

    invoke-static {v6, v7, v0}, Lo/ffk;->c(JI)J

    move-result-wide v11

    .line 667
    invoke-virtual {v8, v11, v12}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 668
    new-instance v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    invoke-direct {v13}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;-><init>()V

    .line 669
    const/4 v0, 0x5

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->get(I)I

    move-result v14

    .line 670
    const/4 v0, 0x7

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->get(I)I

    move-result v15

    .line 671
    move-object/from16 v0, p1

    iget v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->ac:I

    sub-int v0, v15, v0

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->right_skip:I

    .line 672
    move-object/from16 v0, p1

    iget v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->ac:I

    sub-int/2addr v0, v15

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->left_skip:I

    .line 673
    iget v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->right_skip:I

    if-gez v0, :cond_c

    .line 674
    iget v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->right_skip:I

    add-int/lit8 v0, v0, 0x7

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->right_skip:I

    .line 676
    :cond_c
    iget v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->left_skip:I

    if-gez v0, :cond_d

    .line 677
    iget v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->left_skip:I

    add-int/lit8 v0, v0, 0x7

    iput v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->left_skip:I

    .line 680
    :cond_d
    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->C:Z

    if-eqz v0, :cond_f

    .line 681
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v8, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->subLable:Ljava/lang/String;

    .line 682
    const/4 v0, 0x0

    iput-boolean v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->isShowSubLable:Z

    .line 683
    const/4 v0, 0x2

    if-ne v15, v0, :cond_e

    .line 684
    const/4 v0, 0x1

    iput-boolean v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->isShowSubLable:Z

    .line 686
    :cond_e
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v15, v1}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->a(ILcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    goto :goto_b

    .line 693
    :cond_f
    const/4 v0, 0x1

    if-ne v14, v0, :cond_10

    .line 694
    const-string v0, "M/d"

    invoke-static {v0, v11, v12}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    goto :goto_b

    .line 696
    :cond_10
    const-string v0, "d"

    invoke-static {v0, v11, v12}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    .line 700
    :goto_b
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_11

    .line 701
    move-object/from16 v0, p3

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ffk;->c(JI)J

    move-result-wide v0

    cmp-long v0, v11, v0

    if-nez v0, :cond_11

    .line 702
    move-object/from16 v0, p3

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    move-object/from16 v1, p1

    iget-object v1, v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->S:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 703
    add-int/lit8 v10, v10, 0x1

    goto :goto_c

    .line 705
    :cond_11
    const-wide/16 v0, 0x0

    iput-wide v0, v13, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 707
    :goto_c
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 665
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_a

    .line 709
    :cond_12
    goto/16 :goto_18

    .line 712
    :goto_d
    :pswitch_6
    move-object/from16 v0, p1

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->R:J

    invoke-virtual {v8, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 713
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit16 v0, v0, -0x7de

    add-int/lit8 v9, v0, 0x1

    .line 714
    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_e
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_14

    .line 715
    neg-int v0, v10

    invoke-static {v6, v7, v0}, Lo/ffk;->a(JI)J

    move-result-wide v12

    .line 716
    invoke-virtual {v8, v12, v13}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 717
    new-instance v14, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    invoke-direct {v14}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;-><init>()V

    .line 718
    const-string v0, "yyyy"

    invoke-virtual {v8}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v14, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    .line 719
    .line 720
    move-object/from16 v0, p3

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ffk;->a(JI)J

    move-result-wide v0

    cmp-long v0, v12, v0

    if-nez v0, :cond_13

    .line 721
    move-object/from16 v0, p3

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    move-object/from16 v1, p1

    iget-object v1, v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->S:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, v14, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 722
    add-int/lit8 v11, v11, 0x1

    goto :goto_f

    .line 724
    :cond_13
    const-wide/16 v0, 0x0

    iput-wide v0, v14, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 726
    :goto_f
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 714
    add-int/lit8 v10, v10, 0x1

    goto :goto_e

    .line 728
    :cond_14
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_15

    .line 729
    const/4 v0, 0x1

    move-object/from16 v1, p1

    iput v0, v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->H:I

    .line 730
    return-object v5

    .line 733
    :cond_15
    const/16 v0, 0x1d

    if-le v9, v0, :cond_16

    .line 734
    const/16 v9, 0x1d

    goto :goto_10

    .line 735
    :cond_16
    if-gez v9, :cond_17

    .line 736
    const/4 v9, 0x0

    .line 738
    :cond_17
    :goto_10
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    move-object/from16 v1, p1

    iput v0, v1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->H:I

    .line 739
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v9, :cond_1e

    .line 740
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 741
    const/4 v11, 0x0

    :goto_11
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v11, v0, :cond_1a

    .line 742
    if-ne v11, v9, :cond_18

    .line 743
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    .line 744
    :cond_18
    if-le v11, v9, :cond_19

    .line 745
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    .line 746
    iget-wide v0, v12, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-wide v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    add-double/2addr v0, v2

    iput-wide v0, v12, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 747
    goto :goto_12

    .line 748
    :cond_19
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 741
    :goto_12
    add-int/lit8 v11, v11, 0x1

    goto :goto_11

    .line 751
    :cond_1a
    const/16 v0, 0x1d

    if-ge v9, v0, :cond_1c

    .line 752
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v11

    .line 753
    const/4 v0, 0x1

    const/16 v1, 0x7de

    invoke-virtual {v11, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 754
    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->A:Z

    if-eqz v0, :cond_1b

    .line 755
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "yyyy"

    invoke-virtual {v11}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ">"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    goto :goto_13

    .line 757
    :cond_1b
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "yyyy"

    invoke-virtual {v11}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    .line 759
    :goto_13
    goto :goto_14

    .line 760
    :cond_1c
    move-object/from16 v0, p1

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->A:Z

    if-eqz v0, :cond_1d

    .line 761
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-object v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ">"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    goto :goto_14

    .line 763
    :cond_1d
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    iget-object v2, v2, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    .line 766
    :goto_14
    move-object v5, v10

    .line 769
    :cond_1e
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x5

    if-le v0, v1, :cond_20

    .line 770
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 771
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 772
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 773
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    div-int/lit8 v11, v0, 0x3

    .line 774
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    rem-int/lit8 v0, v0, 0x3

    sparse-switch v0, :sswitch_data_0

    goto :goto_15

    .line 776
    :sswitch_0
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 777
    mul-int/lit8 v0, v11, 0x2

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 778
    goto :goto_16

    .line 780
    :sswitch_1
    add-int/lit8 v0, v11, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 781
    mul-int/lit8 v0, v11, 0x2

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 782
    goto :goto_16

    .line 784
    :goto_15
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 785
    mul-int/lit8 v0, v11, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 788
    :goto_16
    const/4 v12, 0x0

    :goto_17
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v12, v0, :cond_20

    .line 789
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    .line 790
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    const-string v1, ""

    iput-object v1, v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    .line 788
    :cond_1f
    add-int/lit8 v12, v12, 0x1

    goto :goto_17

    .line 797
    :cond_20
    :goto_18
    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 10

    .line 525
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    .line 526
    if-nez v4, :cond_0

    .line 527
    return-void

    .line 530
    :cond_0
    if-eqz p2, :cond_1

    instance-of v0, p2, Landroid/util/SparseArray;

    if-nez v0, :cond_2

    .line 532
    :cond_1
    const-string v0, "Track_BaseSportDataFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong bar data : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    return-void

    .line 537
    :cond_2
    move-object v5, p2

    :try_start_0
    check-cast v5, Landroid/util/SparseArray;

    .line 538
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 540
    const-string v0, "Track_BaseSportDataFragment"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "\ndetail "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    if-eqz v6, :cond_3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 543
    :cond_3
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->a:I

    if-nez v6, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_4
    move-object v1, v6

    :goto_0
    invoke-direct {p0, v4, v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->b(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;ILjava/util/List;)Ljava/util/ArrayList;

    move-result-object v7

    goto :goto_3

    .line 545
    :cond_5
    iget v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->a:I

    invoke-direct {p0, v4, v0, v6}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->b(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;ILjava/util/List;)Ljava/util/ArrayList;

    move-result-object v7

    .line 546
    iget-boolean v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->D:Z

    if-eqz v0, :cond_7

    .line 547
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_6

    .line 548
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    .line 549
    iget-wide v0, v9, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    const-wide v2, 0x3fe3e245dad5a40cL    # 0.6213712

    mul-double/2addr v0, v2

    iput-wide v0, v9, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 547
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_6
    goto :goto_3

    .line 552
    :cond_7
    const/4 v8, 0x0

    :goto_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_8

    .line 553
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    .line 554
    iget-wide v0, v9, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    iput-wide v0, v9, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 552
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 558
    :cond_8
    :goto_3
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$d;->b:Z

    if-eqz v0, :cond_9

    .line 559
    iput-object v7, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->M:Ljava/util/ArrayList;

    .line 560
    iget-object v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->N:Landroid/os/Handler;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_4

    .line 562
    :cond_9
    iget-object v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->M:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 563
    iget-object v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->d(Z)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 569
    :goto_4
    goto :goto_5

    .line 565
    :catch_0
    move-exception v5

    .line 566
    const-string v0, "Track_BaseSportDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    goto :goto_5

    .line 567
    :catch_1
    move-exception v5

    .line 568
    const-string v0, "Track_BaseSportDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    :goto_5
    return-void
.end method
