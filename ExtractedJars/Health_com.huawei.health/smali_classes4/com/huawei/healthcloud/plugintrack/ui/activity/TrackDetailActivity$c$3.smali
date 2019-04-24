.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->onPageSelected(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;)V
    .locals 0

    .line 617
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c$3;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 620
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c$3;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 621
    new-instance v3, Lo/cee;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lo/dcy;

    invoke-direct {v1}, Lo/dcy;-><init>()V

    .line 623
    const/16 v2, 0x4e22

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v0, v1, v2}, Lo/cee;-><init>(Landroid/content/Context;Lo/dcy;Ljava/lang/String;)V

    .line 624
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/cee;->e(Z)V

    .line 625
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c$3;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Z)Z

    .line 626
    return-void
.end method
