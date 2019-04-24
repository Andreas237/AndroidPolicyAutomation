.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;
.super Ljava/lang/Object;
.source "DebugFeatureFlagsView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/MvpView;
.implements Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewEvents;


# virtual methods
.method public abstract setDebugFeatureFlagItems(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract showDebugFeatureFlagDetail(Ljava/lang/String;)V
.end method

.method public abstract showNoFeatureFlagsAvailable()V
.end method
