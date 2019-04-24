.class public Lcom/huawei/openalliance/ad/inter/data/ImageInfo;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1d015dcL


# instance fields
.field private checkSha256:Z

.field private fileSize:I

.field private height:I

.field private imageType:Ljava/lang/String;

.field private sha256:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private width:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->width:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->height:I

    return-void
.end method

.method public constructor <init>(Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->width:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->height:I

    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->url:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->width:I

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->height:I

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getSha256()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->sha256:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getImageType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->imageType:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getFileSize()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->fileSize:I

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getCheckSha256Flag()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->checkSha256:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public checkHash()Z
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->url:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getFileSizeToCheck()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/al;->a(Ljava/lang/String;J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->checkSha256:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->url:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->sha256:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/al;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public getFileSize()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->fileSize:I

    return v0
.end method

.method public getFileSizeToCheck()I
    .locals 1

    const/high16 v0, 0x3200000

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->height:I

    return v0
.end method

.method public getImageType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->imageType:Ljava/lang/String;

    return-object v0
.end method

.method public getSha256()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->sha256:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->url:Ljava/lang/String;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->width:I

    return v0
.end method

.method public isCheckSha256()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->checkSha256:Z

    return v0
.end method

.method public isValid()Z
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->url:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getFileSizeToCheck()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/al;->a(Ljava/lang/String;J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setCheckSha256(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->checkSha256:Z

    return-void
.end method

.method public setFileSize(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->fileSize:I

    return-void
.end method

.method public setHeight(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->height:I

    return-void
.end method

.method public setImageType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->imageType:Ljava/lang/String;

    return-void
.end method

.method public setSha256(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->sha256:Ljava/lang/String;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->url:Ljava/lang/String;

    return-void
.end method

.method public setWidth(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->width:I

    return-void
.end method
