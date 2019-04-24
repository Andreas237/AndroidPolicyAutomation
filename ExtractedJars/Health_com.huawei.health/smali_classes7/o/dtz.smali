.class public Lo/dtz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILjava/lang/StringBuffer;)Ljava/lang/String;
    .locals 1

    .line 106
    const/16 v0, 0xa

    if-ge p0, v0, :cond_0

    .line 107
    invoke-static {p0, p1}, Lo/dtz;->b(ILjava/lang/StringBuffer;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 109
    :cond_0
    invoke-static {p0, p1}, Lo/dtz;->c(ILjava/lang/StringBuffer;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map;)Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 42
    invoke-static {p0}, Lo/dtz;->c(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;)Ljava/util/HashMap;

    move-result-object v0

    .line 43
    invoke-static {v0, p1}, Lo/dtz;->a(Ljava/util/HashMap;Ljava/util/Map;)V

    .line 44
    return-object v0
.end method

.method public static a(Ljava/util/HashMap;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 181
    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    .line 182
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 183
    if-nez v3, :cond_0

    .line 184
    return-void

    .line 186
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 187
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 188
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    .line 189
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    .line 190
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "addPrivateParam->:[key="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", val="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x5d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    goto :goto_0

    .line 194
    :cond_1
    return-void
.end method

.method public static a(Lo/dwk;Ljava/lang/String;)Z
    .locals 2

    .line 219
    if-eqz p1, :cond_0

    const-string v0, "0"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {p0}, Lo/dzv;->c(Lo/dwk;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lo/dzq;->e(Lo/dwk;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 220
    :goto_0
    return v1
.end method

.method public static b()J
    .locals 2

    .line 200
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 201
    return-wide v0
.end method

.method public static b(ILjava/lang/StringBuffer;)Ljava/lang/String;
    .locals 2

    .line 114
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 116
    :pswitch_0
    const-string v0, "/achievement/getPersonalInfo"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 117
    goto :goto_1

    .line 119
    :pswitch_1
    const-string v0, "/achievement/getKakaList"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 120
    goto :goto_1

    .line 122
    :pswitch_2
    const-string v0, "/achievement/report/weekly"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 123
    goto :goto_1

    .line 125
    :pswitch_3
    const-string v0, "/achievement/getMessages"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 126
    goto :goto_1

    .line 128
    :pswitch_4
    const-string v0, "/achievement/report/monthly"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 129
    goto :goto_1

    .line 131
    :pswitch_5
    const-string v0, "/achievement/exchange"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 132
    goto :goto_1

    .line 134
    :pswitch_6
    const-string v0, "/achievement/getLanguageResFileUrl"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 135
    goto :goto_1

    .line 137
    :pswitch_7
    const-string v0, "/achievement/takeMedal"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 138
    goto :goto_1

    .line 140
    :pswitch_8
    const-string v0, "/achievement/getMedalConfig"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 141
    goto :goto_1

    .line 143
    :pswitch_9
    const-string v0, "/achievement/setEvent"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 144
    goto :goto_1

    .line 146
    :goto_0
    const-string v0, "PLGACHIEVE_AchievePuller"

    const-string v1, "getTenUrl invalid contentType"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    :goto_1
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method public static b(I)Z
    .locals 2

    .line 230
    const/16 v0, 0x8

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/16 v0, 0xb

    if-eq v0, p0, :cond_0

    const/16 v0, 0xd

    if-eq v0, p0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 231
    :goto_0
    return v1
.end method

.method public static c(I)Ljava/lang/String;
    .locals 2

    .line 96
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 97
    const/16 v0, 0xa

    if-ne v0, p0, :cond_0

    .line 98
    const-string v0, "/activity/getActivityInfo"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 101
    :cond_0
    invoke-static {p0, v1}, Lo/dtz;->a(ILjava/lang/StringBuffer;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(ILjava/lang/StringBuffer;)Ljava/lang/String;
    .locals 2

    .line 153
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 155
    :pswitch_0
    const-string v0, "/achievement/getMyTaskList"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 156
    goto :goto_1

    .line 158
    :pswitch_1
    const-string v0, "/achievement/updateUserTastStatus"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 159
    goto :goto_1

    .line 161
    :pswitch_2
    const-string v0, "/achievement/getUserExperienceInfo"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 162
    goto :goto_1

    .line 164
    :pswitch_3
    const-string v0, "/achievement/updateUserExperience"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 165
    goto :goto_1

    .line 167
    :goto_0
    const-string v0, "PLGACHIEVE_AchievePuller"

    const-string v1, "getUrl invalid contentType"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :goto_1
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static c(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;)Ljava/util/HashMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 54
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 55
    const-string v0, "tokenType"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getTokenType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    const-string v0, "token"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    const-string v0, "appId"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    const-string v0, "deviceType"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getDeviceType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    const-string v0, "deviceId"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    const-string v0, "sysVersion"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getSysVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    const-string v0, "bindDeviceType"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getBindDeviceType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    const-string v0, "appType"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getAppType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    const-string v0, "ts"

    invoke-static {}, Lo/dtz;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    const-string v0, "iVersion"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getiVersion()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    const-string v0, "language"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    const-string v0, "environment"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getEnvironment()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    const-string v0, "siteId"

    invoke-static {}, Lo/czu;->g()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    :cond_0
    const-string v0, "upDeviceType"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getUpDeviceType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPublicParams->mapParams:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    return-object v3
.end method

.method public static d(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;)Ljava/util/HashMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 82
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 83
    const-string v0, "x-huid"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    const-string v0, "x-version"

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getAppVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getHeaders mapHeaders:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    return-object v3
.end method

.method public static e()Ljava/lang/Integer;
    .locals 1

    .line 205
    const/16 v0, 0x4e23

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static e(Lo/dwk;Ljava/lang/String;Landroid/content/Context;)V
    .locals 3

    .line 209
    const-string v0, "10018"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UPDATE_USER_LEVEL:repeat"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    const-string v0, "levelEventKey"

    const-string v1, ""

    invoke-static {p2, v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 212
    :cond_0
    const-string v0, "0"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 213
    const-string v0, "PLGACHIEVE_AchievePuller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UPDATE_USER_LEVEL:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    invoke-static {p2}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    const/16 v1, 0xc8

    invoke-virtual {v0, v1, p0}, Lo/dwn;->e(ILo/dwk;)V

    .line 216
    :cond_1
    :goto_0
    return-void
.end method
