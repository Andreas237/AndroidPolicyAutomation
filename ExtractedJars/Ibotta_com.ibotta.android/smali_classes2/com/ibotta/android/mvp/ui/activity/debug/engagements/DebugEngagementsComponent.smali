.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsComponent;
.super Ljava/lang/Object;
.source "DebugEngagementsComponent.java"

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
        Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsModule;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/MvpComponent<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract inject(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;)V
.end method
