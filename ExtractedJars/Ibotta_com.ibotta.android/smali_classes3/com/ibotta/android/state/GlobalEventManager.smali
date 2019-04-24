.class public interface abstract Lcom/ibotta/android/state/GlobalEventManager;
.super Ljava/lang/Object;
.source "GlobalEventManager.java"

# interfaces
.implements Lcom/ibotta/android/state/user/LogOutListener;


# virtual methods
.method public abstract addGlobalStateListener(Lcom/ibotta/android/state/GlobalStateListener;)V
.end method

.method public abstract onAppCacheLowSpace()V
.end method

.method public abstract onAppConfigChanged()V
.end method

.method public abstract onAppVersionDeprecated()V
.end method

.method public abstract onAuthenticationLost(Z)V
.end method

.method public abstract onButtonSdkWelcomeBack(Lcom/ibotta/api/model/buttonsdk/ButtonTx;)V
.end method

.method public abstract onGeofenceNotificationStatusChanged(Lcom/ibotta/android/state/GeofenceNotificationStatus;)V
.end method

.method public abstract onGeofenceStatusChanged(Lcom/ibotta/android/state/GeofenceStatus;)V
.end method

.method public abstract onGeofencesRegistered()V
.end method

.method public abstract onLocationChanged(Landroid/location/Location;)V
.end method

.method public abstract onMaintenanceMode()V
.end method

.method public abstract onNotificationsUpdated()V
.end method

.method public abstract onOfferExpired()V
.end method

.method public abstract onPendingEarningsUpdated()V
.end method

.method public abstract onUpgradeAvailable(Ljava/lang/String;)V
.end method

.method public abstract onUpgradeRequired()V
.end method

.method public abstract onUserGoalChanged()V
.end method

.method public abstract removeGlobalStateListener(Lcom/ibotta/android/state/GlobalStateListener;)V
.end method
