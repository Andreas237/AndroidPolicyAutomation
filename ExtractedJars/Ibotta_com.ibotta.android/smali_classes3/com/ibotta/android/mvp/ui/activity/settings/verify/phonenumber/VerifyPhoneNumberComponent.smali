.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberComponent;
.super Ljava/lang/Object;
.source "VerifyPhoneNumberComponent.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpComponent;


# annotations
.annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
.end annotation

.annotation runtime Ldagger/Component;
    dependencies = {
        Lcom/ibotta/android/di/MainComponent;
    }
    modules = {
        Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberView;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/settings/verify/phonenumber/VerifyPhoneNumberActivity;)V
.end method
