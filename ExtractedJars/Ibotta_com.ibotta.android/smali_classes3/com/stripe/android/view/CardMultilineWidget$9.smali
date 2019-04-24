.class Lcom/stripe/android/view/CardMultilineWidget$9;
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

    .line 491
    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$9;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 494
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$9;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$500(Lcom/stripe/android/view/CardMultilineWidget;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 498
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$9;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$600(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/StripeEditText;

    move-result-object p1

    sget p2, Lcom/stripe/android/R$string;->zip_helper:I

    const-wide/16 v0, 0x5a

    invoke-virtual {p1, p2, v0, v1}, Lcom/stripe/android/view/StripeEditText;->setHintDelayed(IJ)V

    .line 499
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$9;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 500
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$9;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;

    move-result-object p1

    const-string p2, "focus_postal"

    invoke-interface {p1, p2}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Ljava/lang/String;)V

    goto :goto_0

    .line 503
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$9;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$600(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/StripeEditText;

    move-result-object p1

    const-string p2, ""

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/StripeEditText;->setHint(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method
