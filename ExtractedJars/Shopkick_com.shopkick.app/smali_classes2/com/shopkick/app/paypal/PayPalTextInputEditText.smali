.class public Lcom/shopkick/app/paypal/PayPalTextInputEditText;
.super Landroid/support/design/widget/TextInputEditText;
.source "PayPalTextInputEditText.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/paypal/PayPalTextInputEditText$KeyImeChange;
    }
.end annotation


# instance fields
.field private keyImeChangeListener:Lcom/shopkick/app/paypal/PayPalTextInputEditText$KeyImeChange;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2}, Landroid/support/design/widget/TextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public getSelectionStart()I
    .locals 5

    .line 48
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 49
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "canPaste"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 53
    :cond_1
    invoke-super {p0}, Landroid/support/design/widget/TextInputEditText;->getSelectionStart()I

    move-result v0

    return v0
.end method

.method public isSuggestionsEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->keyImeChangeListener:Lcom/shopkick/app/paypal/PayPalTextInputEditText$KeyImeChange;

    if-eqz v0, :cond_0

    .line 31
    invoke-interface {v0, p1, p2}, Lcom/shopkick/app/paypal/PayPalTextInputEditText$KeyImeChange;->onKeyIme(ILandroid/view/KeyEvent;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onTextContextMenuItem(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setKeyImeChangeListener(Lcom/shopkick/app/paypal/PayPalTextInputEditText$KeyImeChange;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/shopkick/app/paypal/PayPalTextInputEditText;->keyImeChangeListener:Lcom/shopkick/app/paypal/PayPalTextInputEditText$KeyImeChange;

    return-void
.end method
