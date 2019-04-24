.class public Lcom/huawei/hwid/api/common/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "InlinedApi"
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;)J
    .locals 2

    .line 257
    invoke-static {p0}, Lcom/huawei/hwid/api/common/apkimpl/a;->b(Landroid/content/Context;)J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic a(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 1

    .line 30
    invoke-static {p0}, Lcom/huawei/hwid/api/common/f;->c(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;IIZLcom/huawei/cloudservice/IntentResultHandler;)V
    .locals 3

    .line 261
    if-nez p4, :cond_0

    .line 262
    const-string v0, "CloudAccountImpl2"

    const-string v1, "handler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    return-void

    .line 266
    :cond_0
    if-nez p0, :cond_1

    .line 267
    const-string v0, "CloudAccountImpl2"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "context is null"

    const/16 v1, 0xc

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 269
    invoke-interface {p4, v2}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 270
    return-void

    .line 273
    :cond_1
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 274
    const-string v0, "CloudAccountImpl2"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 276
    invoke-interface {p4, v2}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 277
    return-void

    .line 280
    :cond_2
    const v0, 0x13a59d4

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 281
    const-string v0, "CloudAccountImpl2"

    const-string v1, "hwid version is low"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is low version"

    const/16 v1, 0x23

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 283
    invoke-interface {p4, v2}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 284
    return-void

    .line 286
    :cond_3
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 287
    const-string v0, "CloudAccountImpl2"

    const-string v1, "no network"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "no network"

    const/4 v1, 0x5

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 289
    invoke-interface {p4, v2}, Lcom/huawei/cloudservice/IntentResultHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 290
    return-void

    .line 292
    :cond_4
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 293
    const-string v0, "loginChannel"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 294
    const-string v0, "reqClientType"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 295
    const-string v0, "isOOBE"

    invoke-virtual {v2, v0, p3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 296
    const-string v0, "ForgotPwdIntent"

    const-string v1, ""

    invoke-static {p0, v0, v1, v2, p4}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/IntentResultHandler;)V

    .line 297
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 4

    .line 43
    invoke-static {p0, p2}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 44
    const-string v0, "CloudAccountImpl2"

    const-string v1, "checkHwIDPassword: context or cloudRequestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    return-void

    .line 47
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 48
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "the param is invalid"

    const/16 v2, 0xc

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, v0}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 49
    const-string v0, "CloudAccountImpl2"

    const-string v1, "userId is empty"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    return-void

    .line 52
    :cond_1
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 53
    const-string v0, "CloudAccountImpl2"

    const-string v1, "checkIsUseHuaweiAccount false"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x21

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 55
    invoke-interface {p2, v3}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 56
    return-void

    .line 58
    :cond_2
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 59
    const-string v0, "CloudAccountImpl2"

    const-string v1, "hwid is not install"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    new-instance v3, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v3, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 61
    invoke-interface {p2, v3}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 62
    return-void

    .line 66
    :cond_3
    invoke-static {p0, p1}, Lcom/huawei/hwid/api/common/e;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v3

    .line 67
    const/4 v0, 0x0

    if-ne v0, v3, :cond_4

    .line 68
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, "the param is invalid"

    const/16 v2, 0xc

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, v0}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 69
    const-string v0, "CloudAccountImpl2"

    const-string v1, "userId is error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    return-void

    .line 73
    :cond_4
    invoke-static {p0, p1, p2, p3, v3}, Lcom/huawei/hwid/api/common/f;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudAccount;)V

    .line 74
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudAccount;)V
    .locals 6

    .line 88
    move-object v1, p2

    .line 89
    move-object v2, p0

    .line 90
    move-object v3, p1

    .line 91
    move-object v4, p3

    .line 94
    const-string v5, "0001"

    .line 95
    new-instance v0, Lcom/huawei/hwid/api/common/f$1;

    invoke-direct {v0, v4, v1, v2, v3}, Lcom/huawei/hwid/api/common/f$1;-><init>(Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p4, p0, v5, v0}, Lcom/huawei/cloudservice/CloudAccount;->getUserInfo(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 139
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LogoutHandler;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .line 208
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 209
    const-string v0, "CloudAccountImpl2"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "this interface can not be called in main thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 213
    :cond_0
    if-nez p4, :cond_1

    .line 214
    const-string v0, "CloudAccountImpl2"

    const-string v1, "handler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    return-void

    .line 218
    :cond_1
    if-nez p0, :cond_2

    .line 219
    const-string v0, "CloudAccountImpl2"

    const-string v1, "getAccountsByType: context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "context is null"

    const/16 v1, 0xc

    invoke-direct {v6, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 221
    invoke-interface {p4, v6}, Lcom/huawei/cloudservice/LogoutHandler;->onFail(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 222
    return-void

    .line 225
    :cond_2
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 226
    const-string v0, "CloudAccountImpl2"

    const-string v1, "can not use hwid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "can not use hwid"

    const/16 v1, 0x21

    invoke-direct {v6, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 228
    invoke-interface {p4, v6}, Lcom/huawei/cloudservice/LogoutHandler;->onFail(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 229
    return-void

    .line 231
    :cond_3
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 232
    const-string v0, "CloudAccountImpl2"

    const-string v1, "hwid is not exit"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid is not exit"

    const/16 v1, 0x22

    invoke-direct {v6, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 234
    invoke-interface {p4, v6}, Lcom/huawei/cloudservice/LogoutHandler;->onFail(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 235
    return-void

    .line 237
    :cond_4
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->d(Landroid/content/Context;)I

    move-result v6

    .line 239
    const v0, 0x138d9d8

    if-gt v6, v0, :cond_5

    .line 240
    const-string v0, "CloudAccountImpl2"

    const-string v1, "hwid verson not support logout interface"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    new-instance v7, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid apk version not support logout interface"

    const/16 v1, 0x23

    invoke-direct {v7, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 242
    invoke-interface {p4, v7}, Lcom/huawei/cloudservice/LogoutHandler;->onFail(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 243
    return-void

    .line 245
    :cond_5
    invoke-static {p0}, Lcom/huawei/hwid/api/common/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/api/common/a;

    move-result-object v7

    .line 246
    const/4 v0, 0x0

    if-ne v0, v7, :cond_6

    .line 247
    new-instance v8, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "null == manager"

    const/16 v1, 0x28

    invoke-direct {v8, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 248
    invoke-interface {p4, v8}, Lcom/huawei/cloudservice/LogoutHandler;->onFail(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 249
    const-string v0, "CloudAccountImpl2"

    const-string v1, "manager is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    return-void

    .line 252
    :cond_6
    new-instance v0, Lcom/huawei/hwid/api/common/m;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwid/api/common/m;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LogoutHandler;)V

    move-object v8, v0

    .line 253
    invoke-virtual {v7, v8}, Lcom/huawei/hwid/api/common/a;->a(Lcom/huawei/hwid/api/common/b;)V

    .line 254
    return-void
.end method

.method static synthetic b(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 1

    .line 30
    invoke-static {p0}, Lcom/huawei/hwid/api/common/f;->d(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 0

    .line 30
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/f;->c(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V

    return-void
.end method

.method private static c(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/UserAccountInfo;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 142
    const-string v2, ""

    .line 143
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 144
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    .line 145
    const-string v0, "6"

    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getAccountType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "1"

    .line 146
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getAccountState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getUserAccount()Ljava/lang/String;

    move-result-object v2

    .line 148
    const-string v0, "CloudAccountImpl2"

    const-string v1, "VerifiedPhone "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    :cond_0
    goto :goto_0

    .line 152
    :cond_1
    return-object v2
.end method

.method private static c(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V
    .locals 6

    .line 170
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/d/b;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v2

    .line 171
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 172
    const/16 v3, 0xd

    .line 173
    const-string v4, "no account by userId"

    .line 174
    new-instance v5, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-direct {v5, v3, v4}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 175
    invoke-interface {p2, v5}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 176
    return-void

    .line 180
    :cond_0
    const-string v3, "1"

    .line 181
    const-string v0, "bindOperation"

    invoke-virtual {p3, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    invoke-static {p0, p2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 184
    new-instance v0, Lcom/huawei/hwid/api/common/f$2;

    invoke-direct {v0}, Lcom/huawei/hwid/api/common/f$2;-><init>()V

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, p3}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/huawei/cloudservice/CloudRequestHandler;Landroid/os/Bundle;)V

    .line 196
    return-void
.end method

.method private static d(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/UserAccountInfo;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 156
    const-string v2, ""

    .line 157
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 158
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    .line 159
    const-string v0, "2"

    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getAccountType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->getUserAccount()Ljava/lang/String;

    move-result-object v2

    .line 161
    const-string v0, "CloudAccountImpl2"

    const-string v1, "phoneAccountName "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    :cond_0
    goto :goto_0

    .line 165
    :cond_1
    return-object v2
.end method
