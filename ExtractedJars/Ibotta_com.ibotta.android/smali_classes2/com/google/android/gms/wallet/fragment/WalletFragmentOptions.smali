.class public final Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Class;
    creator = "WalletFragmentOptionsCreator"
.end annotation

.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Reserved;
    value = {
        0x1
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private environment:I
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        defaultValueUnchecked = "com.google.android.gms.wallet.WalletConstants.ENVIRONMENT_PRODUCTION"
        getter = "getEnvironment"
        id = 0x2
    .end annotation
.end field

.field private mode:I
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        defaultValueUnchecked = "com.google.android.gms.wallet.fragment.WalletFragmentMode.BUY_BUTTON"
        getter = "getMode"
        id = 0x5
    .end annotation
.end field

.field private theme:I
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        defaultValueUnchecked = "com.google.android.gms.wallet.WalletConstants.THEME_DARK"
        getter = "getTheme"
        id = 0x3
    .end annotation
.end field

.field private zzfz:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        getter = "getFragmentStyle"
        id = 0x4
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/fragment/zzf;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/fragment/zzf;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->environment:I

    new-instance v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->zzfz:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    return-void
.end method

.method constructor <init>(IILcom/google/android/gms/wallet/fragment/WalletFragmentStyle;I)V
    .locals 0
    .param p1    # I
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x2
        .end annotation
    .end param
    .param p2    # I
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x3
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
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

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->environment:I

    iput p2, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->theme:I

    iput-object p3, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->zzfz:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    iput p4, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->mode:I

    return-void
.end method

.method public static newBuilder()Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;

    new-instance v1, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;-><init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/wallet/fragment/zze;)V

    return-object v0
.end method

.method static synthetic zza(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->environment:I

    return p1
.end method

.method public static zza(Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    .locals 5

    sget-object v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentOptions:[I

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentOptions_appTheme:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    sget v2, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentOptions_environment:I

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    sget v4, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentOptions_fragmentStyle:I

    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    sget v4, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentOptions_fragmentMode:I

    invoke-virtual {p1, v4, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p1, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;

    invoke-direct {p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;-><init>()V

    iput v0, p1, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->theme:I

    iput v2, p1, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->environment:I

    new-instance v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->setStyleResourceId(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->zzfz:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    iget-object v0, p1, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->zzfz:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(Landroid/content/Context;)V

    iput v3, p1, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->mode:I

    return-object p1
.end method

.method static synthetic zza(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->zzfz:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    return-object p1
.end method

.method static synthetic zzb(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->theme:I

    return p1
.end method

.method static synthetic zzc(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->mode:I

    return p1
.end method


# virtual methods
.method public final getEnvironment()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->environment:I

    return v0
.end method

.method public final getFragmentStyle()Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->zzfz:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    return-object v0
.end method

.method public final getMode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->mode:I

    return v0
.end method

.method public final getTheme()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->theme:I

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->beginObjectHeader(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->getEnvironment()I

    move-result v1

    const/4 v2, 0x2

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeInt(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->getTheme()I

    move-result v1

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeInt(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->getFragmentStyle()Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    move-result-object v1

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->getMode()I

    move-result p2

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeInt(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->finishObjectHeader(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->zzfz:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->zza(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
