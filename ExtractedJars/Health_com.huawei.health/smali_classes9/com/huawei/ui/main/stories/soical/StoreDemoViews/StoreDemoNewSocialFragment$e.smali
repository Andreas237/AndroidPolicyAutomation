.class Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 800
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$4;)V
    .locals 0

    .line 800
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 5

    .line 804
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v3

    .line 805
    const/4 v4, 0x0

    .line 806
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    .line 807
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v4, v0, -0x2

    goto :goto_0

    .line 809
    :cond_0
    return-void

    .line 811
    :goto_0
    packed-switch p1, :pswitch_data_0

    goto :goto_1

    .line 813
    :pswitch_0
    if-nez v3, :cond_1

    .line 814
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto :goto_1

    .line 815
    :cond_1
    add-int/lit8 v0, v4, 0x1

    if-ne v3, v0, :cond_3

    .line 816
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto :goto_1

    .line 820
    :pswitch_1
    add-int/lit8 v0, v4, 0x1

    if-ne v3, v0, :cond_2

    .line 821
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto :goto_1

    .line 822
    :cond_2
    if-nez v3, :cond_3

    .line 823
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    nop

    .line 827
    .line 831
    :cond_3
    :goto_1
    :pswitch_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 836
    return-void
.end method

.method public onPageSelected(I)V
    .locals 6

    .line 840
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_1

    .line 841
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v3, v0, -0x2

    .line 842
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->n(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    add-int/2addr v0, v3

    rem-int v4, v0, v3

    .line 843
    add-int/lit8 v0, p1, -0x1

    add-int/2addr v0, v3

    rem-int v5, v0, v3

    .line 844
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v4, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v5, :cond_0

    .line 845
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$mipmap;->btn_health_point_white_nor:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 846
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$mipmap;->btn_health_point_white_sel:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 848
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;I)I

    .line 850
    :cond_1
    return-void
.end method
