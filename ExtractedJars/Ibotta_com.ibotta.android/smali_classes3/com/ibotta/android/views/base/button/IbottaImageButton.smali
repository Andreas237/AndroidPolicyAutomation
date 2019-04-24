.class public final Lcom/ibotta/android/views/base/button/IbottaImageButton;
.super Landroid/support/v7/widget/AppCompatImageButton;
.source "IbottaImageButton.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/AppCompatImageButton;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/base/button/IbottaButtonViewState;",
        "Lcom/ibotta/android/views/components/ClickableViewEvent;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIbottaImageButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IbottaImageButton.kt\ncom/ibotta/android/views/base/button/IbottaImageButton\n*L\n1#1,41:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0008\u0010\u0010\u001a\u00020\u000fH\u0014J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u000c\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ibotta/android/views/base/button/IbottaImageButton;",
        "Landroid/support/v7/widget/AppCompatImageButton;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/base/button/IbottaButtonViewState;",
        "Lcom/ibotta/android/views/components/ClickableViewEvent;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "viewEvents",
        "viewState",
        "bindViewEvents",
        "",
        "onFinishInflate",
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

.field private viewEvents:Lcom/ibotta/android/views/components/ClickableViewEvent;

.field private viewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/base/button/IbottaImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/base/button/IbottaImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 16
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 18
    sget-object p1, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->EMPTY:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    iput-object p1, p0, Lcom/ibotta/android/views/base/button/IbottaImageButton;->viewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 14
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 15
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/base/button/IbottaImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewEvents$p(Lcom/ibotta/android/views/base/button/IbottaImageButton;)Lcom/ibotta/android/views/components/ClickableViewEvent;
    .locals 1

    .line 12
    iget-object p0, p0, Lcom/ibotta/android/views/base/button/IbottaImageButton;->viewEvents:Lcom/ibotta/android/views/components/ClickableViewEvent;

    if-nez p0, :cond_0

    const-string v0, "viewEvents"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final synthetic access$setViewEvents$p(Lcom/ibotta/android/views/base/button/IbottaImageButton;Lcom/ibotta/android/views/components/ClickableViewEvent;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/ibotta/android/views/base/button/IbottaImageButton;->viewEvents:Lcom/ibotta/android/views/components/ClickableViewEvent;

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/base/button/IbottaImageButton;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/base/button/IbottaImageButton;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/base/button/IbottaImageButton;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/base/button/IbottaImageButton;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/base/button/IbottaImageButton;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/components/ClickableViewEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    iput-object p1, p0, Lcom/ibotta/android/views/base/button/IbottaImageButton;->viewEvents:Lcom/ibotta/android/views/components/ClickableViewEvent;

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/views/components/ClickableViewEvent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    return-void
.end method

.method protected onFinishInflate()V
    .locals 2

    .line 38
    invoke-super {p0}, Landroid/support/v7/widget/AppCompatImageButton;->onFinishInflate()V

    .line 39
    new-instance v0, Lcom/ibotta/android/views/base/button/IbottaImageButton$onFinishInflate$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/base/button/IbottaImageButton$onFinishInflate$1;-><init>(Lcom/ibotta/android/views/base/button/IbottaImageButton;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/base/button/IbottaButtonViewState;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/views/base/button/IbottaImageButton;->viewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 23
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->getSelected()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setSelected(Z)V

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->getContentDescription()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 25
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->getDrawableResource()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setImageResource(I)V

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->isCircleRipple()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    sget v0, Lcom/ibotta/views/R$drawable;->add_button_ripple:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setBackgroundResource(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 29
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 32
    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/ibotta/android/views/base/button/IbottaImageButton;->viewState:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->updateViewState(Lcom/ibotta/android/views/base/button/IbottaButtonViewState;)V

    return-void
.end method
