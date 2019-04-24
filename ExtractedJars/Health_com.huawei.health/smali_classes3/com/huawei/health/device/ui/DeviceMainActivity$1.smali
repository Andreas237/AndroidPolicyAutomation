.class Lcom/huawei/health/device/ui/DeviceMainActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ahi$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/DeviceMainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/device/ui/DeviceMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/DeviceMainActivity;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity$1;->c:Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEvent(Lo/ahi$a;)V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity$1;->c:Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-virtual {p1}, Lo/ahi$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->e(Lcom/huawei/health/device/ui/DeviceMainActivity;Ljava/lang/String;)V

    .line 120
    return-void
.end method
