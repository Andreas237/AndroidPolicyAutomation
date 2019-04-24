.class public final Lcom/ibotta/android/categories/RetailerCategoriesReducer;
.super Ljava/lang/Object;
.source "RetailerCategoriesReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRetailerCategoriesReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetailerCategoriesReducer.kt\ncom/ibotta/android/categories/RetailerCategoriesReducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1301#2:21\n1370#2,3:22\n*E\n*S KotlinDebug\n*F\n+ 1 RetailerCategoriesReducer.kt\ncom/ibotta/android/categories/RetailerCategoriesReducer\n*L\n16#1:21\n16#1,3:22\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0002J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/ibotta/android/categories/RetailerCategoriesReducer;",
        "",
        "()V",
        "createCategoryViewState",
        "Lcom/ibotta/android/views/categories/RetailerCategoryViewState;",
        "category",
        "Lcom/ibotta/api/model/retailer/Category;",
        "createCategoryViewStates",
        "",
        "categories",
        "createRetailerCategoriesViewState",
        "Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;",
        "titleBarViewState",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
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

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final createCategoryViewState(Lcom/ibotta/api/model/retailer/Category;)Lcom/ibotta/android/views/categories/RetailerCategoryViewState;
    .locals 4

    .line 18
    new-instance v0, Lcom/ibotta/android/views/categories/RetailerCategoryViewState;

    .line 19
    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getId()I

    move-result v1

    const/16 v2, 0x9

    invoke-static {v2, v1}, Lcom/ibotta/android/apiandroid/content/ContentId;->create(II)Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object v1

    const-string v2, "ContentId.create(CATEGORY, category.id)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "category.name"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getIconUrl()Ljava/lang/String;

    move-result-object p1

    const-string v3, "category.iconUrl"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {v0, v1, v2, p1}, Lcom/ibotta/android/views/categories/RetailerCategoryViewState;-><init>(Lcom/ibotta/android/apiandroid/content/ContentId;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final createCategoryViewStates(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/categories/RetailerCategoryViewState;",
            ">;"
        }
    .end annotation

    .line 16
    check-cast p1, Ljava/lang/Iterable;

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 22
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 23
    check-cast v1, Lcom/ibotta/api/model/retailer/Category;

    .line 16
    invoke-direct {p0, v1}, Lcom/ibotta/android/categories/RetailerCategoriesReducer;->createCategoryViewState(Lcom/ibotta/api/model/retailer/Category;)Lcom/ibotta/android/views/categories/RetailerCategoryViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 24
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final createRetailerCategoriesViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;)Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;
    .locals 1
    .param p1    # Lcom/ibotta/android/views/base/title/TitleBarViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;)",
            "Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "titleBarViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "categories"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    invoke-direct {p0, p2}, Lcom/ibotta/android/categories/RetailerCategoriesReducer;->createCategoryViewStates(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/util/List;)V

    return-object v0
.end method
