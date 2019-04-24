.class Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 115
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 116
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 118
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->getTimeStamp()J

    move-result-wide v1

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->getVo2maxValue()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->a(Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;JI)V

    .line 120
    goto :goto_0

    .line 122
    :sswitch_1
    const-string v0, "Track_BaseVo2maxDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_VO2MAX_BAR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$4;->c:Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->a()V

    .line 124
    .line 128
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
