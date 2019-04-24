.class Lo/clq$29;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/clq;->e(Ljava/util/List;Lo/cmh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cmh;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lo/clq;


# direct methods
.method constructor <init>(Lo/clq;Ljava/util/List;Lo/cmh;)V
    .locals 0

    .line 440
    iput-object p1, p0, Lo/clq$29;->d:Lo/clq;

    iput-object p2, p0, Lo/clq$29;->c:Ljava/util/List;

    iput-object p3, p0, Lo/clq$29;->a:Lo/cmh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 444
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 445
    iget-object v0, p0, Lo/clq$29;->d:Lo/clq;

    invoke-static {v0}, Lo/clq;->b(Lo/clq;)V

    .line 447
    :try_start_0
    iget-object v0, p0, Lo/clq$29;->d:Lo/clq;

    invoke-static {v0}, Lo/clq;->c(Lo/clq;)Lo/clg;

    move-result-object v0

    iget-object v1, p0, Lo/clq$29;->c:Ljava/util/List;

    new-instance v2, Lo/clq$29$2;

    invoke-direct {v2, p0, v4, v5}, Lo/clq$29$2;-><init>(Lo/clq$29;J)V

    invoke-interface {v0, v1, v2}, Lo/clg;->a(Ljava/util/List;Lo/clm;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 457
    goto :goto_0

    .line 454
    :catch_0
    move-exception v6

    .line 455
    const-string v0, "HiH_HiHealthNativeAPI"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unSubscribeHiHealthData e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 456
    iget-object v0, p0, Lo/clq$29;->a:Lo/cmh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/clq$29;->a:Lo/cmh;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmh;->onResult(Z)V

    .line 458
    :cond_0
    :goto_0
    return-void
.end method
