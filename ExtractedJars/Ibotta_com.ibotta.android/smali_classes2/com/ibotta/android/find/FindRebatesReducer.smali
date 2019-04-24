.class public final Lcom/ibotta/android/find/FindRebatesReducer;
.super Ljava/lang/Object;
.source "FindRebatesReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/find/FindRebatesReducer;",
        "",
        "titleBarReducer",
        "Lcom/ibotta/android/title/TitleBarReducer;",
        "resources",
        "Landroid/content/res/Resources;",
        "(Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)V",
        "browseByCategoryTitle",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "getBrowseByCategoryTitle",
        "()Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "myFavoritesTitle",
        "getMyFavoritesTitle",
        "getMenuActionables",
        "",
        "Lcom/ibotta/api/model/base/Actionable;",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final browseByCategoryTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final myFavoritesTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)V
    .locals 3
    .param p1    # Lcom/ibotta/android/title/TitleBarReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "titleBarReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/ibotta/android/find/FindRebatesReducer;->resources:Landroid/content/res/Resources;

    .line 16
    sget p2, Lcom/ibotta/android/reducers/R$string;->my_favorites:I

    invoke-static {p2}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p2

    .line 17
    sget v0, Lcom/ibotta/android/reducers/R$drawable;->svg_icon_star_gray_filled_small:I

    invoke-static {v0}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v0

    .line 18
    sget-object v1, Lcom/ibotta/android/views/base/title/IconSize;->SMALL:Lcom/ibotta/android/views/base/title/IconSize;

    .line 19
    invoke-direct {p0}, Lcom/ibotta/android/find/FindRebatesReducer;->getMenuActionables()Ljava/util/List;

    move-result-object v2

    .line 15
    invoke-virtual {p1, p2, v0, v1, v2}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/base/title/IconSize;Ljava/util/List;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/find/FindRebatesReducer;->myFavoritesTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    .line 21
    sget p2, Lcom/ibotta/android/reducers/R$string;->browse_by_category:I

    invoke-static {p2}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/find/FindRebatesReducer;->browseByCategoryTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method

.method private final getMenuActionables()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Actionable;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/find/FindRebatesReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->find_offers_manage_favorites_menu_item:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 25
    new-instance v1, Lcom/ibotta/android/find/SimpleMenuItem;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lcom/ibotta/android/find/SimpleMenuItem;-><init>(ILjava/lang/String;)V

    const-string v2, "menuLabel"

    .line 27
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/ibotta/android/find/SimpleMenuItem;->setLink(Ljava/lang/String;)V

    .line 28
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getBrowseByCategoryTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/find/FindRebatesReducer;->browseByCategoryTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method

.method public final getMyFavoritesTitle()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/find/FindRebatesReducer;->myFavoritesTitle:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
