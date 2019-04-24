.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginComponent;
.super Ljava/lang/Object;
.source "ImLoginComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginActivity;)V
.end method
