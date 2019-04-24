.class Lcom/usebutton/sdk/internal/ButtonPrivate$4;
.super Ljava/lang/Object;
.source "ButtonPrivate.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/core/ApplicationHooks$OnApplicationEvent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/ButtonPrivate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ButtonPrivate;)V
    .locals 0

    .line 400
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$4;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onForegrounded()V
    .locals 2

    .line 403
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$4;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$400(Lcom/usebutton/sdk/internal/ButtonPrivate;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 404
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$4;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$600(Lcom/usebutton/sdk/internal/ButtonPrivate;)Lcom/usebutton/sdk/internal/ButtonRepository;

    move-result-object v0

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$4;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$500(Lcom/usebutton/sdk/internal/ButtonPrivate;)Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/ButtonRepository;->fetchConfiguration(Lcom/usebutton/sdk/internal/ConfigurationUpdatePolicy;)V

    goto :goto_0

    .line 406
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/ButtonPrivate$4;->this$0:Lcom/usebutton/sdk/internal/ButtonPrivate;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->access$700(Lcom/usebutton/sdk/internal/ButtonPrivate;)V

    :goto_0
    return-void
.end method

.method public onIntent(Landroid/content/Intent;)V
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method
