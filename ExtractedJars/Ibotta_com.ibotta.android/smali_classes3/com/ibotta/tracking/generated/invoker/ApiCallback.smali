.class public interface abstract Lcom/ibotta/tracking/generated/invoker/ApiCallback;
.super Ljava/lang/Object;
.source "ApiCallback.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract onDownloadProgress(JJZ)V
.end method

.method public abstract onFailure(Lcom/ibotta/tracking/generated/invoker/ApiException;ILjava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/tracking/generated/invoker/ApiException;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract onSuccess(Ljava/lang/Object;ILjava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract onUploadProgress(JJZ)V
.end method
