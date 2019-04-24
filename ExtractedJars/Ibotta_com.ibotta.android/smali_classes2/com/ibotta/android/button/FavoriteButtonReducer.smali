.class public final Lcom/ibotta/android/button/FavoriteButtonReducer;
.super Ljava/lang/Object;
.source "FavoriteButtonReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/button/FavoriteButtonReducer;",
        "",
        "()V",
        "create",
        "Lcom/ibotta/android/views/base/button/IbottaButtonViewState;",
        "retailerModel",
        "Lcom/ibotta/api/model/RetailerModel;",
        "favoriteRetailersManager",
        "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 8
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "retailerModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "favoriteRetailersManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->isFavorited(I)Z

    move-result v1

    .line 19
    new-instance p1, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    if-eqz v1, :cond_0

    .line 20
    sget p2, Lcom/ibotta/android/reducers/R$string;->unfavorite_retailer:I

    goto :goto_0

    :cond_0
    sget p2, Lcom/ibotta/android/reducers/R$string;->favorite_retailer:I

    :goto_0
    move v2, p2

    .line 22
    sget v3, Lcom/ibotta/android/reducers/R$drawable;->button_favorite:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v0, p1

    .line 19
    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;-><init>(ZIIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method
