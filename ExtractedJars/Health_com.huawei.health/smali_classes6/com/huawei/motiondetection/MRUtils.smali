.class public final Lcom/huawei/motiondetection/MRUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final HWMOTIONS_CONTENT_URI:Landroid/net/Uri;

.field public static final MOTION_DETECTION_VERSION_CODE:I = 0x13d95

.field public static final MOTION_DETECTION_VERSION_NAME:Ljava/lang/String; = "8.1.301"

.field private static final MOTION_SERVICE_CONFIG_VERSION_CODE:I = 0x13d95


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    const-string v0, "content://com.huawei.providers.motions/hwmotions"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/huawei/motiondetection/MRUtils;->HWMOTIONS_CONTENT_URI:Landroid/net/Uri;

    .line 46
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    return-void
.end method

.method public static getMotionDetectionVersionCode()I
    .locals 1

    .line 246
    const v0, 0x13d95

    return v0
.end method

.method public static getMotionDetectionVersionName()Ljava/lang/String;
    .locals 1

    .line 255
    const-string v0, "8.1.301"

    return-object v0
.end method

.method public static getMotionEnableState(Landroid/content/Context;Ljava/lang/String;)I
    .locals 8

    .line 128
    const/4 v6, -0x1

    .line 129
    invoke-static {p0}, Lcom/huawei/motiondetection/MRUtils;->isMotionServiceConfigurable(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 131
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 132
    sget-object v1, Lcom/huawei/motiondetection/MRUtils;->HWMOTIONS_CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "name"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 133
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "enable=1 and name=\'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 132
    .line 134
    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 131
    .line 135
    if-eqz v7, :cond_0

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 136
    const/4 v6, 0x1

    goto :goto_0

    .line 138
    :cond_0
    if-eqz v7, :cond_1

    .line 139
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 141
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/huawei/motiondetection/MRUtils;->HWMOTIONS_CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "name"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "enable=0 and name=\'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 142
    if-eqz v7, :cond_2

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 143
    const/4 v6, 0x0

    .line 146
    :cond_2
    :goto_0
    if-eqz v7, :cond_4

    .line 147
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    const/4 v7, 0x0

    goto :goto_1

    .line 151
    :catch_0
    move-exception v7

    .line 152
    invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 155
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 155
    .line 156
    const/4 v1, -0x1

    invoke-static {v0, p1, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v6

    .line 158
    :cond_4
    :goto_1
    const-string v0, "MRUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getMotionEnableState enabled: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    return v6
.end method

.method public static isMotionConfigSupported(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 8

    .line 172
    const/4 v6, 0x0

    .line 175
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/huawei/motiondetection/MRUtils;->HWMOTIONS_CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "name"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "support=1 and name=\'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 177
    if-eqz v7, :cond_1

    .line 178
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 179
    const/4 v6, 0x1

    .line 181
    :cond_0
    invoke-interface {v7}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 182
    const/4 v7, 0x0

    goto :goto_0

    .line 185
    :catch_0
    move-exception v7

    .line 186
    invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V

    .line 189
    :cond_1
    :goto_0
    return v6
.end method

.method private static isMotionServiceConfigurable(Landroid/content/Context;)Z
    .locals 4

    .line 230
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.huawei.motionservice"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 231
    if-eqz v3, :cond_0

    iget v0, v3, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const v1, 0x13d95

    if-lt v0, v1, :cond_0

    .line 232
    const/4 v0, 0x1

    return v0

    .line 234
    :catch_0
    move-exception v3

    .line 235
    invoke-virtual {v3}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 237
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isServiceRunning(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 6

    .line 201
    .line 202
    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 201
    move-object v2, v0

    check-cast v2, Landroid/app/ActivityManager;

    .line 204
    const v0, 0x7fffffff

    invoke-virtual {v2, v0}, Landroid/app/ActivityManager;->getRunningServices(I)Ljava/util/List;

    move-result-object v3

    .line 205
    if-nez v3, :cond_0

    .line 206
    const-string v0, "MRUtils"

    const-string v1, "isServiceRunning serviceList == null"

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 208
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    goto :goto_0

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/ActivityManager$RunningServiceInfo;

    .line 210
    iget-object v0, v4, Landroid/app/ActivityManager$RunningServiceInfo;->process:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, v4, Landroid/app/ActivityManager$RunningServiceInfo;->pid:I

    if-lez v0, :cond_2

    .line 211
    const/4 v0, 0x1

    return v0

    .line 208
    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 218
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public static localProcess(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 85
    if-nez p0, :cond_0

    .line 86
    const-string v0, ""

    return-object v0

    .line 88
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 89
    return-object v1
.end method

.method public static setMotionEnableState(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 5

    .line 106
    invoke-static {p0}, Lcom/huawei/motiondetection/MRUtils;->isMotionServiceConfigurable(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 108
    const-string v0, "enable"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 109
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/huawei/motiondetection/MRUtils;->HWMOTIONS_CONTENT_URI:Landroid/net/Uri;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "name=\'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_0

    .line 111
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0, p1, p2}, Landroid/provider/Settings$System;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z

    .line 114
    :goto_0
    return-void
.end method
