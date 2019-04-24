.class Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)V
    .locals 0

    .line 290
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->g(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 296
    if-ge v3, v4, :cond_0

    .line 298
    return-void

    .line 300
    :cond_0
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    const-class v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 301
    const-string v0, "upperValue"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->i(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 302
    const-string v0, "lowerValue"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->g(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, v5}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->setResult(ILandroid/content/Intent;)V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity$5;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;->finish()V

    .line 305
    return-void
.end method
