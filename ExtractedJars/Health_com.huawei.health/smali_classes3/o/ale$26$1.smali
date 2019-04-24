.class Lo/ale$26$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale$26;->onLoginSuccess(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ale$26;


# direct methods
.method constructor <init>(Lo/ale$26;)V
    .locals 0

    .line 1926
    iput-object p1, p0, Lo/ale$26$1;->c:Lo/ale$26;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1929
    iget-object v0, p0, Lo/ale$26$1;->c:Lo/ale$26;

    iget-object v0, v0, Lo/ale$26;->e:Lo/ale;

    iget-object v1, p0, Lo/ale$26$1;->c:Lo/ale$26;

    iget-object v1, v1, Lo/ale$26;->e:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByHWid()I

    move-result v1

    invoke-static {v0, v1}, Lo/ale;->b(Lo/ale;I)V

    .line 1930
    iget-object v0, p0, Lo/ale$26$1;->c:Lo/ale$26;

    iget-object v0, v0, Lo/ale$26;->e:Lo/ale;

    invoke-static {v0}, Lo/ale;->l(Lo/ale;)V

    .line 1931
    return-void
.end method
