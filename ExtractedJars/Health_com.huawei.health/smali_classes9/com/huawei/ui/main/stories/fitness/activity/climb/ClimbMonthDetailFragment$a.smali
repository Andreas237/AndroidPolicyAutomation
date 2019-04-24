.class Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:I

.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;I)V
    .locals 1

    .line 225
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 222
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$a;->c:Ljava/lang/ref/WeakReference;

    .line 226
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$a;->c:Ljava/lang/ref/WeakReference;

    .line 227
    iput p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$a;->a:I

    .line 228
    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 6

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;

    .line 233
    if-nez v4, :cond_0

    .line 234
    return-void

    .line 236
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment$a;->a:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 238
    :sswitch_0
    const-string v0, "SCUI_ClimbMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClimbMonthDetailFragment requestBarChartDatas err_code = "

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

    .line 239
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 241
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 243
    const-string v0, "SCUI_ClimbMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClimbMonthDetailFragment requestBarChartDatas() response data success:"

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

    .line 244
    invoke-virtual {v4, v5}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;Ljava/util/List;)Ljava/util/List;

    .line 248
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1771

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 249
    goto :goto_0

    .line 251
    :sswitch_1
    const-string v0, "SCUI_ClimbMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClimbMonthDetailFragment requestTotalDatas() err_code = "

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

    .line 252
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 253
    const-string v0, "SCUI_ClimbMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClimbMonthDetailFragment requestTotalDatas() response data success!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;)Lo/fad;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->c(Lo/fad;)V

    .line 256
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbMonthDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1772

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 262
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
