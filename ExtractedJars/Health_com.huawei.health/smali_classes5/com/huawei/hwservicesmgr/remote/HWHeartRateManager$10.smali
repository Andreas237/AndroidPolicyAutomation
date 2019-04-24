.class Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;)V
    .locals 0

    .line 1199
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1202
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$10;->this$0:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->access$302(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;Z)Z

    .line 1203
    return-void
.end method
