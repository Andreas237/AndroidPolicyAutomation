.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;
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
.field final synthetic a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V
    .locals 0

    .line 731
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 734
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->h(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;I)I

    .line 735
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->m(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 736
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 737
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->s(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$mipmap;->ic_health_rtl_back_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 739
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->s(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->health_navbar_back_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 741
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->x(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/fes;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 742
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->y(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/fes;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 743
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->r(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 744
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->t(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 745
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->u(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 746
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->q(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 747
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->s(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emr;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    goto :goto_1

    .line 749
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->s(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_edit_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 751
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->w(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 752
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emp;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emp;->setVisibility(I)V

    goto :goto_2

    .line 754
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->v(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)Lo/emp;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emp;->setVisibility(I)V

    .line 756
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;Z)Z

    .line 757
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->C(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    goto :goto_3

    .line 759
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$6;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;->A(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;)V

    .line 761
    :goto_3
    return-void
.end method
