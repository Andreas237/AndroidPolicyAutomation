.class final Lcom/huawei/pluginFitnessAdvice/Cover$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginFitnessAdvice/Cover;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/pluginFitnessAdvice/Cover;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/huawei/pluginFitnessAdvice/Cover;
    .locals 1

    .line 89
    new-instance v0, Lcom/huawei/pluginFitnessAdvice/Cover;

    invoke-direct {v0, p1}, Lcom/huawei/pluginFitnessAdvice/Cover;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 86
    invoke-virtual {p0, p1}, Lcom/huawei/pluginFitnessAdvice/Cover$1;->createFromParcel(Landroid/os/Parcel;)Lcom/huawei/pluginFitnessAdvice/Cover;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/huawei/pluginFitnessAdvice/Cover;
    .locals 1

    .line 94
    new-array v0, p1, [Lcom/huawei/pluginFitnessAdvice/Cover;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 86
    invoke-virtual {p0, p1}, Lcom/huawei/pluginFitnessAdvice/Cover$1;->newArray(I)[Lcom/huawei/pluginFitnessAdvice/Cover;

    move-result-object v0

    return-object v0
.end method
