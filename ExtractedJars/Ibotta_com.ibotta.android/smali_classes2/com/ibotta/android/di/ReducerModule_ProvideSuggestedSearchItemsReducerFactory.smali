.class public final Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideSuggestedSearchItemsReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/search/SuggestedSearchItemsReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final resoucesProvider:Ljavax/inject/Provider;
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

.field private final suggestedSearchItemCtaButtonReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;",
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

.field private final variantFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
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
            "Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->suggestedSearchItemCtaButtonReducerProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p2, p0, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->resoucesProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p3, p0, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    .line 44
    iput-object p4, p0, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->titleBarReducerProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p5, p0, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->retailerHorizListReducerProvider:Ljavax/inject/Provider;

    .line 46
    iput-object p6, p0, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->variantFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;"
        }
    .end annotation

    .line 83
    new-instance v7, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/SuggestedSearchItemsReducer;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/horiz/RetailerHorizListReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/factory/VariantFactory;",
            ">;)",
            "Lcom/ibotta/android/search/SuggestedSearchItemsReducer;"
        }
    .end annotation

    .line 68
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;

    .line 69
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroid/content/res/Resources;

    .line 70
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 71
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/title/TitleBarReducer;

    .line 72
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/horiz/RetailerHorizListReducer;

    .line 73
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/features/factory/VariantFactory;

    .line 67
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->proxyProvideSuggestedSearchItemsReducer(Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/search/SuggestedSearchItemsReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideSuggestedSearchItemsReducer(Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/search/SuggestedSearchItemsReducer;
    .locals 0

    .line 100
    invoke-static/range {p0 .. p5}, Lcom/ibotta/android/di/ReducerModule;->provideSuggestedSearchItemsReducer(Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;Lcom/ibotta/android/horiz/RetailerHorizListReducer;Lcom/ibotta/android/features/factory/VariantFactory;)Lcom/ibotta/android/search/SuggestedSearchItemsReducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 99
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/search/SuggestedSearchItemsReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/search/SuggestedSearchItemsReducer;
    .locals 6

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->suggestedSearchItemCtaButtonReducerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->resoucesProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->ibottaListViewStyleReducerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->titleBarReducerProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->retailerHorizListReducerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->variantFactoryProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/SuggestedSearchItemsReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideSuggestedSearchItemsReducerFactory;->get()Lcom/ibotta/android/search/SuggestedSearchItemsReducer;

    move-result-object v0

    return-object v0
.end method
