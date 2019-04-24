.class Lio/branch/referral/BranchLinkData;
.super Lorg/json/JSONObject;
.source "BranchLinkData.java"


# instance fields
.field private alias:Ljava/lang/String;

.field private campaign:Ljava/lang/String;

.field private channel:Ljava/lang/String;

.field private duration:I

.field private feature:Ljava/lang/String;

.field private params:Lorg/json/JSONObject;

.field private stage:Ljava/lang/String;

.field private tags:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 138
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 335
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 337
    :cond_2
    check-cast p1, Lio/branch/referral/BranchLinkData;

    .line 338
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->alias:Ljava/lang/String;

    if-nez v2, :cond_3

    .line 339
    iget-object v2, p1, Lio/branch/referral/BranchLinkData;->alias:Ljava/lang/String;

    if-eqz v2, :cond_4

    return v1

    .line 341
    :cond_3
    iget-object v3, p1, Lio/branch/referral/BranchLinkData;->alias:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    .line 343
    :cond_4
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->channel:Ljava/lang/String;

    if-nez v2, :cond_5

    .line 344
    iget-object v2, p1, Lio/branch/referral/BranchLinkData;->channel:Ljava/lang/String;

    if-eqz v2, :cond_6

    return v1

    .line 346
    :cond_5
    iget-object v3, p1, Lio/branch/referral/BranchLinkData;->channel:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    .line 348
    :cond_6
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->feature:Ljava/lang/String;

    if-nez v2, :cond_7

    .line 349
    iget-object v2, p1, Lio/branch/referral/BranchLinkData;->feature:Ljava/lang/String;

    if-eqz v2, :cond_8

    return v1

    .line 351
    :cond_7
    iget-object v3, p1, Lio/branch/referral/BranchLinkData;->feature:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    .line 353
    :cond_8
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->params:Lorg/json/JSONObject;

    if-nez v2, :cond_9

    .line 354
    iget-object v2, p1, Lio/branch/referral/BranchLinkData;->params:Lorg/json/JSONObject;

    if-eqz v2, :cond_a

    return v1

    .line 356
    :cond_9
    iget-object v3, p1, Lio/branch/referral/BranchLinkData;->params:Lorg/json/JSONObject;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    return v1

    .line 358
    :cond_a
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->stage:Ljava/lang/String;

    if-nez v2, :cond_b

    .line 359
    iget-object v2, p1, Lio/branch/referral/BranchLinkData;->stage:Ljava/lang/String;

    if-eqz v2, :cond_c

    return v1

    .line 361
    :cond_b
    iget-object v3, p1, Lio/branch/referral/BranchLinkData;->stage:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    return v1

    .line 363
    :cond_c
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->campaign:Ljava/lang/String;

    if-nez v2, :cond_d

    .line 364
    iget-object v2, p1, Lio/branch/referral/BranchLinkData;->campaign:Ljava/lang/String;

    if-eqz v2, :cond_e

    return v1

    .line 366
    :cond_d
    iget-object v3, p1, Lio/branch/referral/BranchLinkData;->campaign:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    return v1

    .line 368
    :cond_e
    iget v2, p0, Lio/branch/referral/BranchLinkData;->type:I

    iget v3, p1, Lio/branch/referral/BranchLinkData;->type:I

    if-eq v2, v3, :cond_f

    return v1

    .line 370
    :cond_f
    iget v2, p0, Lio/branch/referral/BranchLinkData;->duration:I

    iget v3, p1, Lio/branch/referral/BranchLinkData;->duration:I

    if-eq v2, v3, :cond_10

    return v1

    .line 373
    :cond_10
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->tags:Ljava/util/Collection;

    if-nez v2, :cond_11

    .line 374
    iget-object p1, p1, Lio/branch/referral/BranchLinkData;->tags:Ljava/util/Collection;

    if-eqz p1, :cond_12

    return v1

    .line 376
    :cond_11
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p1, Lio/branch/referral/BranchLinkData;->tags:Ljava/util/Collection;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v1

    :cond_12
    return v0
.end method

.method public getAlias()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lio/branch/referral/BranchLinkData;->alias:Ljava/lang/String;

    return-object v0
.end method

.method public getCampaign()Ljava/lang/String;
    .locals 1

    .line 301
    iget-object v0, p0, Lio/branch/referral/BranchLinkData;->campaign:Ljava/lang/String;

    return-object v0
.end method

.method public getChannel()Ljava/lang/String;
    .locals 1

    .line 245
    iget-object v0, p0, Lio/branch/referral/BranchLinkData;->channel:Ljava/lang/String;

    return-object v0
.end method

.method public getDuration()I
    .locals 1

    .line 225
    iget v0, p0, Lio/branch/referral/BranchLinkData;->duration:I

    return v0
.end method

.method public getFeature()Ljava/lang/String;
    .locals 1

    .line 264
    iget-object v0, p0, Lio/branch/referral/BranchLinkData;->feature:Ljava/lang/String;

    return-object v0
.end method

