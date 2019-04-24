.class public interface abstract Lcom/ibotta/android/state/app/UserStateAppCallback;
.super Ljava/lang/Object;
.source "UserStateAppCallback.java"

# interfaces
.implements Lcom/ibotta/android/state/app/AppCacheCallback;


# static fields
.field public static final EVENT_LIFETIME_EARNINGS_INCREASE:Ljava/lang/String; = "lifetime_earnings_increase"

.field public static final EVENT_LOGIN:Ljava/lang/String; = "login"

.field public static final NETWORK_EMAIL:Ljava/lang/String; = "email"

.field public static final NETWORK_FACEBOOK:Ljava/lang/String; = "facebook"

.field public static final NETWORK_GOOGLE:Ljava/lang/String; = "google"


# virtual methods
.method public abstract cacheClearCustomerFriends()V
.end method

.method public abstract clearAllFavoriteRetailerSettings()V
.end method

.method public abstract geofenceCoordinatorOnLogIn()V
.end method

.method public abstract geofenceCoordinatorOnSettingChange()V
.end method

.method public abstract setLastEmailUsed(Ljava/lang/String;)V
.end method

.method public abstract setUserIdForTracker(Ljava/lang/String;)V
.end method

.method public abstract trackEvent(Ljava/lang/String;)V
.end method

.method public abstract trackEvent(Ljava/lang/String;Ljava/lang/String;)V
.end method
