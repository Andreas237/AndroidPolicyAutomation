.class public Lo/cvc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/cvc;->a:Ljava/util/List;

    .line 26
    sget-object v0, Lo/cvc;->a:Ljava/util/List;

    const-string v1, "com.huawei.ah100"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    sget-object v0, Lo/cvc;->a:Ljava/util/List;

    const-string v1, "com.huawei.bone"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/util/List;)Lcom/huawei/hihealthservice/auth/WhiteListApp;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;)Lcom/huawei/hihealthservice/auth/WhiteListApp;"
        }
    .end annotation

    .line 54
    new-instance v4, Lcom/huawei/hihealthservice/auth/WhiteListApp;

    invoke-direct {v4}, Lcom/huawei/hihealthservice/auth/WhiteListApp;-><init>()V

    .line 55
    invoke-virtual {v4, p0}, Lcom/huawei/hihealthservice/auth/WhiteListApp;->setPackageName(Ljava/lang/String;)V

    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    .line 57
    invoke-virtual {v4, v5}, Lcom/huawei/hihealthservice/auth/WhiteListApp;->setAppId(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v4, p0}, Lcom/huawei/hihealthservice/auth/WhiteListApp;->setAccessToken(Ljava/lang/String;)V

    .line 59
    invoke-static {p1, p0}, Lo/cvc;->a(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 60
    const-string v0, "Debug_HiWhiteListAppUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "appScopes are "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    invoke-virtual {v4, v6}, Lcom/huawei/hihealthservice/auth/WhiteListApp;->setAppScopes(Ljava/lang/String;)V

    .line 62
    invoke-static {p1, v5}, Lo/cvc;->b(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 63
    const-string v0, "Debug_HiWhiteListAppUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userScopes are "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    invoke-virtual {v4, v7}, Lcom/huawei/hihealthservice/auth/WhiteListApp;->setUserScopes(Ljava/lang/String;)V

    .line 65
    return-object v4
.end method

.method private static a(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;)Ljava/lang/String;"
        }
    .end annotation

    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 71
    const-string v0, "{\"scopes\":[{\"id\":13,\"name\":\"SCOPE_ACCOUNT_BASEPROFILE\",\"permissions\":[\"com.huawei.android.hms.account.getBaseProfile\"],\"uri\":\"https://www.huawei.com/auth/account/base.profile\"}"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 73
    invoke-static {v5}, Lo/cni;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 74
    invoke-static {v5}, Lo/cvc;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 75
    invoke-static {v5}, Lo/cvc;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 76
    invoke-static {v6}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    :cond_0
    invoke-static {v7}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 80
    invoke-static {v5}, Lo/cvc;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    :cond_1
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    :cond_2
    goto :goto_0

    .line 85
    :cond_3
    const-string v0, ",{\"id\":9999,\"name\":\"DEFAULT_SCOPE\",\"permissions\":[\"com.huawei.android.hms.account.getOpenID\"],\"uri\":\"https://www.huawei.com/default/scopes\"}],\"certFingerprint\":\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\",\"appAttr\":{\"appCnName\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 88
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static declared-synchronized a()V
    .locals 5

    const-class v4, Lo/cvc;

    monitor-enter v4

    .line 41
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 43
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 44
    const-string v0, "com.huawei.android.hms.health.profile.readonly"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    const-string v0, "com.huawei.android.hms.health.health.wgt"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    const-string v0, "com.huawei.android.hms.health.health.wgt.readonly"

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    const-string v0, "com.huawei.ah100"

    invoke-static {v0, v2}, Lo/cvc;->a(Ljava/lang/String;Ljava/util/List;)Lcom/huawei/hihealthservice/auth/WhiteListApp;

    move-result-object v3

    .line 48
    invoke-virtual {v3}, Lcom/huawei/hihealthservice/auth/WhiteListApp;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    invoke-static {}, Lo/cra;->c()Lo/cra;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/cra;->a(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    monitor-exit v4

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v4

    throw v1
.end method

.method static declared-synchronized a(Ljava/lang/String;)Z
    .locals 6

    const-class v5, Lo/cvc;

    monitor-enter v5

    .line 31
    :try_start_0
    sget-object v0, Lo/cvc;->a:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    .line 32
    const-string v0, "Debug_HiWhiteListAppUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkIsWhiteListApp, packageName is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    const-string v2, " isWhiteApp is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    invoke-static {p0}, Lo/cne;->b(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v5

    return v0

    :catchall_0
    move-exception p0

    monitor-exit v5

    throw p0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 148
    const/4 v1, 0x0

    .line 149
    const-string v0, "com.huawei.android.hms.health.health.hr.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    const-string v1, ",{\"id\":110,\"name\":\"SCOPE_HEALTH_HEALTH_HR_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.health.hr.readonly\"],\"uri\":\"https://www.huawei.com/health/health.hr.readonly\"}"

    .line 152
    :cond_0
    const-string v0, "com.huawei.android.hms.health.health.ecg"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 153
    const-string v1, ",{\"id\":111,\"name\":\"SCOPE_HEALTH_HEALTH_ECG\",\"permissions\":[\"com.huawei.android.hms.health.health.ecg\"],\"uri\":\"https://www.huawei.com/health/health.ecg\"}"

    .line 155
    :cond_1
    const-string v0, "com.huawei.android.hms.health.health.ecg.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 156
    const-string v1, ",{\"id\":112,\"name\":\"SCOPE_HEALTH_HEALTH_ECG_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.health.ecg.readonly\"],\"uri\":\"https://www.huawei.com/health/health.ecg.readonly\"}"

    .line 158
    :cond_2
    const-string v0, "com.huawei.android.hms.health.health.bg"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 159
    const-string v1, ",{\"id\":113,\"name\":\"SCOPE_HEALTH_HEALTH_BG\",\"permissions\":[\"com.huawei.android.hms.health.health.bg\"],\"uri\":\"https://www.huawei.com/health/health.bg\"}"

    .line 161
    :cond_3
    const-string v0, "com.huawei.android.hms.health.health.bg.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 162
    const-string v1, ",{\"id\":114,\"name\":\"SCOPE_HEALTH_HEALTH_BG_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.health.bg.readonly\"],\"uri\":\"https://www.huawei.com/health/health.bg.readonly\"}"

    .line 164
    :cond_4
    const-string v0, "com.huawei.android.hms.health.health.bf"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 165
    const-string v1, ",{\"id\":115,\"name\":\"SCOPE_HEALTH_HEALTH_BF\",\"permissions\":[\"com.huawei.android.hms.health.health.bf\"],\"uri\":\"https://www.huawei.com/health/health.bf\"}"

    .line 167
    :cond_5
    const-string v0, "com.huawei.android.hms.health.health.bf.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 168
    const-string v1, ",{\"id\":116,\"name\":\"SCOPE_HEALTH_HEALTH_BF_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.health.bf.readonly\"],\"uri\":\"https://www.huawei.com/health/health.bf.readonly\"}"

    .line 170
    :cond_6
    const-string v0, "\tcom.huawei.android.hms.health.motionpath"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 171
    const-string v1, ",{\"id\":117,\"name\":\"SCOPE_HEALTH_MOTIONPATH\",\"permissions\":[\"com.huawei.android.hms.health.motionpath\"],\"uri\":\"https://www.huawei.com/health/motionpath\"}"

    .line 173
    :cond_7
    const-string v0, "com.huawei.android.hms.health.motionpath.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 174
    const-string v1, ",{\"id\":118,\"name\":\"SCOPE_HEALTH_MOTIONPATH_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.motionpath.readonly\"],\"uri\":\"https://www.huawei.com/health/motionpath.readonly\"}"

    .line 176
    :cond_8
    return-object v1
.end method

.method private static b(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;)Ljava/lang/String;"
        }
    .end annotation

    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 95
    const-string v0, "{\"scope\":\"https://www.huawei.com/auth/account/base.profile"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 97
    invoke-static {v5}, Lo/cni;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 98
    invoke-static {v5}, Lo/cvc;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 99
    invoke-static {v5}, Lo/cvc;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 100
    invoke-static {v6}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    :cond_0
    invoke-static {v7}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 104
    invoke-static {v5}, Lo/cvc;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    :cond_1
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    :cond_2
    goto :goto_0

    .line 109
    :cond_3
    const-string v0, "\",\"open_id\":\"com.huawei.ah100\",\"expire_in\":788400000,\"client_id\":\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"}"

    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 116
    const/4 v1, 0x0

    .line 117
    const-string v0, "com.huawei.android.hms.health.profile"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    const-string v1, ",{\"id\":101,\"name\":\"SCOPE_HEALTH_PROFILE\",\"permissions\":[\"com.huawei.android.hms.health.profile\"],\"uri\":\"https://www.huawei.com/health/profile\"}"

    .line 120
    :cond_0
    const-string v0, "com.huawei.android.hms.health.profile.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 121
    const-string v1, ",{\"id\":102,\"name\":\"SCOPE_HEALTH_PROFILE_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.profile.readonly\"],\"uri\":\"https://www.huawei.com/health/profile.readonly\"}"

    .line 123
    :cond_1
    const-string v0, "com.huawei.android.hms.health.sport"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 124
    const-string v1, ",{\"id\":103,\"name\":\"SCOPE_HEALTH_SPORT\",\"permissions\":[\"com.huawei.android.hms.health.sport\"],\"uri\":\"https://www.huawei.com/health/sport\"}"

    .line 126
    :cond_2
    const-string v0, "com.huawei.android.hms.health.sport.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 127
    const-string v1, ",{\"id\":104,\"name\":\"SCOPE_HEALTH_SPORT_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.sport.readonly\"],\"uri\":\"https://www.huawei.com/health/sport.readonly\"}"

    .line 129
    :cond_3
    const-string v0, "com.huawei.android.hms.health.health.wgt"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 130
    const-string v1, ",{\"id\":105,\"name\":\"SCOPE_HEALTH_HEALTH_WGT\",\"permissions\":[\"com.huawei.android.hms.health.health.wgt\"],\"uri\":\"https://www.huawei.com/health/health.wgt\"}"

    .line 132
    :cond_4
    const-string v0, "com.huawei.android.hms.health.health.wgt.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 133
    const-string v1, ",{\"id\":106,\"name\":\"SCOPE_HEALTH_HEALTH_WGT_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.health.wgt.readonly\"],\"uri\":\"https://www.huawei.com/health/health.wgt.readonly\"}"

    .line 135
    :cond_5
    const-string v0, "com.huawei.android.hms.health.health.slp"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 136
    const-string v1, ",{\"id\":107,\"name\":\"SCOPE_HEALTH_HEALTH_SLP\",\"permissions\":[\"com.huawei.android.hms.health.health.slp\"],\"uri\":\"https://www.huawei.com/health/health.slp\"}"

    .line 138
    :cond_6
    const-string v0, "com.huawei.android.hms.health.health.slp.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 139
    const-string v1, ",{\"id\":108,\"name\":\"SCOPE_HEALTH_HEALTH_SLP_READONLY\",\"permissions\":[\"com.huawei.android.hms.health.health.slp.readonly\"],\"uri\":\"https://www.huawei.com/health/health.slp.readonly\"}"

    .line 141
    :cond_7
    const-string v0, "com.huawei.android.hms.health.health.hr"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 142
    const-string v1, ",{\"id\":109,\"name\":\"SCOPE_HEALTH_HEALTH_HR\",\"permissions\":[\"com.huawei.android.hms.health.health.hr\"],\"uri\":\"https://www.huawei.com/health/health.hr\"}"

    .line 144
    :cond_8
    return-object v1
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 180
    const/4 v1, 0x0

    .line 181
    const-string v0, "com.huawei.android.hms.health.profile"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    const-string v1, " https://www.huawei.com/health/profile"

    .line 184
    :cond_0
    const-string v0, "com.huawei.android.hms.health.profile.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 185
    const-string v1, " https://www.huawei.com/health/profile.readonly"

    .line 187
    :cond_1
    const-string v0, "com.huawei.android.hms.health.sport"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 188
    const-string v1, " https://www.huawei.com/health/sport"

    .line 190
    :cond_2
    const-string v0, "com.huawei.android.hms.health.sport.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 191
    const-string v1, " https://www.huawei.com/health/sport.readonly"

    .line 193
    :cond_3
    const-string v0, "com.huawei.android.hms.health.health.wgt"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 194
    const-string v1, " https://www.huawei.com/health/health.wgt"

    .line 196
    :cond_4
    const-string v0, "com.huawei.android.hms.health.health.wgt.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 197
    const-string v1, " https://www.huawei.com/health/health.wgt.readonly"

    .line 199
    :cond_5
    const-string v0, "com.huawei.android.hms.health.health.slp"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 200
    const-string v1, " https://www.huawei.com/health/health.slp"

    .line 202
    :cond_6
    const-string v0, "com.huawei.android.hms.health.health.slp.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 203
    const-string v1, " https://www.huawei.com/health/health.slp.readonly"

    .line 205
    :cond_7
    const-string v0, "com.huawei.android.hms.health.health.hr"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 206
    const-string v1, " https://www.huawei.com/health/health.hr"

    .line 208
    :cond_8
    return-object v1
.end method

.method public static d()V
    .locals 0

    .line 37
    invoke-static {}, Lo/cvc;->a()V

    .line 38
    return-void
.end method

.method private static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 212
    const/4 v1, 0x0

    .line 213
    const-string v0, "com.huawei.android.hms.health.health.hr.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 214
    const-string v1, " https://www.huawei.com/health/health.hr.readonly"

    .line 216
    :cond_0
    const-string v0, "com.huawei.android.hms.health.health.ecg"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 217
    const-string v1, " https://www.huawei.com/health/health.ecg"

    .line 219
    :cond_1
    const-string v0, "com.huawei.android.hms.health.health.ecg.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 220
    const-string v1, " https://www.huawei.com/health/health.ecg.readonly"

    .line 222
    :cond_2
    const-string v0, "com.huawei.android.hms.health.health.bg"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 223
    const-string v1, " https://www.huawei.com/health/health.bg"

    .line 225
    :cond_3
    const-string v0, "com.huawei.android.hms.health.health.bg.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 226
    const-string v1, " https://www.huawei.com/health/health.bg.readonly"

    .line 228
    :cond_4
    const-string v0, "com.huawei.android.hms.health.health.bf"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 229
    const-string v1, " https://www.huawei.com/health/health.bf"

    .line 231
    :cond_5
    const-string v0, "com.huawei.android.hms.health.health.bf.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 232
    const-string v1, " https://www.huawei.com/health/health.bf.readonly"

    .line 234
    :cond_6
    const-string v0, "\tcom.huawei.android.hms.health.motionpath"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 235
    const-string v1, " https://www.huawei.com/health/motionpath"

    .line 237
    :cond_7
    const-string v0, "com.huawei.android.hms.health.motionpath.readonly"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 238
    const-string v1, " https://www.huawei.com/health/motionpath.readonly"

    .line 240
    :cond_8
    return-object v1
.end method
