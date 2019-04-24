.class public final Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideCurrentBalanceActionProviderFactory;
.super Ljava/lang/Object;
.source "FeaturedModule_ProvideCurrentBalanceActionProviderFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideCurrentBalanceActionProviderFactory;->module:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideCurrentBalanceActionProviderFactory;
    .locals 1

    .line 31
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideCurrentBalanceActionProviderFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideCurrentBalanceActionProviderFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;)Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;
    .locals 0

    .line 26
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideCurrentBalanceActionProviderFactory;->proxyProvideCurrentBalanceActionProvider(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;)Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideCurrentBalanceActionProvider(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;)Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;
    .locals 1

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;->provideCurrentBalanceActionProvider()Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 36
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideCurrentBalanceActionProviderFactory;->module:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideCurrentBalanceActionProviderFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;)Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideCurrentBalanceActionProviderFactory;->get()Lcom/ibotta/android/fragment/home/CurrentBalanceActionProvider;

    move-result-object v0

    return-object v0
.end method
