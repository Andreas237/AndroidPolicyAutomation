.class public Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;,
        Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;
    }
.end annotation


# instance fields
.field private a:Landroid/accounts/AccountManager;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:Z

.field private j:Landroid/content/Intent;

.field private k:Landroid/os/Bundle;

.field private l:Landroid/os/Bundle;

.field private m:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a:Landroid/accounts/AccountManager;

    .line 51
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->b:Ljava/lang/String;

    .line 52
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->c:Ljava/lang/String;

    .line 53
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->d:Ljava/lang/String;

    .line 54
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->e:Ljava/lang/String;

    .line 55
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->f:Ljava/lang/String;

    .line 56
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->g:Ljava/lang/String;

    .line 58
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->h:Z

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->i:Z

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->j:Landroid/content/Intent;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->k:Landroid/os/Bundle;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->l:Landroid/os/Bundle;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->l:Landroid/os/Bundle;

    return-object p1
.end method

.method private a(IILandroid/content/Intent;Landroid/os/Bundle;)Lcom/huawei/hwid/core/helper/handler/ErrorStatus;
    .locals 4

    .line 333
    invoke-static {}, Lcom/huawei/hwid/api/common/o;->a()Lcom/huawei/cloudservice/LoginHandler;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 334
    const-string v0, "CS_system_error_tip"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/l;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 335
    const-string v0, "DummyActivity"

    const-string v1, "callback is null, please login again!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 339
    :cond_0
    const/4 v3, 0x0

    .line 340
    const/4 v0, 0x0

    if-eq v0, p4, :cond_1

    .line 341
    const-string v0, "Exception"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 343
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    const-string v0, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 344
    const-string v0, "authAccount"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->d:Ljava/lang/String;

    .line 345
    const-string v0, "accountType"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->e:Ljava/lang/String;

    .line 346
    const-string v0, "authtoken"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->c:Ljava/lang/String;

    .line 348
    const-string v0, "useSelfAccount"

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->h:Z

    .line 349
    const-string v0, "loginUserName"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 350
    const-string v0, "loginUserName"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->f:Ljava/lang/String;

    .line 352
    :cond_2
    const-string v0, "countryIsoCode"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 353
    const-string v0, "countryIsoCode"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->g:Ljava/lang/String;

    .line 355
    :cond_3
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    return-object v0

    .line 357
    :cond_4
    invoke-direct {p0, v3}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a(Ljava/lang/String;)Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;)Lcom/huawei/hwid/core/helper/handler/ErrorStatus;
    .locals 4

    .line 301
    const-string v2, ""

    .line 302
    const/4 v3, 0x0

    .line 303
    const-string v0, "AuthenticatorException"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 304
    const/16 v3, 0xbbb

    .line 305
    const-string v2, "getAuthTokenByFeatures : AuthenticatorException occur"

    .line 306
    const-string v0, "DummyActivity"

    const-string v1, "AuthenticatorException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 307
    :cond_0
    const-string v0, "IOException"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 308
    const/16 v3, 0xbbc

    .line 309
    const-string v2, "getAuthTokenByFeatures : IOException occur"

    .line 310
    const-string v0, "DummyActivity"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 311
    :cond_1
    const-string v0, "AccessException"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 312
    const/16 v3, 0xf

    .line 313
    const-string v2, "Access is not allowed"

    .line 314
    const-string v0, "DummyActivity"

    const-string v1, "AccessError:appID is not allowed"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 315
    :cond_2
    const-string v0, "AreaNotAllowException"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 316
    const/16 v3, 0x17

    .line 317
    const-string v2, "AreaNotAllowError: Area is not allowed"

    .line 318
    const-string v0, "DummyActivity"

    const-string v1, "AreaNotAllowError: Area is not allowed"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 319
    :cond_3
    const-string v0, "HwIDNotAllowException"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 320
    const/16 v3, 0x18

    .line 321
    const-string v2, "HwIDNotAllowError: HwID is not allowed"

    .line 322
    const-string v0, "DummyActivity"

    const-string v1, "HwIDNotAllowError: HwID is not allowed"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 324
    :cond_4
    const/16 v3, 0xbba

    .line 325
    const-string v2, "getAuthTokenByFeatures : OperationCanceledException occur"

    .line 326
    const-string v0, "DummyActivity"

    const-string v1, "OperationCanceledException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    :goto_0
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-direct {v0, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;)Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->d:Ljava/lang/String;

    return-object p1
