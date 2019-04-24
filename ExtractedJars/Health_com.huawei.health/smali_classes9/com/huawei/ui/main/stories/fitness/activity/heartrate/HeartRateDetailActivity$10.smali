.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ezi$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->d(Lo/ezh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$10;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;I)V
    .locals 6

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$10;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$10;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->a:Lo/eyk;

    invoke-virtual {v0}, Lo/eyk;->d()Lo/ezt;

    move-result-object v3

    .line 298
    invoke-interface {v3}, Lo/ezt;->e()Landroid/view/View;

    move-result-object v4

    .line 299
    if-nez v4, :cond_0

    .line 300
    return-void

    .line 302
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    .line 303
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 304
    move-object v0, v5

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 306
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$10;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-virtual {v0, v4, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;II)V

    .line 309
    return-void
.end method
