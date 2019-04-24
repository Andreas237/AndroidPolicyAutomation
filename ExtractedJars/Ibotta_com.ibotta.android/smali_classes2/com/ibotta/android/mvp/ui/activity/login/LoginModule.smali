.class public Lcom/ibotta/android/mvp/ui/activity/login/LoginModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "LoginModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/login/LoginView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/login/LoginView;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;)Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenter;
    .locals 9
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 35
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/login/LoginPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/email/EmailState;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;)V

    return-object v8
.end method
