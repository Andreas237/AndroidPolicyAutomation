.class public abstract Lcom/ibotta/api/FileUploadApiCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "FileUploadApiCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/ibotta/api/ApiResponse;",
        ">",
        "Lcom/ibotta/api/BaseApiCall<",
        "TT;>;"
    }
.end annotation


# static fields
.field protected static final SOCKET_TIMEOUT:J = 0x2bf20L


# instance fields
.field private uploadableFiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/UploadableFile;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/FileUploadApiCall;->uploadableFiles:Ljava/util/List;

    return-void
.end method


# virtual methods
.method protected addFilePart(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 21
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 27
    new-instance v1, Lcom/ibotta/api/UploadableFile;

    invoke-direct {v1}, Lcom/ibotta/api/UploadableFile;-><init>()V

    .line 28
    invoke-virtual {v1, p1}, Lcom/ibotta/api/UploadableFile;->setPartName(Ljava/lang/String;)V

    .line 29
    invoke-virtual {v1, v0}, Lcom/ibotta/api/UploadableFile;->setFileName(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v1, p2}, Lcom/ibotta/api/UploadableFile;->setFile(Ljava/io/File;)V

    .line 31
    invoke-virtual {v1, p3}, Lcom/ibotta/api/UploadableFile;->setContentType(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v1, p4}, Lcom/ibotta/api/UploadableFile;->setCharSet(Ljava/lang/String;)V

    .line 34
    iget-object p1, p0, Lcom/ibotta/api/FileUploadApiCall;->uploadableFiles:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getSocketTimeout()Ljava/lang/Long;
    .locals 2

    const-wide/32 v0, 0x2bf20

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public getUploadableFiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/UploadableFile;",
            ">;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/ibotta/api/FileUploadApiCall;->uploadableFiles:Ljava/util/List;

    return-object v0
.end method
