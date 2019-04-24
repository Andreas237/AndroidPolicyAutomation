.class Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$3;->a:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 57
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 58
    const-string v0, "SCUI_ClimbYearDetailFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClimbYearDetailFragment handleMessage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 61
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$3;->a:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)V

    .line 62
    goto :goto_0

    .line 64
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$3;->a:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$3;->a:Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)Lo/fad;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a(Lo/fad;)V

    .line 65
    .line 69
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1771 -> :sswitch_0
        0x1772 -> :sswitch_1
    .end sparse-switch
.end method
