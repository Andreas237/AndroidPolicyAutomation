.class Lcom/huawei/ui/homehealth/HomeFragment$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/HomeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/HomeFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/HomeFragment;)V
    .locals 0

    .line 1058
    iput-object p1, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1062
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mNonLocalBroadcastReceiver(): intent = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1063
    const-string v0, "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1065
    return-void

    .line 1067
    :cond_0
    const-string v0, "com.huawei.bone.action_band_psi_activated"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1069
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    const-string v1, "macAddress"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "activated"

    const/4 v3, 0x0

    invoke-virtual {p2, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/eob;->c(Ljava/lang/String;ZZ)V

    .line 1070
    return-void

    .line 1080
    :cond_1
    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_COMPLETED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1081
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_CORE_SLEEP_DATA_SYNC_COMPLETED receiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1082
    invoke-static {}, Lo/ewd;->d()Lo/ewd;

    move-result-object v0

    invoke-virtual {v0}, Lo/ewd;->z()V

    .line 1083
    return-void

    .line 1085
    :cond_2
    const-string v0, "com.huawei.bone.action.CORE_PERIOD_RRI_SYNC_COMPLETED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "com.huawei.bone.action.CORE_DFX_BROADCAST"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1086
    :cond_3
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1087
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ToDo dfx sync..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1088
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->h(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1090
    :cond_4
    return-void

    .line 1092
    :cond_5
    const-string v0, "com.huawei.bone.action.open_gps"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1093
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->u(Lcom/huawei/ui/homehealth/HomeFragment;)V

    .line 1094
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/HomeFragment$2;->abortBroadcast()V

    .line 1095
    return-void

    .line 1097
    :cond_6
    const-string v0, "com.huawei.bone.action.language_changed"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1098
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "language changed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1099
    invoke-static {}, Lo/dda;->e()V

    .line 1100
    return-void

    .line 1102
    :cond_7
    const-string v0, "com.huawei.health.action.UPDATE_LANGUAGE_READY"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1103
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update language ready!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1104
    invoke-static {}, Lo/dda;->e()V

    .line 1105
    return-void

    .line 1107
    :cond_8
    const-string v0, "com.huawei.health.fitness_detail_sync_success"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1108
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FITNESS_DETAIL_SYNC_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1109
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/etq;->d(Landroid/content/Context;)V

    .line 1110
    return-void

    .line 1113
    :cond_9
    const-string v0, "deviceinfo"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1116
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->t(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/support/v7/widget/RecyclerView;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_a

    .line 1117
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView is not completed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1118
    return-void

    .line 1121
    :cond_a
    :try_start_1
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v5

    .line 1122
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectedChanged(): "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",state = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1123
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v1

    invoke-virtual {v1}, Lo/etq;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/HomeFragment;->d(Lcom/huawei/ui/homehealth/HomeFragment;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1124
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->s(Lcom/huawei/ui/homehealth/HomeFragment;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 1125
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "currentDeviceInfo.getProductType():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/HomeFragment;->s(Lcom/huawei/ui/homehealth/HomeFragment;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1126
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceInfo.getProductType():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1128
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/HomeFragment;->s(Lcom/huawei/ui/homehealth/HomeFragment;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/HomeFragment;->e(Lcom/huawei/ui/homehealth/HomeFragment;I)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/HomeFragment;->e(Lcom/huawei/ui/homehealth/HomeFragment;I)Z

    move-result v0

    if-nez v0, :cond_c

    .line 1129
    :cond_b
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->s(Lcom/huawei/ui/homehealth/HomeFragment;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    if-eq v0, v1, :cond_c

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_c

    .line 1130
    const/4 v0, 0x2

    if-eq v0, v5, :cond_c

    .line 1137
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get a connect change report,but it is not belong to current device,so return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1138
    return-void

    .line 1143
    :cond_c
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    .line 1145
    :sswitch_0
    :try_start_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/ui/homehealth/HomeFragment;->c:Z

    .line 1146
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->b(Lcom/huawei/ui/homehealth/HomeFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    invoke-virtual {v0}, Lo/env;->h()V

    .line 1147
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connect  cheange istoEsimOrWallet =="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/HomeFragment;->z(Lcom/huawei/ui/homehealth/HomeFragment;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1148
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->z(Lcom/huawei/ui/homehealth/HomeFragment;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1152
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/HomeFragment;->y(Lcom/huawei/ui/homehealth/HomeFragment;)V

    goto :goto_1

    .line 1157
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/huawei/ui/homehealth/HomeFragment;->c:Z

    .line 1160
    :cond_d
    :goto_1
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connectedChanged() isConnected:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/HomeFragment$2;->d:Lcom/huawei/ui/homehealth/HomeFragment;

    iget-boolean v2, v2, Lcom/huawei/ui/homehealth/HomeFragment;->c:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0

    .line 1164
    goto :goto_2

    .line 1162
    :catch_0
    move-exception v4

    .line 1163
    const-string v0, "UIHLH_HomeFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceInfo deviceInfo error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1165
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method
