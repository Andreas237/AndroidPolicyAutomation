.class public Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeResponse;
.super Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;


# instance fields
.field public list_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;>;"
        }
    .end annotation
.end field

.field public notRcmList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;-><init>()V

    return-void
.end method
