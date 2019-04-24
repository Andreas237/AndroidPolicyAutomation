.class Lcom/unionpay/blepayservice/PayService$1;
.super Lo/fkm$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/blepayservice/PayService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/unionpay/blepayservice/PayService;


# direct methods
.method constructor <init>(Lcom/unionpay/blepayservice/PayService;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/unionpay/blepayservice/PayService$1;->d:Lcom/unionpay/blepayservice/PayService;

    invoke-direct {p0}, Lo/fkm$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a([B)Lcom/unionpay/blepayservice/Channel;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 127
    const/4 v4, 0x0

    .line 129
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 130
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openLogicChannel, aid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    const/4 v6, 0x0

    .line 134
    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService$1;->d:Lcom/unionpay/blepayservice/PayService;

    invoke-static {v0}, Lcom/unionpay/blepayservice/PayService;->b(Lcom/unionpay/blepayservice/PayService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/PluginPayAdapter;

    .line 135
    invoke-interface {v7, v5, v6}, Lcom/huawei/nfc/PluginPayAdapter;->openChannel(Ljava/lang/String;I)Ljava/util/Map;

    move-result-object v8

    .line 138
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 139
    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService$1;->d:Lcom/unionpay/blepayservice/PayService;

    const-string v1, "channelID"

    invoke-interface {v8, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/unionpay/blepayservice/PayService;->b(Lcom/unionpay/blepayservice/PayService;I)I

    .line 140
    const-string v0, "apdu"

    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 141
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openLogicChannel, channelID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/unionpay/blepayservice/PayService$1;->d:Lcom/unionpay/blepayservice/PayService;

    invoke-static {v3}, Lcom/unionpay/blepayservice/PayService;->e(Lcom/unionpay/blepayservice/PayService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", selectResp = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    new-instance v4, Lcom/unionpay/blepayservice/Channel;

    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService$1;->d:Lcom/unionpay/blepayservice/PayService;

    invoke-static {v0}, Lcom/unionpay/blepayservice/PayService;->e(Lcom/unionpay/blepayservice/PayService;)I

    move-result v0

    iget-object v1, p0, Lcom/unionpay/blepayservice/PayService$1;->d:Lcom/unionpay/blepayservice/PayService;

    invoke-static {v1}, Lcom/unionpay/blepayservice/PayService;->d(Lcom/unionpay/blepayservice/PayService;)Lo/fki$d;

    move-result-object v1

    invoke-direct {v4, v0, v9, v1}, Lcom/unionpay/blepayservice/Channel;-><init>(ILjava/lang/String;Lo/fki;)V

    .line 143
    goto :goto_0

    .line 144
    :cond_0
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openLogicChannel fail! payOpenChannelInfo is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    :goto_0
    return-object v4
.end method

.method public a()Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 190
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBTCInfo, enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService$1;->d:Lcom/unionpay/blepayservice/PayService;

    invoke-static {v0}, Lcom/unionpay/blepayservice/PayService;->b(Lcom/unionpay/blepayservice/PayService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/PluginPayAdapter;

    .line 192
    invoke-interface {v4}, Lcom/huawei/nfc/PluginPayAdapter;->getBTCInfoResponse()Ljava/lang/String;

    move-result-object v5

    .line 193
    const/4 v6, 0x0

    .line 194
    const-string v7, ""

    .line 195
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBTCInfo, BTCInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    invoke-interface {v4}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceProtocol()I

    move-result v8

    .line 198
    invoke-interface {v4}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceInfo()Ljava/util/Map;

    move-result-object v0

    const-string v1, "BT_version"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 199
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 200
    const-string v0, ""

    return-object v0

    .line 202
    :cond_0
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6, v5}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 203
    const/4 v10, 0x0

    .line 204
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBTCInfo, isTest = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBTCInfo, deviceType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBTCInfo, BT_version = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    if-nez v10, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xf

    if-le v0, v1, :cond_1

    const/16 v0, 0xa

    if-ne v0, v8, :cond_1

    const-string v0, "4.1.1.68"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 209
    const-string v0, "2"

    const/16 v1, 0xf

    const/16 v2, 0x10

    invoke-virtual {v6, v1, v2, v0}, Ljava/lang/StringBuffer;->replace(IILjava/lang/String;)Ljava/lang/StringBuffer;

    .line 210
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBTCInfo,  buffer.replace"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 213
    :cond_1
    move-object v7, v5

    .line 215
    :goto_0
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBTCInfo, return btcInfotemp = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    return-object v7
.end method

.method public b()Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 227
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCPLCInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService$1;->d:Lcom/unionpay/blepayservice/PayService;

    invoke-static {v0}, Lcom/unionpay/blepayservice/PayService;->b(Lcom/unionpay/blepayservice/PayService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/PluginPayAdapter;

    .line 229
    invoke-interface {v4}, Lcom/huawei/nfc/PluginPayAdapter;->getCplc()Ljava/lang/String;

    move-result-object v5

    .line 230
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCPLCInfo, cplc = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    return-object v5
.end method

.method public c()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 173
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bleSEStatus, enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService$1;->d:Lcom/unionpay/blepayservice/PayService;

    invoke-static {v0}, Lcom/unionpay/blepayservice/PayService;->b(Lcom/unionpay/blepayservice/PayService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/PluginPayAdapter;

    .line 176
    invoke-interface {v4}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 177
    const-string v0, "0101"

    return-object v0

    .line 179
    :cond_0
    const-string v0, "0000"

    return-object v0
.end method

.method public d()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 110
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init, enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService$1;->d:Lcom/unionpay/blepayservice/PayService;

    invoke-static {v0}, Lcom/unionpay/blepayservice/PayService;->b(Lcom/unionpay/blepayservice/PayService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/PluginPayAdapter;

    .line 113
    invoke-interface {v4}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 114
    const/4 v0, 0x0

    return v0

    .line 116
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public e(I)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 159
    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService$1;->d:Lcom/unionpay/blepayservice/PayService;

    invoke-static {v0}, Lcom/unionpay/blepayservice/PayService;->b(Lcom/unionpay/blepayservice/PayService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/PluginPayAdapter;

    .line 160
    invoke-interface {v4}, Lcom/huawei/nfc/PluginPayAdapter;->closeChannel()V

    .line 161
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeLogicChannel, closeResult"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    const/4 v0, 0x0

    return v0
.end method
