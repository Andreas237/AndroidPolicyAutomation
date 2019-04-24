.class Lcom/usebutton/sdk/internal/models/AppAction$2;
.super Ljava/lang/Object;
.source "AppAction.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/AuthChallengeObserver$AuthChallengeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/models/AppAction;->handleAuthChallenge(Landroid/content/Context;ILcom/usebutton/sdk/internal/models/AppAction$Listener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/models/AppAction;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$intentFlags:I

.field final synthetic val$listener:Lcom/usebutton/sdk/internal/models/AppAction$Listener;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/models/AppAction;ILandroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V
    .locals 0

    .line 477
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->this$0:Lcom/usebutton/sdk/internal/models/AppAction;

    iput p2, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->val$intentFlags:I

    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->val$context:Landroid/content/Context;

    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->val$listener:Lcom/usebutton/sdk/internal/models/AppAction$Listener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSSOAuth(Lcom/usebutton/sdk/internal/models/AuthChallenge;)V
    .locals 4

    .line 480
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->this$0:Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/AppAction;->access$000(Lcom/usebutton/sdk/internal/models/AppAction;)V

    .line 481
    new-instance v0, Lcom/usebutton/sdk/models/Link;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getAuthUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/usebutton/sdk/models/Link;-><init>(Landroid/net/Uri;Landroid/net/Uri;)V

    .line 482
    new-instance v1, Lcom/usebutton/sdk/internal/ActionPerformer;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->this$0:Lcom/usebutton/sdk/internal/models/AppAction;

    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/AppAction;->access$100(Lcom/usebutton/sdk/internal/models/AppAction;)Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v2

    iget v3, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->val$intentFlags:I

    invoke-direct {v1, v2, v0, v3, p1}, Lcom/usebutton/sdk/internal/ActionPerformer;-><init>(Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/models/Link;ILcom/usebutton/sdk/internal/models/AuthChallenge;)V

    iget-object p1, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->val$context:Landroid/content/Context;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->val$listener:Lcom/usebutton/sdk/internal/models/AppAction$Listener;

    invoke-virtual {v1, p1, v0}, Lcom/usebutton/sdk/internal/ActionPerformer;->execute(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/AppAction$Listener;)V

    return-void
.end method

.method public onSuccess()V
    .locals 4

    .line 488
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->this$0:Lcom/usebutton/sdk/internal/models/AppAction;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->val$context:Landroid/content/Context;

    iget v2, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->val$intentFlags:I

    iget-object v3, p0, Lcom/usebutton/sdk/internal/models/AppAction$2;->val$listener:Lcom/usebutton/sdk/internal/models/AppAction$Listener;

    invoke-static {v0, v1, v2, v3}, Lcom/usebutton/sdk/internal/models/AppAction;->access$200(Lcom/usebutton/sdk/internal/models/AppAction;Landroid/content/Context;ILcom/usebutton/sdk/internal/models/AppAction$Listener;)V

    return-void
.end method
