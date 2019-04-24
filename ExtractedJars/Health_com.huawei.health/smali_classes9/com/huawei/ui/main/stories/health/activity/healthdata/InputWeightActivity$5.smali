.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fes$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V
    .locals 0

    .line 583
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/util/List;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 588
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 589
    int-to-double v0, p2

    const-wide v2, 0x3fb999999999999aL    # 0.1

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x4036000000000000L    # 22.0

    add-double v5, v2, v0

    .line 590
    new-instance v7, Ljava/math/BigDecimal;

    invoke-direct {v7, v5, v6}, Ljava/math/BigDecimal;-><init>(D)V

    .line 591
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-virtual {v7, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v7

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v7}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;D)D

    .line 594
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->p(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 595
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->o(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cxh;->a(D)D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;D)D

    .line 598
    goto :goto_0

    .line 599
    :cond_0
    int-to-double v0, p2

    const-wide v2, 0x3fb999999999999aL    # 0.1

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    add-double v5, v2, v0

    .line 600
    new-instance v7, Ljava/math/BigDecimal;

    invoke-direct {v7, v5, v6}, Ljava/math/BigDecimal;-><init>(D)V

    .line 601
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-virtual {v7, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v7

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v7}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;D)D

    .line 604
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->p(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$5;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 606
    :goto_0
    return-void
.end method
