.class public final Lcom/google/android/gms/internal/wallet/zzak;
.super Lcom/google/android/gms/dynamic/RemoteCreator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/dynamic/RemoteCreator<",
        "Lcom/google/android/gms/internal/wallet/zzs;",
        ">;"
    }
.end annotation


# static fields
.field private static zzgl:Lcom/google/android/gms/internal/wallet/zzak;


# direct methods
.method protected constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl"

    invoke-direct {p0, v0}, Lcom/google/android/gms/dynamic/RemoteCreator;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static zza(Landroid/app/Activity;Lcom/google/android/gms/dynamic/IFragmentWrapper;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/internal/wallet/zzo;)Lcom/google/android/gms/internal/wallet/zzl;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        }
    .end annotation

    const v0, 0xbdfcb8

    invoke-static {p0, v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;I)I

    move-result v0

    if-nez v0, :cond_1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/wallet/zzak;->zzgl:Lcom/google/android/gms/internal/wallet/zzak;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/wallet/zzak;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wallet/zzak;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/wallet/zzak;->zzgl:Lcom/google/android/gms/internal/wallet/zzak;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/wallet/zzak;->zzgl:Lcom/google/android/gms/internal/wallet/zzak;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/wallet/zzak;->getRemoteCreatorInstance(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/wallet/zzs;

    invoke-static {p0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object p0

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/wallet/zzs;->zza(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/dynamic/IFragmentWrapper;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/internal/wallet/zzo;)Lcom/google/android/gms/internal/wallet/zzl;

    move-result-object p0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/dynamic/RemoteCreator$RemoteCreatorException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    new-instance p0, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;

    invoke-direct {p0, v0}, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;-><init>(I)V

    throw p0
.end method


# virtual methods
.method protected final synthetic getRemoteCreator(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "com.google.android.gms.wallet.internal.IWalletDynamiteCreator"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/wallet/zzs;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/wallet/zzs;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/wallet/zzt;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/wallet/zzt;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
