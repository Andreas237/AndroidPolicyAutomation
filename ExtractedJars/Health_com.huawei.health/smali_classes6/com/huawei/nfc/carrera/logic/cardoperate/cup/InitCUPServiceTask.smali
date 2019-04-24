.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final mCUPApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

.field private final resultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceTask;->mCUPApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    .line 37
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceTask;->resultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;

    .line 39
    return-void
.end method

.method private handleInitResult(I)V
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceTask;->resultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceTask;->resultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceResultTask;->handleResult(I)V

    .line 89
    :cond_0
    return-void
.end method

.method private translateInitServiceReturnCode(I)I
    .locals 3

    .line 65
    const/16 v2, -0x63

    .line 67
    if-nez p1, :cond_0

    .line 69
    const/4 v2, 0x0

    goto :goto_0

    .line 71
    :cond_0
    const/4 v0, -0x3

    if-ne p1, v0, :cond_1

    .line 73
    const/4 v2, -0x3

    goto :goto_0

    .line 75
    :cond_1
    const/4 v0, -0x5

    if-ne p1, v0, :cond_2

    .line 77
    const/4 v2, -0x5

    .line 79
    :cond_2
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "translateInitServiceReturnCode callbackReturnCode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 80
    return v2
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceTask;->mCUPApi:Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;->init()I

    move-result v1

    .line 50
    invoke-direct {p0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceTask;->translateInitServiceReturnCode(I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/InitCUPServiceTask;->handleInitResult(I)V

    .line 61
    return-void
.end method
