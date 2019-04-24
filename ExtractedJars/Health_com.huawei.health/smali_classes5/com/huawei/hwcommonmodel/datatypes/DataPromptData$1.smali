.class final Lcom/huawei/hwcommonmodel/datatypes/DataPromptData$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)[Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;
    .locals 1

    .line 209
    new-array v0, p1, [Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 203
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData$1;->e(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;
    .locals 1

    .line 205
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;

    invoke-direct {v0, p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 203
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/DataPromptData$1;->c(I)[Lcom/huawei/hwcommonmodel/datatypes/DataPromptData;

    move-result-object v0

    return-object v0
.end method
