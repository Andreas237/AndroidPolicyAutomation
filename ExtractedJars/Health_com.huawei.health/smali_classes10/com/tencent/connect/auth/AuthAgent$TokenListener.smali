.class Lcom/tencent/connect/auth/AuthAgent$TokenListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/connect/auth/AuthAgent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "TokenListener"
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/connect/auth/AuthAgent;

.field private final b:Lcom/tencent/tauth/IUiListener;

.field private final c:Z

.field private final d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/auth/AuthAgent;Landroid/content/Context;Lcom/tencent/tauth/IUiListener;ZZ)V
    .locals 2

    .line 92
    iput-object p1, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->a:Lcom/tencent/connect/auth/AuthAgent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    iput-object p2, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->d:Landroid/content/Context;

    .line 94
    iput-object p3, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->b:Lcom/tencent/tauth/IUiListener;

    .line 95
    iput-boolean p4, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->c:Z

    .line 96
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, TokenListener()"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 2

    .line 154
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, TokenListener() onCancel"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->b:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0}, Lcom/tencent/tauth/IUiListener;->onCancel()V

    .line 156
    invoke-static {}, Lcom/tencent/open/a/f;->b()V

    .line 157
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 9

    .line 101
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, TokenListener() onComplete"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    move-object v3, p1

    check-cast v3, Lorg/json/JSONObject;

    .line 104
    const-string v0, "access_token"

    :try_start_0
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 105
    const-string v0, "expires_in"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 106
    const-string v0, "openid"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 107
    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->a:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->a(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz v6, :cond_0

    .line 114
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->a:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->b(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lcom/tencent/connect/auth/QQToken;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->a:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v0}, Lcom/tencent/connect/auth/AuthAgent;->c(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/tencent/connect/auth/QQToken;->setOpenId(Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->a:Lcom/tencent/connect/auth/AuthAgent;

    invoke-static {v1}, Lcom/tencent/connect/auth/AuthAgent;->d(Lcom/tencent/connect/auth/AuthAgent;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/connect/a/a;->d(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V

    .line 121
    :cond_0
    const-string v0, "pf"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v7

    .line 122
    if-eqz v7, :cond_1

    .line 124
    :try_start_1
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->d:Landroid/content/Context;

    const-string v1, "pfStore"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v8

    .line 126
    invoke-interface {v8}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "pf"

    invoke-interface {v0, v1, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 130
    goto :goto_0

    .line 127
    :catch_0
    move-exception v8

    .line 128
    :try_start_2
    invoke-virtual {v8}, Ljava/lang/Exception;->printStackTrace()V

    .line 129
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, TokenListener() onComplete error"

    invoke-static {v0, v1, v8}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->c:Z

    if-eqz v0, :cond_2

    .line 134
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->sync()V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 139
    :cond_2
    goto :goto_1

    .line 136
    :catch_1
    move-exception v4

    .line 137
    invoke-virtual {v4}, Lorg/json/JSONException;->printStackTrace()V

    .line 138
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, TokenListener() onComplete error"

    invoke-static {v0, v1, v4}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 140
    :goto_1
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->b:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, v3}, Lcom/tencent/tauth/IUiListener;->onComplete(Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->a:Lcom/tencent/connect/auth/AuthAgent;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/AuthAgent;->releaseResource()V

    .line 142
    invoke-static {}, Lcom/tencent/open/a/f;->b()V

    .line 143
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 2

    .line 147
    const-string v0, "openSDK_LOG"

    const-string v1, "OpenUi, TokenListener() onError"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lcom/tencent/connect/auth/AuthAgent$TokenListener;->b:Lcom/tencent/tauth/IUiListener;

    invoke-interface {v0, p1}, Lcom/tencent/tauth/IUiListener;->onError(Lcom/tencent/tauth/UiError;)V

    .line 149
    invoke-static {}, Lcom/tencent/open/a/f;->b()V

    .line 150
    return-void
.end method
