.class public abstract Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field private b:Landroid/content/IntentFilter;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 20
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;->e:Landroid/content/Context;

    .line 23
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;->b:Landroid/content/IntentFilter;

    .line 25
    iget-object v0, p0, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;->b:Landroid/content/IntentFilter;

    const-string v1, "com.huawei.intent.action.CLICK_STATUSBAR"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;->b:Landroid/content/IntentFilter;

    const-string v2, "huawei.permission.CLICK_STATUSBAR_BROADCAST"

    const/4 v3, 0x0

    invoke-virtual {v0, p0, v1, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 28
    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;->e:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 40
    iget-object v0, p0, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;->e:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 42
    :cond_0
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 33
    return-void
.end method
