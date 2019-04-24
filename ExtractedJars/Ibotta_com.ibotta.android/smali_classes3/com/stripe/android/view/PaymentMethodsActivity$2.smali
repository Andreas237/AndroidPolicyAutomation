.class Lcom/stripe/android/view/PaymentMethodsActivity$2;
.super Ljava/lang/Object;
.source "PaymentMethodsActivity.java"

# interfaces
.implements Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/PaymentMethodsActivity;->onActivityResult(IILandroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/PaymentMethodsActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/PaymentMethodsActivity;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity$2;->this$0:Lcom/stripe/android/view/PaymentMethodsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCustomerRetrieved(Lcom/stripe/android/model/Customer;)V
    .locals 1
    .param p1    # Lcom/stripe/android/model/Customer;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 105
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity$2;->this$0:Lcom/stripe/android/view/PaymentMethodsActivity;

    invoke-static {v0, p1}, Lcom/stripe/android/view/PaymentMethodsActivity;->access$100(Lcom/stripe/android/view/PaymentMethodsActivity;Lcom/stripe/android/model/Customer;)V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p2, :cond_0

    const-string p2, ""

    .line 111
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity$2;->this$0:Lcom/stripe/android/view/PaymentMethodsActivity;

    invoke-static {p1, p2}, Lcom/stripe/android/view/PaymentMethodsActivity;->access$200(Lcom/stripe/android/view/PaymentMethodsActivity;Ljava/lang/String;)V

    .line 112
    iget-object p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity$2;->this$0:Lcom/stripe/android/view/PaymentMethodsActivity;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/stripe/android/view/PaymentMethodsActivity;->access$300(Lcom/stripe/android/view/PaymentMethodsActivity;Z)V

    return-void
.end method
