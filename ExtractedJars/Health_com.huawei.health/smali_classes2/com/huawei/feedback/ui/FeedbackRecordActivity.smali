.class public Lcom/huawei/feedback/ui/FeedbackRecordActivity;
.super Lcom/huawei/feedback/ui/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/ui/FeedbackRecordActivity$c;,
        Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;,
        Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;,
        Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressPauseReceiver;,
        Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;,
        Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;,
        Lcom/huawei/feedback/ui/FeedbackRecordActivity$a;
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/String; = "com.example.logupload.exception"

.field public static final d:Ljava/lang/String; = "1"

.field private static final e:Ljava/lang/String; = "FeedbackRecordActivity"

.field private static final m:I = -0x1

.field private static x:Ljava/lang/String; = null


# instance fields
.field private A:I

.field private B:Lcom/huawei/feedback/ui/CustomActionBar;

.field private C:Landroid/os/Handler;

.field private D:Landroid/widget/AdapterView$OnItemClickListener;

.field private E:I

.field b:Lcom/huawei/lcagent/client/LogCollectManager;

.field private f:Landroid/app/ActionBar;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/ListView;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/feedback/bean/f;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/logupload/LogUpload;>;"
        }
    .end annotation
.end field

.field private l:Lcom/huawei/logupload/a;

.field private n:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;

.field private o:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;

.field private p:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;

.field private q:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressPauseReceiver;

.field private r:Landroid/app/AlertDialog;

.field private s:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

.field private t:Landroid/content/BroadcastReceiver;

.field private u:Landroid/content/IntentFilter;

.field private v:Z

.field private w:Landroid/widget/RelativeLayout;

.field private y:Landroid/widget/RelativeLayout;

.field private z:Landroid/widget/RelativeLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 126
    const-string v0, ""

    sput-object v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->x:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 72
    invoke-direct {p0}, Lcom/huawei/feedback/ui/BaseActivity;-><init>()V

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->k:Ljava/util/List;

    .line 98
    new-instance v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->n:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;

    .line 99
    new-instance v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->o:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;

    .line 100
    new-instance v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->p:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;

    .line 101
    new-instance v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressPauseReceiver;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressPauseReceiver;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->q:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressPauseReceiver;

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->t:Landroid/content/BroadcastReceiver;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->u:Landroid/content/IntentFilter;

    .line 121
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->v:Z

    .line 146
    new-instance v0, Lcom/huawei/feedback/ui/af;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/af;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->C:Landroid/os/Handler;

    .line 408
    new-instance v0, Lcom/huawei/feedback/ui/aj;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/aj;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->D:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->n:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;

    return-object v0
.end method

