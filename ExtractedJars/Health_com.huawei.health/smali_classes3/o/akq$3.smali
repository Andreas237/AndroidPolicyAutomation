.class Lo/akq$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/akq;


# direct methods
.method constructor <init>(Lo/akq;)V
    .locals 0

    .line 423
    iput-object p1, p0, Lo/akq$3;->a:Lo/akq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 426
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setOperatorHelperCallback setOperator err_code is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    if-eqz p2, :cond_0

    .line 428
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "objData is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    :cond_0
    const v0, 0x186a0

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lo/akq$3;->a:Lo/akq;

    invoke-static {v0}, Lo/akq;->p(Lo/akq;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 432
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akv;->b(Z)V

    goto :goto_0

    .line 434
    :cond_1
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/akv;->b(Z)V

    .line 436
    :goto_0
    return-void
.end method
