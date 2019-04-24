.class final Lcom/microblink/Product$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/microblink/Product;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/microblink/Product;
    .locals 1

    new-instance v0, Lcom/microblink/Product;

    invoke-direct {v0, p1}, Lcom/microblink/Product;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/Product$1;->createFromParcel(Landroid/os/Parcel;)Lcom/microblink/Product;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/microblink/Product;
    .locals 0

    new-array p1, p1, [Lcom/microblink/Product;

    return-object p1
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/Product$1;->newArray(I)[Lcom/microblink/Product;

    move-result-object p1

    return-object p1
.end method
