.class public final Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideFeaturedReducerFactory;
.super Ljava/lang/Object;
.source "FeaturedModule_ProvideFeaturedReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/featured/FeaturedReducer;",
        ">;"
    }
.end annotation


# instance fields
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
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideFeaturedReducerFactory;->titleBarReducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideFeaturedReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideFeaturedReducerFactory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideFeaturedReducerFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideFeaturedReducerFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/featured/FeaturedReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/title/TitleBarReducer;",
            ">;)",
            "Lcom/ibotta/android/featured/FeaturedReducer;"
        }
    .end annotation

    .line 29
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/title/TitleBarReducer;

    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideFeaturedReducerFactory;->proxyProvideFeaturedReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/featured/FeaturedReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideFeaturedReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/featured/FeaturedReducer;
    .locals 1

    .line 39
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;->provideFeaturedReducer(Lcom/ibotta/android/title/TitleBarReducer;)Lcom/ibotta/android/featured/FeaturedReducer;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 38
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/featured/FeaturedReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/featured/FeaturedReducer;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideFeaturedReducerFactory;->titleBarReducerProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideFeaturedReducerFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/featured/FeaturedReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideFeaturedReducerFactory;->get()Lcom/ibotta/android/featured/FeaturedReducer;

    move-result-object v0

    return-object v0
.end method
