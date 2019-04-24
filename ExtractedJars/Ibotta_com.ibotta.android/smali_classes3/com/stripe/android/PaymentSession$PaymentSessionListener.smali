.class public interface abstract Lcom/stripe/android/PaymentSession$PaymentSessionListener;
.super Ljava/lang/Object;
.source "PaymentSession.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/PaymentSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "PaymentSessionListener"
.end annotation


# virtual methods
.method public abstract onCommunicatingStateChanged(Z)V
.end method

.method public abstract onError(ILjava/lang/String;)V
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract onPaymentSessionDataChanged(Lcom/stripe/android/PaymentSessionData;)V
    .param p1    # Lcom/stripe/android/PaymentSessionData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
