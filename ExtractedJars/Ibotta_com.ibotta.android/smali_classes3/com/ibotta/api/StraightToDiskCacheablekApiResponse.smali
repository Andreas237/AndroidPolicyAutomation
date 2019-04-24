.class public Lcom/ibotta/api/StraightToDiskCacheablekApiResponse;
.super Lcom/ibotta/api/IOCacheableApiResponse;
.source "StraightToDiskCacheablekApiResponse.java"


# instance fields
.field private responseFilePath:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/ibotta/api/IOCacheableApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 32
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/IOCacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 33
    instance-of v0, p1, Lcom/ibotta/api/StraightToDiskCacheablekApiResponse;

    if-eqz v0, :cond_1

    .line 34
    check-cast p1, Lcom/ibotta/api/StraightToDiskCacheablekApiResponse;

    iget-object v0, p0, Lcom/ibotta/api/StraightToDiskCacheablekApiResponse;->responseFilePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/StraightToDiskCacheablekApiResponse;->setResponseFilePath(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 3
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24
    new-instance v0, Ljava/io/FileInputStream;

    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Lcom/ibotta/api/StraightToDiskCacheablekApiResponse;->getResponseFilePath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public getResponseFilePath()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ibotta/api/StraightToDiskCacheablekApiResponse;->responseFilePath:Ljava/lang/String;

    return-object v0
.end method

.method public setResponseFilePath(Ljava/lang/String;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/ibotta/api/StraightToDiskCacheablekApiResponse;->responseFilePath:Ljava/lang/String;

    return-void
.end method
