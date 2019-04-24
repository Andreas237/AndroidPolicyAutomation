.class Lcom/stripe/android/view/StripeActivity$1;
.super Landroid/content/BroadcastReceiver;
.source "StripeActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/StripeActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/StripeActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/StripeActivity;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/stripe/android/view/StripeActivity$1;->this$0:Lcom/stripe/android/view/StripeActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    const-string p1, "exception"

    .line 57
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/exception/StripeException;

    .line 58
    iget-object p2, p0, Lcom/stripe/android/view/StripeActivity$1;->this$0:Lcom/stripe/android/view/StripeActivity;

    invoke-virtual {p1}, Lcom/stripe/android/exception/StripeException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/stripe/android/view/StripeActivity;->showError(Ljava/lang/String;)V

    return-void
.end method
