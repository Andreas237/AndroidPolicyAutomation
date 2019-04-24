.class Lo/ale$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/login/ui/login/util/ILoginCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->Y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 1217
    iput-object p1, p0, Lo/ale$13;->d:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoginFailed(Ljava/lang/Object;)V
    .locals 4

    .line 1227
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====login onLoginFailed====="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1228
    return-void
.end method

.method public onLoginSuccess(Ljava/lang/Object;)V
    .locals 4

    .line 1220
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====login onLoginSuccess====="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1221
    iget-object v0, p0, Lo/ale$13;->d:Lo/ale;

    iget-object v1, p0, Lo/ale$13;->d:Lo/ale;

    invoke-static {v1}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ale;->b(Lo/ale;Lcom/huawei/login/ui/login/LoginInit;)Lcom/huawei/login/ui/login/LoginInit;

    .line 1222
    iget-object v0, p0, Lo/ale$13;->d:Lo/ale;

    invoke-static {v0}, Lo/ale;->s(Lo/ale;)V

    .line 1223
    return-void
.end method
