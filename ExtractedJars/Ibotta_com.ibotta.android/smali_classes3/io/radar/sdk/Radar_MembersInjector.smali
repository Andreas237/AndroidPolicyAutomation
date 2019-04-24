.class public final Lio/radar/sdk/Radar_MembersInjector;
.super Ljava/lang/Object;
.source "Radar_MembersInjector.java"

# interfaces
.implements Lio/radar/shadow/dagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/radar/shadow/dagger/MembersInjector<",
        "Lio/radar/sdk/Radar;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiClientProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/api/ApiClient;",
            ">;"
        }
    .end annotation
.end field

.field private final contextProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final identityRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/IdentityRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final locationManagerProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/location/LocationManager;",
            ">;"
        }
    .end annotation
.end field

.field private final optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/internal/repository/OptionsRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final stateManagerProvider:Lio/radar/shadow/javax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/radar/shadow/javax/inject/Provider<",
            "Lio/radar/sdk/state/StateManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static injectInit$sdk_release(Lio/radar/sdk/Radar;Landroid/content/Context;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/internal/repository/IdentityRepository;Lio/radar/sdk/state/StateManager;Lio/radar/sdk/location/LocationManager;Lio/radar/sdk/api/ApiClient;)V
    .locals 0

    .line 77
    invoke-virtual/range {p0 .. p6}, Lio/radar/sdk/Radar;->init$sdk_release(Landroid/content/Context;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/internal/repository/IdentityRepository;Lio/radar/sdk/state/StateManager;Lio/radar/sdk/location/LocationManager;Lio/radar/sdk/api/ApiClient;)V

    return-void
.end method


# virtual methods
.method public injectMembers(Lio/radar/sdk/Radar;)V
    .locals 8

    .line 59
    iget-object v0, p0, Lio/radar/sdk/Radar_MembersInjector;->contextProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 61
    invoke-interface {v0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, p0, Lio/radar/sdk/Radar_MembersInjector;->optionsRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 62
    invoke-interface {v0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lio/radar/sdk/internal/repository/OptionsRepository;

    iget-object v0, p0, Lio/radar/sdk/Radar_MembersInjector;->identityRepositoryProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 63
    invoke-interface {v0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lio/radar/sdk/internal/repository/IdentityRepository;

    iget-object v0, p0, Lio/radar/sdk/Radar_MembersInjector;->stateManagerProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 64
    invoke-interface {v0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lio/radar/sdk/state/StateManager;

    iget-object v0, p0, Lio/radar/sdk/Radar_MembersInjector;->locationManagerProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 65
    invoke-interface {v0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lio/radar/sdk/location/LocationManager;

    iget-object v0, p0, Lio/radar/sdk/Radar_MembersInjector;->apiClientProvider:Lio/radar/shadow/javax/inject/Provider;

    .line 66
    invoke-interface {v0}, Lio/radar/shadow/javax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lio/radar/sdk/api/ApiClient;

    move-object v1, p1

    .line 59
    invoke-static/range {v1 .. v7}, Lio/radar/sdk/Radar_MembersInjector;->injectInit$sdk_release(Lio/radar/sdk/Radar;Landroid/content/Context;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/internal/repository/IdentityRepository;Lio/radar/sdk/state/StateManager;Lio/radar/sdk/location/LocationManager;Lio/radar/sdk/api/ApiClient;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 13
    check-cast p1, Lio/radar/sdk/Radar;

    invoke-virtual {p0, p1}, Lio/radar/sdk/Radar_MembersInjector;->injectMembers(Lio/radar/sdk/Radar;)V

    return-void
.end method
