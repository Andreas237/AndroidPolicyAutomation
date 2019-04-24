.class Lo/clq$23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->c(Lo/cmb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cmb;

.field final synthetic d:Lo/clq;


# direct methods
.method constructor <init>(Lo/clq;Lo/cmb;)V
    .locals 0

    .line 1401
    iput-object p1, p0, Lo/clq$23;->d:Lo/clq;

    iput-object p2, p0, Lo/clq$23;->a:Lo/cmb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1405
    iget-object v0, p0, Lo/clq$23;->d:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 1407
    :try_start_0
    iget-object v0, p0, Lo/clq$23;->d:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    new-instance v1, Lo/clq$23$4;

    invoke-direct {v1, p0}, Lo/clq$23$4;-><init>(Lo/clq$23;)V

    invoke-interface {v0, v1}, Lo/clg;->d(Lo/clf;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1421
    goto :goto_0

    .line 1417
    :catch_0
    move-exception v4

    .line 1418
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readHiHealthData e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1419
    iget-object v0, p0, Lo/clq$23;->a:Lo/cmb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1420
    iget-object v0, p0, Lo/clq$23;->a:Lo/cmb;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmb;->b(Ljava/util/List;)V

    .line 1422
    :cond_0
    :goto_0
    return-void
.end method
