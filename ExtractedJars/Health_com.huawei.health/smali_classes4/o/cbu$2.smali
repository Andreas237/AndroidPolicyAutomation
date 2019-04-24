.class Lo/cbu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbu;->bb()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cbu;


# direct methods
.method constructor <init>(Lo/cbu;)V
    .locals 0

    .line 3597
    iput-object p1, p0, Lo/cbu$2;->a:Lo/cbu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 16

    .line 3601
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v1}, Lo/cbu;->q(Lo/cbu;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/cbu;->a(Lo/cbu;J)J

    .line 3603
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->s(Lo/cbu;)Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v11

    .line 3605
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->y(Lo/cbu;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "simplemotion_temp.txt"

    invoke-static {v0, v11, v1}, Lo/cdy;->c(Landroid/content/Context;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Ljava/lang/String;)Z

    .line 3608
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->z(Lo/cbu;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3609
    const-string v0, "Track_SportManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveDataToFile mTempNewPointsBuffer is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3610
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->y(Lo/cbu;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "simplemotion.txt"

    invoke-static {v0, v11, v1}, Lo/cdy;->c(Landroid/content/Context;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Ljava/lang/String;)Z

    .line 3611
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/cbu;->d:Z

    .line 3612
    return-void

    .line 3615
    :cond_0
    const/4 v12, 0x0

    .line 3616
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->w(Lo/cbu;)Lo/cbx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3617
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->w(Lo/cbu;)Lo/cbx;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cbx;->b(Z)Ljava/util/ArrayList;

    move-result-object v12

    .line 3620
    :cond_1
    const/4 v13, 0x0

    .line 3621
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    iget-object v0, v0, Lo/cbu;->a:Lo/cby;

    if-eqz v0, :cond_2

    .line 3622
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    iget-object v0, v0, Lo/cbu;->a:Lo/cby;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cby;->d(Z)Ljava/util/ArrayList;

    move-result-object v13

    .line 3625
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v1}, Lo/cbu;->z(Lo/cbu;)Ljava/util/Map;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/cbu$2;->a:Lo/cbu;

    .line 3626
    invoke-static {v2}, Lo/cbu;->x(Lo/cbu;)Ljava/util/ArrayList;

    move-result-object v2

    move-object v3, v12

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/cbu$2;->a:Lo/cbu;

    .line 3628
    invoke-static {v4}, Lo/cbu;->v(Lo/cbu;)Lo/cbw;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lo/cbw;->c(Z)Ljava/util/Map;

    move-result-object v4

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/cbu$2;->a:Lo/cbu;

    .line 3629
    invoke-static {v5}, Lo/cbu;->v(Lo/cbu;)Lo/cbw;

    move-result-object v5

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lo/cbw;->e(Z)Ljava/util/Map;

    move-result-object v5

    move-object/from16 v6, p0

    iget-object v6, v6, Lo/cbu$2;->a:Lo/cbu;

    .line 3630
    invoke-static {v6}, Lo/cbu;->v(Lo/cbu;)Lo/cbw;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Lo/cbw;->a(Z)Ljava/util/Map;

    move-result-object v6

    move-object/from16 v7, p0

    iget-object v7, v7, Lo/cbu$2;->a:Lo/cbu;

    .line 3631
    invoke-static {v7}, Lo/cbu;->v(Lo/cbu;)Lo/cbw;

    move-result-object v7

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Lo/cbw;->b(Z)Ljava/util/Map;

    move-result-object v7

    move-object v8, v13

    move-object/from16 v9, p0

    iget-object v9, v9, Lo/cbu$2;->a:Lo/cbu;

    .line 3633
    invoke-static {v9}, Lo/cbu;->D(Lo/cbu;)Ljava/util/ArrayList;

    move-result-object v9

    move-object/from16 v10, p0

    iget-object v10, v10, Lo/cbu$2;->a:Lo/cbu;

    .line 3634
    invoke-static {v10}, Lo/cbu;->C(Lo/cbu;)Ljava/util/ArrayList;

    move-result-object v10

    .line 3625
    invoke-static/range {v0 .. v10}, Lo/cbu;->b(Lo/cbu;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)Lo/cex;

    move-result-object v14

    .line 3636
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->y(Lo/cbu;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v14}, Lo/cdy;->d(Landroid/content/Context;Lo/cex;)Z

    move-result v15

    .line 3638
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->y(Lo/cbu;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "simplemotion.txt"

    invoke-static {v0, v11, v1}, Lo/cdy;->c(Landroid/content/Context;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Ljava/lang/String;)Z

    .line 3639
    if-eqz v15, :cond_3

    .line 3640
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->z(Lo/cbu;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 3641
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->x(Lo/cbu;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3642
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->D(Lo/cbu;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3643
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->C(Lo/cbu;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3645
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->A(Lo/cbu;)Lo/cbs;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 3646
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->A(Lo/cbu;)Lo/cbs;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbs;->d()V

    .line 3649
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cbu$2;->a:Lo/cbu;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/cbu;->d:Z

    .line 3650
    return-void
.end method
