.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListComponent;
.super Ljava/lang/Object;
.source "PwiRetailerListComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;",
        "Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListActivity;)V
.end method
