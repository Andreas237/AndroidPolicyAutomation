.class public Lo/aoq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lo/aoq;


# instance fields
.field private d:Lo/axr;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 91
    new-instance v0, Lo/aoq;

    invoke-direct {v0}, Lo/aoq;-><init>()V

    sput-object v0, Lo/aoq;->c:Lo/aoq;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aoq;->d:Lo/axr;

    .line 134
    return-void
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 0

    .line 446
    return-void
.end method

.method public static b(Landroid/content/Context;Z)V
    .locals 3

    .line 437
    const-string v0, "HwAccountManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkUpdate,isCheckEachTime:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    return-void
.end method

.method private c(Ljava/lang/String;)I
    .locals 4

    .line 170
    const/4 v2, 0x0

    .line 171
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    const-string v0, "HwAccountManager"

    const-string v1, "getAccountInfoFromHwId: deviceType is null!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    const-string v0, "getAccountInfoFromHwId: deviceType is null!"

    invoke-static {v0}, Lo/bpj;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 177
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 180
    goto :goto_0

    .line 178
    :catch_0
    move-exception v3

    .line 179
    const-string v0, "HwAccountManager"

    const-string v1, "getDeviceType : devType is not validate."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    :goto_0
    return v2
.end method

.method public static e()Lo/aoq;
    .locals 1

    .line 142
    sget-object v0, Lo/aoq;->c:Lo/aoq;

    return-object v0
.end method

.method private e(Ljava/lang/String;)Z
    .locals 8

    .line 192
    const/4 v4, 0x0

    .line 193
    const-wide/16 v5, 0x0

    .line 195
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v5, v0

    .line 198
    goto :goto_0

    .line 196
    :catch_0
    move-exception v7

    .line 197
    const-string v0, "HwAccountManager"

    const-string v1, "getAccountInfoFromHwId : UserId is not validate."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    :goto_0
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    invoke-virtual {v0}, Lo/axr;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 200
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    invoke-virtual {v0, v5, v6}, Lo/axr;->e(J)V

    goto :goto_1

    .line 201
    :cond_0
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    invoke-virtual {v0}, Lo/axr;->b()J

    move-result-wide v0

    cmp-long v0, v5, v0

    if-eqz v0, :cond_1

    .line 202
    const-string v0, "HwAccountManager"

    const-string v1, "getAccountInfoFromHwId : UserId which get from HwAccount is different from current userId !"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    invoke-static {}, Lo/aor;->d()Lo/aor;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aor;->b(Landroid/content/Context;)V

    .line 207
    const/4 v4, 0x1

    .line 209
    :cond_1
    :goto_1
    return v4
.end method

.method public static f()V
    .locals 0

    .line 453
    return-void
.end method

.method private l()V
    .locals 1

    .line 275
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    if-nez v0, :cond_0

    .line 277
    invoke-direct {p0}, Lo/aoq;->m()V

    .line 279
    :cond_0
    return-void
.end method

.method private m()V
    .locals 2

    .line 149
    const-string v0, "HwAccountManager"

    const-string v1, "getAccountInfoFromHwId getAccountInfo."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    invoke-direct {p0}, Lo/aoq;->n()V

    .line 161
    return-void
.end method

