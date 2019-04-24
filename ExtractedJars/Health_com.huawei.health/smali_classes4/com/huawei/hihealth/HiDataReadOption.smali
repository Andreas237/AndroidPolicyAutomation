.class public Lcom/huawei/hihealth/HiDataReadOption;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiDataReadOption;>;"
        }
    .end annotation
.end field


# instance fields
.field private alignType:I

.field private anchor:I

.field private constantsKey:[Ljava/lang/String;

.field private count:I

.field private deviceUUID:Ljava/lang/String;

.field private endTime:J

.field private ownerID:I

.field private readType:I

.field private sortOrder:I

.field private startTime:J

.field private type:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 92
    new-instance v0, Lcom/huawei/hihealth/HiDataReadOption$1;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiDataReadOption$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiDataReadOption;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->sortOrder:I

    .line 113
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->sortOrder:I

    .line 79
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->startTime:J

    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->endTime:J

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->type:[I

    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->constantsKey:[Ljava/lang/String;

    .line 83
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->alignType:I

    .line 84
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->count:I

    .line 85
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->anchor:I

    .line 86
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->sortOrder:I

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->deviceUUID:Ljava/lang/String;

    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->ownerID:I

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->readType:I

    .line 90
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 250
    const/4 v0, 0x0

    return v0
.end method

.method public getAlignType()I
    .locals 1

    .line 188
    iget v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->alignType:I

    return v0
.end method

.method public getAnchor()I
    .locals 1

    .line 180
    iget v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->anchor:I

    return v0
.end method

.method public getConstantsKey()[Ljava/lang/String;
    .locals 2

    .line 196
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->constantsKey:[Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 197
    const/4 v0, 0x0

    return-object v0

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->constantsKey:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 171
    iget v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->count:I

    return v0
.end method

.method public getDeviceUUID()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->deviceUUID:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()J
    .locals 2

    .line 130
    iget-wide v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->endTime:J

    return-wide v0
.end method

.method public getOwnerID()I
    .locals 1

    .line 211
    iget v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->ownerID:I

    return v0
.end method

.method public getReadType()I
    .locals 1

    .line 105
    iget v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->readType:I

    return v0
.end method

.method public getSortOrder()I
    .locals 1

    .line 219
    iget v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->sortOrder:I

    return v0
.end method

.method public getStartTime()J
    .locals 2

    .line 122
    iget-wide v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->startTime:J

    return-wide v0
.end method

.method public getType()[I
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->type:[I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 139
    const/4 v0, 0x0

    return-object v0

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->type:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public setAlignType(I)V
    .locals 0

    .line 192
    iput p1, p0, Lcom/huawei/hihealth/HiDataReadOption;->alignType:I

    .line 193
    return-void
.end method

.method public setAnchor(I)V
    .locals 0

    .line 184
    iput p1, p0, Lcom/huawei/hihealth/HiDataReadOption;->anchor:I

    .line 185
    return-void
.end method

.method public setConstantsKey([Ljava/lang/String;)V
    .locals 1

    .line 203
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 204
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->constantsKey:[Ljava/lang/String;

    .line 205
    return-void

    .line 207
    :cond_0
    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->constantsKey:[Ljava/lang/String;

    .line 208
    return-void
.end method

.method public setCount(I)V
    .locals 1

    .line 176
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->count:I

    .line 177
    return-void
.end method

.method public setDeviceUUID(Ljava/lang/String;)V
    .locals 1

    .line 167
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->deviceUUID:Ljava/lang/String;

    .line 168
    return-void
.end method

.method public setEndTime(J)V
    .locals 2

    .line 134
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->endTime:J

    .line 135
    return-void
.end method

.method public setOwnerID(I)V
    .locals 0

    .line 215
    iput p1, p0, Lcom/huawei/hihealth/HiDataReadOption;->ownerID:I

    .line 216
    return-void
.end method

.method public setReadType(I)V
    .locals 0

    .line 109
    iput p1, p0, Lcom/huawei/hihealth/HiDataReadOption;->readType:I

    .line 110
    return-void
.end method

.method public setSortOrder(I)V
    .locals 1

    .line 224
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->sortOrder:I

    .line 225
    return-void
.end method

.method public setStartTime(J)V
    .locals 2

    .line 126
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->startTime:J

    .line 127
    return-void
.end method

.method public setTimeInterval(JJ)V
    .locals 0

    .line 117
    iput-wide p1, p0, Lcom/huawei/hihealth/HiDataReadOption;->startTime:J

    .line 118
    iput-wide p3, p0, Lcom/huawei/hihealth/HiDataReadOption;->endTime:J

    .line 119
    return-void
.end method

.method public setType([I)V
    .locals 1

    .line 145
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 146
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->type:[I

    .line 147
    return-void

    .line 149
    :cond_0
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->type:[I

    .line 150
    return-void
.end method

.method public setType([I[Ljava/lang/String;I)V
    .locals 1

    .line 153
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 154
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->type:[I

    .line 156
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 157
    invoke-virtual {p2}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->constantsKey:[Ljava/lang/String;

    .line 159
    :cond_1
    iput p3, p0, Lcom/huawei/hihealth/HiDataReadOption;->alignType:I

    .line 160
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 229
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HiDataReadOption{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 230
    const-string v0, "startTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiDataReadOption;->startTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 231
    const-string v0, ", endTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiDataReadOption;->endTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 232
    const-string v0, ", type="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 233
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->type:[I

    if-nez v0, :cond_0

    const-string v0, "null"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 235
    :cond_0
    const/16 v0, 0x5b

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 236
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->type:[I

    array-length v0, v0

    if-ge v4, v0, :cond_2

    .line 237
    if-nez v4, :cond_1

    const-string v0, ""

    goto :goto_1

    :cond_1
    const-string v0, ", "

    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiDataReadOption;->type:[I

    aget v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 236
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 238
    :cond_2
    const/16 v0, 0x5d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 240
    :goto_2
    const-string v0, ", count = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDataReadOption;->count:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 241
    const-string v0, ", sortOrder="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDataReadOption;->sortOrder:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 242
    const-string v0, ", readType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDataReadOption;->readType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 243
    const-string v0, ", alignType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDataReadOption;->alignType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 244
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 245
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 255
    iget-wide v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->startTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 256
    iget-wide v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->endTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 257
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->type:[I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 258
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->constantsKey:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 259
    iget v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->alignType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 260
    iget v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->count:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 261
    iget v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->anchor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 262
    iget v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->sortOrder:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 263
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->deviceUUID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 264
    iget v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->ownerID:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 265
    iget v0, p0, Lcom/huawei/hihealth/HiDataReadOption;->readType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 266
    return-void
.end method
