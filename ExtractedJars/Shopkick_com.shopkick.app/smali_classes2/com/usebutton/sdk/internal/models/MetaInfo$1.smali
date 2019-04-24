.class final Lcom/usebutton/sdk/internal/models/MetaInfo$1;
.super Ljava/lang/Object;
.source "MetaInfo.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/models/MetaInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/usebutton/sdk/internal/models/MetaInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/usebutton/sdk/internal/models/MetaInfo;
    .locals 1

    .line 120
    new-instance v0, Lcom/usebutton/sdk/internal/models/MetaInfo;

    invoke-direct {v0, p1}, Lcom/usebutton/sdk/internal/models/MetaInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 117
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/models/MetaInfo$1;->createFromParcel(Landroid/os/Parcel;)Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/usebutton/sdk/internal/models/MetaInfo;
    .locals 0

    .line 125
    new-array p1, p1, [Lcom/usebutton/sdk/internal/models/MetaInfo;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 117
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/models/MetaInfo$1;->newArray(I)[Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object p1

    return-object p1
.end method
