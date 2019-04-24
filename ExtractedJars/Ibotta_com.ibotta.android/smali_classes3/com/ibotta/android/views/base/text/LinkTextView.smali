.class public final Lcom/ibotta/android/views/base/text/LinkTextView;
.super Landroid/support/v7/widget/AppCompatTextView;
.source "LinkTextView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/AppCompatTextView;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/base/text/LinkTextViewState;",
        "Lcom/ibotta/android/views/components/ClickableViewEvent;",
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
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0003H\u0016R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/ibotta/android/views/base/text/LinkTextView;",
        "Landroid/support/v7/widget/AppCompatTextView;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/base/text/LinkTextViewState;",
        "Lcom/ibotta/android/views/components/ClickableViewEvent;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "viewEvent",
        "bindViewEvents",
        "",
        "viewEvents",
        "getBeginIndex",
        "searchTerm",
        "",
        "text",
        "getEndIndex",
        "updateViewState",
        "viewState",
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

.field private viewEvent:Lcom/ibotta/android/views/components/ClickableViewEvent;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/base/text/LinkTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/base/text/LinkTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 21
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 19
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const p3, 0x1010084

    .line 20
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/base/text/LinkTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewEvent$p(Lcom/ibotta/android/views/base/text/LinkTextView;)Lcom/ibotta/android/views/components/ClickableViewEvent;
    .locals 0

    .line 17
    iget-object p0, p0, Lcom/ibotta/android/views/base/text/LinkTextView;->viewEvent:Lcom/ibotta/android/views/components/ClickableViewEvent;

    return-object p0
.end method

.method public static final synthetic access$setViewEvent$p(Lcom/ibotta/android/views/base/text/LinkTextView;Lcom/ibotta/android/views/components/ClickableViewEvent;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/views/base/text/LinkTextView;->viewEvent:Lcom/ibotta/android/views/components/ClickableViewEvent;

    return-void
.end method

.method private final getBeginIndex(Ljava/lang/String;Ljava/lang/String;)I
    .locals 6

    .line 64
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p1

    return p1
.end method

.method private final getEndIndex(Ljava/lang/String;Ljava/lang/String;)I
    .locals 6

    .line 66
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p2, p1

    return p2
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/base/text/LinkTextView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/base/text/LinkTextView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/base/text/LinkTextView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/base/text/LinkTextView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/base/text/LinkTextView;->_$_findViewCache:Ljava/util/HashMap;

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

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/views/base/text/LinkTextView;->viewEvent:Lcom/ibotta/android/views/components/ClickableViewEvent;

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/views/components/ClickableViewEvent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/text/LinkTextView;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)V
    .locals 6
    .param p1    # Lcom/ibotta/android/views/base/text/LinkTextViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v0, Landroid/text/SpannableString;

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->getText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->getText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->getLinkText()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "Link text is not in text. Cannot linkify"

    .line 30
    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->getText()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/text/LinkTextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 35
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->getLinkText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/ibotta/android/views/base/text/LinkTextView;->getBeginIndex(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->getLinkText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/text/LinkTextViewState;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lcom/ibotta/android/views/base/text/LinkTextView;->getEndIndex(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    .line 38
    new-instance v2, Lcom/ibotta/android/views/base/text/LinkTextSpan;

    new-instance v3, Lcom/ibotta/android/views/base/text/LinkTextView$updateViewState$clickableSpan$1;

    invoke-direct {v3, p0}, Lcom/ibotta/android/views/base/text/LinkTextView$updateViewState$clickableSpan$1;-><init>(Lcom/ibotta/android/views/base/text/LinkTextView;)V

    check-cast v3, Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;

    invoke-direct {v2, v3}, Lcom/ibotta/android/views/base/text/LinkTextSpan;-><init>(Lcom/ibotta/android/views/base/text/LinkTextSpan$OnSpanClickListener;)V

    const/16 v3, 0x21

    .line 44
    invoke-virtual {v0, v2, v1, p1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 50
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p0}, Lcom/ibotta/android/views/base/text/LinkTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/ibotta/views/R$color;->blowhole_green:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-direct {v2, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 52
    invoke-virtual {v0, v2, v1, p1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 58
    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/text/LinkTextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/text/LinkTextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/views/base/text/LinkTextViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/text/LinkTextView;->updateViewState(Lcom/ibotta/android/views/base/text/LinkTextViewState;)V

    return-void
.end method
