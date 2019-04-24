.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/SettingView;
.super Ljava/lang/Object;
.source "SettingView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract setSettingRows(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/settings/row/AbstractSettingRow;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showConnectedAccounts()V
.end method

.method public abstract showDebugMenu()V
.end method

.method public abstract showEndUserLicenseAgreement()V
.end method

.method public abstract showLogout()V
.end method

.method public abstract showPreferences()V
.end method

.method public abstract showPrivacyPolicy()V
.end method

.method public abstract showTermsOfUse()V
.end method

.method public abstract showThirdPartyAcknowledgements()V
.end method

.method public abstract showUpdateProfile(Lcom/ibotta/api/model/customer/Customer;)V
.end method

.method public abstract showVerifyDevice()V
.end method
