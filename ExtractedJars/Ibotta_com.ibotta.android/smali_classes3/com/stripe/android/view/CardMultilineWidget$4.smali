.class Lcom/stripe/android/view/CardMultilineWidget$4;
.super Ljava/lang/Object;
.source "CardMultilineWidget.java"

# interfaces
.implements Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/CardMultilineWidget;->initView(Landroid/util/AttributeSet;)V
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

    .line 379
    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$4;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTextChanged(Ljava/lang/String;)V
    .locals 1

    .line 382
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget$4;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {v0}, Lcom/stripe/android/view/CardMultilineWidget;->access$400(Lcom/stripe/android/view/CardMultilineWidget;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/stripe/android/view/ViewUtils;->isCvcMaximalLength(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 383
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$4;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$400(Lcom/stripe/android/view/CardMultilineWidget;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/view/CardMultilineWidget;->access$000(Lcom/stripe/android/view/CardMultilineWidget;Ljava/lang/String;)V

    .line 384
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$4;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$500(Lcom/stripe/android/view/CardMultilineWidget;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 385
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$4;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$600(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/StripeEditText;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->requestFocus()Z

    .line 387
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$4;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 388
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$4;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/view/CardInputListener;->onCvcComplete()V

    goto :goto_0

    .line 391
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$4;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$700(Lcom/stripe/android/view/CardMultilineWidget;)V

    .line 393
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$4;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardMultilineWidget;->access$300(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/StripeEditText;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/StripeEditText;->setShouldShowError(Z)V

    return-void
.end method
