.class Lcom/usebutton/sdk/internal/ActionPerformer$1;
.super Ljava/lang/Object;
.source "ActionPerformer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/ActionPerformer;->execute(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/ActionPerformer;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$listener:Lcom/usebutton/sdk/internal/models/AppAction$Listener;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ActionPerformer;Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ActionPerformer$1;->this$0:Lcom/usebutton/sdk/internal/ActionPerformer;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/ActionPerformer$1;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/usebutton/sdk/internal/ActionPerformer$1;->val$listener:Lcom/usebutton/sdk/internal/models/AppAction$Listener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 78
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ActionPerformer$1;->this$0:Lcom/usebutton/sdk/internal/ActionPerformer;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ActionPerformer$1;->val$context:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/ActionPerformer;->access$000(Lcom/usebutton/sdk/internal/ActionPerformer;Landroid/content/Context;)V

    .line 80
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ActionPerformer$1;->val$listener:Lcom/usebutton/sdk/internal/models/AppAction$Listener;

    if-eqz v0, :cond_0

    .line 81
    invoke-interface {v0}, Lcom/usebutton/sdk/internal/models/AppAction$Listener;->onSuccess()V

    :cond_0
    return-void
.end method
