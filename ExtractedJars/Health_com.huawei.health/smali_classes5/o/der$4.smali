.class Lo/der$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/der;->b(Lo/dgg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dgg;

.field final synthetic c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field final synthetic d:Lo/der;


# direct methods
.method constructor <init>(Lo/der;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Lo/dgg;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lo/der$4;->d:Lo/der;

    iput-object p2, p0, Lo/der$4;->c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    iput-object p3, p0, Lo/der$4;->a:Lo/dgg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 86
    iget-object v0, p0, Lo/der$4;->c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v0

    invoke-virtual {v0}, Lo/ddc;->a()I

    move-result v4

    .line 87
    new-instance v5, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;-><init>()V

    .line 88
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setProductId(Ljava/lang/Integer;)V

    .line 89
    iget-object v0, p0, Lo/der$4;->c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setUniqueId(Ljava/lang/String;)V

    .line 90
    iget-object v0, p0, Lo/der$4;->c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;->setName(Ljava/lang/String;)V

    .line 91
    const-string v0, "UIDV_FitnessCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " startDeviceLinkage BindDeviceReq "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lo/der$4;->d:Lo/der;

    invoke-static {v0}, Lo/der;->a(Lo/der;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceReq;)Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;

    move-result-object v6

    .line 93
    if-eqz v6, :cond_0

    .line 94
    iget-object v0, p0, Lo/der$4;->d:Lo/der;

    iget-object v1, p0, Lo/der$4;->c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/der$4;->a:Lo/dgg;

    invoke-static {v0, v6, v1, v2}, Lo/der;->d(Lo/der;Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;Ljava/lang/String;Lo/dgg;)V

    goto :goto_0

    .line 96
    :cond_0
    iget-object v0, p0, Lo/der$4;->a:Lo/dgg;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/dgg;->d(Ljava/lang/Object;)V

    .line 98
    :goto_0
    return-void
.end method
