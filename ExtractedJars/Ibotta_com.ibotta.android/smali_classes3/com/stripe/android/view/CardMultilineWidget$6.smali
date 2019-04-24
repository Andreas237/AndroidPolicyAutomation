.class Lcom/stripe/android/view/CardMultilineWidget$6;
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

    .line 440
    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$6;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 2

    if-eqz p2, :cond_0

    .line 444
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$6;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$800(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardNumberEditText;

    move-result-object p1

    sget p2, Lcom/stripe/android/R$string;->card_number_hint:I

    const-wide/16 v0, 0x78

    invoke-virtual {p1, p2, v0, v1}, Lcom/stripe/android/view/CardNumberEditText;->setHintDelayed(IJ)V

    .line 446
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$6;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 447
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$6;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;

    move-result-object p1

    const-string p2, "focus_card"

    invoke-interface {p1, p2}, Lcom/stripe/android/view/CardInputListener;->onFocusChange(Ljava/lang/String;)V

    goto :goto_0

    .line 450
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$6;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$800(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardNumberEditText;

    move-result-object p1

    const-string p2, ""

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->setHint(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method
