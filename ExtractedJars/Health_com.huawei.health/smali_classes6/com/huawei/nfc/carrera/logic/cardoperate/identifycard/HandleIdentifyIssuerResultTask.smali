.class public Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;

.field private mHandler:Landroid/os/Handler;

.field private resultCardType:I

.field private resultIdentifyCode:I

.field private resultIssuerId:Ljava/lang/String;

.field private resultMode:I


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->mHandler:Landroid/os/Handler;

    .line 60
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;

    .line 61
    return-void
.end method


# virtual methods
.method public notifyIdentifyResult(ILjava/lang/String;II)V
    .locals 2

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "notifyIdentifyResult, resultCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",issuerId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",cardType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 70
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->resultIdentifyCode:I

    .line 71
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->resultIssuerId:Ljava/lang/String;

    .line 72
    iput p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->resultCardType:I

    .line 73
    iput p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->resultMode:I

    .line 75
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 76
    return-void
.end method

.method public run()V
    .locals 5

    .line 86
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->resultIdentifyCode:I

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->resultIssuerId:Ljava/lang/String;

    iget v3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->resultCardType:I

    iget v4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/identifycard/HandleIdentifyIssuerResultTask;->resultMode:I

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/CardTypeIdentifyCallback;->identifyResult(ILjava/lang/String;II)V

    .line 90
    :cond_0
    return-void
.end method
