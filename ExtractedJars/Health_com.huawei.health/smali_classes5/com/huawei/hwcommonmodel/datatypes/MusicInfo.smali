.class public Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private Current_Volume:I

.field private Max_Volume:I

.field private Play_State:I

.field private Singer_Name:Ljava/lang/String;

.field private Song_Name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo$3;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo$3;-><init>()V

    sput-object v0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Singer_Name:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Song_Name:Ljava/lang/String;

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Play_State:I

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Max_Volume:I

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Current_Volume:I

    .line 29
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 95
    const/4 v0, 0x0

    return v0
.end method

.method public getBundle()Landroid/os/Bundle;
    .locals 3

    .line 108
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 109
    const-string v0, "Singer_Name"

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->getSinger_Name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const-string v0, "Song_Name"

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->getSong_Name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v0, "Play_State"

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->getPlay_State()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 112
    const-string v0, "Max_Volume"

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->getMax_Volume()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 113
    const-string v0, "Current_Volume"

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->getCurrent_Volume()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 114
    return-object v2
.end method

.method public getCurrent_Volume()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Current_Volume:I

    return v0
.end method

.method public getMax_Volume()I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Max_Volume:I

    return v0
.end method

.method public getPlay_State()I
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Play_State:I

    return v0
.end method

.method public getSinger_Name()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Singer_Name:Ljava/lang/String;

    return-object v0
.end method

.method public getSong_Name()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Song_Name:Ljava/lang/String;

    return-object v0
.end method

.method public setCurrent_Volume(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Current_Volume:I

    .line 82
    return-void
.end method

.method public setMax_Volume(I)V
    .locals 0

    .line 73
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Max_Volume:I

    .line 74
    return-void
.end method

.method public setPlay_State(I)V
    .locals 0

    .line 65
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Play_State:I

    .line 66
    return-void
.end method

.method public setSinger_Name(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Singer_Name:Ljava/lang/String;

    .line 50
    return-void
.end method

.method public setSong_Name(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Song_Name:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MusicInfo{Singer_Name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Singer_Name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Song_Name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Song_Name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Play_State="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Play_State:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Max_Volume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Max_Volume:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Current_Volume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Current_Volume:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Singer_Name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Song_Name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 102
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Play_State:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 103
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Max_Volume:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 104
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;->Current_Volume:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    return-void
.end method
