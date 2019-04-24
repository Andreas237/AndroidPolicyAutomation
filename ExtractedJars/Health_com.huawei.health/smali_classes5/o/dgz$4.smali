.class Lo/dgz$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgz;->a(JJIIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic b:I

.field final synthetic c:Lo/dgz;

.field final synthetic d:J

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/dgz;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IIJ)V
    .locals 0

    .line 992
    iput-object p1, p0, Lo/dgz$4;->c:Lo/dgz;

    iput-object p2, p0, Lo/dgz$4;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput p3, p0, Lo/dgz$4;->b:I

    iput p4, p0, Lo/dgz$4;->e:I

    iput-wide p5, p0, Lo/dgz$4;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 996
    if-nez p1, :cond_0

    .line 997
    invoke-static {}, Lo/dgz;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMonthCoreSleepSummary  datas = null  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 998
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$4;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 999
    return-void

    .line 1001
    :cond_0
    move-object/from16 v4, p1

    .line 1002
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1003
    invoke-static {}, Lo/dgz;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMonthCoreSleepSummary sumDataList is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1004
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$4;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1005
    return-void

    .line 1007
    :cond_1
    invoke-static {}, Lo/dgz;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCoreSleepSummary  callback.onResponse sucess sumDataList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1009
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1010
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 1011
    move-object/from16 v0, p0

    iget v6, v0, Lo/dgz$4;->b:I

    .line 1012
    move-object/from16 v0, p0

    iget v7, v0, Lo/dgz$4;->e:I

    .line 1013
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v6, :cond_6

    .line 1014
    new-instance v9, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct {v9}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    .line 1015
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 1016
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v12

    .line 1018
    const-wide/16 v0, 0x3e8

    div-long v0, v12, v0

    move-object/from16 v2, p0

    iget-wide v2, v2, Lo/dgz$4;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    int-to-long v2, v7

    div-long/2addr v0, v2

    long-to-int v14, v0

    .line 1019
    if-ne v14, v8, :cond_4

    .line 1020
    const-string v0, "core_sleep_shallow_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v15

    .line 1021
    const-string v0, "core_sleep_deep_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v16

    .line 1022
    const-string v0, "core_sleep_wake_dream_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v17

    .line 1023
    const-string v0, "core_sleep_day_sleep_time_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v18

    .line 1024
    const-string v0, "core_sleep_wake_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v19

    .line 1025
    if-gtz v15, :cond_2

    if-gtz v16, :cond_2

    if-gtz v17, :cond_2

    if-lez v18, :cond_3

    .line 1026
    :cond_2
    invoke-virtual {v9, v15}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    .line 1027
    move/from16 v0, v16

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    .line 1028
    move/from16 v0, v17

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSlumberSleepTime(I)V

    .line 1029
    move/from16 v0, v19

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupDuration(I)V

    .line 1030
    move/from16 v0, v18

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setNoonSleepTime(I)V

    .line 1031
    const-string v0, "core_sleep_wake_count_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v20

    .line 1032
    move/from16 v0, v20

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupTimes(I)V

    .line 1033
    const-string v0, "core_sleep_score_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v21

    .line 1034
    move/from16 v0, v21

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setScore(I)V

    .line 1035
    const-string v0, "core_sleep_snore_freq_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v22

    .line 1036
    move/from16 v0, v22

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSnoreFreq(I)V

    .line 1037
    const-string v0, "core_sleep_deep_sleep_part_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v23

    .line 1038
    move/from16 v0, v23

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepPart(I)V

    .line 1039
    const-string v0, "core_sleep_total_sleep_time_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v24

    .line 1040
    move/from16 v0, v24

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setTotalSleepTime(I)V

    .line 1041
    const-string v0, "core_sleep_fall_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v25

    .line 1042
    move-wide/from16 v0, v25

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/dha;->a(DI)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setFallTime(I)V

    .line 1043
    const-string v0, "core_sleep_wake_up_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v27

    .line 1044
    move-wide/from16 v0, v27

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/dha;->a(DI)I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeUpTime(I)V

    .line 1045
    const/16 v0, 0x1f

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 1046
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSleepDayTime(J)V

    .line 1047
    const-string v0, "core_sleep_wake_up_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v29

    .line 1048
    move-wide/from16 v0, v29

    double-to-long v0, v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setCoreSleepWakeupTime(J)V

    .line 1049
    const-string v0, "core_sleep_fall_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v31

    .line 1050
    move-wide/from16 v0, v31

    double-to-long v0, v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setCoreSleepFallTime(J)V

    .line 1052
    goto :goto_2

    .line 1053
    :cond_3
    const-string v0, "sleep_deep_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v20

    .line 1054
    div-int/lit8 v0, v20, 0x3c

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    .line 1056
    const-string v0, "sleep_shallow_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v21

    .line 1057
    div-int/lit8 v0, v21, 0x3c

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    .line 1059
    const-string v0, "sleep_wake_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v22

    .line 1060
    div-int/lit8 v0, v22, 0x3c

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupDuration(I)V

    .line 1062
    const-string v0, "sleep_wake_count_key"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v23

    .line 1063
    move/from16 v0, v23

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupTimes(I)V

    .line 1065
    const/16 v0, 0x1e

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 1068
    :cond_4
    :goto_2
    goto/16 :goto_1

    .line 1070
    :cond_5
    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1013
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 1074
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$4;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 1075
    invoke-static {}, Lo/dgz;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCoreSleepSummary  callback.onResponse sucess sleepTotalDatas.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1076
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$4;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1079
    :cond_7
    return-void
.end method
