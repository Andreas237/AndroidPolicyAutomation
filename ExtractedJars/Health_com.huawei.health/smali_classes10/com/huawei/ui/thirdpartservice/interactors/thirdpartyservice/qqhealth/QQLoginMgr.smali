.class public Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final APPID_HW_ACCOUNT:Ljava/lang/String; = "246EEE3DEB39B92A8A5401AFAFB7A145+St7Toa8/8bYhaXnNQHVSSTd0ad2hguXwKeUK9fBK/g= "

.field public static final HWAPPIDACCOUNT1:Ljava/lang/String; = "246EEE3DEB39B92A8A5"

.field public static final HWAPPIDACCOUNT2:Ljava/lang/String; = "401AFAFB7A145+St7Toa"

.field public static final HWAPPIDACCOUNT3:Ljava/lang/String; = "8/8bYhaXnNQHVSSTd0ad2hguXwKeUK9fBK/g= "

.field private static final TAG:Ljava/lang/String; = "QQLoginMgr"


# instance fields
.field private mAuthorizeCallback:Lo/fjk;

.field private mIAuthorizeCallback:Lo/fjk;

.field private mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lo/fjk;Ljava/lang/String;)V
    .locals 4

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mIAuthorizeCallback:Lo/fjk;

    .line 82
    new-instance v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr$1;-><init>(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mAuthorizeCallback:Lo/fjk;

    .line 29
    iput-object p2, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mIAuthorizeCallback:Lo/fjk;

    .line 30
    new-instance v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    iget-object v1, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mAuthorizeCallback:Lo/fjk;

    invoke-direct {v0, p1, v1, p3}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;-><init>(Landroid/app/Activity;Lo/fjk;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    .line 32
    const-string v0, "QQLoginMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "QQLogin() mIAuthorizeCallback="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mIAuthorizeCallback:Lo/fjk;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mQQLoginManager="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;)Lo/fjk;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mIAuthorizeCallback:Lo/fjk;

    return-object v0
.end method


# virtual methods
.method public getUserName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 63
    const-string v0, "QQLoginMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getUserName mQQLogin="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->getUserName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 67
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public login()V
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 41
    const-string v0, "QQLoginMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->login()V

    .line 44
    :cond_0
    return-void
.end method

.method public logout()V
    .locals 4

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 51
    const-string v0, "QQLoginMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "logout() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->logout()V

    .line 54
    :cond_0
    return-void
.end method

.method public saveQQUserinfo(Landroid/content/Context;)V
    .locals 4

    .line 75
    const-string v0, "QQLoginMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveQQUserinfo mQQLogin="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLoginMgr;->mQQLogin:Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;

    invoke-virtual {v0, p1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQLogin;->saveQQUserinfo(Landroid/content/Context;)V

    .line 79
    :cond_0
    return-void
.end method
