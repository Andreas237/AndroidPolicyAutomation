.class public Lcom/huawei/health/STTimeoutActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private final b:Landroid/content/BroadcastReceiver;

.field private c:Landroid/support/v4/content/LocalBroadcastManager;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->a:Landroid/content/Context;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->c:Landroid/support/v4/content/LocalBroadcastManager;

    .line 89
    new-instance v0, Lcom/huawei/health/STTimeoutActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/STTimeoutActivity$3;-><init>(Lcom/huawei/health/STTimeoutActivity;)V

    iput-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->b:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private a()V
    .locals 5

    .line 60
    const-string v0, "Login_STTimeoutActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerWaitDialogBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 62
    const-string v0, "hwid_finish"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->c:Landroid/support/v4/content/LocalBroadcastManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->c:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/health/STTimeoutActivity;->b:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 66
    :cond_0
    return-void
.end method

.method private b()V
    .locals 8

    .line 97
    const-string v0, "Login_STTimeoutActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initConfirmDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->a:Landroid/content/Context;

    const v1, 0x7f020075

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    .line 100
    new-instance v6, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->a:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->a:Landroid/content/Context;

    const v1, 0x7f0200d0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    .line 102
    iget-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->a:Landroid/content/Context;

    const v1, 0x7f020409

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 103
    invoke-virtual {v6, v7}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 104
    new-instance v0, Lcom/huawei/health/STTimeoutActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/STTimeoutActivity$5;-><init>(Lcom/huawei/health/STTimeoutActivity;)V

    invoke-virtual {v6, v4, v0}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/STTimeoutActivity;->a:Landroid/content/Context;

    .line 112
    const v2, 0x7f02007c

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/STTimeoutActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/STTimeoutActivity$2;-><init>(Lcom/huawei/health/STTimeoutActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 119
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 120
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egv;->setCancelable(Z)V

    .line 121
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 122
    return-void
.end method

.method private c()V
    .locals 5

    .line 72
    const-string v0, "Login_STTimeoutActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterWaitDialogBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->c:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/health/STTimeoutActivity;->b:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 79
    goto :goto_0

    .line 75
    :catch_0
    move-exception v4

    .line 76
    const-string v0, "Login_STTimeoutActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    goto :goto_0

    .line 77
    :catch_1
    move-exception v4

    .line 78
    const-string v0, "Login_STTimeoutActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/STTimeoutActivity;)Landroid/content/Context;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->a:Landroid/content/Context;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 54
    const-string v0, "Login_STTimeoutActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    invoke-direct {p0}, Lcom/huawei/health/STTimeoutActivity;->b()V

    .line 56
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 39
    const-string v0, "Login_STTimeoutActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 41
    invoke-virtual {p0}, Lcom/huawei/health/STTimeoutActivity;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 42
    const/16 v0, 0x50

    invoke-virtual {v4, v0}, Landroid/view/Window;->setGravity(I)V

    .line 43
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 44
    const/4 v0, -0x1

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 45
    const/4 v0, -0x2

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 46
    invoke-virtual {p0, v5}, Lcom/huawei/health/STTimeoutActivity;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 47
    iput-object p0, p0, Lcom/huawei/health/STTimeoutActivity;->a:Landroid/content/Context;

    .line 48
    iget-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/STTimeoutActivity;->c:Landroid/support/v4/content/LocalBroadcastManager;

    .line 49
    invoke-direct {p0}, Lcom/huawei/health/STTimeoutActivity;->a()V

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/STTimeoutActivity;->d()V

    .line 51
    return-void
.end method

.method protected onDestroy()V
    .locals 4

    .line 84
    const-string v0, "Login_STTimeoutActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 86
    invoke-direct {p0}, Lcom/huawei/health/STTimeoutActivity;->c()V

    .line 87
    return-void
.end method

.method protected onResume()V
    .locals 4

    .line 126
    const-string v0, "Login_STTimeoutActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 128
    return-void
.end method
