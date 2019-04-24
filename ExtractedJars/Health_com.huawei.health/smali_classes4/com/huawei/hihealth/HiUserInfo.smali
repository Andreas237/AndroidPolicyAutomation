.class public Lcom/huawei/hihealth/HiUserInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final BIRTHDAY_DEFAULT:I = 0x12fa981

.field public static final CREATE_TIME_DEFAULT:I = 0x1

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiUserInfo;>;"
        }
    .end annotation
.end field

.field public static final DATA_ALL:I = 0x0

.field public static final DATA_CLOUD:I = 0x30000000

.field public static final DP_DATA_ONLY:I = 0x20000000

.field public static final GENDER_DEFAULT:I = 0x1

.field public static final GENDER_FEMALE:I = 0x0

.field public static final GENDER_MALE:I = 0x1

.field public static final GENDER_SECRET:I = 0x2

.field public static final GENDER_UNKNOWN:I = -0x1

.field public static final HEIGHT_DEFAULT:I = 0xaa

.field private static final TAG:Ljava/lang/String; = "HiUserInfo"

.field public static final UNIT_CM_KG:I = 0x0

.field public static final UNIT_DEFAULT:I = 0x0

.field public static final UNIT_FT_LB:I = 0x1

.field public static final UNIT_UNKNOWN:I = -0x1

.field public static final UP_DATA_ONLY:I = 0x10000000

.field public static final USER_MGR:I = 0x40000000

.field public static final USER_NORMAL:I = 0x0

.field public static final WEIGHT_DEFAULT:F = 60.0f


# instance fields
.field private age:I

.field private birthday:I

.field private createTime:J

.field private email:Ljava/lang/String;

.field private gender:I

.field private headImgUrl:Ljava/lang/String;

.field private height:I

.field private huid:Ljava/lang/String;

.field private mobile:Ljava/lang/String;

.field private modifiedIntent:I

.field private name:Ljava/lang/String;

.field private owerID:I

.field private relateType:I

.field private unitType:I

.field private user:I

.field private weight:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 195
    new-instance v0, Lcom/huawei/hihealth/HiUserInfo$5;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiUserInfo$5;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiUserInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->user:I

    .line 89
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->modifiedIntent:I

    .line 110
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->gender:I

    .line 112
    const v0, 0x12fa981

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->birthday:I

    .line 117
    const/16 v0, 0xaa

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->height:I

    .line 122
    const/high16 v0, 0x42700000    # 60.0f

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->weight:F

    .line 147
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiUserInfo;->createTime:J

    .line 152
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->unitType:I

    .line 161
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->user:I

    .line 89
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->modifiedIntent:I

    .line 110
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->gender:I

    .line 112
    const v0, 0x12fa981

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->birthday:I

    .line 117
    const/16 v0, 0xaa

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->height:I

    .line 122
    const/high16 v0, 0x42700000    # 60.0f

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->weight:F

    .line 147
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiUserInfo;->createTime:J

    .line 152
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->unitType:I

    .line 165
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->owerID:I

    .line 166
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->huid:Ljava/lang/String;

    .line 167
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->name:Ljava/lang/String;

    .line 168
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->gender:I

    .line 169
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->birthday:I

    .line 171
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 172
    const/high16 v0, 0x40000000    # 2.0f

    and-int/2addr v0, v2

    if-eqz v0, :cond_0

    .line 173
    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->user:I

    .line 176
    :cond_0
    const/high16 v0, 0x20000000

    and-int/2addr v0, v2

    if-nez v0, :cond_1

    const/high16 v0, 0x10000000

    and-int/2addr v0, v2

    const/high16 v1, 0x10000000

    if-ne v0, v1, :cond_1

    .line 177
    const/high16 v0, 0x10000000

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->modifiedIntent:I

    goto :goto_0

    .line 178
    :cond_1
    const/high16 v0, 0x20000000

    and-int/2addr v0, v2

    const/high16 v1, 0x20000000

    if-ne v0, v1, :cond_2

    const/high16 v0, 0x10000000

    and-int/2addr v0, v2

    if-nez v0, :cond_2

    .line 179
    const/high16 v0, 0x20000000

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->modifiedIntent:I

    goto :goto_0

    .line 181
    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->modifiedIntent:I

    .line 184
    :goto_0
    const v0, 0xffff

    and-int/2addr v0, v2

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->height:I

    .line 185
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->weight:F

    .line 186
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->age:I

    .line 187
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->email:Ljava/lang/String;

    .line 188
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->mobile:Ljava/lang/String;

    .line 189
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->headImgUrl:Ljava/lang/String;

    .line 190
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->unitType:I

    .line 191
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiUserInfo;->relateType:I

    .line 192
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiUserInfo;->createTime:J

    .line 193
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 340
    const/4 v0, 0x0

    return v0
.end method

.method public getAge()I
    .locals 3

    .line 324
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->age:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->age:I

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    div-int/lit16 v0, v0, 0x2710

    iget v1, p0, Lcom/huawei/hihealth/HiUserInfo;->birthday:I

    div-int/lit16 v1, v1, 0x2710

    sub-int/2addr v0, v1

    :goto_0
    return v0
.end method

.method public getBirthday()I
    .locals 1

    .line 239
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->birthday:I

    return v0
.end method

.method public getCreateTime()J
    .locals 2

    .line 330
    iget-wide v0, p0, Lcom/huawei/hihealth/HiUserInfo;->createTime:J

    return-wide v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getGender()I
    .locals 1

    .line 229
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->gender:I

    return v0
