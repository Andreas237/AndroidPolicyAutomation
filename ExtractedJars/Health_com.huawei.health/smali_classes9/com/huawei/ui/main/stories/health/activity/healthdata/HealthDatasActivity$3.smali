.class Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;J)V
    .locals 0

    .line 1033
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    iput-wide p2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 1036
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary aggregateHiHealthData onResult 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1038
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1039
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 1040
    const/4 v0, 0x3

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1041
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 1042
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1043
    return-void

    .line 1046
    :cond_1
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary datas="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1048
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiHealthData;

    .line 1050
    const-wide/16 v5, 0x0

    .line 1051
    const-string v0, "core_sleep_shallow_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 1052
    const-string v0, "core_sleep_deep_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 1053
    const-string v0, "core_sleep_wake_dream_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v9

    .line 1054
    const-string v0, "sleep_core_sleep_noon_duration_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v10

    .line 1055
    const-string v0, "UIHLH_HealthDatasActivity"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "firstShallowSum == "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", firstDeepSum == "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ", firstDreamSum == "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ", firstNoonDurationSum == "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 1056
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, ", data.getStartTime() = "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 1055
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1058
    if-gtz v7, :cond_2

    if-gtz v8, :cond_2

    if-gtz v9, :cond_2

    if-lez v10, :cond_3

    .line 1059
    :cond_2
    add-int v0, v7, v8

    add-int/2addr v0, v9

    add-int/2addr v0, v10

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    div-double v5, v0, v2

    .line 1060
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Z)Z

    goto :goto_0

    .line 1062
    :cond_3
    const-string v0, "sleep_deep_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 1063
    const-string v0, "sleep_shallow_key"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 1064
    add-int v0, v11, v12

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide v2, 0x40ac200000000000L    # 3600.0

    div-double v5, v0, v2

    .line 1065
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Z)Z

    .line 1068
    :goto_0
    new-instance v11, Ljava/util/Date;

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-direct {v11, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1069
    new-instance v12, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "M/d"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v12, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1070
    invoke-virtual {v12, v11}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v13

    .line 1071
    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v12, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v14

    .line 1072
    const-wide v0, 0x3ee4f8b580000000L    # 9.999999747378752E-6

    add-double v15, v5, v0

    .line 1073
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1074
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v17

    .line 1075
    const/4 v0, 0x3

    move-object/from16 v1, v17

    iput v0, v1, Landroid/os/Message;->what:I

    .line 1076
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1078
    return-void

    .line 1081
    :cond_4
    const-wide/16 v0, 0x0

    cmpl-double v0, v15, v0

    if-nez v0, :cond_5

    .line 1082
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v17

    .line 1083
    const/4 v0, 0x3

    move-object/from16 v1, v17

    iput v0, v1, Landroid/os/Message;->what:I

    .line 1084
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1086
    return-void

    .line 1089
    :cond_5
    const/16 v17, 0x7

    .line 1090
    const/16 v18, 0x5a0

    .line 1092
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->O(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1093
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->T(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1094
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->W(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1095
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->V(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1098
    const/16 v19, 0x0

    :goto_1
    move/from16 v0, v19

    move/from16 v1, v17

    if-ge v0, v1, :cond_a

    .line 1101
    const/16 v20, 0x0

    .line 1102
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v19

    if-le v0, v1, :cond_6

    .line 1103
    move-object/from16 v0, p1

    move/from16 v1, v19

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/huawei/hihealth/HiHealthData;

    .line 1106
    :cond_6
    const/4 v0, 0x0

    move-object/from16 v1, v20

    if-ne v0, v1, :cond_7

    .line 1107
    goto/16 :goto_3

    .line 1109
    :cond_7
    invoke-virtual/range {v20 .. v20}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v21

    .line 1112
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->a:J

    sub-long v0, v0, v21

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    const-wide/16 v2, 0x5a0

    div-long/2addr v0, v2

    long-to-int v2, v0

    move/from16 v23, v2

    .line 1113
    const-string v0, "UIHLH_HealthDatasActivity"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary  i = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " time = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " currentCount = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "               data = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object v20, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1117
    const-string v0, "core_sleep_shallow_key"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v24

    .line 1118
    const-string v0, "core_sleep_deep_key"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v25

    .line 1119
    const-string v0, "core_sleep_wake_dream_key"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v26

    .line 1120
    const-string v0, "sleep_core_sleep_noon_duration_key"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v27

    .line 1121
    if-gtz v24, :cond_8

    if-gtz v25, :cond_8

    if-gtz v26, :cond_8

    if-lez v27, :cond_9

    .line 1124
    :cond_8
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary  shallowSum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1128
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary  deepSum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1132
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary  dreamSum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1137
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->O(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, v25

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1138
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->T(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, v24

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1139
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->W(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, v26

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1140
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->V(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, v27

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 1144
    :cond_9
    const-string v0, "sleep_deep_key"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v28

    .line 1146
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary  normaldeepSum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1148
    const-string v0, "sleep_shallow_key"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v29

    .line 1150
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCoreSleepSummary  normalshallowSum = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1154
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->O(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, v28

    int-to-float v1, v1

    const/high16 v2, 0x42700000    # 60.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1155
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->T(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    move/from16 v1, v29

    int-to-float v1, v1

    const/high16 v2, 0x42700000    # 60.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1156
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->W(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1157
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->V(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1098
    :goto_2
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_1

    .line 1161
    :cond_a
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v19

    .line 1162
    const/4 v0, 0x3

    move-object/from16 v1, v19

    iput v0, v1, Landroid/os/Message;->what:I

    .line 1163
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->O(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->T(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->W(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->V(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, v19

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1164
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$3;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1168
    return-void
.end method
