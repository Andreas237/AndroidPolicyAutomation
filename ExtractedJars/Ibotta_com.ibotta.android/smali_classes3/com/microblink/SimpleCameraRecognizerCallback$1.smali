.class final Lcom/microblink/SimpleCameraRecognizerCallback$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/microblink/SimpleCameraRecognizerCallback;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/microblink/SimpleCameraRecognizerCallback;
    .locals 0

    new-instance p1, Lcom/microblink/SimpleCameraRecognizerCallback;

    invoke-direct {p1}, Lcom/microblink/SimpleCameraRecognizerCallback;-><init>()V

    return-object p1
.end method

.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/SimpleCameraRecognizerCallback$1;->createFromParcel(Landroid/os/Parcel;)Lcom/microblink/SimpleCameraRecognizerCallback;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/microblink/SimpleCameraRecognizerCallback;
    .locals 0

    new-array p1, p1, [Lcom/microblink/SimpleCameraRecognizerCallback;

    return-object p1
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/SimpleCameraRecognizerCallback$1;->newArray(I)[Lcom/microblink/SimpleCameraRecognizerCallback;

    move-result-object p1

    return-object p1
.end method