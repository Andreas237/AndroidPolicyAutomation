.class public Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;
.super Lcom/huawei/health/suggestion/ui/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/buu$b;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;,
        Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;
    }
.end annotation


# instance fields
.field private a:Lo/bwp;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Lo/bvl;

.field protected e:I

.field private f:Landroid/view/animation/TranslateAnimation;

.field private g:Landroid/support/v4/view/ViewPager;

.field private h:Landroid/view/View;

.field private i:Lo/emq;

.field private k:Landroid/view/animation/TranslateAnimation;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation
.end field

.field private m:Lo/buu;

.field private n:Landroid/widget/LinearLayout;

.field private o:Ljava/util/List;

.field private p:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;

.field private q:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;

.field private s:[Ljava/lang/String;

.field private t:[Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

.field private u:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->c:I

    .line 76
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->o:Ljava/util/List;

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->u:Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Lo/bvl;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    return-object v0
.end method

.method private a(I)V
    .locals 8

    .line 368
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bvl;->a(Z)V

    .line 369
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    invoke-virtual {v0}, Lo/bvl;->notifyDataSetChanged()V

    .line 370
    invoke-static {}, Lo/cad;->b()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-static {}, Lo/cad;->b()I

    move-result v0

    if-eqz v0, :cond_0

    .line 371
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mobile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    .line 373
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireLength()I

    move-result v5

    .line 374
    int-to-float v0, v5

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x49800000    # 1048576.0f

    div-float v6, v0, v1

    .line 375
    float-to-double v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 376
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_device_upgrade_file_size_mb:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v7, v3, v4

    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bvl;->c(Ljava/lang/String;)V

    .line 377
    goto :goto_0

    .line 378
    :cond_0
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wifi"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    .line 381
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->c(Ljava/lang/String;)V

    .line 383
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    new-instance v1, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$7;-><init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V

    invoke-virtual {v0, v1}, Lo/bvl;->c(Lo/bvl$d;)V

    .line 390
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;Z)Z
    .locals 0

    .line 50
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->u:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->n:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/view/View;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->h:Landroid/view/View;

    return-object v0
.end method

.method private c(I)V
    .locals 3

    .line 332
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d(Landroid/os/Parcelable;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 333
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 334
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->saveMotionPath(Ljava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->o:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 336
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCovers()Lcom/huawei/pluginFitnessAdvice/Cover;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 337
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->o:Ljava/util/List;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCovers()Lcom/huawei/pluginFitnessAdvice/Cover;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 339
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 340
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a(I)V

    .line 342
    :cond_1
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 9

    .line 394
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    if-gt v0, v1, :cond_0

    .line 396
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the download position is wrong"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    return-void

    .line 399
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 400
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->q:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;

    if-eqz v0, :cond_2

    .line 402
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionPath()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->q:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->q:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;

    iget-boolean v0, v0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->c:Z

    if-nez v0, :cond_1

    .line 403
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the video is on downloading"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    return-void

    .line 407
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionPath()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->q:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;

    iget-object v1, v1, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 408
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "canceled the video download task"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->q:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->c:Z

    .line 412
    :cond_2
    new-instance v0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;-><init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->q:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;

    .line 413
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->q:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionPath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;->a:Ljava/lang/String;

    .line 414
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 415
    new-instance v7, Lcom/huawei/health/suggestion/model/Media;

    invoke-direct {v7}, Lcom/huawei/health/suggestion/model/Media;-><init>()V

    .line 416
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/Media;->setUrl(Ljava/lang/String;)V

    .line 417
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Media;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/Media;->setPath(Ljava/lang/String;)V

    .line 418
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireLength()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/suggestion/model/Media;->setLength(J)V

    .line 419
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/Media;->setType(I)V

    .line 420
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    .line 421
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    const-wide/16 v1, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bvl;->e(Ljava/lang/String;)V

    .line 422
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 424
    :try_start_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Media;->getLength()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->q:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;

    invoke-interface {v0, v6, v1, v2, v3}, Lo/bsp;->a(Ljava/util/List;JLo/bui;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 427
    goto :goto_0

    .line 425
    :catch_0
    move-exception v8

    .line 426
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download url is invalid:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    :goto_0
    return-void
.end method

.method public static d(Landroid/os/Parcelable;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Landroid/os/Parcelable;)TT;"
        }
    .end annotation

    .line 572
    const/4 v1, 0x0

    .line 575
    :try_start_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    move-object v1, v0

    .line 576
    const/4 v0, 0x0

    invoke-virtual {v1, p0, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 577
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 578
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 580
    if-eqz v1, :cond_0

    .line 581
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 578
    :cond_0
    return-object v2

    .line 580
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_1

    .line 581
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 583
    :cond_1
    throw v3
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Lo/bwp;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;Ljava/lang/String;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->c(Ljava/lang/String;)V

    return-void
.end method

.method private e(I)V
    .locals 2

    .line 431
    if-nez p1, :cond_1

    .line 432
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getPreAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 433
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    .line 434
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 436
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 438
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_2

    .line 439
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getPreAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 440
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 442
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getPreAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 443
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 445
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->u:Z

    return v0
.end method

.method static synthetic g(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Ljava/util/List;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    return-object v0
.end method

.method private g()Z
    .locals 5

    .line 346
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->k()Z

    move-result v4

    .line 347
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHasDownLoaded:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    if-eqz v4, :cond_0

    .line 349
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bvl;->a(Z)V

    .line 350
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    invoke-virtual {v0}, Lo/bvl;->notifyDataSetChanged()V

    .line 351
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    .line 353
    :cond_0
    return v4
.end method

.method private h()V
    .locals 4

    .line 451
    iget v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    .line 452
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "show next action"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    iget v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 454
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->o()V

    .line 455
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwp;->setCurrentIndex(I)V

    .line 456
    iget v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->c(I)V

    .line 457
    iget v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e(I)V

    goto :goto_0

    .line 459
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    .line 461
    :goto_0
    return-void
.end method

.method private i()V
    .locals 4

    .line 467
    iget v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    .line 468
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "show pre action"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    iget v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    if-ltz v0, :cond_0

    .line 470
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->o()V

    .line 471
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwp;->setCurrentIndex(I)V

    .line 472
    iget v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->c(I)V

    .line 473
    iget v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e(I)V

    goto :goto_0

    .line 475
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    .line 477
    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)[Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->t:[Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->q:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$d;

    return-object v0
.end method

.method private k()Z
    .locals 2

    .line 363
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->k(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private o()V
    .locals 2

    .line 483
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bvl;->d(I)V

    .line 484
    return-void
.end method

.method private p()V
    .locals 5

    .line 546
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->f()V

    .line 547
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->u:Z

    if-eqz v0, :cond_0

    .line 548
    invoke-static {p0}, Lo/dbf;->i(Landroid/content/Context;)V

    goto :goto_1

    .line 550
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->t:[Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    if-eqz v0, :cond_1

    .line 551
    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->t:[Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 552
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b()V

    .line 551
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 556
    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 110
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewController()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity is finishing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    return-void

    .line 115
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_running_posture_suggest:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->setContentView(I)V

    .line 116
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x1000000

    const/high16 v2, 0x1000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 117
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_vp:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->g:Landroid/support/v4/view/ViewPager;

    .line 118
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fragment/GroundContactTimeFragment;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/ui/fragment/GroundContactTimeFragment;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/ui/fragment/LandingImpactFragment;-><init>()V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lcom/huawei/health/suggestion/ui/fragment/EversionExcursionFragment;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/ui/fragment/EversionExcursionFragment;-><init>()V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/ui/fragment/SwingAngleFragment;-><init>()V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    new-instance v1, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/ui/fragment/FootStrikePatternFragment;-><init>()V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->t:[Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    .line 124
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_tab:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->i:Lo/emq;

    .line 126
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->g:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->s:[Ljava/lang/String;

    array-length v1, v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 127
    new-instance v0, Lo/buu;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->g:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->i:Lo/emq;

    invoke-direct {v0, p0, v1, v2}, Lo/buu;-><init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->m:Lo/buu;

    .line 128
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->m:Lo/buu;

    invoke-virtual {v0, p0}, Lo/buu;->e(Lo/buu$b;)V

    .line 130
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->s:[Ljava/lang/String;

    array-length v0, v0

    if-ge v4, v0, :cond_2

    .line 131
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->i:Lo/emq;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->s:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v5

    .line 132
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 133
    const-string v0, "runningPostureAdvice"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 134
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->t:[Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    aget-object v0, v0, v4

    invoke-virtual {v0, v6}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->m:Lo/buu;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->t:[Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    aget-object v1, v1, v4

    iget v2, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->c:I

    if-ne v2, v4, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    const/4 v3, 0x0

    invoke-virtual {v0, v5, v1, v3, v2}, Lo/buu;->b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Landroid/view/View;Z)V

    .line 130
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 138
    :cond_2
    sget v0, Lcom/huawei/health/suggestion/R$id;->runningpos_train_action_intro:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwp;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    .line 140
    sget v0, Lcom/huawei/health/suggestion/R$id;->ll_fitness_getdata_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->n:Landroid/widget/LinearLayout;

    .line 141
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 142
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_running_posture_suggest_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->h:Landroid/view/View;

    .line 143
    new-instance v0, Lo/bvl;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->o:Ljava/util/List;

    sget v2, Lcom/huawei/health/suggestion/R$layout;->sug_traindetail_vp_intro:I

    invoke-direct {v0, v1, v2}, Lo/bvl;-><init>(Ljava/util/List;I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    .line 144
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d:Lo/bvl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bvl;->a(Z)V

    .line 146
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    iget-object v0, v0, Lo/bwp;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getPreAction()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getNextAction()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    new-instance v1, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V

    invoke-virtual {v0, v1}, Lo/bwp;->setOnSlidingListener(Lo/bwf;)V

    .line 167
    new-instance v0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 174
    new-instance v0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;-><init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->p:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;

    .line 175
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 176
    const v0, 0x7fffffff

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->setPriority(I)V

    .line 177
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->p:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;

    invoke-virtual {p0, v0, v4}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 178
    return-void
.end method

.method public a(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;)V"
        }
    .end annotation

    .line 252
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    add-int/lit8 v1, p1, 0x1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/bwp;->b(II)V

    .line 253
    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    .line 254
    iput p1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    .line 255
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->upShow(Landroid/view/View;)V

    .line 256
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->o()V

    .line 257
    iget v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->c(I)V

    .line 258
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e(I)V

    .line 259
    return-void
.end method

.method public b()V
    .locals 5

    .line 92
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 93
    if-eqz v4, :cond_0

    .line 94
    const-string v0, "runningPostureFlag"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->c:I

    .line 95
    const-string v0, "runningPostureAdvices"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b:Ljava/util/List;

    .line 97
    :cond_0
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_running_posture_ground_contact_time:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 98
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_running_posture_ground_impact_acceleration:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 99
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_sport_noun_explain_paobuzhitai_waifanfudu_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 100
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_sport_noun_explain_paobuzhitai_baidongjiaodu_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 101
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_running_posture_avg_foot_strike_pattern:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->s:[Ljava/lang/String;

    .line 102
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->s:[Ljava/lang/String;

    array-length v1, v1

    if-eq v0, v1, :cond_2

    .line 103
    :cond_1
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "posture advices length is error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->finish()V

    .line 106
    :cond_2
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 568
    return-void
.end method

.method public d()V
    .locals 1

    .line 182
    new-instance v0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 207
    return-void
.end method

.method public downDismiss(Landroid/view/View;)V
    .locals 9

    .line 294
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->k:Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 295
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->k:Landroid/view/animation/TranslateAnimation;

    .line 297
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->k:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 298
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->k:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->k:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$6;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$6;-><init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    goto :goto_0

    .line 316
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->k:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0}, Landroid/view/animation/TranslateAnimation;->hasEnded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 317
    return-void

    .line 321
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->k:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 322
    return-void
.end method

.method public e()V
    .locals 4

    .line 561
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initViewController()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 563
    return-void
.end method

.method public f()V
    .locals 1

    .line 210
    new-instance v0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 218
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 236
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 237
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->downDismiss(Landroid/view/View;)V

    goto :goto_0

    .line 239
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->onBackPressed()V

    .line 241
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 533
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coach_iv_action_pre:I

    if-ne v0, v1, :cond_0

    .line 534
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->i()V

    goto :goto_0

    .line 535
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coach_iv_action_nex:I

    if-ne v0, v1, :cond_1

    .line 536
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->h()V

    goto :goto_0

    .line 537
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coachiv_close:I

    if-ne v0, v1, :cond_2

    .line 539
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->downDismiss(Landroid/view/View;)V

    goto :goto_0

    .line 540
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->ll_fitness_getdata_error:I

    if-ne v0, v1, :cond_3

    .line 541
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->p()V

    .line 543
    :cond_3
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 245
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->onDestroy()V

    .line 246
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->p:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;

    if-eqz v0, :cond_0

    .line 247
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->p:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 249
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 221
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->onResume()V

    .line 222
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a:Lo/bwp;

    invoke-virtual {v0}, Lo/bwp;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 223
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    if-le v0, v1, :cond_0

    .line 224
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->o()V

    .line 225
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 226
    iget v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a(I)V

    .line 231
    :cond_0
    return-void
.end method

.method public upShow(Landroid/view/View;)V
    .locals 9

    .line 262
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->f:Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 263
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->f:Landroid/view/animation/TranslateAnimation;

    .line 265
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->f:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 266
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->f:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 267
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->f:Landroid/view/animation/TranslateAnimation;

    new-instance v1, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$4;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->f:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 286
    return-void
.end method
