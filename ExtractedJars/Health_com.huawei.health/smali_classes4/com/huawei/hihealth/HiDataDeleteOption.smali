.class public Lcom/huawei/hihealth/HiDataDeleteOption;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiDataDeleteOption;>;"
        }
    .end annotation
.end field


# instance fields
.field private ownerID:I

.field private times:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;"
        }
    .end annotation
.end field

.field private types:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    new-instance v0, Lcom/huawei/hihealth/HiDataDeleteOption$5;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiDataDeleteOption$5;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiDataDeleteOption;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->times:Ljava/util/List;

    .line 32
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    sget-object v0, Lcom/huawei/hihealth/HiTimeInterval;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->times:Ljava/util/List;

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->types:[I

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->ownerID:I

    .line 47
    return-void
.end method

.method public constructor <init>([I)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-direct {p0, p1}, Lcom/huawei/hihealth/HiDataDeleteOption;->initData([I)V

    .line 36
    return-void
.end method

.method private initData([I)V
    .locals 1

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->times:Ljava/util/List;

    .line 40
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiDataDeleteOption;->setTypes([I)V

    .line 41
    return-void
.end method


# virtual methods
.method public addTimeInterval(Lcom/huawei/hihealth/HiTimeInterval;)V
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->times:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 58
    const/4 v0, 0x0

    return v0
.end method

.method public getOwnerID()I
    .locals 1

    .line 108
    iget v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->ownerID:I

    return v0
.end method

.method public getTimes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;"
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->times:Ljava/util/List;

    return-object v0
.end method

.method public getTypes()[I
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->types:[I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 94
    const/4 v0, 0x0

    return-object v0

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->types:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public setOwnerID(I)V
    .locals 0

    .line 112
    iput p1, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->ownerID:I

    .line 113
    return-void
.end method

.method public setTimeInterval(JJ)V
    .locals 1

    .line 81
    new-instance v0, Lcom/huawei/hihealth/HiTimeInterval;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/huawei/hihealth/HiTimeInterval;-><init>(JJ)V

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiDataDeleteOption;->addTimeInterval(Lcom/huawei/hihealth/HiTimeInterval;)V

    .line 82
    return-void
.end method

.method public setTimes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiTimeInterval;>;)V"
        }
    .end annotation

    .line 120
    iput-object p1, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->times:Ljava/util/List;

    .line 121
    return-void
.end method

.method public setTypes([I)V
    .locals 1

    .line 100
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->types:[I

    .line 102
    return-void

    .line 104
    :cond_0
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->types:[I

    .line 105
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 125
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "HiDataDeleteOption{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 126
    const-string v0, "times="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->times:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 127
    const-string v0, ", types="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 128
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->types:[I

    if-nez v0, :cond_0

    const-string v0, "null"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 130
    :cond_0
    const/16 v0, 0x5b

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 131
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->types:[I

    array-length v0, v0

    if-ge v3, v0, :cond_2

    .line 132
    if-nez v3, :cond_1

    const-string v0, ""

    goto :goto_1

    :cond_1
    const-string v0, ", "

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->types:[I

    aget v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 131
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 133
    :cond_2
    const/16 v0, 0x5d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 135
    :goto_2
    const-string v0, ", ownerID="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->ownerID:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 136
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 137
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->times:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 52
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->types:[I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 53
    iget v0, p0, Lcom/huawei/hihealth/HiDataDeleteOption;->ownerID:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 54
    return-void
.end method
