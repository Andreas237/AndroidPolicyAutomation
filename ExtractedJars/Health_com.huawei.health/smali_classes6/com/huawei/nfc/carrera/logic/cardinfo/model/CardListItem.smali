.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private aid:Ljava/lang/String;

.field private cardGroup:I

.field private cardIconLocalPath:Ljava/lang/String;

.field private fontColor:Ljava/lang/String;

.field private fpanFour:Ljava/lang/String;

.field private isDefault:Z

.field private productId:Ljava/lang/String;

.field private referenceId:Ljava/lang/String;

.field private statusUpdateTime:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAid()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getCardGroup()I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->cardGroup:I

    return v0
.end method

.method public getCardIconLocalPath()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->cardIconLocalPath:Ljava/lang/String;

    return-object v0
.end method

.method public getFontColor()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->fontColor:Ljava/lang/String;

    return-object v0
.end method

.method public getFpanFour()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->fpanFour:Ljava/lang/String;

    return-object v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public getReferenceId()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->referenceId:Ljava/lang/String;

    return-object v0
.end method

.method public getStatusUpdateTime()J
    .locals 2

    .line 136
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->statusUpdateTime:J

    return-wide v0
.end method

.method public isDefault()Z
    .locals 1

    .line 116
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->isDefault:Z

    return v0
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->aid:Ljava/lang/String;

    .line 82
    return-void
.end method

.method public setCardGroup(I)V
    .locals 0

    .line 111
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->cardGroup:I

    .line 112
    return-void
.end method

.method public setCardIconLocalPath(Ljava/lang/String;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->cardIconLocalPath:Ljava/lang/String;

    .line 152
    return-void
.end method

.method public setDefault(Z)V
    .locals 0

    .line 121
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->isDefault:Z

    .line 122
    return-void
.end method

.method public setFontColor(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->fontColor:Ljava/lang/String;

    .line 162
    return-void
.end method

.method public setFpanFour(Ljava/lang/String;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->fpanFour:Ljava/lang/String;

    .line 132
    return-void
.end method

.method public setProductId(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->productId:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public setReferenceId(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->referenceId:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public setStatusUpdateTime(J)V
    .locals 0

    .line 141
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->statusUpdateTime:J

    .line 142
    return-void
.end method
