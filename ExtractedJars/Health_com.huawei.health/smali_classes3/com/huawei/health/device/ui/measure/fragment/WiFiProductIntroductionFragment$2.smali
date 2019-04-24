.class Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)V
    .locals 0

    .line 589
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 4

    .line 619
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageScrollStateChanged() arg0 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 620
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 615
    return-void
.end method

.method public onPageSelected(I)V
    .locals 6

    .line 593
    const-string v0, "WiFiProductIntroductionFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPageSelected() arg0 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 595
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1500(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1600(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;ILandroid/widget/TextView;)V

    .line 596
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 597
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    .line 598
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1800(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lo/ahf;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 599
    add-int/lit8 v0, v4, -0x1

    sub-int/2addr v0, v5

    if-ne p1, v0, :cond_0

    .line 600
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->btn_health_point_orange_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 602
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->btn_health_point_gray_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 605
    :cond_1
    if-ne p1, v5, :cond_2

    .line 606
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->btn_health_point_orange_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 608
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->btn_health_point_gray_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 597
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 612
    :cond_3
    return-void
.end method
