.class public final Lcom/ibotta/android/views/base/info/InformationRowView;
.super Landroid/widget/FrameLayout;
.source "InformationRowView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/FrameLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/base/info/InformationRowViewState;",
        "Lcom/ibotta/android/views/base/info/InformationRowViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInformationRowView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InformationRowView.kt\ncom/ibotta/android/views/base/info/InformationRowView\n*L\n1#1,58:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/ibotta/android/views/base/info/InformationRowView;",
        "Landroid/widget/FrameLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/base/info/InformationRowViewState;",
        "Lcom/ibotta/android/views/base/info/InformationRowViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "isMisspelled",
        "",
        "viewEvents",
        "viewState",
        "bindViewEvents",
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

.field private isMisspelled:Z

.field private viewEvents:Lcom/ibotta/android/views/base/info/InformationRowViewEvents;

.field private viewState:Lcom/ibotta/android/views/base/info/InformationRowViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/base/info/InformationRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/base/info/InformationRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    new-instance p1, Lcom/ibotta/android/views/base/info/InformationRowViewState;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xf

    const/4 v7, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/views/base/info/InformationRowViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->viewState:Lcom/ibotta/android/views/base/info/InformationRowViewState;

    .line 34
    new-instance p1, Lcom/ibotta/android/views/base/info/InformationRowView$1;

    invoke-direct {p1, p0}, Lcom/ibotta/android/views/base/info/InformationRowView$1;-><init>(Lcom/ibotta/android/views/base/info/InformationRowView;)V

    check-cast p1, Landroid/view/View$OnClickListener;

    instance-of p2, p0, Landroid/view/View;

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/info/InformationRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object p2, p0

    check-cast p2, Landroid/view/View;

    invoke-static {p2, p1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
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

    const/4 p3, 0x0

    .line 26
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/base/info/InformationRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewEvents$p(Lcom/ibotta/android/views/base/info/InformationRowView;)Lcom/ibotta/android/views/base/info/InformationRowViewEvents;
    .locals 1

    .line 23
    iget-object p0, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->viewEvents:Lcom/ibotta/android/views/base/info/InformationRowViewEvents;

    if-nez p0, :cond_0

    const-string v0, "viewEvents"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final synthetic access$getViewState$p(Lcom/ibotta/android/views/base/info/InformationRowView;)Lcom/ibotta/android/views/base/info/InformationRowViewState;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->viewState:Lcom/ibotta/android/views/base/info/InformationRowViewState;

    return-object p0
.end method

.method public static final synthetic access$setViewEvents$p(Lcom/ibotta/android/views/base/info/InformationRowView;Lcom/ibotta/android/views/base/info/InformationRowViewEvents;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->viewEvents:Lcom/ibotta/android/views/base/info/InformationRowViewEvents;

    return-void
.end method

.method public static final synthetic access$setViewState$p(Lcom/ibotta/android/views/base/info/InformationRowView;Lcom/ibotta/android/views/base/info/InformationRowViewState;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->viewState:Lcom/ibotta/android/views/base/info/InformationRowViewState;

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/base/info/InformationRowViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/base/info/InformationRowViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/base/info/InformationRowView;

    iput-object p1, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->viewEvents:Lcom/ibotta/android/views/base/info/InformationRowViewEvents;

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/views/base/info/InformationRowViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/info/InformationRowView;->bindViewEvents(Lcom/ibotta/android/views/base/info/InformationRowViewEvents;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/base/info/InformationRowViewState;)V
    .locals 3
    .param p1    # Lcom/ibotta/android/views/base/info/InformationRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    sget v0, Lcom/ibotta/views/R$id;->tvInfo:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/info/InformationRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvInfo"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v1}, Lcom/ibotta/android/views/ViewsModule;->getAppHelper()Lcom/ibotta/android/util/AppHelper;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/info/InformationRowViewState;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/AppHelper;->getHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    invoke-static {}, Lcom/ibotta/android/views/base/info/InformationRowViewKt;->access$getMisspelledThresholdSet$p()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/info/InformationRowViewState;->getConfidenceLevel()Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->isMisspelled:Z

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/views/base/info/InformationRowView;->viewState:Lcom/ibotta/android/views/base/info/InformationRowViewState;

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 23
    check-cast p1, Lcom/ibotta/android/views/base/info/InformationRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/info/InformationRowView;->updateViewState(Lcom/ibotta/android/views/base/info/InformationRowViewState;)V

    return-void
.end method
