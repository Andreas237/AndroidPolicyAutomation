.class public final Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;
.super Lcom/ibotta/android/views/messages/alert/SemiModalContent;
.source "CheckBoxSemiModalContent.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/views/messages/alert/SemiModalContent;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewState;",
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u000e\u0010\u000c\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;",
        "Lcom/ibotta/android/views/messages/alert/SemiModalContent;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewState;",
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "checkBoxEvents",
        "Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents;",
        "bindViewEvents",
        "",
        "viewEvents",
        "onCheckBoxClicked",
        "setBody",
        "viewState",
        "setRadioButtonText",
        "updateViewState",
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
.field private _$_findViewCache:Ljava/util/HashMap;

.field private checkBoxEvents:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 15
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 16
    sget p3, Landroid/support/v7/cardview/R$attr;->cardViewStyle:I

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final setRadioButtonText(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
    .locals 2

    .line 27
    sget v0, Lcom/ibotta/views/R$id;->cbDoNotShowAgain:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    const-string v1, "cbDoNotShowAgain"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getCheckBoxText()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->bindViewEvents(Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->setViewEvents(Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V

    .line 32
    instance-of v0, p1, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents;

    if-eqz v0, :cond_0

    .line 33
    check-cast p1, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents;

    iput-object p1, p0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->checkBoxEvents:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents;

    .line 36
    :cond_0
    sget p1, Lcom/ibotta/views/R$id;->bPrimaryButton:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance v0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent$bindViewEvents$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent$bindViewEvents$1;-><init>(Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 37
    :goto_0
    sget p1, Lcom/ibotta/views/R$id;->ivCloseButton:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    new-instance v0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent$bindViewEvents$2;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent$bindViewEvents$2;-><init>(Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_2

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_2
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 38
    :goto_1
    sget p1, Lcom/ibotta/views/R$id;->cbDoNotShowAgain:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    new-instance v0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent$bindViewEvents$3;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent$bindViewEvents$3;-><init>(Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_3

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_3
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    return-void
.end method

.method public final onCheckBoxClicked()V
    .locals 3

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->checkBoxEvents:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents;

    if-nez v0, :cond_0

    const-string v1, "checkBoxEvents"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    sget v1, Lcom/ibotta/views/R$id;->cbDoNotShowAgain:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    const-string v2, "cbDoNotShowAgain"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents;->onCheckBoxTapped(Z)V

    return-void
.end method

.method protected setBody(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getBody()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 43
    sget v0, Lcom/ibotta/views/R$id;->tvBody:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvBody"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->showView(Landroid/view/View;)V

    .line 45
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 46
    sget v0, Lcom/ibotta/views/R$id;->tvBody:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvBody"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getBody()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x3f

    invoke-static {p1, v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 48
    :cond_0
    sget v0, Lcom/ibotta/views/R$id;->tvBody:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvBody"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getBody()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->updateViewState(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-super {p0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->updateViewState(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalContent;->setRadioButtonText(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V

    return-void
.end method
