.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private mCardAid:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private mIssuerId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->mContext:Landroid/content/Context;

    .line 26
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->mIssuerId:Ljava/lang/String;

    .line 27
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->mCardAid:Ljava/lang/String;

    .line 28
    return-void
.end method

.method private querySAIssueOrder()Z
    .locals 14

    .line 47
    const-string v0, "QueryUnfinishedOrdersTask sa mode , begin to query unfinished orders."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v6

    .line 50
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v7

    .line 51
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getBusChipManu()Ljava/lang/String;

    move-result-object v8

    .line 52
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v9

    .line 53
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->mIssuerId:Ljava/lang/String;

    move-object v2, v9

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->mCardAid:Ljava/lang/String;

    move-object v4, v7

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v10, v0

    .line 55
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v11

    .line 56
    invoke-virtual {v11}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/nfc/PluginPayAdapter;

    .line 57
    invoke-interface {v12}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setAccountUserId(Ljava/lang/String;)V

    .line 58
    const-string v0, "1"

    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setOrderStatus(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    invoke-interface {v0, v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;->queryOrder(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;

    move-result-object v13

    .line 61
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    if-nez v0, :cond_1

    .line 63
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 65
    const-string v0, "QueryUnfinishedOrdersTask sa mode, has unfinished orders."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 66
    const/4 v0, 0x1

    return v0

    .line 68
    :cond_0
    const-string v0, "QueryUnfinishedOrdersTask sa mode, no unfinished orders."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 69
    const/4 v0, 0x0

    return v0

    .line 72
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryUnfinishedOrdersTask sa mode, applyOrder err, code ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", desc = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 73
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 72
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 75
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public hasUnfinishedIssueOrder()Z
    .locals 3

    .line 32
    const/4 v2, 0x0

    .line 34
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->mIssuerId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->mCardAid:Ljava/lang/String;

    .line 35
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    :cond_0
    const-string v0, "QueryUnfinishedOrdersTask hasUnfinishedIssueOrder error pram"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 38
    const/4 v0, 0x0

    return v0

    .line 41
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/QueryUnfinishedOrdersTask;->querySAIssueOrder()Z

    move-result v0

    return v0
.end method

.method public run()V
    .locals 0

    .line 82
    return-void
.end method
