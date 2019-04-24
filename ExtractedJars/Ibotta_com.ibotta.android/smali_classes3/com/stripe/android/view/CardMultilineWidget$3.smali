.class Lcom/stripe/android/view/CardMultilineWidget$3;
.super Ljava/lang/Object;
.source "CardMultilineWidget.java"

# interfaces
.implements Lcom/stripe/android/view/ExpiryDateEditText$ExpiryDateEditListener;


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

    .line 368
    iput-object p1, p0, Lcom/stripe/android/view/CardMultilineWidget$3;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onExpiryDateComplete()V
    .locals 1

    .line 371
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget$3;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {v0}, Lcom/stripe/android/view/CardMultilineWidget;->access$300(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/StripeEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->requestFocus()Z

    .line 372
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget$3;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {v0}, Lcom/stripe/android/view/CardMultilineWidget;->access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 373
    iget-object v0, p0, Lcom/stripe/android/view/CardMultilineWidget$3;->this$0:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-static {v0}, Lcom/stripe/android/view/CardMultilineWidget;->access$200(Lcom/stripe/android/view/CardMultilineWidget;)Lcom/stripe/android/view/CardInputListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/view/CardInputListener;->onExpirationComplete()V

    :cond_0
    return-void
.end method
