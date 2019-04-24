.class public Lcom/ibotta/api/UploadableFile;
.super Ljava/lang/Object;
.source "UploadableFile.java"


# instance fields
.field private charSet:Ljava/lang/String;

.field private contentType:Ljava/lang/String;

.field private file:Ljava/io/File;

.field private fileName:Ljava/lang/String;

.field private partName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCharSet()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/UploadableFile;->charSet:Ljava/lang/String;

    return-object v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/UploadableFile;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public getFile()Ljava/io/File;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/api/UploadableFile;->file:Ljava/io/File;

    return-object v0
.end method

.method public getFileName()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/api/UploadableFile;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public getPartName()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/ibotta/api/UploadableFile;->partName:Ljava/lang/String;

    return-object v0
.end method

.method public setCharSet(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/api/UploadableFile;->charSet:Ljava/lang/String;

    return-void
.end method

.method public setContentType(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/api/UploadableFile;->contentType:Ljava/lang/String;

    return-void
.end method

.method public setFile(Ljava/io/File;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/api/UploadableFile;->file:Ljava/io/File;

    return-void
.end method

.method public setFileName(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/api/UploadableFile;->fileName:Ljava/lang/String;

    return-void
.end method

.method public setPartName(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/ibotta/api/UploadableFile;->partName:Ljava/lang/String;

    return-void
.end method