.method public getLinkDataJsonObject()Lorg/json/JSONObject;
    .locals 3

    .line 438
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 440
    :try_start_0
    iget-object v1, p0, Lio/branch/referral/BranchLinkData;->channel:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 441
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Channel:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v2}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->channel:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 443
    :cond_0
    iget-object v1, p0, Lio/branch/referral/BranchLinkData;->alias:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 444
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Alias:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v2}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->alias:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 446
    :cond_1
    iget-object v1, p0, Lio/branch/referral/BranchLinkData;->feature:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 447
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Feature:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v2}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->feature:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 449
    :cond_2
    iget-object v1, p0, Lio/branch/referral/BranchLinkData;->stage:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 450
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Stage:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v2}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->stage:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 452
    :cond_3
    iget-object v1, p0, Lio/branch/referral/BranchLinkData;->campaign:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 453
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Campaign:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v2}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->campaign:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 455
    :cond_4
    sget-object v1, Lio/branch/referral/Defines$LinkParam;->Tags:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v1}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/branch/referral/BranchLinkData;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 456
    sget-object v1, Lio/branch/referral/Defines$LinkParam;->Tags:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v1}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Tags:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v2}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lio/branch/referral/BranchLinkData;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 458
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Type:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v2}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lio/branch/referral/BranchLinkData;->type:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 459
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lio/branch/referral/Defines$LinkParam;->Duration:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v2}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lio/branch/referral/BranchLinkData;->duration:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public getParams()Lorg/json/JSONObject;
    .locals 1

    .line 317
    iget-object v0, p0, Lio/branch/referral/BranchLinkData;->params:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getStage()Ljava/lang/String;
    .locals 1

    .line 283
    iget-object v0, p0, Lio/branch/referral/BranchLinkData;->stage:Ljava/lang/String;

    return-object v0
.end method

.method public getTags()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 164
    iget-object v0, p0, Lio/branch/referral/BranchLinkData;->tags:Ljava/util/Collection;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 205
    iget v0, p0, Lio/branch/referral/BranchLinkData;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    .line 408
    iget v0, p0, Lio/branch/referral/BranchLinkData;->type:I

    const/16 v1, 0x13

    add-int/2addr v0, v1

    mul-int/2addr v0, v1

    .line 409
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->alias:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    .line 410
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 411
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->channel:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    .line 412
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 413
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->feature:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    .line 414
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 415
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->stage:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    .line 416
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 417
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->campaign:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    .line 418
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    .line 419
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->params:Lorg/json/JSONObject;

    if-nez v2, :cond_5

    goto :goto_5

    .line 420
    :cond_5
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    .line 421
    iget v2, p0, Lio/branch/referral/BranchLinkData;->duration:I

    add-int/2addr v0, v2

    .line 423
    iget-object v2, p0, Lio/branch/referral/BranchLinkData;->tags:Ljava/util/Collection;

    if-eqz v2, :cond_6

    .line 424
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    mul-int/2addr v0, v1

    .line 425
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    add-int/2addr v0, v3

    goto :goto_6

    :cond_6
    return v0
.end method

.method public putAlias(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 176
    iput-object p1, p0, Lio/branch/referral/BranchLinkData;->alias:Ljava/lang/String;

    .line 177
    sget-object v0, Lio/branch/referral/Defines$LinkParam;->Alias:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v0}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-void
.end method

.method public putCampaign(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 295
    iput-object p1, p0, Lio/branch/referral/BranchLinkData;->campaign:Ljava/lang/String;

    .line 296
    sget-object v0, Lio/branch/referral/Defines$LinkParam;->Campaign:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v0}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-void
.end method

.method public putChannel(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 239
    iput-object p1, p0, Lio/branch/referral/BranchLinkData;->channel:Ljava/lang/String;

    .line 240
    sget-object v0, Lio/branch/referral/Defines$LinkParam;->Channel:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v0}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-void
.end method

.method public putDuration(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-lez p1, :cond_0

    .line 219
    iput p1, p0, Lio/branch/referral/BranchLinkData;->duration:I

    .line 220
    sget-object v0, Lio/branch/referral/Defines$LinkParam;->Duration:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v0}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_0
    return-void
.end method

.method public putFeature(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 258
    iput-object p1, p0, Lio/branch/referral/BranchLinkData;->feature:Ljava/lang/String;

    .line 259
    sget-object v0, Lio/branch/referral/Defines$LinkParam;->Feature:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v0}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-void
.end method

.method public putParams(Lorg/json/JSONObject;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 312
    iput-object p1, p0, Lio/branch/referral/BranchLinkData;->params:Lorg/json/JSONObject;

    .line 313
    sget-object v0, Lio/branch/referral/Defines$LinkParam;->Data:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v0}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

.method public putStage(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 277
    iput-object p1, p0, Lio/branch/referral/BranchLinkData;->stage:Ljava/lang/String;

    .line 278
    sget-object v0, Lio/branch/referral/Defines$LinkParam;->Stage:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v0}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-void
.end method

.method public putTags(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 154
    iput-object p1, p0, Lio/branch/referral/BranchLinkData;->tags:Ljava/util/Collection;

    .line 156
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 157
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 158
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 159
    :cond_0
    sget-object p1, Lio/branch/referral/Defines$LinkParam;->Tags:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {p1}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    return-void
.end method

.method public putType(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 199
    iput p1, p0, Lio/branch/referral/BranchLinkData;->type:I

    .line 200
    sget-object v0, Lio/branch/referral/Defines$LinkParam;->Type:Lio/branch/referral/Defines$LinkParam;

    invoke-virtual {v0}, Lio/branch/referral/Defines$LinkParam;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lio/branch/referral/BranchLinkData;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_0
    return-void
.end method
