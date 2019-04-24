.class public interface abstract Lcom/ibotta/android/service/api/job/ApiJobEnvironment;
.super Ljava/lang/Object;
.source "ApiJobEnvironment.java"


# virtual methods
.method public abstract createGeocoder()Landroid/location/Geocoder;
.end method

.method public abstract getAuthToken()Ljava/lang/String;
.end method

.method public abstract getCacheFetchStrategy(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/cachefetch/CacheFetchStrategy;
.end method

.method public abstract getContentResolver()Landroid/content/ContentResolver;
.end method

.method public abstract getCurrentTime()J
.end method

.method public abstract getCustomerId()I
.end method

.method public abstract getCustomerZip()Ljava/lang/String;
.end method

.method public abstract getLastLocation()Landroid/location/Location;
.end method

.method public abstract isCoarseLocationAvailable()Z
.end method

.method public abstract isFineLocationAvailable()Z
.end method

.method public abstract isNetworkConnected()Z
.end method

.method public abstract postDelayed(Ljava/lang/Runnable;J)V
.end method

.method public abstract removeCallbacks(Ljava/lang/Runnable;)V
.end method

.method public abstract requestUpdate(J)V
.end method

.method public abstract setAuthToken(Ljava/lang/String;)V
.end method

.method public abstract waitForFreshLocation(JJJ)Landroid/location/Location;
.end method
