.class public Lcom/stripe/android/PaymentSessionData;
.super Ljava/lang/Object;
.source "PaymentSessionData.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/PaymentSessionData;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mCartTotal:J

.field private mIsPaymentReadyToCharge:Z

.field private mPaymentResult:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mSelectedPaymentMethodId:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mShippingInformation:Lcom/stripe/android/model/ShippingInformation;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mShippingMethod:Lcom/stripe/android/model/ShippingMethod;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mShippingTotal:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 197
    new-instance v0, Lcom/stripe/android/PaymentSessionData$1;

    invoke-direct {v0}, Lcom/stripe/android/PaymentSessionData$1;-><init>()V

    sput-object v0, Lcom/stripe/android/PaymentSessionData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 18
    iput-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->mCartTotal:J

    const-string v2, "NO_PAYMENT"

    .line 20
    iput-object v2, p0, Lcom/stripe/android/PaymentSessionData;->mSelectedPaymentMethodId:Ljava/lang/String;

    .line 21
    iput-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->mShippingTotal:J

    const-string v0, "incomplete"

    .line 22
    iput-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mPaymentResult:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 18
    iput-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->mCartTotal:J

    const-string v2, "NO_PAYMENT"

    .line 20
    iput-object v2, p0, Lcom/stripe/android/PaymentSessionData;->mSelectedPaymentMethodId:Ljava/lang/String;

    .line 21
    iput-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->mShippingTotal:J

    const-string v0, "incomplete"

    .line 22
    iput-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mPaymentResult:Ljava/lang/String;

    .line 209
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->mCartTotal:J

    .line 210
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lcom/stripe/android/PaymentSessionData;->mIsPaymentReadyToCharge:Z

    .line 211
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/PaymentSessionUtils;->paymentResultFromString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mPaymentResult:Ljava/lang/String;

    .line 212
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mSelectedPaymentMethodId:Ljava/lang/String;

    .line 213
    const-class v0, Lcom/stripe/android/model/ShippingInformation;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ShippingInformation;

    iput-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    .line 214
    const-class v0, Lcom/stripe/android/model/ShippingMethod;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ShippingMethod;

    iput-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    .line 215
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->mShippingTotal:J

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/stripe/android/PaymentSessionData$1;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/stripe/android/PaymentSessionData;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_b

    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_2

    .line 150
    :cond_1
    check-cast p1, Lcom/stripe/android/PaymentSessionData;

    .line 152
    iget-wide v2, p0, Lcom/stripe/android/PaymentSessionData;->mCartTotal:J

    iget-wide v4, p1, Lcom/stripe/android/PaymentSessionData;->mCartTotal:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    return v1

    .line 153
    :cond_2
    iget-boolean v2, p0, Lcom/stripe/android/PaymentSessionData;->mIsPaymentReadyToCharge:Z

    iget-boolean v3, p1, Lcom/stripe/android/PaymentSessionData;->mIsPaymentReadyToCharge:Z

    if-eq v2, v3, :cond_3

    return v1

    .line 154
    :cond_3
    iget-wide v2, p0, Lcom/stripe/android/PaymentSessionData;->mShippingTotal:J

    iget-wide v4, p1, Lcom/stripe/android/PaymentSessionData;->mShippingTotal:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_4

    return v1

    .line 155
    :cond_4
    iget-object v2, p0, Lcom/stripe/android/PaymentSessionData;->mSelectedPaymentMethodId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/PaymentSessionData;->mSelectedPaymentMethodId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    .line 156
    :cond_5
    iget-object v2, p0, Lcom/stripe/android/PaymentSessionData;->mPaymentResult:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/PaymentSessionData;->mPaymentResult:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    .line 157
    :cond_6
    iget-object v2, p0, Lcom/stripe/android/PaymentSessionData;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    if-eqz v2, :cond_7

    iget-object v3, p1, Lcom/stripe/android/PaymentSessionData;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    .line 158
    invoke-virtual {v2, v3}, Lcom/stripe/android/model/ShippingInformation;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_0

    :cond_7
    iget-object v2, p1, Lcom/stripe/android/PaymentSessionData;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    if-eqz v2, :cond_8

    :goto_0
    return v1

    .line 162
    :cond_8
    iget-object v2, p0, Lcom/stripe/android/PaymentSessionData;->mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    if-eqz v2, :cond_9

    iget-object p1, p1, Lcom/stripe/android/PaymentSessionData;->mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    .line 163
    invoke-virtual {v2, p1}, Lcom/stripe/android/model/ShippingMethod;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_9
    iget-object p1, p1, Lcom/stripe/android/PaymentSessionData;->mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    if-nez p1, :cond_a

    goto :goto_1

    :cond_a
    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_b
    :goto_2
    return v1
.end method

.method public hashCode()I
    .locals 7

    .line 169
    iget-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->mCartTotal:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 170
    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->mIsPaymentReadyToCharge:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 171
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mSelectedPaymentMethodId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 172
    iget-wide v3, p0, Lcom/stripe/android/PaymentSessionData;->mShippingTotal:J

    ushr-long v5, v3, v2

    xor-long v2, v3, v5

    long-to-int v0, v2

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 173
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mPaymentResult:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 174
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/ShippingInformation;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 175
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/model/ShippingMethod;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v1, v2

    return v1
.end method

.method public setShippingInformation(Lcom/stripe/android/model/ShippingInformation;)V
    .locals 0
    .param p1    # Lcom/stripe/android/model/ShippingInformation;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 104
    iput-object p1, p0, Lcom/stripe/android/PaymentSessionData;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    return-void
.end method

.method public setShippingMethod(Lcom/stripe/android/model/ShippingMethod;)V
    .locals 0
    .param p1    # Lcom/stripe/android/model/ShippingMethod;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 124
    iput-object p1, p0, Lcom/stripe/android/PaymentSessionData;->mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 187
    iget-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->mCartTotal:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 188
    iget-boolean v0, p0, Lcom/stripe/android/PaymentSessionData;->mIsPaymentReadyToCharge:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 189
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mPaymentResult:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 190
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mSelectedPaymentMethodId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 191
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 192
    iget-object v0, p0, Lcom/stripe/android/PaymentSessionData;->mShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 193
    iget-wide v0, p0, Lcom/stripe/android/PaymentSessionData;->mShippingTotal:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
