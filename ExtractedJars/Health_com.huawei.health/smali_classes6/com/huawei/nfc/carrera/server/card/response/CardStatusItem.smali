.class public Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final QUERIED_CARD_ACTION_LOST:Ljava/lang/String; = "2"

.field public static final QUERIED_CARD_ACTION_NULLIFY:Ljava/lang/String; = "5"

.field public static final QUERIED_CARD_ACTION_PAUSE:Ljava/lang/String; = "1"

.field public static final QUERIED_CARD_ACTION_RESUME:Ljava/lang/String; = "00"


# instance fields
.field private aid:Ljava/lang/String;

.field private cplc:Ljava/lang/String;

.field private dpanid:Ljava/lang/String;

.field private status:Ljava/lang/String;

.field private userID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAid()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getDpanid()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->dpanid:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getUserID()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->userID:Ljava/lang/String;

    return-object v0
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->aid:Ljava/lang/String;

    .line 95
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->cplc:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public setDpanid(Ljava/lang/String;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->dpanid:Ljava/lang/String;

    .line 115
    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->status:Ljava/lang/String;

    .line 105
    return-void
.end method

.method public setUserID(Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;->userID:Ljava/lang/String;

    .line 75
    return-void
.end method
