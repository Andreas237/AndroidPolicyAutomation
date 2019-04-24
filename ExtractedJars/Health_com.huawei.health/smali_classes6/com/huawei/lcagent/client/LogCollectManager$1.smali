.class Lcom/huawei/lcagent/client/LogCollectManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/lcagent/client/LogCollectManager;


# direct methods
.method constructor <init>(Lcom/huawei/lcagent/client/LogCollectManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/lcagent/client/LogCollectManager$1;->this$0:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 326
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 329
    const-string v0, "LogCollectManager"

    const-string v1, "service is connected"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 330
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager$1;->this$0:Lcom/huawei/lcagent/client/LogCollectManager;

    invoke-static {p2}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->asInterface(Landroid/os/IBinder;)Lcom/huawei/lcagent/client/ILogCollect;

    move-result-object v1

    iput-object v1, v0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    .line 332
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager$1;->this$0:Lcom/huawei/lcagent/client/LogCollectManager;

    invoke-static {v0}, Lcom/huawei/lcagent/client/LogCollectManager;->access$0(Lcom/huawei/lcagent/client/LogCollectManager;)Lcom/huawei/lcagent/client/LogCollectManager$CallBack;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 333
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager$1;->this$0:Lcom/huawei/lcagent/client/LogCollectManager;

    invoke-static {v0}, Lcom/huawei/lcagent/client/LogCollectManager;->access$0(Lcom/huawei/lcagent/client/LogCollectManager;)Lcom/huawei/lcagent/client/LogCollectManager$CallBack;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/lcagent/client/LogCollectManager$CallBack;->serviceConnected()V

    .line 336
    :cond_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 340
    const-string v0, "LogCollectManager"

    const-string v1, "service is disconnceted"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 341
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager$1;->this$0:Lcom/huawei/lcagent/client/LogCollectManager;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    .line 342
    return-void
.end method
