.class Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V
    .locals 0

    .line 434
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$5;->c:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 437
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$5;->c:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->s(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 438
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$5;->c:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->r(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 439
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$5;->c:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->r(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$5;->c:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->n(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_ic_health_running_signal1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 440
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$5;->c:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->q(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_page_gps:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 441
    return-void
.end method
