.class Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1$4;->d:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1$4;->d:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;->c:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->a()V

    .line 163
    return-void
.end method