.end method

.method public getHeadImgUrl()Ljava/lang/String;
    .locals 1

    .line 289
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->headImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 249
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->height:I

    return v0
.end method

.method public getHuid()Ljava/lang/String;
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->huid:Ljava/lang/String;

    return-object v0
.end method

.method public getMobile()Ljava/lang/String;
    .locals 1

    .line 279
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->mobile:Ljava/lang/String;

    return-object v0
.end method

.method public getModifiedIntent()I
    .locals 1

    .line 376
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->modifiedIntent:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 219
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOwerID()I
    .locals 1

    .line 316
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->owerID:I

    return v0
.end method

.method public getRelateType()I
    .locals 1

    .line 308
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->relateType:I

    return v0
.end method

.method public getUnitType()I
    .locals 1

    .line 299
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->unitType:I

    return v0
.end method

.method public getUser()I
    .locals 1

    .line 387
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->user:I

    return v0
.end method

.method public getWeight()F
    .locals 1

    .line 259
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->weight:F

    return v0
.end method

.method public initFunctionAv()V
    .locals 0

    .line 395
    return-void
.end method

.method public initFunctionBv()V
    .locals 0

    .line 399
    return-void
.end method

.method public initFunctionCv()V
    .locals 0

    .line 403
    return-void
.end method

.method public initFunctionDv()V
    .locals 0

    .line 407
    return-void
.end method

.method public setAge(I)V
    .locals 0

    .line 327
    iput p1, p0, Lcom/huawei/hihealth/HiUserInfo;->age:I

    return-void
.end method

.method public setBirthday(I)V
    .locals 0

    .line 244
    iput p1, p0, Lcom/huawei/hihealth/HiUserInfo;->birthday:I

    .line 245
    return-void
.end method

.method public setCreateTime(J)V
    .locals 2

    .line 334
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    return-void

    .line 335
    :cond_0
    iput-wide p1, p0, Lcom/huawei/hihealth/HiUserInfo;->createTime:J

    .line 336
    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 274
    iput-object p1, p0, Lcom/huawei/hihealth/HiUserInfo;->email:Ljava/lang/String;

    .line 275
    return-void
.end method

.method public setGender(I)V
    .locals 0

    .line 234
    iput p1, p0, Lcom/huawei/hihealth/HiUserInfo;->gender:I

    .line 235
    return-void
.end method

.method public setHeadImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/huawei/hihealth/HiUserInfo;->headImgUrl:Ljava/lang/String;

    .line 295
    return-void
.end method

.method public setHeight(I)V
    .locals 0

    .line 254
    iput p1, p0, Lcom/huawei/hihealth/HiUserInfo;->height:I

    .line 255
    return-void
.end method

.method public setHuid(Ljava/lang/String;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/huawei/hihealth/HiUserInfo;->huid:Ljava/lang/String;

    .line 215
    return-void
.end method

.method public setMobile(Ljava/lang/String;)V
    .locals 0

    .line 284
    iput-object p1, p0, Lcom/huawei/hihealth/HiUserInfo;->mobile:Ljava/lang/String;

    .line 285
    return-void
.end method

.method public setModifiedIntent(I)V
    .locals 0

    .line 372
    iput p1, p0, Lcom/huawei/hihealth/HiUserInfo;->modifiedIntent:I

    .line 373
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/huawei/hihealth/HiUserInfo;->name:Ljava/lang/String;

    .line 225
    return-void
.end method

.method public setOwerID(I)V
    .locals 0

    .line 320
    iput p1, p0, Lcom/huawei/hihealth/HiUserInfo;->owerID:I

    .line 321
    return-void
.end method

.method public setRelateType(I)V
    .locals 0

    .line 312
    iput p1, p0, Lcom/huawei/hihealth/HiUserInfo;->relateType:I

    .line 313
    return-void
.end method

.method public setUnitType(I)V
    .locals 0

    .line 304
    iput p1, p0, Lcom/huawei/hihealth/HiUserInfo;->unitType:I

    .line 305
    return-void
.end method

.method public setUser(I)V
    .locals 0

    .line 383
    iput p1, p0, Lcom/huawei/hihealth/HiUserInfo;->user:I

    .line 384
    return-void
.end method

.method public setWeight(F)V
    .locals 0

    .line 264
    iput p1, p0, Lcom/huawei/hihealth/HiUserInfo;->weight:F

    .line 265
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 363
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HiUserInfo{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 364
    const-string v0, ", owerID="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiUserInfo;->owerID:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 365
    const-string v0, ", relateType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiUserInfo;->relateType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 366
    const-string v0, ", createTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiUserInfo;->createTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 367
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 368
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 345
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->owerID:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 346
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->huid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 347
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 348
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->gender:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 349
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->birthday:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 350
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->height:I

    iget v1, p0, Lcom/huawei/hihealth/HiUserInfo;->user:I

    or-int/2addr v0, v1

    iget v1, p0, Lcom/huawei/hihealth/HiUserInfo;->modifiedIntent:I

    or-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 351
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->weight:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 352
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->age:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 353
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->email:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->mobile:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 355
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserInfo;->headImgUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 356
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->unitType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 357
    iget v0, p0, Lcom/huawei/hihealth/HiUserInfo;->relateType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 358
    iget-wide v0, p0, Lcom/huawei/hihealth/HiUserInfo;->createTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 359
    return-void
.end method
