.class Lo/czq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/czq;->d(Lo/czs;Lcom/google/gson/Gson;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/czq;


# direct methods
.method constructor <init>(Lo/czq;)V
    .locals 0

    .line 325
    iput-object p1, p0, Lo/czq$1;->a:Lo/czq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 328
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isLogout is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/czq;->e()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    invoke-static {}, Lo/czq;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 330
    iget-object v0, p0, Lo/czq$1;->a:Lo/czq;

    invoke-static {v0}, Lo/czq;->e(Lo/czq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_st_invalid_flag"

    const-string v2, "0"

    new-instance v3, Lo/dcy;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lo/dcy;-><init>(I)V

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    goto :goto_0

    .line 332
    :cond_0
    iget-object v0, p0, Lo/czq$1;->a:Lo/czq;

    invoke-static {v0}, Lo/czq;->e(Lo/czq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_st_invalid_flag"

    iget-object v2, p0, Lo/czq$1;->a:Lo/czq;

    invoke-static {v2}, Lo/czq;->a(Lo/czq;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/dcy;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lo/dcy;-><init>(I)V

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 333
    iget-object v0, p0, Lo/czq$1;->a:Lo/czq;

    invoke-static {v0}, Lo/czq;->e(Lo/czq;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 334
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jump to 2.1 login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    iget-object v0, p0, Lo/czq$1;->a:Lo/czq;

    invoke-static {v0}, Lo/czq;->d(Lo/czq;)V

    goto :goto_0

    .line 337
    :cond_1
    iget-object v0, p0, Lo/czq$1;->a:Lo/czq;

    invoke-static {v0}, Lo/czq;->c(Lo/czq;)V

    .line 338
    const-string v0, "UIME_NSPClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRunningForeground is false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    :goto_0
    return-void
.end method
