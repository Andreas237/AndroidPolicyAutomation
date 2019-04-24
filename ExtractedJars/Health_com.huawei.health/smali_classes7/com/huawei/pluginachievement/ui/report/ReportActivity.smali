.class public Lcom/huawei/pluginachievement/ui/report/ReportActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/dui;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pluginachievement/ui/report/ReportActivity$b;,
        Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;
    }
.end annotation


# instance fields
.field private a:Lo/dzf;

.field private b:Lo/emr;

.field private c:I

.field protected d:Lo/dzg;

.field private e:I

.field private f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

.field private g:I

.field private h:Lo/dwr;

.field private i:Lo/dvf;

.field private k:Lo/dvf;

.field private l:Landroid/content/Context;

.field private m:Z

.field private n:Ljava/util/concurrent/ExecutorService;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation
.end field

.field private p:Landroid/widget/Toast;

.field private q:Z

.field private r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Landroid/util/Pair<Ljava/lang/Double;Ljava/lang/Long;>;>;"
        }
    .end annotation
.end field

.field private s:Z

.field private t:I

.field private u:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 101
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->m:Z

    .line 103
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->o:Ljava/util/List;

    .line 104
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->t:I

    .line 106
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->s:Z

    .line 107
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->q:Z

    .line 431
    new-instance v0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$b;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity$b;-><init>(Landroid/os/Looper;Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->u:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g:I

    return v0
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->r:Ljava/util/Map;

    return-object p1
.end method

.method private a()V
    .locals 2

    .line 158
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->n:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->n:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/report/ReportActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity$2;-><init>(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 167
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Lo/dvf;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b(Lo/dvf;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/report/ReportActivity;I)I
    .locals 0

    .line 75
    iput p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->t:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lcom/huawei/pluginachievement/ui/report/ReportFragment;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 197
    sget v0, Lcom/huawei/pluginachievement/R$id;->report_viewpaper:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/dzg;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d:Lo/dzg;

    .line 198
    new-instance v0, Lo/dzf;

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c:I

    iget v3, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e:I

    iget v4, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g:I

    invoke-direct {v0, v1, v2, v3, v4}, Lo/dzf;-><init>(Landroid/support/v4/app/FragmentManager;III)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->a:Lo/dzf;

    .line 200
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d:Lo/dzg;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->a:Lo/dzf;

    invoke-virtual {v0, v1}, Lo/dzg;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 201
    sget v0, Lcom/huawei/pluginachievement/R$id;->txt_report_title:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b:Lo/emr;

    .line 203
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g:I

    if-nez v0, :cond_0

    .line 204
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_monthly:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_0

    .line 207
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_weekly:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 210
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b:Lo/emr;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->l:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_health_nav_share_black:I

    invoke-static {v1, v2}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 213
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_health_nav_share_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 215
    :goto_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d:Lo/dzg;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e:I

    iget v2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lo/dzg;->setCurrentItem(I)V

    .line 216
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b:Lo/emr;

    new-instance v1, Lcom/huawei/pluginachievement/ui/report/ReportActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity$5;-><init>(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 223
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Ljava/util/List;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b(Ljava/util/List;)V

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dvf;>;)V"
        }
    .end annotation

    .line 406
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    if-eqz v0, :cond_2

    .line 407
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->t:I

    if-eqz v0, :cond_0

    .line 408
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->t:I

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->d(I)V

    .line 410
    :cond_0
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g:I

    if-nez v0, :cond_1

    .line 411
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-virtual {v0, p1}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->e(Ljava/util/List;)V

    goto :goto_0

    .line 413
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-virtual {v0, p1}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->d(Ljava/util/List;)V

    .line 417
    :cond_2
    :goto_0
    return-void
.end method

.method private b(Lo/dvf;)V
    .locals 1

    .line 399
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    if-eqz v0, :cond_0

    .line 400
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-virtual {v0, p1}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->c(Lo/dvf;)V

    .line 401
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d:Lo/dzg;

    invoke-virtual {v0}, Lo/dzg;->d()V

    .line 403
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->o:Ljava/util/List;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dwr;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h:Lo/dwr;

    return-object v0
.end method

.method private c()V
    .locals 2

    .line 420
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    if-eqz v0, :cond_0

    .line 421
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->t:I

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->d(I)V

    .line 423
    :cond_0
    return-void
.end method

.method private c(ILjava/lang/String;Lo/dvf;)V
    .locals 1

    .line 392
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    if-eqz v0, :cond_0

    .line 393
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->d(ILjava/lang/String;Lo/dvf;)V

    .line 394
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d:Lo/dzg;

    invoke-virtual {v0}, Lo/dzg;->d()V

    .line 396
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Ljava/util/List;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->o:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/content/Context;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->l:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Lo/dvf;)Lo/dvf;
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->i:Lo/dvf;

    return-object p1
