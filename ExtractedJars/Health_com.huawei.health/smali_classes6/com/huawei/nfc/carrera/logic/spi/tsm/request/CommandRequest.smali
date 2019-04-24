.class public Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public cplc:Ljava/lang/String;

.field public funcallID:Ljava/lang/String;

.field public serverID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static build(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;
    .locals 1

    .line 39
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;-><init>()V

    .line 40
    iput-object p0, v0, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->cplc:Ljava/lang/String;

    .line 41
    iput-object p1, v0, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->funcallID:Ljava/lang/String;

    .line 42
    iput-object p2, v0, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->serverID:Ljava/lang/String;

    .line 44
    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CommandRequest{cplc=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->cplc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", funcallID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->funcallID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serverID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->serverID:Ljava/lang/String;

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
