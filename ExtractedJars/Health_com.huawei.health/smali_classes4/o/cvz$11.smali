.class Lo/cvz$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->f(Landroid/content/Context;JJLo/duh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cvz;

.field final synthetic e:Lo/duh;


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;)V
    .locals 0

    .line 1754
    iput-object p1, p0, Lo/cvz$11;->c:Lo/cvz;

    iput-object p2, p0, Lo/cvz$11;->e:Lo/duh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 1757
    if-nez p1, :cond_0

    .line 1758
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cvz$11;->e:Lo/duh;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1759
    return-void

    .line 1761
    :cond_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1762
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cvz$11;->e:Lo/duh;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1763
    return-void

    .line 1766
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1767
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiHealthData;

    .line 1768
    new-instance v7, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    .line 1769
    const-string v0, "core_sleep_shallow_key"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 1770
    const-string v0, "core_sleep_score_key"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 1771
    const-string v0, "core_sleep_fall_key"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/dha;->a(DI)I

    move-result v10

    .line 1772
    const-string v0, "core_sleep_wake_up_key"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/dha;->a(DI)I

    move-result v11

    .line 1774
    if-eqz v8, :cond_2

    if-nez v9, :cond_3

    .line 1775
    goto :goto_0

    .line 1777
    :cond_3
    if-nez v10, :cond_4

    if-nez v11, :cond_4

    .line 1778
    goto :goto_0

    .line 1780
    :cond_4
    invoke-virtual {v7, v8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    .line 1781
    invoke-virtual {v7, v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setScore(I)V

    .line 1782
    invoke-virtual {v7, v10}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setFallTime(I)V

    .line 1783
    invoke-virtual {v7, v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeUpTime(I)V

    .line 1785
    const-string v0, "core_sleep_deep_key"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 1786
    invoke-virtual {v7, v12}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    .line 1787
    const-string v0, "core_sleep_wake_dream_key"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v13

    .line 1788
    invoke-virtual {v7, v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSlumberSleepTime(I)V

    .line 1789
    const-string v0, "core_sleep_snore_freq_key"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v14

    .line 1790
    invoke-virtual {v7, v14}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSnoreFreq(I)V

    .line 1791
    const-string v0, "core_sleep_wake_count_key"

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 1792
    invoke-virtual {v7, v15}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupTimes(I)V

    .line 1794
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1795
    goto/16 :goto_0

    .line 1796
    :cond_5
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAnnualSleepReport success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1797
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cvz$11;->e:Lo/duh;

    move/from16 v1, p2

    invoke-interface {v0, v1, v4}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1799
    return-void
.end method
