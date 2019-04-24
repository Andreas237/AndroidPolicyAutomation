.class public final Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;
.super Ljava/lang/Object;
.source "TeamworkModule_ProvideTeamworkLoadStrategyFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;",
        ">;"
    }
.end annotation


# instance fields
.field private final graphQLCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;

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
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;->module:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;"
        }
    .end annotation

    .line 48
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;"
        }
    .end annotation

    .line 41
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 40
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;->proxyProvideTeamworkLoadStrategy(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideTeamworkLoadStrategy(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;
    .locals 0

    .line 55
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;->provideTeamworkLoadStrategy(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 54
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;
    .locals 3

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;->module:Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule_ProvideTeamworkLoadStrategyFactory;->get()Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkLoadStrategy;

    move-result-object v0

    return-object v0
.end method
