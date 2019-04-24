.class Lcom/unionpay/blepayservice/PayService$5;
.super Lo/fki$d;
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
.field final synthetic b:Lcom/unionpay/blepayservice/PayService;


# direct methods
.method constructor <init>(Lcom/unionpay/blepayservice/PayService;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/unionpay/blepayservice/PayService$5;->b:Lcom/unionpay/blepayservice/PayService;

    invoke-direct {p0}, Lo/fki$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 74
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const/4 v0, 0x0

    return v0
.end method

.method public d()Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 80
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isClosed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    const/4 v0, 0x0

    return v0
.end method

.method public d([B)[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 89
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transmit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService$5;->b:Lcom/unionpay/blepayservice/PayService;

    invoke-static {v0}, Lcom/unionpay/blepayservice/PayService;->b(Lcom/unionpay/blepayservice/PayService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/PluginPayAdapter;

    .line 91
    iget-object v0, p0, Lcom/unionpay/blepayservice/PayService$5;->b:Lcom/unionpay/blepayservice/PayService;

    invoke-static {v0}, Lcom/unionpay/blepayservice/PayService;->e(Lcom/unionpay/blepayservice/PayService;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Lcom/huawei/nfc/PluginPayAdapter;->sendApdu(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 92
    const-string v0, "PayService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "transmit, result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method
