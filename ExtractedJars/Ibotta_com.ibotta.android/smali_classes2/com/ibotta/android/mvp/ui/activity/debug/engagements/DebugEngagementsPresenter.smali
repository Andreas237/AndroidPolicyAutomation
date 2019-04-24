.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;
.super Ljava/lang/Object;
.source "DebugEngagementsPresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onRowClicked(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;)V
.end method

.method public abstract onTypeSelected(Lcom/ibotta/api/model/TaskModel$Type;)V
.end method
