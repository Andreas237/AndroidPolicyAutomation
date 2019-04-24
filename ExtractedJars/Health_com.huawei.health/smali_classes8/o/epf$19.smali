.class Lo/epf$19;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/epf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/epf;


# direct methods
.method constructor <init>(Lo/epf;)V
    .locals 0

    .line 1171
    iput-object p1, p0, Lo/epf$19;->b:Lo/epf;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 17

    .line 1174
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_0

    .line 1175
    return-void

    .line 1178
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    invoke-static {v0}, Lo/epf;->a(Lo/epf;)Landroid/os/Handler;

    move-result-object v6

    .line 1179
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 1180
    return-void

    .line 1183
    :cond_1
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->h()Ljava/lang/String;

    move-result-object v7

    .line 1184
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v8

    .line 1185
    const-string v0, "content"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1186
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAutoCheckNewVersionReceiver onReceive: content = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1187
    const-string v0, "action_band_auto_check_new_version_result"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1188
    const-string v0, "result"

    move-object/from16 v1, p2

    const/16 v2, 0x8

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v10

    .line 1189
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1190
    packed-switch v10, :pswitch_data_0

    goto/16 :goto_1

    .line 1192
    :pswitch_0
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AUTO_CHECK_AW70_BAND_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1193
    invoke-static {}, Lo/epf;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1194
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHandleCheckSuccessAW70 , do nothing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1195
    return-void

    .line 1198
    :cond_2
    const/4 v0, 0x1

    invoke-static {v0}, Lo/epf;->a(Z)Z

    .line 1199
    const/16 v0, 0xc8

    const-wide/16 v1, 0x1388

    invoke-virtual {v6, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1201
    invoke-static {}, Lo/enu;->c()Lo/enu;

    move-result-object v0

    invoke-virtual {v0}, Lo/enu;->h()V

    .line 1202
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epf;->c(Lo/epf;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 1203
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/epf;->d(Lo/epf;Z)Z

    .line 1204
    const-string v0, "name"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 1205
    const-string v0, "size"

    move-object/from16 v1, p2

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v12

    .line 1206
    const-string v0, "changelog"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 1207
    invoke-static/range {p1 .. p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v14

    .line 1208
    const/4 v0, 0x0

    if-ne v0, v14, :cond_3

    .line 1209
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AUTO_CHECK_AW70_BAND_SUCCESS AW70 deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 1211
    :cond_3
    invoke-virtual {v14}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v15

    .line 1212
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    invoke-virtual {v14}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epf;->a(Lo/epf;Ljava/lang/String;)Ljava/lang/String;

    .line 1213
    const-string v0, "UIHLH_AchievementCardData"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AUTO_CHECK_AW70_BAND_SUCCESS mCheckBandNewVersionNames:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    const-string v2, " mCheckBandNewVersionSizes:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 1214
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " bandChangeLogs:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v13, v1, v2

    const-string v2, " aw70DeviceName:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object v15, v1, v2

    .line 1213
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1216
    const-string v0, "isForced"

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v16

    .line 1217
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lo/dpa;->e(Ljava/lang/Boolean;)V

    .line 1219
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AUTO_CHECK_AW70_BAND_SUCCESS is band forcedUPdate:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v16, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1220
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1221
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epf$19;->b:Lo/epf;

    invoke-static {v1}, Lo/epf;->f(Lo/epf;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v11}, Lo/dpa;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1223
    :cond_4
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AUTO_CHECK_AW70_BAND_SUCCESS deviceInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v14, v1, v2

    const-string v2, " deviceInfo.getAutoDetectSwitchStatus() = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v14}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1224
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    move-object v1, v11

    move v2, v12

    move-object v3, v13

    move-object v4, v15

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/epf;->c(Lo/epf;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    .line 1227
    goto/16 :goto_1

    .line 1229
    :pswitch_1
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "auto check band success "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1230
    invoke-static {}, Lo/epf;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1231
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHandleCheckSuccess , do nothing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1232
    return-void

    .line 1235
    :cond_5
    const/4 v0, 0x1

    invoke-static {v0}, Lo/epf;->c(Z)Z

    .line 1236
    const/16 v0, 0x64

    const-wide/16 v1, 0x1388

    invoke-virtual {v6, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1238
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epf;->c(Lo/epf;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 1239
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/epf;->d(Lo/epf;Z)Z

    .line 1240
    invoke-static/range {p1 .. p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v15

    .line 1241
    const/4 v0, 0x0

    if-eq v0, v15, :cond_7

    .line 1242
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    invoke-virtual {v15}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epf;->a(Lo/epf;Ljava/lang/String;)Ljava/lang/String;

    .line 1243
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    const-string v1, "name"

    move-object/from16 v2, p2

    invoke-virtual {v2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epf;->e(Lo/epf;Ljava/lang/String;)Ljava/lang/String;

    .line 1244
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    const-string v1, "size"

    move-object/from16 v2, p2

    const/4 v3, -0x1

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v0, v1}, Lo/epf;->d(Lo/epf;I)I

    .line 1245
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    const-string v1, "changelog"

    move-object/from16 v2, p2

    invoke-virtual {v2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epf;->b(Lo/epf;Ljava/lang/String;)Ljava/lang/String;

    .line 1246
    const-string v0, "UIHLH_AchievementCardData"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AUTO_CHECK_BAND_SUCCESS mCheckBandNewVersionName:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/epf$19;->b:Lo/epf;

    invoke-static {v2}, Lo/epf;->g(Lo/epf;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mCheckBandNewVersionSize:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/epf$19;->b:Lo/epf;

    .line 1247
    invoke-static {v2}, Lo/epf;->o(Lo/epf;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " bandChangeLog:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/epf$19;->b:Lo/epf;

    invoke-static {v2}, Lo/epf;->l(Lo/epf;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " deviceName:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object v7, v1, v2

    .line 1246
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1249
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    const-string v1, "isForced"

    move-object/from16 v2, p2

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v0, v1}, Lo/epf;->c(Lo/epf;Z)Z

    .line 1250
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epf$19;->b:Lo/epf;

    invoke-static {v1}, Lo/epf;->p(Lo/epf;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->d(Ljava/lang/Boolean;)V

    .line 1252
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    invoke-static {v0}, Lo/epf;->p(Lo/epf;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 1254
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->r()V

    goto :goto_0

    .line 1256
    :cond_6
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epf$19;->b:Lo/epf;

    invoke-static {v1}, Lo/epf;->f(Lo/epf;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/epf$19;->b:Lo/epf;

    invoke-static {v2}, Lo/epf;->g(Lo/epf;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dpb;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1258
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epf$19;->b:Lo/epf;

    invoke-static {v1}, Lo/epf;->g(Lo/epf;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/epf$19;->b:Lo/epf;

    invoke-static {v2}, Lo/epf;->o(Lo/epf;)I

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/epf$19;->b:Lo/epf;

    invoke-static {v3}, Lo/epf;->l(Lo/epf;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3, v7}, Lo/eob;->c(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 1259
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->n()V

    goto/16 :goto_1

    .line 1262
    :cond_7
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AUTO_CHECK_BAND_SUCCESS other deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1264
    goto/16 :goto_1

    .line 1266
    :pswitch_2
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBandAutoCheckNewVersionReceiver: AUTO_CHECK_BAND_NOT_TIME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1267
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->p()V

    .line 1268
    goto/16 :goto_1

    .line 1270
    :pswitch_3
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "band support silence OTA isAutoSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/epf$19;->b:Lo/epf;

    invoke-static {v2}, Lo/epf;->m(Lo/epf;)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1271
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    invoke-static {v0}, Lo/epf;->m(Lo/epf;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1273
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    const-string v1, "wlan_auto_update"

    new-instance v2, Lo/epf$19$4;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v7}, Lo/epf$19$4;-><init>(Lo/epf$19;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_1

    .line 1307
    :pswitch_4
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "band not support silence OTA isAutoSuccess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/epf$19;->b:Lo/epf;

    invoke-static {v2}, Lo/epf;->m(Lo/epf;)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1308
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    invoke-static {v0}, Lo/epf;->m(Lo/epf;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1309
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epf$19;->b:Lo/epf;

    invoke-static {v1}, Lo/epf;->g(Lo/epf;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/epf$19;->b:Lo/epf;

    invoke-static {v2}, Lo/epf;->o(Lo/epf;)I

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/epf$19;->b:Lo/epf;

    invoke-static {v3}, Lo/epf;->l(Lo/epf;)Ljava/lang/String;

    move-result-object v3

    move-object v4, v7

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/epf;->c(Lo/epf;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_1

    .line 1313
    :pswitch_5
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "auto download band package success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1314
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->w()V

    .line 1315
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/epf$19;->b:Lo/epf;

    invoke-static {v1}, Lo/epf;->f(Lo/epf;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_8

    .line 1316
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->m()V

    goto :goto_1

    .line 1320
    :pswitch_6
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "auto download band package failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1321
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->w()V

    .line 1322
    goto :goto_1

    .line 1324
    :pswitch_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/epf;->c(Lo/epf;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 1325
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "auto check band failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1326
    goto :goto_1

    .line 1328
    :pswitch_8
    invoke-static {}, Lo/eof;->a()Lo/eof;

    move-result-object v0

    invoke-virtual {v0}, Lo/eof;->o()V

    .line 1329
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    move-object/from16 v1, p2

    invoke-static {v0, v1}, Lo/epf;->b(Lo/epf;Landroid/content/Intent;)V

    .line 1330
    .line 1334
    :cond_8
    :goto_1
    :pswitch_9
    goto :goto_3

    :cond_9
    const-string v0, "action_music_control_start_music_app"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1335
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start muisc app!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1336
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1338
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.android.mediacenter"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v10

    .line 1339
    const/4 v0, 0x0

    if-eq v0, v10, :cond_a

    .line 1340
    const/high16 v0, 0x10000000

    invoke-virtual {v10, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1341
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    iget-object v0, v0, Lo/epf;->b:Landroid/content/Context;

    invoke-virtual {v0, v10}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_2

    .line 1343
    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    invoke-static {v0}, Lo/epf;->n(Lo/epf;)V

    .line 1345
    :goto_2
    goto :goto_3

    .line 1346
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/epf$19;->b:Lo/epf;

    invoke-static {v0}, Lo/epf;->n(Lo/epf;)V

    .line 1349
    :cond_c
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_1
        :pswitch_7
        :pswitch_9
        :pswitch_9
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_8
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
