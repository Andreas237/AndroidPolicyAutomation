.class public interface abstract Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;
.super Ljava/lang/Object;
.source "CacheFetchStrategy.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Lcom/ibotta/api/ApiResponse;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract isOutOfDate(J)Z
.end method

.method public abstract loadFromDiskCache()Lcom/ibotta/api/ApiResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation
.end method

.method public abstract loadFromMemCache()Lcom/ibotta/api/ApiResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation
.end method
