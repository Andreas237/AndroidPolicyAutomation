.class public Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;
.super Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/cck;
.implements Lo/cbu$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$c;,
        Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$e;
    }
.end annotation


# instance fields
.field private A:Ljava/lang/String;

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Ljava/lang/String;

.field private E:Landroid/content/IntentFilter;

.field private F:Lo/cbu;

.field private G:Ljava/lang/String;

.field private H:Ljava/lang/String;

.field private I:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$c;

.field private K:Landroid/widget/LinearLayout;

.field private N:Landroid/view/GestureDetector;

.field private b:Landroid/content/Context;

.field private c:Landroid/content/res/Resources;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Lo/egb;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Ljava/lang/String;

.field private j:I

.field private k:Lo/egb;

.field private l:Lo/egb;

.field private m:Lo/egb;

.field private n:Lo/egb;

.field private o:Lo/egb;

.field private p:Lo/egb;

.field private q:Lo/egb;

.field private r:Lo/egb;

.field private s:Lo/egb;

.field private t:Lo/egb;

.field private u:Landroid/widget/ImageView;

.field private v:Landroid/os/Bundle;

.field private w:Lo/egb;

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b:Landroid/content/Context;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->f:Landroid/widget/RelativeLayout;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->h:Landroid/widget/RelativeLayout;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->v:Landroid/os/Bundle;

    .line 84
    const-string v0, "0\'00\""

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->x:Ljava/lang/String;

    .line 86
    const-string v0, "--"

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->C:Ljava/lang/String;

    .line 94
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->j:I

    .line 98
    const-string v0, "-1"

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->H:Ljava/lang/String;

    .line 99
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->G:Ljava/lang/String;

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->E:Landroid/content/IntentFilter;

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->I:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$c;

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->K:Landroid/widget/LinearLayout;

    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)I
    .locals 1

    .line 36
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->j:I

    return v0
.end method

