.class Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;


# direct methods
.method private constructor <init>(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$a;->b:Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$2;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$a;-><init>(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper$a;->b:Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;

    invoke-static {v0}, Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;->d(Lcom/huawei/health/device/connectivity/comm/ClassicDeviceHelper;)Lo/aby;

    move-result-object v0

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lo/aby;->onStateChanged(I)V

    .line 78
    return-void
.end method
