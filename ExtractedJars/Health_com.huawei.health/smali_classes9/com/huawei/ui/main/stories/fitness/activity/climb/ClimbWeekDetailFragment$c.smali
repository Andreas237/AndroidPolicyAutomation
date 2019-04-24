.class Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;>;"
        }
    .end annotation
.end field

.field d:I


# direct methods
.method protected constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;I)V
    .locals 1

    .line 227
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$c;->b:Ljava/lang/ref/WeakReference;

    .line 228
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$c;->b:Ljava/lang/ref/WeakReference;

    .line 229
    iput p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$c;->d:I

    .line 230
    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 6

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;

    .line 235
    if-nez v4, :cond_0

    .line 236
    return-void

    .line 238
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment$c;->d:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 240
    :sswitch_0
    const-string v0, "SCUI_ClimbWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClimbWeekDetailFragmentrequestBarChartDatas err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 242
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 243
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 245
    const-string v0, "SCUI_ClimbWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestBarChartDatas() response data success:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    invoke-virtual {v4, v5}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;Ljava/util/List;)Ljava/util/List;

    .line 250
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1771

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 251
    goto :goto_0

    .line 253
    :sswitch_1
    const-string v0, "SCUI_ClimbWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClimbWeekDetailFragment requestTotalDatas() err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 255
    const-string v0, "SCUI_ClimbWeekDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTotalDatas() response data success!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;)Lo/fad;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->c(Lo/fad;)V

    .line 259
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbWeekDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1772

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 265
    :cond_2
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
