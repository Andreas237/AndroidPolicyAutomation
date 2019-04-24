.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreComponent;
.super Ljava/lang/Object;
.source "LearnMoreComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreView;",
        "Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMorePresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/learnmore/LearnMoreActivity;)V
.end method
