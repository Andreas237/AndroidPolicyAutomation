.class public Lcom/huawei/pluginFitnessAdvice/Video;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/Video;>;"
        }
    .end annotation
.end field


# instance fields
.field private actionCount:I

.field private during:I

.field private gender:I

.field private id:Ljava/lang/String;

.field private identification:Ljava/lang/String;

.field private length:I

.field private logoImgUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private thumbnail:Ljava/lang/String;

.field private type:I

.field private url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/Video$1;

    invoke-direct {v0}, Lcom/huawei/pluginFitnessAdvice/Video$1;-><init>()V

    sput-object v0, Lcom/huawei/pluginFitnessAdvice/Video;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->id:Ljava/lang/String;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->url:Ljava/lang/String;

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->type:I

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->identification:Ljava/lang/String;

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->length:I

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->name:Ljava/lang/String;

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->thumbnail:Ljava/lang/String;

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->gender:I

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->actionCount:I

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->during:I

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->logoImgUrl:Ljava/lang/String;

    .line 51
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 160
    const/4 v0, 0x0

    return v0
.end method

.method public getActionCount()I
    .locals 1

    .line 138
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->actionCount:I

    return v0
.end method

.method public getDuring()I
    .locals 1

    .line 146
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->during:I

    return v0
.end method

.method public getGender()I
    .locals 1

    .line 130
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->gender:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getIdentification()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->identification:Ljava/lang/String;

    return-object v0
.end method

.method public getLength()I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->length:I

    return v0
.end method

.method public getLogoImgUrl()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->logoImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getThumbnail()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->thumbnail:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 90
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->type:I

    return v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->url:Ljava/lang/String;

    return-object v0
.end method

.method public saveActionCount(I)V
    .locals 0

    .line 142
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Video;->actionCount:I

    .line 143
    return-void
.end method

.method public saveDuring(I)V
    .locals 0

    .line 150
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Video;->during:I

    .line 151
    return-void
.end method

.method public saveGender(I)V
    .locals 0

    .line 134
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Video;->gender:I

    .line 135
    return-void
.end method

.method public saveId(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Video;->id:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public saveIdentification(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Video;->identification:Ljava/lang/String;

    .line 103
    return-void
.end method

.method public saveLength(I)V
    .locals 0

    .line 110
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Video;->length:I

    .line 111
    return-void
.end method

.method public saveLogoImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Video;->logoImgUrl:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Video;->name:Ljava/lang/String;

    .line 119
    return-void
.end method

.method public saveThumbnail(Ljava/lang/String;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Video;->thumbnail:Ljava/lang/String;

    .line 127
    return-void
.end method

.method public saveType(I)V
    .locals 0

    .line 94
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Video;->type:I

    .line 95
    return-void
.end method

.method public saveUrl(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Video;->url:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 155
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 167
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->url:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 168
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 169
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->identification:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 170
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->length:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 171
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->thumbnail:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 173
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->gender:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 174
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->actionCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 175
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->during:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 176
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Video;->logoImgUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 177
    return-void
.end method
