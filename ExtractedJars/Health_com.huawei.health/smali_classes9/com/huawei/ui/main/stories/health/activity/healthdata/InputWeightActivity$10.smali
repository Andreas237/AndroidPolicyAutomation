.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


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

    .line 640
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 13

    .line 643
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->m(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 644
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 645
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->s(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$mipmap;->ic_health_rtl_back_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 647
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->s(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->health_navbar_back_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 649
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 650
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->s(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emr;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    goto :goto_1

    .line 652
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->s(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_edit_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 654
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->r(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 655
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->t(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 656
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->u(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 657
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->x(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/fes;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 658
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->y(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/fes;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 659
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 660
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emp;->setVisibility(I)V

    goto :goto_2

    .line 662
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emp;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emp;->setVisibility(I)V

    .line 664
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Z)Z

    .line 666
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 667
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->p(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->z(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 668
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->o(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 670
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->p(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->z(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 672
    :goto_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->D(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_4

    .line 673
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->l(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->D(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 675
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Z)Z

    .line 676
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bodyfatlayout1.getVisibility() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->j(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 677
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->j(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_5

    .line 678
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Z)Z

    .line 680
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->j(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 681
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 682
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emp;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emp;->setVisibility(I)V

    .line 685
    :cond_6
    :goto_4
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v5

    .line 686
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->z(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_7

    .line 687
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    const-wide/high16 v1, 0x4034000000000000L    # 20.0

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;D)D

    .line 689
    :cond_7
    const/4 v6, 0x0

    .line 691
    :try_start_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 692
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->z(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    const-wide/16 v1, 0x16

    invoke-static {v1, v2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    move v6, v0

    .line 693
    const/16 v0, 0x14aa

    if-le v6, v0, :cond_9

    .line 694
    const/16 v6, 0x14aa

    goto :goto_5

    .line 697
    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->z(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    const-wide/16 v1, 0xa

    invoke-static {v1, v2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    move v6, v0

    .line 701
    :cond_9
    :goto_5
    goto :goto_6

    .line 699
    :catch_0
    move-exception v7

    .line 700
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parse weight data exception"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 702
    :goto_6
    new-instance v7, Ljava/math/BigDecimal;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->D(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 703
    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    const/4 v1, 0x1

    invoke-virtual {v7, v1, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    mul-double/2addr v0, v2

    double-to-int v8, v0

    .line 704
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->x(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/fes;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/fes;->setSelectedPosition(I)V

    .line 705
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->y(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/fes;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/fes;->setSelectedPosition(I)V

    .line 707
    const-string v9, ""

    .line 708
    const-string v10, ""

    .line 709
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->B(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Ljava/util/Date;)Ljava/lang/String;

    move-result-object v11

    .line 710
    const/4 v0, 0x0

    if-eq v0, v11, :cond_b

    .line 711
    const-string v0, " "

    invoke-virtual {v11, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    .line 712
    array-length v0, v12

    const/4 v1, 0x1

    if-le v0, v1, :cond_a

    .line 713
    const/4 v0, 0x0

    aget-object v9, v12, v0

    .line 714
    const/4 v0, 0x1

    aget-object v10, v12, v0

    goto :goto_7

    .line 716
    :cond_a
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dateArray is size less than 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 718
    :goto_7
    goto :goto_8

    .line 719
    :cond_b
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sDate is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 721
    :goto_8
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dateString"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    const-string v2, "timeString"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 722
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->h(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 723
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->i(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 724
    goto :goto_9

    .line 725
    :cond_c
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Z)Z

    .line 726
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->setResult(I)V

    .line 727
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$10;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->finish()V

    .line 729
    :goto_9
    return-void
.end method
