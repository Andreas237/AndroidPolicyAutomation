.class public final Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;
.super Landroid/support/constraint/ConstraintLayout;
.source "ImDetailHeaderConstraintLayout.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;",
        "Lcom/ibotta/android/views/components/NoViewEvents;",
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
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;",
        "Lcom/ibotta/android/views/components/NoViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "bindViewEvents",
        "",
        "viewEvents",
        "initErrorSubheader",
        "viewState",
        "initHeader",
        "initImConnectionViewState",
        "initPrimaryMessage",
        "initSubheader",
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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 20
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 18
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 19
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final initErrorSubheader(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V
    .locals 2

    .line 45
    sget v0, Lcom/ibotta/views/R$id;->tvErrorSubheader:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvErrorSubheader"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->getErrorSubtitleText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    sget v0, Lcom/ibotta/views/R$id;->tvErrorSubheader:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvErrorSubheader"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->isSubtitleTextVisible()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private final initHeader(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V
    .locals 2

    .line 36
    sget v0, Lcom/ibotta/views/R$id;->tvHeader:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvHeader"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->getTitleText()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final initImConnectionViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V
    .locals 1

    .line 33
    sget v0, Lcom/ibotta/views/R$id;->icavAnimation:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/im/connection/ImConnectionAnimationView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->getImConnectionViewState()Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/im/connection/ImConnectionAnimationView;->updateViewState(Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)V

    return-void
.end method

.method private final initPrimaryMessage(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V
    .locals 2

    .line 50
    sget v0, Lcom/ibotta/views/R$id;->tvPrimaryMessage:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvPrimaryMessage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->getPrimaryMessage()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final initSubheader(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V
    .locals 2

    .line 40
    sget v0, Lcom/ibotta/views/R$id;->tvSubheader:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSubheader"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->getSubtitleText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    sget v0, Lcom/ibotta/views/R$id;->tvSubheader:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSubheader"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;->isSubtitleTextVisible()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/components/NoViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/components/NoViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 16
    check-cast p1, Lcom/ibotta/android/views/components/NoViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->bindViewEvents(Lcom/ibotta/android/views/components/NoViewEvents;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 16
    check-cast p1, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->updateViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->initImConnectionViewState(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->initHeader(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->initSubheader(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V

    .line 26
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->initErrorSubheader(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderConstraintLayout;->initPrimaryMessage(Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;)V

    return-void
.end method
