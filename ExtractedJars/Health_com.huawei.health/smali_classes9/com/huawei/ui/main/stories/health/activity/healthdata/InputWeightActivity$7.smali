.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$7;
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
.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V
    .locals 0

    .line 615
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$7;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

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

    .line 619
    int-to-double v0, p2

    const-wide v2, 0x3fb999999999999aL    # 0.1

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double v5, v2, v0

    .line 621
    new-instance v7, Ljava/math/BigDecimal;

    invoke-direct {v7, v5, v6}, Ljava/math/BigDecimal;-><init>(D)V

    .line 622
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-virtual {v7, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v7

    .line 623
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$7;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v7}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;D)D

    .line 624
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$7;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->n(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 625
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$7;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->l(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$7;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->n(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 627
    :cond_0
    return-void
.end method
