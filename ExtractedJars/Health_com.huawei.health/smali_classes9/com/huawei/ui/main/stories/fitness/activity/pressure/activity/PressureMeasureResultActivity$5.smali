.class Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$5;
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

    .line 334
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 336
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "button click cancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    return-void
.end method
