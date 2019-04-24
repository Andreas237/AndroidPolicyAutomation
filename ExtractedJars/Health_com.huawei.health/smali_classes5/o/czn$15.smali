.class Lo/czn$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/czn;->e(DDLo/cyx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cyx;

.field final synthetic b:D

.field final synthetic c:Lo/czn;

.field final synthetic d:D


# direct methods
.method constructor <init>(Lo/czn;DDLo/cyx;)V
    .locals 0

    .line 4402
    iput-object p1, p0, Lo/czn$15;->c:Lo/czn;

    iput-wide p2, p0, Lo/czn$15;->d:D

    iput-wide p4, p0, Lo/czn$15;->b:D

    iput-object p6, p0, Lo/czn$15;->a:Lo/cyx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 4405
    iget-object v0, p0, Lo/czn$15;->c:Lo/czn;

    iget-wide v1, p0, Lo/czn$15;->d:D

    iget-wide v3, p0, Lo/czn$15;->b:D

    invoke-static {v0, v1, v2, v3, v4}, Lo/czn;->a(Lo/czn;DD)Lo/czm;

    move-result-object v5

    .line 4406
    invoke-virtual {v5}, Lo/czm;->a()D

    move-result-wide v0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    cmpl-double v0, v2, v0

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Lo/czm;->d()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4407
    iget-object v0, p0, Lo/czn$15;->a:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v5, v1, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    goto :goto_0

    .line 4409
    :cond_0
    iget-object v0, p0, Lo/czn$15;->a:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 4411
    :goto_0
    return-void
.end method
