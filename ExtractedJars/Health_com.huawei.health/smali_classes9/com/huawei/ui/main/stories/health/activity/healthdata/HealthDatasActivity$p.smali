.class Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$p;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "p"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)V
    .locals 0

    .line 670
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 671
    return-void
.end method

.method private a(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V
    .locals 1

    .line 713
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->G(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 714
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 715
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Ljava/util/List;)Ljava/util/List;

    .line 717
    :cond_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->F(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)V

    .line 718
    return-void
.end method

.method private b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V
    .locals 1

    .line 697
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->C(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 698
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 699
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Ljava/util/List;)Ljava/util/List;

    .line 701
    :cond_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->A(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)V

    .line 702
    return-void
.end method

.method private d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V
    .locals 1

    .line 705
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->H(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 706
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 707
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Ljava/util/List;)Ljava/util/List;

    .line 709
    :cond_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->E(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)V

    .line 710
    return-void
.end method

.method private e(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V
    .locals 6

    .line 674
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->z(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 675
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->x(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 676
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->w(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 677
    new-instance v5, Ljava/text/DecimalFormat;

    const-string v0, "#0"

    invoke-direct {v5, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 678
    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    invoke-virtual {v5, v0}, Ljava/text/DecimalFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    .line 679
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "step"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;I)I

    .line 680
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "carior"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;I)I

    .line 681
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "floor"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;I)I

    .line 682
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "distance"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;I)I

    .line 683
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;I)V

    .line 684
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->i(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;I)V

    .line 685
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Lo/cmj;

    move-result-object v0

    invoke-virtual {v0}, Lo/cmj;->b()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->y(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3f847ae147ae147bL    # 0.01

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 686
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->j(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->B(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 687
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->x(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 689
    :cond_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->x(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 690
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->j(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->y(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 692
    :goto_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->D(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->i(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)I

    move-result v1

    int-to-double v1, v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 693
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get Steps calorie and floor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->y(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->i(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 694
    return-void
.end method

.method private f(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V
    .locals 5

    .line 721
    iget v0, p2, Landroid/os/Message;->arg1:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 722
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->a(Z)Z

    goto :goto_0

    .line 724
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->a(Z)Z

    .line 726
    :goto_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 727
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b(Z)Z

    .line 728
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->I(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 729
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->J(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 730
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->L(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 731
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->K(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x42700000    # 60.0f

    div-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 732
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->L(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x42700000    # 60.0f

    rem-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 734
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b(Z)Z

    .line 735
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->K(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->B(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 736
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->I(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 737
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->J(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 738
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->L(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 740
    :goto_1
    return-void
.end method

.method private h(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V
    .locals 6

    .line 747
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->M(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 748
    const/4 v3, 0x0

    .line 749
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 750
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 751
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 752
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hihealth/HiHealthData;

    .line 754
    :cond_0
    const-wide/16 v4, 0x0

    .line 755
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 756
    const-string v0, "heart_rate_last"

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    .line 758
    :cond_1
    const-wide v0, 0x3f847ae147ae147bL    # 0.01

    cmpg-double v0, v4, v0

    if-gez v0, :cond_2

    .line 759
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->M(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 760
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->N(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->B(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 762
    :cond_2
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->N(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v4, v5, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 764
    :goto_0
    return-void
.end method

.method private i(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V
    .locals 6

    .line 767
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 768
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->R(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->B(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 769
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->S(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 771
    :cond_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;

    .line 772
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->getVo2maxValue()I

    move-result v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;I)I

    .line 773
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->getTimeStamp()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;J)J

    .line 774
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->R(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 775
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->S(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 777
    :goto_0
    return-void
.end method

.method private k(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V
    .locals 8

    .line 780
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 781
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->P(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 782
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->Q(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->B(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 784
    :cond_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    .line 785
    const-string v6, ""

    .line 786
    invoke-virtual {v5}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_score()I

    move-result v7

    .line 787
    invoke-static {v7}, Lo/fja;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 788
    if-lez v7, :cond_1

    const/16 v0, 0x64

    if-ge v7, v0, :cond_1

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 789
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->P(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 790
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->P(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 791
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->Q(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    int-to-double v1, v7

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 793
    :cond_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->P(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 794
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->Q(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->B(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 797
    :goto_0
    return-void
.end method


# virtual methods
.method protected c(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V
    .locals 1

    .line 802
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 804
    :sswitch_0
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$p;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V

    .line 805
    goto :goto_0

    .line 807
    :sswitch_1
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$p;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V

    .line 808
    goto :goto_0

    .line 810
    :sswitch_2
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$p;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V

    .line 811
    goto :goto_0

    .line 813
    :sswitch_3
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$p;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V

    .line 814
    goto :goto_0

    .line 816
    :sswitch_4
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$p;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V

    .line 817
    goto :goto_0

    .line 819
    :sswitch_5
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$p;->h(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V

    .line 820
    goto :goto_0

    .line 822
    :sswitch_6
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$p;->i(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V

    .line 823
    goto :goto_0

    .line 825
    :sswitch_7
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$p;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V

    .line 826
    .line 831
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_2
        0x2 -> :sswitch_3
        0x3 -> :sswitch_4
        0x4 -> :sswitch_5
        0x5 -> :sswitch_6
        0x6 -> :sswitch_7
        0x68 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 667
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$p;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Landroid/os/Message;)V

    return-void
.end method
