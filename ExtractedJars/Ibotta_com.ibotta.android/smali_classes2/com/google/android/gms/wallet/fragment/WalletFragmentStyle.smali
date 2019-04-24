.class public final Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Class;
    creator = "WalletFragmentStyleCreator"
.end annotation

.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Reserved;
    value = {
        0x1
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle$Dimension;,
        Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle$LogoImageType;,
        Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle$BuyButtonAppearance;,
        Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle$BuyButtonText;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzgb:Landroid/os/Bundle;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x2
    .end annotation
.end field

.field private zzgc:I
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x3
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/fragment/zzg;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/fragment/zzg;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "buyButtonAppearanceDefault"

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsLogoImageTypeDefault"

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method constructor <init>(Landroid/os/Bundle;I)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x2
        .end annotation
    .end param
    .param p2    # I
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x3
        .end annotation
    .end param
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Constructor;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    iput p2, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgc:I

    return-void
.end method

.method private static zza(I)J
    .locals 3

    if-gez p0, :cond_2

    const/4 v0, -0x1

    if-eq p0, v0, :cond_1

    const/4 v0, -0x2

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/16 v1, 0x27

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unexpected dimension value: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/16 v0, 0x81

    invoke-static {v0, p0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzc(II)J

    move-result-wide v0

    return-wide v0

    :cond_2
    const/4 v0, 0x0

    int-to-float p0, p0

    invoke-static {v0, p0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(IF)J

    move-result-wide v0

    return-wide v0
.end method

.method private static zza(IF)J
    .locals 2

    packed-switch p0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/16 v0, 0x1e

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Unrecognized unit: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    invoke-static {p0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzc(II)J

    move-result-wide p0

    return-wide p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final zza(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    invoke-virtual {v0, p3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p2, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10

    if-ne v0, v1, :cond_1

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(I)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    iget p1, p1, Landroid/util/TypedValue;->type:I

    const/16 p3, 0x26

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p3, "Unexpected dimension type: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    const/16 v0, 0x80

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzc(II)J

    move-result-wide v0

    :goto_0
    invoke-virtual {p2, p3, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    :cond_3
    return-void
.end method

.method private final zza(Landroid/content/res/TypedArray;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    invoke-virtual {v0, p3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    invoke-virtual {v0, p4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p1

    if-eqz p1, :cond_2

    iget p2, p1, Landroid/util/TypedValue;->type:I

    const/16 v0, 0x1c

    if-lt p2, v0, :cond_1

    iget p2, p1, Landroid/util/TypedValue;->type:I

    const/16 v0, 0x1f

    if-gt p2, v0, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-virtual {p2, p3, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {p2, p4, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final zzb(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    invoke-virtual {v0, p3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-virtual {p2, p3, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    return-void
.end method

.method private static zzc(II)J
    .locals 4

    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    int-to-long p0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method


# virtual methods
.method public final setBuyButtonAppearance(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "buyButtonAppearance"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public final setBuyButtonHeight(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "buyButtonHeight"

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(I)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object p0
.end method

.method public final setBuyButtonHeight(IF)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "buyButtonHeight"

    invoke-static {p1, p2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(IF)J

    move-result-wide p1

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object p0
.end method

.method public final setBuyButtonText(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "buyButtonText"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public final setBuyButtonWidth(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "buyButtonWidth"

    invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(I)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object p0
.end method

.method public final setBuyButtonWidth(IF)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "buyButtonWidth"

    invoke-static {p1, p2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(IF)J

    move-result-wide p1

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object p0
.end method

.method public final setMaskedWalletDetailsBackgroundColor(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsBackgroundResource"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsBackgroundColor"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public final setMaskedWalletDetailsBackgroundResource(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsBackgroundColor"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsBackgroundResource"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public final setMaskedWalletDetailsButtonBackgroundColor(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsButtonBackgroundResource"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsButtonBackgroundColor"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public final setMaskedWalletDetailsButtonBackgroundResource(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsButtonBackgroundColor"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsButtonBackgroundResource"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public final setMaskedWalletDetailsButtonTextAppearance(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsButtonTextAppearance"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public final setMaskedWalletDetailsHeaderTextAppearance(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsHeaderTextAppearance"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public final setMaskedWalletDetailsLogoImageType(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsLogoImageType"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public final setMaskedWalletDetailsLogoTextColor(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsLogoTextColor"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public final setMaskedWalletDetailsTextAppearance(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const-string v1, "maskedWalletDetailsTextAppearance"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object p0
.end method

.method public final setStyleResourceId(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgc:I

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->beginObjectHeader(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeBundle(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgc:I

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeInt(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->finishObjectHeader(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza(Ljava/lang/String;Landroid/util/DisplayMetrics;I)I
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgb:Landroid/os/Bundle;

    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const/16 p1, 0x20

    ushr-long v2, v0, p1

    long-to-int p1, v2

    long-to-int p3, v0

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    new-instance p2, Ljava/lang/IllegalStateException;

    const/16 p3, 0x24

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p3, "Unexpected unit or type: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    return p3

    :pswitch_1
    invoke-static {p3, p2}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result p1

    return p1

    :pswitch_2
    const/4 p1, 0x5

    goto :goto_0

    :pswitch_3
    const/4 p1, 0x4

    goto :goto_0

    :pswitch_4
    const/4 p1, 0x3

    goto :goto_0

    :pswitch_5
    const/4 p1, 0x2

    goto :goto_0

    :pswitch_6
    const/4 p1, 0x1

    goto :goto_0

    :pswitch_7
    const/4 p1, 0x0

    :goto_0
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    invoke-static {p1, p3, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1

    :cond_0
    return p3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x80
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zza(Landroid/content/Context;)V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzgc:I

    if-gtz v0, :cond_0

    sget v0, Lcom/google/android/gms/wallet/R$style;->WalletFragmentDefaultStyle:I

    :cond_0
    sget-object v1, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle:[I

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle_buyButtonWidth:I

    const-string v1, "buyButtonWidth"

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle_buyButtonHeight:I

    const-string v1, "buyButtonHeight"

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle_buyButtonText:I

    const-string v1, "buyButtonText"

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzb(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle_buyButtonAppearance:I

    const-string v1, "buyButtonAppearance"

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzb(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle_maskedWalletDetailsTextAppearance:I

    const-string v1, "maskedWalletDetailsTextAppearance"

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzb(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance:I

    const-string v1, "maskedWalletDetailsHeaderTextAppearance"

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzb(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle_maskedWalletDetailsBackground:I

    const-string v1, "maskedWalletDetailsBackgroundColor"

    const-string v2, "maskedWalletDetailsBackgroundResource"

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(Landroid/content/res/TypedArray;ILjava/lang/String;Ljava/lang/String;)V

    sget v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance:I

    const-string v1, "maskedWalletDetailsButtonTextAppearance"

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzb(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle_maskedWalletDetailsButtonBackground:I

    const-string v1, "maskedWalletDetailsButtonBackgroundColor"

    const-string v2, "maskedWalletDetailsButtonBackgroundResource"

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(Landroid/content/res/TypedArray;ILjava/lang/String;Ljava/lang/String;)V

    sget v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle_maskedWalletDetailsLogoTextColor:I

    const-string v1, "maskedWalletDetailsLogoTextColor"

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzb(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    sget v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle_maskedWalletDetailsLogoImageType:I

    const-string v1, "maskedWalletDetailsLogoImageType"

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zzb(Landroid/content/res/TypedArray;ILjava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
