.class Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9;->onPullingChange(Lo/eay;Lo/eba;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9;

.field final synthetic val$result:Lo/eba;

.field final synthetic val$task:Lo/eay;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9;Lo/eba;Lo/eay;)V
    .locals 0

    .line 639
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9$1;->val$result:Lo/eba;

    iput-object p3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9$1;->val$task:Lo/eay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 642
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9$1;->val$result:Lo/eba;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9$1;->val$task:Lo/eay;

    invoke-static {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$1800(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Lo/eba;Lo/eay;)V

    .line 643
    return-void
.end method
