.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)V
    .locals 0

    .line 601
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$4;)V
    .locals 0

    .line 601
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 609
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 605
    return-void
.end method

.method public onPageSelected(I)V
    .locals 4

    .line 613
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->a(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Lo/cgq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cgq;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v3

    .line 614
    instance-of v0, v3, Lcom/huawei/healthcloud/plugintrack/ui/fragment/HeartRateFrag;

    if-eqz v0, :cond_1

    .line 615
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->e(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 616
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 617
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c$3;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c$3;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 629
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "heartrateFrag"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;I)V

    goto/16 :goto_0

    .line 630
    :cond_1
    instance-of v0, v3, Lcom/huawei/healthcloud/plugintrack/ui/fragment/PaceFrag;

    if-eqz v0, :cond_2

    .line 631
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "paceFrag"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;I)V

    goto/16 :goto_0

    .line 632
    :cond_2
    instance-of v0, v3, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    if-eqz v0, :cond_4

    .line 633
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 634
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->e(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Z)V

    .line 636
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "trackScreen"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;I)V

    goto :goto_0

    .line 637
    :cond_4
    instance-of v0, v3, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;

    if-eqz v0, :cond_6

    .line 638
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    .line 639
    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->i(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Lo/cgt;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    .line 640
    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->i(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Lo/cgt;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cgt;->b(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 641
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->e(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Z)V

    .line 643
    :cond_5
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "detailFrag"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;I)V

    .line 645
    :cond_6
    :goto_0
    return-void
.end method
