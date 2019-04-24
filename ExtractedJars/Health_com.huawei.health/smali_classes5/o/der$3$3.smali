.class Lo/der$3$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/der$3;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;

.field final synthetic c:Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;

.field final synthetic d:Lo/der$3;


# direct methods
.method constructor <init>(Lo/der$3;Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lo/der$3$3;->d:Lo/der$3;

    iput-object p2, p0, Lo/der$3$3;->c:Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;

    iput-object p3, p0, Lo/der$3$3;->b:Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 123
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 124
    move-object v4, p2

    check-cast v4, Lcom/huawei/datatype/DataDeviceIntelligentInfo;

    .line 125
    iget-object v0, p0, Lo/der$3$3;->c:Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;

    invoke-virtual {v4}, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->getDevice_manu()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;->setManu(Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lo/der$3$3;->c:Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;

    invoke-virtual {v4}, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->getDevice_prodId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;->setProdId(Ljava/lang/String;)V

    .line 127
    iget-object v0, p0, Lo/der$3$3;->c:Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;

    invoke-virtual {v4}, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->getDevice_hiv()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;->setHiv(Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lo/der$3$3;->b:Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;

    iget-object v1, p0, Lo/der$3$3;->c:Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;->setDevInfo(Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;)V

    .line 129
    const-string v0, "UIDV_FitnessCloud"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " startDeviceLinkage StartDeviceLinkageReq "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/der$3$3;->b:Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object v0, p0, Lo/der$3$3;->d:Lo/der$3;

    iget-object v0, v0, Lo/der$3;->b:Lo/der;

    invoke-static {v0}, Lo/der;->a(Lo/der;)Lo/czg;

    move-result-object v0

    iget-object v1, p0, Lo/der$3$3;->b:Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;

    new-instance v2, Lo/der$3$3$3;

    invoke-direct {v2, p0, v4}, Lo/der$3$3$3;-><init>(Lo/der$3$3;Lcom/huawei/datatype/DataDeviceIntelligentInfo;)V

    invoke-virtual {v0, v1, v2}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;Lo/cyx;)V

    .line 142
    goto :goto_0

    .line 143
    :cond_0
    iget-object v0, p0, Lo/der$3$3;->d:Lo/der$3;

    iget-object v0, v0, Lo/der$3;->a:Lo/dgg;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/dgg;->d(Ljava/lang/Object;)V

    .line 145
    :goto_0
    return-void
.end method
