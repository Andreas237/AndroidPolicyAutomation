.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;
.super Ljava/lang/Object;
.source "VerifyPhoneNumberPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onCountryCodeChanged(Lcom/ibotta/android/state/app/config/deviceauth/DeviceAuthenticationAppConfig$CountryCode;)V
.end method

.method public abstract onPhoneNumberChanged(Ljava/lang/String;)V
.end method

.method public abstract onVerifyComplete()V
.end method

.method public abstract onVerifyPhoneNumberClicked()V
.end method
