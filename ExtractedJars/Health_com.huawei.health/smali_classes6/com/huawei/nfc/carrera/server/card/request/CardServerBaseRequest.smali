.class public Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.super Lo/ecr;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Lo/ecr;-><init>()V

    .line 22
    const-string v0, "260086000000068459"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;->merchantID:Ljava/lang/String;

    .line 23
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;->rsaKeyIndex:I

    .line 24
    invoke-static {}, Lcom/huawei/wallet/utils/Generator;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;->srcTransactionID:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lo/ecr;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;->merchantID:Ljava/lang/String;

    .line 30
    iput p2, p0, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;->rsaKeyIndex:I

    .line 31
    iput-object p3, p0, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;->srcTransactionID:Ljava/lang/String;

    .line 32
    return-void
.end method
