.class public Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;
.super Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;
.source "SourceFile"


# instance fields
.field private apduCount:I

.field private apduList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;>;"
        }
    .end annotation
.end field

.field private currentStep:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;

.field private transactionId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->transactionId:Ljava/lang/String;

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->apduCount:I

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->apduList:Ljava/util/List;

    .line 47
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;>;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->transactionId:Ljava/lang/String;

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->apduCount:I

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->apduList:Ljava/util/List;

    .line 51
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->setIssuerId(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->setAppletAid(Ljava/lang/String;)V

    .line 53
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->setCplc(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0, p7}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->setDeviceModel(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0, p8}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 57
    iput-object p4, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->transactionId:Ljava/lang/String;

    .line 58
    iput p5, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->apduCount:I

    .line 59
    iput-object p6, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->apduList:Ljava/util/List;

    .line 60
    return-void
.end method


# virtual methods
.method public getApduCount()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->apduCount:I

    return v0
.end method

.method public getApduList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;>;"
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->apduList:Ljava/util/List;

    return-object v0
.end method

.method public getCurrentStep()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->currentStep:Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionId()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->transactionId:Ljava/lang/String;

    return-object v0
.end method

.method public setApduCount(I)V
    .locals 0

    .line 75
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->apduCount:I

    .line 76
    return-void
.end method

.method public setApduList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;>;)V"
        }
    .end annotation

    .line 83
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->apduList:Ljava/util/List;

    .line 84
    return-void
.end method

.method public setCurrentStep(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->currentStep:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->partnerId:Ljava/lang/String;

    .line 100
    return-void
.end method

.method public setTransactionId(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->transactionId:Ljava/lang/String;

    .line 68
    return-void
.end method
