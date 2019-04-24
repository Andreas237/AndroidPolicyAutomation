.class public Lcom/huawei/pluginFitnessAdvice/Cover;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/Cover;>;"
        }
    .end annotation
.end field


# instance fields
.field private coordinates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Coordinate;>;"
        }
    .end annotation
.end field

.field private gender:I

.field private id:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 86
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/Cover$1;

    invoke-direct {v0}, Lcom/huawei/pluginFitnessAdvice/Cover$1;-><init>()V

    sput-object v0, Lcom/huawei/pluginFitnessAdvice/Cover;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->id:Ljava/lang/String;

    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->url:Ljava/lang/String;

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->gender:I

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->coordinates:Ljava/util/List;

    .line 83
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->coordinates:Ljava/util/List;

    const-class v1, Lcom/huawei/pluginFitnessAdvice/Coordinate;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 84
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 64
    const/4 v0, 0x0

    return v0
.end method

.method public getCoordinates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Coordinate;>;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->coordinates:Ljava/util/List;

    return-object v0
.end method

.method public getGender()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->gender:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->url:Ljava/lang/String;

    return-object v0
.end method

.method public saveGender(I)V
    .locals 0

    .line 46
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->gender:I

    .line 47
    return-void
.end method

.method public saveUrl(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->url:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public setCoordinates(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/Coordinate;>;)V"
        }
    .end annotation

    .line 54
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->coordinates:Ljava/util/List;

    .line 55
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->id:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 59
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 100
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 104
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 108
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 112
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->url:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 71
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->gender:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 72
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Cover;->coordinates:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 73
    return-void
.end method
