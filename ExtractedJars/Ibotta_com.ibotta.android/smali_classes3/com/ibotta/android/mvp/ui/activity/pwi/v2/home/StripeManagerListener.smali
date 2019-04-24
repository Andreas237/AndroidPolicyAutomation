.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/StripeManagerListener;
.super Ljava/lang/Object;
.source "StripeManagerListener.java"


# virtual methods
.method public abstract onCreateSourceError(Ljava/lang/Exception;)V
.end method

.method public abstract onCreateSourceSuccess(Lcom/stripe/android/model/Source;)V
.end method

.method public abstract onError(ILjava/lang/String;)V
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onSuccess(Lcom/stripe/android/model/Customer;)V
.end method
