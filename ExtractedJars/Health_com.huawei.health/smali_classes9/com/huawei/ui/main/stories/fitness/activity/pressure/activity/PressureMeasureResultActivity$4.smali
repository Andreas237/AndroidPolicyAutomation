.class Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$4;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$4;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$4;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;)V

    goto :goto_0

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$4;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;)V

    .line 103
    :goto_0
    return-void
.end method
