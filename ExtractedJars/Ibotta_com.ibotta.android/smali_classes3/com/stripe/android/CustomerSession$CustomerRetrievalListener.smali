.class public interface abstract Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;
.super Ljava/lang/Object;
.source "CustomerSession.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/CustomerSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "CustomerRetrievalListener"
.end annotation


# virtual methods
.method public abstract onCustomerRetrieved(Lcom/stripe/android/model/Customer;)V
    .param p1    # Lcom/stripe/android/model/Customer;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract onError(ILjava/lang/String;)V
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method
