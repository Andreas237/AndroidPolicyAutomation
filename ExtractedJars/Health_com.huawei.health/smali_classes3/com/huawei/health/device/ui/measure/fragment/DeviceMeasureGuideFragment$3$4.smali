.class Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;->onFailed(Lo/acl;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;

.field final synthetic val$c:I

.field final synthetic val$d:Lo/acl;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;Lo/acl;I)V
    .locals 0

    .line 456
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$4;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$4;->val$d:Lo/acl;

    iput p3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$4;->val$c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 459
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$4;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$4;->val$d:Lo/acl;

    iget v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$4;->val$c:I

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->handleFailedEventInUiThread(Lo/acl;I)V

    .line 460
    return-void
.end method
