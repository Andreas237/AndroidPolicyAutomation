.class public final Lcom/google/android/gms/wallet/R$styleable;
.super Ljava/lang/Object;
.source "R.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final CustomWalletTheme:[I

.field public static final CustomWalletTheme_customThemeStyle:I = 0x0

.field public static final CustomWalletTheme_toolbarTextColorStyle:I = 0x1

.field public static final CustomWalletTheme_windowTransitionStyle:I = 0x2

.field public static final WalletFragmentOptions:[I

.field public static final WalletFragmentOptions_appTheme:I = 0x0

.field public static final WalletFragmentOptions_environment:I = 0x1

.field public static final WalletFragmentOptions_fragmentMode:I = 0x2

.field public static final WalletFragmentOptions_fragmentStyle:I = 0x3

.field public static final WalletFragmentStyle:[I

.field public static final WalletFragmentStyle_buyButtonAppearance:I = 0x0

.field public static final WalletFragmentStyle_buyButtonHeight:I = 0x1

.field public static final WalletFragmentStyle_buyButtonText:I = 0x2

.field public static final WalletFragmentStyle_buyButtonWidth:I = 0x3

.field public static final WalletFragmentStyle_maskedWalletDetailsBackground:I = 0x4

.field public static final WalletFragmentStyle_maskedWalletDetailsButtonBackground:I = 0x5

.field public static final WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance:I = 0x6

.field public static final WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance:I = 0x7

.field public static final WalletFragmentStyle_maskedWalletDetailsLogoImageType:I = 0x8

.field public static final WalletFragmentStyle_maskedWalletDetailsLogoTextColor:I = 0x9

.field public static final WalletFragmentStyle_maskedWalletDetailsTextAppearance:I = 0xa


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    .line 109
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/wallet/R$styleable;->CustomWalletTheme:[I

    const/4 v0, 0x4

    .line 113
    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentOptions:[I

    const/16 v0, 0xb

    .line 118
    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle:[I

    return-void

    :array_0
    .array-data 4
        0x7f040128
        0x7f0402de
        0x7f0402fd
    .end array-data

    :array_1
    .array-data 4
        0x7f04002e
        0x7f040154
        0x7f04017c
        0x7f04017d
    .end array-data

    :array_2
    .array-data 4
        0x7f0400a8
        0x7f0400a9
        0x7f0400aa
        0x7f0400ab
        0x7f040213
        0x7f040214
        0x7f040215
        0x7f040216
        0x7f040217
        0x7f040218
        0x7f040219
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
