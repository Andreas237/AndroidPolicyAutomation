.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)V
    .locals 0

    .line 845
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$2;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 849
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 850
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 852
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/graphics/Bitmap;

    .line 853
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$2;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 854
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$2;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->f(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;)V

    .line 855
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$2;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->c()V

    .line 856
    .line 861
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
