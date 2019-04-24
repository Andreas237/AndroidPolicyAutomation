.class public final Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Class;
    creator = "CreateWalletObjectsRequestCreator"
.end annotation

.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Reserved;
    value = {
        0x1
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/CreateWalletObjectsRequest$Builder;,
        Lcom/google/android/gms/wallet/CreateWalletObjectsRequest$CreateMode;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;",
            ">;"
        }
    .end annotation
.end field

.field public static final REQUEST_IMMEDIATE_SAVE:I = 0x1

.field public static final SHOW_SAVE_PROMPT:I


# instance fields
.field zzar:Lcom/google/android/gms/wallet/LoyaltyWalletObject;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x2
    .end annotation
.end field

.field zzas:Lcom/google/android/gms/wallet/OfferWalletObject;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x3
    .end annotation
.end field

.field zzat:Lcom/google/android/gms/wallet/GiftCardWalletObject;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x4
    .end annotation
.end field

.field zzau:I
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x5
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/zzj;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/zzj;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/wallet/GiftCardWalletObject;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzat:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/wallet/LoyaltyWalletObject;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzar:Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/wallet/LoyaltyWalletObject;Lcom/google/android/gms/wallet/OfferWalletObject;Lcom/google/android/gms/wallet/GiftCardWalletObject;I)V
    .locals 0
    .param p1    # Lcom/google/android/gms/wallet/LoyaltyWalletObject;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x2
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/wallet/OfferWalletObject;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x3
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/wallet/GiftCardWalletObject;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x4
        .end annotation
    .end param
    .param p4    # I
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x5
        .end annotation
    .end param
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Constructor;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzar:Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    iput-object p2, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzas:Lcom/google/android/gms/wallet/OfferWalletObject;

    iput-object p3, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzat:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    iput p4, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzau:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/wallet/OfferWalletObject;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzas:Lcom/google/android/gms/wallet/OfferWalletObject;

    return-void
.end method

.method public static newBuilder()Lcom/google/android/gms/wallet/CreateWalletObjectsRequest$Builder;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest$Builder;

    new-instance v1, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest$Builder;-><init>(Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;Lcom/google/android/gms/wallet/zzi;)V

    return-object v0
.end method


# virtual methods
.method public final getCreateMode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzau:I

    return v0
.end method

.method public final getGiftCardWalletObject()Lcom/google/android/gms/wallet/GiftCardWalletObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzat:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    return-object v0
.end method

.method public final getLoyaltyWalletObject()Lcom/google/android/gms/wallet/LoyaltyWalletObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzar:Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    return-object v0
.end method

.method public final getOfferWalletObject()Lcom/google/android/gms/wallet/OfferWalletObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzas:Lcom/google/android/gms/wallet/OfferWalletObject;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->beginObjectHeader(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzar:Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzas:Lcom/google/android/gms/wallet/OfferWalletObject;

    const/4 v3, 0x3

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzat:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    const/4 v3, 0x4

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget p2, p0, Lcom/google/android/gms/wallet/CreateWalletObjectsRequest;->zzau:I

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeInt(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->finishObjectHeader(Landroid/os/Parcel;I)V

    return-void
.end method
