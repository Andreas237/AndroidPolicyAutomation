.class final Lcom/usebutton/sdk/internal/models/TextElement$1;
.super Ljava/lang/Object;
.source "TextElement.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/models/TextElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/usebutton/sdk/internal/models/TextElement;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/usebutton/sdk/internal/models/TextElement;
    .locals 1

    .line 76
    new-instance v0, Lcom/usebutton/sdk/internal/models/TextElement;

    invoke-direct {v0, p1}, Lcom/usebutton/sdk/internal/models/TextElement;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 73
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/models/TextElement$1;->createFromParcel(Landroid/os/Parcel;)Lcom/usebutton/sdk/internal/models/TextElement;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/usebutton/sdk/internal/models/TextElement;
    .locals 0

    .line 81
    new-array p1, p1, [Lcom/usebutton/sdk/internal/models/TextElement;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 73
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/models/TextElement$1;->newArray(I)[Lcom/usebutton/sdk/internal/models/TextElement;

    move-result-object p1

    return-object p1
.end method
