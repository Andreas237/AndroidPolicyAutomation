.class public final Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;
.super Ljava/lang/Object;
.source "CategoryGalleryReducer_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final bannerReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/BannerReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final contentListReducerUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final resourcesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerHorizListReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final titleBarReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/BannerReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->bannerReducerProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p2, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->retailerHorizListReducerProvider:Ljavax/inject/Provider;

    .line 39
    iput-object p3, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->contentListReducerUtilProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p4, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p5, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->titleBarReducerProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p6, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->resourcesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/BannerReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;"
        }
    .end annotation

    .line 79
    new-instance v7, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static newCategoryGalleryReducer(Lcom/ibotta/android/featured/BannerReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;
    .locals 8

    .line 95
    new-instance v7, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;-><init>(Lcom/ibotta/android/featured/BannerReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)V

    return-object v7
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/featured/BannerReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/content/ContentListReducerUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;"
        }
    .end annotation

    .line 63
    new-instance v7, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;

    .line 64
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/featured/BannerReducer;

    .line 65
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    .line 66
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/content/ContentListReducerUtil;

    .line 67
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 68
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/title/TitleBarReducer;

    .line 69
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Landroid/content/res/Resources;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;-><init>(Lcom/ibotta/android/featured/BannerReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;Landroid/content/res/Resources;)V

    return-object v7
.end method


# virtual methods
.method public get()Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;
    .locals 6

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->bannerReducerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->retailerHorizListReducerProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->contentListReducerUtilProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->titleBarReducerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->resourcesProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/reducers/category/CategoryGalleryReducer_Factory;->get()Lcom/ibotta/android/reducers/category/CategoryGalleryReducer;

    move-result-object v0

    return-object v0
.end method
