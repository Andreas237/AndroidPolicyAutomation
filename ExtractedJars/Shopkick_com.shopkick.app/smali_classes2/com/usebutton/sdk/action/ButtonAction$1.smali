.class Lcom/usebutton/sdk/action/ButtonAction$1;
.super Ljava/lang/Object;
.source "ButtonAction.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/models/AppAction$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/action/ButtonAction;->start(Landroid/content/Context;Lcom/usebutton/sdk/action/ButtonAction$Listener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/action/ButtonAction;

.field final synthetic val$listener:Lcom/usebutton/sdk/action/ButtonAction$Listener;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/action/ButtonAction;Lcom/usebutton/sdk/action/ButtonAction$Listener;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/usebutton/sdk/action/ButtonAction$1;->this$0:Lcom/usebutton/sdk/action/ButtonAction;

    iput-object p2, p0, Lcom/usebutton/sdk/action/ButtonAction$1;->val$listener:Lcom/usebutton/sdk/action/ButtonAction$Listener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/usebutton/sdk/action/ButtonAction$1;->val$listener:Lcom/usebutton/sdk/action/ButtonAction$Listener;

    if-eqz v0, :cond_0

    .line 43
    invoke-interface {v0, p1}, Lcom/usebutton/sdk/action/ButtonAction$Listener;->onStartResult(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public onSuccess()V
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/usebutton/sdk/action/ButtonAction$1;->val$listener:Lcom/usebutton/sdk/action/ButtonAction$Listener;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 36
    invoke-interface {v0, v1}, Lcom/usebutton/sdk/action/ButtonAction$Listener;->onStartResult(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
