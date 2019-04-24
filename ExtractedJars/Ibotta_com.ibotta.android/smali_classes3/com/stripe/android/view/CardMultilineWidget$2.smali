.class Lcom/stripe/android/view/CardMultilineWidget$2;
.super Ljava/lang/Object;
.source "CardMultilineWidget.java"

# interfaces
.implements Lcom/stripe/android/view/CardNumberEditText$CardNumberCompleteListener;


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

    .line 357
    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$2;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCardNumberComplete()V
    .locals 1

    .line 360
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget$2;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {v0}, Lcom/stripe/android/view/CardMultilineWidget;->access$100(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/ExpiryDateEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/ExpiryDateEditText;->requestFocus()Z

    .line 361
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget$2;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {v0}, Lcom/stripe/android/view/CardMultilineWidget;->access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 362
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget$2;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {v0}, Lcom/stripe/android/view/CardMultilineWidget;->access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/view/CardInputListener;->onCardComplete()V

    :cond_0
    return-void
.end method
