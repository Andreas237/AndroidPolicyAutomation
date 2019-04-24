.class public Lcom/huawei/hwCloudJs/service/hms/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwCloudJs/service/hms/b$b;,
        Lcom/huawei/hwCloudJs/service/hms/b$a;,
        Lcom/huawei/hwCloudJs/service/hms/b$d;,
        Lcom/huawei/hwCloudJs/service/hms/b$c;
    }
.end annotation


# static fields
.field public static final a:I = 0x232b

.field public static final b:I = 0x1

.field private static final c:Ljava/lang/String; = "HmsCoreApiHelper"

.field private static final d:I = 0x232c


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/hms/support/api/hwid/SignInResult;Z)Ljava/lang/String;
    .locals 4

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    if-eqz p1, :cond_0

    const-string v0, "serverAuthCode"

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/hms/support/api/hwid/SignInResult;->getSignInHuaweiId()Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->getServerAuthCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    const-string v0, "openId"

    invoke-virtual {p0}, Lcom/huawei/hms/support/api/hwid/SignInResult;->getSignInHuaweiId()Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->getOpenId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "accessToken"

    invoke-virtual {p0}, Lcom/huawei/hms/support/api/hwid/SignInResult;->getSignInHuaweiId()Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "displayName"

    invoke-virtual {p0}, Lcom/huawei/hms/support/api/hwid/SignInResult;->getSignInHuaweiId()Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "photoUrl"

    invoke-virtual {p0}, Lcom/huawei/hms/support/api/hwid/SignInResult;->getSignInHuaweiId()Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->getPhotoUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "HmsCoreApiHelper"

    const-string v1, "signInRes2Json put json error"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Lcom/huawei/hwCloudJs/core/JsCallback;)V
    .locals 3

    invoke-static {}, Lcom/huawei/hwCloudJs/service/hms/a;->a()Lcom/huawei/hwCloudJs/service/hms/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwCloudJs/service/hms/b$a;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hwCloudJs/service/hms/b$a;-><init>(Ljava/lang/String;Lcom/huawei/hwCloudJs/core/JsCallback;)V

    const/16 v2, 0x232b

    invoke-virtual {v0, v2, v1}, Lcom/huawei/hwCloudJs/service/hms/a;->a(ILcom/huawei/hwCloudJs/service/hms/a$c;)V

    return-void
.end method

.method public static a(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lorg/json/JSONObject;Lcom/huawei/hwCloudJs/core/JsCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/ref/WeakReference<Lcom/huawei/hms/api/HuaweiApiClient;>;Ljava/lang/String;Lorg/json/JSONObject;Lcom/huawei/hwCloudJs/core/JsCallback;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hms/api/HuaweiApiClient;

    if-nez v3, :cond_0

    invoke-virtual {p3}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure()V

    return-void

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/hms/f;->a(I)Lcom/huawei/hwCloudJs/service/hms/e;

    move-result-object v4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v4, p2, v0}, Lcom/huawei/hwCloudJs/service/hms/e;->a(Lorg/json/JSONObject;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v5

    move-object v0, v3

    check-cast v0, Lcom/huawei/hms/api/HuaweiApiClientImpl;

    new-instance v1, Lcom/huawei/hwCloudJs/service/hms/b$d;

    invoke-direct {v1, p0, p3}, Lcom/huawei/hwCloudJs/service/hms/b$d;-><init>(Ljava/lang/ref/WeakReference;Lcom/huawei/hwCloudJs/core/JsCallback;)V

    const/4 v2, 0x2

    invoke-virtual {v0, v5, p1, v2, v1}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->asyncRequest(Landroid/os/Bundle;Ljava/lang/String;ILcom/huawei/hms/support/api/client/ResultCallback;)I

    return-void
.end method

.method public static a(Ljava/util/List;Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/Scope;>;Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/Scope;>;)Z"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hms/support/api/entity/auth/Scope;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/hms/support/api/entity/auth/Scope;->getScopeUri()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Lcom/huawei/hms/support/api/entity/auth/Scope;->getScopeUri()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    goto :goto_0

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hms/support/api/entity/auth/Scope;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/huawei/hms/support/api/entity/auth/Scope;->getScopeUri()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v4}, Lcom/huawei/hms/support/api/entity/auth/Scope;->getScopeUri()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    goto :goto_1

    :cond_3
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
