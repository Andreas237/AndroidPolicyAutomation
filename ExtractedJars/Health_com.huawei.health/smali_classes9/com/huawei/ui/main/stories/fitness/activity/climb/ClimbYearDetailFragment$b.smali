.class Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field b:I

.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;I)V
    .locals 1

    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 221
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$b;->c:Ljava/lang/ref/WeakReference;

    .line 225
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$b;->c:Ljava/lang/ref/WeakReference;

    .line 226
    iput p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$b;->b:I

    .line 227
    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;

    .line 232
    if-nez v4, :cond_0

    .line 233
    return-void

    .line 235
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment$b;->b:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 237
    :sswitch_0
    const-string v0, "SCUI_ClimbYearDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClimbYearDetailFragment requestBarChartDatas err_code = "

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
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1771

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 240
    goto :goto_0

    .line 242
    :sswitch_1
    const-string v0, "SCUI_ClimbYearDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ClimbYearDetailFragment requestTotalDatas() err_code = "

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

    .line 243
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 244
    const-string v0, "SCUI_ClimbYearDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClimbYearDetailFragment requestTotalDatas() response data success!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)Lo/fad;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->c(Lo/fad;)V

    .line 247
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/climb/ClimbYearDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1772

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 253
    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
