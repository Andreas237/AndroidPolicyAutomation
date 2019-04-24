.class public Lo/exh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/exh$a;
    }
.end annotation


# static fields
.field private static e:Ljava/lang/String;


# instance fields
.field private a:J

.field private b:Lo/egu$a;

.field private c:Landroid/content/Context;

.field private d:Lo/egu;

.field private f:Z

.field private g:Lo/egv;

.field private h:I

.field private i:I

.field private k:Lo/egy;

.field private l:Landroid/content/SharedPreferences;

.field private n:Lo/exh$a;

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 69
    const-string v0, "StressGameDownloadUtils"

    sput-object v0, Lo/exh;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/exh;->f:Z

    .line 81
    const/4 v0, 0x0

    iput v0, p0, Lo/exh;->i:I

    .line 82
    const/4 v0, 0x2

    iput v0, p0, Lo/exh;->p:I

    return-void
.end method

.method static synthetic a(Lo/exh;Lo/egv;)Lo/egv;
    .locals 0

    .line 67
    iput-object p1, p0, Lo/exh;->g:Lo/egv;

    return-object p1
.end method

.method static synthetic a(Lo/exh;Lo/egy;)Lo/egy;
    .locals 0

    .line 67
    iput-object p1, p0, Lo/exh;->k:Lo/egy;

    return-object p1
.end method

.method private a(III)V
    .locals 3

    .line 612
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 613
    const-string v0, "click"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    const-string v0, "havedevice"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    const-string v0, "support_devices"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 616
    sget-object v0, Lo/dae;->fp:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 617
    return-void
.end method

