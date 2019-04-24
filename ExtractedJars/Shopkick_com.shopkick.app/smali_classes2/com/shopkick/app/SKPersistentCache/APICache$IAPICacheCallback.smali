.class public interface abstract Lcom/shopkick/app/SKPersistentCache/APICache$IAPICacheCallback;
.super Ljava/lang/Object;
.source "APICache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/SKPersistentCache/APICache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IAPICacheCallback"
.end annotation


# virtual methods
.method public abstract fetchFailed(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)V
.end method

.method public abstract getRequestForCacheKeysAndPartitionType(Ljava/util/ArrayList;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;",
            ")",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;"
        }
    .end annotation
.end method

.method public abstract parseResponse(Ljava/lang/Object;Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;)Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/shopkick/app/SKPersistentCache/APICache$PartitionType;",
            ")",
            "Ljava/util/HashMap<",
            "Lcom/shopkick/app/fetchers/api/skapi/EntityToken;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;"
        }
    .end annotation
.end method

.method public abstract receivedObjects(Ljava/util/HashMap;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;)V"
        }
    .end annotation
.end method
