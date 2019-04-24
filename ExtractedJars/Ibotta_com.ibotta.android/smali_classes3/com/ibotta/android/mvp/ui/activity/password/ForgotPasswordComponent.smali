.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordComponent;
.super Ljava/lang/Object;
.source "ForgotPasswordComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordView;",
        "Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/password/ForgotPasswordActivity;)V
.end method
