.class Lo/dde$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dde;->e(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Z

.field final synthetic d:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field final synthetic e:Ljava/util/List;

.field final synthetic k:Lo/dde;


# direct methods
.method constructor <init>(Lo/dde;Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 1649
    iput-object p1, p0, Lo/dde$12;->k:Lo/dde;

    iput-object p2, p0, Lo/dde$12;->b:Ljava/lang/String;

    iput-object p3, p0, Lo/dde$12;->d:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    iput-object p4, p0, Lo/dde$12;->e:Ljava/util/List;

    iput-object p5, p0, Lo/dde$12;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-boolean p6, p0, Lo/dde$12;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 13

    .line 1653
    move-object v6, p2

    check-cast v6, Ljava/util/List;

    .line 1655
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1656
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 1657
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    .line 1658
    invoke-virtual {v9}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_index()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1659
    goto :goto_0

    .line 1660
    :cond_0
    iget-object v0, p0, Lo/dde$12;->k:Lo/dde;

    iget-object v1, p0, Lo/dde$12;->b:Ljava/lang/String;

    iget-object v2, p0, Lo/dde$12;->k:Lo/dde;

    invoke-static {v2}, Lo/dde;->b(Lo/dde;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v2

    invoke-virtual {v0, v1, v7, v2}, Lo/dde;->a(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1662
    :cond_1
    new-instance v7, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v7}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1663
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1664
    const/16 v0, 0xc

    invoke-virtual {v7, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1665
    iget-object v0, p0, Lo/dde$12;->b:Ljava/lang/String;

    invoke-virtual {v7, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1666
    const/16 v0, 0x16

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 1667
    iget-object v0, p0, Lo/dde$12;->d:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/dde$12;->d:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryAllowDisturbContent()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1668
    const/16 v0, 0x1a

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 1671
    :cond_2
    iget-object v0, p0, Lo/dde$12;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    .line 1672
    const-string v0, "03"

    const-string v1, "HWDeviceConfigManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "addDeviceAvoidDisturbingInfo:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1674
    const/16 v0, -0x7f

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1675
    iget-object v0, p0, Lo/dde$12;->d:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/dde$12;->d:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryAllowDisturbContent()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1677
    const/16 v0, 0x18

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_2

    .line 1680
    :cond_3
    const/16 v0, 0x14

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1684
    :goto_2
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1686
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1688
    invoke-virtual {v10}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_index()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1691
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1693
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1696
    invoke-virtual {v10}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_time_switch()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    .line 1697
    invoke-virtual {v10}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_switch()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 1698
    :cond_4
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_3

    .line 1700
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1704
    :goto_3
    const/4 v0, 0x4

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1706
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1708
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1712
    const/4 v0, 0x5

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1714
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1717
    invoke-virtual {v10}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_switch()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    .line 1718
    const/4 v0, 0x0

    invoke-static {v0}, Lo/czx;->b(I)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v11

    goto :goto_4

    .line 1720
    :cond_6
    invoke-virtual {v10}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_start_time()I

    move-result v0

    invoke-static {v0}, Lo/czx;->b(I)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v11

    .line 1722
    :goto_4
    invoke-virtual {v8, v11}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1725
    const/4 v0, 0x6

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1727
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1730
    invoke-virtual {v10}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_switch()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_7

    .line 1731
    const/16 v0, 0x937

    invoke-static {v0}, Lo/czx;->b(I)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v12

    goto :goto_5

    .line 1733
    :cond_7
    invoke-virtual {v10}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_end_time()I

    move-result v0

    invoke-static {v0}, Lo/czx;->b(I)I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v12

    .line 1735
    :goto_5
    invoke-virtual {v8, v12}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1738
    const/4 v0, 0x7

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1740
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1742
    invoke-virtual {v10}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_cycle()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1744
    iget-object v0, p0, Lo/dde$12;->d:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    iget-object v0, p0, Lo/dde$12;->d:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryAllowDisturbContent()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1746
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1748
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1750
    invoke-virtual {v10}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_type()I

    move-result v0

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1753
    :cond_8
    iget-object v0, p0, Lo/dde$12;->k:Lo/dde;

    move-object v1, v7

    move-object v2, v8

    iget-object v4, p0, Lo/dde$12;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-boolean v5, p0, Lo/dde$12;->c:Z

    const/16 v3, 0xc

    invoke-static/range {v0 .. v5}, Lo/dde;->b(Lo/dde;Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/nio/ByteBuffer;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1754
    iget-boolean v0, p0, Lo/dde$12;->c:Z

    if-eqz v0, :cond_a

    .line 1755
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_9

    .line 1756
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDeviceAvoidDisturbingInfo() size is 0, needRespond"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1757
    iget-object v0, p0, Lo/dde$12;->k:Lo/dde;

    iget-object v1, p0, Lo/dde$12;->e:Ljava/util/List;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dde;->d(Lo/dde;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_6

    .line 1760
    :cond_9
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDeviceAvoidDisturbingInfo() size is not 0, needRespond"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1761
    iget-object v0, p0, Lo/dde$12;->k:Lo/dde;

    iget-object v1, p0, Lo/dde$12;->e:Ljava/util/List;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dde;->b(Lo/dde;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_6

    .line 1764
    :cond_a
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_b

    .line 1765
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDeviceAvoidDisturbingInfo() size is 0, not needRespond"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1766
    iget-object v0, p0, Lo/dde$12;->k:Lo/dde;

    iget-object v1, p0, Lo/dde$12;->e:Ljava/util/List;

    iget-object v2, p0, Lo/dde$12;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, v2}, Lo/dde;->d(Lo/dde;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_6

    .line 1769
    :cond_b
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDeviceAvoidDisturbingInfo() size is not 0, not needRespond"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1770
    iget-object v0, p0, Lo/dde$12;->k:Lo/dde;

    iget-object v1, p0, Lo/dde$12;->e:Ljava/util/List;

    iget-object v2, p0, Lo/dde$12;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, v2}, Lo/dde;->b(Lo/dde;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1773
    :goto_6
    goto/16 :goto_1

    .line 1775
    :cond_c
    return-void
.end method
