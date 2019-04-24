.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkComponent;
.super Ljava/lang/Object;
.source "TeamworkComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkView;",
        "Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/teamwork/TeamworkActivity;)V
.end method
