.class public final Lcom/ibotta/android/views/search/SearchView;
.super Landroid/widget/LinearLayout;
.source "SearchView.kt"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/LinearLayout;",
        "Landroid/text/TextWatcher;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/search/SearchViewState;",
        "Lcom/ibotta/android/views/search/SearchViewEvents;",
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
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B%\u0008\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J(\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0016J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000b2\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u0002J(\u0010)\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"
    }
    d2 = {
        "Lcom/ibotta/android/views/search/SearchView;",
        "Landroid/widget/LinearLayout;",
        "Landroid/text/TextWatcher;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/search/SearchViewState;",
        "Lcom/ibotta/android/views/search/SearchViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "hesitationTimer",
        "Ljava/util/Timer;",
        "previousSearchText",
        "",
        "searchEditText",
        "Landroid/widget/EditText;",
        "getSearchEditText",
        "()Landroid/widget/EditText;",
        "searchText",
        "getSearchText",
        "()Ljava/lang/String;",
        "viewEvents",
        "viewState",
        "afterTextChanged",
        "",
        "s",
        "Landroid/text/Editable;",
        "beforeTextChanged",
        "",
        "start",
        "count",
        "after",
        "bindViewEvents",
        "onEditorAction",
        "",
        "actionId",
        "event",
        "Landroid/view/KeyEvent;",
        "onTextChanged",
        "before",
        "updateSearchText",
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

.field private hesitationTimer:Ljava/util/Timer;

.field private previousSearchText:Ljava/lang/String;

.field private viewEvents:Lcom/ibotta/android/views/search/SearchViewEvents;

.field private viewState:Lcom/ibotta/android/views/search/SearchViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/search/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/search/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8
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

    .line 33
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    new-instance p2, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xf

    const/4 v7, 0x0

    move-object v1, p2

    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p2, Lcom/ibotta/android/views/search/SearchViewState;

    iput-object p2, p0, Lcom/ibotta/android/views/search/SearchView;->viewState:Lcom/ibotta/android/views/search/SearchViewState;

    .line 38
    new-instance p2, Ljava/util/Timer;

    invoke-direct {p2}, Ljava/util/Timer;-><init>()V

    iput-object p2, p0, Lcom/ibotta/android/views/search/SearchView;->hesitationTimer:Ljava/util/Timer;

    const-string p2, ""

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/views/search/SearchView;->previousSearchText:Ljava/lang/String;

    .line 45
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/ibotta/views/R$layout;->view_search:I

    move-object p3, p0

    check-cast p3, Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 46
    sget p1, Lcom/ibotta/views/R$id;->etSearchText:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    move-object p2, p0

    check-cast p2, Landroid/text/TextWatcher;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 47
    sget p1, Lcom/ibotta/views/R$id;->ibSearchLeft:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    new-instance p2, Lcom/ibotta/android/views/search/SearchView$1;

    invoke-direct {p2, p0}, Lcom/ibotta/android/views/search/SearchView$1;-><init>(Lcom/ibotta/android/views/search/SearchView;)V

    check-cast p2, Landroid/view/View$OnClickListener;

    instance-of p3, p1, Landroid/view/View;

    if-nez p3, :cond_0

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 48
    :goto_0
    sget p1, Lcom/ibotta/views/R$id;->ibSearchRight:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    new-instance p2, Lcom/ibotta/android/views/search/SearchView$2;

    invoke-direct {p2, p0}, Lcom/ibotta/android/views/search/SearchView$2;-><init>(Lcom/ibotta/android/views/search/SearchView;)V

    check-cast p2, Landroid/view/View$OnClickListener;

    instance-of p3, p1, Landroid/view/View;

    if-nez p3, :cond_1

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 49
    :goto_1
    sget p1, Lcom/ibotta/views/R$id;->etSearchText:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    new-instance p2, Lcom/ibotta/android/views/search/SearchView$3;

    invoke-direct {p2, p0}, Lcom/ibotta/android/views/search/SearchView$3;-><init>(Lcom/ibotta/android/views/search/SearchView;)V

    check-cast p2, Landroid/view/View$OnFocusChangeListener;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 50
    sget p1, Lcom/ibotta/views/R$id;->etSearchText:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    new-instance p2, Lcom/ibotta/android/views/search/SearchView$4;

    invoke-direct {p2, p0}, Lcom/ibotta/android/views/search/SearchView$4;-><init>(Lcom/ibotta/android/views/search/SearchView;)V

    check-cast p2, Landroid/widget/TextView$OnEditorActionListener;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 32
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/search/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getSearchText$p(Lcom/ibotta/android/views/search/SearchView;)Ljava/lang/String;
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/views/search/SearchView;->getSearchText()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewEvents$p(Lcom/ibotta/android/views/search/SearchView;)Lcom/ibotta/android/views/search/SearchViewEvents;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/ibotta/android/views/search/SearchView;->viewEvents:Lcom/ibotta/android/views/search/SearchViewEvents;

    return-object p0
.end method

.method public static final synthetic access$getViewState$p(Lcom/ibotta/android/views/search/SearchView;)Lcom/ibotta/android/views/search/SearchViewState;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/ibotta/android/views/search/SearchView;->viewState:Lcom/ibotta/android/views/search/SearchViewState;

    return-object p0
.end method

.method public static final synthetic access$onEditorAction(Lcom/ibotta/android/views/search/SearchView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/views/search/SearchView;->onEditorAction(ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$setViewEvents$p(Lcom/ibotta/android/views/search/SearchView;Lcom/ibotta/android/views/search/SearchViewEvents;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/views/search/SearchView;->viewEvents:Lcom/ibotta/android/views/search/SearchViewEvents;

    return-void
.end method

.method public static final synthetic access$setViewState$p(Lcom/ibotta/android/views/search/SearchView;Lcom/ibotta/android/views/search/SearchViewState;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/views/search/SearchView;->viewState:Lcom/ibotta/android/views/search/SearchViewState;

    return-void
.end method

.method private final getSearchText()Ljava/lang/String;
    .locals 2

    .line 41
    sget v0, Lcom/ibotta/views/R$id;->etSearchText:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    const-string v1, "etSearchText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final onEditorAction(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    .line 61
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result p2

    if-eqz p2, :cond_2

    :cond_0
    const/4 p2, 0x3

    if-ne p1, p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    .line 62
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/views/search/SearchView;->viewEvents:Lcom/ibotta/android/views/search/SearchViewEvents;

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lcom/ibotta/android/views/search/SearchView;->getSearchText()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/views/search/SearchViewEvents;->onSearch(Ljava/lang/String;)V

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private final updateSearchText(Lcom/ibotta/android/views/search/SearchViewState;)V
    .locals 3

    .line 105
    instance-of v0, p1, Lcom/ibotta/android/views/search/SearchTextViewState;

    if-eqz v0, :cond_1

    .line 111
    sget v0, Lcom/ibotta/views/R$id;->etSearchText:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    move-object v1, p0

    check-cast v1, Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 112
    sget v0, Lcom/ibotta/views/R$id;->etSearchText:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    const-string v2, "etSearchText"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lcom/ibotta/android/views/search/SearchTextViewState;

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchTextViewState;->getSearchText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    sget v0, Lcom/ibotta/views/R$id;->etSearchText:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchTextViewState;->getSearchText()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 113
    :cond_0
    sget v0, Lcom/ibotta/views/R$id;->etSearchText:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    const-string v2, "etSearchText"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchTextViewState;->getHint()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 114
    sget p1, Lcom/ibotta/views/R$id;->etSearchText:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/search/SearchView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/search/SearchView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/search/SearchView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/search/SearchView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/search/SearchView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3
    .param p1    # Landroid/text/Editable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object p1, p0, Lcom/ibotta/android/views/search/SearchView;->previousSearchText:Ljava/lang/String;

    invoke-direct {p0}, Lcom/ibotta/android/views/search/SearchView;->getSearchText()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 87
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/views/search/SearchView;->viewEvents:Lcom/ibotta/android/views/search/SearchViewEvents;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/ibotta/android/views/search/SearchViewEvents;->onSearchTextChanged()V

    .line 88
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/views/search/SearchView;->hesitationTimer:Ljava/util/Timer;

    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    .line 89
    new-instance p1, Ljava/util/Timer;

    invoke-direct {p1}, Ljava/util/Timer;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/search/SearchView;->hesitationTimer:Ljava/util/Timer;

    .line 90
    iget-object p1, p0, Lcom/ibotta/android/views/search/SearchView;->hesitationTimer:Ljava/util/Timer;

    new-instance v0, Lcom/ibotta/android/views/search/SearchView$afterTextChanged$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/search/SearchView$afterTextChanged$1;-><init>(Lcom/ibotta/android/views/search/SearchView;)V

    check-cast v0, Ljava/util/TimerTask;

    .line 92
    invoke-static {}, Lcom/ibotta/android/views/search/SearchViewKt;->access$getHESITATION_DELAY$p()J

    move-result-wide v1

    .line 90
    invoke-virtual {p1, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

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

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/views/search/SearchView;->getSearchText()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/views/search/SearchView;->previousSearchText:Ljava/lang/String;

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 31
    check-cast p1, Lcom/ibotta/android/views/search/SearchViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/SearchView;->bindViewEvents(Lcom/ibotta/android/views/search/SearchViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/search/SearchViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/search/SearchViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    iput-object p1, p0, Lcom/ibotta/android/views/search/SearchView;->viewEvents:Lcom/ibotta/android/views/search/SearchViewEvents;

    return-void
.end method

.method public final getSearchEditText()Landroid/widget/EditText;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 40
    sget v0, Lcom/ibotta/views/R$id;->etSearchText:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    const-string v1, "etSearchText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
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

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 31
    check-cast p1, Lcom/ibotta/android/views/search/SearchViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/SearchView;->updateViewState(Lcom/ibotta/android/views/search/SearchViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/search/SearchViewState;)V
    .locals 3
    .param p1    # Lcom/ibotta/android/views/search/SearchViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/search/SearchView;->updateSearchText(Lcom/ibotta/android/views/search/SearchViewState;)V

    .line 97
    sget v0, Lcom/ibotta/views/R$id;->ibSearchRight:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchViewState;->getRightIcon()I

    move-result v2

    invoke-static {v1, v2}, Landroid/support/v7/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 98
    sget v0, Lcom/ibotta/views/R$id;->ibSearchLeft:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchViewState;->getLeftIcon()I

    move-result v2

    invoke-static {v1, v2}, Landroid/support/v7/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 99
    sget v0, Lcom/ibotta/views/R$id;->ibSearchRight:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    const-string v1, "ibSearchRight"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchViewState;->getRightIconDesc()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 100
    sget v0, Lcom/ibotta/views/R$id;->ibSearchLeft:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/search/SearchView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    const-string v1, "ibSearchLeft"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/SearchViewState;->getLeftIconDesc()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 101
    iput-object p1, p0, Lcom/ibotta/android/views/search/SearchView;->viewState:Lcom/ibotta/android/views/search/SearchViewState;

    return-void
.end method
