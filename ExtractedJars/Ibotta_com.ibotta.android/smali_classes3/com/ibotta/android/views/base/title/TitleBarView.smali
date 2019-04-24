.class public final Lcom/ibotta/android/views/base/title/TitleBarView;
.super Landroid/widget/LinearLayout;
.source "TitleBarView.kt"

# interfaces
.implements Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/LinearLayout;",
        "Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTitleBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TitleBarView.kt\ncom/ibotta/android/views/base/title/TitleBarView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n1583#2,3:256\n*E\n*S KotlinDebug\n*F\n+ 1 TitleBarView.kt\ncom/ibotta/android/views/base/title/TitleBarView\n*L\n179#1,3:256\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010 \n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u00015B/\u0008\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u000bH\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0008\u0010!\u001a\u00020\u0016H\u0002J\u0008\u0010\"\u001a\u0004\u0018\u00010#J\u0012\u0010$\u001a\u00020\u001d2\u0008\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0008\u0010\'\u001a\u00020\u0016H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u000bH\u0002J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u000bH\u0002J\u0012\u0010+\u001a\u00020\u00162\u0008\u0010-\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010.\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010/\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0016\u00100\u001a\u00020\u00162\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u001001H\u0002J\u0010\u00102\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u00103\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u00104\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0004H\u0016R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"
    }
    d2 = {
        "Lcom/ibotta/android/views/base/title/TitleBarView;",
        "Landroid/widget/LinearLayout;",
        "Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "defStyleRes",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "actionables",
        "Ljava/util/ArrayList;",
        "Lcom/ibotta/api/model/base/Actionable;",
        "popupMenu",
        "Landroid/support/v7/widget/PopupMenu;",
        "viewEvents",
        "viewState",
        "applyAttributes",
        "",
        "applySubtitle",
        "subtitle",
        "applyTitle",
        "titleResId",
        "applyTitleCentered",
        "centerTitle",
        "",
        "applyTitleColor",
        "colorRes",
        "bindViewEvents",
        "createOverflowMenu",
        "getTitleValue",
        "",
        "onMenuItemClick",
        "item",
        "Landroid/view/MenuItem;",
        "onOverflowClicked",
        "setIconDimen",
        "size",
        "setIconSize",
        "setImageViewResource",
        "iconResId",
        "iconUrl",
        "updateIcon",
        "updateMargins",
        "updateMenuActions",
        "",
        "updateSubtitle",
        "updateTitle",
        "updateViewState",
        "TitleBarViewEvents",
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

.field private final actionables:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/ibotta/api/model/base/Actionable;",
            ">;"
        }
    .end annotation
.end field

.field private popupMenu:Landroid/support/v7/widget/PopupMenu;

.field private viewEvents:Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;

