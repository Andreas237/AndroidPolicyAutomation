.class public Lcom/ibotta/api/CacheableApiResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CacheableApiResponse.java"


# instance fields
.field private transient fromCache:Z

.field private lastModified:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/CacheableApiResponse;->lastModified:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/CacheableApiResponse;->setLastModified(Ljava/lang/String;)V

    .line 28
    iget-boolean v0, p0, Lcom/ibotta/api/CacheableApiResponse;->fromCache:Z

    invoke-virtual {p1, v0}, Lcom/ibotta/api/CacheableApiResponse;->setFromCache(Z)V

    return-void
.end method

.method public getLastModified()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/ibotta/api/CacheableApiResponse;->lastModified:Ljava/lang/String;

    return-object v0
.end method

.method public isFromCache()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lcom/ibotta/api/CacheableApiResponse;->fromCache:Z

    return v0
.end method

.method public setFromCache(Z)V
    .locals 0

    .line 20
    iput-boolean p1, p0, Lcom/ibotta/api/CacheableApiResponse;->fromCache:Z

    return-void
.end method

.method public setLastModified(Ljava/lang/String;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/ibotta/api/CacheableApiResponse;->lastModified:Ljava/lang/String;

    return-void
.end method
