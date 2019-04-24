.class public interface abstract Lcom/shopkick/app/util/BatchRequestHelper$IBatchRequestAPICallback;
.super Ljava/lang/Object;
.source "BatchRequestHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/BatchRequestHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "IBatchRequestAPICallback"
.end annotation


# virtual methods
.method public abstract completedResponse(Lcom/shopkick/fetchers/DataResponse;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/fetchers/DataResponse;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/IAPIObject;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/fetchers/DataResponse;",
            ">;)V"
        }
    .end annotation
.end method
