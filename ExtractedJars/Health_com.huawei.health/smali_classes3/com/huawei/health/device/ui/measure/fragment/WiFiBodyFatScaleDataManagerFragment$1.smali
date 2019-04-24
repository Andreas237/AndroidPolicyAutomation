.class Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->initWeightUser()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->access$002(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;Ljava/util/List;)Ljava/util/List;

    .line 109
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$MyHandler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment$MyHandler;->sendEmptyMessage(I)Z

    .line 111
    return-void
.end method
