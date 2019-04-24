.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 853
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;)V
    .locals 0

    .line 853
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 5

    .line 857
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v3

    .line 858
    const/4 v4, 0x0

    .line 859
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    .line 860
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v4, v0, -0x4

    goto :goto_0

    .line 862
    :cond_0
    return-void

    .line 864
    :goto_0
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 866
    :pswitch_0
    if-nez v3, :cond_1

    .line 867
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto/16 :goto_1

    .line 868
    :cond_1
    const/4 v0, 0x1

    if-ne v3, v0, :cond_2

    .line 869
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    add-int/lit8 v1, v4, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto/16 :goto_1

    .line 870
    :cond_2
    add-int/lit8 v0, v4, 0x2

    if-ne v3, v0, :cond_3

    .line 871
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto :goto_1

    .line 872
    :cond_3
    add-int/lit8 v0, v4, 0x3

    if-ne v3, v0, :cond_7

    .line 873
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto :goto_1

    .line 877
    :pswitch_1
    if-nez v3, :cond_4

    .line 878
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto :goto_1

    .line 879
    :cond_4
    const/4 v0, 0x1

    if-ne v3, v0, :cond_5

    .line 880
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    add-int/lit8 v1, v4, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto :goto_1

    .line 881
    :cond_5
    add-int/lit8 v0, v4, 0x2

    if-ne v3, v0, :cond_6

    .line 882
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto :goto_1

    .line 883
    :cond_6
    add-int/lit8 v0, v4, 0x3

    if-ne v3, v0, :cond_7

    .line 884
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    nop

    .line 888
    .line 892
    :cond_7
    :goto_1
    :pswitch_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 897
    return-void
.end method

.method public onPageSelected(I)V
    .locals 6

    .line 901
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    .line 902
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v3, v0, -0x4

    .line 903
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->u(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    add-int/2addr v0, v3

    rem-int v4, v0, v3

    .line 904
    add-int/lit8 v0, p1, -0x1

    add-int/2addr v0, v3

    rem-int v5, v0, v3

    .line 905
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v4, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v5, :cond_0

    .line 906
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

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

    .line 907
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

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

    .line 909
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;->d:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->c(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;I)I

    .line 911
    :cond_1
    return-void
.end method
