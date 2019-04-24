.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bankName:Ljava/lang/String;

.field private issuerId:Ljava/lang/String;

.field public mode:I

.field private supportCardType:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->issuerId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getMode()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->mode:I

    return v0
.end method

.method public getNfcBankName()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->bankName:Ljava/lang/String;

    return-object v0
.end method

.method public getSupportCardType()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->supportCardType:I

    return v0
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->issuerId:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setMode(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->mode:I

    .line 72
    return-void
.end method

.method public setNfcBankName(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->bankName:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setSupportCardType(I)V
    .locals 0

    .line 63
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->supportCardType:I

    .line 64
    return-void
.end method

.method public supportNFCBankInfoSAI1()V
    .locals 0

    .line 84
    return-void
.end method

.method public supportNFCBankInfoSAI2()V
    .locals 0

    .line 85
    return-void
.end method

.method public supportNFCBankInfoSAI3()V
    .locals 0

    .line 86
    return-void
.end method

.method public supportNFCBankInfoSAI4()V
    .locals 0

    .line 87
    return-void
.end method

.method public supportNFCBankInfoSAI5()V
    .locals 0

    .line 88
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SupportNFCBankInfo{issuerId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bankName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->bankName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", supportCardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->supportCardType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->mode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
