.class public Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;
.super Lcom/huawei/updatesdk/sdk/service/storekit/bean/JsonBean;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Json"
.end annotation


# instance fields
.field private params_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Param;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getParams_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Param;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;->params_:Ljava/util/List;

    return-object v0
.end method

.method public setParams_(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Param;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;->params_:Ljava/util/List;

    return-void
.end method
