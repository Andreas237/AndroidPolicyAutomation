.class final Lcom/usebutton/sdk/models/Link$1;
.super Ljava/lang/Object;
.source "Link.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/models/Link;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/usebutton/sdk/models/Link;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/usebutton/sdk/models/Link;
    .locals 1

    .line 44
    new-instance v0, Lcom/usebutton/sdk/models/Link;

    invoke-direct {v0, p1}, Lcom/usebutton/sdk/models/Link;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 41
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/models/Link$1;->createFromParcel(Landroid/os/Parcel;)Lcom/usebutton/sdk/models/Link;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/usebutton/sdk/models/Link;
    .locals 0

    .line 49
    new-array p1, p1, [Lcom/usebutton/sdk/models/Link;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 41
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/models/Link$1;->newArray(I)[Lcom/usebutton/sdk/models/Link;

    move-result-object p1

    return-object p1
.end method
