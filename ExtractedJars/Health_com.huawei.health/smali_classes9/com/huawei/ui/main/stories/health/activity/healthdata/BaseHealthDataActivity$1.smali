.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 324
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 305
    return-void
.end method

.method public onPageSelected(I)V
    .locals 4

    .line 309
    const-string v0, "BaseHealthDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onPageSelected0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    if-nez p1, :cond_1

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;)Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/fragment/BeforeOneFragment;->f:Lo/fcu;

    invoke-virtual {v0}, Lo/fcu;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 314
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 317
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 319
    :goto_0
    return-void
.end method
