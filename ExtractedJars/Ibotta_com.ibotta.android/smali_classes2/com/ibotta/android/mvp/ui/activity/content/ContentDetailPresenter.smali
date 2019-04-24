.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailPresenter;
.super Ljava/lang/Object;
.source "ContentDetailPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/content/ContentDetailView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getContentId()Lcom/ibotta/android/apiandroid/content/ContentId;
.end method

.method public abstract getRetailerId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract onContentImageCardClicked()V
.end method

.method public abstract onPayAtRetailerClicked()V
.end method

.method public abstract setContentId(Lcom/ibotta/android/apiandroid/content/ContentId;)V
    .param p1    # Lcom/ibotta/android/apiandroid/content/ContentId;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
