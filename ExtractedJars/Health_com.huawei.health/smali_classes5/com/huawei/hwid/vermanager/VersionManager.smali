.class public final Lcom/huawei/hwid/vermanager/VersionManager;
.super Lcom/huawei/hwid/vermanager/d;
.source "SourceFile"


# static fields
.field private static C:Lcom/huawei/hwid/vermanager/VersionManager;


# instance fields
.field private D:Lorg/apache/http/client/HttpClient;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/huawei/hwid/vermanager/d;-><init>()V

    .line 35
    invoke-direct {p0}, Lcom/huawei/hwid/vermanager/VersionManager;->f()V

    .line 36
    return-void
.end method

.method public static declared-synchronized e()Lcom/huawei/hwid/vermanager/VersionManager;
    .locals 4

    const-class v2, Lcom/huawei/hwid/vermanager/VersionManager;

    monitor-enter v2

    .line 28
    :try_start_0
    sget-object v0, Lcom/huawei/hwid/vermanager/VersionManager;->C:Lcom/huawei/hwid/vermanager/VersionManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 29
    new-instance v0, Lcom/huawei/hwid/vermanager/VersionManager;

    invoke-direct {v0}, Lcom/huawei/hwid/vermanager/VersionManager;-><init>()V

    sput-object v0, Lcom/huawei/hwid/vermanager/VersionManager;->C:Lcom/huawei/hwid/vermanager/VersionManager;

    .line 31
    :cond_0
    sget-object v0, Lcom/huawei/hwid/vermanager/VersionManager;->C:Lcom/huawei/hwid/vermanager/VersionManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private f()V
    .locals 2

    .line 39
    const-string v0, "http://setting{0}.hicloud.com:8080/AccountServer"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->a:Ljava/lang/String;

    .line 40
    const-string v0, "https://setting{0}.hicloud.com:443/AccountServer"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->b:Ljava/lang/String;

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/hwid/vermanager/VersionManager;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/IUserInfoMng/updateHeadPic?Version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "12000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->c:Ljava/lang/String;

    .line 44
    const-string v0, "https://setting.hicloud.com/AccountServer/globalSiteCountryList.xml?Version=12000"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->d:Ljava/lang/String;

    .line 50
    const-string v0, "https://hwid{0}.vmall.com:443/CAS/mobile/delUser.html?"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->j:Ljava/lang/String;

    .line 52
    const-string v0, "https://login.vmall.com/oauth2/authorize"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->k:Ljava/lang/String;

    .line 53
    const-string v0, "https://api.vmall.com/rest.php"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->l:Ljava/lang/String;

    .line 54
    const-string v0, "https://login.vmall.com/oauth2/oob#"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->m:Ljava/lang/String;

    .line 56
    const-string v0, "https://login.vmall.com/oauth2/v2/"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->o:Ljava/lang/String;

    .line 57
    const-string v0, "https://login.vmall.com/oauth2/v2/authorize"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->n:Ljava/lang/String;

    .line 58
    const-string v0, "https://login.vmall.com/connect/v2/logout"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->p:Ljava/lang/String;

    .line 60
    const-string v0, "http://oobe.vmall.com/"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->q:Ljava/lang/String;

    .line 61
    const-string v0, "https://hwid1.vmall.com/oauth2/portal/stHideLogin.jsp"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->r:Ljava/lang/String;

    .line 62
    const-string v0, "https://hwid1.vmall.com/oauth2/web/wapBindPhoneNumber.jsp"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->s:Ljava/lang/String;

    .line 63
    const-string v0, "https://hwid1.vmall.com/oauth2/mobile/login.jsp"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->t:Ljava/lang/String;

    .line 64
    const-string v0, "wapBindPhoneNumberTip.jsp?"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->u:Ljava/lang/String;

    .line 67
    const-string v0, "https://query.hicloud.com/hwid/v2/CheckEx.action"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->w:Ljava/lang/String;

    .line 70
    const-string v0, "209207"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->v:Ljava/lang/String;

    .line 71
    const-string v0, "https://hwid{0}.vmall.com"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->B:Ljava/lang/String;

    .line 72
    const-string v0, "/CAS/mobile/standard/wapLogin.html"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->z:Ljava/lang/String;

    .line 73
    const-string v0, "/CAS/portal/userCenter/index.html"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->A:Ljava/lang/String;

    .line 74
    const-string v0, "/CAS/mobile/stLogin.html"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->x:Ljava/lang/String;

    .line 75
    const-string v0, "/CAS/mobile/standard/resetPwd/forgetbyid.html"

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->y:Ljava/lang/String;

    .line 76
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)Ljava/lang/String;
    .locals 3

    .line 164
    iget-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->B:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/huawei/hwid/vermanager/VersionManager;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/vermanager/VersionManager;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Context;II)Lorg/apache/http/client/HttpClient;
    .locals 3

    .line 145
    const-string v0, "ReleaseVersionManager"

    const-string v1, "getSafeHttpClient"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-static {p1}, Lcom/huawei/hwid/core/b/b/b;->a(Landroid/content/Context;)Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    iput-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->D:Lorg/apache/http/client/HttpClient;

    .line 154
    iget-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->D:Lorg/apache/http/client/HttpClient;

    return-object v0
.end method

.method public a(Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 0

    .line 188
    invoke-static {p1}, Lcom/huawei/hwid/vermanager/e;->a(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 189
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)Ljava/lang/String;
    .locals 3

    .line 176
    iget-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->B:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/huawei/hwid/vermanager/VersionManager;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/vermanager/VersionManager;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c(I)Ljava/lang/String;
    .locals 3

    .line 182
    iget-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->B:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/huawei/hwid/vermanager/VersionManager;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/vermanager/VersionManager;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 3

    .line 170
    iget-object v0, p0, Lcom/huawei/hwid/vermanager/VersionManager;->B:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hwid/vermanager/VersionManager;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/vermanager/VersionManager;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
