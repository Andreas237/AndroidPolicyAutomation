.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private aid:Ljava/lang/String;

.field private cardName:Ljava/lang/String;

.field private issuerId:Ljava/lang/String;

.field private logo:Landroid/graphics/Bitmap;

.field private productId:Ljava/lang/String;

.field private status:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static build(Landroid/graphics/Bitmap;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;
    .locals 1

    .line 74
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;-><init>()V

    .line 75
    iput-object p0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->logo:Landroid/graphics/Bitmap;

    .line 76
    iput-object p1, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->cardName:Ljava/lang/String;

    .line 77
    iput p2, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->status:I

    .line 78
    iput-object p3, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->issuerId:Ljava/lang/String;

    .line 79
    iput-object p4, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->productId:Ljava/lang/String;

    .line 80
    return-object v0
.end method


# virtual methods
.method public getAid()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getBundle()Landroid/os/Bundle;
    .locals 3

    .line 133
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 134
    const-string v0, "issueId"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    const-string v0, "productId"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const-string v0, "aid"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    const-string v0, "status"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getStatus()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 138
    const-string v0, "cardName"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->getCardName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    return-object v2
.end method

.method public getCardName()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getLogo()Landroid/graphics/Bitmap;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->logo:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()I
    .locals 1

    .line 92
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->status:I

    return v0
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->aid:Ljava/lang/String;

    .line 130
    return-void
.end method

.method public setCardName(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->cardName:Ljava/lang/String;

    .line 114
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->issuerId:Ljava/lang/String;

    .line 122
    return-void
.end method

.method public setLogo(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->logo:Landroid/graphics/Bitmap;

    .line 110
    return-void
.end method

.method public setProductId(Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->productId:Ljava/lang/String;

    .line 126
    return-void
.end method

.method public setStatus(I)V
    .locals 0

    .line 117
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->status:I

    .line 118
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SupportedTrafficCardListItem{logo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->logo:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cardName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->cardName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", issuerId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->issuerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", productId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->aid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
