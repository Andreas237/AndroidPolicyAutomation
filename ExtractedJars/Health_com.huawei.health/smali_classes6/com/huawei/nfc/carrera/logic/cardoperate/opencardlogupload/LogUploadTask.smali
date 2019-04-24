.class public Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final context:Landroid/content/Context;

.field private final handler:Landroid/os/Handler;

.field private final request:Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadTask;->handler:Landroid/os/Handler;

    .line 30
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadTask;->context:Landroid/content/Context;

    .line 31
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadTask;->request:Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;

    .line 32
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 38
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadTask;->request:Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->getCardType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_0

    .line 40
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadTask;->context:Landroid/content/Context;

    const-string v1, "TransportationCard"

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 44
    :cond_0
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadTask;->context:Landroid/content/Context;

    invoke-direct {v2, v0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;)V

    .line 46
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadTask;->request:Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->reportOpenCardEvent(Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    move-result-object v3

    .line 48
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 49
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 51
    const-string v0, "openCardLogUpload,  get response fail."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 52
    const/16 v0, -0x63

    iput v0, v4, Landroid/os/Message;->what:I

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadTask;->handler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_1

    .line 57
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "openCardLogUpload, response code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v3, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 58
    iget v0, v3, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    iput v0, v4, Landroid/os/Message;->what:I

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadTask;->handler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 61
    :goto_1
    return-void
.end method
