.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputComponent;
.super Ljava/lang/Object;
.source "PwiCardInputComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputView;",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/PwiCardInputActivity;)V
.end method
