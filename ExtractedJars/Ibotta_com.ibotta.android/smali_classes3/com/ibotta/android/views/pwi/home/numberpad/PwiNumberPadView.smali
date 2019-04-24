.class public final Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;
.super Landroid/support/constraint/ConstraintLayout;
.source "PwiNumberPadView.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Landroid/view/View$OnClickListener;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;",
        "Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPwiNumberPadView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PwiNumberPadView.kt\ncom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,76:1\n1077#2,2:77\n1077#2,2:79\n1077#2,2:81\n*E\n*S KotlinDebug\n*F\n+ 1 PwiNumberPadView.kt\ncom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView\n*L\n51#1,2:77\n57#1,2:79\n68#1,2:81\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u00020\u0005B%\u0008\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;",
        "Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;",
        "Landroid/view/View$OnClickListener;",
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
        "onClick",
        "v",
        "Landroid/view/View;",
        "updateOnClickListener",
        "updateTextColor",
        "textColorResId",
        "updateViewEnabled",
        "enabled",
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

.field private viewEvents:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;

.field private viewState:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 29
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    sget p2, Lcom/ibotta/views/R$color;->white:I

    invoke-static {p1, p2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->setBackgroundColor(I)V

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/ibotta/views/R$layout;->view_pwi_number_pad:I

    move-object p3, p0

    check-cast p3, Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 27
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 28
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final updateOnClickListener(Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;)V
    .locals 4

    const/16 v0, 0xb

    .line 66
    new-array v0, v0, [Landroid/widget/TextView;

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad1:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad2:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad3:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad4:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad5:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad6:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad7:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad8:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad9:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 67
    sget v1, Lcom/ibotta/views/R$id;->tvNumPad0:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad00:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    .line 66
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    .line 81
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 68
    move-object v2, p0

    check-cast v2, Landroid/view/View$OnClickListener;

    instance-of v3, v1, Landroid/view/View;

    if-nez v3, :cond_0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v1, Landroid/view/View;

    invoke-static {v1, v2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 69
    :cond_1
    sget v0, Lcom/ibotta/views/R$id;->tvNumPadBack:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView$updateOnClickListener$2;

    invoke-direct {v1, p1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView$updateOnClickListener$2;-><init>(Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of p1, v0, Landroid/view/View;

    if-nez p1, :cond_2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method

.method private final updateTextColor(I)V
    .locals 3

    const/16 v0, 0xc

    .line 49
    new-array v0, v0, [Landroid/widget/TextView;

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad1:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad2:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad3:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad4:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad5:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad6:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad7:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad8:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad9:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 50
    sget v1, Lcom/ibotta/views/R$id;->tvNumPad0:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad00:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPadBack:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 49
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    .line 77
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final updateViewEnabled(Z)V
    .locals 3

    const/16 v0, 0xc

    .line 55
    new-array v0, v0, [Landroid/widget/TextView;

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad1:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad2:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad3:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad4:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad5:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad6:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad7:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad8:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad9:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 56
    sget v1, Lcom/ibotta/views/R$id;->tvNumPad0:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPad00:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget v1, Lcom/ibotta/views/R$id;->tvNumPadBack:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 55
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    .line 79
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const-string v2, "it"

    .line 57
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 25
    check-cast p1, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->bindViewEvents(Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->viewEvents:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;

    .line 62
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->updateOnClickListener(Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 73
    check-cast p1, Landroid/widget/TextView;

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->viewEvents:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewEvents;->onNumberClick(Ljava/lang/String;)V

    :cond_0
    return-void

    .line 73
    :cond_1
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type android.widget.TextView"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 25
    check-cast p1, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->updateViewState(Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->viewState:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->getTextColorResId()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->updateTextColor(I)V

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->getEnable()Z

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadView;->updateViewEnabled(Z)V

    return-void
.end method
