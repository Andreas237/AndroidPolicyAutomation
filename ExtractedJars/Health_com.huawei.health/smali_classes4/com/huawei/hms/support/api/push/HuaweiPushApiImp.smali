.class public Lcom/huawei/hms/support/api/push/HuaweiPushApiImp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/support/api/push/HuaweiPushApi;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public deleteTags(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/util/List;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/util/List<Ljava/lang/String;>;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/push/HandleTagsResult;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hms/support/api/push/PushException;
        }
    .end annotation

    .line 130
    new-instance v0, Lcom/huawei/hms/support/api/push/b;

    invoke-direct {v0}, Lcom/huawei/hms/support/api/push/b;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/huawei/hms/support/api/push/b;->a(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/util/List;)Lcom/huawei/hms/support/api/client/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public deleteToken(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hms/support/api/push/PushException;
        }
    .end annotation

    .line 75
    invoke-interface {p1}, Lcom/huawei/hms/support/api/client/ApiClient;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 76
    const-string v0, "HuaweiPushApiImp"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invoke method: deleteToken, pkgName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    const-string v0, "HuaweiPushApiImp"

    const-string v1, "token is null, can not deregister token"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    new-instance v0, Lcom/huawei/hms/support/api/push/PushException;

    const-string v1, "push token invalid"

    invoke-direct {v0, v1}, Lcom/huawei/hms/support/api/push/PushException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 85
    :cond_0
    const-string v0, "push_client_self_info"

    const-string v1, "token_info"

    :try_start_0
    invoke-static {v3, v0, v1}, Lcom/huawei/hms/support/api/push/b/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 88
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    const-string v0, "push_client_self_info"

    const-string v1, "token_info"

    invoke-static {v3, v0, v1}, Lcom/huawei/hms/support/api/push/b/a/b;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :cond_1
    new-instance v5, Lcom/huawei/hms/support/api/entity/push/DeleteTokenReq;

    invoke-direct {v5}, Lcom/huawei/hms/support/api/entity/push/DeleteTokenReq;-><init>()V

    .line 94
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hms/support/api/entity/push/DeleteTokenReq;->setPkgName(Ljava/lang/String;)V

    .line 95
    invoke-virtual {v5, p2}, Lcom/huawei/hms/support/api/entity/push/DeleteTokenReq;->setToken(Ljava/lang/String;)V

    .line 97
    const-string v0, "push.deletetoken"

    const-class v1, Lcom/huawei/hms/support/api/entity/push/DeleteTokenResp;

    invoke-static {p1, v0, v5, v1}, Lcom/huawei/hms/support/api/ResolvePendingResult;->build(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)Lcom/huawei/hms/support/api/ResolvePendingResult;

    move-result-object v6

    .line 100
    invoke-virtual {v6}, Lcom/huawei/hms/support/api/ResolvePendingResult;->get()Lcom/huawei/hms/core/aidl/IMessageEntity;

    .line 101
    const-string v0, "push.deletetoken"

    invoke-static {p1, v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->a(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    goto :goto_0

    .line 102
    :catch_0
    move-exception v4

    .line 103
    const-string v0, "HuaweiPushApiImp"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "delete token failed, e="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    new-instance v0, Lcom/huawei/hms/support/api/push/PushException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "delete token failed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hms/support/api/push/PushException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :goto_0
    return-void
.end method

.method public enableReceiveNormalMsg(Lcom/huawei/hms/support/api/client/ApiClient;Z)V
    .locals 5

    .line 163
    const-string v0, "HuaweiPushApiImp"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invoke enableReceiveNormalMsg, set flag:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    invoke-interface {p1}, Lcom/huawei/hms/support/api/client/ApiClient;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 166
    new-instance v4, Lcom/huawei/hms/support/api/push/b/a/a/c;

    const-string v0, "push_switch"

    invoke-direct {v4, v3, v0}, Lcom/huawei/hms/support/api/push/b/a/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 168
    const-string v0, "normal_msg_enable"

    if-nez p2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v4, v0, v1}, Lcom/huawei/hms/support/api/push/b/a/a/c;->a(Ljava/lang/String;Z)V

    .line 169
    const-string v0, "push.enableReceiveNormalMsg"

    invoke-static {p1, v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->a(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;)V

    .line 170
    return-void
.end method

.method public enableReceiveNotifyMsg(Lcom/huawei/hms/support/api/client/ApiClient;Z)V
    .locals 5

    .line 183
    const-string v0, "HuaweiPushApiImp"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invoke enableReceiveNotifyMsg, set flag:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    new-instance v3, Lcom/huawei/hms/support/api/entity/push/EnableNotifyReq;

    invoke-direct {v3}, Lcom/huawei/hms/support/api/entity/push/EnableNotifyReq;-><init>()V

    .line 186
    invoke-interface {p1}, Lcom/huawei/hms/support/api/client/ApiClient;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hms/support/api/entity/push/EnableNotifyReq;->setPackageName(Ljava/lang/String;)V

    .line 187
    invoke-virtual {v3, p2}, Lcom/huawei/hms/support/api/entity/push/EnableNotifyReq;->setEnable(Z)V

    .line 189
    const-string v0, "push.setNotifyFlag"

    const-class v1, Lcom/huawei/hms/support/api/entity/push/EnableNotifyResp;

    invoke-static {p1, v0, v3, v1}, Lcom/huawei/hms/support/api/ResolvePendingResult;->build(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)Lcom/huawei/hms/support/api/ResolvePendingResult;

    move-result-object v4

    .line 192
    invoke-virtual {v4}, Lcom/huawei/hms/support/api/ResolvePendingResult;->get()Lcom/huawei/hms/core/aidl/IMessageEntity;

    .line 193
    return-void
.end method

.method public getPushState(Lcom/huawei/hms/support/api/client/ApiClient;)Z
    .locals 4

    .line 142
    new-instance v2, Lcom/huawei/hms/support/api/entity/push/PushStateReq;

    invoke-direct {v2}, Lcom/huawei/hms/support/api/entity/push/PushStateReq;-><init>()V

    .line 143
    invoke-interface {p1}, Lcom/huawei/hms/support/api/client/ApiClient;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hms/support/api/entity/push/PushStateReq;->setPkgName(Ljava/lang/String;)V

    .line 145
    const-string v0, "push.getpushstate"

    const-class v1, Lcom/huawei/hms/support/api/entity/push/PushStateResp;

    invoke-static {p1, v0, v2, v1}, Lcom/huawei/hms/support/api/ResolvePendingResult;->build(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)Lcom/huawei/hms/support/api/ResolvePendingResult;

    move-result-object v3

    .line 148
    invoke-virtual {v3}, Lcom/huawei/hms/support/api/ResolvePendingResult;->get()Lcom/huawei/hms/core/aidl/IMessageEntity;

    .line 149
    const-string v0, "push.getpushstate"

    invoke-static {p1, v0}, Lcom/huawei/hms/support/api/push/b/a/a/a;->a(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;)V

    .line 150
    const/4 v0, 0x1

    return v0
.end method

.method public getTags(Lcom/huawei/hms/support/api/client/ApiClient;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ApiClient;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/push/GetTagResult;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hms/support/api/push/PushException;
        }
    .end annotation

    .line 122
    new-instance v0, Lcom/huawei/hms/support/api/push/b;

    invoke-direct {v0}, Lcom/huawei/hms/support/api/push/b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/huawei/hms/support/api/push/b;->a(Lcom/huawei/hms/support/api/client/ApiClient;)Lcom/huawei/hms/support/api/client/PendingResult;

    move-result-object v0

    return-object v0
.end method

.method public getToken(Lcom/huawei/hms/support/api/client/ApiClient;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ApiClient;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/push/TokenResult;>;"
        }
    .end annotation

    .line 53
    invoke-interface {p1}, Lcom/huawei/hms/support/api/client/ApiClient;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 54
    const-string v0, "HuaweiPushApiImp"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get token, pkgName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    new-instance v4, Lcom/huawei/hms/support/api/push/b/a/a/c;

    const-string v0, "push_client_self_info"

    invoke-direct {v4, v3, v0}, Lcom/huawei/hms/support/api/push/b/a/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 57
    new-instance v5, Lcom/huawei/hms/support/api/entity/push/TokenReq;

    invoke-direct {v5}, Lcom/huawei/hms/support/api/entity/push/TokenReq;-><init>()V

    .line 58
    invoke-interface {p1}, Lcom/huawei/hms/support/api/client/ApiClient;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hms/support/api/entity/push/TokenReq;->setPackageName(Ljava/lang/String;)V

    .line 61
    const-string v0, "hasRequestAgreement"

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/push/b/a/a/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hms/support/api/entity/push/TokenReq;->setFirstTime(Z)V

    .line 63
    const-string v0, "hasRequestAgreement"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hms/support/api/push/b/a/a/c;->a(Ljava/lang/String;Z)V

    goto :goto_0

    .line 65
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hms/support/api/entity/push/TokenReq;->setFirstTime(Z)V

    .line 67
    :goto_0
    new-instance v0, Lcom/huawei/hms/support/api/push/GetTokenPendingResultImpl;

    const-string v1, "push.gettoken"

    invoke-direct {v0, p1, v1, v5}, Lcom/huawei/hms/support/api/push/GetTokenPendingResultImpl;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method

.method public queryAgreement(Lcom/huawei/hms/support/api/client/ApiClient;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hms/support/api/push/PushException;
        }
    .end annotation

    .line 200
    const-string v0, "HuaweiPushApiImp"

    const-string v1, "invoke queryAgreement"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    invoke-interface {p1}, Lcom/huawei/hms/support/api/client/ApiClient;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 203
    new-instance v3, Lcom/huawei/hms/support/api/entity/push/AgreementReq;

    invoke-direct {v3}, Lcom/huawei/hms/support/api/entity/push/AgreementReq;-><init>()V

    .line 205
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hms/support/api/entity/push/AgreementReq;->setPkgName(Ljava/lang/String;)V

    .line 207
    const-string v0, "push_client_self_info"

    const-string v1, "token_info"

    invoke-static {v2, v0, v1}, Lcom/huawei/hms/support/api/push/b/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 211
    new-instance v5, Lcom/huawei/hms/support/api/push/b/a/a/c;

    const-string v0, "push_client_self_info"

    invoke-direct {v5, v2, v0}, Lcom/huawei/hms/support/api/push/b/a/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 212
    const-string v0, "hasRequestAgreement"

    invoke-virtual {v5, v0}, Lcom/huawei/hms/support/api/push/b/a/a/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 213
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/hms/support/api/entity/push/AgreementReq;->setFirstTime(Z)V

    goto :goto_0

    .line 215
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/hms/support/api/entity/push/AgreementReq;->setFirstTime(Z)V

    .line 218
    :goto_0
    invoke-virtual {v3, v4}, Lcom/huawei/hms/support/api/entity/push/AgreementReq;->setToken(Ljava/lang/String;)V

    .line 220
    const-string v0, "push.handleAgreement"

    const-class v1, Lcom/huawei/hms/support/api/entity/push/AgreementResp;

    invoke-static {p1, v0, v3, v1}, Lcom/huawei/hms/support/api/ResolvePendingResult;->build(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)Lcom/huawei/hms/support/api/ResolvePendingResult;

    move-result-object v6

    .line 223
    invoke-virtual {v6}, Lcom/huawei/hms/support/api/ResolvePendingResult;->get()Lcom/huawei/hms/core/aidl/IMessageEntity;

    .line 224
    return-void
.end method

.method public setTags(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/util/Map;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/push/HandleTagsResult;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hms/support/api/push/PushException;
        }
    .end annotation

    .line 114
    new-instance v0, Lcom/huawei/hms/support/api/push/b;

    invoke-direct {v0}, Lcom/huawei/hms/support/api/push/b;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/huawei/hms/support/api/push/b;->a(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/util/Map;)Lcom/huawei/hms/support/api/client/PendingResult;

    move-result-object v0

    return-object v0
.end method
