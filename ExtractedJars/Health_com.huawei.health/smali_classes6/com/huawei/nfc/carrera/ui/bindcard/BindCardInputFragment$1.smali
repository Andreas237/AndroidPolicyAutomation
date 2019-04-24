.class Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getPositionByMobileNet()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V
    .locals 0

    .line 334
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 338
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 339
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 341
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$200(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Lcom/amap/api/location/LocationManagerProxy;

    move-result-object v0

    const-string v1, "lbs"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$1;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    iget-object v5, v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->aMapLocationListener:Lcom/amap/api/location/AMapLocationListener;

    const-wide/16 v2, 0xc8

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-virtual/range {v0 .. v5}, Lcom/amap/api/location/LocationManagerProxy;->requestLocationData(Ljava/lang/String;JFLcom/amap/api/location/AMapLocationListener;)V

    .line 342
    return-void
.end method
