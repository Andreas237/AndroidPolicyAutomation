.class public Lcom/huawei/up/model/UserInfomation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final BIRTHDAY_DEFAULT:Ljava/lang/String; = "19900801"

.field public static final BIRTHDAY_SETED:Ljava/lang/String; = "SETED"

.field public static final BIRTHDAY_UNKNOWN:Ljava/lang/String; = "UNKNOWN"

.field public static final BIRTHDAY_UNSETED:Ljava/lang/String; = "UNSETED"

.field public static final BIRTHDAY_UNSETED_USER_SEE:Ljava/lang/String; = "UNSETED_USER_SEE"

.field public static final DATA_NOT_CHANGED:I = -0x3e8

.field public static final GENDER_FEMALE:I = 0x1

.field public static final GENDER_MALE:I = 0x0

.field public static final GENDER_SECRET:I = 0x2

.field public static final GENDER_UNKNOWN:I = -0x1

.field public static final HEIGHT_DEFAULT_ENGLISH:I = 0x43

.field public static final HEIGHT_DEFAULT_METRIC:I = 0xaa

.field public static final KEY_USER_INFO:Ljava/lang/String; = "userinfo_key"

.field private static final TAG:Ljava/lang/String; = "UserInfomation"

.field public static final UNIT_TYPE_ENGLISH:I = 0x1

.field public static final UNIT_TYPE_METRIC:I = 0x0

.field public static final WEIGHT_DEFAULT_ENGLISH:I = 0x84

.field public static final WEIGHT_DEFAULT_METRIC:I = 0x3c

.field private static final serialVersionUID:J = -0x46baf4d4f4d664cL


# instance fields
.field private birthday:Ljava/lang/String;

.field private birthdayStatus:Ljava/lang/String;

.field private clientSet:I

.field private gender:I

.field private height:I

.field private languageCode:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private picPath:Ljava/lang/String;

.field private portraitUrl:Ljava/lang/String;

.field private setTime:J

.field private weight:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const-string v0, "UNKNOWN"

    iput-object v0, p0, Lcom/huawei/up/model/UserInfomation;->birthdayStatus:Ljava/lang/String;

    .line 45
    const-string v0, "19900801"

    iput-object v0, p0, Lcom/huawei/up/model/UserInfomation;->birthday:Ljava/lang/String;

    .line 51
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->gender:I

    .line 54
    const/high16 v0, 0x42700000    # 60.0f

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->weight:F

    .line 60
    const/16 v0, 0xaa

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->height:I

    .line 68
    const-string v0, "zh"

    iput-object v0, p0, Lcom/huawei/up/model/UserInfomation;->languageCode:Ljava/lang/String;

    .line 87
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->clientSet:I

    .line 89
    const/high16 v0, 0x43040000    # 132.0f

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->weight:F

    .line 90
    const/16 v0, 0x43

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->height:I

    goto :goto_0

    .line 92
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->clientSet:I

    .line 93
    const/high16 v0, 0x42700000    # 60.0f

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->weight:F

    .line 94
    const/16 v0, 0xaa

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->height:I

    .line 96
    :goto_0
    return-void
.end method

.method private transHeightUnit(III)I
    .locals 2

    .line 190
    const/4 v1, 0x0

    .line 191
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    if-nez p3, :cond_0

    .line 192
    invoke-static {p1}, Lo/dbt;->a(I)I

    move-result v1

    goto :goto_0

    .line 193
    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    .line 194
    invoke-static {p1}, Lo/dbt;->c(I)I

    move-result v1

    .line 196
    :cond_1
    :goto_0
    return v1
.end method

.method private transWeightUnit(FII)F
    .locals 2

    .line 207
    const/4 v1, 0x0

    .line 208
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    if-nez p3, :cond_0

    .line 209
    invoke-static {p1}, Lo/dbt;->c(F)F

    move-result v1

    goto :goto_0

    .line 210
    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    .line 211
    invoke-static {p1}, Lo/dbt;->e(F)I

    move-result v0

    int-to-float v1, v0

    .line 213
    :cond_1
    :goto_0
    return v1
