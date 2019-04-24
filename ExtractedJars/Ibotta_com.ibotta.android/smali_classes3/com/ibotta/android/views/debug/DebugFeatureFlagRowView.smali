.class public final Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;
.super Landroid/support/constraint/ConstraintLayout;
.source "DebugFeatureFlagRowView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;",
        "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDebugFeatureFlagRowView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugFeatureFlagRowView.kt\ncom/ibotta/android/views/debug/DebugFeatureFlagRowView\n*L\n1#1,60:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0003H\u0017R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;",
        "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "rowViewEvents",
        "bindViewEvents",
        "",
        "viewEvents",
        "initDebugButton",
        "viewState",
        "initDescription",
        "initName",
        "initRowTap",
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

.field private rowViewEvents:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 22
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

    .line 20
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 21
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getRowViewEvents$p(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;)Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;
    .locals 0

    .line 18
    iget-object p0, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->rowViewEvents:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;

    return-object p0
.end method

.method public static final synthetic access$setRowViewEvents$p(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->rowViewEvents:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;

    return-void
.end method

.method private final initDebugButton(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V
    .locals 2

    .line 54
    sget v0, Lcom/ibotta/views/R$id;->ivDebug:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivDebug"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;->isDebugVisible()Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    .line 56
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final initDescription(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V
    .locals 3

    .line 42
    sget v0, Lcom/ibotta/views/R$id;->tvDescription:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvDescription"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;->getTestDescription()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    sget v0, Lcom/ibotta/views/R$id;->tvDescription:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvDescription"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;->getTestDescription()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ne p1, v1, :cond_1

    const/16 v2, 0x8

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void

    .line 45
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final initName(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V
    .locals 2

    .line 38
    sget v0, Lcom/ibotta/views/R$id;->tvName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;->getTestName()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final initRowTap(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V
    .locals 1

    .line 50
    new-instance v0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView$initRowTap$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView$initRowTap$1;-><init>(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of p1, p0, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object p1, p0

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->bindViewEvents(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->rowViewEvents:Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->updateViewState(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->initName(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->initDescription(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->initRowTap(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowView;->initDebugButton(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)V

    return-void
.end method
