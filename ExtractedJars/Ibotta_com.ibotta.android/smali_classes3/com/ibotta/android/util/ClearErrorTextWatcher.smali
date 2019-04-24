.class public Lcom/ibotta/android/util/ClearErrorTextWatcher;
.super Ljava/lang/Object;
.source "ClearErrorTextWatcher.java"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field private textInputLayout:Landroid/support/design/widget/TextInputLayout;


# direct methods
.method public constructor <init>(Landroid/support/design/widget/TextInputLayout;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/util/ClearErrorTextWatcher;->textInputLayout:Landroid/support/design/widget/TextInputLayout;

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 27
    iget-object p1, p0, Lcom/ibotta/android/util/ClearErrorTextWatcher;->textInputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 28
    iget-object p1, p0, Lcom/ibotta/android/util/ClearErrorTextWatcher;->textInputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void
.end method
