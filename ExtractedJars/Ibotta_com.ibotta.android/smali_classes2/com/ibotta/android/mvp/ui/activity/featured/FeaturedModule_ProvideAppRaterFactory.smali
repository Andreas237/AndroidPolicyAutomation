.class public final Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;
.super Ljava/lang/Object;
.source "FeaturedModule_ProvideAppRaterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/AppRater;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final appboyProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;

.field private final trackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)V"
        }
    .end annotation

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->appboyProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->trackerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;"
        }
    .end annotation

    .line 67
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/AppRater;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;",
            "Ljavax/inject/Provider<",
            "Lcom/appboy/Appboy;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)",
            "Lcom/ibotta/android/AppRater;"
        }
    .end annotation

    .line 55
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/appboy/Appboy;

    .line 56
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/util/AppHelper;

    .line 57
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/state/user/UserState;

    .line 58
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/ibotta/android/tracking/Tracker;

    .line 53
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->proxyProvideAppRater(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Lcom/appboy/Appboy;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/AppRater;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideAppRater(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Lcom/appboy/Appboy;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/AppRater;
    .locals 0

    .line 78
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;->provideAppRater(Lcom/appboy/Appboy;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/AppRater;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 77
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/AppRater;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/AppRater;
    .locals 5

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->appboyProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->trackerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/AppRater;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedModule_ProvideAppRaterFactory;->get()Lcom/ibotta/android/AppRater;

    move-result-object v0

    return-object v0
.end method
