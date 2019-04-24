.class public Lcom/huawei/hms/api/IPCCallback;
.super Lcom/huawei/hms/core/aidl/d$a;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<+Lcom/huawei/hms/core/aidl/IMessageEntity;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/huawei/hms/support/api/transport/DatagramTransport$a;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lcom/huawei/hms/support/api/transport/DatagramTransport$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/huawei/hms/core/aidl/IMessageEntity;>;Lcom/huawei/hms/support/api/transport/DatagramTransport$a;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Lcom/huawei/hms/core/aidl/d$a;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/huawei/hms/api/IPCCallback;->a:Ljava/lang/Class;

    .line 44
    iput-object p2, p0, Lcom/huawei/hms/api/IPCCallback;->b:Lcom/huawei/hms/support/api/transport/DatagramTransport$a;

    .line 45
    return-void
.end method


# virtual methods
.method public call(Lcom/huawei/hms/core/aidl/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 52
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/huawei/hms/core/aidl/b;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    :cond_0
    const-string v0, "IPCCallback"

    const-string v1, "In call, URI cannot be empty."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    .line 57
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hms/core/aidl/b;->c()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/hms/core/aidl/a;->a(I)Lcom/huawei/hms/core/aidl/f;

    move-result-object v2

    .line 58
    new-instance v3, Lcom/huawei/hms/core/aidl/ResponseHeader;

    invoke-direct {v3}, Lcom/huawei/hms/core/aidl/ResponseHeader;-><init>()V

    .line 59
    iget-object v0, p1, Lcom/huawei/hms/core/aidl/b;->b:Landroid/os/Bundle;

    invoke-virtual {v2, v0, v3}, Lcom/huawei/hms/core/aidl/f;->a(Landroid/os/Bundle;Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/core/aidl/IMessageEntity;

    .line 61
    const/4 v4, 0x0

    .line 62
    invoke-virtual {p1}, Lcom/huawei/hms/core/aidl/b;->b()I

    move-result v0

    if-lez v0, :cond_2

    .line 63
    invoke-virtual {p0}, Lcom/huawei/hms/api/IPCCallback;->newResponseInstance()Lcom/huawei/hms/core/aidl/IMessageEntity;

    move-result-object v4

    .line 65
    if-eqz v4, :cond_2

    .line 66
    invoke-virtual {p1}, Lcom/huawei/hms/core/aidl/b;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v2, v0, v4}, Lcom/huawei/hms/core/aidl/f;->a(Landroid/os/Bundle;Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/core/aidl/IMessageEntity;

    .line 70
    :cond_2
    iget-object v0, p0, Lcom/huawei/hms/api/IPCCallback;->b:Lcom/huawei/hms/support/api/transport/DatagramTransport$a;

    invoke-virtual {v3}, Lcom/huawei/hms/core/aidl/ResponseHeader;->getStatusCode()I

    move-result v1

    invoke-interface {v0, v1, v4}, Lcom/huawei/hms/support/api/transport/DatagramTransport$a;->a(ILcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 71
    return-void
.end method

.method protected newResponseInstance()Lcom/huawei/hms/core/aidl/IMessageEntity;
    .locals 4

    .line 79
    iget-object v0, p0, Lcom/huawei/hms/api/IPCCallback;->a:Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 81
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/api/IPCCallback;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/core/aidl/IMessageEntity;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 82
    :catch_0
    move-exception v3

    .line 83
    const-string v0, "IPCCallback"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "In newResponseInstance, instancing exception."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/ReflectiveOperationException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
