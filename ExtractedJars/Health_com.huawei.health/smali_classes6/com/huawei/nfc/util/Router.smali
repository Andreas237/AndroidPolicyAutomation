.class public Lcom/huawei/nfc/util/Router;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;
    .locals 5

    .line 41
    new-instance v0, Lcom/huawei/wallet/commonbase/router/RouterRequest;

    invoke-direct {v0, p0}, Lcom/huawei/wallet/commonbase/router/RouterRequest;-><init>(Landroid/content/Context;)V

    const-string v1, "com.huawei.wallet.nfc"

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->b(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;

    move-result-object v0

    const-string v1, "CardAndIssuerInfoCacheProvider"

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->a(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;

    move-result-object v0

    const-string v1, "CardAndIssuerInfoCacheCreateAction"

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->e(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;

    move-result-object v2

    .line 42
    invoke-static {}, Lcom/huawei/wallet/commonbase/router/LocalRouter;->b()Lcom/huawei/wallet/commonbase/router/LocalRouter;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/huawei/wallet/commonbase/router/LocalRouter;->e(Lcom/huawei/wallet/commonbase/router/RouterRequest;Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;)Lcom/huawei/wallet/commonbase/router/RouterResponse;

    move-result-object v3

    .line 43
    const-string v0, "CardAndIssuerInfoCache"

    invoke-virtual {v3, v0}, Lcom/huawei/wallet/commonbase/router/RouterResponse;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    .line 44
    return-object v4
.end method

.method public static getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;
    .locals 5

    .line 25
    new-instance v0, Lcom/huawei/wallet/commonbase/router/RouterRequest;

    invoke-direct {v0, p0}, Lcom/huawei/wallet/commonbase/router/RouterRequest;-><init>(Landroid/content/Context;)V

    const-string v1, "com.huawei.wallet.nfc"

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->b(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;

    move-result-object v0

    const-string v1, "CardInfoManagerProvider"

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->a(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;

    move-result-object v0

    const-string v1, "CardInfoManagerCreateAction"

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->e(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;

    move-result-object v2

    .line 26
    invoke-static {}, Lcom/huawei/wallet/commonbase/router/LocalRouter;->b()Lcom/huawei/wallet/commonbase/router/LocalRouter;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/huawei/wallet/commonbase/router/LocalRouter;->e(Lcom/huawei/wallet/commonbase/router/RouterRequest;Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;)Lcom/huawei/wallet/commonbase/router/RouterResponse;

    move-result-object v3

    .line 27
    const-string v0, "CardInfoManager"

    invoke-virtual {v3, v0}, Lcom/huawei/wallet/commonbase/router/RouterResponse;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    .line 28
    return-object v4
.end method

.method public static getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;
    .locals 5

    .line 17
    new-instance v0, Lcom/huawei/wallet/commonbase/router/RouterRequest;

    invoke-direct {v0, p0}, Lcom/huawei/wallet/commonbase/router/RouterRequest;-><init>(Landroid/content/Context;)V

    const-string v1, "com.huawei.wallet.nfc"

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->b(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;

    move-result-object v0

    const-string v1, "CardLostManagerProvider"

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->a(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;

    move-result-object v0

    const-string v1, "CardLostManagerCreateAction"

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->e(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;

    move-result-object v2

    .line 18
    invoke-static {}, Lcom/huawei/wallet/commonbase/router/LocalRouter;->b()Lcom/huawei/wallet/commonbase/router/LocalRouter;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/huawei/wallet/commonbase/router/LocalRouter;->e(Lcom/huawei/wallet/commonbase/router/RouterRequest;Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;)Lcom/huawei/wallet/commonbase/router/RouterResponse;

    move-result-object v3

    .line 19
    const-string v0, "CardLostManager"

    invoke-virtual {v3, v0}, Lcom/huawei/wallet/commonbase/router/RouterResponse;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    .line 20
    return-object v4
.end method

.method public static getNFCOpenApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/NFCOpenApi;
    .locals 5

    .line 33
    new-instance v0, Lcom/huawei/wallet/commonbase/router/RouterRequest;

    invoke-direct {v0, p0}, Lcom/huawei/wallet/commonbase/router/RouterRequest;-><init>(Landroid/content/Context;)V

    const-string v1, "com.huawei.wallet.nfc"

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->b(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;

    move-result-object v0

    const-string v1, "NFCOpenApiProvider"

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->a(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;

    move-result-object v0

    const-string v1, "NFCOpenApiCreateAction"

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->e(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;

    move-result-object v2

    .line 34
    invoke-static {}, Lcom/huawei/wallet/commonbase/router/LocalRouter;->b()Lcom/huawei/wallet/commonbase/router/LocalRouter;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/huawei/wallet/commonbase/router/LocalRouter;->e(Lcom/huawei/wallet/commonbase/router/RouterRequest;Lcom/huawei/wallet/commonbase/router/RouterActionCallBack;)Lcom/huawei/wallet/commonbase/router/RouterResponse;

    move-result-object v3

    .line 35
    const-string v0, "NFCOpenApi"

    invoke-virtual {v3, v0}, Lcom/huawei/wallet/commonbase/router/RouterResponse;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/NFCOpenApi;

    .line 36
    return-object v4
.end method
