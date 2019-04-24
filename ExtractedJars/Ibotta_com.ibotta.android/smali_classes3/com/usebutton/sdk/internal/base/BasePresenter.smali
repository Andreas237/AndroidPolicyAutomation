.class public abstract Lcom/usebutton/sdk/internal/base/BasePresenter;
.super Ljava/lang/Object;
.source "BasePresenter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/usebutton/sdk/internal/base/BaseViewController;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private controller:Lcom/usebutton/sdk/internal/base/BaseViewController;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TC;"
        }
    .end annotation
.end field

.field private final tag:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/base/BasePresenter;->tag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final attachView(Lcom/usebutton/sdk/internal/base/BaseViewController;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)V"
        }
    .end annotation

    .line 27
    iput-object p1, p0, Lcom/usebutton/sdk/internal/base/BasePresenter;->controller:Lcom/usebutton/sdk/internal/base/BaseViewController;

    .line 28
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/base/BasePresenter;->onViewAttached()V

    return-void
.end method

.method public final detachView()V
    .locals 1

    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/usebutton/sdk/internal/base/BasePresenter;->controller:Lcom/usebutton/sdk/internal/base/BaseViewController;

    .line 33
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/base/BasePresenter;->onViewDetached()V

    return-void
.end method

.method protected final getViewController()Lcom/usebutton/sdk/internal/base/BaseViewController;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TC;"
        }
    .end annotation

    .line 42
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/base/BasePresenter;->isViewAttached()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/usebutton/sdk/internal/base/BasePresenter;->controller:Lcom/usebutton/sdk/internal/base/BaseViewController;

    return-object v0

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/base/BasePresenter;->tag:Ljava/lang/String;

    const-string v1, "ViewController no found"

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isViewAttached()Z
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/usebutton/sdk/internal/base/BasePresenter;->controller:Lcom/usebutton/sdk/internal/base/BaseViewController;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected onViewAttached()V
    .locals 0

    return-void
.end method

.method protected onViewDetached()V
    .locals 0

    return-void
.end method
