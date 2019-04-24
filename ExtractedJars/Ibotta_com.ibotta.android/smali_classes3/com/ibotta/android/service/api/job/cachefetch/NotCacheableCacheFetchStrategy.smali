.class public Lcom/ibotta/android/service/api/job/cachefetch/NotCacheableCacheFetchStrategy;
.super Ljava/lang/Object;
.source "NotCacheableCacheFetchStrategy.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy<",
        "Lcom/ibotta/api/ApiResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isOutOfDate(J)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public loadFromDiskCache()Lcom/ibotta/api/ApiResponse;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public loadFromMemCache()Lcom/ibotta/api/ApiResponse;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
