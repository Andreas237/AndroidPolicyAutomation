.class Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 58
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 59
    const-string v0, "SCUI_ClimbDayDetailFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClimbDayDetailFragment handleMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 62
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;)V

    .line 63
    goto :goto_0

    .line 65
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment$3;->e:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;)Lo/fad;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbDayDetailFragment;->a(Lo/fad;)V

    .line 66
    .line 70
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1771 -> :sswitch_0
        0x1772 -> :sswitch_1
    .end sparse-switch
.end method
