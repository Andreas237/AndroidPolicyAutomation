.class Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;->onDataChanged(Lo/acl;Lo/afz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;

.field final synthetic val$d:Lo/acl;

.field final synthetic val$dat:Lo/afz;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;Lo/acl;Lo/afz;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$1;->val$d:Lo/acl;

    iput-object p3, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$1;->val$dat:Lo/afz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 87
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$1;->val$d:Lo/acl;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1$1;->val$dat:Lo/afz;

    invoke-static {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;Lo/acl;Lo/afz;)V

    .line 88
    return-void
.end method
