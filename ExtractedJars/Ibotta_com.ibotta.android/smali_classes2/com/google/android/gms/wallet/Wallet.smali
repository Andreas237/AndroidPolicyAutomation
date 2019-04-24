.class public final Lcom/google/android/gms/wallet/Wallet;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/Wallet$zzb;,
        Lcom/google/android/gms/wallet/Wallet$zza;,
        Lcom/google/android/gms/wallet/Wallet$WalletOptions;
    }
.end annotation


# static fields
.field public static final API:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api<",
            "Lcom/google/android/gms/wallet/Wallet$WalletOptions;",
            ">;"
        }
    .end annotation
.end field

.field private static final CLIENT_BUILDER:Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api$AbstractClientBuilder<",
            "Lcom/google/android/gms/internal/wallet/zzad;",
            "Lcom/google/android/gms/wallet/Wallet$WalletOptions;",
            ">;"
        }
    .end annotation
.end field

.field private static final CLIENT_KEY:Lcom/google/android/gms/common/api/Api$ClientKey;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api$ClientKey<",
            "Lcom/google/android/gms/internal/wallet/zzad;",
            ">;"
        }
    .end annotation
.end field

.field public static final Payments:Lcom/google/android/gms/wallet/Payments;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final zzep:Lcom/google/android/gms/wallet/wobs/WalletObjects;

.field private static final zzeq:Lcom/google/android/gms/internal/wallet/zze;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/Api$ClientKey;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/Api$ClientKey;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/Wallet;->CLIENT_KEY:Lcom/google/android/gms/common/api/Api$ClientKey;

    new-instance v0, Lcom/google/android/gms/wallet/zzap;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/zzap;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/Wallet;->CLIENT_BUILDER:Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;

    new-instance v0, Lcom/google/android/gms/common/api/Api;

    const-string v1, "Wallet.API"

    sget-object v2, Lcom/google/android/gms/wallet/Wallet;->CLIENT_BUILDER:Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;

    sget-object v3, Lcom/google/android/gms/wallet/Wallet;->CLIENT_KEY:Lcom/google/android/gms/common/api/Api$ClientKey;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$AbstractClientBuilder;Lcom/google/android/gms/common/api/Api$ClientKey;)V

    sput-object v0, Lcom/google/android/gms/wallet/Wallet;->API:Lcom/google/android/gms/common/api/Api;

    new-instance v0, Lcom/google/android/gms/internal/wallet/zzw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wallet/zzw;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/Wallet;->Payments:Lcom/google/android/gms/wallet/Payments;

    new-instance v0, Lcom/google/android/gms/internal/wallet/zzam;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wallet/zzam;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/Wallet;->zzep:Lcom/google/android/gms/wallet/wobs/WalletObjects;

    new-instance v0, Lcom/google/android/gms/internal/wallet/zzal;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wallet/zzal;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/Wallet;->zzeq:Lcom/google/android/gms/internal/wallet/zze;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getPaymentsClient(Landroid/app/Activity;Lcom/google/android/gms/wallet/Wallet$WalletOptions;)Lcom/google/android/gms/wallet/PaymentsClient;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/gms/wallet/Wallet$WalletOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/wallet/PaymentsClient;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/wallet/PaymentsClient;-><init>(Landroid/app/Activity;Lcom/google/android/gms/wallet/Wallet$WalletOptions;)V

    return-object v0
.end method

.method public static getPaymentsClient(Landroid/content/Context;Lcom/google/android/gms/wallet/Wallet$WalletOptions;)Lcom/google/android/gms/wallet/PaymentsClient;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/gms/wallet/Wallet$WalletOptions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/wallet/PaymentsClient;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/wallet/PaymentsClient;-><init>(Landroid/content/Context;Lcom/google/android/gms/wallet/Wallet$WalletOptions;)V

    return-object v0
.end method

.method public static getWalletObjectsClient(Landroid/app/Activity;Lcom/google/android/gms/wallet/Wallet$WalletOptions;)Lcom/google/android/gms/wallet/WalletObjectsClient;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/android/gms/wallet/Wallet$WalletOptions;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/wallet/WalletObjectsClient;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/wallet/WalletObjectsClient;-><init>(Landroid/app/Activity;Lcom/google/android/gms/wallet/Wallet$WalletOptions;)V

    return-object v0
.end method
