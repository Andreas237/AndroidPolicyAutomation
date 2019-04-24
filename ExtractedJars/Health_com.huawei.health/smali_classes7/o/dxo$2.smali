.class Lo/dxo$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dxo;->e(JJI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dxo;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lo/dxo;I)V
    .locals 0

    .line 396
    iput-object p1, p0, Lo/dxo$2;->a:Lo/dxo;

    iput p2, p0, Lo/dxo$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 7

    .line 399
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 400
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getTrackListByCycleType obj null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    iget-object v0, p0, Lo/dxo$2;->a:Lo/dxo;

    const-string v1, ""

    const/4 v2, 0x1

    const-wide/16 v3, 0xc8

    invoke-static {v0, v2, v1, v3, v4}, Lo/dxo;->e(Lo/dxo;ILjava/lang/Object;J)V

    .line 402
    return-void

    .line 405
    :cond_0
    move-object v5, p2

    :try_start_0
    check-cast v5, Ljava/util/List;

    .line 406
    iget-object v0, p0, Lo/dxo$2;->a:Lo/dxo;

    iget v1, p0, Lo/dxo$2;->c:I

    invoke-static {v0, v5, v1}, Lo/dxo;->c(Lo/dxo;Ljava/util/List;I)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 410
    iget-object v0, p0, Lo/dxo$2;->a:Lo/dxo;

    const-string v1, ""

    const/4 v2, 0x1

    const-wide/16 v3, 0xc8

    invoke-static {v0, v2, v1, v3, v4}, Lo/dxo;->e(Lo/dxo;ILjava/lang/Object;J)V

    .line 411
    goto :goto_0

    .line 407
    :catch_0
    move-exception v5

    .line 408
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "getTrackListData data ClassCastException"

    :try_start_1
    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 410
    iget-object v0, p0, Lo/dxo$2;->a:Lo/dxo;

    const-string v1, ""

    const/4 v2, 0x1

    const-wide/16 v3, 0xc8

    invoke-static {v0, v2, v1, v3, v4}, Lo/dxo;->e(Lo/dxo;ILjava/lang/Object;J)V

    .line 411
    goto :goto_0

    .line 410
    :catchall_0
    move-exception v6

    iget-object v0, p0, Lo/dxo$2;->a:Lo/dxo;

    const-string v1, ""

    const/4 v2, 0x1

    const-wide/16 v3, 0xc8

    invoke-static {v0, v2, v1, v3, v4}, Lo/dxo;->e(Lo/dxo;ILjava/lang/Object;J)V

    .line 411
    throw v6

    .line 412
    :goto_0
    return-void
.end method
