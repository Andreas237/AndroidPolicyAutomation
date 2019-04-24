.class public Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.source "SourceFile"


# instance fields
.field private apduList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;>;"
        }
    .end annotation
.end field

.field private resultDesc:Ljava/lang/String;

.field private transactionId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->resultDesc:Ljava/lang/String;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->transactionId:Ljava/lang/String;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->apduList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getApduList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;>;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->apduList:Ljava/util/List;

    return-object v0
.end method

.method public getResultDesc()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->resultDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionId()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->transactionId:Ljava/lang/String;

    return-object v0
.end method

.method public setApduList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;>;)V"
        }
    .end annotation

    .line 54
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->apduList:Ljava/util/List;

    .line 55
    return-void
.end method

.method public setResultDesc(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->resultDesc:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setTransactionId(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->transactionId:Ljava/lang/String;

    .line 45
    return-void
.end method
