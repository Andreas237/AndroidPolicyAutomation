.class Lcom/stripe/android/view/CardMultilineWidget$8;
.super Ljava/lang/Object;
.source "CardMultilineWidget.java"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/CardMultilineWidget;->initFocusChangeListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/CardMultilineWidget;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/CardMultilineWidget;)V
    .locals 0

    .line 470
    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$8;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 2

    if-eqz p2, :cond_0

    .line 474
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$8;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$700(Lcom/stripe/android/view/CardMultilineWidget;)V

    .line 475
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$8;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$900(Lcom/stripe/android/view/CardMultilineWidget;)I

    move-result p1

    .line 476
    iget-object p2, p0, Lcom/stripe/android/view/CardMultilineWidget$8;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p2}, Lcom/stripe/android/view/CardMultilineWidget;->access$300(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/StripeEditText;

    move-result-object p2

    const-wide/16 v0, 0x5a

    invoke-virtual {p2, p1, v0, v1}, Lcom/stripe/android/view/StripeEditText;->setHintDelayed(IJ)V

    .line 477
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$8;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 478
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$8;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;

    move-result-object p1

    const-string p2, "focus_cvc"

    invoke-interface {p1, p2}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Ljava/lang/String;)V

    goto :goto_0

    .line 481
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$8;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$400(Lcom/stripe/android/view/CardMultilineWidget;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/stripe/android/view/CardMultilineWidget;->access$000(Lcom/stripe/android/view/CardMultilineWidget;Ljava/lang/String;)V

    .line 482
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$8;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$300(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/StripeEditText;

    move-result-object p1

    const-string p2, ""

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setHint(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method
