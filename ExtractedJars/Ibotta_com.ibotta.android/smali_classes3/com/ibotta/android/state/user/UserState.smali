.class public interface abstract Lcom/ibotta/android/state/user/UserState;
.super Ljava/lang/Object;
.source "UserState.java"

# interfaces
.implements Lcom/ibotta/android/state/user/LogOutListener;


# virtual methods
.method public abstract deleteFacebookAuth()V
.end method

.method public abstract deleteGoogleSignInAuth()V
.end method

.method public abstract deletePersistedData()V
.end method

.method public abstract getAuthRefreshToken()Ljava/lang/String;
.end method

.method public abstract getAuthToken()Ljava/lang/String;
.end method

.method public abstract getAuthTokenExpiration()J
.end method

.method public abstract getCustomerId()I
.end method

.method public abstract getCustomerNotificationCount()I
.end method

.method public abstract getCustomerTestRoles()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCustomerZip()Ljava/lang/String;
.end method

.method public abstract getFacebookId()Ljava/lang/String;
.end method

.method public abstract getFacebookInfo()Lcom/ibotta/android/state/social/FacebookInfo;
.end method

.method public abstract getGoogleSignInInfo()Lcom/ibotta/android/state/social/GoogleSignInInfo;
.end method

.method public abstract getLastDeviceRegistrationHash()Ljava/lang/String;
.end method

.method public abstract getLastLocation()Landroid/location/Location;
.end method

.method public abstract getLifetimeEarnings()F
.end method

.method public abstract getPrefs()Landroid/content/SharedPreferences;
.end method

.method public abstract getRateAppDate()J
.end method

.method public abstract getVerifiedDeviceReferenceId()Ljava/lang/String;
.end method

.method public abstract hasEmployeeTesterRole()Z
.end method

.method public abstract hasSeenPendingWelcomeBonusDialog()Z
.end method

.method public abstract incrementLaunchCount()J
.end method

.method public abstract init()V
.end method

.method public abstract isEligibleForPersonalization()Z
.end method

.method public abstract isGeofencingEnabled()Z
.end method

.method public abstract isHideRateApp()Z
.end method

.method public abstract isNewUser()Z
.end method

.method public abstract markPendingWelcomeBonusDialogSeen()V
.end method

.method public abstract neverShowRateApp()V
.end method

.method public abstract onUpgrade(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract recordLogin(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/api/model/auth/AuthType;)V
.end method

.method public abstract resetRateApp()V
.end method

.method public abstract saveFacebookId(Ljava/lang/String;)V
.end method

.method public abstract saveFacebookId(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerSocial;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setAuthRefreshToken(Ljava/lang/String;)V
.end method

.method public abstract setAuthToken(Ljava/lang/String;)V
.end method

.method public abstract setAuthTokenExpiration(J)V
.end method

.method public abstract setCustomerId(I)V
.end method

.method public abstract setCustomerNotificationCount(I)V
.end method

.method public abstract setCustomerTestRoles(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setCustomerZip(Ljava/lang/String;)V
.end method

.method public abstract setEligibleForPersonalization(Z)V
.end method

.method public abstract setFacebookInfo(Lcom/ibotta/android/state/social/FacebookInfo;)V
.end method

.method public abstract setGeofencingEnabled(Z)V
.end method

.method public abstract setGoogleSignInInfo(Lcom/ibotta/android/state/social/GoogleSignInInfo;)V
.end method

.method public abstract setLastDeviceRegistrationHash(Ljava/lang/String;)V
.end method

.method public abstract setLastLocation(Landroid/location/Location;)V
.end method

.method public abstract setNewUser(Z)V
.end method

.method public abstract setVerifiedDeviceReferenceId(Ljava/lang/String;)V
.end method
