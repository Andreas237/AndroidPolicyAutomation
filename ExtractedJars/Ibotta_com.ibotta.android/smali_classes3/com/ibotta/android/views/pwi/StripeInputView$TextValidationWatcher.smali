.class final Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;
.super Ljava/lang/Object;
.source "StripeInputView.kt"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/pwi/StripeInputView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "TextValidationWatcher"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nH\u0016J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;",
        "Landroid/text/TextWatcher;",
        "(Lcom/ibotta/android/views/pwi/StripeInputView;)V",
        "afterTextChanged",
        "",
        "s",
        "Landroid/text/Editable;",
        "beforeTextChanged",
        "",
        "start",
        "",
        "count",
        "after",
        "onTextChanged",
        "before",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/views/pwi/StripeInputView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/pwi/StripeInputView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 192
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;->this$0:Lcom/ibotta/android/views/pwi/StripeInputView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 5
    .param p1    # Landroid/text/Editable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    sget-object p1, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {p1}, Lcom/ibotta/android/views/ViewsModule;->getValidation()Lcom/ibotta/android/util/Validation;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;->this$0:Lcom/ibotta/android/views/pwi/StripeInputView;

    sget v1, Lcom/ibotta/views/R$id;->etName:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputEditText;

    const-string v1, "etName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result p1

    .line 199
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getValidation()Lcom/ibotta/android/util/Validation;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;->this$0:Lcom/ibotta/android/views/pwi/StripeInputView;

    sget v2, Lcom/ibotta/views/R$id;->etCardNumber:I

    invoke-virtual {v1, v2}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/view/CardNumberEditText;

    const-string v2, "etCardNumber"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/stripe/android/view/CardNumberEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v0

    .line 200
    sget-object v1, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v1}, Lcom/ibotta/android/views/ViewsModule;->getValidation()Lcom/ibotta/android/util/Validation;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;->this$0:Lcom/ibotta/android/views/pwi/StripeInputView;

    sget v3, Lcom/ibotta/views/R$id;->etExpirationDate:I

    invoke-virtual {v2, v3}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/view/ExpiryDateEditText;

    const-string v3, "etExpirationDate"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/ExpiryDateEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v1

    .line 201
    sget-object v2, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v2}, Lcom/ibotta/android/views/ViewsModule;->getValidation()Lcom/ibotta/android/util/Validation;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;->this$0:Lcom/ibotta/android/views/pwi/StripeInputView;

    sget v4, Lcom/ibotta/views/R$id;->etCvc:I

    invoke-virtual {v3, v4}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/view/StripeEditText;

    const-string v4, "etCvc"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v2

    .line 203
    iget-object v3, p0, Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;->this$0:Lcom/ibotta/android/views/pwi/StripeInputView;

    invoke-static {v3}, Lcom/ibotta/android/views/pwi/StripeInputView;->access$checkAndClearErrors(Lcom/ibotta/android/views/pwi/StripeInputView;)V

    .line 204
    iget-object v3, p0, Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;->this$0:Lcom/ibotta/android/views/pwi/StripeInputView;

    invoke-static {v3}, Lcom/ibotta/android/views/pwi/StripeInputView;->access$updateCardBrandIcon(Lcom/ibotta/android/views/pwi/StripeInputView;)V

    .line 206
    iget-object v3, p0, Lcom/ibotta/android/views/pwi/StripeInputView$TextValidationWatcher;->this$0:Lcom/ibotta/android/views/pwi/StripeInputView;

    sget v4, Lcom/ibotta/views/R$id;->bContinue:I

    invoke-virtual {v3, v4}, Lcom/ibotta/android/views/pwi/StripeInputView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    const-string v4, "bContinue"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v3, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p2, "s"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string p2, "s"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