.method static synthetic a(Lo/exh;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lo/exh;->i()V

    return-void
.end method

.method private a(Z)V
    .locals 0

    .line 390
    iput-boolean p1, p0, Lo/exh;->f:Z

    .line 391
    return-void
.end method

.method private b()V
    .locals 7

    .line 220
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/exh;->a:J

    .line 221
    const/4 v0, 0x0

    iput v0, p0, Lo/exh;->h:I

    .line 222
    invoke-static {}, Lo/evh;->b()Ljava/lang/String;

    move-result-object v4

    .line 223
    const-string v5, "filesServer_old.xml"

    .line 224
    invoke-static {}, Lo/exd;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 225
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7279\u6b8a\u624b\u673a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    const-string v5, "filesServer.xml"

    .line 228
    :cond_0
    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    invoke-static {v0, v4, v5}, Lo/exg;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "path:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "filesServer.xml"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 231
    invoke-static {v6}, Lo/eve;->e(Ljava/util/List;)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lo/exh;->a:J

    .line 232
    return-void
.end method

.method static synthetic b(Lo/exh;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lo/exh;->b()V

    return-void
.end method

.method static synthetic c(Lo/exh;)Lo/egy;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/exh;->k:Lo/egy;

    return-object v0
.end method

.method private c(Landroid/content/Context;)V
    .locals 0

    .line 565
    iput-object p1, p0, Lo/exh;->c:Landroid/content/Context;

    .line 566
    return-void
.end method

.method public static c(Lo/evj;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/evj<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 137
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downLoad() callback = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    invoke-static {}, Lo/evf;->e()Lo/euy;

    move-result-object v0

    invoke-interface {v0, p0}, Lo/euy;->d(Lo/evj;)V

    .line 139
    return-void
.end method

.method static synthetic c(Lo/exh;II)V
    .locals 0

    .line 67
    invoke-direct {p0, p1, p2}, Lo/exh;->d(II)V

    return-void
.end method

.method static synthetic d(Lo/exh;)Landroid/content/Context;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 394
    new-instance v0, Lo/egu;

    iget-object v1, p0, Lo/exh;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/exh;->d:Lo/egu;

    .line 395
    new-instance v0, Lo/egu$a;

    iget-object v1, p0, Lo/exh;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egu$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/exh;->b:Lo/egu$a;

    .line 396
    iget-object v0, p0, Lo/exh;->b:Lo/egu$a;

    iget-object v1, p0, Lo/exh;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_update_downloading:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egu$a;->c(Ljava/lang/String;)Lo/egu$a;

    .line 397
    iget-object v0, p0, Lo/exh;->b:Lo/egu$a;

    invoke-virtual {v0}, Lo/egu$a;->d()Lo/egu;

    move-result-object v0

    iput-object v0, p0, Lo/exh;->d:Lo/egu;

    .line 398
    iget-object v0, p0, Lo/exh;->d:Lo/egu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egu;->setCanceledOnTouchOutside(Z)V

    .line 399
    iget-object v0, p0, Lo/exh;->b:Lo/egu$a;

    new-instance v1, Lo/exh$15;

    invoke-direct {v1, p0}, Lo/exh$15;-><init>(Lo/exh;)V

    invoke-virtual {v0, v1}, Lo/egu$a;->c(Landroid/view/View$OnClickListener;)Lo/egu$a;

    .line 406
    iget-object v0, p0, Lo/exh;->b:Lo/egu$a;

    new-instance v1, Lo/exh$1;

    invoke-direct {v1, p0}, Lo/exh$1;-><init>(Lo/exh;)V

    invoke-virtual {v0, v1}, Lo/egu$a;->a(Landroid/view/View$OnClickListener;)Lo/egu$a;

    .line 412
    iget-object v0, p0, Lo/exh;->d:Lo/egu;

    invoke-virtual {v0}, Lo/egu;->show()V

    .line 413
    iget-object v0, p0, Lo/exh;->d:Lo/egu;

    new-instance v1, Lo/exh$2;

    invoke-direct {v1, p0}, Lo/exh$2;-><init>(Lo/exh;)V

    invoke-virtual {v0, v1}, Lo/egu;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 429
    return-void
.end method

.method private d(II)V
    .locals 3

    .line 625
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 626
    const-string v0, "download"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 627
    const-string v0, "download_status"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    sget-object v0, Lo/dae;->fo:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 629
    return-void
.end method

.method static synthetic d(Lo/exh;Z)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lo/exh;->a(Z)V

    return-void
.end method

.method static synthetic e(Lo/exh;I)I
    .locals 0

    .line 67
    iput p1, p0, Lo/exh;->h:I

    return p1
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 67
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lo/exh;)Lo/egu$a;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/exh;->b:Lo/egu$a;

    return-object v0
.end method

.method static synthetic f(Lo/exh;)Lo/exh$a;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/exh;->n:Lo/exh$a;

    return-object v0
.end method

.method private f()V
    .locals 3

    .line 435
    iget-object v0, p0, Lo/exh;->b:Lo/egu$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egu$a;->a(I)Lo/egu$a;

    .line 436
    iget-object v0, p0, Lo/exh;->b:Lo/egu$a;

    iget-object v1, p0, Lo/exh;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_update_downloading:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egu$a;->b(Ljava/lang/String;)Lo/egu$a;

    .line 437
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/exh;->a(Z)V

    .line 438
    new-instance v0, Lo/exh$4;

    invoke-direct {v0, p0}, Lo/exh$4;-><init>(Lo/exh;)V

    invoke-static {v0}, Lo/exe;->a(Lo/exf;)V

    .line 455
    return-void
.end method

.method private g()V
    .locals 7

    .line 475
    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 476
    const-string v4, "data/data/com.huawei.health/files/stress/audiosBase/open_source.zip"

    .line 477
    const-string v5, "data/data/com.huawei.health/files/stress/audiosBase/"

    .line 479
    invoke-static {}, Lo/ebc;->e()Lo/ebc;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lo/ebc;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-gtz v0, :cond_1

    .line 481
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unzip failure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    invoke-virtual {p0, v4}, Lo/exh;->d(Ljava/lang/String;)Z

    move-result v6

    .line 485
    if-eqz v6, :cond_0

    .line 487
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/exh;->a(Z)V

    .line 488
    invoke-virtual {p0}, Lo/exh;->a()Lo/evj;

    move-result-object v0

    invoke-static {v0}, Lo/exh;->c(Lo/evj;)V

    .line 489
    iget v0, p0, Lo/exh;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/exh;->i:I

    .line 490
    iget v0, p0, Lo/exh;->p:I

    iget v1, p0, Lo/exh;->i:I

    if-ne v0, v1, :cond_0

    .line 492
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7b2c\u4e8c\u6b21\u89e3\u538b\u5931\u8d25"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 493
    const/4 v0, 0x0

    iput v0, p0, Lo/exh;->i:I

    .line 494
    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/exh;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->Stress_game_guide_info_download_fail:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 495
    invoke-virtual {p0}, Lo/exh;->c()V

    .line 498
    :cond_0
    goto :goto_0

    .line 499
    :cond_1
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/exh;->d(II)V

    .line 500
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u89e3\u538b\u6210\u529f,\u8df3\u8f6c\u5f15\u5bfc\u8bed\u9875\u9762"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    invoke-direct {p0}, Lo/exh;->k()V

    .line 503
    invoke-virtual {p0}, Lo/exh;->c()V

    .line 505
    :goto_0
    goto :goto_1

    .line 506
    :cond_2
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u89e3\u538b\u65f6null == mContext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    :goto_1
    return-void
.end method

.method static synthetic g(Lo/exh;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lo/exh;->d()V

    return-void
.end method

.method private h()V
    .locals 1

    .line 549
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    .line 550
    return-void
.end method

.method static synthetic h(Lo/exh;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lo/exh;->h()V

    return-void
.end method

.method static synthetic i(Lo/exh;)Lo/egv;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/exh;->g:Lo/egv;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 553
    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 554
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 555
    const-string v0, "url"

    const-string v1, "https://messagecenter.hicloud.com/messageH5/sleephtml/salesPromotion.html"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 556
    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 557
    invoke-direct {p0}, Lo/exh;->h()V

    .line 558
    goto :goto_0

    .line 559
    :cond_0
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startActivity() mContext = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exh;->c:Landroid/content/Context;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    :goto_0
    return-void
.end method

.method private k()V
    .locals 4

    .line 539
    iget-object v0, p0, Lo/exh;->l:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "havefile"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 540
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 541
    const-string v0, "com.huawei.ui.main.stories.fitness.activity.stressgame.activity"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 542
    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 543
    invoke-virtual {p0}, Lo/exh;->c()V

    .line 544
    invoke-direct {p0}, Lo/exh;->h()V

    .line 545
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/exh;->a(Z)V

    .line 546
    return-void
.end method

.method static synthetic k(Lo/exh;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lo/exh;->g()V

    return-void
.end method

.method static synthetic l(Lo/exh;)Z
    .locals 1

    .line 67
    iget-boolean v0, p0, Lo/exh;->f:Z

    return v0
.end method

.method static synthetic m(Lo/exh;)I
    .locals 1

    .line 67
    iget v0, p0, Lo/exh;->i:I

    return v0
.end method

.method static synthetic n(Lo/exh;)I
    .locals 1

    .line 67
    iget v0, p0, Lo/exh;->h:I

    return v0
.end method

.method static synthetic o(Lo/exh;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lo/exh;->f()V

    return-void
.end method

.method static synthetic p(Lo/exh;)J
    .locals 2

    .line 67
    iget-wide v0, p0, Lo/exh;->a:J

    return-wide v0
.end method


# virtual methods
.method public a()Lo/evj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/evj<Ljava/lang/String;>;"
        }
    .end annotation

    .line 344
    new-instance v0, Lo/exh$13;

    invoke-direct {v0, p0}, Lo/exh$13;-><init>(Lo/exh;)V

    .line 386
    return-object v0
.end method

.method public a(Landroid/content/Context;)V
    .locals 7

    .line 148
    const/4 v0, 0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/exh;->a(III)V

    .line 149
    sget v0, Lcom/huawei/ui/main/R$layout;->pressure_device_connect:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 150
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_device_no_connect:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 151
    sget v0, Lcom/huawei/ui/main/R$string;->Stress_game_device_no_support_biofeedback_function:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_agree_dialog_pressure:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    .line 153
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 154
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 155
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_known:I

    .line 156
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/exh$5;

    invoke-direct {v2, p0}, Lo/exh$5;-><init>(Lo/exh;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_learn_more:I

    .line 161
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/exh$3;

    invoke-direct {v2, p0, p1}, Lo/exh$3;-><init>(Lo/exh;Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 169
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v6

    .line 170
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egw;->setCancelable(Z)V

    .line 171
    invoke-virtual {v6}, Lo/egw;->show()V

    .line 172
    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 8

    .line 240
    invoke-direct {p0, p1}, Lo/exh;->c(Landroid/content/Context;)V

    .line 241
    invoke-direct {p0}, Lo/exh;->b()V

    .line 242
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showDeviceDownload() byteLength =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/exh;->a:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    iget-wide v0, p0, Lo/exh;->a:J

    long-to-float v0, v0

    const/high16 v1, 0x44800000    # 1024.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x44800000    # 1024.0f

    div-float v5, v0, v1

    .line 244
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showDeviceDownload() byteLength == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u4fee\u6539\u524d"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    new-instance v0, Ljava/math/BigDecimal;

    float-to-double v1, v5

    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(D)V

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v5

    .line 246
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showDeviceDownload() byteLength == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u4fee\u6539\u540e"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v5, v0

    if-gez v0, :cond_0

    .line 248
    const/high16 v5, 0x3f800000    # 1.0f

    .line 249
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showDeviceDownload() byteLength == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u518d\u6b21\u4fee\u6539\u540e"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    :cond_0
    iget-wide v0, p0, Lo/exh;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 253
    new-instance v0, Lo/exh$8;

    invoke-direct {v0, p0}, Lo/exh$8;-><init>(Lo/exh;)V

    invoke-static {v0}, Lo/exe;->a(Lo/exf;)V

    .line 271
    new-instance v6, Landroid/content/Intent;

    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 272
    const-string v0, "com.huawei.ui.main.stories.fitness.activity.stressgame.activity"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 273
    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 274
    invoke-direct {p0}, Lo/exh;->h()V

    .line 276
    goto/16 :goto_2

    .line 279
    :cond_1
    const-string v6, ""

    .line 280
    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_upgrade_file_size_mb:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 281
    iget-object v0, p0, Lo/exh;->l:Landroid/content/SharedPreferences;

    const-string v1, "havefile"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 282
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6587\u4ef6\u66f4\u65b0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->Stress_game_base_measure_current_material_upload:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 285
    :cond_2
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6587\u4ef6\u4e0b\u8f7d"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    iget-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->Stress_game_base_measure_current_material:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 288
    :goto_0
    iget-object v0, p0, Lo/exh;->g:Lo/egv;

    if-nez v0, :cond_3

    .line 289
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialog_download == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lo/exh;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_title:I

    .line 291
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 292
    invoke-virtual {v0, v6}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lo/exh$10;

    invoke-direct {v2, p0}, Lo/exh$10;-><init>(Lo/exh;)V

    .line 294
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->Stress_game_base_measure_download:I

    new-instance v2, Lo/exh$7;

    invoke-direct {v2, p0}, Lo/exh$7;-><init>(Lo/exh;)V

    .line 303
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    .line 328
    invoke-virtual {v0}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lo/exh;->g:Lo/egv;

    goto :goto_1

    .line 330
    :cond_3
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialog_download != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    :goto_1
    iget-object v0, p0, Lo/exh;->g:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_4

    .line 333
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "!dialog_download.isShowing()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    iget-object v0, p0, Lo/exh;->g:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 335
    iget-object v0, p0, Lo/exh;->g:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    goto :goto_2

    .line 337
    :cond_4
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialog_download.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    :goto_2
    return-void
.end method

.method public c()V
    .locals 4

    .line 458
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelProgressDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    iget-object v0, p0, Lo/exh;->d:Lo/egu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 460
    iget-object v0, p0, Lo/exh;->d:Lo/egu;

    invoke-virtual {v0}, Lo/egu;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 461
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismissProgressDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    iget-object v0, p0, Lo/exh;->d:Lo/egu;

    invoke-virtual {v0}, Lo/egu;->dismiss()V

    .line 464
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exh;->d:Lo/egu;

    .line 465
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exh;->b:Lo/egu$a;

    .line 466
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exh;->c:Landroid/content/Context;

    .line 467
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelProgressDialog clear dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    :cond_1
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 4

    .line 178
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/exh;->a(III)V

    .line 179
    invoke-direct {p0, p1}, Lo/exh;->c(Landroid/content/Context;)V

    .line 184
    iget-object v0, p0, Lo/exh;->k:Lo/egy;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 185
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialog_buy == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->Stress_game_base_measure_connection_devices:I

    .line 187
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_known:I

    .line 188
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/exh$9;

    invoke-direct {v2, p0}, Lo/exh$9;-><init>(Lo/exh;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_learn_more:I

    .line 195
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/exh$6;

    invoke-direct {v2, p0}, Lo/exh$6;-><init>(Lo/exh;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    .line 202
    invoke-virtual {v0}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lo/exh;->k:Lo/egy;

    goto :goto_0

    .line 204
    :cond_0
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialog_buy != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    :goto_0
    iget-object v0, p0, Lo/exh;->k:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 208
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "!dialog_buy.isShowing()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    iget-object v0, p0, Lo/exh;->k:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 210
    iget-object v0, p0, Lo/exh;->k:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    goto :goto_1

    .line 212
    :cond_1
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialog_buy.isShowing()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    :goto_1
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 5

    .line 519
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 521
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 522
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 523
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5220\u9664\u5355\u4e2a\u6587\u4ef6"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u6210\u529f"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    const/4 v0, 0x1

    return v0

    .line 526
    :cond_0
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5220\u9664\u5355\u4e2a\u6587\u4ef6"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u5931\u8d25"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    const/4 v0, 0x0

    return v0

    .line 530
    :cond_1
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5220\u9664\u5355\u4e2a\u6587\u4ef6\u5931\u8d25\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u4e0d\u5b58\u5728"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    const/4 v0, 0x0

    return v0
.end method

.method public e(Landroid/content/Context;)V
    .locals 6

    .line 574
    iput-object p1, p0, Lo/exh;->c:Landroid/content/Context;

    .line 575
    const-string v0, "sleep_shared_pref_smart_msg"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lo/exh;->l:Landroid/content/SharedPreferences;

    .line 576
    new-instance v0, Lo/exh$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/exh$a;-><init>(Lo/exh;Lo/exh$3;)V

    iput-object v0, p0, Lo/exh;->n:Lo/exh$a;

    .line 577
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 578
    if-eqz v4, :cond_3

    .line 579
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentDeviceInfo.toString() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    .line 582
    invoke-virtual {p0, p1}, Lo/exh;->d(Landroid/content/Context;)V

    goto :goto_1

    .line 583
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 584
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPressAutoMonitor()Z

    move-result v5

    .line 585
    sget-object v0, Lo/exh;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Adjust isSupportPressAutoMonitor() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 586
    if-eqz v5, :cond_2

    .line 588
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 589
    invoke-static {p1}, Lo/fbw;->c(Landroid/content/Context;)V

    .line 590
    return-void

    .line 592
    :cond_1
    const/4 v0, 0x1

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lo/exh;->a(III)V

    .line 594
    invoke-virtual {p0, p1}, Lo/exh;->b(Landroid/content/Context;)V

    goto :goto_0

    .line 597
    :cond_2
    invoke-virtual {p0, p1}, Lo/exh;->a(Landroid/content/Context;)V

    .line 599
    :goto_0
    goto :goto_1

    .line 601
    :cond_3
    invoke-virtual {p0, p1}, Lo/exh;->d(Landroid/content/Context;)V

    .line 603
    :cond_4
    :goto_1
    return-void
.end method
