.class public Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardRFConfFileDownloadTask;
.super Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;
.source "SourceFile"


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardRFConfFileDownloadTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;

    .line 19
    return-void
.end method


# virtual methods
.method protected editPicFile(Ljava/lang/String;)Z
    .locals 1

    .line 24
    const/4 v0, 0x0

    return v0
.end method

.method protected getPicDirPath()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardRFConfFileDownloadTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getPicFilePath()Ljava/lang/String;
    .locals 2

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardRFConfFileDownloadTask;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardRFConfFileDownloadTask;->curId:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected handleDownloadResult(Ljava/lang/String;I)V
    .locals 2

    .line 42
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardRFConfFileDownloadTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardRFConfFileDownloadTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;

    const/4 v1, 0x3

    invoke-interface {v0, v1, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;->downloadIconResult(ILjava/lang/String;I)V

    .line 46
    :cond_0
    return-void
.end method

.method public bridge synthetic run()V
    .locals 0

    .line 7
    invoke-super {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->run()V

    return-void
.end method
