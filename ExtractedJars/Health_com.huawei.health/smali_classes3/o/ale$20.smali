.class Lo/ale$20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ale;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/ale;I)V
    .locals 0

    .line 1399
    iput-object p1, p0, Lo/ale$20;->c:Lo/ale;

    iput p2, p0, Lo/ale$20;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1402
    iget v0, p0, Lo/ale$20;->e:I

    if-nez v0, :cond_0

    .line 1403
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showDataMigrateTipsDialog(final int type) type = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1404
    iget-object v0, p0, Lo/ale$20;->c:Lo/ale;

    iget-object v1, p0, Lo/ale$20;->c:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByWear()I

    move-result v1

    invoke-static {v0, v1}, Lo/ale;->b(Lo/ale;I)V

    .line 1405
    iget-object v0, p0, Lo/ale$20;->c:Lo/ale;

    invoke-static {v0}, Lo/ale;->l(Lo/ale;)V

    goto :goto_0

    .line 1407
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showDataMigrateTipsDialog(final int type) type = else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1408
    iget-object v0, p0, Lo/ale$20;->c:Lo/ale;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ale;->e(Lo/ale;I)V

    .line 1411
    :goto_0
    return-void
.end method