.method private a(I)V
    .locals 4

    .line 673
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p1, :cond_0

    .line 675
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/feedback/bean/f;

    .line 677
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 679
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 680
    const-class v0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 682
    const-string v0, "pQuestionId"

    invoke-virtual {v2}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 685
    const/16 v0, 0xa

    invoke-virtual {p0, v3, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 690
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackRecordActivity;I)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Ljava/util/List;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->a(Ljava/util/List;)V

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/feedback/bean/f;>;)V"
        }
    .end annotation

    .line 2378
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/feedback/bean/f;

    .line 2379
    if-nez v3, :cond_0

    .line 2380
    goto :goto_0

    .line 2384
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/feedback/bean/f;->n()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/logic/f;->b(Ljava/lang/String;)Lcom/huawei/feedback/bean/f;

    move-result-object v4

    .line 2387
    if-nez v4, :cond_1

    .line 2388
    goto :goto_0

    .line 2392
    .line 2393
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/feedback/bean/f;->n()Ljava/lang/String;

    move-result-object v0

    .line 2392
    invoke-static {v0}, Lcom/huawei/feedback/logic/f;->e(Ljava/lang/String;)Lcom/huawei/feedback/bean/f;

    move-result-object v5

    .line 2396
    if-eqz v5, :cond_2

    .line 2397
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "already has reply,do not save answer"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2398
    goto :goto_0

    .line 2403
    :cond_2
    :try_start_0
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/M/d HH:mm"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v6, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2404
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 2405
    invoke-virtual {v3, v7}, Lcom/huawei/feedback/bean/f;->k(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 2410
    goto :goto_1

    .line 2406
    :catch_0
    move-exception v6

    .line 2407
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "get date IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2410
    goto :goto_1

    .line 2408
    :catch_1
    move-exception v6

    .line 2409
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "get date Exception"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2413
    :goto_1
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/f;->n(Ljava/lang/String;)V

    .line 2415
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/f;->c(I)V

    .line 2417
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->o()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 2418
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/f;->j(Ljava/lang/String;)V

    .line 2421
    :cond_3
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->x()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/f;->p(Ljava/lang/String;)V

    .line 2422
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/f;->q(Ljava/lang/String;)V

    .line 2424
    invoke-static {v3}, Lcom/huawei/feedback/logic/f;->a(Lcom/huawei/feedback/bean/f;)J

    .line 2425
    goto/16 :goto_0

    .line 2427
    :cond_4
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->C:Landroid/os/Handler;

    const/16 v1, 0x7d7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2428
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/bean/f;Lcom/huawei/feedback/bean/f;)Z
    .locals 1

    .line 72
    invoke-static {p0, p1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->c(Lcom/huawei/feedback/bean/f;Lcom/huawei/feedback/bean/f;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Z)Z
    .locals 0

    .line 72
    iput-boolean p1, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->v:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->o:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Z)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Z)V

    return-void
.end method

.method private static b(Ljava/lang/String;)V
    .locals 0

    .line 139
    sput-object p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->x:Ljava/lang/String;

    .line 140
    return-void
.end method

