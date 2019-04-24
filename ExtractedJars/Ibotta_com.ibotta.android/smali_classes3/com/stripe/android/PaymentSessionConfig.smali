.class public Lcom/stripe/android/PaymentSessionConfig;
.super Ljava/lang/Object;
.source "PaymentSessionConfig.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/PaymentSessionConfig;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mHiddenShippingInfoFields:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mOptionalShippingInfoFields:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mShippingInfoRequired:Z

.field private mShippingInformation:Lcom/stripe/android/model/ShippingInformation;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mShippingMethodRequired:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 172
    new-instance v0, Lcom/stripe/android/PaymentSessionConfig$1;

    invoke-direct {v0}, Lcom/stripe/android/PaymentSessionConfig$1;-><init>()V

    sput-object v0, Lcom/stripe/android/PaymentSessionConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mHiddenShippingInfoFields:Ljava/util/List;

    .line 99
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mHiddenShippingInfoFields:Ljava/util/List;

    const-class v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mOptionalShippingInfoFields:Ljava/util/List;

    .line 101
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mOptionalShippingInfoFields:Ljava/util/List;

    const-class v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 102
    const-class v0, Lcom/stripe/android/model/Address;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ShippingInformation;

    iput-object v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    .line 103
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mShippingInfoRequired:Z

    .line 104
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-ne p1, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    iput-boolean v1, p0, Lcom/stripe/android/PaymentSessionConfig;->mShippingMethodRequired:Z

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/stripe/android/PaymentSessionConfig$1;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/stripe/android/PaymentSessionConfig;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_6

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 112
    :cond_1
    check-cast p1, Lcom/stripe/android/PaymentSessionConfig;

    .line 114
    invoke-virtual {p0}, Lcom/stripe/android/PaymentSessionConfig;->isShippingInfoRequired()Z

    move-result v1

    invoke-virtual {p1}, Lcom/stripe/android/PaymentSessionConfig;->isShippingInfoRequired()Z

    move-result v2

    if-eq v1, v2, :cond_2

    return v0

    .line 115
    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/PaymentSessionConfig;->isShippingMethodRequired()Z

    move-result v1

    invoke-virtual {p1}, Lcom/stripe/android/PaymentSessionConfig;->isShippingMethodRequired()Z

    move-result v2

    if-eq v1, v2, :cond_3

    return v0

    .line 116
    :cond_3
    invoke-virtual {p0}, Lcom/stripe/android/PaymentSessionConfig;->getHiddenShippingInfoFields()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/PaymentSessionConfig;->getHiddenShippingInfoFields()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v0

    .line 117
    :cond_4
    invoke-virtual {p0}, Lcom/stripe/android/PaymentSessionConfig;->getOptionalShippingInfoFields()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/PaymentSessionConfig;->getOptionalShippingInfoFields()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v0

    .line 120
    :cond_5
    invoke-virtual {p0}, Lcom/stripe/android/PaymentSessionConfig;->getPrepopulatedShippingInfo()Lcom/stripe/android/model/ShippingInformation;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/PaymentSessionConfig;->getPrepopulatedShippingInfo()Lcom/stripe/android/model/ShippingInformation;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/ShippingInformation;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    :goto_0
    return v0
.end method

.method public getHiddenShippingInfoFields()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 150
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mHiddenShippingInfoFields:Ljava/util/List;

    return-object v0
.end method

.method public getOptionalShippingInfoFields()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 156
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mOptionalShippingInfoFields:Ljava/util/List;

    return-object v0
.end method

.method public getPrepopulatedShippingInfo()Lcom/stripe/android/model/ShippingInformation;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 161
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 125
    invoke-virtual {p0}, Lcom/stripe/android/PaymentSessionConfig;->getHiddenShippingInfoFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 126
    invoke-virtual {p0}, Lcom/stripe/android/PaymentSessionConfig;->getOptionalShippingInfoFields()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 127
    iget-object v1, p0, Lcom/stripe/android/PaymentSessionConfig;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    invoke-virtual {v1}, Lcom/stripe/android/model/ShippingInformation;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 128
    invoke-virtual {p0}, Lcom/stripe/android/PaymentSessionConfig;->isShippingInfoRequired()Z

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 129
    invoke-virtual {p0}, Lcom/stripe/android/PaymentSessionConfig;->isShippingMethodRequired()Z

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public isShippingInfoRequired()Z
    .locals 1

    .line 165
    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mShippingInfoRequired:Z

    return v0
.end method

.method public isShippingMethodRequired()Z
    .locals 1

    .line 169
    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mShippingMethodRequired:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mHiddenShippingInfoFields:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 141
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mOptionalShippingInfoFields:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 142
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionConfig;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 143
    iget-boolean p2, p0, Lcom/stripe/android/PaymentSessionConfig;->mShippingInfoRequired:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 144
    iget-boolean p2, p0, Lcom/stripe/android/PaymentSessionConfig;->mShippingMethodRequired:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
