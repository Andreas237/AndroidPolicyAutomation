.class public Lo/cnt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 5

    .line 39
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendSQLiteUpgradeDownBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_sqlite_upgrade_done"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 41
    const-string v0, "time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 42
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 43
    return-void
.end method

.method public static a(Landroid/content/Context;I)V
    .locals 5

    .line 141
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendDataRefreshBroadcast refreshType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 143
    const-string v0, "refresh_type"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 144
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 145
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/hihealth/HiDeviceInfo;)V
    .locals 8

    .line 235
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendBindingDeviceBroadcast enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    if-eqz p1, :cond_2

    .line 237
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    .line 238
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v5

    .line 239
    if-eqz v5, :cond_1

    .line 240
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    .line 242
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    const/4 v1, 0x2

    invoke-virtual {v6, v1, v0, v4}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 244
    :cond_0
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 246
    :goto_0
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceUniqueCode(Ljava/lang/String;)V

    .line 247
    new-instance v7, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.binding_device"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 248
    const-string v0, "devicinfo"

    invoke-virtual {v7, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 249
    invoke-static {p0, v7}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 250
    goto :goto_1

    .line 251
    :cond_1
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendBindingDeviceBroadcast, deviceUniqueCode = null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    :goto_1
    goto :goto_2

    .line 254
    :cond_2
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendBindingDeviceBroadcast, deviceInfo = null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    :goto_2
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 225
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendUserPreferenceBroadcast key = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.user_preference"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 227
    const-string v0, "user_preference_key"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 228
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 229
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 5

    .line 53
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendSyncBeginBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_sync"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 55
    const-string v0, "com.huawei.hihealth.action_sync_status"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 56
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 57
    return-void
.end method

.method public static b(Landroid/content/Context;F)V
    .locals 5

    .line 31
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendSQLiteUpgradeWorkingBroadcast percent = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_sqlite_upgrade_working"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 33
    const-string v0, "time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 34
    const-string v0, "percent"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;F)Landroid/content/Intent;

    .line 35
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 36
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 5

    .line 46
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendSQLiteUpgradeExceptionBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_sqlite_upgrade_exception"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 48
    const-string v0, "time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 49
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 50
    return-void
.end method

.method public static c(Landroid/content/Context;D)V
    .locals 5

    .line 60
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendSyncProcessBroadcast process is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_sync"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 62
    const-string v0, "com.huawei.hihealth.action_sync_status"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 63
    const-string v0, "com.huawei.hihealth.action_sync_process"

    invoke-virtual {v4, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 64
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 65
    return-void
.end method

.method public static c(Landroid/content/Context;I)V
    .locals 6

    .line 171
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 173
    const-string v0, "com.huawei.health"

    :try_start_0
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 174
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_today_sport_data_refresh"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 175
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendTodaySportDataRefreshBroadcast is health start DaemonService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 177
    const-string v0, "com.huawei.health.manager.DaemonService"

    invoke-virtual {v5, v4, v0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 178
    const-string v0, "refresh_type"

    invoke-virtual {v5, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 179
    invoke-virtual {p0, v5}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    :cond_0
    goto :goto_0

    .line 181
    :catch_0
    move-exception v5

    .line 182
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    :goto_0
    return-void
.end method

.method public static c(Landroid/content/Context;II)V
    .locals 5

    .line 126
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendSyncDataBroadcast syncDataType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " syncStatus is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_sync_data"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 128
    const-string v0, "com.huawei.hihealth.action_sync_type"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 129
    const-string v0, "com.huawei.hihealth.action_sync_status"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 130
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 131
    return-void
.end method

.method public static c(Landroid/content/Context;III)V
    .locals 5

    .line 105
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendDownloadDataResult syncType="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", result="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_download_data_resualt"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 107
    const-string v0, "com.huawei.hihealth.action_download_data_resualt_code"

    invoke-virtual {v4, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 108
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 109
    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 5

    .line 68
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendPullSportDataFinishBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_sync"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 70
    const-string v0, "com.huawei.hihealth.action_sync_status"

    const/16 v1, 0x3e8

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 71
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 72
    return-void
.end method

.method public static e(Landroid/content/Context;)V
    .locals 5

    .line 24
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendAccountSwitchFinishBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_account_login_datas_switch_finish"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 26
    const-string v0, "time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 27
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 28
    return-void
.end method

.method public static e(Landroid/content/Context;ILjava/lang/String;)V
    .locals 5

    .line 158
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendDataRefreshBroadcast refreshType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 160
    const-string v0, "refresh_type"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 161
    const-string v0, "device_uniquecode"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 162
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 163
    return-void
.end method

.method private static e(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 188
    invoke-static {p0, p1}, Lo/cls;->c(Landroid/content/Context;Landroid/content/Intent;)V

    .line 189
    return-void
.end method

.method public static f(Landroid/content/Context;)V
    .locals 5

    .line 152
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendShowPrivicyBroadcast..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_change_to_cloud_version"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 154
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 155
    return-void
.end method

.method public static g(Landroid/content/Context;)V
    .locals 5

    .line 75
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendSyncDoneBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_sync"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 77
    const-string v0, "com.huawei.hihealth.action_sync_status"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 78
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 79
    return-void
.end method

.method public static h(Landroid/content/Context;)V
    .locals 5

    .line 120
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendSyncTotalSportDataBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_sync_total_sport_data"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 122
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 123
    return-void
.end method

.method public static i(Landroid/content/Context;)V
    .locals 5

    .line 82
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendSyncFailedBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_sync"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 84
    const-string v0, "com.huawei.hihealth.action_sync_status"

    const/4 v1, 0x3

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 85
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 86
    return-void
.end method

.method public static k(Landroid/content/Context;)V
    .locals 1

    .line 167
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lo/cnt;->c(Landroid/content/Context;I)V

    .line 168
    return-void
.end method

.method public static o(Landroid/content/Context;)V
    .locals 5

    .line 216
    const-string v0, "HiH_HiBroadcastUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendReceivePushBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_receive_push"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 218
    invoke-static {p0, v4}, Lo/cnt;->e(Landroid/content/Context;Landroid/content/Intent;)V

    .line 219
    return-void
.end method
