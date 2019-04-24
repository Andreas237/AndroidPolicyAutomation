.class public Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;
    }
.end annotation


# static fields
.field private static u:Ljava/lang/String;


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Landroid/content/Context;

.field private c:Lo/fit;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/widget/LinearLayout;

.field private m:Landroid/widget/LinearLayout;

.field private n:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/widget/TextView;

.field private q:Lo/egn;

.field private r:Lo/fjw;

.field private s:Lo/fjx;

.field private t:Ljava/util/concurrent/ExecutorService;

.field private z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 106
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->u:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 138
    new-instance v0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;-><init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    return-void
.end method

.method static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 75
    sput-object p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->u:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic a(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->d()V

    return-void
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 75
    sget-object v0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->u:Ljava/lang/String;

    return-object v0
.end method

.method private b(I)V
    .locals 4

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->q:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 462
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/thirdpartservice/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->q:Lo/egn;

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->q:Lo/egn;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 464
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->q:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->q:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 469
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 470
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->q:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 471
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lo/fit;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->c:Lo/fit;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 248
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startQQHealthActivity()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    sget-object v0, Lo/dae;->ec:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 251
    :cond_0
    sget v0, Lcom/huawei/ui/thirdpartservice/R$string;->sns_waiting:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b(I)V

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->n:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$7;-><init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->getAuthorizeToken(Lo/cyx;)V

    .line 322
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->i()V

    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 487
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 488
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 490
    const-string v0, "type"

    invoke-interface {v3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 493
    return-void
.end method

.method private static d(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    .line 691
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 692
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 695
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v1, 0x2000

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 697
    const/4 v0, 0x1

    return v0

    .line 698
    :catch_0
    move-exception v2

    .line 699
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 334
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMyfitActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    sget-object v0, Lo/dae;->ec:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3"

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 337
    :cond_0
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/thirdpartservice/activity/myfitnesspal/MyftOuthActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 338
    invoke-virtual {p0, v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->startActivity(Landroid/content/Intent;)V

    .line 339
    return-void
.end method

.method private f()V
    .locals 4

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "wechat_red_dot_show"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 498
    const-string v0, "true"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 501
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 503
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->h()V

    return-void
.end method

.method private g()V
    .locals 4

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "alisport_red_dot_show"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 508
    const-string v0, "true"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 511
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 514
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->p()V

    .line 515
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->g()V

    return-void
.end method

.method private h()V
    .locals 5

    .line 393
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startGoogleFitActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 395
    :cond_0
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/thirdpartservice/activity/googlefit/GoogleFitOuthActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 396
    invoke-virtual {p0, v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->startActivity(Landroid/content/Intent;)V

    .line 397
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->f()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 347
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startAliSportActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    sget-object v0, Lo/dae;->ec:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "5"

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 350
    :cond_0
    sget v0, Lcom/huawei/ui/thirdpartservice/R$string;->sns_waiting:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b(I)V

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$9;-><init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    invoke-virtual {v0, v1}, Lo/czg;->d(Lo/cyx;)V

    .line 386
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    return-object v0
.end method

.method private k()Z
    .locals 2

    .line 400
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 401
    const/4 v0, 0x1

    return v0

    .line 403
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 404
    const/16 v0, 0x3e8

    iput v0, v1, Landroid/os/Message;->what:I

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 406
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic l(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->i:Landroid/widget/TextView;

    return-object v0
.end method

.method private l()V
    .locals 7

    .line 672
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGoogleFitStatus()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 675
    :cond_0
    invoke-static {}, Lo/fjr;->a()Lo/fjr;

    move-result-object v0

    invoke-virtual {v0}, Lo/fjr;->c()Z

    move-result v4

    .line 677
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    const/16 v1, 0x1f8

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 679
    if-eqz v4, :cond_1

    .line 680
    const-string v6, "true"

    .line 681
    iput-object v6, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 682
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    invoke-virtual {v0, v5}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 683
    goto :goto_0

    .line 684
    :cond_1
    const-string v6, "false"

    .line 685
    iput-object v6, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 686
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    invoke-virtual {v0, v5}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 688
    :goto_0
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method private m()V
    .locals 4

    .line 593
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkQQStatus()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 594
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 597
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->n:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$2;-><init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->getAuthorizeToken(Lo/cyx;)V

    .line 669
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method private o()V
    .locals 7

    .line 549
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkMyfitStatus() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 550
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 552
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/fjx;->a(Landroid/content/Context;)Lo/fjx;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->s:Lo/fjx;

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->s:Lo/fjx;

    invoke-virtual {v0}, Lo/fjx;->e()Lo/fjw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->r:Lo/fjw;

    .line 555
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    const/16 v1, 0x1f6

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    const-string v1, "com.myfitnesspal.android"

    invoke-static {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 557
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->s:Lo/fjx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fjx;->d(Z)V

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->s:Lo/fjx;

    invoke-virtual {v0}, Lo/fjx;->e()Lo/fjw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->r:Lo/fjw;

    .line 561
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkMyfitStatus() PACKAGENAME is no exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 563
    const-string v5, "false"

    .line 564
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    const/16 v1, 0x1f6

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 565
    iput-object v5, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 566
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 568
    return-void

    .line 570
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v5

    .line 571
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkMyfitStatus() isNetworkAvailable = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkMyfitStatus() isLogin = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->r:Lo/fjw;

    invoke-virtual {v3}, Lo/fjw;->e()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->r:Lo/fjw;

    invoke-virtual {v0}, Lo/fjw;->e()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v5, :cond_2

    .line 574
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkMyfitStatus() is connect "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    const-string v6, "true"

    .line 578
    iput-object v6, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 579
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 581
    goto :goto_0

    .line 582
    :cond_2
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkMyfitStatus() is disconnect "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    const-string v6, "false"

    .line 586
    iput-object v6, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 587
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 589
    :goto_0
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->p:Landroid/widget/TextView;

    return-object v0
.end method

.method private p()V
    .locals 4

    .line 518
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAliAuth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 520
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$6;-><init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    invoke-virtual {v0, v1}, Lo/czg;->d(Lo/cyx;)V

    .line 545
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 479
    invoke-virtual {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->q:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->q:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 481
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->q:Lo/egn;

    .line 482
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy mLoadingDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    :cond_0
    return-void
.end method

.method public c()V
    .locals 7

    .line 144
    sget v0, Lcom/huawei/ui/thirdpartservice/R$layout;->activity_third_party_service:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->setContentView(I)V

    .line 145
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->m()V

    .line 146
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->layout_qq_health:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->a:Landroid/widget/LinearLayout;

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->a:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$4;-><init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 154
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 158
    :cond_0
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->layout_wechat:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->d:Landroid/widget/LinearLayout;

    .line 159
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->tv_data_share_wechat_status:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e:Landroid/widget/TextView;

    .line 160
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->iv_wechat_connect_dot:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k:Landroid/widget/ImageView;

    .line 161
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->imageView_alisport_connect_dot:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->h:Landroid/widget/ImageView;

    .line 162
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->textView_data_share_alisport_status:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->g:Landroid/widget/TextView;

    .line 163
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->textView_data_share_myfitnesspal_status:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->i:Landroid/widget/TextView;

    .line 164
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->textView_data_share_qq_status:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->f:Landroid/widget/TextView;

    .line 165
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->textView_data_share_google_fit_status:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->p:Landroid/widget/TextView;

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->d:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$3;-><init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 188
    :cond_1
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->layout_my_fitnesspal:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->m:Landroid/widget/LinearLayout;

    .line 189
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->o()V

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->m:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$1;-><init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 197
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->layout_alisport:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->l:Landroid/widget/LinearLayout;

    .line 199
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 203
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->g()V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->l:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$5;-><init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 213
    :goto_0
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->layout_google_fit:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->o:Landroid/widget/LinearLayout;

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->o:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$8;-><init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 224
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 227
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->l()V

    .line 230
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 231
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->weChat_arrow_gray:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 232
    sget v0, Lcom/huawei/ui/thirdpartservice/R$mipmap;->ic_arrow_previous:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 233
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->qqHealth_arrow_gray:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/ImageView;

    .line 234
    sget v0, Lcom/huawei/ui/thirdpartservice/R$mipmap;->ic_arrow_previous:I

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 235
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->googlefit_arrow_gray:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 236
    sget v0, Lcom/huawei/ui/thirdpartservice/R$mipmap;->ic_arrow_previous:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 237
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->myfitnesspal_arrow_gray:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 238
    sget v0, Lcom/huawei/ui/thirdpartservice/R$mipmap;->ic_arrow_previous:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 239
    sget v0, Lcom/huawei/ui/thirdpartservice/R$id;->alisport_arrow_gray:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 240
    sget v0, Lcom/huawei/ui/thirdpartservice/R$mipmap;->ic_arrow_previous:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 242
    :cond_4
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 129
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onCreate():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 131
    iput-object p0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    .line 132
    invoke-static {}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->getInstance()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->n:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/fit;->b(Landroid/content/Context;)Lo/fit;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->c:Lo/fit;

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->c:Lo/fit;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->z:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    invoke-virtual {v0, v1}, Lo/fit;->a(Landroid/os/Handler;)V

    .line 135
    invoke-virtual {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->c()V

    .line 136
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 411
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onDestroy():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 413
    invoke-virtual {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->a()V

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->t:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->t:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->t:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 419
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 423
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onResume():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->t:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 425
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->t:Ljava/util/concurrent/ExecutorService;

    .line 427
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->t:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$10;-><init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 448
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->o()V

    .line 449
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->m()V

    .line 451
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 452
    invoke-direct {p0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->l()V

    .line 454
    :cond_1
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 455
    return-void
.end method
