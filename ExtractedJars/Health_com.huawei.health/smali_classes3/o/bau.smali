.class public final Lo/bau;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private e:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(J)V
    .locals 3

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    .line 68
    iput-wide p1, p0, Lo/bau;->a:J

    .line 69
    const-string v0, "trs"

    invoke-static {p1, p2, v0}, Lo/bop;->d(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 71
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    .line 72
    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    .line 74
    return-void
.end method

.method private static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 238
    if-nez p0, :cond_0

    .line 240
    const-string v0, "TRSManager"

    const-string v1, "application ctx is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    const-string v0, ""

    return-object v0

    .line 245
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_PHONE_STATE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Lo/biq;->d(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v3

    .line 246
    if-nez v3, :cond_1

    .line 248
    const-string v0, "TRSManager"

    const-string v1, "need read phone state permission."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    const-string v0, ""

    return-object v0

    .line 252
    :cond_1
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/telephony/TelephonyManager;

    .line 253
    const/4 v5, 0x0

    .line 254
    if-eqz v4, :cond_2

    .line 256
    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v5

    .line 258
    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-lt v0, v1, :cond_3

    .line 261
    const/4 v0, 0x0

    const/4 v1, 0x5

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 265
    :cond_3
    const-string v0, ""

    return-object v0
.end method

.method private d()I
    .locals 4

    .line 179
    const/4 v3, -0x1

    .line 180
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    .line 182
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "RegionID"

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 184
    :cond_0
    return v3
.end method


# virtual methods
.method public a()Z
    .locals 12

    .line 153
    const/4 v4, 0x1

    .line 154
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_4

    .line 157
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "TrsApkVerCode"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 158
    invoke-static {}, Lo/brg;->d()I

    move-result v0

    if-le v0, v5, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 159
    :goto_0
    if-eqz v4, :cond_1

    .line 161
    return v4

    .line 164
    :cond_1
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "TrsUpdateTime"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    .line 165
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "ValidTime"

    const-wide/32 v2, 0x15180

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    .line 166
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v6

    const-wide/16 v2, 0x3e8

    div-long v10, v0, v2

    .line 167
    const-wide/16 v0, 0x0

    cmp-long v0, v10, v0

    if-ltz v0, :cond_2

    cmp-long v0, v10, v8

    if-lez v0, :cond_3

    :cond_2
    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 169
    :cond_4
    :goto_1
    return v4
.end method

.method public e()Lo/bat$e;
    .locals 6

    .line 121
    const/4 v4, 0x0

    .line 122
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "is_saved"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 125
    if-eqz v5, :cond_0

    .line 127
    new-instance v4, Lo/bat$e;

    invoke-direct {v4}, Lo/bat$e;-><init>()V

    .line 128
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "ServerIP"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/bat$e;->a(Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "ServerPort"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/bat$e;->e(I)V

    .line 130
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "RegionID"

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/bat$e;->b(I)V

    .line 132
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "ValidTime"

    const-wide/32 v2, 0x15180

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/bat$e;->c(J)V

    .line 134
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "MaxImRetryTimes"

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/bat$e;->a(I)V

    .line 136
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "MaxRandConnectTime"

    const/16 v2, 0x3c

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/bat$e;->d(I)V

    .line 138
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "MinImRandConnectTime"

    const/16 v2, 0x3c

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/bat$e;->i(I)V

    .line 139
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "TrsUpdateTime"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/bat$e;->e(J)V

    .line 140
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    const-string v1, "TrsApkVerCode"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v4, v0}, Lo/bat$e;->g(I)V

    .line 143
    :cond_0
    return-object v4
.end method

.method public e(Lo/bat;Ljava/lang/String;)V
    .locals 5

    .line 194
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 195
    const-string v0, "mccmnc"

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/bau;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    const-string v0, "userId"

    iget-wide v1, p0, Lo/bau;->a:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    const-string v0, "regionId"

    invoke-direct {p0}, Lo/bau;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    const-string v0, "clientVer"

    invoke-static {}, Lo/brg;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    const-string v0, "protocolVer"

    const-string v1, "1.0"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    const-string v0, "mode"

    invoke-static {}, Lo/bar;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    const-string v0, "romVer"

    sget-object v1, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    const-string v0, "appid"

    const-string v1, "com.huawei.health"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 215
    const-string v0, "imei"

    invoke-interface {v3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    new-instance v4, Lo/bav;

    iget-wide v0, p0, Lo/bau;->a:J

    invoke-direct {v4, v0, v1, v3, p1}, Lo/bav;-><init>(JLjava/util/Map;Lo/bat;)V

    .line 218
    invoke-virtual {v4}, Lo/bav;->start()V

    .line 219
    goto :goto_0

    .line 222
    :cond_0
    const-string v0, "TRSManager"

    const-string v1, "deviceID is null,do not request trs,call back error!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    if-eqz p1, :cond_1

    .line 225
    const/4 v0, -0x1

    invoke-interface {p1, v0}, Lo/bat;->e(I)V

    .line 228
    :cond_1
    :goto_0
    return-void
.end method

.method public e(Lo/bat$e;)Z
    .locals 5

    .line 84
    const/4 v3, 0x0

    .line 85
    if-eqz p1, :cond_1

    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_1

    .line 87
    const-string v0, "TRSManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "saveTRSInfo()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lo/bat$e;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lo/bau;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 89
    const-string v0, "is_saved"

    const/4 v1, 0x1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 91
    const-string v0, "ClientID"

    invoke-interface {v4, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 92
    invoke-virtual {p1}, Lo/bat$e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    const-string v0, "ServerIP"

    invoke-virtual {p1}, Lo/bat$e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 96
    :cond_0
    const-string v0, "ServerPort"

    invoke-virtual {p1}, Lo/bat$e;->e()I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 97
    const-string v0, "RegionID"

    invoke-virtual {p1}, Lo/bat$e;->c()I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 98
    const-string v0, "ValidTime"

    invoke-virtual {p1}, Lo/bat$e;->a()J

    move-result-wide v1

    invoke-interface {v4, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 99
    const-string v0, "MaxImRetryTimes"

    invoke-virtual {p1}, Lo/bat$e;->i()I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 100
    const-string v0, "MaxRandConnectTime"

    invoke-virtual {p1}, Lo/bat$e;->h()I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 101
    const-string v0, "MinImRandConnectTime"

    invoke-virtual {p1}, Lo/bat$e;->k()I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 103
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lo/bat$e;->e(J)V

    .line 104
    const-string v0, "TrsUpdateTime"

    invoke-virtual {p1}, Lo/bat$e;->g()J

    move-result-wide v1

    invoke-interface {v4, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 107
    const-string v0, "TrsApkVerCode"

    invoke-static {}, Lo/brg;->d()I

    move-result v1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 109
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v3

    .line 111
    :cond_1
    return v3
.end method
