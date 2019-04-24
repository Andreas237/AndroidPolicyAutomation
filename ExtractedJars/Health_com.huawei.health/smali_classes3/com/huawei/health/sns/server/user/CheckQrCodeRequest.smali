.class public Lcom/huawei/health/sns/server/user/CheckQrCodeRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/chkQrCode"


# instance fields
.field public qrCode_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 33
    const-string v0, "/chkQrCode"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/CheckQrCodeRequest;->method:Ljava/lang/String;

    .line 34
    const-string v0, "ISNS"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/CheckQrCodeRequest;->module:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 40
    new-instance v0, Lcom/huawei/health/sns/server/user/CheckQrCodeResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/CheckQrCodeResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 46
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    const-string v0, "CheckQrCodeRequest"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQrCode_()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/CheckQrCodeRequest;->qrCode_:Ljava/lang/String;

    return-object v0
.end method

.method public setQrCode_(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/CheckQrCodeRequest;->qrCode_:Ljava/lang/String;

    .line 24
    return-void
.end method
