.class Lo/dxo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dxo;->b(JJI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:J

.field final synthetic c:J

.field final synthetic d:Lo/dxo;


# direct methods
.method constructor <init>(Lo/dxo;JJI)V
    .locals 0

    .line 355
    iput-object p1, p0, Lo/dxo$5;->d:Lo/dxo;

    iput-wide p2, p0, Lo/dxo$5;->c:J

    iput-wide p4, p0, Lo/dxo$5;->b:J

    iput p6, p0, Lo/dxo$5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 8

    .line 358
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 359
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "obj null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    iget-object v0, p0, Lo/dxo$5;->d:Lo/dxo;

    iget-wide v1, p0, Lo/dxo$5;->c:J

    iget-wide v3, p0, Lo/dxo$5;->b:J

    iget v5, p0, Lo/dxo$5;->a:I

    invoke-static/range {v0 .. v5}, Lo/dxo;->a(Lo/dxo;JJI)V

    .line 361
    return-void

    .line 364
    :cond_0
    move-object v6, p2

    :try_start_0
    check-cast v6, Ljava/util/List;

    .line 365
    iget-object v0, p0, Lo/dxo$5;->d:Lo/dxo;

    iget v1, p0, Lo/dxo$5;->a:I

    invoke-static {v0, v6, v1}, Lo/dxo;->a(Lo/dxo;Ljava/util/List;I)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 369
    iget-object v0, p0, Lo/dxo$5;->d:Lo/dxo;

    iget-wide v1, p0, Lo/dxo$5;->c:J

    iget-wide v3, p0, Lo/dxo$5;->b:J

    iget v5, p0, Lo/dxo$5;->a:I

    invoke-static/range {v0 .. v5}, Lo/dxo;->a(Lo/dxo;JJI)V

    .line 370
    goto :goto_0

    .line 366
    :catch_0
    move-exception v6

    .line 367
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getTrackListByRunType data ClassCastException"

    :try_start_1
    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 369
    iget-object v0, p0, Lo/dxo$5;->d:Lo/dxo;

    iget-wide v1, p0, Lo/dxo$5;->c:J

    iget-wide v3, p0, Lo/dxo$5;->b:J

    iget v5, p0, Lo/dxo$5;->a:I

    invoke-static/range {v0 .. v5}, Lo/dxo;->a(Lo/dxo;JJI)V

    .line 370
    goto :goto_0

    .line 369
    :catchall_0
    move-exception v7

    iget-object v0, p0, Lo/dxo$5;->d:Lo/dxo;

    iget-wide v1, p0, Lo/dxo$5;->c:J

    iget-wide v3, p0, Lo/dxo$5;->b:J

    iget v5, p0, Lo/dxo$5;->a:I

    invoke-static/range {v0 .. v5}, Lo/dxo;->a(Lo/dxo;JJI)V

    .line 370
    throw v7

    .line 372
    :goto_0
    return-void
.end method
