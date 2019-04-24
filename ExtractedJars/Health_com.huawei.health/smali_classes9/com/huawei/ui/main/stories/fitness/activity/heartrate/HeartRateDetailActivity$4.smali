.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 107
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

    const-class v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 109
    return-void
.end method
