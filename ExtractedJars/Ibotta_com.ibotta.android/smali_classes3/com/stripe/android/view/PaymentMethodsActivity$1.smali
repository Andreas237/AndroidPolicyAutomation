.class Lcom/stripe/android/view/PaymentMethodsActivity$1;
.super Ljava/lang/Object;
.source "PaymentMethodsActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/PaymentMethodsActivity;->onCreate(Landroid/os/Bundle;)V
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

    .line 66
    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity$1;->this$0:Lcom/stripe/android/view/PaymentMethodsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 69
    iget-object p1, p0, Lcom/stripe/android/view/PaymentMethodsActivity$1;->this$0:Lcom/stripe/android/view/PaymentMethodsActivity;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lcom/stripe/android/view/AddSourceActivity;->newIntent(Landroid/content/Context;ZZ)Landroid/content/Intent;

    move-result-object p1

    .line 73
    iget-object v1, p0, Lcom/stripe/android/view/PaymentMethodsActivity$1;->this$0:Lcom/stripe/android/view/PaymentMethodsActivity;

    invoke-static {v1}, Lcom/stripe/android/view/PaymentMethodsActivity;->access$000(Lcom/stripe/android/view/PaymentMethodsActivity;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "payment_session_active"

    .line 74
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsActivity$1;->this$0:Lcom/stripe/android/view/PaymentMethodsActivity;

    const/16 v1, 0x2bc

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/view/PaymentMethodsActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
