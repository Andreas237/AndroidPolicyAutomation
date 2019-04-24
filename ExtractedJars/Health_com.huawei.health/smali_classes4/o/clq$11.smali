.class Lo/clq$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->e(Lo/cmc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cmc;

.field final synthetic c:Lo/clq;


# direct methods
.method constructor <init>(Lo/clq;Lo/cmc;)V
    .locals 0

    .line 860
    iput-object p1, p0, Lo/clq$11;->c:Lo/clq;

    iput-object p2, p0, Lo/clq$11;->b:Lo/cmc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 863
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 864
    iget-object v0, p0, Lo/clq$11;->c:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 866
    :try_start_0
    iget-object v0, p0, Lo/clq$11;->c:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    new-instance v1, Lo/clq$11$1;

    invoke-direct {v1, p0, v4, v5}, Lo/clq$11$1;-><init>(Lo/clq$11;J)V

    invoke-interface {v0, v1}, Lo/clg;->c(Lo/cli;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 878
    goto :goto_0

    .line 874
    :catch_0
    move-exception v6

    .line 875
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchPhoneDataClient e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 876
    iget-object v0, p0, Lo/clq$11;->b:Lo/cmc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 877
    iget-object v0, p0, Lo/clq$11;->b:Lo/cmc;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmc;->a(Ljava/util/List;)V

    .line 879
    :cond_0
    :goto_0
    return-void
.end method
