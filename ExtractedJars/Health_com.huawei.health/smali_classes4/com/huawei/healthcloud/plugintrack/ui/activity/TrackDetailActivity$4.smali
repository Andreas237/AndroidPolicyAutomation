.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

.field final synthetic d:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Landroid/content/Context;)V
    .locals 0

    .line 736
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$4;->d:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 739
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$4;->d:Landroid/content/Context;

    const-string v1, "com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity"

    invoke-static {v0, v1}, Lo/dbf;->h(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 740
    const-string v0, "Track_TrackDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isForeground = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 741
    if-eqz v4, :cond_0

    .line 742
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 743
    const-string v0, "com.huawei.health"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 744
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.smartcenter.activity.WeightRecommendActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 745
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 746
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$4;->d:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 747
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->g(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 748
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$4;->b:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->g(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->c:Z

    .line 751
    :cond_0
    return-void
.end method
