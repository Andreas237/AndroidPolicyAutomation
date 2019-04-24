.class Lo/der$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/der;->a(Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;Ljava/lang/String;Lo/dgg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dgg;

.field final synthetic b:Lo/der;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;


# direct methods
.method constructor <init>(Lo/der;Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;Ljava/lang/String;Lo/dgg;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lo/der$3;->b:Lo/der;

    iput-object p2, p0, Lo/der$3;->e:Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;

    iput-object p3, p0, Lo/der$3;->d:Ljava/lang/String;

    iput-object p4, p0, Lo/der$3;->a:Lo/dgg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 108
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 109
    move-object v2, p2

    check-cast v2, Lcom/huawei/datatype/DataDeviceInfo;

    .line 110
    new-instance v3, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;

    invoke-direct {v3}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;-><init>()V

    .line 111
    iget-object v0, p0, Lo/der$3;->e:Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/userprofile/BindDeviceRsp;->getDeviceCode()Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;->setDeviceCode(Ljava/lang/String;)V

    .line 112
    new-instance v4, Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;-><init>()V

    .line 113
    iget-object v0, p0, Lo/der$3;->d:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;->setSn(Ljava/lang/String;)V

    .line 114
    invoke-virtual {v2}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_type()I

    move-result v0

    invoke-static {v0}, Lo/dda;->f(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    const-string v0, "06E"

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;->setDevType(Ljava/lang/String;)V

    goto :goto_0

    .line 117
    :cond_0
    const-string v0, "06D"

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;->setDevType(Ljava/lang/String;)V

    .line 119
    :goto_0
    invoke-virtual {v2}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_model()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;->setModel(Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lo/der$3;->b:Lo/der;

    invoke-static {v0}, Lo/der;->b(Lo/der;)Lo/dde;

    move-result-object v0

    new-instance v1, Lo/der$3$3;

    invoke-direct {v1, p0, v4, v3}, Lo/der$3$3;-><init>(Lo/der$3;Lcom/huawei/hwcloudmodel/model/intelligent/DevInfo;Lcom/huawei/hwcloudmodel/model/intelligent/StartDeviceLinkageReq;)V

    invoke-virtual {v0, v1}, Lo/dde;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 147
    goto :goto_1

    .line 148
    :cond_1
    iget-object v0, p0, Lo/der$3;->a:Lo/dgg;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/dgg;->d(Ljava/lang/Object;)V

    .line 150
    :goto_1
    return-void
.end method
