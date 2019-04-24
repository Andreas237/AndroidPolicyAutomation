.class public Lcom/huawei/pluginFitnessAdvice/Equipment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/Equipment;>;"
        }
    .end annotation
.end field


# instance fields
.field private id:Ljava/lang/String;

.field private name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/Equipment$1;

    invoke-direct {v0}, Lcom/huawei/pluginFitnessAdvice/Equipment$1;-><init>()V

    sput-object v0, Lcom/huawei/pluginFitnessAdvice/Equipment;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Equipment;->id:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Equipment;->name:Ljava/lang/String;

    .line 55
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 45
    const/4 v0, 0x0

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Equipment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Equipment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public saveId(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Equipment;->id:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Equipment;->name:Ljava/lang/String;

    .line 30
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 34
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Equipment;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Equipment;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 41
    return-void
.end method
