.class public Lcom/ibotta/android/state/GlobalEventManagerImpl;
.super Ljava/lang/Object;
.source "GlobalEventManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/GlobalEventManager;
.implements Lcom/ibotta/android/state/app/config/AppConfigListener;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final handler:Landroid/os/Handler;

.field private listeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/state/GlobalStateListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic lambda$onAppCacheLowSpace$11(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 0

    .line 130
    invoke-interface {p0}, Lcom/ibotta/android/state/GlobalStateListener;->onAppCacheLowSpace()V

    return-void
.end method

.method static synthetic lambda$onAppConfigChanged$15(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 0

    .line 162
    invoke-interface {p0}, Lcom/ibotta/android/state/GlobalStateListener;->onAppConfigChanged()V

    return-void
.end method

.method static synthetic lambda$onAppVersionDeprecated$2(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 0

    .line 58
    invoke-interface {p0}, Lcom/ibotta/android/state/GlobalStateListener;->onAppVersionDeprecated()V

    return-void
.end method

.method static synthetic lambda$onAuthenticationLost$0(Lcom/ibotta/android/state/GlobalStateListener;Z)V
    .locals 0

    .line 42
    invoke-interface {p0, p1}, Lcom/ibotta/android/state/GlobalStateListener;->onAuthenticationLost(Z)V

    return-void
.end method

.method static synthetic lambda$onButtonSdkWelcomeBack$12(Lcom/ibotta/android/state/GlobalStateListener;Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V
    .locals 0

    .line 138
    invoke-interface {p0, p1}, Lcom/ibotta/android/state/GlobalStateListener;->onButtonSdkWelcomeBack(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V

    return-void
.end method

.method static synthetic lambda$onGeofenceNotificationStatusChanged$9(Lcom/ibotta/android/state/GlobalStateListener;Lcom/ibotta/android/state/GeofenceNotificationStatus;)V
    .locals 0

    .line 114
    invoke-interface {p0, p1}, Lcom/ibotta/android/state/GlobalStateListener;->onGeofenceNotificationStatusChanged(Lcom/ibotta/android/state/GeofenceNotificationStatus;)V

    return-void
.end method

.method static synthetic lambda$onGeofenceStatusChanged$8(Lcom/ibotta/android/state/GlobalStateListener;Lcom/ibotta/android/state/GeofenceStatus;)V
    .locals 0

    .line 106
    invoke-interface {p0, p1}, Lcom/ibotta/android/state/GlobalStateListener;->onGeofenceStatusChanged(Lcom/ibotta/android/state/GeofenceStatus;)V

    return-void
.end method

.method static synthetic lambda$onGeofencesRegistered$7(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 0

    .line 98
    invoke-interface {p0}, Lcom/ibotta/android/state/GlobalStateListener;->onGeofencesRegistered()V

    return-void
.end method

.method static synthetic lambda$onLocationChanged$10(Lcom/ibotta/android/state/GlobalStateListener;Landroid/location/Location;)V
    .locals 0

    .line 122
    invoke-interface {p0, p1}, Lcom/ibotta/android/state/GlobalStateListener;->onLocationChanged(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic lambda$onMaintenanceMode$3(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 0

    .line 66
    invoke-interface {p0}, Lcom/ibotta/android/state/GlobalStateListener;->onMaintenanceMode()V

    return-void
.end method

.method static synthetic lambda$onNotificationsUpdated$6(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 0

    .line 90
    invoke-interface {p0}, Lcom/ibotta/android/state/GlobalStateListener;->onNotificationsUpdated()V

    return-void
.end method

.method static synthetic lambda$onOfferExpired$1(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 0

    .line 50
    invoke-interface {p0}, Lcom/ibotta/android/state/GlobalStateListener;->onOfferExpired()V

    return-void
.end method

.method static synthetic lambda$onPendingEarningsUpdated$13(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 0

    .line 146
    invoke-interface {p0}, Lcom/ibotta/android/state/GlobalStateListener;->onPendingEarningsUpdated()V

    return-void
.end method

.method static synthetic lambda$onUpgradeAvailable$4(Lcom/ibotta/android/state/GlobalStateListener;Ljava/lang/String;)V
    .locals 0

    .line 74
    invoke-interface {p0, p1}, Lcom/ibotta/android/state/GlobalStateListener;->onUpgradeAvailable(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic lambda$onUpgradeRequired$5(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 0

    .line 82
    invoke-interface {p0}, Lcom/ibotta/android/state/GlobalStateListener;->onUpgradeRequired()V

    return-void
.end method

.method static synthetic lambda$onUserGoalChanged$14(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 0

    .line 154
    invoke-interface {p0}, Lcom/ibotta/android/state/GlobalStateListener;->onUserGoalChanged()V

    return-void
.end method

.method private runOnMain(Ljava/lang/Runnable;)V
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->handler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public addGlobalStateListener(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAppCacheLowSpace()V
    .locals 3

    const-string v0, "onAppCacheLowSpace"

    const/4 v1, 0x0

    .line 128
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 130
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$MZq8XUEpV2i1vxXsxqLzYxO5AN8;

    invoke-direct {v2, v1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$MZq8XUEpV2i1vxXsxqLzYxO5AN8;-><init>(Lcom/ibotta/android/state/GlobalStateListener;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onAppConfigChanged()V
    .locals 3

    const-string v0, "onAppConfigChanged"

    const/4 v1, 0x0

    .line 160
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 162
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$vrvDrZUFnWSYUHMn_JRTOqT_cEc;

    invoke-direct {v2, v1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$vrvDrZUFnWSYUHMn_JRTOqT_cEc;-><init>(Lcom/ibotta/android/state/GlobalStateListener;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onAppVersionDeprecated()V
    .locals 3

    const-string v0, "onAppVersionDeprecated"

    const/4 v1, 0x0

    .line 56
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 58
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$WmA2jDhOoNT7XRV6XV78mLltVog;

    invoke-direct {v2, v1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$WmA2jDhOoNT7XRV6XV78mLltVog;-><init>(Lcom/ibotta/android/state/GlobalStateListener;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onAuthenticationLost(Z)V
    .locals 3

    const-string v0, "onAuthenticationLost"

    const/4 v1, 0x0

    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 42
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$SLBDqrCHhWg9uRpMsQPA_J-18Fk;

    invoke-direct {v2, v1, p1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$SLBDqrCHhWg9uRpMsQPA_J-18Fk;-><init>(Lcom/ibotta/android/state/GlobalStateListener;Z)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onButtonSdkWelcomeBack(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V
    .locals 3

    const-string v0, "onButtonSdkWelcomeBack"

    const/4 v1, 0x0

    .line 136
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 138
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$3DuMwrwSZoLuqBrIr8Ip-8434sc;

    invoke-direct {v2, v1, p1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$3DuMwrwSZoLuqBrIr8Ip-8434sc;-><init>(Lcom/ibotta/android/state/GlobalStateListener;Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onGeofenceNotificationStatusChanged(Lcom/ibotta/android/state/GeofenceNotificationStatus;)V
    .locals 3

    const-string v0, "onGeofenceNotificationStatusChanged"

    const/4 v1, 0x0

    .line 112
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 114
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$gSr_fGKIAvspMMtcp3nP_4BZLeg;

    invoke-direct {v2, v1, p1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$gSr_fGKIAvspMMtcp3nP_4BZLeg;-><init>(Lcom/ibotta/android/state/GlobalStateListener;Lcom/ibotta/android/state/GeofenceNotificationStatus;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onGeofenceStatusChanged(Lcom/ibotta/android/state/GeofenceStatus;)V
    .locals 3

    const-string v0, "onGeofenceStatusChanged"

    const/4 v1, 0x0

    .line 104
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 106
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$qYgZyivQjp_DK0Z69hyJa802Lvo;

    invoke-direct {v2, v1, p1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$qYgZyivQjp_DK0Z69hyJa802Lvo;-><init>(Lcom/ibotta/android/state/GlobalStateListener;Lcom/ibotta/android/state/GeofenceStatus;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onGeofencesRegistered()V
    .locals 3

    const-string v0, "onGeofencesRegistered"

    const/4 v1, 0x0

    .line 96
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 98
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$UFaAbyR1hlZ_nndNgaxFJDO-FVg;

    invoke-direct {v2, v1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$UFaAbyR1hlZ_nndNgaxFJDO-FVg;-><init>(Lcom/ibotta/android/state/GlobalStateListener;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 3

    const-string v0, "onLocationChanged"

    const/4 v1, 0x0

    .line 120
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 122
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$haPVZuB6QessujYBxGSvTJknJ3o;

    invoke-direct {v2, v1, p1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$haPVZuB6QessujYBxGSvTJknJ3o;-><init>(Lcom/ibotta/android/state/GlobalStateListener;Landroid/location/Location;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onLogOut(Z)V
    .locals 0

    .line 172
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->onAuthenticationLost(Z)V

    return-void
.end method

.method public onMaintenanceMode()V
    .locals 3

    const-string v0, "onMaintenanceMode"

    const/4 v1, 0x0

    .line 64
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 66
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$wPZdphnWq0NriMg2bB_CmUeNgDM;

    invoke-direct {v2, v1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$wPZdphnWq0NriMg2bB_CmUeNgDM;-><init>(Lcom/ibotta/android/state/GlobalStateListener;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onNotificationsUpdated()V
    .locals 3

    const-string v0, "onNotificationsUpdated"

    const/4 v1, 0x0

    .line 88
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 90
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$kDXskkhWb-5H3M0U6R1QP2sCYQU;

    invoke-direct {v2, v1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$kDXskkhWb-5H3M0U6R1QP2sCYQU;-><init>(Lcom/ibotta/android/state/GlobalStateListener;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onOfferExpired()V
    .locals 3

    const-string v0, "onOfferExpired"

    const/4 v1, 0x0

    .line 48
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 50
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$F4d_xswmUnTbLz3QR74RQmPg0DE;

    invoke-direct {v2, v1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$F4d_xswmUnTbLz3QR74RQmPg0DE;-><init>(Lcom/ibotta/android/state/GlobalStateListener;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPendingEarningsUpdated()V
    .locals 3

    const-string v0, "onPendingEarningsUpdated"

    const/4 v1, 0x0

    .line 144
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 146
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$Ki1R8N0s7xgPuGhFB7957vA8n3c;

    invoke-direct {v2, v1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$Ki1R8N0s7xgPuGhFB7957vA8n3c;-><init>(Lcom/ibotta/android/state/GlobalStateListener;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onUpgradeAvailable(Ljava/lang/String;)V
    .locals 3

    const-string v0, "onUpgradeAvailable"

    const/4 v1, 0x0

    .line 72
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 74
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$33C6XhuxFl3e6V4oH3_hgebI5n4;

    invoke-direct {v2, v1, p1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$33C6XhuxFl3e6V4oH3_hgebI5n4;-><init>(Lcom/ibotta/android/state/GlobalStateListener;Ljava/lang/String;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onUpgradeRequired()V
    .locals 3

    const-string v0, "onUpgradeRequired"

    const/4 v1, 0x0

    .line 80
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 82
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$t62fqge_vGiBUqLBRN__qEYYx5A;

    invoke-direct {v2, v1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$t62fqge_vGiBUqLBRN__qEYYx5A;-><init>(Lcom/ibotta/android/state/GlobalStateListener;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onUserGoalChanged()V
    .locals 3

    const-string v0, "onUserGoalChanged"

    const/4 v1, 0x0

    .line 152
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/state/GlobalStateListener;

    .line 154
    new-instance v2, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$SZRRdRTUsm4jg6ScPmgPPsZfHS0;

    invoke-direct {v2, v1}, Lcom/ibotta/android/state/-$$Lambda$GlobalEventManagerImpl$SZRRdRTUsm4jg6ScPmgPPsZfHS0;-><init>(Lcom/ibotta/android/state/GlobalStateListener;)V

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/GlobalEventManagerImpl;->runOnMain(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeGlobalStateListener(Lcom/ibotta/android/state/GlobalStateListener;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/state/GlobalEventManagerImpl;->listeners:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