.end method


# virtual methods
.method public copyFrom()Lcom/huawei/up/model/UserInfomation;
    .locals 3

    .line 374
    new-instance v2, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v2}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 375
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->birthdayStatus:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/up/model/UserInfomation;->birthdayStatus:Ljava/lang/String;

    .line 376
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->birthday:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/up/model/UserInfomation;->birthday:Ljava/lang/String;

    .line 377
    iget v0, p0, Lcom/huawei/up/model/UserInfomation;->gender:I

    iput v0, v2, Lcom/huawei/up/model/UserInfomation;->gender:I

    .line 378
    iget v0, p0, Lcom/huawei/up/model/UserInfomation;->weight:F

    iput v0, v2, Lcom/huawei/up/model/UserInfomation;->weight:F

    .line 379
    iget v0, p0, Lcom/huawei/up/model/UserInfomation;->height:I

    iput v0, v2, Lcom/huawei/up/model/UserInfomation;->height:I

    .line 380
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->name:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/up/model/UserInfomation;->name:Ljava/lang/String;

    .line 381
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->languageCode:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/up/model/UserInfomation;->languageCode:Ljava/lang/String;

    .line 382
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->portraitUrl:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/up/model/UserInfomation;->portraitUrl:Ljava/lang/String;

    .line 383
    iget v0, p0, Lcom/huawei/up/model/UserInfomation;->clientSet:I

    iput v0, v2, Lcom/huawei/up/model/UserInfomation;->clientSet:I

    .line 384
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->picPath:Ljava/lang/String;

    iput-object v0, v2, Lcom/huawei/up/model/UserInfomation;->picPath:Ljava/lang/String;

    .line 385
    iget-wide v0, p0, Lcom/huawei/up/model/UserInfomation;->setTime:J

    iput-wide v0, v2, Lcom/huawei/up/model/UserInfomation;->setTime:J

    .line 386
    return-object v2
.end method

.method public getAge()I
    .locals 9

    .line 129
    const/4 v4, 0x0

    .line 130
    const/4 v5, 0x0

    .line 131
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v6, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 133
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 135
    :try_start_0
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 136
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->birthday:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sub-int v0, v5, v0

    div-int/lit16 v0, v0, 0x2710
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v4, v0

    .line 139
    goto :goto_0

    .line 137
    :catch_0
    move-exception v8

    .line 138
    const-string v0, "UserInfomation"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setDataUserInfo get brithday error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    :goto_0
    return v4
.end method

.method public getBirthday()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->birthday:Ljava/lang/String;

    return-object v0
.end method

.method public getBirthdayStatus()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->birthdayStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getClientSet()I
    .locals 1

    .line 304
    iget v0, p0, Lcom/huawei/up/model/UserInfomation;->clientSet:I

    return v0
.end method

.method public getGender()I
    .locals 1

    .line 322
    iget v0, p0, Lcom/huawei/up/model/UserInfomation;->gender:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 168
    iget v0, p0, Lcom/huawei/up/model/UserInfomation;->height:I

    return v0
.end method

.method public getLanguageCode()Ljava/lang/String;
    .locals 1

    .line 292
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->languageCode:Ljava/lang/String;

    return-object v0
.end method

.method public getMetricHeight()I
    .locals 4

    .line 221
    const/4 v3, 0x0

    .line 222
    iget v0, p0, Lcom/huawei/up/model/UserInfomation;->clientSet:I

    if-nez v0, :cond_0

    .line 223
    iget v3, p0, Lcom/huawei/up/model/UserInfomation;->height:I

    goto :goto_0

    .line 225
    :cond_0
    iget v0, p0, Lcom/huawei/up/model/UserInfomation;->height:I

    iget v1, p0, Lcom/huawei/up/model/UserInfomation;->clientSet:I

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/up/model/UserInfomation;->transHeightUnit(III)I

    move-result v3

    .line 227
    :goto_0
    return v3
