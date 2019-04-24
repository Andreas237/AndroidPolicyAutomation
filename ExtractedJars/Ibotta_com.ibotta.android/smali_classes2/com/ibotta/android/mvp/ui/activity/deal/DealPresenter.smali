.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/deal/DealPresenter;
.super Ljava/lang/Object;
.source "DealPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/deal/DealView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getDealId()Ljava/lang/String;
.end method

.method public abstract getRetailerId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract onContentImageCardClicked()V
.end method

.method public abstract setDealId(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
