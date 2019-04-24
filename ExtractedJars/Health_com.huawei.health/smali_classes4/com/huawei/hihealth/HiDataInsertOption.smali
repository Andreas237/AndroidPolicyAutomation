.class public Lcom/huawei/hihealth/HiDataInsertOption;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiDataInsertOption;>;"
        }
    .end annotation
.end field


# instance fields
.field private datas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation
.end field

.field private writeStatType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    new-instance v0, Lcom/huawei/hihealth/HiDataInsertOption$1;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiDataInsertOption$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiDataInsertOption;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataInsertOption;->datas:Ljava/util/List;

    .line 31
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDataInsertOption;->writeStatType:I

    .line 42
    sget-object v0, Lcom/huawei/hihealth/HiHealthData;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataInsertOption;->datas:Ljava/util/List;

    .line 43
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/huawei/hihealth/HiDataInsertOption;->datas:Ljava/util/List;

    .line 38
    return-void
.end method


# virtual methods
.method public addData(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataInsertOption;->datas:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 97
    const/4 v0, 0x0

    return v0
.end method

.method public getDatas()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataInsertOption;->datas:Ljava/util/List;

    return-object v0
.end method

.method public getWriteStatType()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/huawei/hihealth/HiDataInsertOption;->writeStatType:I

    return v0
.end method

.method public setDatas(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 78
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataInsertOption;->datas:Ljava/util/List;

    .line 79
    return-void
.end method

.method public setWriteStatType(I)V
    .locals 0

    .line 92
    iput p1, p0, Lcom/huawei/hihealth/HiDataInsertOption;->writeStatType:I

    .line 93
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 108
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "HiDataInsertOption{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 109
    const-string v0, "writeStatType="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDataInsertOption;->writeStatType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 110
    const-string v0, ", datas="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiDataInsertOption;->datas:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 111
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 112
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 102
    iget v0, p0, Lcom/huawei/hihealth/HiDataInsertOption;->writeStatType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 103
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataInsertOption;->datas:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 104
    return-void
.end method
