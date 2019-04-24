.class public Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private d:Lo/cgf;

.field private e:Lo/cgj;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->d:Lo/cgf;

    .line 29
    new-instance v0, Lo/cgj;

    invoke-direct {v0}, Lo/cgj;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->e:Lo/cgj;

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 6

    .line 52
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v4

    .line 53
    invoke-virtual {v4}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v5

    .line 54
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->d:Lo/cgf;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->d:Lo/cgf;

    invoke-virtual {v5, v0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->d:Lo/cgf;

    .line 58
    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 60
    :sswitch_0
    new-instance v0, Lo/cgi;

    invoke-direct {v0}, Lo/cgi;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->d:Lo/cgf;

    .line 61
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->d:Lo/cgf;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity$1;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;)V

    invoke-virtual {v0, v1}, Lo/cgf;->b(Landroid/view/View$OnClickListener;)V

    .line 67
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->d:Lo/cgf;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity$4;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;)V

    invoke-virtual {v0, v1}, Lo/cgf;->a(Landroid/view/View$OnClickListener;)V

    .line 73
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->fragment_container:I

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->d:Lo/cgf;

    invoke-virtual {v5, v0, v1}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 74
    goto :goto_1

    .line 76
    :sswitch_1
    new-instance v0, Lo/cgo;

    invoke-direct {v0}, Lo/cgo;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->d:Lo/cgf;

    .line 77
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->d:Lo/cgf;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity$2;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;)V

    invoke-virtual {v0, v1}, Lo/cgf;->b(Landroid/view/View$OnClickListener;)V

    .line 83
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->d:Lo/cgf;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity$3;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;)V

    invoke-virtual {v0, v1}, Lo/cgf;->a(Landroid/view/View$OnClickListener;)V

    .line 89
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->fragment_container:I

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->d:Lo/cgf;

    invoke-virtual {v5, v0, v1}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 90
    goto :goto_1

    .line 92
    :goto_0
    const-string v0, "Track_TrackLineChartActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unknown step in showTipsFrag,warning!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    :goto_1
    invoke-virtual {v5}, Landroid/app/FragmentTransaction;->commit()I

    .line 96
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 101
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 103
    const-string v0, "Track_TrackLineChartActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onConfigurationChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 37
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 38
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->activity_track_linechart:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->setContentView(I)V

    .line 39
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v2

    .line 40
    invoke-virtual {v2}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v3

    .line 41
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->fragment_container:I

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->e:Lo/cgj;

    invoke-virtual {v3, v0, v1}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 42
    invoke-virtual {v3}, Landroid/app/FragmentTransaction;->commit()I

    .line 43
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    .line 44
    new-instance v5, Lo/cee;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lo/dcy;

    invoke-direct {v1}, Lo/dcy;-><init>()V

    invoke-direct {v5, v0, v1, v4}, Lo/cee;-><init>(Landroid/content/Context;Lo/dcy;Ljava/lang/String;)V

    .line 45
    invoke-virtual {v5}, Lo/cee;->n()Z

    move-result v0

    if-nez v0, :cond_0

    .line 46
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackLineChartActivity;->b(I)V

    .line 47
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cee;->d(Z)V

    .line 49
    :cond_0
    return-void
.end method