.method private n()V
    .locals 15

    .line 321
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    if-nez v0, :cond_0

    .line 322
    new-instance v0, Lo/axr;

    invoke-direct {v0}, Lo/axr;-><init>()V

    iput-object v0, p0, Lo/aoq;->d:Lo/axr;

    .line 332
    :cond_0
    invoke-static {}, Lo/anx;->d()Ljava/lang/String;

    move-result-object v7

    .line 333
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 334
    const-string v0, "HwAccountManager"

    const-string v1, "getAccountInfoFromHwId:userId is null!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    const-string v0, "getAccountInfoFromHwId: userId is null!"

    invoke-static {v0}, Lo/bpj;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 337
    :cond_1
    invoke-direct {p0, v7}, Lo/aoq;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 338
    return-void

    .line 342
    :cond_2
    :goto_0
    invoke-static {}, Lo/anx;->a()Ljava/lang/String;

    move-result-object v8

    .line 343
    const-string v0, "HwAccountManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "serviceToken :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 345
    const-string v0, "HwAccountManager"

    const-string v1, "getAccountInfoFromHwId:serviceToken is null!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    const-string v0, "getAccountInfoFromHwId:serviceToken is null!"

    invoke-static {v0}, Lo/bpj;->e(Ljava/lang/String;)V

    .line 352
    :cond_3
    const-string v9, "HWUserProfileMgr"

    .line 354
    const-string v10, "0"

    .line 355
    invoke-direct {p0, v10}, Lo/aoq;->c(Ljava/lang/String;)I

    move-result v11

    .line 356
    invoke-direct {p0}, Lo/aoq;->o()Ljava/lang/String;

    move-result-object v12

    .line 357
    const-string v0, "HwAccountManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getAccountInfoFromHwId: deviceId is :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 359
    const-string v0, "HwAccountManager"

    const-string v1, "getAccountInfoFromHwId: deviceId is null!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    const-string v0, "getAccountInfoFromHwId: deviceId is null!"

    invoke-static {v0}, Lo/bpj;->e(Ljava/lang/String;)V

    .line 363
    :cond_4
    invoke-static {}, Lo/anx;->b()I

    move-result v13

    .line 364
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    if-nez v0, :cond_5

    .line 365
    new-instance v0, Lo/axr;

    invoke-direct {v0}, Lo/axr;-><init>()V

    iput-object v0, p0, Lo/aoq;->d:Lo/axr;

    .line 367
    :cond_5
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    move-object v1, v9

    move-object v2, v8

    move-object v3, v12

    move v4, v11

    move v5, v13

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/axr;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V

    .line 368
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    new-instance v1, Lo/aoq$2;

    invoke-direct {v1, p0}, Lo/aoq$2;-><init>(Lo/aoq;)V

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->getCountryCode(Lo/dcx;)Ljava/lang/String;

    move-result-object v14

    .line 374
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    if-eqz v0, :cond_6

    .line 375
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    invoke-virtual {v0, v14}, Lo/axr;->b(Ljava/lang/String;)V

    .line 377
    :cond_6
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 378
    const-string v0, "HwAccountManager"

    const-string v1, "countryIsoCode is empty!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    :cond_7
    return-void
.end method

.method private o()Ljava/lang/String;
    .locals 2

    .line 393
    const/4 v1, 0x0

    .line 394
    invoke-static {}, Lo/anx;->c()Ljava/lang/String;

    move-result-object v1

    .line 395
    return-object v1
.end method


# virtual methods
.method public a()J
    .locals 4

    .line 249
    const-wide/16 v2, 0x0

    .line 251
    invoke-direct {p0}, Lo/aoq;->l()V

    .line 253
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    invoke-virtual {v0}, Lo/axr;->b()J

    move-result-wide v2

    .line 257
    :cond_0
    return-wide v2
.end method

.method public b()Lo/axr;
    .locals 1

    .line 229
    invoke-direct {p0}, Lo/aoq;->l()V

    .line 231
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    return-object v0
.end method

.method public c()V
    .locals 1

    .line 240
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aoq;->d:Lo/axr;

    .line 241
    return-void
.end method

.method public d()Lo/axr;
    .locals 1

    .line 236
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    return-object v0
.end method

.method public d(Landroid/app/Activity;)V
    .locals 1

    .line 510
    invoke-virtual {p0}, Lo/aoq;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 511
    invoke-virtual {p0, p1}, Lo/aoq;->e(Landroid/app/Activity;)V

    .line 513
    :cond_0
    return-void
.end method

.method public e(Landroid/app/Activity;)V
    .locals 2

    .line 461
    const-string v0, "HwAccountManager"

    const-string v1, "verifySimCardChangePassword"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 463
    return-void
.end method

.method public g()Lo/axr;
    .locals 1

    .line 267
    invoke-direct {p0}, Lo/aoq;->m()V

    .line 268
    iget-object v0, p0, Lo/aoq;->d:Lo/axr;

    return-object v0
.end method

.method public h()Z
    .locals 3

    .line 287
    invoke-static {}, Lo/anx;->e()Z

    move-result v2

    .line 290
    if-nez v2, :cond_0

    .line 291
    const-string v0, "HwAccountManager"

    const-string v1, "has login HWAccount result:false"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    :cond_0
    return v2
.end method

.method public i()Z
    .locals 1

    .line 305
    const/4 v0, 0x0

    return v0
.end method

.method public k()V
    .locals 0

    .line 431
    return-void
.end method
