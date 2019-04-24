.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;
.super Ljava/lang/Object;
.source "RegistrationView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpView;


# virtual methods
.method public abstract notifySuccess(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setBirthdate(Ljava/lang/String;)V
.end method

.method public abstract setBirthdateInputStateError()V
.end method

.method public abstract setBirthdateInputStateValid()V
.end method

.method public abstract setDateOfBirth(Ljava/lang/String;)V
.end method

.method public abstract setEmail(Ljava/lang/String;)V
.end method

.method public abstract setEmailInputStateError()V
.end method

.method public abstract setEmailInputStateValid()V
.end method

.method public abstract setFirstName(Ljava/lang/String;)V
.end method

.method public abstract setFirstNameInputStateError()V
.end method

.method public abstract setFirstNameInputStateValid()V
.end method

.method public abstract setGender(Ljava/lang/String;)V
.end method

.method public abstract setLastName(Ljava/lang/String;)V
.end method

.method public abstract setLastNameInputStateError()V
.end method

.method public abstract setLastNameInputStateValid()V
.end method

.method public abstract setPasswordInputStateError()V
.end method

.method public abstract setPasswordInputStateValid()V
.end method

.method public abstract setReferralCodeInputStateError()V
.end method

.method public abstract setReferralCodeInputStateValid()V
.end method

.method public abstract setSignUpEnabled(Z)V
.end method

.method public abstract setZipCodeInputStateError()V
.end method

.method public abstract setZipCodeInputStateValid()V
.end method

.method public abstract showDateOfBirthPicker(IIILjava/util/Calendar;)V
.end method

.method public abstract showGenderPicker()V
.end method

.method public abstract showInvalidDateOfBirth()V
.end method

.method public abstract showInvalidEmail()V
.end method

.method public abstract showInvalidFirstName()V
.end method

.method public abstract showInvalidLastName()V
.end method

.method public abstract showInvalidPassword()V
.end method

.method public abstract showInvalidReferralCode()V
.end method

.method public abstract showInvalidZipCode()V
.end method
