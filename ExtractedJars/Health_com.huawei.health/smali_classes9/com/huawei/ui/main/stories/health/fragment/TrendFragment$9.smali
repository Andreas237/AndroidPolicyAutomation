.class Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;I)V
    .locals 0

    .line 1371
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iput p2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 1375
    iget v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->d:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1377
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->Q(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/Date;

    move-result-object v10

    .line 1378
    goto :goto_1

    .line 1380
    :goto_0
    invoke-static {}, Lo/dbu;->b()Ljava/util/Date;

    move-result-object v10

    .line 1385
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->d:I

    invoke-static {v0, v10, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;Ljava/util/Date;I)V

    .line 1388
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ab(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->d:I

    const/16 v3, 0xc8

    invoke-static {v1, v10, v2, v3}, Lo/fec;->a(Ljava/util/List;Ljava/util/Date;II)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    .line 1389
    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ab(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->d:I

    const/16 v4, 0xc9

    invoke-static {v2, v10, v3, v4}, Lo/fec;->a(Ljava/util/List;Ljava/util/Date;II)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    .line 1390
    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ab(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->d:I

    const/16 v5, 0xca

    invoke-static {v3, v10, v4, v5}, Lo/fec;->a(Ljava/util/List;Ljava/util/Date;II)F

    move-result v3

    .line 1388
    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->c(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;FFF)V

    .line 1391
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ab(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->d:I

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->J(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/acu;

    move-result-object v3

    const/16 v4, 0xc8

    invoke-static {v1, v10, v2, v4, v3}, Lo/fec;->c(Ljava/util/List;Ljava/util/Date;IILo/acu;)F

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    .line 1392
    invoke-static {v2}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ab(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->d:I

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->J(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/acu;

    move-result-object v4

    const/16 v5, 0xc9

    invoke-static {v2, v10, v3, v5, v4}, Lo/fec;->c(Ljava/util/List;Ljava/util/Date;IILo/acu;)F

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    .line 1393
    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ab(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v3

    iget v4, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->d:I

    iget-object v5, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->J(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/acu;

    move-result-object v5

    const/16 v6, 0xca

    invoke-static {v3, v10, v4, v6, v5}, Lo/fec;->c(Ljava/util/List;Ljava/util/Date;IILo/acu;)F

    move-result v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    .line 1394
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ab(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v4

    iget v5, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->d:I

    iget-object v6, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->J(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/acu;

    move-result-object v6

    const/16 v7, 0xc8

    invoke-static {v4, v10, v5, v7, v6}, Lo/fec;->a(Ljava/util/List;Ljava/util/Date;IILo/acu;)F

    move-result v4

    iget-object v5, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    .line 1395
    invoke-static {v5}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ab(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v5

    iget v6, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->d:I

    iget-object v7, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v7}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->J(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/acu;

    move-result-object v7

    const/16 v8, 0xc9

    invoke-static {v5, v10, v6, v8, v7}, Lo/fec;->a(Ljava/util/List;Ljava/util/Date;IILo/acu;)F

    move-result v5

    iget-object v6, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    .line 1396
    invoke-static {v6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->ab(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v6

    iget v7, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->d:I

    iget-object v8, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v8}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->J(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Lo/acu;

    move-result-object v8

    const/16 v9, 0xca

    invoke-static {v6, v10, v7, v9, v8}, Lo/fec;->a(Ljava/util/List;Ljava/util/Date;IILo/acu;)F

    move-result v6

    .line 1391
    invoke-static/range {v0 .. v6}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->e(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;FFFFFF)V

    .line 1397
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment$9;->c:Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->aa(Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/fragment/TrendFragment;->d(Ljava/util/List;)V

    .line 1398
    return-void

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
    .end sparse-switch
.end method
