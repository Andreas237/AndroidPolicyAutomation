.class Lcom/stripe/android/view/PaymentFlowActivity$2;
.super Landroid/content/BroadcastReceiver;
.source "PaymentFlowActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/PaymentFlowActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/PaymentFlowActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/PaymentFlowActivity;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$2;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string p1, "shipping_is_shipping_info_valid"

    const/4 v0, 0x0

    .line 93
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 97
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$2;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-static {p1}, Lcom/stripe/android/view/PaymentFlowActivity;->access$200(Lcom/stripe/android/view/PaymentFlowActivity;)V

    .line 98
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$2;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    const-string v0, "valid_shipping_methods"

    .line 99
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 98
    invoke-static {p1, v0}, Lcom/stripe/android/view/PaymentFlowActivity;->access$302(Lcom/stripe/android/view/PaymentFlowActivity;Ljava/util/List;)Ljava/util/List;

    .line 100
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$2;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    const-string v0, "default_shipping_method"

    .line 101
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/model/ShippingMethod;

    .line 100
    invoke-static {p1, p2}, Lcom/stripe/android/view/PaymentFlowActivity;->access$402(Lcom/stripe/android/view/PaymentFlowActivity;Lcom/stripe/android/model/ShippingMethod;)Lcom/stripe/android/model/ShippingMethod;

    goto :goto_1

    .line 103
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$2;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/PaymentFlowActivity;->setCommunicatingProgress(Z)V

    const-string p1, "shipping_info_error"

    .line 104
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 105
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    .line 106
    iget-object p2, p0, Lcom/stripe/android/view/PaymentFlowActivity$2;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-virtual {p2, p1}, Lcom/stripe/android/view/PaymentFlowActivity;->showError(Ljava/lang/String;)V

    goto :goto_0

    .line 108
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$2;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    sget p2, Lcom/stripe/android/R$string;->invalid_shipping_information:I

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PaymentFlowActivity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PaymentFlowActivity;->showError(Ljava/lang/String;)V

    .line 110
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$2;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/stripe/android/view/PaymentFlowActivity;->access$502(Lcom/stripe/android/view/PaymentFlowActivity;Lcom/stripe/android/model/ShippingInformation;)Lcom/stripe/android/model/ShippingInformation;

    :goto_1
    return-void
.end method
