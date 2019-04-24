.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsComponent;
.super Ljava/lang/Object;
.source "NotificationsComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsView;",
        "Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;)V
.end method
