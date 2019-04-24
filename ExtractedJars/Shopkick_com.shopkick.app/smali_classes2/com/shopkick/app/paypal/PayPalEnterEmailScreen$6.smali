.class Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$6;
.super Ljava/lang/Object;
.source "PayPalEnterEmailScreen.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


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

    .line 513
    iput-object p1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$6;->this$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 517
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 518
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    .line 521
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$6;->this$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    .line 522
    invoke-static {v2}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->access$500(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getLocationOnScreen(Landroid/widget/EditText;)Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    if-nez v0, :cond_0

    .line 524
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$6;->this$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    .line 525
    invoke-virtual {v0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    .line 529
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$6;->this$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    invoke-static {v1}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->access$500(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 531
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$6;->this$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    invoke-static {v0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->access$500(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setCursorVisible(Z)V

    .line 533
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$6;->this$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    invoke-static {v0}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->access$600(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;)Lcom/shopkick/app/paypal/PayPalTextInputEditText;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->setCursorVisible(Z)V

    .line 534
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen$6;->this$0:Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    invoke-static {v0, v3}, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;->access$700(Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;Z)V

    .line 538
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    if-nez p2, :cond_1

    .line 540
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    :cond_1
    return v3
.end method
