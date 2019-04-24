.class public Lcom/ibotta/android/views/messages/alert/SemiModalContent;
.super Landroid/support/v7/widget/CardView;
.source "SemiModalContent.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/CardView;",
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
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0016\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014J\u0008\u0010\u0016\u001a\u00020\u0014H\u0004J\u0008\u0010\u0017\u001a\u00020\u0014H\u0014J\u0008\u0010\u0018\u001a\u00020\u0014H\u0004J\u0008\u0010\u0019\u001a\u00020\u0014H\u0004J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0003H\u0014J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0003H\u0004J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0003H\u0004J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0003H\u0004J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0003H\u0004J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010%\u001a\u00020\u0014J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020(H\u0004J\u0008\u0010)\u001a\u00020\u0014H\u0002J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0003H\u0016R\u000e\u0010\u000c\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0004X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u00a8\u0006+"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/SemiModalContent;",
        "Landroid/support/v7/widget/CardView;",
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
        "dialog",
        "Landroid/app/Dialog;",
        "viewEvents",
        "getViewEvents",
        "()Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;",
        "setViewEvents",
        "(Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V",
        "bindViewEvents",
        "",
        "dismiss",
        "init",
        "onFinishInflate",
        "onPrimaryClicked",
        "onSecondaryClicked",
        "setBackground",
        "window",
        "Landroid/view/Window;",
        "setBody",
        "viewState",
        "setMainImage",
        "setPrimaryButtonText",
        "setSecondaryButtonText",
        "setSubTitle",
        "setTitle",
        "setWindowMargin",
        "show",
        "showView",
        "view",
        "Landroid/view/View;",
        "updateBackground",
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

.field private dialog:Landroid/app/Dialog;