.field private viewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/base/title/TitleBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
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

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/base/title/TitleBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7
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

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/base/title/TitleBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
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

    .line 36
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 39
    sget-object p3, Lcom/ibotta/android/views/base/title/TitleBarViewState;->EMPTY:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    iput-object p3, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->viewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    .line 42
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->actionables:Ljava/util/ArrayList;

    const/4 p3, 0x0

    .line 51
    invoke-virtual {p0, p3}, Lcom/ibotta/android/views/base/title/TitleBarView;->setFocusable(Z)V

    const/4 p3, 0x1

    .line 52
    invoke-virtual {p0, p3}, Lcom/ibotta/android/views/base/title/TitleBarView;->setOrientation(I)V

    .line 54
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p4, Lcom/ibotta/views/R$layout;->view_title_bar:I

    move-object v0, p0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {p1, p4, v0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 56
    invoke-direct {p0, p2}, Lcom/ibotta/android/views/base/title/TitleBarView;->applyAttributes(Landroid/util/AttributeSet;)V

    .line 58
    sget p1, Lcom/ibotta/views/R$id;->ibOverflow:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    new-instance p2, Lcom/ibotta/android/views/base/title/TitleBarView$1;

    invoke-direct {p2, p0}, Lcom/ibotta/android/views/base/title/TitleBarView$1;-><init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V

    check-cast p2, Landroid/view/View$OnClickListener;

    instance-of p3, p1, Landroid/view/View;

    if-nez p3, :cond_0

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    .line 35
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/views/base/title/TitleBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static final synthetic access$onOverflowClicked(Lcom/ibotta/android/views/base/title/TitleBarView;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->onOverflowClicked()V

    return-void
.end method

.method private final applyAttributes(Landroid/util/AttributeSet;)V
    .locals 5

    .line 185
    invoke-virtual {p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lcom/ibotta/views/R$styleable;->TitleBarView:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 188
    :try_start_0
    sget v0, Lcom/ibotta/views/R$styleable;->TitleBarView_titleBarTitle:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 189
    sget v1, Lcom/ibotta/views/R$styleable;->TitleBarView_titleBarSubTitle:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 190
    sget v3, Lcom/ibotta/views/R$styleable;->TitleBarView_titleCenter:I

    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    .line 191
    sget v4, Lcom/ibotta/views/R$styleable;->TitleBarView_titleBarTitleColor:I

    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 195
    invoke-direct {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->applyTitle(I)V

    .line 196
    invoke-direct {p0, v2}, Lcom/ibotta/android/views/base/title/TitleBarView;->applyTitleColor(I)V

    .line 197
    invoke-direct {p0, v1}, Lcom/ibotta/android/views/base/title/TitleBarView;->applySubtitle(I)V

    .line 198
    invoke-direct {p0, v3}, Lcom/ibotta/android/views/base/title/TitleBarView;->applyTitleCentered(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 200
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method private final applySubtitle(I)V
    .locals 1

    if-lez p1, :cond_0

    .line 218
    sget v0, Lcom/ibotta/views/R$id;->tvSubtitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 219
    sget p1, Lcom/ibotta/views/R$id;->tvSubtitle:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "tvSubtitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 221
    :cond_0
    sget p1, Lcom/ibotta/views/R$id;->tvSubtitle:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "tvSubtitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private final applyTitle(I)V
    .locals 1

    if-lez p1, :cond_0

    .line 205
    sget v0, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 207
    :cond_0
    sget p1, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "tvTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private final applyTitleCentered(Z)V
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 225
    sget p1, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 226
    sget p1, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "tvTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    goto :goto_0

    .line 228
    :cond_0
    sget p1, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x800003

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 229
    sget p1, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    :goto_0
    return-void
.end method

.method private final applyTitleColor(I)V
    .locals 3

    .line 211
    sget v0, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x1

    if-lez p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-ne v2, v1, :cond_1

    .line 212
    invoke-virtual {p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    goto :goto_1

    :cond_1
    if-nez v2, :cond_2

    .line 213
    invoke-virtual {p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v1, Lcom/ibotta/views/R$color;->gray_4a:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    .line 211
    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 213
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final createOverflowMenu()V
    .locals 7

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->popupMenu:Landroid/support/v7/widget/PopupMenu;

    if-nez v0, :cond_0

    .line 168
    new-instance v0, Landroid/support/v7/widget/PopupMenu;

    .line 169
    sget v1, Lcom/ibotta/views/R$id;->ibOverflow:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    const-string v2, "ibOverflow"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 170
    sget v1, Lcom/ibotta/views/R$id;->ibOverflow:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/widget/ImageButton;

    const/16 v4, 0x11

    const/4 v5, 0x0

    const v6, 0x10302b5

    move-object v1, v0

    .line 168
    invoke-direct/range {v1 .. v6}, Landroid/support/v7/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;III)V

    iput-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->popupMenu:Landroid/support/v7/widget/PopupMenu;

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->popupMenu:Landroid/support/v7/widget/PopupMenu;

    if-nez v0, :cond_1

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    invoke-virtual {v0}, Landroid/support/v7/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->popupMenu:Landroid/support/v7/widget/PopupMenu;

    if-nez v0, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_2
    move-object v1, p0

    check-cast v1, Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->actionables:Ljava/util/ArrayList;

    check-cast v0, Ljava/lang/Iterable;

    .line 257
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast v3, Lcom/ibotta/api/model/base/Actionable;

    .line 180
    iget-object v5, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->popupMenu:Landroid/support/v7/widget/PopupMenu;

    if-nez v5, :cond_4

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_4
    invoke-virtual {v5}, Landroid/support/v7/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object v5

    invoke-interface {v3}, Lcom/ibotta/api/model/base/Actionable;->getId()I

    move-result v6

    invoke-interface {v3}, Lcom/ibotta/api/model/base/Actionable;->getText()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v5, v1, v6, v2, v3}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move v2, v4

    goto :goto_0

    :cond_5
    return-void
.end method

.method private final onOverflowClicked()V
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->viewEvents:Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;->onTitleMenuClicked()V

    .line 252
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->popupMenu:Landroid/support/v7/widget/PopupMenu;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/support/v7/widget/PopupMenu;->show()V

    :cond_1
    return-void
.end method

.method private final setIconDimen(I)V
    .locals 3

    .line 105
    sget v0, Lcom/ibotta/views/R$id;->ivIcon:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lcom/ibotta/views/R$id;->ivIcon:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const-string v2, "ivIcon"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 106
    invoke-virtual {p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 107
    invoke-virtual {p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 105
    check-cast v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final setIconSize(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 98
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getIconSize()Lcom/ibotta/android/views/base/title/IconSize;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/views/base/title/TitleBarView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/IconSize;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 100
    :pswitch_0
    sget p1, Lcom/ibotta/views/R$dimen;->size_19:I

    invoke-direct {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->setIconDimen(I)V

    goto :goto_0

    .line 99
    :pswitch_1
    sget p1, Lcom/ibotta/views/R$dimen;->size_24:I

    invoke-direct {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->setIconDimen(I)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final setImageViewResource(I)V
    .locals 1

    if-lez p1, :cond_0

    .line 112
    sget v0, Lcom/ibotta/views/R$id;->ivIcon:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 113
    sget p1, Lcom/ibotta/views/R$id;->ivIcon:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v0, "ivIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 115
    :cond_0
    sget p1, Lcom/ibotta/views/R$id;->ivIcon:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v0, "ivIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private final setImageViewResource(Ljava/lang/String;)V
    .locals 6

    .line 119
    sget v0, Lcom/ibotta/views/R$id;->ivIcon:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-ne v1, v3, :cond_2

    const/16 v2, 0x8

    goto :goto_2

    :cond_2
    if-nez v1, :cond_3

    .line 122
    sget-object v1, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v1}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "context"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget v4, Lcom/ibotta/views/R$id;->ivIcon:I

    invoke-virtual {p0, v4}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    sget-object v5, Lcom/ibotta/android/views/images/Sizes;->MODEL_C_RETAILER_ROW:Lcom/ibotta/android/views/images/Sizes;

    check-cast v5, Lcom/ibotta/android/images/ImageCache$Size;

    invoke-interface {v1, v3, p1, v4, v5}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 119
    :goto_2
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    .line 123
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final updateIcon(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 3

    .line 86
    sget v0, Lcom/ibotta/views/R$id;->ivIcon:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClipToOutline(Z)V

    .line 87
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->setIconSize(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getIconRes()Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->viewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    invoke-virtual {v2}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getIconRes()Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 90
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getIconRes()Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    .line 91
    instance-of v1, v0, Lcom/ibotta/android/views/generic/RawString;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getIconRes()Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/generic/RawString;

    invoke-virtual {p1}, Lcom/ibotta/android/views/generic/RawString;->getString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->setImageViewResource(Ljava/lang/String;)V

    goto :goto_0

    .line 92
    :cond_0
    instance-of v0, v0, Lcom/ibotta/android/views/generic/ResId;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getIconRes()Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/generic/ResId;

    invoke-virtual {p1}, Lcom/ibotta/android/views/generic/ResId;->getResource()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->setImageViewResource(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final updateMargins(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 2

    .line 143
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getTopMargin()I

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->viewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getTopMargin()I

    move-result v1

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getTopMargin()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 147
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 148
    invoke-virtual {p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getTopMargin()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->topMargin:I

    .line 149
    check-cast v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 147
    :cond_1
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method private final updateMenuActions(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/base/Actionable;",
            ">;)V"
        }
    .end annotation

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->actionables:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->actionables:Ljava/util/ArrayList;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 157
    sget p1, Lcom/ibotta/views/R$id;->ibOverflow:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    const-string v0, "ibOverflow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->actionables:Ljava/util/ArrayList;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    .line 159
    invoke-direct {p0}, Lcom/ibotta/android/views/base/title/TitleBarView;->createOverflowMenu()V

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const/16 v0, 0x8

    .line 157
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    return-void

    .line 162
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final updateSubtitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 3

    .line 129
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->viewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 133
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    .line 134
    sget p1, Lcom/ibotta/views/R$id;->tvSubtitle:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "tvSubtitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 136
    :cond_3
    sget v0, Lcom/ibotta/views/R$id;->tvSubtitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v2, "tvSubtitle"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getSubtitle()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    sget p1, Lcom/ibotta/views/R$id;->tvSubtitle:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "tvSubtitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method private final updateTitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 2

    .line 72
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getTitle()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->viewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 73
    sget v0, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getTitle()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    iput-object p1, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->viewEvents:Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 34
    check-cast p1, Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->bindViewEvents(Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;)V

    return-void
.end method

.method public final getTitleValue()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 78
    sget v0, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ne v0, v1, :cond_1

    .line 79
    sget v0, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 80
    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 6
    .param p1    # Landroid/view/MenuItem;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 243
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->actionables:Ljava/util/ArrayList;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/ibotta/api/model/base/Actionable;

    invoke-interface {v4}, Lcom/ibotta/api/model/base/Actionable;->getId()I

    move-result v4

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v5

    if-ne v4, v5, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    check-cast v2, Lcom/ibotta/api/model/base/Actionable;

    if-eqz v2, :cond_5

    .line 244
    iget-object p1, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->viewEvents:Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;

    if-eqz p1, :cond_4

    invoke-interface {p1, v2}, Lcom/ibotta/android/views/base/title/TitleBarView$TitleBarViewEvents;->onTitleMenuItemClicked(Lcom/ibotta/api/model/base/Actionable;)V

    :cond_4
    const/4 v0, 0x1

    :cond_5
    return v0
.end method

.method public updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/base/title/TitleBarViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateTitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 63
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateIcon(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 64
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateSubtitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 65
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateMargins(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 66
    invoke-virtual {p1}, Lcom/ibotta/android/views/base/title/TitleBarViewState;->getActionables()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateMenuActions(Ljava/util/List;)V

    .line 68
    iput-object p1, p0, Lcom/ibotta/android/views/base/title/TitleBarView;->viewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 34
    check-cast p1, Lcom/ibotta/android/views/base/title/TitleBarViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
