.class Lo/eta$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/etc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eta;->c(Lo/etc;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/etc<Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/etc;

.field final synthetic c:Lo/fil;

.field final synthetic d:Lo/eta;


# direct methods
.method constructor <init>(Lo/eta;ILo/etc;Lo/fil;)V
    .locals 0

    .line 555
    iput-object p1, p0, Lo/eta$3;->d:Lo/eta;

    iput p2, p0, Lo/eta$3;->a:I

    iput-object p3, p0, Lo/eta$3;->b:Lo/etc;

    iput-object p4, p0, Lo/eta$3;->c:Lo/fil;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic b(Ljava/lang/Object;)V
    .locals 1

    .line 555
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;

    invoke-virtual {p0, v0}, Lo/eta$3;->e(Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;)V

    return-void
.end method

.method public e(Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;)V
    .locals 4

    .line 558
    if-eqz p1, :cond_2

    .line 559
    iget-object v0, p0, Lo/eta$3;->d:Lo/eta;

    invoke-static {v0, p1}, Lo/eta;->b(Lo/eta;Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 560
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6210\u7ee9\u8fbe\u6807\uff0c\u5220\u9664\u6570\u636e\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/eta$3;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    iget-object v0, p0, Lo/eta$3;->d:Lo/eta;

    invoke-static {v0}, Lo/eta;->e(Lo/eta;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/eta$3;->a:I

    if-le v0, v1, :cond_0

    .line 563
    iget-object v0, p0, Lo/eta$3;->d:Lo/eta;

    invoke-static {v0}, Lo/eta;->e(Lo/eta;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lo/eta$3;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 566
    :cond_0
    iget-object v0, p0, Lo/eta$3;->d:Lo/eta;

    invoke-static {v0}, Lo/eta;->e(Lo/eta;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/eta$3;->a:I

    if-le v0, v1, :cond_3

    .line 567
    iget-object v0, p0, Lo/eta$3;->d:Lo/eta;

    iget-object v1, p0, Lo/eta$3;->b:Lo/etc;

    iget v2, p0, Lo/eta$3;->a:I

    invoke-static {v0, v1, v2}, Lo/eta;->e(Lo/eta;Lo/etc;I)V

    .line 568
    return-void

    .line 572
    :cond_1
    iget-object v0, p0, Lo/eta$3;->c:Lo/fil;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/fil;->f(I)V

    .line 573
    iget-object v0, p0, Lo/eta$3;->c:Lo/fil;

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->getActivityTarget()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fil;->h(I)V

    .line 574
    iget-object v0, p0, Lo/eta$3;->c:Lo/fil;

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->getContinuity()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fil;->k(I)V

    .line 575
    iget-object v0, p0, Lo/eta$3;->c:Lo/fil;

    invoke-virtual {p1}, Lcom/huawei/ui/homehealth/todoCard/bean/HistoryBean;->getTargetDays()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fil;->g(I)V

    .line 576
    iget-object v0, p0, Lo/eta$3;->c:Lo/fil;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fil;->i(I)V

    .line 578
    iget-object v0, p0, Lo/eta$3;->d:Lo/eta;

    invoke-static {v0}, Lo/eta;->e(Lo/eta;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/eta$3;->a:I

    add-int/lit8 v1, v1, 0x1

    if-le v0, v1, :cond_3

    .line 579
    iget-object v0, p0, Lo/eta$3;->d:Lo/eta;

    iget-object v1, p0, Lo/eta$3;->b:Lo/etc;

    iget v2, p0, Lo/eta$3;->a:I

    add-int/lit8 v2, v2, 0x1

    invoke-static {v0, v1, v2}, Lo/eta;->e(Lo/eta;Lo/etc;I)V

    .line 580
    return-void

    .line 584
    :cond_2
    iget-object v0, p0, Lo/eta$3;->c:Lo/fil;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fil;->f(I)V

    .line 586
    iget-object v0, p0, Lo/eta$3;->d:Lo/eta;

    invoke-static {v0}, Lo/eta;->e(Lo/eta;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/eta$3;->a:I

    add-int/lit8 v1, v1, 0x1

    if-le v0, v1, :cond_3

    .line 587
    iget-object v0, p0, Lo/eta$3;->d:Lo/eta;

    iget-object v1, p0, Lo/eta$3;->b:Lo/etc;

    iget v2, p0, Lo/eta$3;->a:I

    add-int/lit8 v2, v2, 0x1

    invoke-static {v0, v1, v2}, Lo/eta;->e(Lo/eta;Lo/etc;I)V

    .line 588
    return-void

    .line 592
    :cond_3
    const-string v0, "TodoCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5386\u53f2\u6570\u636e\u83b7\u53d6\u5b8c\u6bd5\uff0c\u56de\u8c03\u7ed3\u679c"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 593
    iget-object v0, p0, Lo/eta$3;->d:Lo/eta;

    iget-object v1, p0, Lo/eta$3;->d:Lo/eta;

    invoke-static {v1}, Lo/eta;->e(Lo/eta;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eta;->d(Lo/eta;Ljava/util/List;)V

    .line 594
    iget-object v0, p0, Lo/eta$3;->b:Lo/etc;

    iget-object v1, p0, Lo/eta$3;->d:Lo/eta;

    invoke-static {v1}, Lo/eta;->e(Lo/eta;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/etc;->b(Ljava/lang/Object;)V

    .line 595
    return-void
.end method
