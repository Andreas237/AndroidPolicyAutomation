.class Lo/ale$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ale;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/ale;I)V
    .locals 0

    .line 991
    iput-object p1, p0, Lo/ale$9;->a:Lo/ale;

    iput p2, p0, Lo/ale$9;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 994
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showDataMigrateDialogHaveDownHMS OK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 995
    iget-object v0, p0, Lo/ale$9;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale$9;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 996
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showDataMigrateDialogHaveDownHMS mExecutorService is null or shutdown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 997
    return-void

    .line 999
    :cond_1
    iget-object v0, p0, Lo/ale$9;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/ale$9$5;

    invoke-direct {v1, p0}, Lo/ale$9$5;-><init>(Lo/ale$9;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1009
    return-void
.end method
