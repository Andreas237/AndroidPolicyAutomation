.class Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;->e:Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;

    .line 159
    invoke-direct {p0, p2}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 160
    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;Landroid/os/Message;)V
    .locals 4

    .line 164
    const-string v0, "FlowStatisticsDisplay"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull() msg : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 167
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;->e:Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->a(Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;)V

    .line 168
    .line 173
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 156
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;->d(Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;Landroid/os/Message;)V

    return-void
.end method
