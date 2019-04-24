.class public Lo/eub;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eub$d;,
        Lo/eub$e;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private a:Lo/euh;

.field private c:Landroid/content/Context;

.field private d:Lcom/sina/weibo/sdk/auth/sso/SsoHandler;

.field private e:Lcom/sina/weibo/sdk/auth/AuthInfo;

.field private f:Lo/eub$d;

.field private h:Lcom/sina/weibo/sdk/auth/WbAuthListener;

.field private i:Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const-class v0, Lo/eub;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/eub;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lo/euh;)V
    .locals 10

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eub;->c:Landroid/content/Context;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eub;->a:Lo/euh;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eub;->e:Lcom/sina/weibo/sdk/auth/AuthInfo;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eub;->d:Lcom/sina/weibo/sdk/auth/sso/SsoHandler;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eub;->h:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eub;->f:Lo/eub$d;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eub;->i:Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;

    .line 50
    if-nez p1, :cond_0

    .line 51
    return-void

    .line 52
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eub;->c:Landroid/content/Context;

    .line 53
    iget-object v0, p0, Lo/eub;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 54
    iput-object p2, p0, Lo/eub;->a:Lo/euh;

    .line 55
    const-string v0, "com.huawei.health"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0xe

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v5

    .line 57
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x3f6

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v6

    .line 58
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x7de

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v7

    .line 59
    const/4 v8, 0x0

    .line 61
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/huawei/whitebox/e;->b([B)[B

    move-result-object v1

    const-string v2, "utf-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v8, v0

    .line 64
    goto :goto_0

    .line 62
    :catch_0
    move-exception v9

    .line 63
    sget-object v0, Lo/eub;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    :goto_0
    new-instance v0, Lcom/sina/weibo/sdk/auth/AuthInfo;

    const-string v1, "https://api.weibo.com/oauth2/default.html"

    const-string v2, ""

    invoke-direct {v0, p1, v8, v1, v2}, Lcom/sina/weibo/sdk/auth/AuthInfo;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/eub;->e:Lcom/sina/weibo/sdk/auth/AuthInfo;

    .line 66
    goto/16 :goto_2

    .line 67
    :cond_1
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0xf

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v5

    .line 68
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x3f7

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v6

    .line 69
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0x7df

    invoke-virtual {v0, v1, v2}, Lcom/huawei/whitebox/e;->a(II)Ljava/lang/String;

    move-result-object v7

    .line 70
    const/4 v8, 0x0

    .line 72
    :try_start_1
    new-instance v0, Ljava/lang/String;

    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/huawei/whitebox/e;->b([B)[B

    move-result-object v1

    const-string v2, "utf-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v8, v0

    .line 75
    goto :goto_1

    .line 73
    :catch_1
    move-exception v9

    .line 74
    sget-object v0, Lo/eub;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    :goto_1
    new-instance v0, Lcom/sina/weibo/sdk/auth/AuthInfo;

    const-string v1, "https://api.weibo.com/oauth2/default.html"

    const-string v2, ""

    invoke-direct {v0, p1, v8, v1, v2}, Lcom/sina/weibo/sdk/auth/AuthInfo;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/eub;->e:Lcom/sina/weibo/sdk/auth/AuthInfo;

    .line 78
    :goto_2
    iget-object v0, p0, Lo/eub;->e:Lcom/sina/weibo/sdk/auth/AuthInfo;

    invoke-static {p1, v0}, Lcom/sina/weibo/sdk/WbSdk;->install(Landroid/content/Context;Lcom/sina/weibo/sdk/auth/AuthInfo;)V

    .line 79
    new-instance v0, Lcom/sina/weibo/sdk/auth/sso/SsoHandler;

    invoke-direct {v0, p1}, Lcom/sina/weibo/sdk/auth/sso/SsoHandler;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lo/eub;->d:Lcom/sina/weibo/sdk/auth/sso/SsoHandler;

    .line 80
    new-instance v0, Lo/eub$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/eub$e;-><init>(Lo/eub;Lo/eub$1;)V

    iput-object v0, p0, Lo/eub;->h:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    .line 81
    new-instance v0, Lo/eub$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/eub$d;-><init>(Lo/eub;Lo/eub$1;)V

    iput-object v0, p0, Lo/eub;->f:Lo/eub$d;

    .line 83
    sget-object v0, Lo/eub;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Sinaweibo() mWeiboAuth="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eub;->e:Lcom/sina/weibo/sdk/auth/AuthInfo;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    iget-object v0, p0, Lo/eub;->a:Lo/euh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 85
    iget-object v0, p0, Lo/eub;->a:Lo/euh;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/euh;->a(Z)V

    .line 87
    :cond_2
    return-void
.end method

.method static synthetic a(Lo/eub;)Lo/euh;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/eub;->a:Lo/euh;

    return-object v0
.end method

.method static synthetic b(Lo/eub;Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;)Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;
    .locals 0

    .line 31
    iput-object p1, p0, Lo/eub;->i:Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;

    return-object p1
.end method

.method static synthetic d(Lo/eub;)Landroid/content/Context;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/eub;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 31
    sget-object v0, Lo/eub;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lo/eub;)Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/eub;->i:Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;

    return-object v0
.end method


# virtual methods
.method public b(IILandroid/content/Intent;)V
    .locals 4

    .line 164
    sget-object v0, Lo/eub;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult()  enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget-object v0, p0, Lo/eub;->d:Lcom/sina/weibo/sdk/auth/sso/SsoHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 167
    sget-object v0, Lo/eub;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult()->mSsoHandler.authorizeCallBack()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    iget-object v0, p0, Lo/eub;->d:Lcom/sina/weibo/sdk/auth/sso/SsoHandler;

    invoke-virtual {v0, p1, p2, p3}, Lcom/sina/weibo/sdk/auth/sso/SsoHandler;->authorizeCallBack(IILandroid/content/Intent;)V

    goto :goto_0

    .line 171
    :cond_0
    sget-object v0, Lo/eub;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult() error mSsoHandler=null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :goto_0
    return-void
.end method

.method public c()V
    .locals 4

    .line 91
    sget-object v0, Lo/eub;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    iget-object v0, p0, Lo/eub;->d:Lcom/sina/weibo/sdk/auth/sso/SsoHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/eub;->h:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 95
    sget-object v0, Lo/eub;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() authorize()  start."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lo/eub;->d:Lcom/sina/weibo/sdk/auth/sso/SsoHandler;

    iget-object v1, p0, Lo/eub;->h:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    invoke-virtual {v0, v1}, Lcom/sina/weibo/sdk/auth/sso/SsoHandler;->authorize(Lcom/sina/weibo/sdk/auth/WbAuthListener;)V

    .line 98
    sget-object v0, Lo/eub;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() authorize()  end."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 101
    :cond_0
    sget-object v0, Lo/eub;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "login() error! mSsoHandler="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eub;->d:Lcom/sina/weibo/sdk/auth/sso/SsoHandler;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mAuthListener="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eub;->h:Lcom/sina/weibo/sdk/auth/WbAuthListener;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    :goto_0
    sget-object v0, Lo/eub;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() leave."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    return-void
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 5

    .line 144
    const-string v0, "sinaweibo_login_manager"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 146
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "sinaweibo_token"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 147
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v4

    .line 148
    return v4
.end method
