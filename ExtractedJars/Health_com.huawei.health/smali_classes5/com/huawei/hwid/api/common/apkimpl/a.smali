.class public Lcom/huawei/hwid/api/common/apkimpl/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Landroid/content/Intent;ILcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 3

    .line 133
    const-string v0, "com.huawei.hwid.ICloudService"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    new-instance v2, Lcom/huawei/hwid/api/common/h;

    invoke-direct {v2, p0, p1, p2}, Lcom/huawei/hwid/api/common/h;-><init>(Landroid/content/Context;Landroid/content/Intent;I)V

    .line 135
    invoke-virtual {v2, p3}, Lcom/huawei/hwid/api/common/h;->a(Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 136
    invoke-virtual {v2}, Lcom/huawei/hwid/api/common/h;->a()V

    .line 137
    goto :goto_0

    .line 138
    :cond_0
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "no remote interface call service"

    const/16 v1, 0x26

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 139
    invoke-interface {p3, v2}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 141
    :goto_0
    return-void
.end method

.method private static final a(Landroid/content/Context;Lcom/huawei/hwid/UseCase$a;)V
    .locals 3

    .line 349
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 350
    const-string v0, "APKCloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 351
    return-void

    .line 353
    :cond_0
    new-instance v0, Lcom/huawei/hwid/b;

    invoke-static {}, Lcom/huawei/hwid/d;->a()Lcom/huawei/hwid/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwid/b;-><init>(Lcom/huawei/hwid/c;)V

    new-instance v1, Lcom/huawei/hwid/usecase/GetAccountStatusUseCase;

    invoke-direct {v1, p0}, Lcom/huawei/hwid/usecase/GetAccountStatusUseCase;-><init>(Landroid/content/Context;)V

    new-instance v2, Lcom/huawei/hwid/usecase/GetAccountStatusUseCase$RequestValues;

    invoke-direct {v2}, Lcom/huawei/hwid/usecase/GetAccountStatusUseCase$RequestValues;-><init>()V

    invoke-virtual {v0, v1, v2, p1}, Lcom/huawei/hwid/b;->a(Lcom/huawei/hwid/UseCase;Lcom/huawei/hwid/UseCase$RequestValues;Lcom/huawei/hwid/UseCase$a;)V

    .line 355
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;)V
    .locals 3

    .line 296
    invoke-static {p0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v2

    .line 298
    const-string v0, "com.huawei.hwid"

    invoke-virtual {p1}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/accounts/AccountManager;->invalidateAuthToken(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    return-void
.end method

.method static synthetic a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 0

    .line 47
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/apkimpl/a;->b(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 4

    .line 472
    invoke-static {p0}, Lcom/huawei/hwid/api/common/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/api/common/a;

    move-result-object v2

    .line 473
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 474
    const-string v0, "APKCloudAccountImpl"

    const-string v1, "manager is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    return-void

    .line 477
    :cond_0
    new-instance v3, Lcom/huawei/hwid/api/common/k;

    invoke-direct {v3, p0, p1, p2}, Lcom/huawei/hwid/api/common/k;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 478
    invoke-virtual {v2, v3}, Lcom/huawei/hwid/api/common/a;->a(Lcom/huawei/hwid/api/common/b;)V

    .line 479
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 3

    .line 259
    const-string v0, "APKCloudAccountImpl"

    const-string v1, "apk---quickLogin()"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    const-string v0, "com.huawei.hwid.QUICK_REGISTER"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/b;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 262
    const/4 v0, 0x0

    invoke-static {p0, p2, v0}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;Lcom/huawei/hwid/core/a/b;)V

    .line 263
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.hwid.QUICK_REGISTER"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 264
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 265
    const-string v0, "requestTokenType"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 266
    const/4 v0, 0x0

    invoke-static {p0, v2, v0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Landroid/content/Intent;I)V

    .line 267
    goto :goto_0

    :cond_0
    const-string v0, "com.huawei.hwid.opensdk.ACTION_QUICKLOGIN_SMS"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/b;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 268
    invoke-static {p0}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 270
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 271
    const-string v0, "loginChannel"

    invoke-static {p0, p1}, Lcom/huawei/hwid/core/d/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 272
    invoke-static {p0, p1, v2, p2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 273
    goto :goto_0

    .line 274
    :cond_1
    const-string v0, "com.huawei.hwid"

    invoke-static {p0, p2, v0}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;Ljava/lang/String;)V

    .line 275
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.hwid.opensdk.ACTION_QUICKLOGIN_SMS"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 276
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 277
    const-string v0, "packname"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 278
    const/4 v0, 0x0

    invoke-static {p0, v2, v0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Landroid/content/Intent;I)V

    .line 279
    goto :goto_0

    .line 281
    :cond_2
    const-string v0, "APKCloudAccountImpl"

    const-string v1, "There is no quick login in APK"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "hwid not support quick login"

    const/16 v1, 0x15

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 283
    invoke-interface {p2, v2}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 285
    :goto_0
    return-void
.end method

.method static synthetic a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 47
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/apkimpl/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/IntentResultHandler;)V
    .locals 8

    .line 458
    invoke-static {p0}, Lcom/huawei/hwid/api/common/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/api/common/a;

    move-result-object v6

    .line 459
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 460
    const-string v0, "APKCloudAccountImpl"

    const-string v1, "manager is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 461
    return-void

    .line 463
    :cond_0
    new-instance v0, Lcom/huawei/hwid/api/common/j;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwid/api/common/j;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/IntentResultHandler;)V

    move-object v7, v0

    .line 464
    invoke-virtual {v6, v7}, Lcom/huawei/hwid/api/common/a;->a(Lcom/huawei/hwid/api/common/b;)V

    .line 465
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 6

    .line 74
    const-string v0, "APKCloudAccountImpl"

    const-string v1, "getAccountsByType use the apk"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string v0, "AIDL"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "com.huawei.hwid.ICloudService"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    const-string v0, "check_sim_status"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    new-instance v0, Lcom/huawei/hwid/api/common/apkimpl/a$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwid/api/common/apkimpl/a$1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Lcom/huawei/hwid/UseCase$a;)V

    goto :goto_0

    .line 94
    :cond_0
    invoke-static {p0, p1, p3, p4}, Lcom/huawei/hwid/api/common/apkimpl/a;->b(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V

    goto :goto_0

    .line 97
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/apkimpl/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 113
    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 14

    .line 179
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    .line 181
    const-string v0, "content://com.huawei.hwid.api.provider/has_login"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 182
    const/4 v8, 0x0

    .line 184
    const/4 v9, 0x0

    .line 186
    move-object v0, v6

    move-object v1, v7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 187
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    const-string v0, "hasLogin"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    .line 191
    const/4 v0, 0x1

    if-ne v0, v10, :cond_0

    .line 192
    const/4 v9, 0x1

    goto :goto_0

    .line 194
    :cond_0
    const/4 v9, 0x0

    .line 196
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Account has Login: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 197
    goto :goto_1

    .line 198
    :cond_1
    invoke-static {p0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v10

    .line 199
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v10, v0}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v11

    .line 200
    const/4 v0, 0x0

    if-eq v0, v11, :cond_2

    array-length v0, v11
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v0, :cond_2

    .line 201
    const/4 v9, 0x1

    goto :goto_1

    .line 203
    :cond_2
    const/4 v9, 0x0

    .line 223
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    .line 225
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_4

    .line 206
    :catch_0
    move-exception v10

    .line 207
    :try_start_1
    invoke-static {p0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v11

    .line 208
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v11, v0}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v12

    .line 209
    const/4 v0, 0x0

    if-eq v0, v12, :cond_3

    array-length v0, v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-lez v0, :cond_3

    .line 210
    const/4 v9, 0x1

    goto :goto_2

    .line 212
    :cond_3
    const/4 v9, 0x0

    .line 223
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    .line 225
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_4

    .line 214
    :catch_1
    move-exception v10

    .line 215
    :try_start_2
    invoke-static {p0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v11

    .line 216
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v11, v0}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v12

    .line 217
    const/4 v0, 0x0

    if-eq v0, v12, :cond_4

    array-length v0, v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-lez v0, :cond_4

    .line 218
    const/4 v9, 0x1

    goto :goto_3

    .line 220
    :cond_4
    const/4 v9, 0x0

    .line 223
    :goto_3
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    .line 225
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_4

    .line 223
    :catchall_0
    move-exception v13

    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 225
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_5
    throw v13

    .line 228
    :cond_6
    :goto_4
    return v9
.end method

.method public static a(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 12

    .line 309
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 310
    const-string v0, "APKCloudAccountImpl"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    const/4 v0, 0x0

    return v0

    .line 313
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    .line 315
    const-string v0, "content://com.huawei.hwid.api.provider/is_support_fingerprint/1"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 316
    const/4 v8, 0x0

    .line 318
    const/4 v9, 0x0

    .line 320
    move-object v0, v6

    move-object v1, v7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 321
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 323
    const-string v0, "isSupport"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v10

    .line 325
    const/4 v0, 0x1

    if-ne v0, v10, :cond_1

    .line 326
    const/4 v9, 0x1

    goto :goto_0

    .line 328
    :cond_1
    const/4 v9, 0x0

    .line 334
    :cond_2
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 336
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 331
    :catch_0
    move-exception v10

    .line 332
    const-string v0, "APKCloudAccountImpl"

    const-string v1, "Exception"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 334
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 336
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 334
    :catchall_0
    move-exception v11

    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    .line 336
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v11

    .line 339
    :cond_4
    :goto_1
    return v9
.end method

.method public static b(Landroid/content/Context;)J
    .locals 11

    .line 233
    const-string v0, "APKCloudAccountImpl"

    const-string v1, "getLoginCount"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    .line 236
    const-string v0, "content://com.huawei.hwid.api.provider/LOGIN_COUNT"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    .line 237
    move-object v0, v6

    move-object v1, v7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 239
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    const-string v0, "LOGIN_COUNT"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    goto :goto_0

    .line 242
    :cond_0
    const-wide/16 v9, -0x1

    .line 244
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 245
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 247
    :cond_1
    return-wide v9
.end method

.method public static b(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 6

    .line 421
    const-string v0, "APKCloudAccountImpl"

    const-string v1, "downloadHwIDAPK"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    const/4 v2, 0x0

    .line 430
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 431
    const-string v0, "requestcode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 434
    :cond_0
    const v3, 0x135c0e0

    .line 435
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->d(Landroid/content/Context;)I

    move-result v4

    .line 437
    invoke-static {p0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 438
    const v0, 0x135c0e0

    invoke-static {p0, v0}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 440
    add-int/lit8 v3, v4, 0x1

    .line 445
    :cond_1
    new-instance v5, Lcom/huawei/hwid/update/d/j;

    invoke-direct {v5}, Lcom/huawei/hwid/update/d/j;-><init>()V

    .line 446
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v5, v0}, Lcom/huawei/hwid/update/d/j;->a(Ljava/lang/String;)V

    .line 447
    invoke-virtual {v5, v3}, Lcom/huawei/hwid/update/d/j;->a(I)V

    .line 448
    const-string v0, "C10132067"

    invoke-virtual {v5, v0}, Lcom/huawei/hwid/update/d/j;->b(Ljava/lang/String;)V

    .line 449
    const-string v0, "cs_update_title"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwid/update/d/j;->c(Ljava/lang/String;)V

    .line 450
    invoke-static {p0, v2, v5}, Lcom/huawei/hwid/update/c/a;->a(Landroid/content/Context;ILcom/huawei/hwid/update/d/j;)V

    .line 451
    return-void
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 4

    .line 119
    invoke-static {p0}, Lcom/huawei/hwid/api/common/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/api/common/a;

    move-result-object v2

    .line 120
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 121
    const-string v0, "APKCloudAccountImpl"

    const-string v1, "manager is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    return-void

    .line 125
    :cond_0
    new-instance v3, Lcom/huawei/hwid/api/common/l;

    invoke-direct {v3, p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/l;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 126
    invoke-virtual {v2, v3}, Lcom/huawei/hwid/api/common/a;->a(Lcom/huawei/hwid/api/common/b;)V

    .line 127
    return-void
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 156
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 158
    const-class v0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;

    invoke-virtual {v2, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 159
    const-string v0, "requestTokenType"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 160
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 161
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 164
    :cond_0
    const-string v0, "accountName"

    invoke-virtual {p3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    const-string v0, "isFromApk"

    const/4 v1, 0x1

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 166
    const-string v0, "bundle"

    invoke-virtual {v2, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 168
    const/high16 v0, 0x100000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 169
    const/4 v0, 0x0

    invoke-static {p0, v2, v0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Landroid/content/Intent;I)V

    .line 170
    return-void
.end method
