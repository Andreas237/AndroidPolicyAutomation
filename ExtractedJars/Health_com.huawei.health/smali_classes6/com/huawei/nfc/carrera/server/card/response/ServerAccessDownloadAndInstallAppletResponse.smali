.class public Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;
.source "SourceFile"


# instance fields
.field private nextStep:Ljava/lang/String;

.field private noNeedCommandResp:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getNextStep()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->nextStep:Ljava/lang/String;

    return-object v0
.end method

.method public getNoNeedCommandResp()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->noNeedCommandResp:Ljava/lang/String;

    return-object v0
.end method

.method public setNextStep(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->nextStep:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public setNoNeedCommandResp(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->noNeedCommandResp:Ljava/lang/String;

    .line 36
    return-void
.end method
