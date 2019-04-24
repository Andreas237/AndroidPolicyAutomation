.class Lcom/huawei/updatesdk/service/otaupdate/d$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/updatesdk/service/otaupdate/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/updatesdk/service/otaupdate/d$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/updatesdk/service/otaupdate/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V
    .locals 0

    return-void
.end method

.method public b(Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V
    .locals 4

    instance-of v0, p2, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeResponse;

    if-eqz v0, :cond_7

    move-object v2, p2

    check-cast v2, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeResponse;

    invoke-virtual {p2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getRtnCode_()I

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {}, Lcom/huawei/updatesdk/service/otaupdate/d;->b()Lcom/huawei/updatesdk/service/otaupdate/a;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {}, Lcom/huawei/updatesdk/service/otaupdate/d;->b()Lcom/huawei/updatesdk/service/otaupdate/a;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/updatesdk/service/otaupdate/a;->b(I)V

    goto :goto_0

    :cond_1
    iget-object v0, v2, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeResponse;->list_:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, v2, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeResponse;->list_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_5

    :cond_2
    iget-object v0, v2, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeResponse;->notRcmList_:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, v2, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeResponse;->notRcmList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_5

    :cond_3
    invoke-static {}, Lcom/huawei/updatesdk/service/otaupdate/d;->b()Lcom/huawei/updatesdk/service/otaupdate/a;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/huawei/updatesdk/service/otaupdate/d;->b()Lcom/huawei/updatesdk/service/otaupdate/a;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/updatesdk/service/otaupdate/a;->a(I)V

    :cond_4
    return-void

    :cond_5
    iget-object v0, v2, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeResponse;->list_:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/updatesdk/service/otaupdate/d;->a(Ljava/util/List;)Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;

    move-result-object v3

    invoke-static {}, Lcom/huawei/updatesdk/service/otaupdate/d;->b()Lcom/huawei/updatesdk/service/otaupdate/a;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {}, Lcom/huawei/updatesdk/service/otaupdate/d;->b()Lcom/huawei/updatesdk/service/otaupdate/a;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/huawei/updatesdk/service/otaupdate/a;->a(Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;)V

    :cond_6
    :goto_0
    goto :goto_1

    :cond_7
    invoke-static {}, Lcom/huawei/updatesdk/service/otaupdate/d;->b()Lcom/huawei/updatesdk/service/otaupdate/a;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {}, Lcom/huawei/updatesdk/service/otaupdate/d;->b()Lcom/huawei/updatesdk/service/otaupdate/a;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/updatesdk/service/otaupdate/a;->a(I)V

    :cond_8
    :goto_1
    return-void
.end method
