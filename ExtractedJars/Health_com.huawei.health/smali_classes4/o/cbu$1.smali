.class Lo/cbu$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cez;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbu;->aJ()V
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

    .line 1613
    iput-object p1, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(II)V
    .locals 8

    .line 1616
    const-string v0, "Track_SportManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "steps : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " motion: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1617
    const/4 v0, 0x5

    if-ne p2, v0, :cond_0

    .line 1619
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->a(Lo/cbu;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1620
    const-string v0, "Track_SportManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "User stop moving"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1621
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cbu;->b(Lo/cbu;Z)Z

    .line 1622
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/cbu;->c(Lo/cbu;J)J

    goto :goto_0

    .line 1625
    :cond_0
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->a(Lo/cbu;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1626
    const-string v0, "Track_SportManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "User resume moving"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1627
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    iget-object v1, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v1}, Lo/cbu;->b(Lo/cbu;)J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v5, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v5}, Lo/cbu;->d(Lo/cbu;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    add-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lo/cbu;->e(Lo/cbu;J)J

    .line 1628
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->c(Lo/cbu;)I

    .line 1629
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cbu;->b(Lo/cbu;Z)Z

    .line 1633
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0, p2}, Lo/cbu;->e(Lo/cbu;I)I

    .line 1634
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    iget-object v1, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v1}, Lo/cbu;->e(Lo/cbu;)I

    move-result v1

    invoke-static {v0, v1}, Lo/cbu;->d(Lo/cbu;I)I

    .line 1635
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0, p1}, Lo/cbu;->a(Lo/cbu;I)I

    .line 1637
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    iget-object v1, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v1}, Lo/cbu;->h(Lo/cbu;)I

    move-result v1

    iget-object v2, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v2}, Lo/cbu;->e(Lo/cbu;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/cbu;->a(Lo/cbu;II)V

    .line 1639
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->i(Lo/cbu;)I

    move-result v0

    const/16 v1, 0x108

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->k(Lo/cbu;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 1640
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->f(Lo/cbu;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1641
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->g(Lo/cbu;)F

    move-result v0

    iget-object v1, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v1}, Lo/cbu;->e(Lo/cbu;)I

    move-result v1

    iget-object v2, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v2}, Lo/cbu;->h(Lo/cbu;)I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1}, Lo/cdu;->b(I)F

    move-result v1

    mul-float v7, v0, v1

    .line 1642
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    iget-object v1, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v1}, Lo/cbu;->h(Lo/cbu;)I

    move-result v1

    iget-object v2, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v2}, Lo/cbu;->e(Lo/cbu;)I

    move-result v2

    invoke-static {v0, v1, v2, v7}, Lo/cbu;->d(Lo/cbu;IIF)V

    .line 1643
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->p(Lo/cbu;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1644
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->p(Lo/cbu;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x12d

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1647
    :cond_2
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cbu;->a(Lo/cbu;Z)Z

    .line 1648
    return-void

    .line 1653
    :cond_3
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->e(Lo/cbu;)I

    move-result v0

    iget-object v1, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v1}, Lo/cbu;->h(Lo/cbu;)I

    move-result v1

    sub-int/2addr v0, v1

    const/16 v1, 0x1e

    if-le v0, v1, :cond_4

    .line 1654
    const-string v0, "Track_SportManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Steps in 5s is to large "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v2}, Lo/cbu;->e(Lo/cbu;)I

    move-result v2

    iget-object v3, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v3}, Lo/cbu;->h(Lo/cbu;)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " don\'t estimateSportDistanceBySteps"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1655
    return-void

    .line 1658
    :cond_4
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->o(Lo/cbu;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->k(Lo/cbu;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 1659
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    iget-object v1, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v1}, Lo/cbu;->l(Lo/cbu;)I

    move-result v1

    iget-object v2, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v2}, Lo/cbu;->e(Lo/cbu;)I

    move-result v2

    iget-object v3, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v3}, Lo/cbu;->h(Lo/cbu;)I

    move-result v3

    sub-int/2addr v2, v3

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/cbu;->c(Lo/cbu;I)I

    .line 1660
    const-string v0, "Track_SportManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mEstimateStepBuffer is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v2}, Lo/cbu;->l(Lo/cbu;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1664
    :cond_5
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->n(Lo/cbu;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->o(Lo/cbu;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->k(Lo/cbu;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    const/4 v0, 0x5

    if-eq p2, v0, :cond_7

    .line 1666
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->h(Lo/cbu;)I

    move-result v7

    .line 1668
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->l(Lo/cbu;)I

    move-result v0

    sub-int v0, v7, v0

    if-lez v0, :cond_6

    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->l(Lo/cbu;)I

    move-result v0

    const/16 v1, 0x96

    if-ge v0, v1, :cond_6

    .line 1670
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->l(Lo/cbu;)I

    move-result v0

    sub-int/2addr v7, v0

    .line 1672
    :cond_6
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cbu;->c(Lo/cbu;I)I

    .line 1673
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    iget-object v1, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v1}, Lo/cbu;->e(Lo/cbu;)I

    move-result v1

    iget-object v2, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v2}, Lo/cbu;->g(Lo/cbu;)F

    move-result v2

    invoke-static {v0, v7, v1, v2}, Lo/cbu;->d(Lo/cbu;IIF)V

    .line 1676
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->p(Lo/cbu;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 1677
    iget-object v0, p0, Lo/cbu$1;->a:Lo/cbu;

    invoke-static {v0}, Lo/cbu;->p(Lo/cbu;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x12d

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1681
    :cond_7
    return-void
.end method
