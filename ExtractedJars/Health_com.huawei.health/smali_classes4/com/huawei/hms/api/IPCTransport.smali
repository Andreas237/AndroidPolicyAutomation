.class public Lcom/huawei/hms/api/IPCTransport;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/support/api/transport/DatagramTransport;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/huawei/hms/core/aidl/IMessageEntity;

.field private final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<+Lcom/huawei/hms/core/aidl/IMessageEntity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class<+Lcom/huawei/hms/core/aidl/IMessageEntity;>;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/huawei/hms/api/IPCTransport;->a:Ljava/lang/String;

    .line 37
    iput-object p2, p0, Lcom/huawei/hms/api/IPCTransport;->b:Lcom/huawei/hms/core/aidl/IMessageEntity;

    .line 38
    iput-object p3, p0, Lcom/huawei/hms/api/IPCTransport;->c:Ljava/lang/Class;

    .line 39
    return-void
.end method

.method private a(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/core/aidl/d;)I
    .locals 8

    .line 70
    new-instance v3, Lcom/huawei/hms/core/aidl/b;

    iget-object v0, p0, Lcom/huawei/hms/api/IPCTransport;->a:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/hms/api/ProtocolNegotiate;->getInstance()Lcom/huawei/hms/api/ProtocolNegotiate;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/api/ProtocolNegotiate;->getVersion()I

    move-result v1

    invoke-direct {v3, v0, v1}, Lcom/huawei/hms/core/aidl/b;-><init>(Ljava/lang/String;I)V

    .line 72
    invoke-virtual {v3}, Lcom/huawei/hms/core/aidl/b;->c()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/hms/core/aidl/a;->a(I)Lcom/huawei/hms/core/aidl/f;

    move-result-object v4

    .line 73
    iget-object v0, p0, Lcom/huawei/hms/api/IPCTransport;->b:Lcom/huawei/hms/core/aidl/IMessageEntity;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hms/core/aidl/f;->a(Lcom/huawei/hms/core/aidl/IMessageEntity;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v5

    .line 75
    invoke-virtual {v3, v5}, Lcom/huawei/hms/core/aidl/b;->a(Landroid/os/Bundle;)Lcom/huawei/hms/core/aidl/b;

    .line 77
    new-instance v6, Lcom/huawei/hms/core/aidl/RequestHeader;

    invoke-direct {v6}, Lcom/huawei/hms/core/aidl/RequestHeader;-><init>()V

    .line 78
    invoke-interface {p1}, Lcom/huawei/hms/support/api/client/ApiClient;->getAppID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hms/core/aidl/RequestHeader;->setAppID(Ljava/lang/String;)V

    .line 79
    invoke-interface {p1}, Lcom/huawei/hms/support/api/client/ApiClient;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hms/core/aidl/RequestHeader;->setPackageName(Ljava/lang/String;)V

    .line 80
    const v0, 0x13a59d4

    invoke-virtual {v6, v0}, Lcom/huawei/hms/core/aidl/RequestHeader;->setSdkVersion(I)V

    .line 81
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getApiNameList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hms/core/aidl/RequestHeader;->setApiNameList(Ljava/util/List;)V

    .line 83
    instance-of v0, p1, Lcom/huawei/hms/api/HuaweiApiClientImpl;

    if-eqz v0, :cond_0

    .line 84
    invoke-interface {p1}, Lcom/huawei/hms/support/api/client/ApiClient;->getSessionId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hms/core/aidl/RequestHeader;->setSessionId(Ljava/lang/String;)V

    .line 87
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v4, v6, v0}, Lcom/huawei/hms/core/aidl/f;->a(Lcom/huawei/hms/core/aidl/IMessageEntity;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, v3, Lcom/huawei/hms/core/aidl/b;->b:Landroid/os/Bundle;

    .line 90
    move-object v0, p1

    :try_start_0
    check-cast v0, Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getService()Lcom/huawei/hms/core/aidl/e;

    move-result-object v0

    invoke-interface {v0, v3, p2}, Lcom/huawei/hms/core/aidl/e;->a(Lcom/huawei/hms/core/aidl/b;Lcom/huawei/hms/core/aidl/d;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    const/4 v0, 0x0

    return v0

    .line 92
    :catch_0
    move-exception v7

    .line 93
    const-string v0, "transport"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sync call ex:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const v0, 0x3611c819

    return v0
.end method


# virtual methods
.method public final post(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/transport/DatagramTransport$a;)V
    .locals 0

    .line 59
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hms/api/IPCTransport;->send(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/transport/DatagramTransport$a;)V

    .line 60
    return-void
.end method

.method public final send(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/transport/DatagramTransport$a;)V
    .locals 3

    .line 47
    new-instance v0, Lcom/huawei/hms/api/IPCCallback;

    iget-object v1, p0, Lcom/huawei/hms/api/IPCTransport;->c:Ljava/lang/Class;

    invoke-direct {v0, v1, p2}, Lcom/huawei/hms/api/IPCCallback;-><init>(Ljava/lang/Class;Lcom/huawei/hms/support/api/transport/DatagramTransport$a;)V

    invoke-direct {p0, p1, v0}, Lcom/huawei/hms/api/IPCTransport;->a(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/core/aidl/d;)I

    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    const/4 v0, 0x0

    invoke-interface {p2, v2, v0}, Lcom/huawei/hms/support/api/transport/DatagramTransport$a;->a(ILcom/huawei/hms/core/aidl/IMessageEntity;)V

    .line 52
    :cond_0
    return-void
.end method
