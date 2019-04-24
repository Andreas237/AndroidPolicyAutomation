.class public Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ACCESS_TOKEN:Ljava/lang/String; = "access_token"

.field private static final ACCOUNT_NAME:Ljava/lang/String; = "account_name"

.field private static final ACCOUNT_TYPE:Ljava/lang/String; = "account_type"

.field private static final DEVICE_TYPE:Ljava/lang/String; = "device_type"

.field private static final HEALTH_LOGIN_CHANNEL:Ljava/lang/String; = "health_login_channel"

.field private static final IS_LOGINED:Ljava/lang/String; = "is_logined"

.field private static final LOCK_OBJECT:Ljava/lang/Object;

.field private static final LOGIN_DATA:Ljava/lang/String; = "login_data"

.field private static final LOGIN_TYPE:Ljava/lang/String; = "login_type"

.field private static final SESSION_ID:Ljava/lang/String; = "session_id"

.field private static final SEVER_TOKEN:Ljava/lang/String; = "server_token"

.field private static final SITE_ID:Ljava/lang/String; = "site_id"

.field private static final TAG:Ljava/lang/String;

.field private static final USER_ID:Ljava/lang/String; = "user_id"

.field private static mContext:Landroid/content/Context; = null

.field private static mSharedUtil:Lcom/huawei/login/ui/login/util/SharedPreferenceUtil; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mSharedUtil:Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    .line 25
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    .line 27
    const-class v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    .line 53
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->LOCK_OBJECT:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;
    .locals 4

    .line 56
    sget-object v2, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->LOCK_OBJECT:Ljava/lang/Object;

    monitor-enter v2

    .line 57
    :try_start_0
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 58
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    .line 60
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mSharedUtil:Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 61
    new-instance v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    invoke-direct {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;-><init>()V

    sput-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mSharedUtil:Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    .line 63
    :cond_1
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mSharedUtil:Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 64
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public getAccessToken()Ljava/lang/String;
    .locals 4

    .line 255
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 256
    const/16 v1, 0x4e20

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "access_token"

    .line 255
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 258
    return-object v3
.end method

.method public getAccessToken(Lo/dcx;)V
    .locals 2

    .line 262
    const/16 v0, 0x4e20

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "access_token"

    invoke-static {v0, v1, p1}, Lo/dct;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 264
    return-void
.end method

.method public getAccountName()Ljava/lang/String;
    .locals 6

    .line 170
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 171
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    const/4 v0, 0x0

    return-object v0

    .line 174
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 175
    const-string v0, "account_name"

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 176
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAccountName completed !!! accountName is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, ";pid:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    return-object v5
.end method

.method public getAccountType()Ljava/lang/String;
    .locals 5

    .line 292
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getAccountType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x4e20

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "account_type"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 295
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAccountType completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    return-object v4
.end method

.method public getDeviceType()Ljava/lang/String;
    .locals 6

    .line 193
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 194
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    const/4 v0, 0x0

    return-object v0

    .line 197
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 198
    const-string v0, "device_type"

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 199
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceType completed !!! deviceType is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, ";pid:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    return-object v5
.end method

.method public getHealthLoginChannel()I
    .locals 5

    .line 223
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 224
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthLoginChannel completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    const-string v0, "health_login_channel"

    const/4 v1, -0x1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getIsLogined()Z
    .locals 5

    .line 277
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 278
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    const/4 v0, 0x0

    return v0

    .line 281
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 282
    const-string v0, "is_logined"

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public getLoginType()I
    .locals 5

    .line 210
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 211
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLoginType completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    const-string v0, "login_type"

    const/4 v1, -0x1

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public getSessionID()Ljava/lang/String;
    .locals 5

    .line 239
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 240
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    const/4 v0, 0x0

    return-object v0

    .line 243
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 244
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSessionID completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    const-string v0, "session_id"

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSeverToken()Ljava/lang/String;
    .locals 5

    .line 79
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getSeverToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x4e20

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "server_token"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 82
    return-object v4
.end method

.method public getSeverToken(Lo/dcx;)V
    .locals 2

    .line 86
    const/16 v0, 0x4e20

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "server_token"

    invoke-static {v0, v1, p1}, Lo/dct;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 88
    return-void
.end method

.method public getSiteID()I
    .locals 7

    .line 107
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x4e20

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "site_id"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 110
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSiteID() id = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const/4 v0, 0x0

    return v0

    .line 115
    :cond_0
    const/4 v5, 0x0

    .line 117
    const/16 v0, 0xa

    :try_start_0
    invoke-static {v4, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 121
    goto :goto_0

    .line 118
    :catch_0
    move-exception v6

    .line 119
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSiteID() parse int error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "id = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    :goto_0
    return v5
.end method

.method public getUserID()Ljava/lang/String;
    .locals 6

    .line 148
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 149
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    const/4 v0, 0x0

    return-object v0

    .line 152
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 153
    const-string v0, "user_id"

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 154
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userid is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, ";pid:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    return-object v5
.end method

.method public setAccessToken(Ljava/lang/String;Lo/dcx;)V
    .locals 4

    .line 249
    const/16 v0, 0x4e20

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "access_token"

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, p1, v2, p2}, Lo/dct;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 251
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAccessToken completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    return-void
.end method

.method public setAccountName(Ljava/lang/String;)V
    .locals 5

    .line 159
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 160
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    return-void

    .line 163
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 164
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "account_name"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 165
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAccountName completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountName is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    return-void
.end method

.method public setAccountType(Ljava/lang/String;)V
    .locals 4

    .line 286
    const/16 v0, 0x4e20

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "account_type"

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    const/4 v3, 0x0

    invoke-static {v0, v1, p1, v2, v3}, Lo/dct;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 288
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAccountType completed :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    return-void
.end method

.method public setDeviceType(Ljava/lang/String;)V
    .locals 5

    .line 183
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 184
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    return-void

    .line 187
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 188
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "device_type"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 189
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDeviceType completed !!! deviceType is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    return-void
.end method

.method public setHealthLoginChannel(I)V
    .locals 5

    .line 216
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "health_login_channel"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 217
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 218
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "health_login_channel"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 219
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setHealthLoginChannel completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    return-void
.end method

.method public setHuaweiAccountLoginFlag(Ljava/lang/String;Lo/dcx;)V
    .locals 4

    .line 131
    const/16 v0, 0x4e20

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "huawei_account_login_init"

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, p1, v2, p2}, Lo/dct;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 133
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setHuaweiAccountLoginFlag:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-void
.end method

