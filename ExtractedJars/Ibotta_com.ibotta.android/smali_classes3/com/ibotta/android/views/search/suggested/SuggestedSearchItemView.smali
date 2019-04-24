.class public final Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;
.super Landroid/support/constraint/ConstraintLayout;
.source "SuggestedSearchItemView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;",
        "Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSuggestedSearchItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestedSearchItemView.kt\ncom/ibotta/android/views/search/suggested/SuggestedSearchItemView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1574#2,2:63\n*E\n*S KotlinDebug\n*F\n+ 1 SuggestedSearchItemView.kt\ncom/ibotta/android/views/search/suggested/SuggestedSearchItemView\n*L\n42#1,2:63\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u0003H\u0016R\u000e\u0010\u000c\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;",
        "Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "viewState",
        "bindViewEvents",
        "",
        "viewEvents",
        "getSuggestionText",
        "Landroid/text/SpannableStringBuilder;",
        "initWholeRowSelectability",
        "isEntireRowSelectable",
        "",
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

.field private viewState:Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10
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

    .line 22
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    new-instance p1, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x3f

    const/4 v9, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;ZLjava/util/List;ZLcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->viewState:Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 21
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewState$p(Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;)Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;
    .locals 0

    .line 20
    iget-object p0, p0, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->viewState:Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;

    return-object p0
.end method

.method public static final synthetic access$setViewState$p(Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->viewState:Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;

    return-void
.end method

.method private final getSuggestionText(Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;)Landroid/text/SpannableStringBuilder;
    .locals 5

    .line 42
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;->getSuggestionText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;->getBoldedSpans()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 63
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/views/search/suggested/TextSpan;

    .line 43
    new-instance v2, Landroid/text/style/StyleSpan;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v1}, Lcom/ibotta/android/views/search/suggested/TextSpan;->getStart()I

    move-result v3

    invoke-virtual {v1}, Lcom/ibotta/android/views/search/suggested/TextSpan;->getEnd()I

    move-result v1

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final initWholeRowSelectability(Z)V
    .locals 2

    .line 48
    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->setClickable(Z)V

    .line 49
    sget v0, Lcom/ibotta/views/R$id;->iibCtaButton:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const-string v1, "iibCtaButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setClickable(Z)V

    .line 50
    sget v0, Lcom/ibotta/views/R$id;->tvSuggestionText:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSuggestionText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 53
    invoke-static {p0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 54
    sget p1, Lcom/ibotta/views/R$id;->tvSuggestionText:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v1, "tvSuggestionText"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 55
    sget p1, Lcom/ibotta/views/R$id;->iibCtaButton:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const-string v1, "iibCtaButton"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 57
    :cond_0
    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 58
    sget p1, Lcom/ibotta/views/R$id;->tvSuggestionText:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "tvSuggestionText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 59
    sget p1, Lcom/ibotta/views/R$id;->iibCtaButton:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const-string v0, "iibCtaButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    :goto_0
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->bindViewEvents(Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewEvents;)V
    .locals 3
    .param p1    # Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    sget v0, Lcom/ibotta/views/R$id;->tvSuggestionText:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView$bindViewEvents$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView$bindViewEvents$1;-><init>(Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewEvents;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 29
    :goto_0
    new-instance v0, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView$bindViewEvents$2;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView$bindViewEvents$2;-><init>(Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewEvents;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 30
    :goto_1
    sget v0, Lcom/ibotta/views/R$id;->iibCtaButton:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    new-instance v1, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView$bindViewEvents$3;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView$bindViewEvents$3;-><init>(Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewEvents;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v1}, Lcom/ibotta/android/views/components/ClickableViewEventKt;->ClickableViewEvent(Lkotlin/jvm/functions/Function0;)Lcom/ibotta/android/views/components/ClickableViewEvent;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 20
    check-cast p1, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->updateViewState(Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;)V
    .locals 3
    .param p1    # Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    sget v0, Lcom/ibotta/views/R$id;->tvSuggestionText:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-direct {p0, p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->getSuggestionText(Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 35
    sget v0, Lcom/ibotta/views/R$id;->ivRecentIcon:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivRecentIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;->isRecentIconShown()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 36
    sget v0, Lcom/ibotta/views/R$id;->iibCtaButton:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;->getIbottaImageButtonViewState()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->updateViewState(Lcom/ibotta/android/views/base/button/IbottaButtonViewState;)V

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;->isEntireRowSelectable()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->initWholeRowSelectability(Z)V

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemView;->viewState:Lcom/ibotta/android/views/search/suggested/SuggestedSearchItemViewState;

    return-void
.end method
