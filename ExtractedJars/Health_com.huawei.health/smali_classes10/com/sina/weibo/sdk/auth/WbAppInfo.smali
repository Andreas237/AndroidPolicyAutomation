.class public Lcom/sina/weibo/sdk/auth/WbAppInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private authActivityName:Ljava/lang/String;

.field private packageName:Ljava/lang/String;

.field private supportVersion:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const-string v0, "com.sina.weibo"

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/WbAppInfo;->packageName:Ljava/lang/String;

    .line 15
    const-string v0, "com.sina.weibo.SSOActivity"

    iput-object v0, p0, Lcom/sina/weibo/sdk/auth/WbAppInfo;->authActivityName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAuthActivityName()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/WbAppInfo;->authActivityName:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/WbAppInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getSupportVersion()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/sina/weibo/sdk/auth/WbAppInfo;->supportVersion:I

    return v0
.end method

.method public isLegal()Z
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/sina/weibo/sdk/auth/WbAppInfo;->packageName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/sina/weibo/sdk/auth/WbAppInfo;->supportVersion:I

    if-lez v0, :cond_0

    .line 46
    const/4 v0, 0x1

    return v0

    .line 48
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setAuthActivityName(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/sina/weibo/sdk/auth/WbAppInfo;->authActivityName:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/sina/weibo/sdk/auth/WbAppInfo;->packageName:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public setSupportVersion(I)V
    .locals 0

    .line 41
    iput p1, p0, Lcom/sina/weibo/sdk/auth/WbAppInfo;->supportVersion:I

    .line 42
    return-void
.end method