.method public setIsLogined(Z)V
    .locals 5

    .line 267
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 268
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    return-void

    .line 271
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 272
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "is_logined"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 273
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setIsLogined completed !!!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    return-void
.end method

.method public setLoginType(I)V
    .locals 5

    .line 204
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 205
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "login_type"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 206
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setLoginType completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    return-void
.end method

.method public setSessionID(Ljava/lang/String;)V
    .locals 5

    .line 229
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 230
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    return-void

    .line 233
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 234
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "session_id"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 235
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSessionID completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    return-void
.end method

.method public setSeverToken(Ljava/lang/String;Lo/dcx;)V
    .locals 4

    .line 72
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "server_token"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 73
    invoke-static {p1}, Lcom/huawei/login/ui/login/util/LoginCache;->configServerToken(Ljava/lang/String;)V

    .line 74
    const/16 v0, 0x4e20

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "server_token"

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, p1, v2, p2}, Lo/dct;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 76
    return-void
.end method

.method public setSiteID(ILo/dcx;)V
    .locals 5

    .line 96
    const/16 v0, 0x4e20

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "site_id"

    .line 97
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/dcy;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lo/dcy;-><init>(I)V

    .line 96
    invoke-static {v0, v1, v2, v3, p2}, Lo/dct;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 98
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSiteID completed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " site id:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-void
.end method

.method public setUserID(Ljava/lang/String;)V
    .locals 5

    .line 137
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 138
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-void

    .line 141
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "user_id"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 142
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->mContext:Landroid/content/Context;

    const-string v1, "login_data"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 143
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "user_id"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 144
    sget-object v0, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "userid is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    return-void
.end method
