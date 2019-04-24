.class public Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardApkIconDownTask;
.super Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;
.source "SourceFile"


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardApkIconDownTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;

    .line 23
    return-void
.end method


# virtual methods
.method protected editPicFile(Ljava/lang/String;)Z
    .locals 1

    .line 47
    const/4 v0, 0x0

    return v0
.end method

.method protected getPicDirPath()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardApkIconDownTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicPathConfig;->getCardApkIconDirPath(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getPicFilePath()Ljava/lang/String;
    .locals 2

    .line 34
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardApkIconDownTask;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardApkIconDownTask;->curId:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicPathConfig;->getCardApkIconPath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected handleDownloadResult(Ljava/lang/String;I)V
    .locals 2

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "card apk icon downloaded appId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardApkIconDownTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;

    const/4 v1, 0x2

    invoke-interface {v0, v1, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardIconDownloadResultCallback;->downloadIconResult(ILjava/lang/String;I)V

    .line 42
    return-void
.end method

.method public bridge synthetic run()V
    .locals 0

    .line 12
    invoke-super {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->run()V

    return-void
.end method
