.class public Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# instance fields
.field private issuerId:Ljava/lang/String;

.field private noticeType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    return-void
.end method


# virtual methods
.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getNoticeType()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;->noticeType:Ljava/lang/String;

    return-object v0
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;->issuerId:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public setNoticeType(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;->noticeType:Ljava/lang/String;

    .line 39
    return-void
.end method
