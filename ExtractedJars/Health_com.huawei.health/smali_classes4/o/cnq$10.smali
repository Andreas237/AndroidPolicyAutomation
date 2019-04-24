.class Lo/cnq$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;->b(Lcom/huawei/hihealth/HiAuthorizationOption;Lo/clc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/crd;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:[I

.field final synthetic e:Lcom/huawei/hihealth/HiAuthorizationOption;

.field final synthetic k:Lo/cnq;


# direct methods
.method constructor <init>(Lo/cnq;ILjava/lang/String;Lcom/huawei/hihealth/HiAuthorizationOption;[ILo/crd;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lo/cnq$10;->k:Lo/cnq;

    iput p2, p0, Lo/cnq$10;->a:I

    iput-object p3, p0, Lo/cnq$10;->c:Ljava/lang/String;

    iput-object p4, p0, Lo/cnq$10;->e:Lcom/huawei/hihealth/HiAuthorizationOption;

    iput-object p5, p0, Lo/cnq$10;->d:[I

    iput-object p6, p0, Lo/cnq$10;->b:Lo/crd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 15

    .line 246
    const-string v6, ""

    .line 247
    const-string v7, ""

    .line 248
    const/4 v8, 0x0

    .line 249
    iget v0, p0, Lo/cnq$10;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 251
    const/4 v8, 0x1

    .line 253
    invoke-static {}, Lo/cra;->c()Lo/cra;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$10;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/cra;->a(Ljava/lang/String;)Lcom/huawei/hihealthservice/auth/WhiteListApp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/auth/WhiteListApp;->getAppId()Ljava/lang/String;

    move-result-object v6

    .line 254
    invoke-static {}, Lo/cra;->c()Lo/cra;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$10;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/cra;->a(Ljava/lang/String;)Lcom/huawei/hihealthservice/auth/WhiteListApp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/auth/WhiteListApp;->getAccessToken()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 255
    :cond_0
    iget-object v0, p0, Lo/cnq$10;->e:Lcom/huawei/hihealth/HiAuthorizationOption;

    if-eqz v0, :cond_1

    .line 257
    iget-object v0, p0, Lo/cnq$10;->e:Lcom/huawei/hihealth/HiAuthorizationOption;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAuthorizationOption;->getAppId()Ljava/lang/String;

    move-result-object v6

    .line 258
    iget-object v0, p0, Lo/cnq$10;->e:Lcom/huawei/hihealth/HiAuthorizationOption;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAuthorizationOption;->getAccessToken()Ljava/lang/String;

    move-result-object v7

    .line 260
    :cond_1
    :goto_0
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization at = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget-object v0, p0, Lo/cnq$10;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    iput-object v7, v0, Lo/cnw;->c:Ljava/lang/String;

    .line 262
    const/4 v9, 0x0

    .line 264
    const-string v0, "UTF-8"

    :try_start_0
    invoke-static {v7, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v9, v0

    .line 267
    goto :goto_1

    .line 265
    :catch_0
    move-exception v10

    .line 266
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization UnsupportedEncodingException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    :goto_1
    iget-object v0, p0, Lo/cnq$10;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnw;->b()Ljava/lang/String;

    move-result-object v10

    .line 270
    invoke-static {v10}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 271
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization who is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    iget-object v0, p0, Lo/cnq$10;->d:[I

    const/16 v1, 0x18

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 273
    return-void

    .line 275
    :cond_2
    iget-object v0, p0, Lo/cnq$10;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$10;->b:Lo/crd;

    invoke-virtual {v0, v10, v1}, Lo/cnw;->c(Ljava/lang/String;Lo/crd;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v11

    .line 276
    iget-object v0, p0, Lo/cnq$10;->k:Lo/cnq;

    iget-object v1, p0, Lo/cnq$10;->b:Lo/crd;

    invoke-static {v0, v7, v11, v1}, Lo/cnq;->d(Lo/cnq;Ljava/lang/String;Lcom/huawei/hihealth/HiAccountInfo;Lo/crd;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 277
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiAccountInfo;->getExpiresIn()J

    move-result-wide v12

    .line 278
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization atValidTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    cmp-long v0, v0, v12

    if-gtz v0, :cond_3

    .line 280
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization accessToken is valid expire_in = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " appID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cnq$10;->b:Lo/crd;

    .line 281
    invoke-virtual {v2}, Lo/crd;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 280
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    iget-object v0, p0, Lo/cnq$10;->d:[I

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 283
    return-void

    .line 287
    :cond_3
    iget-object v0, p0, Lo/cnq$10;->c:Ljava/lang/String;

    invoke-static {v8, v0, v6}, Lo/cux;->d(ZLjava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealthservice/auth/HiAuthorization;

    move-result-object v12

    .line 288
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization appAuth = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    iget-object v0, p0, Lo/cnq$10;->c:Ljava/lang/String;

    invoke-static {v8, v0, v9}, Lo/cux;->b(ZLjava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealthservice/auth/HiUserAuth;

    move-result-object v13

    .line 290
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization userAuth = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v13, v1, v2

    const-string v2, ",token = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    invoke-static {v12}, Lo/cuw;->d(Lcom/huawei/hihealthservice/auth/HiAuthorization;)Ljava/util/List;

    move-result-object v14

    .line 292
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization permissionTables = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v14, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    iget-object v0, p0, Lo/cnq$10;->k:Lo/cnq;

    invoke-static {v0, v13, v14}, Lo/cnq;->b(Lo/cnq;Lcom/huawei/hihealthservice/auth/HiUserAuth;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 294
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestAuthorization userAuth = null, or permissionTables is null or empty."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    iget-object v0, p0, Lo/cnq$10;->d:[I

    const/16 v1, 0x8

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 297
    return-void

    .line 299
    :cond_4
    iget-object v0, p0, Lo/cnq$10;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$10;->c:Ljava/lang/String;

    invoke-virtual {v0, v6, v12, v1}, Lo/cnw;->d(Ljava/lang/String;Lcom/huawei/hihealthservice/auth/HiAuthorization;Ljava/lang/String;)V

    .line 300
    iget-object v0, p0, Lo/cnq$10;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    move-object v1, v7

    move-object v2, v10

    move-object v3, v11

    move-object v4, v13

    iget-object v5, p0, Lo/cnq$10;->b:Lo/crd;

    invoke-virtual/range {v0 .. v5}, Lo/cnw;->d(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hihealth/HiAccountInfo;Lcom/huawei/hihealthservice/auth/HiUserAuth;Lo/crd;)V

    .line 301
    iget-object v0, p0, Lo/cnq$10;->k:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    iget-object v1, p0, Lo/cnq$10;->b:Lo/crd;

    invoke-virtual {v0, v10, v14, v13, v1}, Lo/cnw;->d(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hihealthservice/auth/HiUserAuth;Lo/crd;)V

    .line 302
    return-void
.end method