.method private b(Z)V
    .locals 2

    .line 658
    if-eqz p1, :cond_0

    .line 659
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->z:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 660
    const-string v0, "emui_color_gray_1"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-static {p0, v0}, Lcom/huawei/phoneserviceuni/common/e/a;->a(Landroid/app/Activity;I)V

    goto :goto_0

    .line 662
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->z:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 663
    iget v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->A:I

    invoke-static {p0, v0}, Lcom/huawei/phoneserviceuni/common/e/a;->b(Landroid/app/Activity;I)V

    .line 667
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/feedback/bean/f;Lcom/huawei/feedback/bean/f;)Z
    .locals 1

    .line 72
    invoke-static {p0, p1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->d(Lcom/huawei/feedback/bean/f;Lcom/huawei/feedback/bean/f;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressPauseReceiver;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->q:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressPauseReceiver;

    return-object v0
.end method

.method static synthetic c()Ljava/lang/String;
    .locals 1

    .line 72
    sget-object v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->x:Ljava/lang/String;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 0

    .line 143
    invoke-static {p1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Ljava/lang/String;)V

    .line 144
    return-void
.end method

.method private static c(Lcom/huawei/feedback/bean/f;Lcom/huawei/feedback/bean/f;)Z
    .locals 2

    .line 2286
    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 2288
    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    if-eqz v0, :cond_2

    .line 2289
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    .line 2291
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic d(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->p:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 305
    const-string v0, "custom_actionbar"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/ui/CustomActionBar;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->B:Lcom/huawei/feedback/ui/CustomActionBar;

    .line 306
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->B:Lcom/huawei/feedback/ui/CustomActionBar;

    const-string v1, "feedbackRecord_title"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomActionBar;->a(I)V

    .line 307
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->B:Lcom/huawei/feedback/ui/CustomActionBar;

    new-instance v1, Lcom/huawei/feedback/ui/ah;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/ah;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomActionBar;->a(Lcom/huawei/feedback/ui/CustomActionBar$a;)V

    .line 315
    return-void
.end method

.method private static d(Lcom/huawei/feedback/bean/f;Lcom/huawei/feedback/bean/f;)Z
    .locals 2

    .line 2295
    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 2297
    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    if-nez v0, :cond_1

    .line 2298
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    .line 2300
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    if-eqz v0, :cond_3

    .line 2301
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 2303
    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    if-eqz v0, :cond_2

    .line 2304
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 2305
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e()V
    .locals 2

    .line 321
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->f:Landroid/app/ActionBar;

    .line 322
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->f:Landroid/app/ActionBar;

    if-eqz v0, :cond_0

    .line 323
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayShowCustomEnabled(Z)V

    .line 325
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->f:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 328
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->f()V

    return-void
.end method

.method private f()V
    .locals 3

    .line 332
    new-instance v0, Lcom/huawei/feedback/ui/ai;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/ai;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->t:Landroid/content/BroadcastReceiver;

    .line 350
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "UpdateRecordListBroadcast"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->u:Landroid/content/IntentFilter;

    .line 354
    invoke-static {p0}, Landroid/a/a/b/a;->a(Landroid/content/Context;)Landroid/a/a/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->t:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->u:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/a/a/b/a;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 356
    return-void
.end method

.method static synthetic f(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->h()V

    return-void
.end method

.method private g()V
    .locals 6

    .line 364
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 366
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 367
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 368
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 369
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->n()I

    move-result v3

    .line 371
    if-lez v3, :cond_0

    .line 373
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Z)V

    goto :goto_0

    .line 376
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Z)V

    .line 380
    :goto_0
    new-instance v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    invoke-direct {v0, p0, p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->s:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    .line 381
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 383
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 384
    const-string v0, "feedback_blank_foot_with_toolbar_emui50"

    .line 385
    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    .line 384
    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 387
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v1, v2}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 390
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setFooterDividersEnabled(Z)V

    .line 391
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->s:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 392
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->D:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 393
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 395
    goto :goto_1

    .line 397
    :cond_2
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->m()V

    .line 398
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 403
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Z)V

    .line 406
    :goto_1
    return-void
.end method

.method static synthetic g(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->g()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->w:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private h()V
    .locals 6

    .line 506
    invoke-static {}, Lcom/huawei/feedback/logic/f;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    .line 508
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l:Lcom/huawei/logupload/a;

    if-eqz v0, :cond_1

    .line 511
    :try_start_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l:Lcom/huawei/logupload/a;

    invoke-interface {v0}, Lcom/huawei/logupload/a;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->k:Ljava/util/List;

    .line 513
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/logupload/LogUpload;

    .line 514
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 515
    const-string v0, "com.example.logupload.progress"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 516
    const-string v0, "mLogUploadInfo"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 519
    const-string v0, "extraValue"

    const-string v1, "1"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 520
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 523
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 527
    goto :goto_0

    .line 532
    :cond_0
    goto :goto_1

    .line 529
    :catch_0
    move-exception v3

    .line 531
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RemoteException: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    :cond_1
    :goto_1
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->k()V

    .line 540
    :try_start_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$c;

    invoke-direct {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$c;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 543
    goto :goto_2

    .line 541
    :catch_1
    move-exception v3

    .line 542
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "Arrays sort IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 548
    :goto_2
    return-void
.end method

.method static synthetic i(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->s:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 554
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 555
    :cond_0
    return-void

    .line 558
    :cond_1
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 563
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const-string v1, "feedback_dialog_textview"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 564
    const-string v0, "feedback_ok"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$a;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Lcom/huawei/feedback/ui/af;)V

    invoke-virtual {v3, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 567
    const-string v0, "feedback_cancel"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$a;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Lcom/huawei/feedback/ui/af;)V

    invoke-virtual {v3, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 570
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 571
    return-void
.end method

.method private j()V
    .locals 5

    .line 589
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 590
    return-void

    .line 594
    :cond_0
    invoke-static {}, Lcom/huawei/feedback/logic/f;->c()V

    .line 597
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->s:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    if-eqz v0, :cond_4

    .line 600
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 602
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 604
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/feedback/bean/f;

    .line 611
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    .line 612
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    if-nez v0, :cond_2

    .line 617
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 619
    :cond_2
    goto :goto_0

    .line 621
    :cond_3
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->s:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->notifyDataSetChanged()V

    .line 622
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 627
    :cond_4
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 628
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->m()V

    .line 630
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 635
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Z)V

    goto :goto_1

    .line 638
    :cond_5
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->n()I

    move-result v2

    .line 640
    if-lez v2, :cond_6

    .line 642
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Z)V

    goto :goto_1

    .line 645
    :cond_6
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Z)V

    .line 650
    :goto_1
    return-void
.end method

.method static synthetic j(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Landroid/app/AlertDialog;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->r:Landroid/app/AlertDialog;

    return-object v0
.end method

.method private k()V
    .locals 18

    .line 697
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/feedback/bean/f;

    .line 699
    invoke-virtual {v6}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 700
    goto :goto_0

    .line 702
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 706
    const/4 v9, 0x0

    .line 707
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/logupload/LogUpload;

    .line 708
    invoke-virtual {v11}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    cmp-long v0, v0, v7

    if-nez v0, :cond_4

    .line 709
    const/4 v9, 0x1

    .line 710
    invoke-virtual {v11}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v12

    .line 711
    invoke-virtual {v11}, Lcom/huawei/logupload/LogUpload;->k()J

    move-result-wide v13

    .line 712
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 715
    const-string v0, ","

    invoke-virtual {v12, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v15

    .line 717
    array-length v0, v15

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    aget-object v0, v15, v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 718
    const/4 v0, 0x1

    aget-object v0, v15, v0

    const/4 v1, 0x1

    aget-object v1, v15, v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    .line 722
    :cond_1
    goto :goto_2

    .line 723
    :cond_2
    const-string v12, "0"

    .line 726
    :goto_2
    :try_start_0
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v15

    .line 730
    const-wide/16 v0, 0x0

    cmp-long v0, v13, v0

    if-lez v0, :cond_3

    .line 731
    int-to-float v0, v15

    long-to-float v1, v13

    div-float v16, v0, v1

    .line 732
    const/high16 v0, 0x42c80000    # 100.0f

    mul-float v0, v0, v16

    float-to-int v1, v0

    move/from16 v17, v1

    .line 733
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 734
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "feedback_advanced_loguploading"

    .line 735
    move-object/from16 v3, p0

    invoke-static {v3, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 734
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v4, v17

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "%"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 733
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/feedback/bean/f;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 743
    :cond_3
    goto :goto_3

    .line 741
    :catch_0
    move-exception v15

    .line 742
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 745
    :goto_3
    invoke-virtual {v11}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/feedback/bean/f;->d(Ljava/lang/String;)V

    .line 748
    :cond_4
    goto/16 :goto_1

    .line 750
    :cond_5
    if-nez v9, :cond_8

    .line 751
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "!isFindNoRecord"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 752
    invoke-virtual {v6}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_8

    .line 754
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/feedback/logic/f;->a(Ljava/lang/String;I)V

    .line 756
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 757
    invoke-virtual {v6}, Lcom/huawei/feedback/bean/f;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 758
    new-instance v10, Ljava/io/File;

    invoke-virtual {v6}, Lcom/huawei/feedback/bean/f;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 759
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v10}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 761
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "file delete sccess!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 764
    :cond_6
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "file not exist or error! file delete fail!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 766
    :goto_4
    goto :goto_5

    .line 768
    :cond_7
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file path is empty or null: feedbackInfo.getFilePath()):"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 770
    invoke-virtual {v6}, Lcom/huawei/feedback/bean/f;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 768
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 778
    :cond_8
    :goto_5
    goto/16 :goto_0

    .line 779
    :cond_9
    return-void
.end method

.method static synthetic l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    return-object v0
.end method

.method private l()V
    .locals 6

    .line 840
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 841
    const-string v0, "feedback_dialog_feedbackrecord"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 843
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 844
    invoke-virtual {v3, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 901
    .line 902
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "feedback_record_delete"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/ui/al;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/al;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    .line 901
    invoke-virtual {v3, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "feedback_cancel"

    .line 946
    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Lcom/huawei/feedback/ui/ak;

    invoke-direct {v2, p0}, Lcom/huawei/feedback/ui/ak;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 958
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->r:Landroid/app/AlertDialog;

    .line 959
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->r:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 961
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->r:Landroid/app/AlertDialog;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    const-string v1, "#FA2A2D"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 963
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->r:Landroid/app/AlertDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 965
    return-void
.end method

.method static synthetic m(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->E:I

    return v0
.end method

.method private m()V
    .locals 2

    .line 2342
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 2344
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2345
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 2347
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2348
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2350
    :goto_0
    return-void
.end method

.method private n()I
    .locals 5

    .line 2432
    const/4 v2, 0x0

    .line 2433
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 2434
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/feedback/bean/f;

    .line 2435
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 2436
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    if-nez v0, :cond_1

    .line 2437
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 2439
    :cond_1
    goto :goto_0

    .line 2441
    :cond_2
    return v2
.end method

.method static synthetic n(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->m()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Landroid/widget/ListView;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/logupload/a;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l:Lcom/huawei/logupload/a;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)I
    .locals 1

    .line 72
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->n()I

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 6

    .line 1538
    const-string v0, "feedbackRecord_draft"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 1540
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1541
    const/4 v4, 0x0

    .line 1542
    new-instance v5, Landroid/text/SpannableString;

    invoke-direct {v5, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1543
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 1545
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "emui_functional_blue"

    invoke-static {p0, v2}, Lcom/huawei/feedback/f;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 1547
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x0

    .line 1543
    const/16 v2, 0x22

    invoke-virtual {v5, v0, v4, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1550
    return-object v5
.end method

.method public b()V
    .locals 0

    .line 498
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i()V

    .line 499
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .line 784
    const-string v0, "resultCode"

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 786
    const/16 v0, 0x65

    if-ne p2, v0, :cond_1

    if-eqz p3, :cond_1

    .line 788
    const-string v0, "deleted_id"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 791
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->s:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    if-eqz v0, :cond_0

    .line 792
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->s:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    invoke-virtual {v0, v2}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->a(Ljava/lang/String;)V

    .line 796
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 799
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->m()V

    .line 800
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 805
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Z)V

    .line 812
    :cond_1
    const/16 v0, 0x66

    if-ne p2, v0, :cond_2

    if-eqz p3, :cond_2

    .line 814
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->h()V

    .line 817
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->s:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    if-eqz v0, :cond_2

    .line 818
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->s:Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->notifyDataSetChanged()V

    .line 822
    :cond_2
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 2326
    invoke-super {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2330
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->h:Landroid/widget/LinearLayout;

    .line 2331
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 2332
    :cond_0
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->m()V

    .line 2335
    :cond_1
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 2363
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const-string v1, "item_longclick_delete"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 2365
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l()V

    .line 2367
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 231
    invoke-super {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 233
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 234
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/FeedbackApi;->setApplicationcontext(Landroid/content/Context;)V

    .line 238
    :cond_0
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->e()V

    .line 240
    const-string v0, "feedback_result"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->setContentView(I)V

    .line 242
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/a;->a(Landroid/app/Activity;)I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->A:I

    .line 244
    const-string v0, "button_bottom"

    .line 245
    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 244
    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->y:Landroid/widget/RelativeLayout;

    .line 246
    const-string v0, "layout_delete"

    .line 247
    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 246
    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->z:Landroid/widget/RelativeLayout;

    .line 249
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->y:Landroid/widget/RelativeLayout;

    invoke-static {p0, v0}, Lcom/huawei/phoneserviceuni/common/e/a;->a(Landroid/content/Context;Landroid/view/View;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->y:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    .line 252
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->y:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/feedback/ui/ag;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/ag;-><init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 260
    :cond_1
    const-string v0, "feedback_No_result_prompt"

    .line 261
    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 260
    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->g:Landroid/widget/LinearLayout;

    .line 262
    const-string v0, "feedback_No_result_prompt_land"

    .line 263
    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 262
    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->h:Landroid/widget/LinearLayout;

    .line 266
    const-string v0, "feedback_list"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    .line 269
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i:Landroid/widget/ListView;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->registerForContextMenu(Landroid/view/View;)V

    .line 272
    invoke-static {}, Lcom/huawei/feedback/component/ProgressService;->b()Lcom/huawei/logupload/a;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l:Lcom/huawei/logupload/a;

    .line 273
    const-string v0, "feedback_loading"

    .line 274
    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 273
    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->w:Landroid/widget/RelativeLayout;

    .line 275
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 276
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->c(Ljava/lang/String;)V

    .line 277
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "packagename"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->x:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 279
    :cond_2
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "getPackageName() null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    :goto_0
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/a;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 282
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->w:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 283
    new-instance v4, Lcom/huawei/feedback/logic/n;

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->C:Landroid/os/Handler;

    invoke-direct {v4, p0, v0}, Lcom/huawei/feedback/logic/n;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 286
    new-instance v5, Ljava/lang/Thread;

    invoke-direct {v5, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 287
    invoke-virtual {v5}, Ljava/lang/Thread;->start()V

    .line 288
    goto :goto_1

    .line 290
    :cond_3
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->C:Landroid/os/Handler;

    const/16 v1, 0x7d7

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 293
    :goto_1
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->d()V

    .line 294
    const-string v0, "feedback_record_rootview"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->B:Lcom/huawei/feedback/ui/CustomActionBar;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->a(ILcom/huawei/feedback/ui/CustomActionBar;)V

    .line 298
    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 2

    .line 2355
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/feedback/ui/BaseActivity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 2356
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const-string v1, "feedback_record_itemlongclick"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->h(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 2359
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    .line 463
    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 2

    .line 422
    invoke-super {p0}, Lcom/huawei/feedback/ui/BaseActivity;->onDestroy()V

    .line 424
    iget-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->v:Z

    if-eqz v0, :cond_0

    .line 425
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->n:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 426
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->o:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 427
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->p:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 428
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->q:Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressPauseReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 432
    invoke-static {p0}, Landroid/a/a/b/a;->a(Landroid/content/Context;)Landroid/a/a/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->t:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/a/a/b/a;->a(Landroid/content/BroadcastReceiver;)V

    .line 435
    :cond_0
    return-void
.end method

.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)Z"
        }
    .end annotation

    .line 2311
    iput p3, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->E:I

    .line 2313
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->j:Ljava/util/List;

    iget v1, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->E:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/feedback/bean/f;

    .line 2314
    invoke-virtual {v2}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 2315
    invoke-virtual {v2}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    if-nez v0, :cond_1

    .line 2316
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 2320
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 487
    const/16 v0, 0x52

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 488
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 490
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b()V

    .line 492
    const/4 v0, 0x1

    return v0

    .line 494
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/feedback/ui/BaseActivity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 469
    const-string v0, "menu_more"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 471
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b()V

    .line 473
    const/4 v0, 0x1

    return v0

    .line 474
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v1, v0, :cond_1

    .line 475
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->finish()V

    .line 476
    const/4 v0, 0x1

    return v0

    .line 478
    :cond_1
    invoke-super {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method protected onPause()V
    .locals 1

    .line 1556
    invoke-super {p0}, Lcom/huawei/feedback/ui/BaseActivity;->onPause()V

    .line 1557
    const-string v0, "onPause"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 1558
    const-string v0, "onReport"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 1559
    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 1564
    invoke-super {p0}, Lcom/huawei/feedback/ui/BaseActivity;->onResume()V

    .line 1565
    const-string v0, "onResume"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 1566
    return-void
.end method
