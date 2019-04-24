.class final Lcom/google/firebase/iid/zzas;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzao:Lcom/google/firebase/iid/zzah;

.field private final zzar:Lcom/google/firebase/iid/zzau;

.field private final zzdb:J

.field private final zzdc:Landroid/os/PowerManager$WakeLock;

.field private final zzdd:Lcom/google/firebase/iid/FirebaseInstanceId;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Lcom/google/firebase/iid/zzah;Lcom/google/firebase/iid/zzau;J)V
    .locals 0
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzas;->zzdd:Lcom/google/firebase/iid/FirebaseInstanceId;

    iput-object p2, p0, Lcom/google/firebase/iid/zzas;->zzao:Lcom/google/firebase/iid/zzah;

    iput-object p3, p0, Lcom/google/firebase/iid/zzas;->zzar:Lcom/google/firebase/iid/zzau;

    iput-wide p4, p0, Lcom/google/firebase/iid/zzas;->zzdb:J

    invoke-virtual {p0}, Lcom/google/firebase/iid/zzas;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "power"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    const-string p2, "fiid-sync"

    const/4 p3, 0x1

    invoke-virtual {p1, p3, p2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/iid/zzas;->zzdc:Landroid/os/PowerManager$WakeLock;

    iget-object p1, p0, Lcom/google/firebase/iid/zzas;->zzdc:Landroid/os/PowerManager$WakeLock;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    return-void
.end method

.method private final zzag()Z
    .locals 6
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/iid/zzas;->zzdd:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->zzg()Lcom/google/firebase/iid/zzar;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/firebase/iid/zzas;->zzao:Lcom/google/firebase/iid/zzah;

    invoke-virtual {v2}, Lcom/google/firebase/iid/zzah;->zzx()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/firebase/iid/zzar;->zzj(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lcom/google/firebase/iid/zzas;->zzdd:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v3}, Lcom/google/firebase/iid/FirebaseInstanceId;->zzh()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v0, "FirebaseInstanceId"

    const-string v1, "Token retrieval failed: null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_1
    const-string v4, "FirebaseInstanceId"

    const/4 v5, 0x3

    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "FirebaseInstanceId"

    const-string v5, "Token successfully retrieved"

    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    if-eqz v0, :cond_3

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcom/google/firebase/iid/zzar;->zzcz:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    invoke-virtual {p0}, Lcom/google/firebase/iid/zzas;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v3, Landroid/content/Intent;

    const-string v4, "com.google.firebase.iid.TOKEN_REFRESH"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v4, Landroid/content/Intent;

    const-string v5, "com.google.firebase.INSTANCE_ID_EVENT"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-class v5, Lcom/google/firebase/iid/FirebaseInstanceIdReceiver;

    invoke-virtual {v4, v0, v5}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const-string v5, "wrapped_intent"

    invoke-virtual {v4, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {v0, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return v1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    const-string v1, "FirebaseInstanceId"

    const-string v3, "Token retrieval failed: "

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2
.end method


# virtual methods
.method final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/iid/zzas;->zzdd:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->zze()Lcom/google/firebase/FirebaseApp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/FirebaseApp;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/iid/zzas;->zzdc:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/iid/zzas;->zzdd:Lcom/google/firebase/iid/FirebaseInstanceId;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->zza(Z)V

    iget-object v0, p0, Lcom/google/firebase/iid/zzas;->zzao:Lcom/google/firebase/iid/zzah;

    invoke-virtual {v0}, Lcom/google/firebase/iid/zzah;->zzw()I

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    iget-object v0, p0, Lcom/google/firebase/iid/zzas;->zzdd:Lcom/google/firebase/iid/FirebaseInstanceId;

    :goto_1
    invoke-virtual {v0, v2}, Lcom/google/firebase/iid/FirebaseInstanceId;->zza(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    iget-object v0, p0, Lcom/google/firebase/iid/zzas;->zzdc:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lcom/google/firebase/iid/zzas;->zzah()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/firebase/iid/zzat;

    invoke-direct {v0, p0}, Lcom/google/firebase/iid/zzat;-><init>(Lcom/google/firebase/iid/zzas;)V

    invoke-virtual {v0}, Lcom/google/firebase/iid/zzat;->zzai()V

    goto :goto_2

    :cond_2
    invoke-direct {p0}, Lcom/google/firebase/iid/zzas;->zzag()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/firebase/iid/zzas;->zzar:Lcom/google/firebase/iid/zzau;

    iget-object v1, p0, Lcom/google/firebase/iid/zzas;->zzdd:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v0, v1}, Lcom/google/firebase/iid/zzau;->zza(Lcom/google/firebase/iid/FirebaseInstanceId;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/firebase/iid/zzas;->zzdd:Lcom/google/firebase/iid/FirebaseInstanceId;

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/firebase/iid/zzas;->zzdd:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-wide v1, p0, Lcom/google/firebase/iid/zzas;->zzdb:J

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/iid/FirebaseInstanceId;->zza(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/firebase/iid/zzas;->zzdc:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    throw v0
.end method

.method final zzah()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/firebase/iid/zzas;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