.end method

.method public getMetricWeight()F
    .locals 4

    .line 235
    const/4 v3, 0x0

    .line 236
    iget v0, p0, Lcom/huawei/up/model/UserInfomation;->clientSet:I

    if-nez v0, :cond_0

    .line 237
    iget v3, p0, Lcom/huawei/up/model/UserInfomation;->weight:F

    goto :goto_0

    .line 239
    :cond_0
    iget v0, p0, Lcom/huawei/up/model/UserInfomation;->weight:F

    iget v1, p0, Lcom/huawei/up/model/UserInfomation;->clientSet:I

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/up/model/UserInfomation;->transWeightUnit(FII)F

    move-result v3

    .line 241
    :goto_0
    return v3
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPicPath()Ljava/lang/String;
    .locals 1

    .line 341
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->picPath:Ljava/lang/String;

    return-object v0
.end method

.method public getPortraitUrl()Ljava/lang/String;
    .locals 1

    .line 282
    iget-object v0, p0, Lcom/huawei/up/model/UserInfomation;->portraitUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getRunStepLen()I
    .locals 2

    .line 260
    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getMetricHeight()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3f547ae1    # 0.83f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public getSetTime()J
    .locals 2

    .line 357
    iget-wide v0, p0, Lcom/huawei/up/model/UserInfomation;->setTime:J

    return-wide v0
.end method

.method public getWalkStepLen()I
    .locals 2

    .line 250
    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getMetricHeight()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3ed70a3d    # 0.42f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public getWeight()F
    .locals 1

    .line 147
    iget v0, p0, Lcom/huawei/up/model/UserInfomation;->weight:F

    return v0
.end method

.method public loadAccountData(Lcom/huawei/hihealth/HiUserInfo;)V
    .locals 4

    .line 418
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setName(Ljava/lang/String;)V

    .line 419
    const-string v0, "zh"

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setLanguageCode(Ljava/lang/String;)V

    .line 421
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v0

    const v1, 0x12fa981

    if-ne v0, v1, :cond_0

    .line 422
    const-string v0, "UNKNOWN"

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    .line 423
    const-string v0, "19900801"

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    goto :goto_0

    .line 425
    :cond_0
    const-string v0, "SETED"

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    .line 426
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    .line 429
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 430
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    goto :goto_2

    .line 431
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 432
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    goto :goto_2

    .line 434
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    .line 437
    :goto_2
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getHeadImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 438
    const-string v0, "UserInfomation"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modify headImg url not empty,modify image useful"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getHeadImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setPortraitUrl(Ljava/lang/String;)V

    .line 440
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 443
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 444
    const-string v0, "default"

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 446
    :cond_5
    return-void
.end method

.method public loadAccountData(Lcom/huawei/up/model/UserInfomation;)V
    .locals 1

    .line 451
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setName(Ljava/lang/String;)V

    .line 452
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getLanguageCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setLanguageCode(Ljava/lang/String;)V

    .line 453
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthdayStatus()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    .line 454
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    .line 455
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    .line 457
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setPortraitUrl(Ljava/lang/String;)V

    .line 458
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 460
    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 461
    const-string v0, "default"

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 463
    :cond_0
    return-void
.end method

.method public loadAccountExtData(Lcom/huawei/hihealth/HiUserInfo;)V
    .locals 4

    .line 404
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setWeight(Ljava/lang/Float;)V

    .line 405
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setHeight(Ljava/lang/Integer;)V

    .line 406
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getCreateTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/up/model/UserInfomation;->setSetTime(J)V

    .line 407
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v0

    if-nez v0, :cond_0

    .line 409
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setClientSet(Ljava/lang/Integer;)V

    goto :goto_0

    .line 411
    :cond_0
    const-string v0, "UserInfomation"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UNIT_FT_LB not stand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setClientSet(Ljava/lang/Integer;)V

    .line 414
    :goto_0
    return-void
