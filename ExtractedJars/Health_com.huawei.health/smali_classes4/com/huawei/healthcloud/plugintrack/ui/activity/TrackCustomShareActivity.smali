.class public Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;
.super Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$a;
    }
.end annotation


# instance fields
.field private b:Lo/cgt;

.field private c:Landroid/content/Context;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation
.end field

.field private g:I

.field private h:Landroid/support/v4/view/ViewPager;

.field private i:Lo/emr;

.field private k:Landroid/widget/RelativeLayout;

.field private l:I

.field private m:Landroid/widget/RelativeLayout;

.field private n:Landroid/widget/LinearLayout;

.field private o:Z

.field private p:Landroid/widget/RelativeLayout;

.field private q:Landroid/widget/LinearLayout;

.field private r:Landroid/widget/LinearLayout;

.field private s:Z

.field private t:Landroid/widget/LinearLayout;

.field private u:Landroid/widget/LinearLayout;

.field private w:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 67
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;-><init>()V

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->c:Landroid/content/Context;

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->b:Lo/cgt;

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->i:Lo/emr;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->k:Landroid/widget/RelativeLayout;

    .line 99
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->s:Z

    .line 104
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->w:J

    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method private a(Landroid/widget/LinearLayout;)Landroid/widget/TextView;
    .locals 1

    .line 237
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_tv:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private b(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 12
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 618
    new-instance v4, Ljava/io/File;

    sget-object v0, Lo/dab;->e:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 619
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 620
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 621
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBmpToFile:mkdirs error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    :cond_0
    new-instance v5, Ljava/io/File;

    const-string v0, "track_share_tmp.jpg"

    invoke-direct {v5, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 625
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    .line 626
    const/4 v7, 0x0

    .line 629
    :try_start_0
    invoke-static {v5, v6}, Lo/cea;->d(Ljava/io/File;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 630
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "invalidate file path"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 631
    const-string v8, ""

    .line 648
    nop

    .line 631
    .line 650
    .line 651
    .line 652
    .line 653
    return-object v8

    .line 634
    :cond_1
    :try_start_1
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v7, v0

    .line 635
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x5a

    invoke-virtual {p1, v0, v1, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 636
    invoke-virtual {v5}, Ljava/io/File;->deleteOnExit()V

    .line 637
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->flush()V

    .line 638
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 639
    const/4 v7, 0x0

    .line 648
    goto/16 :goto_1

    .line 641
    .line 650
    .line 651
    .line 652
    .line 653
    .line 653
    :catch_0
    move-exception v8

    .line 642
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBmpToFile:IllegalArgumentException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 648
    if-eqz v7, :cond_3

    .line 650
    :try_start_3
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 653
    goto/16 :goto_1

    .line 651
    :catch_1
    move-exception v8

    .line 652
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close IOException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    goto :goto_1

    .line 644
    :catch_2
    move-exception v8

    .line 645
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveBmpToFile:IOException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 648
    if-eqz v7, :cond_3

    .line 650
    :try_start_5
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 653
    goto :goto_1

    .line 651
    :catch_3
    move-exception v8

    .line 652
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close IOException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    goto :goto_1

    .line 648
    :catchall_0
    move-exception v10

    if-eqz v7, :cond_2

    .line 650
    :try_start_6
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 653
    goto :goto_0

    .line 651
    :catch_4
    move-exception v11

    .line 652
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close IOException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 655
    :cond_2
    :goto_0
    throw v10

    .line 656
    :cond_3
    :goto_1
    return-object v6
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;)Ljava/util/List;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->f:Ljava/util/List;

    return-object v0
.end method

.method private b(I)V
    .locals 13

    .line 536
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 537
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v5

    .line 539
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1, v5}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/support/v4/app/Fragment;

    .line 541
    instance-of v0, v6, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    if-eqz v0, :cond_0

    .line 542
    move-object v0, v6

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->c()Landroid/view/View;

    move-result-object v7

    .line 544
    const-string v0, "trackShareIndex"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 545
    :cond_0
    instance-of v0, v6, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;

    if-eqz v0, :cond_1

    .line 546
    move-object v0, v6

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;->b()Landroid/view/View;

    move-result-object v7

    .line 548
    const-string v0, "trackShareIndex"

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 550
    :cond_1
    invoke-virtual {v6}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;

    move-result-object v7

    .line 551
    instance-of v0, v6, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    if-eqz v0, :cond_2

    .line 553
    const-string v0, "trackShareIndex"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 556
    :cond_2
    const-string v0, "trackShareIndex"

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    :goto_0
    invoke-static {v7}, Lo/cdz;->c(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 562
    if-nez v8, :cond_3

    .line 563
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "screenCut is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_share_fail_tip:I

    invoke-static {p0, v0}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 565
    return-void

    .line 568
    :cond_3
    invoke-direct {p0, v8}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->b(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v9

    .line 570
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    .line 571
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The path is invalid, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    return-void

    .line 574
    :cond_4
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    move-result-object v0

    invoke-virtual {v0}, Lo/cfa;->c()Lo/cgt;

    move-result-object v10

    .line 579
    :try_start_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 580
    new-instance v11, Lo/dav;

    const/4 v0, 0x1

    invoke-direct {v11, v0}, Lo/dav;-><init>(I)V

    .line 581
    invoke-virtual {v11, v8}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    goto :goto_1

    .line 583
    :cond_5
    new-instance v11, Lo/dav;

    const/4 v0, 0x4

    invoke-direct {v11, v0}, Lo/dav;-><init>(I)V

    .line 584
    invoke-virtual {v11, v9}, Lo/dav;->b(Ljava/lang/String;)V

    .line 587
    :goto_1
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lo/dav;->e(Ljava/lang/String;)V

    .line 588
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lo/dav;->c(Ljava/lang/String;)V

    .line 589
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lo/dav;->a(Ljava/lang/String;)V

    .line 591
    sget-object v0, Lo/dae;->gO:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/dav;->d(Ljava/lang/String;)V

    .line 592
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lo/dav;->e(I)V

    .line 593
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lo/dav;->d(Z)V

    .line 594
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lo/dav;->a(I)V

    .line 595
    const/4 v0, 0x0

    if-eq v0, v10, :cond_7

    .line 596
    invoke-virtual {v10}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v12

    .line 597
    const/16 v0, 0x108

    if-eq v12, v0, :cond_6

    const/16 v0, 0x102

    if-ne v12, v0, :cond_7

    .line 598
    :cond_6
    const/4 v0, 0x6

    invoke-virtual {v11, v0}, Lo/dav;->a(I)V

    .line 601
    :cond_7
    invoke-static {p0, p1, v11}, Lo/djl;->c(Landroid/content/Context;ILo/dav;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 605
    goto :goto_2

    .line 602
    :catch_0
    move-exception v11

    .line 604
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareTrackData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    :goto_2
    if-nez v10, :cond_8

    .line 609
    return-void

    .line 611
    :cond_8
    const-string v0, "sportType"

    invoke-virtual {v10}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    const-string v0, "deviceType"

    invoke-virtual {v10}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestDeviceType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->c:Landroid/content/Context;

    sget-object v2, Lo/dae;->hF:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 614
    return-void
.end method

.method private c()V
    .locals 5

    .line 184
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_wechat_friends_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->n:Landroid/widget/LinearLayout;

    .line 185
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_wechat_chat_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->r:Landroid/widget/LinearLayout;

    .line 186
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_weibo_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->t:Landroid/widget/LinearLayout;

    .line 187
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_more_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->u:Landroid/widget/LinearLayout;

    .line 188
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_save_to_local_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->q:Landroid/widget/LinearLayout;

    .line 189
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->dst_selector:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->p:Landroid/widget/RelativeLayout;

    .line 190
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->m:Landroid/widget/RelativeLayout;

    .line 191
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->n:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->e(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->share_wechat_friends_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 192
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->r:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->e(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->share_wechat_chat_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 193
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->t:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->e(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->share_weibo_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 194
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->u:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->e(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->share_more_icon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 195
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->q:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->e(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->share_save_local:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 198
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->n:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->a(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_plugin_socialshare_wechat_friends:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 199
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->r:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->a(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_plugin_socialshare_wechat_chat:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 200
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->t:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->a(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_plugin_socialshare_weibo:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 201
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->u:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->a(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_user_profile_more:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 202
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->q:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->a(Landroid/widget/LinearLayout;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_show_save_local:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 205
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 207
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->r:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 208
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->t:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 212
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 213
    const v0, 0x106000d

    invoke-virtual {v2, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 218
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$anim;->fly_up_in:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    .line 221
    new-instance v4, Landroid/view/animation/LayoutAnimationController;

    invoke-direct {v4, v3}, Landroid/view/animation/LayoutAnimationController;-><init>(Landroid/view/animation/Animation;)V

    .line 224
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->p:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setLayoutAnimation(Landroid/view/animation/LayoutAnimationController;)V

    .line 226
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$anim;->fade_in:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->overridePendingTransition(II)V

    .line 228
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->r:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 231
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->t:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 233
    return-void
.end method

.method private static d(IF)F
    .locals 2

    .line 341
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    .line 342
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {p0, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->m:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private e(Landroid/widget/LinearLayout;)Landroid/widget/ImageView;
    .locals 1

    .line 248
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_img:I

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->p:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private f()V
    .locals 16
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .line 298
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_share_activity_title:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->i:Lo/emr;

    .line 301
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_viewpager:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    .line 302
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$dimen;->common_ui_horizon_text_size_60:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setPageMargin(I)V

    .line 303
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_viewpager_layout:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->k:Landroid/widget/RelativeLayout;

    .line 307
    const-string v0, "window"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/WindowManager;

    .line 308
    new-instance v5, Landroid/util/DisplayMetrics;

    invoke-direct {v5}, Landroid/util/DisplayMetrics;-><init>()V

    .line 309
    new-instance v6, Landroid/graphics/Point;

    invoke-direct {v6}, Landroid/graphics/Point;-><init>()V

    .line 310
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 311
    invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 312
    iget v7, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 313
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "status_bar_height"

    const-string v2, "dimen"

    const-string v3, "android"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v8

    .line 316
    if-lez v8, :cond_0

    .line 317
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    goto :goto_0

    .line 319
    :cond_0
    const/4 v0, 0x1

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->d(IF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 321
    :goto_0
    const/4 v0, 0x1

    const v1, 0x440f4000    # 573.0f

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->d(IF)F

    move-result v0

    int-to-float v1, v9

    add-float v10, v0, v1

    .line 322
    const/4 v0, 0x1

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->d(IF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v11

    .line 323
    int-to-float v0, v11

    add-float/2addr v0, v10

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v12

    .line 325
    int-to-float v0, v7

    cmpl-float v0, v10, v0

    if-lez v0, :cond_1

    .line 326
    int-to-float v0, v7

    const/4 v1, 0x1

    const/high16 v2, 0x432d0000    # 173.0f

    invoke-static {v1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->d(IF)F

    move-result v1

    sub-float/2addr v0, v1

    int-to-float v1, v9

    sub-float v13, v0, v1

    .line 327
    const/high16 v0, 0x43c80000    # 400.0f

    div-float v0, v13, v0

    const/high16 v1, 0x437a0000    # 250.0f

    mul-float v14, v0, v1

    .line 328
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    .line 329
    float-to-int v0, v14

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->g:I

    .line 330
    float-to-int v0, v13

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->l:I

    .line 331
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->l:I

    iput v0, v15, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 332
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->g:I

    iput v0, v15, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 333
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v15}, Landroid/support/v4/view/ViewPager;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 335
    goto :goto_1

    :cond_1
    iget v0, v6, Landroid/graphics/Point;->y:I

    mul-int/lit8 v0, v0, 0x9

    iget v1, v6, Landroid/graphics/Point;->x:I

    mul-int/lit8 v1, v1, 0x10

    if-le v0, v1, :cond_2

    if-gt v12, v7, :cond_2

    .line 336
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v11}, Landroid/widget/RelativeLayout;->setPadding(IIII)V

    .line 338
    :cond_2
    :goto_1
    return-void
.end method

.method private m()Z
    .locals 6

    .line 523
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 525
    iget-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->w:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 526
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ">_< >_< click too much"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    iput-wide v4, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->w:J

    .line 528
    const/4 v0, 0x1

    return v0

    .line 530
    :cond_0
    iput-wide v4, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->w:J

    .line 531
    const/4 v0, 0x0

    return v0
.end method

.method private n()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation

    .line 370
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 372
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->b:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v3

    .line 373
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 374
    :cond_0
    new-instance v4, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-direct {v4}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;-><init>()V

    .line 375
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 376
    const/4 v6, 0x0

    .line 377
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    move-result-object v0

    invoke-virtual {v0}, Lo/cfa;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 378
    const/4 v6, 0x1

    .line 380
    :cond_1
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->g:I

    if-eqz v0, :cond_2

    .line 381
    const-string v0, "allDataWidth"

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->g:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 382
    const-string v0, "allDataHeight"

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->l:I

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 384
    :cond_2
    invoke-virtual {v4, v5}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->setArguments(Landroid/os/Bundle;)V

    .line 386
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 387
    if-eqz v6, :cond_3

    .line 388
    new-instance v7, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-direct {v7}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;-><init>()V

    .line 389
    invoke-virtual {v7, v5}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->setArguments(Landroid/os/Bundle;)V

    .line 390
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 393
    :cond_3
    invoke-virtual {v3}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 395
    :pswitch_0
    const/4 v0, 0x5

    invoke-static {v0, v3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c(ILcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;

    move-result-object v7

    .line 396
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 397
    goto :goto_0

    .line 401
    :pswitch_1
    const/4 v0, 0x1

    invoke-static {v0, v3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c(ILcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;

    move-result-object v8

    .line 402
    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    const/4 v0, 0x2

    invoke-static {v0, v3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c(ILcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;

    move-result-object v9

    .line 406
    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 408
    const/4 v0, 0x3

    invoke-static {v0, v3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c(ILcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;

    move-result-object v10

    .line 409
    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 411
    const/4 v0, 0x4

    invoke-static {v0, v3}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;->c(ILcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareDetailFragment;

    move-result-object v11

    .line 412
    invoke-interface {v2, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 413
    .line 417
    :goto_0
    :pswitch_2
    goto/16 :goto_1

    .line 418
    :cond_4
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 419
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->o:Z

    .line 420
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    move-result-object v0

    invoke-virtual {v0}, Lo/cfa;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 421
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->o:Z

    .line 423
    :cond_5
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->g:I

    if-eqz v0, :cond_6

    .line 424
    const-string v0, "allDataWidth"

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->g:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 425
    const-string v0, "allDataHeight"

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->l:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 428
    :cond_6
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->o:Z

    if-eqz v0, :cond_7

    .line 429
    new-instance v5, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;

    invoke-direct {v5}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;-><init>()V

    .line 430
    invoke-virtual {v5, v4}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShortTrackShareFragment;->setArguments(Landroid/os/Bundle;)V

    .line 431
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 435
    :cond_7
    new-instance v5, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;

    invoke-direct {v5}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;-><init>()V

    .line 436
    invoke-virtual {v5, v4}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackShareAllDataFragment;->setArguments(Landroid/os/Bundle;)V

    .line 437
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 439
    new-instance v6, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;

    invoke-direct {v6}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/SportShareNewDetailFragment;-><init>()V

    .line 440
    invoke-virtual {v6, v4}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 441
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 444
    :goto_1
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method protected a()V
    .locals 4

    .line 679
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 680
    return-void
.end method

.method protected b()V
    .locals 0

    .line 670
    return-void
.end method

.method public d()V
    .locals 0

    .line 290
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->finish()V

    .line 291
    invoke-static {}, Lo/djl;->a()V

    .line 294
    return-void
.end method

.method protected e()Lo/cco;
    .locals 1

    .line 674
    const/4 v0, 0x0

    return-object v0
.end method

.method public finish()V
    .locals 6

    .line 254
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->s:Z

    if-eqz v0, :cond_0

    .line 256
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The animation is finishing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    return-void

    .line 259
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->s:Z

    .line 261
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$anim;->fly_down_out:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v4

    .line 262
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->p:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 263
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$anim;->fade_out:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v5

    .line 264
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 265
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 266
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$4;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;)V

    invoke-virtual {v5, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 287
    return-void
.end method

.method protected g()Z
    .locals 1

    .line 684
    const/4 v0, 0x0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .line 482
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 483
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() if (isClickFast())"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    return-void

    .line 488
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 490
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_save_to_local_layout:I

    if-ne v4, v0, :cond_1

    .line 491
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->b(I)V

    .line 492
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_save_to_local_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 493
    return-void

    .line 497
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 498
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_connect_error:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 499
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "network connect error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    return-void

    .line 504
    :cond_2
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_wechat_friends_layout:I

    if-ne v4, v0, :cond_3

    .line 505
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_wechat_friends_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->b(I)V

    goto :goto_0

    .line 507
    :cond_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_wechat_chat_layout:I

    if-ne v4, v0, :cond_4

    .line 508
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_wechat_chat_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->b(I)V

    goto :goto_0

    .line 510
    :cond_4
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_more_layout:I

    if-ne v4, v0, :cond_5

    .line 511
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_more_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->b(I)V

    goto :goto_0

    .line 513
    :cond_5
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->share_weibo_layout:I

    if-ne v4, v0, :cond_6

    .line 514
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share_weibo_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->b(I)V

    .line 517
    :cond_6
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 111
    invoke-super {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 112
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_activity_custom_share_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->setContentView(I)V

    .line 113
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 114
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->c()V

    .line 116
    iput-object p0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->c:Landroid/content/Context;

    .line 118
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    move-result-object v0

    invoke-virtual {v0}, Lo/cfa;->c()Lo/cgt;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->b:Lo/cgt;

    .line 120
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->b:Lo/cgt;

    if-nez v0, :cond_0

    .line 121
    const-string v0, "Track_TrackCustomShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTrackDetailDataManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->finish()V

    .line 123
    return-void

    .line 126
    :cond_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->f()V

    .line 127
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->n()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->f:Ljava/util/List;

    .line 129
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->k:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$3;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$5;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/view/ViewPager;->setPageTransformer(ZLandroid/support/v4/view/ViewPager$PageTransformer;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 160
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$a;

    invoke-direct {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$a;-><init>()V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$1;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity$1;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;Landroid/support/v4/app/FragmentManager;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    const v1, 0x3f4ccccd    # 0.8f

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setScaleY(F)V

    .line 174
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    const v1, 0x3f4ccccd    # 0.8f

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setScaleX(F)V

    .line 175
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->o:Z

    if-eqz v0, :cond_1

    .line 176
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackCustomShareActivity;->h:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 178
    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 661
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onDestroy()V

    .line 662
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cfa;->b(Lo/cgt;)V

    .line 664
    invoke-static {}, Lo/cfa;->b()Lo/cfa;

    invoke-static {}, Lo/cfa;->a()V

    .line 665
    return-void
.end method
