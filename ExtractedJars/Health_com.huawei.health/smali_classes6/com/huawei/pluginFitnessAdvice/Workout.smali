.class public Lcom/huawei/pluginFitnessAdvice/Workout;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/Workout;>;"
        }
    .end annotation
.end field


# instance fields
.field private calorie:F

.field private description:Ljava/lang/String;

.field private duration:I

.field private id:Ljava/lang/String;

.field private modified:J

.field private name:Ljava/lang/String;

.field private publishDate:J

.field private type:I

.field private version:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 145
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/Workout$1;

    invoke-direct {v0}, Lcom/huawei/pluginFitnessAdvice/Workout$1;-><init>()V

    sput-object v0, Lcom/huawei/pluginFitnessAdvice/Workout;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->id:Ljava/lang/String;

    .line 135
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->name:Ljava/lang/String;

    .line 136
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->type:I

    .line 137
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->description:Ljava/lang/String;

    .line 138
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->duration:I

    .line 139
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->calorie:F

    .line 140
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->version:Ljava/lang/String;

    .line 141
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->publishDate:J

    .line 142
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->modified:J

    .line 143
    return-void
.end method


# virtual methods
.method public accquireVersion()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->version:Ljava/lang/String;

    return-object v0
.end method

.method public acquireCalorie()F
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->calorie:F

    return v0
.end method

.method public acquireDescription()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->description:Ljava/lang/String;

    return-object v0
.end method

.method public acquireDuration()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->duration:I

    return v0
.end method

.method public acquireId()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->id:Ljava/lang/String;

    return-object v0
.end method

.method public acquireName()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->name:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 114
    const/4 v0, 0x0

    return v0
.end method

.method public getModified()J
    .locals 2

    .line 99
    iget-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->modified:J

    return-wide v0
.end method

.method public getPublishDate()J
    .locals 2

    .line 91
    iget-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->publishDate:J

    return-wide v0
.end method

.method public getType()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->type:I

    return v0
.end method

.method public saveCalorie(F)V
    .locals 0

    .line 79
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->calorie:F

    .line 80
    return-void
.end method

.method public saveDescription(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->description:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public saveDuration(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->duration:I

    .line 72
    return-void
.end method

.method public saveId(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->id:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public saveModified(J)V
    .locals 0

    .line 103
    iput-wide p1, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->modified:J

    .line 104
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->name:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public savePublishDate(J)V
    .locals 0

    .line 95
    iput-wide p1, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->publishDate:J

    .line 96
    return-void
.end method

.method public saveVersion(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->version:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 55
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->type:I

    .line 56
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 108
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 159
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 163
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 167
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 171
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 121
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 122
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->description:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 123
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->duration:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 124
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->calorie:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 125
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->version:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 126
    iget-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->publishDate:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 127
    iget-wide v0, p0, Lcom/huawei/pluginFitnessAdvice/Workout;->modified:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 128
    return-void
.end method