.end method

.method private e()V
    .locals 2

    .line 246
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h:Lo/dwr;

    .line 247
    const-string v0, "PLGACHIEVE_ReportActivity"

    const-string v1, "getData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->b(Lo/dui;)V

    .line 249
    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;ILjava/lang/String;Lo/dvf;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c(ILjava/lang/String;Lo/dvf;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Z)Z
    .locals 0

    .line 75
    iput-boolean p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->m:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Z
    .locals 1

    .line 75
    iget-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->m:Z

    return v0
.end method

.method static synthetic g(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dvf;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->i:Lo/dvf;

    return-object v0
.end method

.method private g()V
    .locals 2

    .line 426
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    if-eqz v0, :cond_0

    .line 427
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->r:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->c(Ljava/util/Map;)V

    .line 429
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/os/Handler;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->u:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Z
    .locals 1

    .line 75
    iget-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->q:Z

    return v0
.end method

.method static synthetic k(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e:I

    return v0
.end method

.method static synthetic n(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g()V

    return-void
.end method

.method static synthetic p(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dvf;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->k:Lo/dvf;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/huawei/pluginachievement/ui/report/ReportFragment;JJ)V
    .locals 7

    .line 253
    const-string v0, "PLGACHIEVE_ReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "lineDataShow_mReportDataDB startTime"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const-string v0, "PLGACHIEVE_ReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "lineDataShow_mReportDataDB endTime "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    .line 256
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->n:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;

    move-object v2, p0

    move-wide v3, p2

    move-wide v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;-><init>(Lcom/huawei/pluginachievement/ui/report/ReportActivity;JJ)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 282
    return-void
.end method

.method public b(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)V
    .locals 4

    .line 386
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    .line 387
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->l:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity$a;-><init>(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-interface {v0, v2, v3, v1}, Lo/clt;->d(IILo/clz;)V

    .line 389
    return-void
.end method

.method public d(I)V
    .locals 1

    .line 239
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b:Lo/emr;

    invoke-virtual {v0, p1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 240
    return-void
.end method

.method public d(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)V
    .locals 3

    .line 286
    const-string v0, "PLGACHIEVE_ReportActivity"

    const-string v1, "enter onShow():"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d:Lo/dzg;

    invoke-virtual {v0}, Lo/dzg;->b()V

    .line 288
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    .line 289
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->n:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;-><init>(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 327
    const-string v0, "PLGACHIEVE_ReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onShow:no="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-virtual {v2}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    return-void
.end method

.method public d(Lcom/huawei/pluginachievement/ui/report/ReportFragment;J)V
    .locals 2

    .line 332
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->f:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    .line 333
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->n:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/report/ReportActivity$1;

    invoke-direct {v1, p0, p2, p3}, Lcom/huawei/pluginachievement/ui/report/ReportActivity$1;-><init>(Lcom/huawei/pluginachievement/ui/report/ReportActivity;J)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 342
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 518
    iput-boolean p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->s:Z

    .line 519
    return-void
.end method

.method public d()Z
    .locals 1

    .line 514
    iget-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->s:Z

    return v0
.end method

.method public e(I)V
    .locals 2

    .line 187
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->p:Landroid/widget/Toast;

    if-nez v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->l:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->p:Landroid/widget/Toast;

    goto :goto_0

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->p:Landroid/widget/Toast;

    invoke-virtual {v0, p1}, Landroid/widget/Toast;->setText(I)V

    .line 192
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->p:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 193
    return-void
.end method

.method public e(ILo/dwk;)V
    .locals 5

    .line 478
    const/4 v3, 0x0

    .line 479
    const-string v0, "PLGACHIEVE_ReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDataChanged->error:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p2, :cond_0

    const-string v2, "null"

    goto :goto_0

    .line 480
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 479
    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 482
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 483
    iput p1, v4, Landroid/os/Message;->arg1:I

    .line 484
    if-eqz p2, :cond_6

    .line 485
    const-string v0, "PLGACHIEVE_ReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDataChanged->resultCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_5

    .line 487
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g:I

    if-nez v0, :cond_2

    .line 488
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 489
    invoke-virtual {p2}, Lo/dwk;->g()Lo/dwd;

    move-result-object v3

    goto :goto_1

    .line 491
    :cond_1
    return-void

    .line 493
    :cond_2
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 494
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 495
    invoke-virtual {p2}, Lo/dwk;->h()Lo/dwh;

    move-result-object v3

    goto :goto_1

    .line 497
    :cond_3
    return-void

    .line 500
    :cond_4
    return-void

    .line 503
    :cond_5
    :goto_1
    iput-object v3, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->k:Lo/dvf;

    .line 504
    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 505
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->u:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 507
    :cond_6
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 111
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 112
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->n:Ljava/util/concurrent/ExecutorService;

    .line 113
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->l:Landroid/content/Context;

    .line 114
    const-string v0, "PLGACHIEVE_ReportActivity"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 116
    if-eqz v3, :cond_0

    .line 117
    const-string v0, "max_report_no"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e:I

    .line 118
    const-string v0, "min_report_no"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c:I

    .line 119
    const-string v0, "report_stype"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g:I

    .line 120
    const-string v0, "step_target"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->t:I

    .line 122
    :cond_0
    const/4 v4, 0x0

    .line 125
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 126
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->l:Landroid/content/Context;

    const-string v1, "_monthReportNo"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 127
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->l:Landroid/content/Context;

    const-string v1, "_monthMinReportNo"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 129
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->l:Landroid/content/Context;

    const-string v1, "_weekReportNo"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 130
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->l:Landroid/content/Context;

    const-string v1, "_weekMinReportNo"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 133
    :goto_0
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move v4, v0

    .line 134
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    goto :goto_1

    .line 135
    :catch_0
    move-exception v7

    .line 136
    const-string v0, "PLGACHIEVE_ReportActivity"

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    :goto_1
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e:I

    if-le v4, v0, :cond_2

    move v0, v4

    goto :goto_2

    :cond_2
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e:I

    :goto_2
    iput v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e:I

    .line 140
    const-string v0, "PLGACHIEVE_ReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "maxReprotNo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " minReprotNo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " reportStype:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e:I

    iget v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c:I

    if-ge v0, v1, :cond_3

    .line 144
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e:I

    iput v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c:I

    .line 147
    :cond_3
    sget v0, Lcom/huawei/pluginachievement/R$layout;->layout_report_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->setContentView(I)V

    .line 148
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 149
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->q:Z

    goto :goto_3

    .line 151
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->q:Z

    .line 153
    :goto_3
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b()V

    .line 154
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->a()V

    .line 155
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 228
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 229
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->u:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 230
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->u:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 231
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->u:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 232
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->u:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 234
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->n:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lo/dzw;->c(Ljava/util/concurrent/ExecutorService;)V

    .line 236
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 171
    const-string v0, "PLGACHIEVE_ReportActivity"

    const-string v1, "onStart"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e()V

    .line 173
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 174
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 178
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 179
    const-string v0, "PLGACHIEVE_ReportActivity"

    const-string v1, "onStop"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h:Lo/dwr;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 183
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h:Lo/dwr;

    .line 184
    return-void
.end method
