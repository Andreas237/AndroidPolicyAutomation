.class Lcom/stripe/android/view/PaymentFlowActivity$3;
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

    .line 114
    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$3;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 117
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$3;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-static {p1}, Lcom/stripe/android/view/PaymentFlowActivity;->access$300(Lcom/stripe/android/view/PaymentFlowActivity;)Ljava/util/List;

    move-result-object p2

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivity$3;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-static {v0}, Lcom/stripe/android/view/PaymentFlowActivity;->access$400(Lcom/stripe/android/view/PaymentFlowActivity;)Lcom/stripe/android/model/ShippingMethod;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/stripe/android/view/PaymentFlowActivity;->access$600(Lcom/stripe/android/view/PaymentFlowActivity;Ljava/util/List;Lcom/stripe/android/model/ShippingMethod;)V

    .line 118
    iget-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$3;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-static {p1}, Lcom/stripe/android/view/PaymentFlowActivity;->access$700(Lcom/stripe/android/view/PaymentFlowActivity;)Lcom/stripe/android/PaymentSessionData;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/view/PaymentFlowActivity$3;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-static {p2}, Lcom/stripe/android/view/PaymentFlowActivity;->access$500(Lcom/stripe/android/view/PaymentFlowActivity;)Lcom/stripe/android/model/ShippingInformation;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/PaymentSessionData;->setShippingInformation(Lcom/stripe/android/model/ShippingInformation;)V

    return-void
.end method
