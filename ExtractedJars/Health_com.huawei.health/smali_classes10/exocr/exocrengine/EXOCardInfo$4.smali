.class final Lexocr/exocrengine/EXOCardInfo$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexocr/exocrengine/EXOCardInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lexocr/exocrengine/EXOCardInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lexocr/exocrengine/EXOCardInfo;
    .locals 1

    .line 76
    new-array v0, p1, [Lexocr/exocrengine/EXOCardInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 65
    invoke-virtual {p0, p1}, Lexocr/exocrengine/EXOCardInfo$4;->d(Landroid/os/Parcel;)Lexocr/exocrengine/EXOCardInfo;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lexocr/exocrengine/EXOCardInfo;
    .locals 2

    .line 70
    new-instance v0, Lexocr/exocrengine/EXOCardInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lexocr/exocrengine/EXOCardInfo;-><init>(Landroid/os/Parcel;Lexocr/exocrengine/EXOCardInfo$4;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 65
    invoke-virtual {p0, p1}, Lexocr/exocrengine/EXOCardInfo$4;->a(I)[Lexocr/exocrengine/EXOCardInfo;

    move-result-object v0

    return-object v0
.end method
