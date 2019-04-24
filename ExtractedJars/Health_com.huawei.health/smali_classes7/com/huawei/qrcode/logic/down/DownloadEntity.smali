.class public Lcom/huawei/qrcode/logic/down/DownloadEntity;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x5fa0448b6a40174dL


# instance fields
.field private downloadFileSize:J

.field private downloadUrl:Ljava/lang/String;

.field private filePath:Ljava/lang/String;

.field private hashValue:Ljava/lang/String;

.field private saveDir:Ljava/lang/String;

.field private saveFileName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->downloadUrl:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->saveDir:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->hashValue:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getDownloadFileSize()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->downloadFileSize:J

    return-wide v0
.end method

.method public getDownloadUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->downloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public getHashValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->hashValue:Ljava/lang/String;

    return-object v0
.end method

.method public getSaveDir()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->saveDir:Ljava/lang/String;

    return-object v0
.end method

.method public getSaveFileName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->saveFileName:Ljava/lang/String;

    return-object v0
.end method

.method public setDownloadFileSize(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->downloadFileSize:J

    return-void
.end method

.method public setDownloadUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->downloadUrl:Ljava/lang/String;

    return-void
.end method

.method public setFilePath(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->filePath:Ljava/lang/String;

    return-void
.end method

.method public setHashValue(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->hashValue:Ljava/lang/String;

    return-void
.end method

.method public setSaveDir(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->saveDir:Ljava/lang/String;

    return-void
.end method

.method public setSaveFileName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/DownloadEntity;->saveFileName:Ljava/lang/String;

    return-void
.end method
