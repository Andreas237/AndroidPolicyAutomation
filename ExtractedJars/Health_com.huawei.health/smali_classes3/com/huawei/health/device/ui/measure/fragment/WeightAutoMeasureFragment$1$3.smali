.class Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;->onFailed(Lo/acl;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;

.field final synthetic val$c:I

.field final synthetic val$d:Lo/acl;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;Lo/acl;I)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$3;->this$1:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$3;->val$d:Lo/acl;

    iput p3, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$3;->val$c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 129
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$3;->this$1:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$3;->val$d:Lo/acl;

    iget v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$3;->val$c:I

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->handleFailedEventInUiThread(Lo/acl;I)V

    .line 130
    return-void
.end method
