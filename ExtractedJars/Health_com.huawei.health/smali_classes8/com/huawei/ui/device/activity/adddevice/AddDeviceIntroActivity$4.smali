.class Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)V
    .locals 0

    .line 296
    iput-object p1, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$4;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 4

    .line 329
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment onPageScrollStateChanged() arg0 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 4

    .line 324
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment onPageScrolled() arg0 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " arg1 = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " arg2 = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    return-void
.end method

.method public onPageSelected(I)V
    .locals 6

    .line 300
    const-string v0, "AddDeviceIntroActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment onPageSelected() arg0 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$4;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0, p1}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;I)V

    .line 303
    const/4 v4, 0x0

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$4;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 305
    :goto_0
    if-ge v4, v5, :cond_3

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$4;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->a(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 307
    add-int/lit8 v0, v5, -0x1

    sub-int/2addr v0, v4

    if-ne p1, v0, :cond_0

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$4;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->btn_health_point_orange_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 310
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$4;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->btn_health_point_gray_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 313
    :cond_1
    if-ne p1, v4, :cond_2

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$4;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->btn_health_point_orange_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 316
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity$4;->d:Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;->c(Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->btn_health_point_gray_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 305
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 320
    :cond_3
    return-void
.end method