.method public static b(Landroid/content/Context;J)Ljava/lang/String;
    .locals 3

    .line 536
    const/4 v1, 0x1

    .line 537
    invoke-static {p0, p1, p2, v1}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v2

    .line 538
    return-object v2
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->i:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->A:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->g:Lo/egb;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->k:Lo/egb;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->y:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->h:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->f:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->n:Lo/egb;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->x:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->C:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic l(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->D:Ljava/lang/String;

    return-object v0
.end method

.method private l()V
    .locals 0

    .line 393
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->finish()V

    .line 394
    return-void
.end method

.method static synthetic m(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->A:Ljava/lang/String;

    return-object v0
.end method

.method private m()V
    .locals 3

    .line 388
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 389
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 390
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->finish()V

    .line 391
    return-void
.end method

.method static synthetic n(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Landroid/content/Context;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b:Landroid/content/Context;

    return-object v0
.end method

.method private n()V
    .locals 5

    .line 295
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->t:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 297
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->v:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    .line 299
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->g:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->y:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->k:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 303
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->D:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->D:Ljava/lang/String;

    .line 304
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->p:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 307
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->A:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->A:Ljava/lang/String;

    .line 308
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->l:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 311
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->j:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_0

    .line 312
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->n:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 314
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->n:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 317
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->F:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->J()I

    move-result v0

    invoke-static {v0}, Lo/dhr;->c(I)I

    move-result v4

    .line 318
    invoke-virtual {p0, v4}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b(I)V

    .line 321
    :cond_1
    return-void
.end method

.method static synthetic o(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->l:Lo/egb;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 551
    const-string v0, "LockScreenCoverActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterMinuteChangedReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 552
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->E:Landroid/content/IntentFilter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->I:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$c;

    if-eqz v0, :cond_0

    .line 553
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->I:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$c;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 554
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->I:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$c;

    .line 555
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->E:Landroid/content/IntentFilter;

    goto :goto_0

    .line 557
    :cond_0
    const-string v0, "LockScreenCoverActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterMinuteChangedReceiver filter or receiver is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    :goto_0
    return-void
.end method

.method static synthetic p(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->p:Lo/egb;

    return-object v0
.end method

.method private p()V
    .locals 4

    .line 542
    const-string v0, "LockScreenCoverActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerMinuteChangedReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 543
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->E:Landroid/content/IntentFilter;

    .line 544
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->E:Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 545
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->E:Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 546
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$c;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->I:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$c;

    .line 547
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->I:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$c;

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->E:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 548
    return-void
.end method

.method static synthetic q(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->r:Lo/egb;

    return-object v0
.end method

.method static synthetic r(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->u:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->q:Lo/egb;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->m()V

    return-void
.end method

.method static synthetic u(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->l()V

    return-void
.end method

.method static synthetic w(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->t:Lo/egb;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 569
    if-nez p1, :cond_0

    .line 570
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 572
    :cond_0
    const-string v0, "\\d+\\.\\d+"

    invoke-static {v0, p1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 573
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    .line 574
    float-to-int v0, v4

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 575
    :cond_1
    const-string v0, "\\d+"

    invoke-static {v0, p1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 576
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 577
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 579
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected a()V
    .locals 4

    .line 289
    const-string v0, "LockScreenCoverActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 225
    const-string v2, ""

    .line 227
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->G:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 228
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 229
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->c:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 230
    move-object v2, p1

    goto :goto_0

    .line 232
    :cond_2
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 234
    :goto_0
    return-object v2
.end method

.method protected b()V
    .locals 3

    .line 275
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    .line 277
    const/4 v2, 0x2

    .line 278
    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 279
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_activity_lock_screen_cover:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->setContentView(I)V

    .line 280
    return-void
.end method

.method public b(I)V
    .locals 4

    .line 407
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 410
    :pswitch_0
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$3;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 419
    goto :goto_1

    .line 422
    :pswitch_1
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$1;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 432
    goto :goto_1

    .line 434
    :pswitch_2
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$5;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 444
    goto :goto_1

    .line 447
    :pswitch_3
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$7;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$7;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 457
    goto :goto_1

    .line 459
    :pswitch_4
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$9;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 468
    goto :goto_1

    .line 470
    :goto_0
    const-string v0, "LockScreenCoverActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Wrong GPS signal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public c()Z
    .locals 2

    .line 238
    const/4 v1, 0x0

    .line 239
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->F:Lo/cbu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->F:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    const/4 v1, 0x1

    goto :goto_0

    .line 242
    :cond_0
    const/4 v1, 0x0

    .line 244
    :goto_0
    return v1
.end method

.method public d()V
    .locals 3

    .line 325
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_lock_screen_cover_duration:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->k:Lo/egb;

    .line 326
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_lock_screen_cover_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->g:Lo/egb;

    .line 327
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_lock_screen_cover_distance_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->s:Lo/egb;

    .line 328
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_lock_screen_cover_pace:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->n:Lo/egb;

    .line 329
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_lock_screen_cover_pace_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->o:Lo/egb;

    .line 330
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_lock_screen_cover_pace_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->w:Lo/egb;

    .line 331
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_lock_screen_cover_heart_rate:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->p:Lo/egb;

    .line 332
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->btn_lock_screen_cover:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->m:Lo/egb;

    .line 333
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->tv_lock_screen_cover_colories:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->l:Lo/egb;

    .line 335
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_lock_page_gps_sign_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->q:Lo/egb;

    .line 336
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_lock_page_gps_sign:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->u:Landroid/widget/ImageView;

    .line 338
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_lock_page_gps:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->r:Lo/egb;

    .line 342
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->text_system_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->t:Lo/egb;

    .line 344
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_lock_gps_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->K:Landroid/widget/LinearLayout;

    .line 346
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->lock_screen_cover_heart_rate_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->f:Landroid/widget/RelativeLayout;

    .line 348
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->lock_screen_cover_calorie_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->h:Landroid/widget/RelativeLayout;

    .line 351
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 352
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 353
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 355
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->f:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 356
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 359
    :goto_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 360
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->s:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 361
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->o:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    goto :goto_1

    .line 363
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->s:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->c:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 364
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->o:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 367
    :goto_1
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->j:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_2

    .line 368
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->K:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_2

    .line 369
    :cond_2
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->j:I

    const/16 v1, 0x103

    if-ne v0, v1, :cond_3

    .line 371
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->o:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 372
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->w:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_tip_icon_text_pace:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 375
    :cond_3
    :goto_2
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 498
    return-void
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 563
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected e()Lo/cco;
    .locals 1

    .line 284
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 1

    .line 183
    if-nez p1, :cond_0

    .line 184
    return-void

    .line 187
    :cond_0
    const-string v0, "duration"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->i:Ljava/lang/String;

    .line 188
    const-string v0, "distance"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->y:Ljava/lang/String;

    .line 189
    const-string v0, "heartRate"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->D:Ljava/lang/String;

    .line 190
    const-string v0, "pace"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cds;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->x:Ljava/lang/String;

    .line 191
    const-string v0, "calorie"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->A:Ljava/lang/String;

    .line 192
    const-string v0, "speed"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->C:Ljava/lang/String;

    .line 194
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 222
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 487
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->finish()V

    .line 488
    return-void
.end method

.method public f()V
    .locals 2

    .line 379
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->m:Lo/egb;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$4;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V

    invoke-virtual {v0, v1}, Lo/egb;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 385
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 116
    invoke-super {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 117
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, -0x80000000

    const/high16 v2, -0x80000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 118
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x280000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 120
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x8000400

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 122
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->c:Landroid/content/res/Resources;

    .line 123
    iput-object p0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b:Landroid/content/Context;

    .line 124
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->F:Lo/cbu;

    .line 127
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->v:Landroid/os/Bundle;

    .line 129
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->F:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->u()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->j:I

    .line 132
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->v:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->v:Landroid/os/Bundle;

    const-string v1, "SPORT_TIME_FORMAT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->z:Ljava/lang/String;

    .line 136
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->v:Landroid/os/Bundle;

    const-string v1, "SPORT_DISTANCE_FORMAT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->y:Ljava/lang/String;

    .line 138
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->v:Landroid/os/Bundle;

    const-string v1, "SPORT_PACE_FORMAT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cds;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->x:Ljava/lang/String;

    .line 140
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->v:Landroid/os/Bundle;

    const-string v1, "speed"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->C:Ljava/lang/String;

    .line 142
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->v:Landroid/os/Bundle;

    const-string v1, "SPORT_HEART_RATE_FORMAT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->D:Ljava/lang/String;

    .line 144
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->v:Landroid/os/Bundle;

    const-string v1, "SPORT_GPS_SIGN"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->B:Ljava/lang/String;

    .line 146
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->v:Landroid/os/Bundle;

    const-string v1, "SPORT_CALORIE"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 148
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->A:Ljava/lang/String;

    .line 150
    const-string v0, "LockScreenCoverActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->z:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->x:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->D:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->B:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->A:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    :cond_0
    invoke-static {p0}, Lo/cbu;->e(Lo/cck;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->F:Lo/cbu;

    invoke-virtual {v0, p0}, Lo/cbu;->a(Lo/cbu$e;)V

    .line 157
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->p()V

    .line 158
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->d()V

    .line 159
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->f()V

    .line 160
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->n()V

    .line 161
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$e;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$e;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V

    invoke-direct {v0, p0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->N:Landroid/view/GestureDetector;

    .line 165
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 263
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onDestroy()V

    .line 266
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->o()V

    .line 267
    invoke-static {p0}, Lo/cbu;->a(Lo/cck;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->F:Lo/cbu;

    if-eqz v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->F:Lo/cbu;

    invoke-virtual {v0, p0}, Lo/cbu;->e(Lo/cbu$e;)V

    .line 271
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 503
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 505
    const/4 v0, 0x1

    return v0

    .line 507
    :cond_0
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 509
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->m()V

    .line 510
    const/4 v0, 0x1

    return v0

    .line 513
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 169
    invoke-super {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 170
    invoke-static {p0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->F:Lo/cbu;

    .line 171
    invoke-static {p0}, Lo/cbu;->e(Lo/cck;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->F:Lo/cbu;

    invoke-virtual {v0, p0}, Lo/cbu;->a(Lo/cbu$e;)V

    .line 173
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->N:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
