.class final Lcom/microblink/MerchantConfiguration$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/microblink/MerchantConfiguration;",
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
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/microblink/MerchantConfiguration;
    .locals 1

    new-instance v0, Lcom/microblink/MerchantConfiguration;

    invoke-direct {v0, p1}, Lcom/microblink/MerchantConfiguration;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/MerchantConfiguration$1;->createFromParcel(Landroid/os/Parcel;)Lcom/microblink/MerchantConfiguration;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/microblink/MerchantConfiguration;
    .locals 0

    new-array p1, p1, [Lcom/microblink/MerchantConfiguration;

    return-object p1
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/microblink/MerchantConfiguration$1;->newArray(I)[Lcom/microblink/MerchantConfiguration;

    move-result-object p1

    return-object p1
.end method