.end method

.method public loadAccountExtData(Lcom/huawei/up/model/UserInfomation;)V
    .locals 2

    .line 466
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setHeight(Ljava/lang/Integer;)V

    .line 467
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setWeight(Ljava/lang/Float;)V

    .line 468
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getSetTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/up/model/UserInfomation;->setSetTime(J)V

    .line 469
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setClientSet(Ljava/lang/Integer;)V

    .line 470
    return-void
.end method

.method public setBirthday(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/up/model/UserInfomation;->birthday:Ljava/lang/String;

    .line 122
    return-void
.end method

.method public setBirthdayStatus(Ljava/lang/String;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/up/model/UserInfomation;->birthdayStatus:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public setClientSet(Ljava/lang/Integer;)V
    .locals 1

    .line 312
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 313
    return-void

    .line 315
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->clientSet:I

    .line 316
    return-void
.end method

.method public setGender(Ljava/lang/Integer;)V
    .locals 1

    .line 330
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 331
    return-void

    .line 333
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->gender:I

    .line 334
    return-void
.end method

.method public setHeight(Ljava/lang/Integer;)V
    .locals 1

    .line 176
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 177
    return-void

    .line 179
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->height:I

    .line 180
    return-void
.end method

.method public setLanguageCode(Ljava/lang/String;)V
    .locals 0

    .line 297
    iput-object p1, p0, Lcom/huawei/up/model/UserInfomation;->languageCode:Ljava/lang/String;

    .line 298
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lcom/huawei/up/model/UserInfomation;->name:Ljava/lang/String;

    .line 278
    return-void
.end method

.method public setPicPath(Ljava/lang/String;)V
    .locals 0

    .line 349
    iput-object p1, p0, Lcom/huawei/up/model/UserInfomation;->picPath:Ljava/lang/String;

    .line 350
    return-void
.end method

.method public setPortraitUrl(Ljava/lang/String;)V
    .locals 0

    .line 287
    iput-object p1, p0, Lcom/huawei/up/model/UserInfomation;->portraitUrl:Ljava/lang/String;

    .line 288
    return-void
.end method

.method public setSetTime(J)V
    .locals 0

    .line 365
    iput-wide p1, p0, Lcom/huawei/up/model/UserInfomation;->setTime:J

    .line 366
    return-void
.end method

.method public setWeight(Ljava/lang/Float;)V
    .locals 1

    .line 158
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 159
    return-void

    .line 161
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lcom/huawei/up/model/UserInfomation;->weight:F

    .line 162
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 369
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "birthdayStatus:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/up/model/UserInfomation;->birthdayStatus:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":birthday:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/up/model/UserInfomation;->birthday:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";gender:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/up/model/UserInfomation;->gender:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";weight:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/up/model/UserInfomation;->weight:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";height:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/up/model/UserInfomation;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";name:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/up/model/UserInfomation;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";languageCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/up/model/UserInfomation;->languageCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";portraitUrl:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/up/model/UserInfomation;->portraitUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";clientSet:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/up/model/UserInfomation;->clientSet:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ";picPath:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/up/model/UserInfomation;->picPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public transSelf2METRIC()V
    .locals 6

    .line 391
    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 392
    const-string v0, "UserInfomation"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UNIT_TYPE_ENGLISH trans to UNIT_TYPE_METRIC"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getMetricHeight()I

    move-result v4

    .line 396
    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getMetricWeight()F

    move-result v5

    .line 397
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setHeight(Ljava/lang/Integer;)V

    .line 398
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setWeight(Ljava/lang/Float;)V

    .line 399
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setClientSet(Ljava/lang/Integer;)V

    .line 401
    :cond_0
    return-void
.end method
