.class public Lcom/huawei/login/ui/login/util/LoginSharePreUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ACCESS_TOKEN:Ljava/lang/String; = "access_token"

.field private static final ACCOUNT_NAME:Ljava/lang/String; = "account_name"

.field private static final APP_ID:Ljava/lang/String; = "app_id"

.field private static final COUNTRY_CODE:Ljava/lang/String; = "country_code"

.field private static final DEVICE_ID:Ljava/lang/String; = "device_id"

.field private static final DEVICE_TYPE:Ljava/lang/String; = "device_type"

.field private static final IS_LOGINED:Ljava/lang/String; = "is_logined"

.field private static final LOCK_OBJECT:Ljava/lang/Object;

.field private static final LOGIN_ACCOUNT_NAME:Ljava/lang/String; = "login_account_name"

.field private static final LOGIN_TYPE:Ljava/lang/String; = "login_type"

.field private static final OTHER_TOKEN:Ljava/lang/String; = "other_token"

.field private static final SESSION_ID:Ljava/lang/String; = "session_id"

.field private static final SEVER_TOKEN:Ljava/lang/String; = "server_token"

.field private static final SITE_ID:Ljava/lang/String; = "site_id"

.field private static final TAG:Ljava/lang/String;

.field private static final USER_ID:Ljava/lang/String; = "user_id"

.field private static final WECHAT_OPENID:Ljava/lang/String; = "wechat_openid"

.field private static final WECHAT_TOKEN:Ljava/lang/String; = "wechat_token"

.field private static mSharedUtil:Lcom/huawei/login/ui/login/util/LoginSharePreUtil; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->mSharedUtil:Lcom/huawei/login/ui/login/util/LoginSharePreUtil;

    .line 18
    const-class v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    .line 54
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->LOCK_OBJECT:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/LoginSharePreUtil;
    .locals 4

    .line 57
    sget-object v2, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->LOCK_OBJECT:Ljava/lang/Object;

    monitor-enter v2

    .line 58
    :try_start_0
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->mSharedUtil:Lcom/huawei/login/ui/login/util/LoginSharePreUtil;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 59
    new-instance v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->mSharedUtil:Lcom/huawei/login/ui/login/util/LoginSharePreUtil;

    .line 61
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->mSharedUtil:Lcom/huawei/login/ui/login/util/LoginSharePreUtil;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 62
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public getAPP_ID()Ljava/lang/String;
    .locals 2

    .line 227
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "app_id"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 4

    .line 245
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAccessToken completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "access_token"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAccountName()Ljava/lang/String;
    .locals 5

    .line 144
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "account_name"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 145
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAccountName completed !!! accountName is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

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

    .line 146
    return-object v4
.end method

.method public getCountryCode()Ljava/lang/String;
    .locals 5

    .line 118
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "country_code"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 119
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCountryCode completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-object v4
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 5

    .line 164
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "device_id"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 165
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceId completed !!! deviceID is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

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

    .line 166
    return-object v4
.end method

.method public getDeviceType()Ljava/lang/String;
    .locals 5

    .line 175
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "device_type"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 176
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceType completed !!! deviceType is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

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
    return-object v4
.end method

.method public getIsLogined()Z
    .locals 3

    .line 255
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "is_logined"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SPUtils;->get(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getLoginAccountName()Ljava/lang/String;
    .locals 2

    .line 214
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "login_account_name"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLoginType()I
    .locals 3

    .line 205
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "site_id"

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SPUtils;->get(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getOtherToken()Ljava/lang/String;
    .locals 2

    .line 218
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "other_token"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSecurityPhone()Ljava/lang/String;
    .locals 3

    .line 154
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "securityPhone"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 155
    return-object v2
.end method

.method public getSessionID()Ljava/lang/String;
    .locals 2

    .line 236
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "session_id"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSeverToken()Ljava/lang/String;
    .locals 5

    .line 75
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getSeverToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "server_token"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 77
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSeverToken completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    return-object v4
.end method

.method public getSiteID()I
    .locals 4

    .line 97
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "site_id"

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SPUtils;->get(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 98
    return v3
.end method

.method public getUserID()Ljava/lang/String;
    .locals 5

    .line 131
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "user_id"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 132
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserID completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userid is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-object v4
.end method

.method public getWeChatOpenID()Ljava/lang/String;
    .locals 2

    .line 196
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wechat_openid"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getWeChatToken()Ljava/lang/String;
    .locals 2

    .line 187
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wechat_token"

    invoke-static {v0, v1}, Lcom/huawei/login/ui/login/util/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setAccessToken(Ljava/lang/String;Lo/dcx;)V
    .locals 4

    .line 240
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "access_token"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAccessToken completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    return-void
.end method

.method public setAccountName(Ljava/lang/String;)V
    .locals 4

    .line 138
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "account_name"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAccountName completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountName is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    return-void
.end method

.method public setApp_id(Ljava/lang/String;)V
    .locals 4

    .line 222
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "app_id"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set APP_ID completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    return-void
.end method

.method public setCountryCode(Ljava/lang/String;Lo/dcx;)V
    .locals 4

    .line 108
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "country_code"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setCountryCode completed, country is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return-void
.end method

.method public setDeviceId(Ljava/lang/String;)V
    .locals 4

    .line 159
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "device_id"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDeviceId completed !!! deviceId is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    return-void
.end method

.method public setDeviceType(Ljava/lang/String;)V
    .locals 4

    .line 170
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "device_type"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDeviceType completed !!! deviceType is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    return-void
.end method

.method public setIsLogined(Z)V
    .locals 4

    .line 250
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "is_logined"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SPUtils;->put(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 251
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

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

    .line 252
    return-void
.end method

.method public setLoginAccountName(Ljava/lang/String;)V
    .locals 4

    .line 209
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "login_account_name"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setLoginType completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    return-void
.end method

.method public setLoginType(I)V
    .locals 4

    .line 200
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "login_type"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SPUtils;->put(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 201
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setLoginType completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    return-void
.end method

.method public setSecurityPhone(Ljava/lang/String;)V
    .locals 2

    .line 150
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "securityPhone"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    return-void
.end method

.method public setSessionID(Ljava/lang/String;)V
    .locals 4

    .line 231
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "session_id"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSessionID completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    return-void
.end method

.method public setSeverToken(Ljava/lang/String;Lo/dcx;)V
    .locals 4

    .line 70
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "server_token"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSeverToken completed :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    return-void
.end method

.method public setSiteID(I)V
    .locals 4

    .line 87
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "site_id"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SPUtils;->put(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 88
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSiteID completed sync, site id:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    return-void
.end method

.method public setUserID(Ljava/lang/String;)V
    .locals 4

    .line 125
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "user_id"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserID completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userid is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    return-void
.end method

.method public setWeChatOpenID(Ljava/lang/String;)V
    .locals 4

    .line 191
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wechat_openid"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wechatOpenID is completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    return-void
.end method

.method public setWeChatToken(Ljava/lang/String;)V
    .locals 4

    .line 182
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wechat_token"

    invoke-static {v0, v1, p1}, Lcom/huawei/login/ui/login/util/SPUtils;->putString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    sget-object v0, Lcom/huawei/login/ui/login/util/LoginSharePreUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setWeChat is completed !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    return-void
.end method
