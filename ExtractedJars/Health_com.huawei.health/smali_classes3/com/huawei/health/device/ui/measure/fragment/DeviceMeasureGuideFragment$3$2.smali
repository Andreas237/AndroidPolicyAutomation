.class Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;->onProgressChanged(Lo/acl;Lo/afz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;

.field final synthetic val$d:Lo/acl;

.field final synthetic val$dat:Lo/afz;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;Lo/acl;Lo/afz;)V
    .locals 0

    .line 403
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$2;->val$d:Lo/acl;

    iput-object p3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$2;->val$dat:Lo/afz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 406
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$2;->val$d:Lo/acl;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$2;->val$dat:Lo/afz;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->handleDataChangedInUiThread(Lo/acl;Lo/afz;Z)V

    .line 407
    return-void
.end method
