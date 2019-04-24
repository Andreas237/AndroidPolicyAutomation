.class public Lcom/huawei/pluginFitnessAdvice/Comment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/Comment;>;"
        }
    .end annotation
.end field


# instance fields
.field private content:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private length:I

.field private name:Ljava/lang/String;

.field private playType:Ljava/lang/String;

.field private playValue:Ljava/lang/String;

.field private time:F

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 132
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/Comment$1;

    invoke-direct {v0}, Lcom/huawei/pluginFitnessAdvice/Comment$1;-><init>()V

    sput-object v0, Lcom/huawei/pluginFitnessAdvice/Comment;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->id:Ljava/lang/String;

    .line 123
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->type:I

    .line 124
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->name:Ljava/lang/String;

    .line 125
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->content:Ljava/lang/String;

    .line 126
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->length:I

    .line 127
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->time:F

    .line 128
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->playType:Ljava/lang/String;

    .line 129
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->playValue:Ljava/lang/String;

    .line 130
    return-void
.end method


# virtual methods
.method public acquireContent()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->content:Ljava/lang/String;

    return-object v0
.end method

.method public acquireName()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->name:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePlayType()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->playType:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePlayValue()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->playValue:Ljava/lang/String;

    return-object v0
.end method

.method public acquireTime()F
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->time:F

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 103
    const/4 v0, 0x0

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLength()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->length:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->type:I

    return v0
.end method

.method public saveContent(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->content:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public saveId(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->id:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public saveLength(I)V
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->length:I

    .line 69
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->name:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public savePlayType(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->playType:Ljava/lang/String;

    .line 81
    return-void
.end method

.method public savePlayValue(Ljava/lang/String;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->playValue:Ljava/lang/String;

    .line 89
    return-void
.end method

.method public saveTime(F)V
    .locals 0

    .line 76
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->time:F

    .line 77
    return-void
.end method

.method public saveType(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->type:I

    .line 45
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 97
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 146
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 150
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 154
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 158
    return-void
.end method

.method public uadpDC5()V
    .locals 0

    .line 162
    return-void
.end method

.method public uadpDC6()V
    .locals 0

    .line 166
    return-void
.end method

.method public uadpDC7()V
    .locals 0

    .line 170
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 109
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 110
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->content:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 112
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->length:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 113
    iget v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->time:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 114
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->playType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/pluginFitnessAdvice/Comment;->playValue:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 116
    return-void
.end method
