.class public final Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/Wallet$WalletOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private environment:I

.field private theme:I

.field private zzer:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->environment:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->theme:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->zzer:Z

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->environment:I

    return p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->theme:I

    return p0
.end method

.method static synthetic zzc(Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->zzer:Z

    return p0
.end method


# virtual methods
.method public final build()Lcom/google/android/gms/wallet/Wallet$WalletOptions;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wallet/Wallet$WalletOptions;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/wallet/Wallet$WalletOptions;-><init>(Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;Lcom/google/android/gms/wallet/zzap;)V

    return-object v0
.end method

.method public final setEnvironment(I)Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;
    .locals 3

    if-eqz p1, :cond_1

    if-eqz p1, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v2

    const-string p1, "Invalid environment value %d"

    invoke-static {v1, p1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput p1, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->environment:I

    return-object p0
.end method

.method public final setTheme(I)Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;
    .locals 3

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v2

    const-string p1, "Invalid theme value %d"

    invoke-static {v1, p1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput p1, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->theme:I

    return-object p0
.end method

.method public final useGoogleWallet()Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->zzer:Z

    return-object p0
.end method
