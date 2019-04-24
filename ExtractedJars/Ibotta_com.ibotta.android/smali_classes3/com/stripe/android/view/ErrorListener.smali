.class Lcom/stripe/android/view/ErrorListener;
.super Ljava/lang/Object;
.source "ErrorListener.java"

# interfaces
.implements Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;


# instance fields
.field textInputLayout:Landroid/support/design/widget/TextInputLayout;


# direct methods
.method constructor <init>(Landroid/support/design/widget/TextInputLayout;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/stripe/android/view/ErrorListener;->textInputLayout:Landroid/support/design/widget/TextInputLayout;

    return-void
.end method


# virtual methods
.method public displayErrorMessage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 17
    iget-object p1, p0, Lcom/stripe/android/view/ErrorListener;->textInputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/ErrorListener;->textInputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method
