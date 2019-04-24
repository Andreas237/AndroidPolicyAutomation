.class public interface abstract Lcom/stripe/android/PaymentResultListener;
.super Ljava/lang/Object;
.source "PaymentResultListener.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/PaymentResultListener$PaymentResult;
    }
.end annotation


# virtual methods
.method public abstract onPaymentResult(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
