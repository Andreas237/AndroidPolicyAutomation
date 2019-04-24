.class Lcom/usebutton/sdk/internal/ButtonPrivate$9;
.super Ljava/lang/Object;
.source "ButtonPrivate.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/AppActionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/ButtonPrivate;->fetch(Lcom/usebutton/sdk/action/ActionRequest;Lcom/usebutton/sdk/action/ActionListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

.field final synthetic val$listener:Lcom/usebutton/sdk/action/ActionListener;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ButtonPrivate;Lcom/usebutton/sdk/action/ActionListener;)V
    .locals 0

    .line 593
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$9;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$9;->val$listener:Lcom/usebutton/sdk/action/ActionListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAction(Lcom/usebutton/sdk/internal/models/AppAction;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/internal/models/AppAction;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 596
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$9;->val$listener:Lcom/usebutton/sdk/action/ActionListener;

    new-instance v1, Lcom/usebutton/sdk/action/ButtonAction;

    invoke-direct {v1, p1}, Lcom/usebutton/sdk/action/ButtonAction;-><init>(Lcom/usebutton/sdk/internal/models/AppAction;)V

    const/4 p1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/usebutton/sdk/action/ActionListener;->onComplete(Lcom/usebutton/sdk/action/ButtonAction;Ljava/lang/Throwable;)V

    return-void
.end method

.method public onNoAction()V
    .locals 3

    .line 601
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$9;->val$listener:Lcom/usebutton/sdk/action/ActionListener;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Button Actions request failed"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/usebutton/sdk/action/ActionListener;->onComplete(Lcom/usebutton/sdk/action/ButtonAction;Ljava/lang/Throwable;)V

    return-void
.end method
