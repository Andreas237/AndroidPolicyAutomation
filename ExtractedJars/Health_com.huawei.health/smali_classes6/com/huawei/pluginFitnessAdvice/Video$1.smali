.class final Lcom/huawei/pluginFitnessAdvice/Video$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginFitnessAdvice/Video;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/Video;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/huawei/pluginFitnessAdvice/Video;
    .locals 1

    .line 56
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/Video;

    invoke-direct {v0, p1}, Lcom/huawei/pluginFitnessAdvice/Video;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 53
    invoke-virtual {p0, p1}, Lcom/huawei/pluginFitnessAdvice/Video$1;->createFromParcel(Landroid/os/Parcel;)Lcom/huawei/pluginFitnessAdvice/Video;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/huawei/pluginFitnessAdvice/Video;
    .locals 1

    .line 61
    new-array v0, p1, [Lcom/huawei/pluginFitnessAdvice/Video;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 53
    invoke-virtual {p0, p1}, Lcom/huawei/pluginFitnessAdvice/Video$1;->newArray(I)[Lcom/huawei/pluginFitnessAdvice/Video;

    move-result-object v0

    return-object v0
.end method
