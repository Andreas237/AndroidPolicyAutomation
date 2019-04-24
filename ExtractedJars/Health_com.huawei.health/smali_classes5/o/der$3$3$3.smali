.class Lo/der$3$3$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/der$3$3;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/datatype/DataDeviceIntelligentInfo;

.field final synthetic d:Lo/der$3$3;


# direct methods
.method constructor <init>(Lo/der$3$3;Lcom/huawei/datatype/DataDeviceIntelligentInfo;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lo/der$3$3$3;->d:Lo/der$3$3;

    iput-object p2, p0, Lo/der$3$3$3;->c:Lcom/huawei/datatype/DataDeviceIntelligentInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;Ljava/lang/String;Z)V
    .locals 2

    .line 134
    if-eqz p1, :cond_0

    .line 135
    iget-object v0, p0, Lo/der$3$3$3;->c:Lcom/huawei/datatype/DataDeviceIntelligentInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/DataDeviceIntelligentInfo;->getDevice_prodId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;->setDevice_prodId(Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lo/der$3$3$3;->d:Lo/der$3$3;

    iget-object v0, v0, Lo/der$3$3;->d:Lo/der$3;

    iget-object v0, v0, Lo/der$3;->a:Lo/dgg;

    invoke-interface {v0, p1}, Lo/dgg;->d(Ljava/lang/Object;)V

    goto :goto_0

    .line 138
    :cond_0
    iget-object v0, p0, Lo/der$3$3$3;->d:Lo/der$3$3;

    iget-object v0, v0, Lo/der$3$3;->d:Lo/der$3;

    iget-object v0, v0, Lo/der$3;->a:Lo/dgg;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/dgg;->d(Ljava/lang/Object;)V

    .line 140
    :goto_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 131
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;

    invoke-virtual {p0, v0, p2, p3}, Lo/der$3$3$3;->c(Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageRsq;Ljava/lang/String;Z)V

    return-void
.end method
