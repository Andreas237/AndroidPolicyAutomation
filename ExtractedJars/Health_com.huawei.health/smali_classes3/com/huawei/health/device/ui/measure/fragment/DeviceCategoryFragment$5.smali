.class Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;
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

    .line 264
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 267
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Lo/agu;

    move-result-object v1

    invoke-static {v0, p3, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;ILo/agu;)V

    .line 268
    return-void
.end method
