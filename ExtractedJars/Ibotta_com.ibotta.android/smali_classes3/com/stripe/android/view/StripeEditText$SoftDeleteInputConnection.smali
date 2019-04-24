.class Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "StripeEditText.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/StripeEditText;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SoftDeleteInputConnection"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/StripeEditText;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/StripeEditText;Landroid/view/inputmethod/InputConnection;Z)V
    .locals 0

    .line 260
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;->this$0:Lcom/stripe/android/view/StripeEditText;

    .line 261
    invoke-direct {p0, p2, p3}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    return-void
.end method


# virtual methods
.method public deleteSurroundingText(II)Z
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 267
    invoke-virtual {p0, v0, v1}, Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;->getTextBeforeCursor(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;->this$0:Lcom/stripe/android/view/StripeEditText;

    invoke-static {v0}, Lcom/stripe/android/view/StripeEditText;->access$100(Lcom/stripe/android/view/StripeEditText;)Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 268
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;->this$0:Lcom/stripe/android/view/StripeEditText;

    invoke-static {v0}, Lcom/stripe/android/view/StripeEditText;->access$100(Lcom/stripe/android/view/StripeEditText;)Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;->onDeleteEmpty()V

    .line 270
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    move-result p1

    return p1
.end method
