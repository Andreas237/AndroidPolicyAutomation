.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsComponent;
.super Ljava/lang/Object;
.source "ConnectedAccountsComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsView;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/settings/connectedaccounts/ConnectedAccountsActivity;)V
.end method
