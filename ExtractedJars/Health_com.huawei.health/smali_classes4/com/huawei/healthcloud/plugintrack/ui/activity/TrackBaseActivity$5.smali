.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity$5;->c:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 69
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 70
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 72
    :sswitch_0
    const-string v0, "Track_TrackBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Msg = HAS_PERMISSIONS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity$5;->c:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->c(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity$5;->c:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->a()V

    .line 75
    goto :goto_1

    .line 77
    :sswitch_1
    const-string v0, "Track_TrackBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Msg = NO_PERMISSIONS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity$5;->c:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackBaseActivity;->finish()V

    .line 79
    goto :goto_1

    .line 81
    :goto_0
    const-string v0, "Track_TrackBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Msg = NO_PERMISSIONS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
