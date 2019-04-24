.class public Lcom/huawei/hidatamanager/DataListenerService$DataListenerWrapper;
.super Lcom/huawei/hidatamanager/IDataDispatchInterface$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hidatamanager/DataListenerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "DataListenerWrapper"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hidatamanager/DataListenerService;


# direct methods
.method protected constructor <init>(Lcom/huawei/hidatamanager/DataListenerService;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/hidatamanager/DataListenerService$DataListenerWrapper;->this$0:Lcom/huawei/hidatamanager/DataListenerService;

    invoke-direct {p0}, Lcom/huawei/hidatamanager/IDataDispatchInterface$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public onFeatureDataAdded(JJLjava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/huawei/hidatamanager/DataListenerService$DataListenerWrapper;->this$0:Lcom/huawei/hidatamanager/DataListenerService;

    invoke-static {v0}, Lcom/huawei/hidatamanager/DataListenerService;->access$000(Lcom/huawei/hidatamanager/DataListenerService;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 58
    :try_start_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 59
    const/4 v0, 0x1

    iput v0, v2, Landroid/os/Message;->what:I

    .line 60
    iput-object p5, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 61
    iget-object v0, p0, Lcom/huawei/hidatamanager/DataListenerService$DataListenerWrapper;->this$0:Lcom/huawei/hidatamanager/DataListenerService;

    invoke-static {v0}, Lcom/huawei/hidatamanager/DataListenerService;->access$100(Lcom/huawei/hidatamanager/DataListenerService;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    .line 63
    :goto_0
    return-void
.end method
