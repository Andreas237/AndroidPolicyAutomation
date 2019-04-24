.class public final Lcom/ibotta/android/views/messages/alert/AlertMessageContent;
.super Landroid/support/v7/widget/CardView;
.source "AlertMessageContent.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/CardView;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;",
        "Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAlertMessageContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertMessageContent.kt\ncom/ibotta/android/views/messages/alert/AlertMessageContent\n*L\n1#1,93:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0006\u0010\u0015\u001a\u00020\u0013J\u0008\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0006\u0010\u0019\u001a\u00020\u0013J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0003H\u0017R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006$"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/AlertMessageContent;",
        "Landroid/support/v7/widget/CardView;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;",
        "Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "alertMessage",
        "Lcom/ibotta/android/views/messages/alert/AlertMessage;",
        "getAlertMessage",
        "()Lcom/ibotta/android/views/messages/alert/AlertMessage;",
        "setAlertMessage",
        "(Lcom/ibotta/android/views/messages/alert/AlertMessage;)V",
        "bindViewEvents",
        "",
        "viewEvents",
        "initCardView",
        "initDismissButton",
        "initIcon",
        "viewState",
        "initMargins",
        "initMessage",
        "initNegativeText",
        "initPositiveText",
        "initTitle",
        "setupTv",
        "tv",
        "Landroid/widget/TextView;",
        "text",
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

.field private alertMessage:Lcom/ibotta/android/views/messages/alert/AlertMessage;
    .annotation build Lorg/jetbrains/annotations/Nullable;
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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 19
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 20
    sget p3, Landroid/support/v7/cardview/R$attr;->cardViewStyle:I

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final initDismissButton()V
    .locals 2

    .line 69
    sget v0, Lcom/ibotta/views/R$id;->ibDismiss:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    const-string v1, "ibDismiss"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    return-void
.end method

.method private final initIcon(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V
    .locals 2

    .line 72
    sget v0, Lcom/ibotta/views/R$id;->iv_icon:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;->getIconResId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 73
    sget v0, Lcom/ibotta/views/R$id;->iv_icon:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;->getIconResId()I

    move-result p1

    if-nez p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private final initMessage(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V
    .locals 2

    .line 76
    sget v0, Lcom/ibotta/views/R$id;->tv_message:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvMessage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->setupTv(Landroid/widget/TextView;Ljava/lang/String;)V

    return-void
.end method

.method private final initNegativeText(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V
    .locals 2

    .line 85
    sget v0, Lcom/ibotta/views/R$id;->tvNegative:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvNegative"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 86
    sget v0, Lcom/ibotta/views/R$id;->tvNegative:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvNegative"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;->getNegativeText()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->setupTv(Landroid/widget/TextView;Ljava/lang/String;)V

    return-void
.end method

.method private final initPositiveText(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V
    .locals 3

    .line 79
    sget v0, Lcom/ibotta/views/R$id;->tvPositive:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvPositive"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    .line 80
    sget v0, Lcom/ibotta/views/R$id;->tvPositive:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v2, "tvPositive"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;->getPositiveText()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->setupTv(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 81
    sget v0, Lcom/ibotta/views/R$id;->spacer1:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v2, "spacer1"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;->getMessage()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/16 v1, 0x8

    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final initTitle(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V
    .locals 2

    .line 66
    sget v0, Lcom/ibotta/views/R$id;->tv_title:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;->getTitle()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final setupTv(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    .line 90
    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    const/16 v0, 0x8

    :cond_1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->bindViewEvents(Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)V
    .locals 3
    .param p1    # Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    sget v0, Lcom/ibotta/views/R$id;->ibDismiss:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    new-instance v1, Lcom/ibotta/android/views/messages/alert/AlertMessageContent$bindViewEvents$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent$bindViewEvents$1;-><init>(Lcom/ibotta/android/views/messages/alert/AlertMessageContent;Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 40
    :goto_0
    sget v0, Lcom/ibotta/views/R$id;->tvPositive:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Lcom/ibotta/android/views/messages/alert/AlertMessageContent$bindViewEvents$2;

    invoke-direct {v1, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent$bindViewEvents$2;-><init>(Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 41
    :goto_1
    sget v0, Lcom/ibotta/views/R$id;->tvNegative:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Lcom/ibotta/android/views/messages/alert/AlertMessageContent$bindViewEvents$3;

    invoke-direct {v1, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent$bindViewEvents$3;-><init>(Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of p1, v0, Landroid/view/View;

    if-nez p1, :cond_2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_2
    return-void
.end method

.method public final getAlertMessage()Lcom/ibotta/android/views/messages/alert/AlertMessage;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->alertMessage:Lcom/ibotta/android/views/messages/alert/AlertMessage;

    return-object v0
.end method

.method public final initCardView()V
    .locals 2

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 58
    sget v1, Lcom/ibotta/views/R$dimen;->size_4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->setCardElevation(F)V

    const/4 v1, 0x0

    .line 59
    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->setPreventCornerOverlap(Z)V

    .line 60
    sget v1, Lcom/ibotta/views/R$dimen;->size_5:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->setRadius(F)V

    const/4 v0, 0x1

    .line 61
    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->setUseCompatPadding(Z)V

    return-void
.end method

.method public final initMargins()V
    .locals 3

    .line 45
    invoke-virtual {p0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 47
    invoke-virtual {p0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$dimen;->size_32:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 48
    invoke-virtual {p0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$dimen;->size_16:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$dimen;->size_16:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 50
    invoke-virtual {p0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$dimen;->size_16:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 51
    check-cast v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 46
    :cond_0
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final setAlertMessage(Lcom/ibotta/android/views/messages/alert/AlertMessage;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/messages/alert/AlertMessage;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->alertMessage:Lcom/ibotta/android/views/messages/alert/AlertMessage;

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->updateViewState(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->initTitle(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->initDismissButton()V

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->initIcon(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->initMessage(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->initPositiveText(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/messages/alert/AlertMessageContent;->initNegativeText(Lcom/ibotta/android/views/messages/alert/AlertMessageViewState;)V

    return-void
.end method
