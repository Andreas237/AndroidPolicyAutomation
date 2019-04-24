.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/module/ModulePresenter;
.super Ljava/lang/Object;
.source "ModulePresenter.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/module/ModuleView;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract getModuleName()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract onContentActionClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
.end method

.method public abstract onContentClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
.end method

.method public abstract onRowClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V
.end method

.method public abstract onUnlockCompleted()V
.end method

.method public abstract setModuleId(I)V
.end method
