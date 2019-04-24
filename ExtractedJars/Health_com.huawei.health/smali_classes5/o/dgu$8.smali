.class Lo/dgu$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgu;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dgu;


# direct methods
.method constructor <init>(Lo/dgu;)V
    .locals 0

    .line 1107
    iput-object p1, p0, Lo/dgu$8;->d:Lo/dgu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 21

    .line 1110
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateHeartRateThroshold enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1111
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgu$8;->d:Lo/dgu;

    invoke-virtual {v0}, Lo/dgu;->w()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 1112
    new-instance v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v0

    invoke-direct {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;-><init>(I)V

    .line 1114
    const/4 v6, 0x0

    .line 1115
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartRate_Classify_Method"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v7

    .line 1116
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 1118
    :try_start_0
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 1121
    goto :goto_0

    .line 1119
    :catch_0
    move-exception v8

    .line 1120
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse RestHeartRate value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1123
    :cond_0
    :goto_0
    invoke-virtual {v5, v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setClassifyMethod(I)V

    .line 1125
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgu$8;->d:Lo/dgu;

    invoke-static {v0}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getRestHeartRateDefault()I

    move-result v8

    .line 1126
    const/4 v0, 0x0

    if-ne v0, v8, :cond_1

    .line 1127
    const/16 v8, 0x3c

    .line 1129
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_Rest_HeartRate"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v9

    .line 1130
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    .line 1132
    :try_start_1
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    move v8, v0

    .line 1135
    goto :goto_1

    .line 1133
    :catch_1
    move-exception v10

    .line 1134
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse RestHeartRate value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1137
    :cond_2
    :goto_1
    invoke-virtual {v5, v8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setRestHeartRate(I)V

    .line 1139
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartZone_Config"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v10

    .line 1142
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartRate_Limit_Flag"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v11

    .line 1145
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartRate_Flag"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v12

    .line 1148
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarningLimitHR()I

    move-result v13

    .line 1149
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getMaxThreshold()I

    move-result v14

    .line 1151
    const/4 v0, 0x0

    if-eq v0, v10, :cond_4

    .line 1152
    invoke-virtual {v10}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v15

    .line 1153
    array-length v0, v15

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 1154
    const/4 v0, 0x0

    aget-object v0, v15, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRZoneConf(Ljava/lang/String;)V

    .line 1155
    const/4 v0, 0x1

    aget-object v0, v15, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setThreshold(Ljava/lang/String;)V

    .line 1158
    if-eqz v11, :cond_3

    .line 1159
    const/16 v16, 0x0

    .line 1161
    :try_start_2
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    move-result v0

    move/from16 v16, v0

    .line 1164
    goto :goto_2

    .line 1162
    :catch_2
    move-exception v17

    .line 1163
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse userPreferenceValue_Limit value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1166
    :goto_2
    if-nez v16, :cond_3

    .line 1168
    invoke-virtual {v5, v13}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setWarningLimitHR(I)V

    .line 1173
    :cond_3
    if-eqz v12, :cond_4

    .line 1174
    const/16 v16, 0x0

    .line 1176
    :try_start_3
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    move-result v0

    move/from16 v16, v0

    .line 1179
    goto :goto_3

    .line 1177
    :catch_3
    move-exception v17

    .line 1178
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse userPreferenceValue_Max value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1181
    :goto_3
    if-nez v16, :cond_4

    .line 1183
    invoke-virtual {v5, v14}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setMaxThreshold(I)V

    .line 1193
    :cond_4
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HRRHeartZone_Config"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v15

    .line 1196
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarningLimitHRHRR()I

    move-result v16

    .line 1197
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getHRRMaxThreshold()I

    move-result v17

    .line 1199
    const/4 v0, 0x0

    if-eq v0, v15, :cond_6

    .line 1200
    invoke-virtual {v15}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v18

    .line 1201
    move-object/from16 v0, v18

    array-length v0, v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_6

    .line 1202
    const/4 v0, 0x0

    aget-object v0, v18, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRRHRZoneConf(Ljava/lang/String;)V

    .line 1203
    const/4 v0, 0x1

    aget-object v0, v18, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRRThreshold(Ljava/lang/String;)V

    .line 1206
    if-eqz v11, :cond_5

    .line 1207
    const/16 v19, 0x0

    .line 1209
    :try_start_4
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    move-result v0

    move/from16 v19, v0

    .line 1212
    goto :goto_4

    .line 1210
    :catch_4
    move-exception v20

    .line 1211
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse userPreferenceValue_Limit value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1214
    :goto_4
    if-nez v19, :cond_5

    .line 1216
    move/from16 v0, v16

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setWarningLimitHRHRR(I)V

    .line 1221
    :cond_5
    if-eqz v12, :cond_6

    .line 1222
    const/16 v19, 0x0

    .line 1224
    :try_start_5
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5

    move-result v0

    move/from16 v19, v0

    .line 1227
    goto :goto_5

    .line 1225
    :catch_5
    move-exception v20

    .line 1226
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse userPreferenceValue_Max value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1229
    :goto_5
    if-nez v19, :cond_6

    .line 1231
    move/from16 v0, v17

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRRMaxThreshold(I)V

    .line 1236
    :cond_6
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartZoneConf "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1237
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgu$8;->d:Lo/dgu;

    invoke-static {v0}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setClassifyMethod(I)V

    .line 1238
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgu$8;->d:Lo/dgu;

    invoke-static {v0}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setRestHeartRate(I)V

    .line 1239
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgu$8;->d:Lo/dgu;

    invoke-static {v0}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHeartZoneConf(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V

    .line 1240
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgu$8;->d:Lo/dgu;

    invoke-static {v0}, Lo/dgu;->e(Lo/dgu;)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRRHeartZoneConf(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;)V

    .line 1241
    return-void
.end method
