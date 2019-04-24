.class public interface abstract Lcom/shopkick/app/awards/IAwardsManagerCallback;
.super Ljava/lang/Object;
.source "IAwardsManagerCallback.java"


# virtual methods
.method public abstract onAwardsResponseReceived(Ljava/util/HashMap;)V
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

.method public abstract onPopupDismissed(Lcom/shopkick/app/fetchers/api/IAPIObject;)V
.end method
