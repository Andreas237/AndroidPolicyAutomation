.class Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;


# direct methods
.method constructor <init>(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)V
    .locals 0

    .line 788
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 791
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$800(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/util/Date;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    iget-object v2, v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->maintLogs2:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    invoke-static {v3}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$900(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->access$1000(Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;Ljava/util/Date;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 792
    return-void
.end method
