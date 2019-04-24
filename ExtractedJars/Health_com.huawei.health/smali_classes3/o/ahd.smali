.class public Lo/ahd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/String;

.field public static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/agx;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "am16Rs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/ahd;->c:Ljava/lang/String;

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/ahd;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/ahd;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Landroid/os/Bundle;
    .locals 7

    .line 154
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v4

    .line 155
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 156
    const-string v0, "AM16_PACKAGE_NAME"

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const-string v0, "EXT_IS_MUTE"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 158
    const-string v0, "AM16_MEASURE_TYPE"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 159
    const-string v0, "IS_PLAY_HEART_RATE_TOO_HIGH"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 160
    const/16 v6, 0xaa

    .line 161
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 162
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarningLimitHR()I

    move-result v6

    .line 165
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "rate warning "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const-string v0, "HEART_RATE_WARN_UPPER"

    invoke-virtual {v5, v0, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 168
    return-object v5
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 1

    .line 101
    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    const/4 v0, 0x1

    return v0

    .line 104
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b()V
    .locals 6

    .line 146
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v5

    .line 147
    if-eqz v5, :cond_0

    invoke-static {}, Lo/ahd;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    invoke-virtual {v5}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v3

    const-string v4, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v3, v4}, Lo/afq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/afj;->m()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/acq;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    const-string v1, "54C9739F-CA5C-4347-9F00-75B9DDF2C649"

    invoke-virtual {v0, v1}, Lo/acq;->b(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/MeasureKit;

    .line 151
    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 313
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save scale version success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    new-instance v4, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 315
    invoke-virtual {v4, p0, p1}, Lo/aev;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    return-void
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    .line 141
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c()Z
    .locals 2

    .line 133
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, v1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, v1}, Lo/afd;->d(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 136
    :cond_1
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 1

    .line 109
    const-string v0, "34fa0346-d46c-439d-9cb0-2f696618846b"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "33123f39-7fc1-420b-9882-a4b0d6c61100"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 110
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 112
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static d()Landroid/os/Bundle;
    .locals 7

    .line 192
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v4

    .line 193
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 194
    const-string v0, "AM16_PACKAGE_NAME"

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const-string v0, "EXT_IS_MUTE"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 196
    const-string v0, "AM16_MEASURE_TYPE"

    const/4 v1, 0x2

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 198
    const/16 v6, 0xaa

    .line 199
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 200
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarningLimitHR()I

    move-result v6

    .line 203
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "rate warning "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const-string v0, "HEART_RATE_WARN_UPPER"

    invoke-virtual {v5, v0, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 206
    return-object v5
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 1

    .line 124
    const-string v0, "7a1063dd-0e0f-4a72-9939-461476ff0259"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    const/4 v0, 0x1

    return v0

    .line 127
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static e()Landroid/os/Bundle;
    .locals 8

    .line 172
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v4

    .line 173
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 174
    const-string v0, "AM16_PACKAGE_NAME"

    const-string v1, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    const-string v0, "EXT_IS_MUTE"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 176
    const-string v0, "AM16_MEASURE_TYPE"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 177
    const/16 v6, 0xaa

    .line 178
    const/4 v7, 0x1

    .line 179
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 180
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->isWarningEnble()Z

    move-result v7

    .line 181
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarningLimitHR()I

    move-result v6

    .line 184
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "rate warning "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    const-string v0, "IS_PLAY_HEART_RATE_TOO_HIGH"

    invoke-virtual {v5, v0, v7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 187
    const-string v0, "HEART_RATE_WARN_UPPER"

    invoke-virtual {v5, v0, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 188
    return-object v5
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 1

    .line 117
    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 118
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 120
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static f()V
    .locals 3

    .line 277
    new-instance v2, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 278
    const-string v0, "is_show_permission_tip"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lo/aev;->c(Ljava/lang/String;Z)V

    .line 279
    return-void
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 1

    .line 336
    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 337
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 339
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static g()V
    .locals 3

    .line 223
    new-instance v2, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 224
    const-string v0, "is_down_am16_source"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lo/aev;->c(Ljava/lang/String;Z)V

    .line 225
    return-void
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 1

    .line 301
    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 302
    const/4 v0, 0x1

    return v0

    .line 304
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 308
    new-instance v1, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 309
    invoke-virtual {v1, p0}, Lo/aev;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static h()Z
    .locals 3

    .line 217
    new-instance v1, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 218
    const-string v0, "is_down_am16_source"

    invoke-virtual {v1, v0}, Lo/aev;->d(Ljava/lang/String;)Z

    move-result v2

    .line 219
    return v2
.end method

.method public static i()V
    .locals 5

    .line 263
    new-instance v4, Ljava/io/File;

    sget-object v0, Lo/ahd;->e:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 264
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HonourDeviceConstants updateResouce "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    sget-object v1, Lo/ahd;->e:Ljava/lang/String;

    sget-object v2, Lo/agx;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/afn;->b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 268
    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;)Z
    .locals 6

    .line 245
    :try_start_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 246
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 247
    const-string v0, "productId"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 248
    invoke-static {v5}, Lo/ahd;->a(Ljava/lang/String;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    const/4 v0, 0x1

    return v0

    .line 255
    :cond_0
    goto :goto_0

    .line 253
    :catch_0
    move-exception v4

    .line 254
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static k()Z
    .locals 3

    .line 271
    new-instance v1, Lo/aev;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 272
    const-string v0, "is_show_permission_tip"

    invoke-virtual {v1, v0}, Lo/aev;->d(Ljava/lang/String;)Z

    move-result v2

    .line 273
    return v2
.end method

.method public static k(Ljava/lang/String;)Z
    .locals 1

    .line 282
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 283
    const/4 v0, 0x0

    return v0

    .line 285
    :cond_0
    const-string v0, "e4b0b1d5-2003-4d88-8b5f-c4f64542040b"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "a8ba095d-4123-43c4-a30a-0240011c58de"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 288
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 297
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static n()Z
    .locals 3

    .line 319
    const/4 v2, 0x0

    .line 320
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "34fa0346-d46c-439d-9cb0-2f696618846b"

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 321
    const/4 v2, 0x1

    .line 323
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "33123f39-7fc1-420b-9882-a4b0d6c61100"

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 324
    const/4 v2, 0x1

    .line 326
    :cond_1
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f"

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 327
    const/4 v2, 0x1

    .line 329
    :cond_2
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    const-string v1, "7a1063dd-0e0f-4a72-9939-461476ff0259"

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 330
    const/4 v2, 0x1

    .line 332
    :cond_3
    return v2
.end method