.end method

.method private a()V
    .locals 4

    .line 159
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.hwid.GET_AUTH_TOKEN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->j:Landroid/content/Intent;

    .line 160
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->j:Landroid/content/Intent;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->k:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 161
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->j:Landroid/content/Intent;

    const-string v1, "isTransNavigationBar"

    iget-boolean v2, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->m:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 162
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->j:Landroid/content/Intent;

    const-string v1, "com.huawei.hwid"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 164
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->j:Landroid/content/Intent;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    goto :goto_0

    .line 165
    :catch_0
    move-exception v3

    .line 166
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->c()V

    .line 168
    :goto_0
    return-void
.end method

.method private a(IILandroid/content/Intent;)V
    .locals 7

    .line 201
    const/4 v2, 0x0

    .line 202
    const/4 v3, 0x0

    .line 203
    const-string v4, ""

    .line 204
    const-string v0, "DummyActivity"

    const-string v1, "onActivityResult::resultCode==>"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    const/4 v0, -0x1

    if-ne v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 206
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 207
    invoke-direct {p0, p1, p2, p3, v2}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a(IILandroid/content/Intent;Landroid/os/Bundle;)Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    move-result-object v5

    .line 208
    invoke-virtual {v5}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v3

    .line 209
    invoke-virtual {v5}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorReason()Ljava/lang/String;

    move-result-object v4

    .line 210
    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 212
    new-instance v5, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "getAuthTokenByFeatures : OperationCanceledException occur"

    const/16 v1, 0xbba

    invoke-direct {v5, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 213
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 214
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 216
    const-string v0, "isUseSDK"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 217
    const-string v0, "parce"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 218
    invoke-static {p0, v6}, Lcom/huawei/hwid/core/d/c;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 219
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 220
    return-void

    .line 222
    :cond_1
    const/16 v3, 0xbba

    .line 223
    const-string v4, "getAuthTokenByFeatures : OperationCanceledException occur"

    .line 224
    const-string v0, "DummyActivity"

    const-string v1, "OperationCanceledException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    :goto_0
    if-eqz v3, :cond_2

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x0

    if-ne v0, v2, :cond_5

    .line 228
    :cond_3
    const/4 v0, 0x0

    if-ne v0, v2, :cond_4

    .line 229
    const-string v0, "DummyActivity"

    const-string v1, "AuthTokenCallBack:run bundle is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    new-instance v5, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "bundle is null"

    invoke-direct {v5, v3, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    goto :goto_1

    .line 232
    :cond_4
    const-string v0, "DummyActivity"

    const-string v1, "AuthTokenCallBack:error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    new-instance v5, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-direct {v5, v3, v4}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 235
    :goto_1
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 236
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 238
    const-string v0, "isUseSDK"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 239
    const-string v0, "parce"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 240
    invoke-static {p0, v6}, Lcom/huawei/hwid/core/d/c;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 241
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 242
    return-void

    .line 244
    :cond_5
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->d:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v3, v2}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a(Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 245
    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 12

    .line 517
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 518
    const-string v0, "DummyActivity"

    const-string v1, "bundle is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    return-void

    .line 521
    :cond_0
    const-string v0, "userId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 522
    const-string v0, "siteId"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 523
    const-string v0, "deviceId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 524
    const-string v0, "subDeviceId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 525
    const-string v0, "deviceType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 526
    const-string v0, "accountType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 527
    const-string v0, "STValidStatus"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 528
    const-string v0, "uuid"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 530
    const-string v0, "DummyActivity"

    const-string v1, "sendSuccess"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    invoke-static {v7}, Lcom/huawei/hwid/core/d/b;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 533
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->d:Ljava/lang/String;

    invoke-static {v0, v7}, Lcom/huawei/hwid/core/d/j;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->d:Ljava/lang/String;

    .line 535
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 536
    new-instance v10, Landroid/content/Intent;

    invoke-direct {v10}, Landroid/content/Intent;-><init>()V

    .line 537
    iget-boolean v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->h:Z

    if-nez v0, :cond_2

    const-string v0, "com.huawei.hwid.ICloudService"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 539
    :cond_2
    new-instance v11, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-direct {v11}, Lcom/huawei/hwid/core/datatype/HwAccount;-><init>()V

    .line 540
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->d:Ljava/lang/String;

    invoke-virtual {v11, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->b(Ljava/lang/String;)V

    .line 541
    invoke-virtual {v11, v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->h(Ljava/lang/String;)V

    .line 542
    invoke-virtual {v11, v5}, Lcom/huawei/hwid/core/datatype/HwAccount;->i(Ljava/lang/String;)V

    .line 543
    invoke-virtual {v11, v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->j(Ljava/lang/String;)V

    .line 544
    invoke-virtual {v11, v3}, Lcom/huawei/hwid/core/datatype/HwAccount;->a(I)V

    .line 545
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->c:Ljava/lang/String;

    invoke-virtual {v11, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->f(Ljava/lang/String;)V

    .line 546
    invoke-virtual {v11, v2}, Lcom/huawei/hwid/core/datatype/HwAccount;->d(Ljava/lang/String;)V

    .line 547
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->b:Ljava/lang/String;

    invoke-virtual {v11, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->c(Ljava/lang/String;)V

    .line 548
    invoke-virtual {v11, v7}, Lcom/huawei/hwid/core/datatype/HwAccount;->g(Ljava/lang/String;)V

    .line 549
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->f:Ljava/lang/String;

    invoke-virtual {v11, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->k(Ljava/lang/String;)V

    .line 550
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->g:Ljava/lang/String;

    invoke-virtual {v11, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->a(Ljava/lang/String;)V

    .line 551
    invoke-virtual {v11, v8}, Lcom/huawei/hwid/core/datatype/HwAccount;->l(Ljava/lang/String;)V

    .line 552
    invoke-virtual {v11, v9}, Lcom/huawei/hwid/core/datatype/HwAccount;->n(Ljava/lang/String;)V

    .line 553
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 554
    const-string v0, "hwaccount"

    invoke-virtual {v10, v0, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 555
    const-string v0, "envExtra"

    const-string v1, "envExtra"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 558
    :cond_3
    const-string v0, "isUseSDK"

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 559
    invoke-static {p0, v10}, Lcom/huawei/hwid/core/d/c;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 561
    :cond_4
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a(Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 9

    .line 426
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 427
    iget-boolean v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->h:Z

    if-eqz v0, :cond_2

    .line 431
    const/4 v0, 0x0

    if-eq v0, p4, :cond_1

    .line 432
    const-string v0, "bundle"

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    .line 433
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 434
    const-string v0, "envExtra"

    const-string v1, "envExtra"

    invoke-virtual {p4, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 439
    :cond_0
    iput-object v7, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->l:Landroid/os/Bundle;

    .line 440
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->l:Landroid/os/Bundle;

    invoke-direct {p0, v0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a(Landroid/os/Bundle;)V

    .line 441
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 444
    :cond_1
    return-void

    .line 446
    :cond_2
    new-instance v7, Landroid/accounts/Account;

    const-string v0, "com.huawei.hwid"

    invoke-direct {v7, p2, v0}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 449
    const-string v0, "getUserId"

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 450
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a:Landroid/accounts/AccountManager;

    move-object v1, v7

    iget-object v2, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->b:Ljava/lang/String;

    move-object v3, v8

    move-object v4, p0

    new-instance v5, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v6}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$b;-><init>(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$1;)V

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Landroid/accounts/AccountManager;->updateCredentials(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;Landroid/app/Activity;Landroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;

    .line 452
    goto :goto_0

    .line 453
    :cond_3
    new-instance v7, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "token or accountName is null"

    invoke-direct {v7, p3, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 454
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 455
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 457
    const-string v0, "isUseSDK"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 458
    const-string v0, "parce"

    invoke-virtual {v8, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 459
    invoke-static {p0, v8}, Lcom/huawei/hwid/core/d/c;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 460
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 461
    return-void

    .line 463
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;)Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->e:Ljava/lang/String;

    return-object p1
.end method

.method private b()V
    .locals 4

    .line 173
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.hwid.LOGIN_BY_SDK"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 174
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    const-string v0, "isTransNavigationBar"

    iget-boolean v1, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->m:Z

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 177
    const/4 v0, 0x2

    :try_start_0
    invoke-virtual {p0, v2, v0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    goto :goto_0

    .line 178
    :catch_0
    move-exception v3

    .line 179
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->c()V

    .line 182
    :goto_0
    return-void
.end method

.method private b(IILandroid/content/Intent;)V
    .locals 7

    .line 249
    const-string v0, "DummyActivity"

    const-string v1, "loginResult#ok"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    new-instance v0, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-direct {v0}, Lcom/huawei/hwid/core/datatype/HwAccount;-><init>()V

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->a(Landroid/os/Bundle;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v2

    .line 252
    const-string v3, ""

    .line 253
    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 254
    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v3

    .line 257
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/HwAccount;->o()Ljava/lang/String;

    move-result-object v4

    .line 258
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "null"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 259
    :cond_1
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/k;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    .line 260
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 261
    const-string v4, ""

    .line 263
    :cond_2
    invoke-virtual {v2, v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->n(Ljava/lang/String;)V

    .line 266
    :cond_3
    invoke-static {p0}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/hwid/c/a;->a(Lcom/huawei/hwid/core/datatype/HwAccount;)V

    .line 267
    invoke-static {p0}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;)[Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v5

    .line 268
    invoke-static {v5, v3}, Lcom/huawei/hwid/api/common/e;->a([Lcom/huawei/cloudservice/CloudAccount;Ljava/lang/String;)I

    move-result v6

    .line 269
    invoke-static {}, Lcom/huawei/hwid/api/common/o;->a()Lcom/huawei/cloudservice/LoginHandler;

    move-result-object v0

    invoke-interface {v0, v5, v6}, Lcom/huawei/cloudservice/LoginHandler;->onLogin([Lcom/huawei/cloudservice/CloudAccount;I)V

    .line 270
    invoke-static {p0}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    invoke-interface {v0, p0, v2}, Lcom/huawei/hwid/b/b;->a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;)Z

    .line 271
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 272
    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Landroid/os/Bundle;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;)Landroid/os/Bundle;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->l:Landroid/os/Bundle;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->c:Ljava/lang/String;

    return-object p1
.end method

.method private c()V
    .locals 6

    .line 185
    const-string v0, "DummyActivity"

    const-string v1, "SDK can not start intent for GETTOKEN"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    const/16 v2, 0xf

    .line 187
    const-string v3, "Access is not allowed"

    .line 188
    new-instance v4, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-direct {v4, v2, v3}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 189
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 190
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 192
    const-string v0, "isUseSDK"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 193
    const-string v0, "parce"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 194
    invoke-static {p0, v5}, Lcom/huawei/hwid/core/d/c;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 195
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 196
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .line 275
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 276
    const-string v0, "DummyActivity"

    const-string v1, "onActivityResult::requestCode==>"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    const-wide/16 v0, 0x32

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 283
    goto :goto_0

    .line 281
    :catch_0
    move-exception v2

    .line 282
    const-string v0, "DummyActivity"

    const-string v1, "InterruptedException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    :goto_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 286
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a(IILandroid/content/Intent;)V

    goto :goto_1

    .line 287
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_2

    .line 288
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 289
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->b(IILandroid/content/Intent;)V

    goto :goto_1

    .line 291
    :cond_1
    const-string v0, "DummyActivity"

    const-string v1, "loginResult#cancel"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    new-instance v2, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v0, "getAuthTokenByFeatures : OperationCanceledException occur"

    const/16 v1, 0xbba

    invoke-direct {v2, v1, v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 293
    invoke-static {}, Lcom/huawei/hwid/api/common/o;->a()Lcom/huawei/cloudservice/LoginHandler;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/huawei/cloudservice/LoginHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 294
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 297
    :cond_2
    :goto_1
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .line 503
    :try_start_0
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 506
    goto :goto_0

    .line 504
    :catch_0
    move-exception v2

    .line 505
    const-string v0, "DummyActivity"

    const-string v1, "catch Exception throw by FragmentManager!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 13

    .line 69
    const-string v0, "DummyActivity"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 76
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->j:Landroid/content/Intent;

    .line 77
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->j:Landroid/content/Intent;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 78
    const-string v0, "DummyActivity"

    const-string v1, "we got a wrong intent"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 80
    return-void

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->j:Landroid/content/Intent;

    const-string v1, "bundle"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->k:Landroid/os/Bundle;

    .line 83
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->k:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 84
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->k:Landroid/os/Bundle;

    .line 86
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->k:Landroid/os/Bundle;

    const-string v1, "isTransNavigationBar"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->m:Z

    .line 87
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->requestWindowFeature(I)Z

    .line 89
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->getWindow()Landroid/view/Window;

    move-result-object v9

    .line 90
    const/high16 v0, 0x4000000

    const/high16 v1, 0x4000000

    invoke-virtual {v9, v0, v1}, Landroid/view/Window;->setFlags(II)V

    .line 91
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    iget-boolean v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->m:Z

    if-eqz v0, :cond_2

    .line 93
    const/high16 v0, 0x8000000

    const/high16 v1, 0x8000000

    invoke-virtual {v9, v0, v1}, Landroid/view/Window;->setFlags(II)V

    .line 96
    :cond_2
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/app/Activity;Ljava/lang/Boolean;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 98
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/app/Activity;Z)V

    .line 101
    :cond_3
    invoke-static {p0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a:Landroid/accounts/AccountManager;

    .line 102
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->j:Landroid/content/Intent;

    const-string v1, "requestTokenType"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->b:Ljava/lang/String;

    .line 103
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 104
    const-string v0, "DummyActivity"

    const-string v1, "params invalid: tokenType is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 106
    return-void

    .line 109
    :cond_4
    invoke-static {}, Lcom/huawei/hwid/api/common/o;->a()Lcom/huawei/cloudservice/LoginHandler;

    move-result-object v10

    .line 110
    const/4 v0, 0x0

    if-ne v0, v10, :cond_5

    .line 111
    const-string v0, "DummyActivity"

    const-string v1, "params invalid: loginHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 113
    return-void

    .line 116
    :cond_5
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->k:Landroid/os/Bundle;

    const-string v1, "IS_LOGIN_BY_ACTIVITY"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 118
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->b()V

    .line 119
    return-void

    .line 122
    :cond_6
    const-string v0, "com.huawei.hwid.GET_AUTH_TOKEN"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/b;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 125
    const/4 v0, 0x0

    invoke-static {p0, v10, v0}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Lcom/huawei/cloudservice/LoginHandler;Lcom/huawei/hwid/core/a/b;)V

    .line 126
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->k:Landroid/os/Bundle;

    const-string v1, "ServiceType"

    iget-object v2, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    invoke-direct {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a()V

    .line 133
    return-void

    .line 136
    :cond_7
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a:Landroid/accounts/AccountManager;

    const-string v1, "com.huawei.hwid"

    invoke-virtual {v0, v1}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v11

    .line 137
    const/4 v0, 0x1

    new-array v12, v0, [Ljava/lang/String;

    const-string v0, ""

    const/4 v1, 0x0

    aput-object v0, v12, v1

    .line 138
    const/4 v0, 0x0

    if-eq v0, v11, :cond_8

    array-length v0, v11

    if-lez v0, :cond_8

    .line 139
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->k:Landroid/os/Bundle;

    const-string v1, "chooseAccount"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 140
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a:Landroid/accounts/AccountManager;

    const/4 v1, 0x0

    aget-object v1, v11, v1

    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->k:Landroid/os/Bundle;

    move-object v4, p0

    new-instance v5, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;

    invoke-direct {v5, p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;-><init>(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;)V

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Landroid/accounts/AccountManager;->getAuthToken(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;Landroid/app/Activity;Landroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;

    goto :goto_0

    .line 142
    :cond_8
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a:Landroid/accounts/AccountManager;

    const-string v1, "com.huawei.hwid"

    const-string v2, "com.huawei.hwid"

    move-object v3, v12

    move-object v4, p0

    iget-object v5, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->k:Landroid/os/Bundle;

    iget-object v6, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->k:Landroid/os/Bundle;

    new-instance v7, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;

    invoke-direct {v7, p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity$a;-><init>(Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;)V

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/accounts/AccountManager;->getAuthTokenByFeatures(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/Bundle;Landroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;

    .line 146
    :goto_0
    return-void
.end method

.method protected onDestroy()V
    .locals 3

    .line 565
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 566
    const-string v0, "DummyActivity"

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 567
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 568
    const-string v0, "LoginBroadcastReceiver"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 569
    invoke-static {p0, v2}, Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Landroid/os/Bundle;)V

    .line 572
    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 577
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 578
    const-string v0, "DummyActivity"

    const-string v1, "onResume"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 579
    iget-boolean v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->i:Z

    if-eqz v0, :cond_0

    .line 580
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->i:Z

    .line 581
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->l:Landroid/os/Bundle;

    invoke-direct {p0, v0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->a(Landroid/os/Bundle;)V

    .line 582
    invoke-virtual {p0}, Lcom/huawei/hwid/api/common/apkimpl/DummyActivity;->finish()V

    .line 584
    :cond_0
    return-void
.end method
