.class Lo/eub$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sina/weibo/sdk/auth/WbAuthListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic d:Lo/eub;


# direct methods
.method private constructor <init>(Lo/eub;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lo/eub$e;->d:Lo/eub;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/eub;Lo/eub$1;)V
    .locals 0

    .line 175
    invoke-direct {p0, p1}, Lo/eub$e;-><init>(Lo/eub;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 6

    .line 199
    invoke-static {}, Lo/eub;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    iget-object v0, p0, Lo/eub$e;->d:Lo/eub;

    invoke-static {v0}, Lo/eub;->a(Lo/eub;)Lo/euh;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 202
    invoke-static {}, Lo/eub;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCancel()->mAuthorizeCallback.loginCallback()  start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-object v0, p0, Lo/eub$e;->d:Lo/eub;

    invoke-static {v0}, Lo/eub;->a(Lo/eub;)Lo/euh;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    invoke-interface/range {v0 .. v5}, Lo/euh;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 205
    invoke-static {}, Lo/eub;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCancel()->mAuthorizeCallback.loginCallback()  end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    :cond_0
    return-void
.end method

.method public onFailure(Lcom/sina/weibo/sdk/auth/WbConnectErrorMessage;)V
    .locals 6

    .line 212
    invoke-static {}, Lo/eub;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onWeiboException()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    iget-object v0, p0, Lo/eub$e;->d:Lo/eub;

    invoke-static {v0}, Lo/eub;->a(Lo/eub;)Lo/euh;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    invoke-interface/range {v0 .. v5}, Lo/euh;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 214
    return-void
.end method

.method public onSuccess(Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;)V
    .locals 9

    .line 178
    iget-object v0, p0, Lo/eub$e;->d:Lo/eub;

    invoke-static {v0, p1}, Lo/eub;->b(Lo/eub;Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;)Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;

    .line 180
    iget-object v0, p0, Lo/eub$e;->d:Lo/eub;

    invoke-static {v0}, Lo/eub;->e(Lo/eub;)Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->isSessionValid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lo/eub$e;->d:Lo/eub;

    invoke-static {v0}, Lo/eub;->e(Lo/eub;)Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->getUid()Ljava/lang/String;

    move-result-object v6

    .line 182
    iget-object v0, p0, Lo/eub$e;->d:Lo/eub;

    invoke-static {v0}, Lo/eub;->e(Lo/eub;)Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sina/weibo/sdk/auth/Oauth2AccessToken;->getToken()Ljava/lang/String;

    move-result-object v7

    .line 183
    const-string v8, "sina"

    .line 185
    iget-object v0, p0, Lo/eub$e;->d:Lo/eub;

    iget-object v1, p0, Lo/eub$e;->d:Lo/eub;

    invoke-static {v1}, Lo/eub;->d(Lo/eub;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Lo/eub;->c(Landroid/content/Context;Ljava/lang/String;)Z

    .line 186
    iget-object v0, p0, Lo/eub$e;->d:Lo/eub;

    invoke-static {v0}, Lo/eub;->a(Lo/eub;)Lo/euh;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 188
    invoke-static {}, Lo/eub;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onComplete()->mAuthorizeCallback.loginCallback()  start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lo/eub$e;->d:Lo/eub;

    invoke-static {v0}, Lo/eub;->a(Lo/eub;)Lo/euh;

    move-result-object v0

    move-object v2, v7

    move-object v3, v6

    const-string v4, "sina"

    const/4 v1, 0x0

    const/4 v5, -0x1

    invoke-interface/range {v0 .. v5}, Lo/euh;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 191
    invoke-static {}, Lo/eub;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onComplete()->mAuthorizeCallback.loginCallback()  end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    :cond_0
    return-void
.end method
