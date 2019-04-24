.class public Lo/esa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Landroid/os/Handler;

.field private e:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Lo/esa$3;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/esa$3;-><init>(Lo/esa;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/esa;->b:Landroid/os/Handler;

    .line 170
    new-instance v0, Lo/esa$5;

    invoke-direct {v0, p0}, Lo/esa$5;-><init>(Lo/esa;)V

    iput-object v0, p0, Lo/esa;->e:Landroid/content/BroadcastReceiver;

    .line 82
    return-void
.end method

.method static synthetic a(Lo/esa;I)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/esa;->b(I)V

    return-void
.end method

.method private b(I)V
    .locals 5

    .line 232
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 233
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "RUNCOURSE_REQUEST_KEY"

    .line 235
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 232
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 237
    return-void
.end method

.method private c(I)V
    .locals 3

    .line 107
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->getAdapter()Lo/eab;

    move-result-object v0

    if-nez v0, :cond_0

    .line 108
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/cwi;->a(Landroid/content/Context;)Lo/cwi;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brt;->setAdapter(Lo/eab;)V

    .line 109
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brt;->init(Landroid/content/Context;)V

    .line 113
    :cond_0
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    new-instance v1, Lo/esa$1;

    invoke-direct {v1, p0, p1}, Lo/esa$1;-><init>(Lo/esa;I)V

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lo/bsp;->c(ILo/bui;)V

    .line 155
    return-void
.end method

.method public static d()I
    .locals 6

    .line 214
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 215
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "RUNCOURSE_REQUEST_KEY"

    .line 214
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 218
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    const/4 v0, 0x0

    return v0

    .line 223
    :cond_0
    :try_start_0
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 224
    :catch_0
    move-exception v5

    .line 225
    const-string v0, "Track_InitRuncourseUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRunCourseState"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lo/esa;I)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/esa;->c(I)V

    return-void
.end method

.method private e(IJ)V
    .locals 3

    .line 160
    iget-object v0, p0, Lo/esa;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 161
    iget-object v0, p0, Lo/esa;->b:Landroid/os/Handler;

    const v1, 0x107e97

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 162
    add-int/lit8 p1, p1, 0x1

    .line 163
    iput p1, v2, Landroid/os/Message;->arg1:I

    .line 164
    iget-object v0, p0, Lo/esa;->b:Landroid/os/Handler;

    invoke-virtual {v0, v2, p2, p3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 167
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/esa;IJ)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3}, Lo/esa;->e(IJ)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 91
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 92
    const-string v0, "com.huawei.plugin.account.login"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 93
    const-string v0, "com.huawei.plugin.account.logout"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 94
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lo/esa;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 96
    return-void
.end method

.method public c()V
    .locals 2

    .line 98
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lo/esa;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 99
    return-void
.end method
