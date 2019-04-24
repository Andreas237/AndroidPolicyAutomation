.class public abstract Lcom/usebutton/sdk/internal/base/BaseActivity;
.super Landroid/app/Activity;
.source "BaseActivity.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Lcom/usebutton/sdk/internal/base/BasePresenter;",
        ">",
        "Landroid/app/Activity;"
    }
.end annotation


# instance fields
.field private presenter:Lcom/usebutton/sdk/internal/base/BasePresenter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected attachPresenterToLifecycle(Lcom/usebutton/sdk/internal/base/BasePresenter;Lcom/usebutton/sdk/internal/base/BaseViewController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;",
            "Lcom/usebutton/sdk/internal/base/BaseViewController;",
            ")V"
        }
    .end annotation

    .line 20
    iput-object p1, p0, Lcom/usebutton/sdk/internal/base/BaseActivity;->presenter:Lcom/usebutton/sdk/internal/base/BasePresenter;

    .line 21
    iget-object p1, p0, Lcom/usebutton/sdk/internal/base/BaseActivity;->presenter:Lcom/usebutton/sdk/internal/base/BasePresenter;

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/base/BasePresenter;->attachView(Lcom/usebutton/sdk/internal/base/BaseViewController;)V

    return-void
.end method

.method public getPresenter()Lcom/usebutton/sdk/internal/base/BasePresenter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TP;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/usebutton/sdk/internal/base/BaseActivity;->presenter:Lcom/usebutton/sdk/internal/base/BasePresenter;

    return-object v0
.end method

.method protected onDestroy()V
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/usebutton/sdk/internal/base/BaseActivity;->presenter:Lcom/usebutton/sdk/internal/base/BasePresenter;

    if-eqz v0, :cond_0

    .line 13
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/base/BasePresenter;->detachView()V

    .line 15
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method
