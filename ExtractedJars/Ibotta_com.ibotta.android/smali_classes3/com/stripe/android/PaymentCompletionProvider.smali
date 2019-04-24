.class public interface abstract Lcom/stripe/android/PaymentCompletionProvider;
.super Ljava/lang/Object;
.source "PaymentCompletionProvider.java"


# virtual methods
.method public abstract completePayment(Lcom/stripe/android/PaymentSessionData;Lcom/stripe/android/PaymentResultListener;)V
    .param p1    # Lcom/stripe/android/PaymentSessionData;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/PaymentResultListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
