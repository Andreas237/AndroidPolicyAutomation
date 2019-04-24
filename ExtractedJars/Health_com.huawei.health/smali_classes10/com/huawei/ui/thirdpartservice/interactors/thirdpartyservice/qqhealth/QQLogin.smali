.class public Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "QQLogin"


# instance fields
.field private mAccess_token:Ljava/lang/String;

.field private mAuthorizeHuawei:Lo/fjk;

.field private mContext:Landroid/app/Activity;

.field private mExpires_in:Ljava/lang/String;

.field private mNickname:Ljava/lang/String;

.field private mOpenid:Ljava/lang/String;

.field private mTencent:Lcom/tencent/tauth/Tencent;

.field private mUserlogoPath:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lo/fjk;Ljava/lang/String;)V
    .locals 4

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mOpenid:Ljava/lang/String;

    .line 44
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mAccess_token:Ljava/lang/String;

    .line 45
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mExpires_in:Ljava/lang/String;

    .line 46
    const-string v0, " "

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mNickname:Ljava/lang/String;

    .line 47
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mUserlogoPath:Ljava/lang/String;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mAuthorizeHuawei:Lo/fjk;

    .line 55
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mContext:Landroid/app/Activity;

    .line 56
    iput-object p2, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mAuthorizeHuawei:Lo/fjk;

    .line 57
    invoke-static {p3, p1}, Lcom/tencent/tauth/Tencent;->createInstance(Ljava/lang/String;Landroid/content/Context;)Lcom/tencent/tauth/Tencent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mTencent:Lcom/tencent/tauth/Tencent;

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mTencent:Lcom/tencent/tauth/Tencent;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 60
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QQLogin() get Tencent success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mAuthorizeHuawei:Lo/fjk;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/fjk;->initCallback(Z)V

    goto :goto_0

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mAuthorizeHuawei:Lo/fjk;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/fjk;->initCallback(Z)V

    .line 65
    :goto_0
    return-void
.end method

.method static synthetic access$100(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mOpenid:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$102(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mOpenid:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$200(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mAccess_token:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$202(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mAccess_token:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$300(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mExpires_in:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$302(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mExpires_in:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$400(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Lo/fjk;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mAuthorizeHuawei:Lo/fjk;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mNickname:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$502(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mNickname:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$602(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mUserlogoPath:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public getUserName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 134
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getUserName"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 142
    new-instance v5, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mTencent:Lcom/tencent/tauth/Tencent;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 145
    new-instance v6, Lcom/tencent/connect/UserInfo;

    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mTencent:Lcom/tencent/tauth/Tencent;

    invoke-virtual {v0}, Lcom/tencent/tauth/Tencent;->getQQToken()Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-direct {v6, p1, v0}, Lcom/tencent/connect/UserInfo;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    .line 147
    new-instance v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$1;

    invoke-direct {v0, p0, v5, v4}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$1;-><init>(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;Ljava/util/concurrent/CountDownLatch;Ljava/lang/StringBuffer;)V

    invoke-virtual {v6, v0}, Lcom/tencent/connect/UserInfo;->getUserInfo(Lcom/tencent/tauth/IUiListener;)V

    .line 180
    :try_start_0
    invoke-virtual {v5}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    goto :goto_0

    .line 181
    :catch_0
    move-exception v7

    .line 182
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    :cond_0
    :goto_0
    move-object v6, p2

    .line 187
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 188
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6

    .line 190
    :cond_1
    return-object v6
.end method

.method public initOpenidAndToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 200
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initQQSDK()  enter. mTencent="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mTencent:Lcom/tencent/tauth/Tencent;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mOpenid:Ljava/lang/String;

    .line 202
    iput-object p2, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mAccess_token:Ljava/lang/String;

    .line 203
    iput-object p3, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mExpires_in:Ljava/lang/String;

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mTencent:Lcom/tencent/tauth/Tencent;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mTencent:Lcom/tencent/tauth/Tencent;

    invoke-virtual {v0, p2, p3}, Lcom/tencent/tauth/Tencent;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mTencent:Lcom/tencent/tauth/Tencent;

    invoke-virtual {v0, p1}, Lcom/tencent/tauth/Tencent;->setOpenId(Ljava/lang/String;)V

    .line 208
    :cond_0
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initQQSDK()  leave."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    return-void
.end method

.method public login()V
    .locals 5

    .line 71
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login()  enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    new-instance v4, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$BaseUiListener;-><init>(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin$1;)V

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mTencent:Lcom/tencent/tauth/Tencent;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mContext:Landroid/app/Activity;

    const-string v2, "all"

    invoke-virtual {v0, v1, v2, v4}, Lcom/tencent/tauth/Tencent;->login(Landroid/app/Activity;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)I

    .line 75
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login()  leave."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    return-void
.end method

.method public logout()V
    .locals 4

    .line 82
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "logout()  enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mTencent:Lcom/tencent/tauth/Tencent;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mContext:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/tencent/tauth/Tencent;->logout(Landroid/content/Context;)V

    .line 85
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "logout()  leave."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    return-void
.end method

.method public saveQQUserinfo(Landroid/content/Context;)V
    .locals 6

    .line 216
    new-instance v4, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;

    invoke-direct {v4}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;-><init>()V

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mOpenid:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->setOpenId(Ljava/lang/String;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mAccess_token:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->setToken(Ljava/lang/String;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mExpires_in:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->setExpiresIn(Ljava/lang/String;)V

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mNickname:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->setNickName(Ljava/lang/String;)V

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->mUserlogoPath:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->setQqLogoPath(Ljava/lang/String;)V

    .line 223
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "insert qqHealthTable="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    new-instance v5, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;

    invoke-direct {v5, p1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;-><init>(Landroid/content/Context;)V

    .line 226
    invoke-virtual {v5}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;->delete()I

    .line 227
    invoke-virtual {v5, v4}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;->insert(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;)J

    .line 228
    const-string v0, "QQLogin"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveQQUserInfo()  leave."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    return-void
.end method
