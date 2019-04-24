.class public Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private aid:Ljava/lang/String;

.field private cardName:Ljava/lang/String;

.field private cardNumber:Ljava/lang/String;

.field private cardStatus:Ljava/lang/String;

.field private cardType:I

.field private dpanId:Ljava/lang/String;

.field private ifNotify:Z

.field private issuerID:Ljava/lang/String;

.field private userId:Ljava/lang/String;


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

    .line 65
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getCardName()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public getCardNumber()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->cardNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getCardStatus()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->cardStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getCardType()I
    .locals 1

    .line 105
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->cardType:I

    return v0
.end method

.method public getDpanId()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->dpanId:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerID()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->issuerID:Ljava/lang/String;

    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public isIfNotify()Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->ifNotify:Z

    return v0
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->aid:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setCardName(Ljava/lang/String;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->cardName:Ljava/lang/String;

    .line 91
    return-void
.end method

.method public setCardNumber(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->cardNumber:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public setCardStatus(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->cardStatus:Ljava/lang/String;

    .line 81
    return-void
.end method

.method public setCardType(I)V
    .locals 0

    .line 110
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->cardType:I

    .line 111
    return-void
.end method

.method public setDpanId(Ljava/lang/String;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->dpanId:Ljava/lang/String;

    .line 137
    return-void
.end method

.method public setIfNotify(Z)V
    .locals 0

    .line 120
    iput-boolean p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->ifNotify:Z

    .line 121
    return-void
.end method

.method public setIssuerID(Ljava/lang/String;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->issuerID:Ljava/lang/String;

    .line 145
    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusItem;->userId:Ljava/lang/String;

    .line 129
    return-void
.end method
