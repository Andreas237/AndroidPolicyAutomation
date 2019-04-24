.class public Lcom/huawei/pluginFitnessAdvice/Attribute;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/Attribute;>;"
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
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/Attribute$1;

    invoke-direct {v0}, Lcom/huawei/pluginFitnessAdvice/Attribute$1;-><init>()V

    sput-object v0, Lcom/huawei/pluginFitnessAdvice/Attribute;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Attribute;->id:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lcom/huawei/pluginFitnessAdvice/Attribute;->name:Ljava/lang/String;

    .line 24
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Attribute;->id:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Attribute;->name:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Attribute;->id:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lcom/huawei/pluginFitnessAdvice/Attribute;->name:Ljava/lang/String;

    .line 29
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 71
    const/4 v0, 0x0

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Attribute;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Attribute;->name:Ljava/lang/String;

    return-object v0
.end method

.method public saveId(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Attribute;->id:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Attribute;->name:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 49
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Attribute;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Attribute;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 78
    return-void
.end method
