.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public cardIcon:Landroid/graphics/Bitmap;

.field private cardName:Ljava/lang/String;

.field private cardType:Z

.field private dpanFour:Ljava/lang/String;

.field private fpanFour:Ljava/lang/String;

.field private mode:I

.field private productId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    return-void
.end method

.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;)V
    .locals 2

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getFpanFour()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->fpanFour:Ljava/lang/String;

    .line 111
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getDpanFour()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->dpanFour:Ljava/lang/String;

    .line 112
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getProductId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->productId:Ljava/lang/String;

    .line 113
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->cardType:Z

    .line 114
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    .line 116
    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->getProductName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->cardName:Ljava/lang/String;

    goto :goto_1

    .line 120
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->cardName:Ljava/lang/String;

    .line 123
    :goto_1
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->mode:I

    .line 124
    return-void
.end method


# virtual methods
.method public bankCardInfoSai1()V
    .locals 0

    .line 134
    return-void
.end method

.method public bankCardInfoSai2()V
    .locals 0

    .line 135
    return-void
.end method

.method public bankCardInfoSai3()V
    .locals 0

    .line 136
    return-void
.end method

.method public bankCardInfoSai4()V
    .locals 0

    .line 137
    return-void
.end method

.method public bankCardInfoSai5()V
    .locals 0

    .line 138
    return-void
.end method

.method public bankCardInfoSai6()V
    .locals 0

    .line 139
    return-void
.end method

.method public bankCardInfoSai7()V
    .locals 0

    .line 140
    return-void
.end method

.method public getCardName()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public getDpanFour()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->dpanFour:Ljava/lang/String;

    return-object v0
.end method

.method public getFpanFour()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->fpanFour:Ljava/lang/String;

    return-object v0
.end method

.method public getMode()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->mode:I

    return v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public isCardType()Z
    .locals 1

    .line 100
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->cardType:Z

    return v0
.end method

.method public setCardName(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->cardName:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public setCardType(Z)V
    .locals 0

    .line 105
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->cardType:Z

    .line 106
    return-void
.end method

.method public setDpanFour(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->dpanFour:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public setFpanFour(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->fpanFour:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setMode(I)V
    .locals 0

    .line 55
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->mode:I

    .line 56
    return-void
.end method

.method public setProductId(Ljava/lang/String;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/BankCardInfo;->productId:Ljava/lang/String;

    .line 96
    return-void
.end method
