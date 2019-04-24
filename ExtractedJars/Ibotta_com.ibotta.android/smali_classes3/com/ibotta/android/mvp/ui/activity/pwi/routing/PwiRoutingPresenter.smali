.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingPresenter;
.super Ljava/lang/Object;
.source "PwiRoutingPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getParentActivityClass()Ljava/lang/Class;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
.end method

.method public abstract setParentActivityClass(Ljava/lang/Class;)V
    .param p1    # Ljava/lang/Class;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
