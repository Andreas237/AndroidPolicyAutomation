.class Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->downLoadDescriptionJsonFile(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V
    .locals 0

    .line 637
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 2

    .line 639
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9$1;

    invoke-direct {v1, p0, p2, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9;Lo/eba;Lo/eay;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 645
    return-void
.end method
