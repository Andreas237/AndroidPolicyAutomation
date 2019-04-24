.class public final Lcom/microblink/MerchantConfiguration;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/MerchantConfiguration;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private googleAddressLookup:Z

.field private googlePhoneLookup:Z

.field private yelpPhoneLookup:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/MerchantConfiguration$1;

    invoke-direct {v0}, Lcom/microblink/MerchantConfiguration$1;-><init>()V

    sput-object v0, Lcom/microblink/MerchantConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/MerchantConfiguration;->googlePhoneLookup:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/microblink/MerchantConfiguration;->yelpPhoneLookup:Z

    iput-boolean v0, p0, Lcom/microblink/MerchantConfiguration;->googleAddressLookup:Z

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/MerchantConfiguration;->googlePhoneLookup:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/microblink/MerchantConfiguration;->yelpPhoneLookup:Z

    iput-boolean v0, p0, Lcom/microblink/MerchantConfiguration;->googleAddressLookup:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Lcom/microblink/MerchantConfiguration;->googlePhoneLookup:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    iput-boolean v2, p0, Lcom/microblink/MerchantConfiguration;->yelpPhoneLookup:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    iput-boolean v0, p0, Lcom/microblink/MerchantConfiguration;->googleAddressLookup:Z

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final googleAddressLookup(Z)Lcom/microblink/MerchantConfiguration;
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/MerchantConfiguration;->googleAddressLookup:Z

    return-object p0
.end method

.method public final googleAddressLookup()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/MerchantConfiguration;->googleAddressLookup:Z

    return v0
.end method

.method public final googlePhoneLookup(Z)Lcom/microblink/MerchantConfiguration;
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/MerchantConfiguration;->googlePhoneLookup:Z

    return-object p0
.end method

.method public final googlePhoneLookup()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/MerchantConfiguration;->googlePhoneLookup:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MerchantConfiguration{googlePhoneLookup="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/microblink/MerchantConfiguration;->googlePhoneLookup:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", yelpPhoneLookup="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/MerchantConfiguration;->yelpPhoneLookup:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", googleAddressLookup="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/MerchantConfiguration;->googleAddressLookup:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-boolean p2, p0, Lcom/microblink/MerchantConfiguration;->googlePhoneLookup:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, Lcom/microblink/MerchantConfiguration;->yelpPhoneLookup:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, Lcom/microblink/MerchantConfiguration;->googleAddressLookup:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method

.method public final yelpPhoneLookup(Z)Lcom/microblink/MerchantConfiguration;
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/MerchantConfiguration;->yelpPhoneLookup:Z

    return-object p0
.end method

.method public final yelpPhoneLookup()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/MerchantConfiguration;->yelpPhoneLookup:Z

    return v0
.end method
