.class public interface abstract Lcom/ibotta/android/state/user/auth/AuthManager;
.super Ljava/lang/Object;
.source "AuthManager.java"

# interfaces
.implements Lcom/ibotta/android/state/user/LogOutListener;
.implements Lcom/ibotta/api/auth/ApiAuthManager;


# virtual methods
.method public abstract clearAuthentication()V
.end method

.method public abstract isAuthenticated()Z
.end method

.method public abstract refreshAuthToken()V
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/state/user/auth/NotAuthenticatedException;
        }
    .end annotation
.end method

.method public abstract setAuthToken(Ljava/lang/String;)V
.end method

.method public abstract setAuthenticatedUser(Lcom/ibotta/api/model/customer/Customer;)V
.end method
