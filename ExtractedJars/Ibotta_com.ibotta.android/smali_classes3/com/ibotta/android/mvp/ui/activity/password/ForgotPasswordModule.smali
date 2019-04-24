.class public Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "ForgotPasswordModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/util/Validation;)Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 25
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/util/Validation;)V

    return-object v0
.end method
