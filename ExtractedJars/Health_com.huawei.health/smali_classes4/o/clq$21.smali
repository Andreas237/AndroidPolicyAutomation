.class Lo/clq$21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->a(ILo/cmg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cmg;

.field final synthetic b:I

.field final synthetic c:Lo/clq;


# direct methods
.method constructor <init>(Lo/clq;ILo/cmg;)V
    .locals 0

    .line 379
    iput-object p1, p0, Lo/clq$21;->c:Lo/clq;

    iput p2, p0, Lo/clq$21;->b:I

    iput-object p3, p0, Lo/clq$21;->a:Lo/cmg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 382
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 383
    iget-object v0, p0, Lo/clq$21;->c:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 385
    :try_start_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 386
    iget v0, p0, Lo/clq$21;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 387
    iget-object v0, p0, Lo/clq$21;->c:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    new-instance v1, Lo/clq$21$4;

    invoke-direct {v1, p0, v4, v5}, Lo/clq$21$4;-><init>(Lo/clq$21;J)V

    invoke-interface {v0, v6, v1}, Lo/clg;->d(Ljava/util/List;Lo/clo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 406
    goto :goto_0

    .line 402
    :catch_0
    move-exception v6

    .line 403
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subscribeHiHealthData type e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    iget-object v0, p0, Lo/clq$21;->a:Lo/cmg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 405
    iget-object v0, p0, Lo/clq$21;->a:Lo/cmg;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/cmg;->onResult(Ljava/util/List;Ljava/util/List;)V

    .line 407
    :cond_0
    :goto_0
    return-void
.end method
