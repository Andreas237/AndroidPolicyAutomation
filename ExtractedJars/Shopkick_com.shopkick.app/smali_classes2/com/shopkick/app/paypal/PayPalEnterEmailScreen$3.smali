.class Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$3;
.super Ljava/lang/Object;
.source "PayPalEnterEmailScreen.java"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$3;->this$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 1

    if-eqz p2, :cond_0

    .line 338
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$3;->this$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    invoke-static {p2}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->access$000(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)Lcom/shopkick/app/widget/SKButton;

    move-result-object p2

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 340
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 341
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$3;->this$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    invoke-static {p1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->access$100(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)V

    :cond_0
    return-void
.end method
