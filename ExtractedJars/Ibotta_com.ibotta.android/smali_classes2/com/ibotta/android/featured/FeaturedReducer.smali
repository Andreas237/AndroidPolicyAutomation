.class public final Lcom/ibotta/android/featured/FeaturedReducer;
.super Ljava/lang/Object;
.source "FeaturedReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/ibotta/android/featured/FeaturedReducer;",
        "",
        "titleBarReducer",
        "Lcom/ibotta/android/title/TitleBarReducer;",
        "(Lcom/ibotta/android/title/TitleBarReducer;)V",
        "createFeaturedCategoriesTitle",
        "Lcom/ibotta/android/views/base/title/TitleBarViewState;",
        "isSponsored",
        "",
        "createSubtitle",
        "Lcom/ibotta/android/views/generic/ResValue;",
        "createTitle",
        "module",
        "Lcom/ibotta/api/model/base/Module;",
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
.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/title/TitleBarReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "titleBarReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/featured/FeaturedReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method

.method private final createSubtitle(Z)Lcom/ibotta/android/views/generic/ResValue;
    .locals 0

    if-eqz p1, :cond_0

    .line 22
    sget p1, Lcom/ibotta/android/reducers/R$string;->common_sponsored:I

    invoke-static {p1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    invoke-static {p1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final createFeaturedCategoriesTitle(Z)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/ibotta/android/featured/FeaturedReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 10
    sget v1, Lcom/ibotta/android/reducers/R$string;->featured_featured_categories:I

    invoke-static {v1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(I)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v1

    const-string v2, ""

    .line 11
    invoke-static {v2}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v2

    .line 12
    invoke-direct {p0, p1}, Lcom/ibotta/android/featured/FeaturedReducer;->createSubtitle(Z)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    .line 13
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    .line 9
    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;Ljava/util/List;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    return-object p1
.end method

.method public final createTitle(Lcom/ibotta/api/model/base/Module;)Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 5
    .param p1    # Lcom/ibotta/api/model/base/Module;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/featured/FeaturedReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 16
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v2

    .line 18
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->isSponsored()Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "module.isSponsored"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-direct {p0, v3}, Lcom/ibotta/android/featured/FeaturedReducer;->createSubtitle(Z)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v3

    .line 19
    invoke-virtual {p1}, Lcom/ibotta/api/model/base/Module;->getMenuActionsAsActionables()Ljava/util/List;

    move-result-object p1

    const-string v4, "module.menuActionsAsActionables"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;Lcom/ibotta/android/views/generic/ResValue;Ljava/util/List;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    return-object p1
.end method
