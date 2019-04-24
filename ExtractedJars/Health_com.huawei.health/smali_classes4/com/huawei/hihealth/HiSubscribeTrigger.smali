.class public Lcom/huawei/hihealth/HiSubscribeTrigger;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiSubscribeTrigger;>;"
        }
    .end annotation
.end field


# instance fields
.field private change:Lo/cmk$a;

.field private client:Lcom/huawei/hihealth/HiHealthClient;

.field private compareType:I

.field private data:Lcom/huawei/hihealth/HiHealthData;

.field private increment:D

.field private intervalType:I

.field private millionSecond:J

.field private threshold:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Lcom/huawei/hihealth/HiSubscribeTrigger$2;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiSubscribeTrigger$2;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiSubscribeTrigger;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->millionSecond:J

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->intervalType:I

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->compareType:I

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->increment:D

    .line 38
    const-class v0, Lcom/huawei/hihealth/HiHealthClient;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthClient;

    iput-object v0, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->client:Lcom/huawei/hihealth/HiHealthClient;

    .line 39
    const-class v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    iput-object v0, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->data:Lcom/huawei/hihealth/HiHealthData;

    .line 40
    return-void
.end method


# virtual methods
.method public check(ILcom/huawei/hihealth/HiHealthClient;Lo/cmk$a;Lcom/huawei/hihealth/HiHealthData;)Z
    .locals 1

    .line 75
    iput p1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->compareType:I

    .line 76
    iput-object p2, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->client:Lcom/huawei/hihealth/HiHealthClient;

    .line 77
    iput-object p3, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->change:Lo/cmk$a;

    .line 78
    iput-object p4, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->data:Lcom/huawei/hihealth/HiHealthData;

    .line 79
    const/4 v0, 0x1

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 85
    const/4 v0, 0x0

    return v0
.end method

.method public setExInterval(I)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->intervalType:I

    .line 61
    return-void
.end method

.method public setIncrement(D)V
    .locals 0

    .line 70
    iput-wide p1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->increment:D

    .line 71
    return-void
.end method

.method public setInterval(J)V
    .locals 0

    .line 55
    iput-wide p1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->millionSecond:J

    .line 56
    return-void
.end method

.method public setThreshold(Ljava/lang/Object;I)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->threshold:Ljava/lang/Object;

    .line 66
    iput p2, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->compareType:I

    .line 67
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 100
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HiSubscribeTrigger{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 101
    const-string v0, "millionSecond="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->millionSecond:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 102
    const-string v0, ", intervalType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->intervalType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 103
    const-string v0, ", threshold="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->threshold:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 104
    const-string v0, ", compareType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->compareType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 105
    const-string v0, ", increment="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->increment:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    .line 106
    const-string v0, ", client="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->client:Lcom/huawei/hihealth/HiHealthClient;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 107
    const-string v0, ", change="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->change:Lo/cmk$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 108
    const-string v0, ", data="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->data:Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 109
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 110
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 90
    iget-wide v0, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->millionSecond:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 91
    iget v0, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->intervalType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    iget v0, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->compareType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 93
    iget-wide v0, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->increment:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 94
    iget-object v0, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->client:Lcom/huawei/hihealth/HiHealthClient;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 95
    iget-object v0, p0, Lcom/huawei/hihealth/HiSubscribeTrigger;->data:Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 96
    return-void
.end method
