.class Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;)V
    .locals 0

    .line 322
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDetailActivity;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;Ljava/lang/Class;)V

    goto :goto_0

    .line 328
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;Ljava/lang/Class;)V

    .line 331
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->finish()V

    .line 332
    return-void
.end method
