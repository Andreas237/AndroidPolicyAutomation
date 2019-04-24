.class Lo/clq$25;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->d(IILo/clz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/clq;

.field final synthetic c:Lo/clz;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/clq;IILo/clz;)V
    .locals 0

    .line 1243
    iput-object p1, p0, Lo/clq$25;->b:Lo/clq;

    iput p2, p0, Lo/clq$25;->a:I

    iput p3, p0, Lo/clq$25;->e:I

    iput-object p4, p0, Lo/clq$25;->c:Lo/clz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1246
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1247
    iget-object v0, p0, Lo/clq$25;->b:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 1249
    :try_start_0
    iget-object v0, p0, Lo/clq$25;->b:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    iget v1, p0, Lo/clq$25;->a:I

    iget v2, p0, Lo/clq$25;->e:I

    new-instance v3, Lo/clq$25$5;

    invoke-direct {v3, p0, v4, v5}, Lo/clq$25$5;-><init>(Lo/clq$25;J)V

    invoke-interface {v0, v1, v2, v3}, Lo/clg;->e(IILo/cla;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1266
    goto :goto_0

    .line 1262
    :catch_0
    move-exception v6

    .line 1263
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchGoalInfo e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1264
    iget-object v0, p0, Lo/clq$25;->c:Lo/clz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1265
    iget-object v0, p0, Lo/clq$25;->c:Lo/clz;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lo/clz;->onFailure(ILjava/lang/Object;)V

    .line 1267
    :cond_0
    :goto_0
    return-void
.end method
