.class Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;->onStartCommand(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;


# direct methods
.method constructor <init>(Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService$4;->b:Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 42
    const-string v0, "SMART_SmartInteractService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "err_code="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService$4;->b:Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;

    invoke-virtual {v0}, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;->stopSelf()V

    .line 44
    return-void
.end method
