.class Lo/akt$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/akt;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/akt;

.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/akt;Ljava/util/List;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 851
    iput-object p1, p0, Lo/akt$14;->a:Lo/akt;

    iput-object p2, p0, Lo/akt$14;->d:Ljava/util/List;

    iput-object p3, p0, Lo/akt$14;->e:Ljava/util/List;

    iput-object p4, p0, Lo/akt$14;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 854
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHuaweiWearDeviceListForV2 getDeviceListFromWear onResponse err_code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 855
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 856
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 857
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    new-instance v1, Lo/akt$14$4;

    invoke-direct {v1, p0}, Lo/akt$14$4;-><init>(Lo/akt$14;)V

    .line 858
    invoke-virtual {v1}, Lo/akt$14$4;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 857
    invoke-virtual {v4, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 859
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    .line 860
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 861
    iget-object v0, p0, Lo/akt$14;->a:Lo/akt;

    invoke-virtual {v7}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getProductType()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/akt;->c(I)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setProductType(I)V

    .line 862
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHuaweiWearDeviceListForV2 dev type is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getProductType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 863
    iget-object v0, p0, Lo/akt$14;->d:Ljava/util/List;

    invoke-virtual {v7}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->getProductType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 864
    invoke-virtual {v7}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->conver2CommonDevice()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v8

    .line 865
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 866
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 867
    iget-object v0, p0, Lo/akt$14;->e:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 870
    :cond_0
    goto/16 :goto_0

    .line 872
    :cond_1
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHuaweiWearDeviceListForV2 new version, devList size is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/akt$14;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 873
    iget-object v0, p0, Lo/akt$14;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-object v1, p0, Lo/akt$14;->e:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 874
    return-void
.end method
