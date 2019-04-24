.class public final Lcom/huawei/hms/support/api/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/entity/core/DisconnectInfo;)Lcom/huawei/hms/support/api/ResolvePendingResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/entity/core/DisconnectInfo;)Lcom/huawei/hms/support/api/ResolvePendingResult<Lcom/huawei/hms/support/api/entity/core/DisconnectResp;>;"
        }
    .end annotation

    .line 67
    const-string v0, "core.disconnect"

    const-class v1, Lcom/huawei/hms/support/api/entity/core/DisconnectResp;

    invoke-static {p0, v0, p1, v1}, Lcom/huawei/hms/support/api/ResolvePendingResult;->build(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)Lcom/huawei/hms/support/api/ResolvePendingResult;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/entity/core/CheckConnectInfo;)Lcom/huawei/hms/support/api/client/InnerPendingResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/entity/core/CheckConnectInfo;)Lcom/huawei/hms/support/api/client/InnerPendingResult<Lcom/huawei/hms/support/api/ResolveResult<Lcom/huawei/hms/support/api/entity/core/CheckConnectResp;>;>;"
        }
    .end annotation

    .line 78
    const-string v0, "core.checkconnect"

    const-class v1, Lcom/huawei/hms/support/api/entity/core/CheckConnectResp;

    invoke-static {p0, v0, p1, v1}, Lcom/huawei/hms/support/api/ResolvePendingResult;->build(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)Lcom/huawei/hms/support/api/ResolvePendingResult;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/huawei/hms/support/api/client/ApiClient;ILjava/lang/String;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ApiClient;ILjava/lang/String;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/ResolveResult<Lcom/huawei/hms/support/api/entity/core/JosGetNoticeResp;>;>;"
        }
    .end annotation

    .line 90
    new-instance v2, Lcom/huawei/hms/support/api/entity/core/JosGetNoticeReq;

    invoke-direct {v2}, Lcom/huawei/hms/support/api/entity/core/JosGetNoticeReq;-><init>()V

    .line 91
    invoke-virtual {v2, p1}, Lcom/huawei/hms/support/api/entity/core/JosGetNoticeReq;->setNoticeType(I)V

    .line 92
    invoke-virtual {v2, p2}, Lcom/huawei/hms/support/api/entity/core/JosGetNoticeReq;->setHmsSdkVersionName(Ljava/lang/String;)V

    .line 93
    invoke-interface {p0}, Lcom/huawei/hms/support/api/client/ApiClient;->getCpID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 95
    invoke-interface {p0}, Lcom/huawei/hms/support/api/client/ApiClient;->getCpID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hms/support/api/entity/core/JosGetNoticeReq;->setCpID(Ljava/lang/String;)V

    .line 98
    :cond_0
    new-instance v0, Lcom/huawei/hms/support/api/a/c;

    const-string v1, "core.getNoticeIntent"

    invoke-direct {v0, p0, v1, v2}, Lcom/huawei/hms/support/api/a/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method

.method public static a(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/entity/core/ConnectInfo;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ApiClient;Lcom/huawei/hms/support/api/entity/core/ConnectInfo;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/ResolveResult<Lcom/huawei/hms/support/api/entity/core/ConnectResp;>;>;"
        }
    .end annotation

    .line 44
    new-instance v0, Lcom/huawei/hms/support/api/a/b;

    const-string v1, "core.connect"

    invoke-direct {v0, p0, v1, p1}, Lcom/huawei/hms/support/api/a/b;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method
