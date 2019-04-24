.class Lo/dea$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cxx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dea;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dea;


# direct methods
.method constructor <init>(Lo/dea;)V
    .locals 0

    .line 1722
    iput-object p1, p0, Lo/dea$1;->e:Lo/dea;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V
    .locals 9

    .line 1725
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter onDeviceConnectionStateChanged() with state = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1747
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->b(Lo/dea;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_10

    const/4 v0, 0x0

    if-eq v0, p1, :cond_10

    .line 1748
    const/4 v0, 0x2

    if-eq v0, p2, :cond_0

    .line 1751
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddz;->c(Ljava/lang/String;Z)V

    .line 1760
    :cond_0
    const/4 v0, 0x2

    if-eq v0, p2, :cond_2

    .line 1766
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lo/ddz;->d(Ljava/lang/String;I)V

    .line 1767
    invoke-virtual {p1, p2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1769
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v5

    .line 1770
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->e(Lo/dea;)Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 1771
    :try_start_0
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, v5}, Lo/dea;->e(Lo/dea;Ljava/lang/String;)I

    move-result v7

    .line 1772
    const/4 v0, -0x1

    if-eq v0, v7, :cond_1

    .line 1773
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->b(Lo/dea;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0, p2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1774
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Update DeviceInfo state with index = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1776
    :cond_1
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v8

    monitor-exit v6

    throw v8

    .line 1779
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddz;->d(Ljava/lang/String;Z)V

    .line 1781
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, p1}, Lo/dea;->c(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1782
    goto/16 :goto_5

    .line 1784
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->d(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_5

    .line 1785
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Already finish handshake and repeat report connected."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1787
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_4

    .line 1790
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "The device user choose already active and connect so report."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1791
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dea;->e(Lo/dea;Ljava/lang/String;)I

    move-result v5

    .line 1792
    const/4 v0, -0x1

    if-eq v0, v5, :cond_3

    .line 1793
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->b(Lo/dea;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 1794
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->b(Lo/dea;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 1795
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->b(Lo/dea;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 1796
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->b(Lo/dea;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceProtocol(I)V

    .line 1797
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, p1}, Lo/dea;->c(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1799
    :cond_3
    goto :goto_1

    .line 1800
    :cond_4
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Already has the active device so report connected state."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1801
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, p1}, Lo/dea;->c(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1804
    :goto_1
    return-void

    .line 1808
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1809
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Already Start handshake."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1810
    return-void

    .line 1814
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ddz;->d(Ljava/lang/String;Z)V

    .line 1816
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_8

    .line 1818
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to get product type."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1819
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/ddz;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1820
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/ddz;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 1821
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v0

    invoke-static {v0}, Lo/cxo;->a(I)Lo/cye;

    move-result-object v5

    .line 1822
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 1823
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->a(Lo/dea;)Lo/cys;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 1824
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->a(Lo/dea;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/cys;->a(Lo/cye;)V

    .line 1826
    :cond_7
    goto/16 :goto_5

    .line 1829
    :cond_8
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    iget-object v0, v0, Lo/dea;->e:Lo/cxk;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxk;->c(Ljava/lang/String;)I

    move-result v5

    .line 1830
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lo/ddz;->b(Ljava/lang/String;I)V

    .line 1832
    const/4 v0, -0x1

    if-ne v0, v5, :cond_a

    .line 1833
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "The product type is unknown base name."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1835
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v6

    .line 1836
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device product type = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1837
    const/4 v0, -0x1

    if-eq v0, v6, :cond_9

    .line 1838
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v5

    .line 1839
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lo/ddz;->b(Ljava/lang/String;I)V

    goto :goto_2

    .line 1841
    :cond_9
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "The product type is unknown base old device info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1842
    return-void

    .line 1844
    :goto_2
    goto :goto_3

    .line 1846
    :cond_a
    invoke-virtual {p1, v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 1849
    :goto_3
    const/4 v0, 0x3

    if-eq v0, v5, :cond_d

    const/4 v0, -0x2

    if-eq v0, v5, :cond_d

    .line 1852
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_b

    .line 1854
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->d(Lo/dea;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxo;->d(Landroid/content/Context;)Lo/cye;

    move-result-object v6

    goto :goto_4

    .line 1856
    :cond_b
    invoke-static {}, Lo/cxo;->c()Lo/cye;

    move-result-object v6

    .line 1859
    :goto_4
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 1860
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->a(Lo/dea;)Lo/cys;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 1861
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to set device time."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1862
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->a(Lo/dea;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/cys;->a(Lo/cye;)V

    .line 1864
    :cond_c
    goto :goto_5

    .line 1866
    :cond_d
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->f(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->resetDeviceCapability()V

    .line 1869
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "report connect state, watch layer = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1870
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_e

    .line 1871
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_e

    .line 1874
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->f(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v6

    .line 1875
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->d(Lo/dea;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1, v6}, Lo/cxv;->c(Landroid/content/Context;ILcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1881
    :cond_e
    const/4 v0, -0x2

    if-ne v0, v5, :cond_f

    .line 1883
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->f(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v6

    .line 1884
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->resetDeviceCapability()V

    .line 1885
    invoke-static {v6}, Lo/cxv;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1890
    :cond_f
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, p1}, Lo/dea;->d(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1895
    :cond_10
    :goto_5
    return-void
.end method

.method public e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V
    .locals 6

    .line 1899
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->g(Ljava/lang/String;)Z

    move-result v5

    .line 1900
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter onDataReceived() with handShakeStatus = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1901
    if-eqz v5, :cond_9

    .line 1902
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter onDataReceived() Handshake with dataContent = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1904
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/4 v1, 0x7

    if-ne v1, v0, :cond_0

    .line 1906
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, p1, p3}, Lo/dea;->a(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    goto/16 :goto_2

    .line 1907
    :cond_0
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_1

    .line 1909
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, p1, p3}, Lo/dea;->c(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    goto/16 :goto_2

    .line 1910
    :cond_1
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 1912
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, p1, p3}, Lo/dea;->b(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    goto/16 :goto_2

    .line 1913
    :cond_2
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_3

    .line 1915
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, p1, p3}, Lo/dea;->e(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    goto/16 :goto_2

    .line 1916
    :cond_3
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/16 v1, 0x12

    if-ne v1, v0, :cond_4

    .line 1918
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, p1, p3}, Lo/dea;->d(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    goto/16 :goto_2

    .line 1919
    :cond_4
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_5

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_5

    .line 1921
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, p1, p3}, Lo/dea;->g(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    goto/16 :goto_2

    .line 1922
    :cond_5
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/16 v1, 0x14

    if-ne v1, v0, :cond_6

    .line 1924
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, p1, p3}, Lo/dea;->k(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    goto/16 :goto_2

    .line 1925
    :cond_6
    const/4 v0, 0x0

    aget-byte v0, p3, v0

    const/16 v1, 0x26

    if-ne v1, v0, :cond_7

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_7

    .line 1927
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0, p1, p3}, Lo/dea;->i(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    goto/16 :goto_2

    .line 1930
    :cond_7
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handshake report data."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1931
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->k(Lo/dea;)Lo/ddg;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 1932
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->k(Lo/dea;)Lo/ddg;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/ddg;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    goto :goto_0

    .line 1934
    :cond_8
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mDeviceStateClientCallback is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1937
    :goto_0
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->g(Lo/dea;)Lo/ddx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 1938
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->g(Lo/dea;)Lo/ddx;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/ddx;->c([B)V

    goto :goto_2

    .line 1943
    :cond_9
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "not handshake report data."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1944
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->k(Lo/dea;)Lo/ddg;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    .line 1945
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->k(Lo/dea;)Lo/ddg;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/ddg;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    goto :goto_1

    .line 1947
    :cond_a
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mDeviceStateClientCallback is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1950
    :goto_1
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->g(Lo/dea;)Lo/ddx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 1951
    iget-object v0, p0, Lo/dea$1;->e:Lo/dea;

    invoke-static {v0}, Lo/dea;->g(Lo/dea;)Lo/ddx;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/ddx;->c([B)V

    .line 1954
    :cond_b
    :goto_2
    return-void
.end method
