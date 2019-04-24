.class public Lcom/huawei/hihealth/HiHealthData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable;Ljava/lang/Comparable<Lcom/huawei/hihealth/HiHealthData;>;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation
.end field


# instance fields
.field private deviceUUID:Ljava/lang/String;

.field private ownerID:I

.field private type:I

.field private valueHolder:Landroid/content/ContentValues;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 94
    new-instance v0, Lcom/huawei/hihealth/HiHealthData$5;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiHealthData$5;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiHealthData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    .line 71
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    .line 81
    iput p1, p0, Lcom/huawei/hihealth/HiHealthData;->type:I

    .line 82
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->deviceUUID:Ljava/lang/String;

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiHealthData;->ownerID:I

    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiHealthData;->type:I

    .line 91
    const-class v0, Landroid/content/ContentValues;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/ContentValues;

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    .line 92
    return-void
.end method

.method private setValueHolder(Landroid/content/ContentValues;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    .line 158
    return-void
.end method


# virtual methods
.method public compareTo(Lcom/huawei/hihealth/HiHealthData;)I
    .locals 4

    .line 726
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 37
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiHealthData;->compareTo(Lcom/huawei/hihealth/HiHealthData;)I

    move-result v0

    return v0
.end method

.method public copyData()Lcom/huawei/hihealth/HiHealthData;
    .locals 3

    .line 740
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 741
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->deviceUUID:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 742
    iget v0, p0, Lcom/huawei/hihealth/HiHealthData;->ownerID:I

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setOwnerID(I)V

    .line 743
    iget v0, p0, Lcom/huawei/hihealth/HiHealthData;->type:I

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 744
    new-instance v0, Landroid/content/ContentValues;

    iget-object v1, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(Landroid/content/ContentValues;)V

    invoke-direct {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setValueHolder(Landroid/content/ContentValues;)V

    .line 745
    return-object v2
.end method

.method public describeContents()I
    .locals 1

    .line 695
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 731
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final get(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 682
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getAppID()I
    .locals 3

    .line 538
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "app_id"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    .line 539
    if-nez v2, :cond_0

    .line 540
    const/4 v0, 0x0

    return v0

    .line 542
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getBoolean(Ljava/lang/String;)Z
    .locals 2

    .line 662
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->getAsBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    .line 663
    if-nez v1, :cond_0

    .line 664
    const/4 v0, 0x0

    return v0

    .line 666
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getClientID()I
    .locals 3

    .line 480
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "client_id"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    .line 481
    if-nez v2, :cond_0

    .line 482
    const/4 v0, 0x0

    return v0

    .line 484
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getContentLenth()I
    .locals 1

    .line 525
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0}, Landroid/content/ContentValues;->size()I

    move-result v0

    return v0
.end method

.method public getCreateTime()J
    .locals 3

    .line 242
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "create_time"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    .line 243
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 244
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0

    .line 246
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDataID()J
    .locals 3

    .line 462
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "data_id"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    .line 463
    if-nez v2, :cond_0

    .line 464
    const-wide/16 v0, 0x0

    return-wide v0

    .line 466
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getDay()J
    .locals 3

    .line 198
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    .line 199
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 200
    const-wide/16 v0, 0x0

    return-wide v0

    .line 202
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getDeviceID()I
    .locals 3

    .line 498
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "device_id"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    .line 499
    if-nez v2, :cond_0

    .line 500
    const/4 v0, 0x0

    return v0

    .line 502
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDeviceUUID()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->deviceUUID:Ljava/lang/String;

    return-object v0
.end method

.method public getDouble(Ljava/lang/String;)D
    .locals 3

    .line 594
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->getAsDouble(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    .line 595
    if-nez v2, :cond_0

    .line 596
    const-wide/16 v0, 0x0

    return-wide v0

    .line 598
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getEndTime()J
    .locals 3

    .line 220
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "end_time"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    .line 221
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 222
    const-wide/16 v0, 0x0

    return-wide v0

    .line 224
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getFloat(Ljava/lang/String;)F
    .locals 2

    .line 608
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->getAsFloat(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    .line 609
    if-nez v1, :cond_0

    .line 610
    const/4 v0, 0x0

    return v0

    .line 612
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getFloatValue()F
    .locals 3

    .line 328
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "point_value"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsFloat(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v2

    .line 329
    if-nez v2, :cond_0

    .line 330
    const/4 v0, 0x0

    return v0

    .line 332
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public getInt(Ljava/lang/String;)I
    .locals 2

    .line 621
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    .line 622
    if-nez v1, :cond_0

    .line 623
    const/4 v0, 0x0

    return v0

    .line 625
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getIntValue()I
    .locals 3

    .line 316
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "point_value"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    .line 317
    if-nez v2, :cond_0

    .line 318
    const/4 v0, 0x0

    return v0

    .line 320
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLong(Ljava/lang/String;)J
    .locals 3

    .line 648
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    .line 649
    if-nez v2, :cond_0

    .line 650
    const-wide/16 v0, 0x0

    return-wide v0

    .line 652
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getManualFlag()Z
    .locals 3

    .line 550
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "is_manual_insert_data"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    .line 551
    if-nez v2, :cond_0

    .line 552
    const/4 v0, 0x0

    return v0

    .line 554
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getMetaData()Ljava/lang/String;
    .locals 2

    .line 413
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "metadata"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getModifiedTime()J
    .locals 3

    .line 264
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "modified_time"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    .line 265
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 266
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0

    .line 268
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getOwnerID()I
    .locals 1

    .line 127
    iget v0, p0, Lcom/huawei/hihealth/HiHealthData;->ownerID:I

    return v0
.end method

.method public getPointUnit()I
    .locals 3

    .line 349
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, " point_unit"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    .line 350
    if-nez v2, :cond_0

    .line 351
    const/4 v0, 0x0

    return v0

    .line 353
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getSequenceData()Ljava/lang/String;
    .locals 2

    .line 373
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "sequence_data"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSequenceFileUrl()Ljava/lang/String;
    .locals 2

    .line 393
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "sequence_file_url"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getShort(Ljava/lang/String;)S
    .locals 2

    .line 634
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->getAsShort(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object v1

    .line 635
    if-nez v1, :cond_0

    .line 636
    const/4 v0, 0x0

    return v0

    .line 638
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    move-result v0

    return v0
.end method

.method public getStartTime()J
    .locals 3

    .line 186
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    .line 187
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 188
    const-wide/16 v0, 0x0

    return-wide v0

    .line 190
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 575
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSyncStatus()I
    .locals 3

    .line 444
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "sync_status"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    .line 445
    if-nez v2, :cond_0

    .line 446
    const/4 v0, 0x0

    return v0

    .line 448
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 2

    .line 430
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "time_zone"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 144
    iget v0, p0, Lcom/huawei/hihealth/HiHealthData;->type:I

    return v0
.end method

.method public getUserID()I
    .locals 3

    .line 517
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "user_id"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    .line 518
    if-nez v2, :cond_0

    .line 519
    const/4 v0, 0x0

    return v0

    .line 521
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getValue()D
    .locals 3

    .line 304
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "point_value"

    invoke-virtual {v0, v1}, Landroid/content/ContentValues;->getAsDouble(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    .line 305
    if-nez v2, :cond_0

    .line 306
    const-wide/16 v0, 0x0

    return-wide v0

    .line 308
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public hashCode()I
    .locals 1

    .line 736
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public putBoolean(Ljava/lang/String;Z)V
    .locals 2

    .line 657
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 658
    return-void
.end method

.method public putDouble(Ljava/lang/String;D)V
    .locals 2

    .line 585
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 586
    return-void
.end method

.method public final putFloat(Ljava/lang/String;F)V
    .locals 2

    .line 603
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    .line 604
    return-void
.end method

.method public putInt(Ljava/lang/String;I)V
    .locals 2

    .line 617
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 618
    return-void
.end method

.method public putLong(Ljava/lang/String;J)V
    .locals 2

    .line 643
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 644
    return-void
.end method

.method public putNull(Ljava/lang/String;)V
    .locals 1

    .line 674
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->putNull(Ljava/lang/String;)V

    .line 675
    return-void
.end method

.method public putShort(Ljava/lang/String;S)V
    .locals 2

    .line 630
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Short;)V

    .line 631
    return-void
.end method

.method public final putString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 565
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 566
    return-void
.end method

.method public remove(Ljava/lang/String;)V
    .locals 1

    .line 690
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 691
    return-void
.end method

.method public setAppID(I)V
    .locals 3

    .line 531
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "app_id"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 532
    return-void
.end method

.method public setClientID(I)V
    .locals 3

    .line 473
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "client_id"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 474
    return-void
.end method

.method public setCreateTime(J)V
    .locals 3

    .line 233
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "create_time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 234
    return-void
.end method

.method public setDataID(J)V
    .locals 3

    .line 455
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "data_id"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 456
    return-void
.end method

.method public setDeviceID(I)V
    .locals 3

    .line 491
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "device_id"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 492
    return-void
.end method

.method public setDeviceUUID(Ljava/lang/String;)V
    .locals 1

    .line 119
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->deviceUUID:Ljava/lang/String;

    .line 120
    return-void
.end method

.method public setEndTime(J)V
    .locals 3

    .line 211
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "end_time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 212
    return-void
.end method

.method public setManualFlag(Z)V
    .locals 3

    .line 546
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "is_manual_insert_data"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 547
    return-void
.end method

.method public setMetaData(Ljava/lang/String;)V
    .locals 2

    .line 404
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "metadata"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    return-void
.end method

.method public setModifiedTime(J)V
    .locals 3

    .line 255
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "modified_time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 256
    return-void
.end method

.method public setOwnerID(I)V
    .locals 0

    .line 135
    iput p1, p0, Lcom/huawei/hihealth/HiHealthData;->ownerID:I

    .line 136
    return-void
.end method

.method public setPointUnit(I)V
    .locals 3

    .line 341
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, " point_unit"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 342
    return-void
.end method

.method public setSequenceData(Ljava/lang/String;)V
    .locals 2

    .line 363
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "sequence_data"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    return-void
.end method

.method public setSequenceFileUrl(Ljava/lang/String;)V
    .locals 2

    .line 383
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "sequence_file_url"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    return-void
.end method

.method public setStartTime(J)V
    .locals 3

    .line 177
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "start_time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 178
    return-void
.end method

.method public setSyncStatus(I)V
    .locals 3

    .line 437
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "sync_status"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 438
    return-void
.end method

.method public setTimeInterval(JJ)V
    .locals 3

    .line 167
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "start_time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 168
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "end_time"

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 169
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 2

    .line 422
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "time_zone"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    return-void
.end method

.method public setType(I)V
    .locals 1

    .line 153
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiHealthData;->type:I

    .line 154
    return-void
.end method

.method public setUserID(I)V
    .locals 3

    .line 510
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "user_id"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 511
    return-void
.end method

.method public setValue(D)V
    .locals 3

    .line 277
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "point_value"

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-static {v2}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 278
    return-void
.end method

.method public setValue(F)V
    .locals 3

    .line 295
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "point_value"

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    .line 296
    return-void
.end method

.method public setValue(I)V
    .locals 3

    .line 286
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    const-string v1, "point_value"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 287
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 708
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HiHealthData{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 709
    const-string v0, "type="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiHealthData;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 710
    const-string v0, ", day = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 711
    iget v0, p0, Lcom/huawei/hihealth/HiHealthData;->type:I

    const/16 v1, 0x7531

    if-ne v0, v1, :cond_0

    .line 712
    const-string v0, ", startTime = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 713
    const-string v0, ", endTime = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 714
    const-string v0, ", meteData = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 715
    const-string v0, ", sequenceFileUrl = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealth/HiHealthData;->getSequenceFileUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 718
    :cond_0
    const-string v0, ", values = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 720
    :goto_0
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 721
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 700
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->deviceUUID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 701
    iget v0, p0, Lcom/huawei/hihealth/HiHealthData;->ownerID:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 702
    iget v0, p0, Lcom/huawei/hihealth/HiHealthData;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 703
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthData;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 704
    return-void
.end method
