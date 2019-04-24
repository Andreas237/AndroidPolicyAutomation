.class public final Lcom/google/android/gms/wallet/MaskedWallet;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Class;
    creator = "MaskedWalletCreator"
.end annotation

.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Reserved;
    value = {
        0x1
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/wallet/MaskedWallet;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field zzaw:Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x2
    .end annotation
.end field

.field zzax:Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x3
    .end annotation
.end field

.field zzaz:Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x5
    .end annotation
.end field

.field private zzba:Lcom/google/android/gms/wallet/zza;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x6
    .end annotation
.end field

.field private zzbb:Lcom/google/android/gms/wallet/zza;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x7
    .end annotation
.end field

.field zzbc:[Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x4
    .end annotation
.end field

.field zzbd:Lcom/google/android/gms/identity/intents/model/UserAddress;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0xa
    .end annotation
.end field

.field zzbe:Lcom/google/android/gms/identity/intents/model/UserAddress;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0xb
    .end annotation
.end field

.field zzbf:[Lcom/google/android/gms/wallet/InstrumentInfo;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0xc
    .end annotation
.end field

.field private zzda:[Lcom/google/android/gms/wallet/LoyaltyWalletObject;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x8
    .end annotation
.end field

.field private zzdb:[Lcom/google/android/gms/wallet/OfferWalletObject;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x9
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/zzx;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/zzx;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/MaskedWallet;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/wallet/zza;Lcom/google/android/gms/wallet/zza;[Lcom/google/android/gms/wallet/LoyaltyWalletObject;[Lcom/google/android/gms/wallet/OfferWalletObject;Lcom/google/android/gms/identity/intents/model/UserAddress;Lcom/google/android/gms/identity/intents/model/UserAddress;[Lcom/google/android/gms/wallet/InstrumentInfo;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x2
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x3
        .end annotation
    .end param
    .param p3    # [Ljava/lang/String;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x4
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x5
        .end annotation
    .end param
    .param p5    # Lcom/google/android/gms/wallet/zza;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x6
        .end annotation
    .end param
    .param p6    # Lcom/google/android/gms/wallet/zza;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x7
        .end annotation
    .end param
    .param p7    # [Lcom/google/android/gms/wallet/LoyaltyWalletObject;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x8
        .end annotation
    .end param
    .param p8    # [Lcom/google/android/gms/wallet/OfferWalletObject;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x9
        .end annotation
    .end param
    .param p9    # Lcom/google/android/gms/identity/intents/model/UserAddress;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0xa
        .end annotation
    .end param
    .param p10    # Lcom/google/android/gms/identity/intents/model/UserAddress;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0xb
        .end annotation
    .end param
    .param p11    # [Lcom/google/android/gms/wallet/InstrumentInfo;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0xc
        .end annotation
    .end param
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Constructor;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzaw:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzax:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbc:[Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzaz:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzba:Lcom/google/android/gms/wallet/zza;

    iput-object p6, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbb:Lcom/google/android/gms/wallet/zza;

    iput-object p7, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzda:[Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    iput-object p8, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzdb:[Lcom/google/android/gms/wallet/OfferWalletObject;

    iput-object p9, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbd:Lcom/google/android/gms/identity/intents/model/UserAddress;

    iput-object p10, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbe:Lcom/google/android/gms/identity/intents/model/UserAddress;

    iput-object p11, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbf:[Lcom/google/android/gms/wallet/InstrumentInfo;

    return-void
.end method

.method public static newBuilderFrom(Lcom/google/android/gms/wallet/MaskedWallet;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;

    new-instance v1, Lcom/google/android/gms/wallet/MaskedWallet;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/MaskedWallet;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;-><init>(Lcom/google/android/gms/wallet/MaskedWallet;Lcom/google/android/gms/wallet/zzw;)V

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getGoogleTransactionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setGoogleTransactionId(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getMerchantTransactionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setMerchantTransactionId(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getPaymentDescriptions()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setPaymentDescriptions([Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getInstrumentInfos()[Lcom/google/android/gms/wallet/InstrumentInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setInstrumentInfos([Lcom/google/android/gms/wallet/InstrumentInfo;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setEmail(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzda:[Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    iget-object v2, v0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->zzdc:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object v1, v2, Lcom/google/android/gms/wallet/MaskedWallet;->zzda:[Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzdb:[Lcom/google/android/gms/wallet/OfferWalletObject;

    iget-object v2, v0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->zzdc:Lcom/google/android/gms/wallet/MaskedWallet;

    iput-object v1, v2, Lcom/google/android/gms/wallet/MaskedWallet;->zzdb:[Lcom/google/android/gms/wallet/OfferWalletObject;

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getBuyerBillingAddress()Lcom/google/android/gms/identity/intents/model/UserAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setBuyerBillingAddress(Lcom/google/android/gms/identity/intents/model/UserAddress;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getBuyerShippingAddress()Lcom/google/android/gms/identity/intents/model/UserAddress;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setBuyerShippingAddress(Lcom/google/android/gms/identity/intents/model/UserAddress;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getBuyerBillingAddress()Lcom/google/android/gms/identity/intents/model/UserAddress;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbd:Lcom/google/android/gms/identity/intents/model/UserAddress;

    return-object v0
.end method

.method public final getBuyerShippingAddress()Lcom/google/android/gms/identity/intents/model/UserAddress;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbe:Lcom/google/android/gms/identity/intents/model/UserAddress;

    return-object v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzaz:Ljava/lang/String;

    return-object v0
.end method

.method public final getGoogleTransactionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzaw:Ljava/lang/String;

    return-object v0
.end method

.method public final getInstrumentInfos()[Lcom/google/android/gms/wallet/InstrumentInfo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbf:[Lcom/google/android/gms/wallet/InstrumentInfo;

    return-object v0
.end method

.method public final getMerchantTransactionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzax:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentDescriptions()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbc:[Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->beginObjectHeader(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzaw:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzax:Ljava/lang/String;

    const/4 v3, 0x3

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbc:[Ljava/lang/String;

    const/4 v3, 0x4

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeStringArray(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzaz:Ljava/lang/String;

    const/4 v3, 0x5

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzba:Lcom/google/android/gms/wallet/zza;

    const/4 v3, 0x6

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbb:Lcom/google/android/gms/wallet/zza;

    const/4 v3, 0x7

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzda:[Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    const/16 v3, 0x8

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeTypedArray(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzdb:[Lcom/google/android/gms/wallet/OfferWalletObject;

    const/16 v3, 0x9

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeTypedArray(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbd:Lcom/google/android/gms/identity/intents/model/UserAddress;

    const/16 v3, 0xa

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbe:Lcom/google/android/gms/identity/intents/model/UserAddress;

    const/16 v3, 0xb

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->zzbf:[Lcom/google/android/gms/wallet/InstrumentInfo;

    const/16 v3, 0xc

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeTypedArray(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->finishObjectHeader(Landroid/os/Parcel;I)V

    return-void
.end method
