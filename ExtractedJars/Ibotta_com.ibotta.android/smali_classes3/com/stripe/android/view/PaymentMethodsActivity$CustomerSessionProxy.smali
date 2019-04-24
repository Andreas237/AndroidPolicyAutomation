.class interface abstract Lcom/stripe/android/view/PaymentMethodsActivity$CustomerSessionProxy;
.super Ljava/lang/Object;
.source "PaymentMethodsActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/PaymentMethodsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "CustomerSessionProxy"
.end annotation


# virtual methods
.method public abstract addProductUsageTokenIfValid(Ljava/lang/String;)V
.end method

.method public abstract getCachedCustomer()Lcom/stripe/android/model/Customer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end method

.method public abstract retrieveCurrentCustomer(Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V
    .param p1    # Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setCustomerDefaultSource(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract updateCurrentCustomer(Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V
    .param p1    # Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method
