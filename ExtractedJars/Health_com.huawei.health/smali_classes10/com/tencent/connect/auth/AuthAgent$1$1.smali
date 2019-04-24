.class Lcom/tencent/connect/auth/AuthAgent$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/connect/auth/AuthAgent$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/connect/auth/AuthAgent$1;


# direct methods
.method constructor <init>(Lcom/tencent/connect/auth/AuthAgent$1;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/tencent/connect/auth/AuthAgent$1$1;->a:Lcom/tencent/connect/auth/AuthAgent$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 247
    new-instance v0, Lcom/tencent/connect/auth/AuthDialog;

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent$1$1;->a:Lcom/tencent/connect/auth/AuthAgent$1;

    iget-object v1, v1, Lcom/tencent/connect/auth/AuthAgent$1;->c:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v1}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;

    move-result-object v1

    const-string v2, "action_login"

    iget-object v3, p0, Lcom/tencent/connect/auth/AuthAgent$1$1;->a:Lcom/tencent/connect/auth/AuthAgent$1;

    iget-object v3, v3, Lcom/tencent/connect/auth/AuthAgent$1;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/tencent/connect/auth/AuthAgent$1$1;->a:Lcom/tencent/connect/auth/AuthAgent$1;

    iget-object v4, v4, Lcom/tencent/connect/auth/AuthAgent$1;->b:Lcom/tencent/tauth/IUiListener;

    iget-object v5, p0, Lcom/tencent/connect/auth/AuthAgent$1$1;->a:Lcom/tencent/connect/auth/AuthAgent$1;

    iget-object v5, v5, Lcom/tencent/connect/auth/AuthAgent$1;->c:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v5}, Lcom/tencent/connect/auth/AuthAgent;->f(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/tencent/connect/auth/AuthDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;Lcom/tencent/connect/auth/QQToken;)V

    move-object v6, v0

    .line 249
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$1$1;->a:Lcom/tencent/connect/auth/AuthAgent$1;

    iget-object v0, v0, Lcom/tencent/connect/auth/AuthAgent$1;->c:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$1$1;->a:Lcom/tencent/connect/auth/AuthAgent$1;

    iget-object v0, v0, Lcom/tencent/connect/auth/AuthAgent$1;->c:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->e(Lcom/tencent/connect/auth/AuthAgent;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 250
    invoke-virtual {v6}, Lcom/tencent/connect/auth/AuthDialog;->show()V

    .line 252
    :cond_0
    return-void
.end method
