.class public Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/support/api/hwid/HuaweiIdApi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl$a;,
        Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl$b;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/hms/api/HuaweiApiClient;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->a:Lcom/huawei/hms/api/HuaweiApiClient;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->b:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;)Lcom/huawei/hms/api/HuaweiApiClient;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->a:Lcom/huawei/hms/api/HuaweiApiClient;

    return-object v0
.end method

.method static a(Lcom/huawei/hms/api/HuaweiApiClient;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;)Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/Scope;>;"
        }
    .end annotation

    .line 101
    move-object v0, p0

    check-cast v0, Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getScopes()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(I)V
    .locals 4

    .line 263
    if-nez p1, :cond_0

    .line 264
    invoke-static {}, Lcom/huawei/hms/api/HuaweiApiAvailability;->getInstance()Lcom/huawei/hms/api/HuaweiApiAvailability;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->a:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v1}, Lcom/huawei/hms/api/HuaweiApiClient;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hms/api/HuaweiApiAvailability;->isHuaweiMobileNoticeAvailable(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_0

    .line 266
    new-instance v2, Lcom/huawei/hms/support/api/hwid/d;

    invoke-direct {v2, p0}, Lcom/huawei/hms/support/api/hwid/d;-><init>(Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;)V

    .line 272
    new-instance v3, Ljava/util/Timer;

    invoke-direct {v3}, Ljava/util/Timer;-><init>()V

    .line 273
    const-wide/16 v0, 0xc8

    invoke-virtual {v3, v2, v0, v1}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 275
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;I)V
    .locals 0

    .line 48
    invoke-direct {p0, p1}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->a(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;)Ljava/lang/ref/WeakReference;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->b:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method static b(Lcom/huawei/hms/api/HuaweiApiClient;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;)Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;>;"
        }
    .end annotation

    .line 105
    move-object v0, p0

    check-cast v0, Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->getPermissionInfos()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getSignInResultFromIntent(Landroid/content/Intent;)Lcom/huawei/hms/support/api/hwid/SignInResult;
    .locals 34

    .line 192
    const/4 v11, 0x0

    .line 194
    if-eqz p1, :cond_6

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v12

    if-eqz v12, :cond_6

    .line 195
    const-string v0, "RET_CODE"

    const/4 v1, 0x0

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v13

    .line 196
    const/4 v14, 0x0

    .line 197
    if-nez v13, :cond_3

    .line 198
    const-string v0, "ACCESSTOKEN"

    const-string v1, ""

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 199
    const-string v0, "SERVICE_AUTH_CODE"

    const-string v1, ""

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 200
    const-string v0, "DISPLAY_NAME"

    const-string v1, ""

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 201
    const-string v0, "GENDER"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 202
    invoke-static/range {v18 .. v18}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    const-string v18, "-1"

    .line 205
    :cond_0
    const/16 v19, -0x1

    .line 207
    :try_start_0
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v19

    .line 210
    goto :goto_0

    .line 208
    :catch_0
    move-exception v20

    .line 209
    const/16 v19, -0x1

    .line 211
    :goto_0
    const-string v0, "USER_ID"

    const-string v1, ""

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 212
    const-string v0, "OPEN_ID"

    const-string v1, ""

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    .line 213
    const-string v0, "PHOTO_URL"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    .line 214
    const-string v0, "STATUS"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    .line 215
    const-string v0, "SERVICE_COUNTRY_CODE"

    const-string v1, ""

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    .line 216
    const-string v0, "UNION_ID"

    const-string v1, ""

    invoke-virtual {v12, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    .line 217
    invoke-static/range {v23 .. v23}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 218
    const-string v23, "0"

    .line 220
    :cond_1
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v26

    .line 221
    const-string v0, "SCOPE"

    invoke-virtual {v12, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v27

    .line 223
    new-instance v28, Ljava/util/HashSet;

    invoke-direct/range {v28 .. v28}, Ljava/util/HashSet;-><init>()V

    .line 224
    if-eqz v27, :cond_2

    .line 225
    const-string v0, " "

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v29

    .line 226
    move-object/from16 v30, v29

    move-object/from16 v0, v30

    array-length v0, v0

    move/from16 v31, v0

    const/16 v32, 0x0

    :goto_1
    move/from16 v0, v32

    move/from16 v1, v31

    if-ge v0, v1, :cond_2

    aget-object v33, v30, v32

    .line 227
    new-instance v0, Lcom/huawei/hms/support/api/entity/auth/Scope;

    move-object/from16 v1, v33

    invoke-direct {v0, v1}, Lcom/huawei/hms/support/api/entity/auth/Scope;-><init>(Ljava/lang/String;)V

    move-object/from16 v1, v28

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 226
    add-int/lit8 v32, v32, 0x1

    goto :goto_1

    .line 230
    :cond_2
    move-object/from16 v0, v21

    move-object/from16 v1, v20

    move-object/from16 v2, v17

    move-object/from16 v3, v22

    move-object v4, v15

    move-object/from16 v5, v24

    move/from16 v6, v26

    move/from16 v7, v19

    move-object/from16 v8, v28

    move-object/from16 v9, v16

    move-object/from16 v10, v25

    invoke-static/range {v0 .. v10}, Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;->build(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;

    move-result-object v29

    .line 232
    new-instance v14, Lcom/huawei/hms/support/api/client/Status;

    invoke-direct {v14, v13}, Lcom/huawei/hms/support/api/client/Status;-><init>(I)V

    .line 233
    new-instance v11, Lcom/huawei/hms/support/api/hwid/SignInResult;

    invoke-direct {v11, v14}, Lcom/huawei/hms/support/api/hwid/SignInResult;-><init>(Lcom/huawei/hms/support/api/client/Status;)V

    .line 234
    invoke-virtual {v11, v14}, Lcom/huawei/hms/support/api/hwid/SignInResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 235
    move-object/from16 v0, v29

    invoke-virtual {v11, v0}, Lcom/huawei/hms/support/api/hwid/SignInResult;->setSignInHuaweiId(Lcom/huawei/hms/support/api/hwid/SignInHuaweiId;)V

    .line 236
    const-string v0, "HuaweiIdApiImpl"

    const-string v1, "getSignInResult success"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    goto :goto_2

    .line 238
    :cond_3
    const/4 v15, 0x0

    .line 239
    const/16 v0, 0x7d2

    if-eq v13, v0, :cond_4

    const/16 v0, 0x7d4

    if-ne v13, v0, :cond_5

    .line 241
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->a:Lcom/huawei/hms/api/HuaweiApiClient;

    invoke-virtual {v0}, Lcom/huawei/hms/api/HuaweiApiClient;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v1}, Ljava/security/SecureRandom;->nextInt()I

    move-result v1

    move-object/from16 v2, p1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v15

    .line 243
    :cond_5
    new-instance v14, Lcom/huawei/hms/support/api/client/Status;

    const/4 v0, 0x0

    invoke-direct {v14, v13, v0, v15}, Lcom/huawei/hms/support/api/client/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 245
    new-instance v11, Lcom/huawei/hms/support/api/hwid/SignInResult;

    invoke-direct {v11, v14}, Lcom/huawei/hms/support/api/hwid/SignInResult;-><init>(Lcom/huawei/hms/support/api/client/Status;)V

    .line 246
    invoke-virtual {v11, v14}, Lcom/huawei/hms/support/api/hwid/SignInResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 247
    move-object/from16 v0, p1

    invoke-virtual {v11, v0}, Lcom/huawei/hms/support/api/hwid/SignInResult;->setData(Landroid/content/Intent;)V

    .line 249
    const-string v0, "HuaweiIdApiImpl"

    const-string v1, "getSignInResult fail"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    :goto_2
    goto :goto_3

    .line 252
    :cond_6
    new-instance v13, Lcom/huawei/hms/support/api/client/Status;

    const/16 v0, 0x7d3

    invoke-direct {v13, v0}, Lcom/huawei/hms/support/api/client/Status;-><init>(I)V

    .line 253
    new-instance v11, Lcom/huawei/hms/support/api/hwid/SignInResult;

    invoke-direct {v11, v13}, Lcom/huawei/hms/support/api/hwid/SignInResult;-><init>(Lcom/huawei/hms/support/api/client/Status;)V

    .line 254
    const-string v0, "HuaweiIdApiImpl"

    const-string v1, "getSignInResult error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    :goto_3
    return-object v11
.end method

.method public signIn(Landroid/app/Activity;Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/hwid/SignInResult;>;"
        }
    .end annotation

    .line 68
    const-string v0, "HuaweiIdApiImpl"

    const-string v1, "Enter signIn"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    const-string v0, "Activity must not be null."

    invoke-static {p1, v0}, Lcom/huawei/hms/c/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    invoke-static {p2}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->a(Lcom/huawei/hms/api/HuaweiApiClient;)Ljava/util/List;

    move-result-object v2

    .line 73
    invoke-static {p2}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->b(Lcom/huawei/hms/api/HuaweiApiClient;)Ljava/util/List;

    move-result-object v3

    .line 74
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 75
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hms/support/api/entity/auth/Scope;

    .line 76
    invoke-virtual {v6}, Lcom/huawei/hms/support/api/entity/auth/Scope;->getScopeUri()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 79
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    .line 80
    invoke-virtual {v7}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;->getPermission()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    new-instance v6, Lcom/huawei/hms/support/api/entity/hwid/SignInReq;

    invoke-direct {v6, v4, v5}, Lcom/huawei/hms/support/api/entity/hwid/SignInReq;-><init>(Ljava/util/Set;Ljava/util/Set;)V

    .line 84
    iput-object p2, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->a:Lcom/huawei/hms/api/HuaweiApiClient;

    .line 85
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->b:Ljava/lang/ref/WeakReference;

    .line 87
    new-instance v0, Lcom/huawei/hms/support/api/hwid/b;

    const-string v1, "hwid.signin"

    invoke-direct {v0, p0, p2, v1, v6}, Lcom/huawei/hms/support/api/hwid/b;-><init>(Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method

.method public signInBackend(Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/hwid/SignInResult;>;"
        }
    .end annotation

    .line 121
    const-string v0, "HuaweiIdApiImpl"

    const-string v1, "Enter signInBackend"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    iput-object p1, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->a:Lcom/huawei/hms/api/HuaweiApiClient;

    .line 125
    invoke-static {p1}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->a(Lcom/huawei/hms/api/HuaweiApiClient;)Ljava/util/List;

    move-result-object v2

    .line 126
    invoke-static {p1}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;->b(Lcom/huawei/hms/api/HuaweiApiClient;)Ljava/util/List;

    move-result-object v3

    .line 127
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 128
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hms/support/api/entity/auth/Scope;

    .line 129
    invoke-virtual {v6}, Lcom/huawei/hms/support/api/entity/auth/Scope;->getScopeUri()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 130
    goto :goto_0

    .line 131
    :cond_0
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 132
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    .line 133
    invoke-virtual {v7}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;->getPermission()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 134
    goto :goto_1

    .line 135
    :cond_1
    new-instance v6, Lcom/huawei/hms/support/api/entity/hwid/SignInReq;

    invoke-direct {v6, v4, v5}, Lcom/huawei/hms/support/api/entity/hwid/SignInReq;-><init>(Ljava/util/Set;Ljava/util/Set;)V

    .line 137
    new-instance v0, Lcom/huawei/hms/support/api/hwid/c;

    const-string v1, "hwid.signinbackend"

    invoke-direct {v0, p0, p1, v1, v6}, Lcom/huawei/hms/support/api/hwid/c;-><init>(Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl;Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method

.method public signOut(Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/hwid/SignOutResult;>;"
        }
    .end annotation

    .line 156
    const-string v0, "HuaweiIdApiImpl"

    const-string v1, "Enter signOut"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    new-instance v0, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl$b;

    const-string v1, "hwid.signout"

    new-instance v2, Lcom/huawei/hms/support/api/entity/hwid/SignOutReq;

    invoke-direct {v2}, Lcom/huawei/hms/support/api/entity/hwid/SignOutReq;-><init>()V

    invoke-direct {v0, p1, v1, v2}, Lcom/huawei/hms/support/api/hwid/HuaweiIdApiImpl$b;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;)V

    return-object v0
.end method
