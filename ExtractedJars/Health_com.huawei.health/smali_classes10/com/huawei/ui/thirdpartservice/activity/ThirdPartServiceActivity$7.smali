.class Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V
    .locals 0

    .line 254
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$7;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Boolean;Ljava/lang/String;Z)V
    .locals 17

    .line 257
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() isSuccess="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() text="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$7;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->a()V

    .line 260
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 261
    if-eqz p3, :cond_3

    .line 262
    const/4 v5, 0x0

    .line 266
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;

    move-object/from16 v2, p2

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;

    .line 267
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() qqAuthorizeTokenResult = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() qqAuthorizeTokenResult.getThirdUserToken() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->getThirdUserToken()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    invoke-virtual {v8}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->getThirdUserToken()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 271
    invoke-virtual {v8}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->getThirdUserToken()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->getExpireTime()I

    move-result v5

    .line 272
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() expireTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    invoke-virtual {v8}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->getThirdUserToken()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->getLastModifyTime()Ljava/lang/String;

    move-result-object v6

    .line 274
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() strLastModifyTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    invoke-virtual {v8}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->getThirdUserToken()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->isValid()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 276
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() isValid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 279
    const-wide/16 v11, 0x0

    .line 280
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() curTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 283
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    .line 285
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 286
    sub-long v0, v9, v11

    const-wide/16 v2, 0x3e8

    div-long v13, v0, v2

    .line 287
    int-to-long v0, v5

    cmp-long v0, v13, v0

    if-gtz v0, :cond_1

    .line 288
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() usedTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", expireTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    new-instance v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$7;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;-><init>(Landroid/content/Context;)V

    move-object v15, v0

    .line 291
    invoke-virtual {v15}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;->get()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;

    move-result-object v16

    .line 293
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_1

    .line 294
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startQQHealthActivity get qqHealthTable="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getNickName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    .line 296
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwCloudManagerQQ getAuthorizeToken() isQQTokenValid = true\uff0cend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 302
    :cond_1
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() isQQTokenValid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    goto :goto_0

    .line 304
    :cond_2
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwCloudManagerQQ getAuthorizeToken() ,qqAuthorizeTokenResult.getThirdUserToken() is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 307
    :goto_0
    goto :goto_1

    .line 308
    :cond_3
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwCloudManagerQQ getAuthorizeToken() ,not success!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 313
    new-instance v5, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$7;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 314
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$7;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    const/4 v1, 0x4

    invoke-virtual {v0, v5, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 315
    goto :goto_2

    .line 317
    :cond_4
    new-instance v5, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$7;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 318
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$7;->c:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    const/4 v1, 0x4

    invoke-virtual {v0, v5, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 320
    :goto_2
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 254
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$7;->c(Ljava/lang/Boolean;Ljava/lang/String;Z)V

    return-void
.end method
