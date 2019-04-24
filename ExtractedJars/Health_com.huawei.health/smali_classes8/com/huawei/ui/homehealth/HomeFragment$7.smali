.class Lcom/huawei/ui/homehealth/HomeFragment$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/HomeFragment;->c(Landroid/content/Context;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Landroid/content/Context;

.field final synthetic e:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;Landroid/content/Context;)V
    .locals 0

    .line 1734
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$7;->e:Lcom/huawei/ui/homehealth/HomeFragment;

    iput-object p2, p0, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 1737
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 1738
    :cond_0
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "datas is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1739
    return-void

    .line 1741
    :cond_1
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    .line 1742
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "weight_bodyfat"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 1744
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_wifi_notify_TIMESTAMP"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1746
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v9

    .line 1747
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v10

    .line 1748
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "null"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "0"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1749
    :cond_2
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v10

    .line 1751
    :cond_3
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start data notification notifyTimeStamp:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1752
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 1754
    :cond_4
    const-string v0, "-1"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->c(Z)Z

    .line 1755
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start data notification isConflict:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lcom/huawei/ui/homehealth/HomeFragment;->c()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1756
    const-string v11, ""

    .line 1758
    invoke-static {}, Lcom/huawei/ui/homehealth/HomeFragment;->c()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1759
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v12

    .line 1760
    const/4 v13, 0x0

    :goto_1
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_7

    .line 1761
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1762
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/acu;

    .line 1763
    invoke-virtual {v14}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v11

    .line 1760
    :cond_6
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 1768
    :cond_7
    new-instance v12, Lo/dcy;

    invoke-direct {v12}, Lo/dcy;-><init>()V

    .line 1769
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_wifi_notify_TIMESTAMP"

    invoke-static {v0, v1, v2, v9, v12}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1773
    new-instance v13, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v13}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    .line 1774
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setFlag(I)V

    .line 1775
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    invoke-virtual {v13, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setExpireTime(J)V

    .line 1776
    const/4 v0, 0x2

    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPosition(I)V

    .line 1778
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setNotified(I)V

    .line 1779
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v13, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setCreateTime(J)V

    .line 1780
    const-string v0, "9111"

    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgId(Ljava/lang/String;)V

    .line 1782
    invoke-static {}, Lcom/huawei/ui/homehealth/HomeFragment;->c()Z

    move-result v0

    if-nez v0, :cond_a

    .line 1784
    const-string v0, "WIFI_NOTIFICATION_MODULE_USER"

    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setModule(Ljava/lang/String;)V

    .line 1785
    invoke-virtual {v13, v11}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgContent(Ljava/lang/String;)V

    .line 1787
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messagecenter://userinfo_weight?key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    .line 1789
    new-instance v14, Ljava/text/DecimalFormat;

    const-string v0, "0.0"

    invoke-direct {v14, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 1790
    invoke-virtual {v14, v6, v7}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v15

    .line 1791
    const-string v0, "0.0"

    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1792
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_measure_weight_defualt_value:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v15

    goto :goto_2

    .line 1794
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 1796
    :goto_2
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1797
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-virtual {v14, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v16

    .line 1798
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_sns_weight_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_lbs:I

    .line 1799
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_bodyfat_rate:I

    .line 1800
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1798
    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 1802
    goto :goto_3

    .line 1803
    :cond_9
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    invoke-virtual {v14, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v16

    .line 1804
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_sns_weight_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_weight_array_unit:I

    .line 1805
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_healthdata_bodyfat_rate:I

    .line 1806
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1804
    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 1810
    :goto_3
    goto :goto_4

    .line 1812
    :cond_a
    const-string v0, "WIFI_NOTIFICATION_MODULE"

    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setModule(Ljava/lang/String;)V

    .line 1813
    const-string v0, ""

    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgContent(Ljava/lang/String;)V

    .line 1815
    const-string v0, "messagecenter://claim_weight"

    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    .line 1816
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_wifi_notification_weight_isConflict:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 1818
    :goto_4
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setWeight(I)V

    .line 1821
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start data notification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1822
    new-instance v14, Lo/fhd;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    invoke-direct {v14, v0, v13}, Lo/fhd;-><init>(Landroid/content/Context;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 1824
    const-string v0, "9111"

    const-string v1, "9111"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v15

    .line 1825
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    invoke-static {v0, v15}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v14, v0}, Lo/fhd;->e(I)V

    .line 1826
    invoke-virtual {v14}, Lo/fhd;->d()V

    .line 1829
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/homehealth/HomeFragment$7;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0, v13}, Lo/eaa;->a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    .line 1832
    :cond_b
    return-void
.end method
