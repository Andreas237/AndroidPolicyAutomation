.class Lo/akt$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/akt;


# direct methods
.method constructor <init>(Lo/akt;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lo/akt$11;->b:Lo/akt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 268
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerConnectionStatusChangeNotification err_code is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    const v0, 0x186a0

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 270
    :cond_0
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerConnectionStatusChangeNotification response error or objData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    return-void

    .line 273
    :cond_1
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerConnectionStatusChangeNotification objData is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 276
    const-string v0, "product_type"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 277
    const-string v0, "product_type"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_2

    .line 278
    return-void

    .line 281
    :cond_2
    const-string v0, "deviceDisconnected"

    const-string v1, "state"

    :try_start_1
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 282
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WearAppInteractor handle deviceDisconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v0}, Lo/akt;->e(Lo/akt;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "health_deviceInstantDisconnected"

    iget-object v1, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v1}, Lo/akt;->a(Lo/akt;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 286
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akv;->b(Z)V

    .line 287
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v0}, Lo/akt;->b(Lo/akt;)V

    goto/16 :goto_0

    .line 289
    :cond_3
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter else deviceDisconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 292
    :cond_4
    const-string v0, "deviceConnected"

    const-string v1, "state"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 293
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WearAppInteractor handle deviceConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v0}, Lo/akt;->d(Lo/akt;)V

    goto/16 :goto_0

    .line 295
    :cond_5
    const-string v0, "deviceInstantDisconnected"

    const-string v1, "state"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 296
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WearAppInteractor handle deviceInstantDisconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v0}, Lo/akt;->e(Lo/akt;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 298
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v0}, Lo/akt;->b(Lo/akt;)V

    goto/16 :goto_0

    .line 300
    :cond_6
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter else deviceInstantDisconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 303
    :cond_7
    const-string v0, "deviceInstantConnected"

    const-string v1, "state"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 304
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WearAppInteractor handle deviceInstantConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v0}, Lo/akt;->d(Lo/akt;)V

    goto/16 :goto_0

    .line 306
    :cond_8
    const-string v0, "health_deviceDisconnected"

    const-string v1, "state"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 307
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WearAppInteractor handle health_deviceDisconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    const-string v1, "health_deviceDisconnected"

    invoke-static {v0, v1}, Lo/akt;->c(Lo/akt;Ljava/lang/String;)Ljava/lang/String;

    .line 310
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v0}, Lo/akt;->c(Lo/akt;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 311
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akv;->b(Z)V

    .line 312
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v0}, Lo/akt;->b(Lo/akt;)V

    goto/16 :goto_0

    .line 314
    :cond_9
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter else health_deviceDisconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 316
    :cond_a
    const-string v0, "health_deviceConnected"

    const-string v1, "state"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 317
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WearAppInteractor handle deviceConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    const-string v1, "health_deviceConnected"

    invoke-static {v0, v1}, Lo/akt;->c(Lo/akt;Ljava/lang/String;)Ljava/lang/String;

    .line 319
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v0}, Lo/akt;->d(Lo/akt;)V

    goto :goto_0

    .line 320
    :cond_b
    const-string v0, "health_deviceInstantDisconnected"

    const-string v1, "state"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 321
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WearAppInteractor handle health_deviceInstantDisconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    const-string v1, "health_deviceInstantDisconnected"

    invoke-static {v0, v1}, Lo/akt;->c(Lo/akt;Ljava/lang/String;)Ljava/lang/String;

    .line 323
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v0}, Lo/akt;->c(Lo/akt;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 324
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v0}, Lo/akt;->b(Lo/akt;)V

    goto :goto_0

    .line 326
    :cond_c
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter else deviceInstantDisconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 329
    :cond_d
    const-string v0, "health_deviceInstantConnected"

    const-string v1, "state"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 330
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    const-string v1, "health_deviceInstantConnected"

    invoke-static {v0, v1}, Lo/akt;->c(Lo/akt;Ljava/lang/String;)Ljava/lang/String;

    .line 331
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WearAppInteractor handle health_deviceInstantConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    iget-object v0, p0, Lo/akt$11;->b:Lo/akt;

    invoke-static {v0}, Lo/akt;->d(Lo/akt;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 336
    :cond_e
    :goto_0
    goto :goto_1

    .line 334
    :catch_0
    move-exception v4

    .line 335
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    :goto_1
    return-void
.end method
