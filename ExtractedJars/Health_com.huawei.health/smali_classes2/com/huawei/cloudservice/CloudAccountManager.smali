.class public Lcom/huawei/cloudservice/CloudAccountManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ACCOUNT_MANAGER_LOGOUT:I = 0x1

.field public static final ACTION_HWID_ACCOUNT_REMOVE:Ljava/lang/String; = "com.huawei.hwid.ACTION_REMOVE_ACCOUNT"

.field public static final FLAG_BIND_ACCOUNT_CARD_VERIFY:I = 0x4

.field public static final FLAG_BIND_CARD_VERIFY:I = 0x3

.field public static final FLAG_IDENTY_CAM_VERIFY:I = 0x2

.field public static final FLAG_REAL_NAME_VERIFY:I = 0x0

.field public static final FLAG_SIMPLE_IDENTY_VERIFY:I = 0x1

.field public static final KEY_ACCOUNT_NAME:Ljava/lang/String; = "accountName"

.field public static final KEY_ACCOUNT_TYPE:Ljava/lang/String; = "accountType"

.field public static final KEY_ACTIVATE_VIP:Ljava/lang/String; = "activateVip"

.field public static final KEY_AIDL:Ljava/lang/String; = "AIDL"

.field public static final KEY_APP_ID_WEB:Ljava/lang/String; = "key_app_id_to_web"

.field public static final KEY_CHECK_SIM_STATUS:Ljava/lang/String; = "check_sim_status"

.field public static final KEY_CHOOSE_WINDOW:Ljava/lang/String; = "chooseWindow"

.field public static final KEY_DEVICEID:Ljava/lang/String; = "deviceId"

.field public static final KEY_DEVICEINFO:Ljava/lang/String; = "deviceInfo"

.field public static final KEY_DEVICE_TYPE:Ljava/lang/String; = "deviceType"

.field public static final KEY_ISO_COUNTRY_CODE:Ljava/lang/String; = "countryIsoCode"

.field public static final KEY_IS_TRANS_NAVIGATION_BAR:Ljava/lang/String; = "isTransNavigationBar"

.field public static final KEY_LOGININFO:Ljava/lang/String; = "userLoginInfo"

.field public static final KEY_LOGIN_CHANNEL:Ljava/lang/String; = "loginChannel"

.field public static final KEY_LOGIN_USERNAME:Ljava/lang/String; = "loginUserName"

.field public static final KEY_NEEDAUTH:Ljava/lang/String; = "needAuth"

.field public static final KEY_REMOVED_ACCOUNT_NAME:Ljava/lang/String; = "removedAccountName"

.field public static final KEY_REQCLIENTTYPE:Ljava/lang/String; = "reqClientType"

.field public static final KEY_REQUESTCODE:Ljava/lang/String; = "requestcode"

.field public static final KEY_RESULT_CODE:Ljava/lang/String; = "result_code"

.field public static final KEY_SCOPE:Ljava/lang/String; = "scope"

.field public static final KEY_SERVICEFLAG:Ljava/lang/String; = "serviceFlag"

.field public static final KEY_SERVICE_COUNTRY_CODE:Ljava/lang/String; = "serviceCountryCode"

.field public static final KEY_SERVICE_TOKEN:Ljava/lang/String; = "serviceToken"

.field public static final KEY_SERVICE_TOKEN_WEB:Ljava/lang/String; = "key_service_token_to_web"

.field public static final KEY_SITEID:Ljava/lang/String; = "siteId"

.field public static final KEY_ST_STATUS:Ljava/lang/String; = "STValidStatus"

.field public static final KEY_SUB_DEVICEID:Ljava/lang/String; = "subDeviceId"

.field public static final KEY_USERACCOUNTINFO:Ljava/lang/String; = "userAccountInfo"

.field public static final KEY_USERID:Ljava/lang/String; = "userId"

.field public static final KEY_USERINFO:Ljava/lang/String; = "userInfo"

