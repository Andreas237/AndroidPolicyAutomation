.class abstract Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final SUFFIX:Ljava/lang/String; = ".tmp"

.field private static final TAG:Ljava/lang/String; = "CardPicDownloadTask"


# instance fields
.field protected curId:Ljava/lang/String;

.field private curRemoteUrl:Ljava/lang/String;

.field protected mContext:Landroid/content/Context;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->mContext:Landroid/content/Context;

    .line 50
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->curId:Ljava/lang/String;

    .line 51
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->curRemoteUrl:Ljava/lang/String;

    .line 52
    return-void
.end method

.method private createDirectory(Ljava/lang/String;)Z
    .locals 5

    .line 124
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createDirectory, dirPath: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 128
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 130
    :cond_2
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createDirectory return false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    const/4 v0, 0x0

    return v0
.end method

.method private createStorageDir()Z
    .locals 5

    .line 96
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->getPicDirPath()Ljava/lang/String;

    move-result-object v4

    .line 98
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createStorageDir, picDirPath : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createStorageDir, but picDirPath is illegal."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const/4 v0, 0x0

    return v0

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/storage/path/NfcStorageUtil;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->createDirectory(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->createDirectory(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 108
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createDirectory success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    const/4 v0, 0x1

    return v0

    .line 112
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private createStorageFile()Z
    .locals 9

    .line 142
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter createStorageFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->getTmpPicFilePath()Ljava/lang/String;

    move-result-object v4

    .line 145
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 146
    const/4 v6, 0x1

    .line 147
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    invoke-virtual {v5}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v6

    .line 153
    :cond_0
    if-nez v6, :cond_1

    .line 155
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createStorageFile, delete old file failed. tmpPicFilePath : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    const/4 v0, 0x0

    return v0

    .line 159
    :cond_1
    const/4 v7, 0x0

    .line 162
    :try_start_0
    invoke-virtual {v5}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v7, v0

    .line 167
    goto :goto_0

    .line 164
    :catch_0
    move-exception v8

    .line 166
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createStorageFile, create new file io exception."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    :goto_0
    return v7
.end method

.method private downloadPicFile()Z
    .locals 10

    .line 180
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter downloadPicFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->getTmpPicFilePath()Ljava/lang/String;

    move-result-object v4

    .line 183
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 185
    new-instance v6, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->mContext:Landroid/content/Context;

    invoke-direct {v6, v0}, Lcom/huawei/nfc/carrera/server/download/impl/FileDownloadImpl;-><init>(Landroid/content/Context;)V

    .line 186
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->curRemoteUrl:Ljava/lang/String;

    invoke-interface {v6, v0, v5}, Lcom/huawei/nfc/carrera/server/download/FileDownloadApi;->download(Ljava/lang/String;Ljava/io/File;)I

    move-result v7

    .line 187
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadPicFile result: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 191
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->editPicFile(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 194
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->getPicFilePath()Ljava/lang/String;

    move-result-object v8

    .line 195
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadPicFile picFilePath: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",tmpPicFilePath="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    return v0

    .line 198
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 202
    :cond_1
    const/4 v0, -0x1

    if-eq v0, v7, :cond_2

    const/4 v0, -0x5

    if-eq v0, v7, :cond_2

    const/4 v0, -0x3

    if-eq v0, v7, :cond_2

    .line 206
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 207
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "downloadPicFile  failed. resultCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 208
    const-string v0, "url"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->curRemoteUrl:Ljava/lang/String;

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    const-string v0, "fail_reason"

    invoke-interface {v8, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " errorMsgs : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; message : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private getTmpPicFilePath()Ljava/lang/String;
    .locals 2

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->getPicFilePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".tmp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected abstract editPicFile(Ljava/lang/String;)Z
.end method

.method protected abstract getPicDirPath()Ljava/lang/String;
.end method

.method protected abstract getPicFilePath()Ljava/lang/String;
.end method

.method protected abstract handleDownloadResult(Ljava/lang/String;I)V
.end method

.method public run()V
    .locals 4

    .line 57
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CardPicDownloadTask begin id = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->curId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->createStorageDir()Z

    move-result v0

    if-nez v0, :cond_0

    .line 61
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createStorageDir failed."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->curId:Ljava/lang/String;

    const/4 v1, -0x2

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->handleDownloadResult(Ljava/lang/String;I)V

    .line 63
    return-void

    .line 67
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->createStorageFile()Z

    move-result v0

    if-nez v0, :cond_1

    .line 69
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createStorageFile failed."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->curId:Ljava/lang/String;

    const/4 v1, -0x3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->handleDownloadResult(Ljava/lang/String;I)V

    .line 71
    return-void

    .line 75
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->downloadPicFile()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 77
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadPicFile success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->curId:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->handleDownloadResult(Ljava/lang/String;I)V

    goto :goto_0

    .line 82
    :cond_2
    const-string v0, "CardPicDownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadPicFile failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->curId:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicDownloadTask;->handleDownloadResult(Ljava/lang/String;I)V

    .line 86
    :goto_0
    return-void
.end method
