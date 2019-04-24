.class public interface abstract Lcom/shopkick/app/receipts/IReceiptUploadController;
.super Ljava/lang/Object;
.source "IReceiptUploadController.java"


# virtual methods
.method public abstract setBundleIds(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setCallback(Lcom/shopkick/app/receipts/IReceiptUploadNotificationCallback;)V
    .param p1    # Lcom/shopkick/app/receipts/IReceiptUploadNotificationCallback;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setChainId(Ljava/lang/String;)V
.end method

.method public abstract setLocationId(Ljava/lang/String;)V
.end method

.method public abstract setProductFamilies(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract upload()Z
.end method

.method public abstract uploadInProgress()Z
.end method