.field public static final KEY_USER_ACCOUNT_WEB:Ljava/lang/String; = "key_user_account_to_web"

.field public static final KEY_UUID:Ljava/lang/String; = "uuid"

.field public static final KEY_VERSION_NAME:Ljava/lang/String; = "versionName"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 996
    const/4 v2, 0x0

    .line 997
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 998
    new-instance v0, Ljava/lang/StringBuffer;

    const-string v1, "app_account"

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ".xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 1001
    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    const-string v1, "app_account"

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string v1, ".xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1003
    :goto_0
    return-object v2
.end method

.method public static checkHwIDPassword(Landroid/content/Context;Ljava/lang/String;ZLcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1028
    invoke-static {p0, p1, p2, p3, p4}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V

    .line 1029
    return-void
.end method

.method public static checkIsInstallHuaweiAccount(Landroid/content/Context;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 366
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public static checkPassWord(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 629
    invoke-static/range {p0 .. p6}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V

    .line 630
    return-void
.end method

.method public static checkPasswordByUserId(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 0

    .line 1046
    invoke-static/range {p0 .. p9}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V

    .line 1047
    return-void
.end method

.method public static clearAccountData(Landroid/content/Context;)V
    .locals 0

    .line 501
    invoke-static {p0}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;)V

    .line 502
    return-void
.end method

.method public static deleteAccessToken(Landroid/content/Context;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 982
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 983
    const-string v0, "CloudAccountManager"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 984
    return-void

    .line 986
    :cond_0
    invoke-static {p0}, Lcom/huawei/hwid/core/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;

    move-result-object v0

    const-string v1, "accessToken"

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;)V

    .line 987
    return-void
.end method

.method public static getAccessToken(Landroid/content/Context;)Ljava/lang/String;
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 956
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 957
    const-string v0, "CloudAccountManager"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 958
    const-string v0, ""

    return-object v0

    .line 960
    :cond_0
    invoke-static {p0}, Lcom/huawei/hwid/core/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;

    move-result-object v0

    const-string v1, "accessToken"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwid/core/c/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 962
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 963
    invoke-static {p0, v3}, Lcom/huawei/hwid/core/encrypt/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 965
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 967
    invoke-static {p0, v3}, Lcom/huawei/hwid/core/encrypt/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 969
    :cond_1
    move-object v3, v4

    .line 970
    goto :goto_0

    .line 971
    :cond_2
    const-string v0, "CloudAccountManager"

    const-string v1, "accessToken is null, get accessToken failed"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 973
    :goto_0
    return-object v3
.end method

.method public static getAccountsByType(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 0

    .line 208
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 209
    return-void
.end method

.method public static getCloudAccountByUserID(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/cloudservice/CloudAccount;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 516
    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    return-object v0
.end method

.method public static getCloudAccountByUserID(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 0

    .line 545
    invoke-static {p0, p1, p2}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 546
    return-void
.end method

.method public static getCurrLoginUserName(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 377
    invoke-static {p0}, Lcom/huawei/hwid/api/common/e;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getForgotPwdIntent(Landroid/content/Context;IIZLcom/huawei/cloudservice/IntentResultHandler;)V
    .locals 0

    .line 217
    invoke-static {p0, p1, p2, p3, p4}, Lcom/huawei/hwid/api/common/f;->a(Landroid/content/Context;IIZLcom/huawei/cloudservice/IntentResultHandler;)V

    .line 218
    return-void
.end method

.method public static getHwAccount(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 906
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 907
    const-string v0, "CloudAccountManager"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 908
    const/4 v0, 0x0

    return-object v0

    .line 910
    :cond_0
    invoke-static {p2}, Lcom/huawei/cloudservice/CloudAccountManager;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 911
    const/4 v0, 0x1

    invoke-static {v2, p0, v0}, Lcom/huawei/hwid/b/a/b;->a(Ljava/lang/String;Landroid/content/Context;Z)Ljava/util/ArrayList;

    move-result-object v3

    .line 913
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 914
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 915
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->q()Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    .line 917
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 918
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 919
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-virtual {v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 920
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 922
    :cond_2
    goto :goto_0

    .line 923
    :cond_3
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 924
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->q()Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    .line 926
    :cond_4
    goto :goto_1

    .line 928
    :cond_5
    const-string v0, "CloudAccountManager"

    const-string v1, "there is no account, get account failed"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 930
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getLoginCount(Landroid/content/Context;)J
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 845
    invoke-static {p0}, Lcom/huawei/hwid/api/common/f;->a(Landroid/content/Context;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getPwdVerifyIntent()Landroid/content/Intent;
    .locals 1

    .line 856
    invoke-static {}, Lcom/huawei/hwid/api/common/e;->d()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public static getVerifiedPhoneOrEmail(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 705
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/f;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V

    .line 706
    return-void
.end method

.method public static initial(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 804
    invoke-static {p0, p1, p2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 805
    return-void
.end method

.method public static isSupportFingerprint(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1014
    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result v0

    return v0
.end method

.method public static isThirdAccount(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 644
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->e(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static loginSystemAccount(Landroid/app/Activity;Lcom/huawei/cloudservice/LoginHandler;I)V
    .locals 1

    .line 868
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 869
    :cond_0
    return-void

    .line 871
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lcom/huawei/hwid/api/common/e;->a(Landroid/app/Activity;Lcom/huawei/cloudservice/LoginHandler;ILjava/lang/String;)V

    .line 872
    return-void
.end method

.method public static logout(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LogoutHandler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .line 289
    invoke-static {p0, p1, p2, p3, p4}, Lcom/huawei/hwid/api/common/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LogoutHandler;)V

    .line 290
    return-void
.end method

.method public static logoutHwIDByUserID(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 584
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V

    .line 585
    return-void
.end method

.method public static quickLogin(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 1

    .line 432
    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lcom/huawei/cloudservice/CloudAccountManager;->quickLogin(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 433
    return-void
.end method

.method public static quickLogin(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 0

    .line 488
    invoke-static {p0, p1, p2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 489
    return-void
.end method

.method public static release(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 0

    .line 738
    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 739
    return-void
.end method

.method public static setLogoutIntent(Landroid/content/Context;Landroid/content/Intent;ILcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 0

    .line 353
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Landroid/content/Intent;ILcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 354
    return-void
.end method

.method public static storeAccessToken(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 939
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 940
    const-string v0, "CloudAccountManager"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 941
    return-void

    .line 943
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 944
    invoke-static {p0}, Lcom/huawei/hwid/core/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/c/a;

    move-result-object v0

    const-string v1, "accessToken"

    .line 945
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/encrypt/e;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 944
    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwid/core/c/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 947
    :cond_1
    const-string v0, "CloudAccountManager"

    const-string v1, "accessToken is null, store accessToken failed"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 949
    :goto_0
    return-void
.end method

.method public static storeHwAccount(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwid/core/datatype/HwAccount;Landroid/os/Bundle;)V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 879
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 880
    const-string v0, "CloudAccountManager"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 881
    return-void

    .line 883
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 884
    invoke-virtual {p3, p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 886
    :cond_1
    const-string v0, "CloudAccountManager"

    const-string v1, "hwAccount or appId is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 887
    return-void

    .line 889
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 890
    invoke-interface {v2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 891
    invoke-static {p2}, Lcom/huawei/cloudservice/CloudAccountManager;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 893
    invoke-static {p0, v3}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 895
    const/4 v0, 0x1

    :try_start_0
    invoke-static {p0, v3, v2, v0}, Lcom/huawei/hwid/b/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 898
    goto :goto_1

    .line 896
    :catch_0
    move-exception v4

    .line 897
    const-string v0, "CloudAccountManager"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 899
    :goto_1
    return-void
.end method

.method public static updateHwID(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 0

    .line 831
    invoke-static {p0, p1, p2}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 832
    return-void
.end method
