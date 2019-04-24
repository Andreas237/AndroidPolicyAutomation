.class Lo/ale$45;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->N()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 3322
    iput-object p1, p0, Lo/ale$45;->a:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 3325
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    .line 3326
    iget-object v0, p0, Lo/ale$45;->a:Lo/ale;

    iget-object v1, p0, Lo/ale$45;->a:Lo/ale;

    invoke-static {v1}, Lo/ale;->E(Lo/ale;)I

    move-result v1

    invoke-static {v0, v1}, Lo/ale;->i(Lo/ale;I)I

    .line 3327
    iget-object v0, p0, Lo/ale$45;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3328
    iget-object v0, p0, Lo/ale$45;->a:Lo/ale;

    iget-object v1, p0, Lo/ale$45;->a:Lo/ale;

    invoke-static {v1}, Lo/ale;->L(Lo/ale;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lo/ale;->i(Lo/ale;I)I

    .line 3329
    iget-object v0, p0, Lo/ale$45;->a:Lo/ale;

    iget-object v1, p0, Lo/ale$45;->a:Lo/ale;

    invoke-static {v1}, Lo/ale;->L(Lo/ale;)I

    move-result v1

    invoke-static {v0, v1}, Lo/ale;->k(Lo/ale;I)V

    .line 3331
    :cond_0
    iget-object v0, p0, Lo/ale$45;->a:Lo/ale;

    invoke-static {v0}, Lo/ale;->J(Lo/ale;)V

    goto :goto_0

    .line 3333
    :cond_1
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish MainAcitivity for cause:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "cancel update hms by google"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3334
    invoke-static {}, Lo/ale;->h()V

    .line 3336
    :goto_0
    return-void
.end method
