.class public Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# instance fields
.field private cplc:Ljava/lang/String;

.field private terminal:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    return-void
.end method


# virtual methods
.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getTerminal()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->terminal:Ljava/lang/String;

    return-object v0
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->cplc:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public setTerminal(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->terminal:Ljava/lang/String;

    .line 38
    return-void
.end method
