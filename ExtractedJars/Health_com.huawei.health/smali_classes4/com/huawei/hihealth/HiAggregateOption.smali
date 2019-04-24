.class public Lcom/huawei/hihealth/HiAggregateOption;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiAggregateOption;>;"
        }
    .end annotation
.end field


# instance fields
.field private aggregateType:I

.field private alignType:I

.field private anchor:I

.field private constantsKey:[Ljava/lang/String;

.field private count:I

.field private deviceUUID:Ljava/lang/String;

.field private endTime:J

.field private filter:Ljava/lang/String;

.field private groupUnitSize:I

.field private groupUnitType:I

.field private ownerID:I

.field private readType:I

.field private sortName:Ljava/lang/String;

.field private sortOrder:I

.field private startTime:J

.field private type:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 191
    new-instance v0, Lcom/huawei/hihealth/HiAggregateOption$5;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiAggregateOption$5;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiAggregateOption;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->startTime:J

    .line 174
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->endTime:J

    .line 175
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->type:[I

    .line 176
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->constantsKey:[Ljava/lang/String;

    .line 177
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->alignType:I

    .line 178
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->aggregateType:I

    .line 179
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->filter:Ljava/lang/String;

    .line 180
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->deviceUUID:Ljava/lang/String;

    .line 181
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->ownerID:I

    .line 182
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->sortName:Ljava/lang/String;

    .line 183
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->sortOrder:I

    .line 184
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->groupUnitSize:I

    .line 185
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->groupUnitType:I

    .line 186
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->readType:I

    .line 187
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->anchor:I

    .line 188
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->count:I

    .line 189
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 367
    const/4 v0, 0x0

    return v0
.end method

.method public getAggregateType()I
    .locals 1

    .line 290
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->aggregateType:I

    return v0
.end method

.method public getAlignType()I
    .locals 1

    .line 282
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->alignType:I

    return v0
.end method

.method public getAnchor()I
    .locals 1

    .line 236
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->anchor:I

    return v0
.end method

.method public getConstantsKey()[Ljava/lang/String;
    .locals 2

    .line 267
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->constantsKey:[Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 268
    const/4 v0, 0x0

    return-object v0

    .line 270
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->constantsKey:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 244
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->count:I

    return v0
.end method

.method public getDeviceUUID()Ljava/lang/String;
    .locals 1

    .line 306
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->deviceUUID:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()J
    .locals 2

    .line 228
    iget-wide v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->endTime:J

    return-wide v0
.end method

.method public getFilter()Ljava/lang/String;
    .locals 1

    .line 298
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->filter:Ljava/lang/String;

    return-object v0
.end method

.method public getGroupUnitSize()I
    .locals 1

    .line 204
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->groupUnitSize:I

    return v0
.end method

.method public getGroupUnitType()I
    .locals 1

    .line 212
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->groupUnitType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getOwnerID()I
    .locals 1

    .line 314
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->ownerID:I

    return v0
.end method

.method public getReadType()I
    .locals 1

    .line 338
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->readType:I

    return v0
.end method

.method public getSortName()Ljava/lang/String;
    .locals 1

    .line 322
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->sortName:Ljava/lang/String;

    return-object v0
.end method

.method public getSortOrder()I
    .locals 1

    .line 330
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->sortOrder:I

    return v0
.end method

.method public getStartTime()J
    .locals 2

    .line 220
    iget-wide v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->startTime:J

    return-wide v0
.end method

.method public getType()[I
    .locals 2

    .line 252
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->type:[I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 253
    const/4 v0, 0x0

    return-object v0

    .line 255
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->type:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public setAggregateType(I)V
    .locals 1

    .line 294
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->aggregateType:I

    .line 295
    return-void
.end method

.method public setAlignType(I)V
    .locals 0

    .line 286
    iput p1, p0, Lcom/huawei/hihealth/HiAggregateOption;->alignType:I

    .line 287
    return-void
.end method

.method public setAnchor(I)V
    .locals 0

    .line 240
    iput p1, p0, Lcom/huawei/hihealth/HiAggregateOption;->anchor:I

    .line 241
    return-void
.end method

.method public setConstantsKey([Ljava/lang/String;)V
    .locals 1

    .line 274
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 275
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->constantsKey:[Ljava/lang/String;

    .line 276
    return-void

    .line 278
    :cond_0
    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->constantsKey:[Ljava/lang/String;

    .line 279
    return-void
.end method

.method public setCount(I)V
    .locals 0

    .line 248
    iput p1, p0, Lcom/huawei/hihealth/HiAggregateOption;->count:I

    .line 249
    return-void
.end method

.method public setDeviceUUID(Ljava/lang/String;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lcom/huawei/hihealth/HiAggregateOption;->deviceUUID:Ljava/lang/String;

    .line 311
    return-void
.end method

.method public setEndTime(J)V
    .locals 2

    .line 232
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->endTime:J

    .line 233
    return-void
.end method

.method public setFilter(Ljava/lang/String;)V
    .locals 1

    .line 302
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->filter:Ljava/lang/String;

    .line 303
    return-void
.end method

.method public setGroupUnitSize(I)V
    .locals 1

    .line 208
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->groupUnitSize:I

    .line 209
    return-void
.end method

.method public setGroupUnitType(I)V
    .locals 1

    .line 216
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->groupUnitType:I

    .line 217
    return-void
.end method

.method public setOwnerID(I)V
    .locals 0

    .line 318
    iput p1, p0, Lcom/huawei/hihealth/HiAggregateOption;->ownerID:I

    .line 319
    return-void
.end method

.method public setReadType(I)V
    .locals 1

    .line 342
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->readType:I

    .line 343
    return-void
.end method

.method public setSort(Ljava/lang/String;I)V
    .locals 0

    .line 347
    iput-object p1, p0, Lcom/huawei/hihealth/HiAggregateOption;->sortName:Ljava/lang/String;

    .line 348
    iput p2, p0, Lcom/huawei/hihealth/HiAggregateOption;->sortOrder:I

    .line 349
    return-void
.end method

.method public setSortName(Ljava/lang/String;)V
    .locals 0

    .line 326
    iput-object p1, p0, Lcom/huawei/hihealth/HiAggregateOption;->sortName:Ljava/lang/String;

    .line 327
    return-void
.end method

.method public setSortOrder(I)V
    .locals 1

    .line 334
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->sortOrder:I

    .line 335
    return-void
.end method

.method public setStartTime(J)V
    .locals 2

    .line 224
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->startTime:J

    .line 225
    return-void
.end method

.method public setTimeGroup(JJII)V
    .locals 0

    .line 359
    iput-wide p1, p0, Lcom/huawei/hihealth/HiAggregateOption;->startTime:J

    .line 360
    iput-wide p3, p0, Lcom/huawei/hihealth/HiAggregateOption;->endTime:J

    .line 361
    iput p5, p0, Lcom/huawei/hihealth/HiAggregateOption;->groupUnitSize:I

    .line 362
    iput p6, p0, Lcom/huawei/hihealth/HiAggregateOption;->groupUnitType:I

    .line 363
    return-void
.end method

.method public setTimeRange(JJ)V
    .locals 0

    .line 353
    iput-wide p1, p0, Lcom/huawei/hihealth/HiAggregateOption;->startTime:J

    .line 354
    iput-wide p3, p0, Lcom/huawei/hihealth/HiAggregateOption;->endTime:J

    .line 355
    return-void
.end method

.method public setType([I)V
    .locals 1

    .line 259
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 260
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->type:[I

    .line 261
    return-void

    .line 263
    :cond_0
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->type:[I

    .line 264
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 392
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HiAggregateOption{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 393
    const-string v0, "startTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiAggregateOption;->startTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 394
    const-string v0, ", endTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiAggregateOption;->endTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 395
    const-string v0, ", type="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 396
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->type:[I

    if-nez v0, :cond_0

    .line 397
    const-string v0, "null"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 399
    :cond_0
    const/16 v0, 0x5b

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 400
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->type:[I

    array-length v0, v0

    if-ge v4, v0, :cond_2

    .line 401
    if-nez v4, :cond_1

    const-string v0, ""

    goto :goto_1

    :cond_1
    const-string v0, ", "

    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiAggregateOption;->type:[I

    aget v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 400
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 402
    :cond_2
    const/16 v0, 0x5d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 405
    :goto_2
    const-string v0, ", alignType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiAggregateOption;->alignType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 406
    const-string v0, ", aggregateType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiAggregateOption;->aggregateType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 408
    const-string v0, ", groupUnitType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiAggregateOption;->groupUnitType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 415
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 416
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 372
    iget-wide v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->startTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 373
    iget-wide v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->endTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 374
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->type:[I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 375
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->constantsKey:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 376
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->alignType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 377
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->aggregateType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 378
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->filter:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 379
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->deviceUUID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 380
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->ownerID:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 381
    iget-object v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->sortName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 382
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->sortOrder:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 383
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->groupUnitSize:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 384
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->groupUnitType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 385
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->readType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 386
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->anchor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 387
    iget v0, p0, Lcom/huawei/hihealth/HiAggregateOption;->count:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 388
    return-void
.end method