.field protected viewEvents:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 25
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 26
    sget p3, Landroid/support/v7/cardview/R$attr;->cardViewStyle:I

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final setBackground(Landroid/view/Window;)V
    .locals 2

    .line 52
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private final setSecondaryButtonText(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
    .locals 2

    .line 122
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getSecondaryButtonText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 123
    sget v0, Lcom/ibotta/views/R$id;->bSecondaryButton:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bSecondaryButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->showView(Landroid/view/View;)V

    .line 124
    sget v0, Lcom/ibotta/views/R$id;->bSecondaryButton:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bSecondaryButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getSecondaryButtonText()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private final setWindowMargin(Landroid/view/Window;)V
    .locals 3

    .line 56
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 57
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$dimen;->size_24:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 60
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v0, v1

    float-to-int v0, v0

    const/4 v1, -0x2

    .line 62
    invoke-virtual {p1, v0, v1}, Landroid/view/Window;->setLayout(II)V

    return-void
.end method

.method private final updateBackground()V
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->dialog:Landroid/app/Dialog;

    if-nez v0, :cond_0

    const-string v1, "dialog"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 48
    invoke-direct {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->setBackground(Landroid/view/Window;)V

    .line 49
    invoke-direct {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->setWindowMargin(Landroid/view/Window;)V

    return-void

    :cond_1
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->bindViewEvents(Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V

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

    .line 75
    iput-object p1, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->viewEvents:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;

    .line 77
    sget p1, Lcom/ibotta/views/R$id;->bPrimaryButton:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance v0, Lcom/ibotta/android/views/messages/alert/SemiModalContent$bindViewEvents$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent$bindViewEvents$1;-><init>(Lcom/ibotta/android/views/messages/alert/SemiModalContent;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 78
    :goto_0
    sget p1, Lcom/ibotta/views/R$id;->ivCloseButton:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    new-instance v0, Lcom/ibotta/android/views/messages/alert/SemiModalContent$bindViewEvents$2;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent$bindViewEvents$2;-><init>(Lcom/ibotta/android/views/messages/alert/SemiModalContent;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 79
    :goto_1
    sget p1, Lcom/ibotta/views/R$id;->bSecondaryButton:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance v0, Lcom/ibotta/android/views/messages/alert/SemiModalContent$bindViewEvents$3;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent$bindViewEvents$3;-><init>(Lcom/ibotta/android/views/messages/alert/SemiModalContent;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_2

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    return-void
.end method

.method public final dismiss()V
    .locals 2

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->dialog:Landroid/app/Dialog;

    if-nez v0, :cond_0

    const-string v1, "dialog"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method protected final getViewEvents()Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->viewEvents:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;

    if-nez v0, :cond_0

    const-string v1, "viewEvents"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method protected final init()V
    .locals 2

    .line 39
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->dialog:Landroid/app/Dialog;

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->dialog:Landroid/app/Dialog;

    if-nez v0, :cond_0

    const-string v1, "dialog"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->dialog:Landroid/app/Dialog;

    if-nez v0, :cond_1

    const-string v1, "dialog"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->dialog:Landroid/app/Dialog;

    if-nez v0, :cond_2

    const-string v1, "dialog"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    new-instance v1, Lcom/ibotta/android/views/messages/alert/SemiModalContent$init$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent$init$1;-><init>(Lcom/ibotta/android/views/messages/alert/SemiModalContent;)V

    check-cast v1, Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->updateBackground()V

    return-void
.end method

.method protected onFinishInflate()V
    .locals 0

    .line 34
    invoke-super {p0}, Landroid/support/v7/widget/CardView;->onFinishInflate()V

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->init()V

    return-void
.end method

.method protected final onPrimaryClicked()V
    .locals 2

    .line 135
    invoke-virtual {p0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->dismiss()V

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->viewEvents:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;

    if-nez v0, :cond_0

    const-string v1, "viewEvents"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-interface {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;->onPositiveTapped()V

    return-void
.end method

.method protected final onSecondaryClicked()V
    .locals 2

    .line 140
    invoke-virtual {p0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->dismiss()V

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->viewEvents:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;

    if-nez v0, :cond_0

    const-string v1, "viewEvents"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-interface {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;->onNegativeTapped()V

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

    .line 108
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getBody()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 109
    sget v0, Lcom/ibotta/views/R$id;->tvBody:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvBody"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->showView(Landroid/view/View;)V

    .line 110
    sget v0, Lcom/ibotta/views/R$id;->tvBody:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvBody"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getBody()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method protected final setMainImage(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getImageId()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 88
    sget v0, Lcom/ibotta/views/R$id;->ivImage:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->showView(Landroid/view/View;)V

    .line 89
    sget v0, Lcom/ibotta/views/R$id;->ivImage:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getImageId()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    return-void
.end method

.method protected final setPrimaryButtonText(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getPrimaryButtonText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 116
    sget v0, Lcom/ibotta/views/R$id;->bPrimaryButton:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bPrimaryButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->showView(Landroid/view/View;)V

    .line 117
    sget v0, Lcom/ibotta/views/R$id;->bPrimaryButton:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bPrimaryButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getPrimaryButtonText()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method protected final setSubTitle(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 102
    sget v0, Lcom/ibotta/views/R$id;->tvSubTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSubTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->showView(Landroid/view/View;)V

    .line 103
    sget v0, Lcom/ibotta/views/R$id;->tvSubTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSubTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getSubtitle()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method protected final setTitle(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 95
    sget v0, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->showView(Landroid/view/View;)V

    .line 96
    sget v0, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;->getTitle()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method protected final setViewEvents(Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->viewEvents:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;

    return-void
.end method

.method public final show()V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->dialog:Landroid/app/Dialog;

    if-nez v0, :cond_0

    const-string v1, "dialog"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method protected final showView(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 130
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->updateViewState(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V

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

    .line 66
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->setMainImage(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V

    .line 67
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->setTitle(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V

    .line 68
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->setSubTitle(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V

    .line 69
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->setBody(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V

    .line 70
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->setPrimaryButtonText(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V

    .line 71
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalContent;->setSecondaryButtonText(Lcom/ibotta/android/views/messages/alert/SemiModalViewState;)V

    return-void
.end method
