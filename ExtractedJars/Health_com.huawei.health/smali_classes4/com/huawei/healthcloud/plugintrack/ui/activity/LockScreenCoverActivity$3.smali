.class Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$3;
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
.field final synthetic a:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V
    .locals 0

    .line 410
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$3;->a:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 413
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$3;->a:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->s(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 414
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$3;->a:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->r(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 415
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$3;->a:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->s(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sport_gps_not_open:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 416
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$3;->a:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->q(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_page_gps:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 417
    return-void
.end method
