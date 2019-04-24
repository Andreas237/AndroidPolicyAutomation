.class public Lcom/huawei/hihealthservice/old/model/UserInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final BIRTHDAY_DATE_FORMAT:Ljava/lang/String; = "yyyyMMdd"

.field public static final BIRTHDAY_DEFAULT:I = 0x12fa981

.field public static final GENDER_DEFAULT:I = 0x1

.field public static final GENDER_FEMALE:I = 0x0

.field public static final GENDER_MALE:I = 0x1

.field public static final GENDER_UNKNOWN:I = -0x1

.field public static final HEIGHT_DEFAULT:I = 0xaa

.field public static final UNIT_CM_KG:I = 0x0

.field public static final UNIT_DEFAULT:I = 0x0

.field public static final UNIT_FT_LB:I = 0x1

.field public static final UNIT_UNKNOWN:I = -0x1

.field public static final WEIGHT_DEFAULT:F = 60.0f

.field private static final serialVersionUID:J = -0x18f946a6d9e51559L


# instance fields
.field private birthday:I

.field private email:Ljava/lang/String;

.field private gender:I

.field private headImgUrl:Ljava/lang/String;

.field private height:I

.field private mobile:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private unitType:I

.field private userId:Ljava/lang/String;

.field private weight:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->gender:I

    .line 67
    const v0, 0x12fa981

    iput v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->birthday:I

    .line 69
    const/16 v0, 0xaa

    iput v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->height:I

    .line 71
    const/high16 v0, 0x42700000    # 60.0f

    iput v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->weight:F

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->unitType:I

    return-void
.end method

.method public static getAgeWithBirthday(I)I
    .locals 4

    .line 202
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    .line 203
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 204
    invoke-static {v2, v3}, Lcom/huawei/hihealthservice/old/model/UserInfo;->getAgeWithBirthday(Ljava/lang/String;Ljava/text/DateFormat;)I

    move-result v0

    return v0
.end method

.method public static getAgeWithBirthday(Ljava/lang/String;Ljava/text/DateFormat;)I
    .locals 6

    .line 218
    const/4 v2, -0x1

    .line 219
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 223
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    .line 226
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 227
    invoke-virtual {v4, v3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 229
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 232
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Ljava/util/Calendar;->get(I)I
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    sub-int/2addr v0, v1

    move v2, v0

    .line 238
    goto :goto_0

    .line 234
    :catch_0
    move-exception v3

    .line 241
    :cond_0
    :goto_0
    return v2
.end method


# virtual methods
.method public getBirthday()I
    .locals 1

    .line 114
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->birthday:I

    return v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getGender()I
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->gender:I

    return v0
.end method

.method public getHeadImgUrl()Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->headImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 124
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->height:I

    return v0
.end method

.method public getMobile()Ljava/lang/String;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->mobile:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getUnitType()I
    .locals 1

    .line 174
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->unitType:I

    return v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public getWeight()F
    .locals 1

    .line 134
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->weight:F

    return v0
.end method

.method public initFunctionAa()V
    .locals 0

    .line 249
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 253
    return-void
.end method

.method public initFunctionCc()V
    .locals 0

    .line 257
    return-void
.end method

.method public initFunctionDd()V
    .locals 0

    .line 261
    return-void
.end method

.method public setBirthday(I)V
    .locals 0

    .line 119
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->birthday:I

    .line 120
    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->email:Ljava/lang/String;

    .line 150
    return-void
.end method

.method public setGender(I)V
    .locals 0

    .line 109
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->gender:I

    .line 110
    return-void
.end method

.method public setHeadImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->headImgUrl:Ljava/lang/String;

    .line 170
    return-void
.end method

.method public setHeight(I)V
    .locals 0

    .line 129
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->height:I

    .line 130
    return-void
.end method

.method public setMobile(Ljava/lang/String;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->mobile:Ljava/lang/String;

    .line 160
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->name:Ljava/lang/String;

    .line 100
    return-void
.end method

.method public setUnitType(I)V
    .locals 0

    .line 179
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->unitType:I

    .line 180
    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->userId:Ljava/lang/String;

    .line 90
    return-void
.end method

.method public setWeight(F)V
    .locals 0

    .line 139
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->weight:F

    .line 140
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserInfo [name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gender="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->gender:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", birthday="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->birthday:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->weight:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", email="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->email:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mobile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->mobile:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", headImgUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->headImgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", unitType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/UserInfo;->unitType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
