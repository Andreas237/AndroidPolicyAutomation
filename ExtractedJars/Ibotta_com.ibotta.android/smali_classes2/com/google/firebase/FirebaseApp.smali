.class public Lcom/google/firebase/FirebaseApp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/FirebaseApp$zza;,
        Lcom/google/firebase/FirebaseApp$zzb;,
        Lcom/google/firebase/FirebaseApp$BackgroundStateChangeListener;,
        Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;,
        Lcom/google/firebase/FirebaseApp$IdTokenListener;
    }
.end annotation


# static fields
.field public static final DEFAULT_APP_NAME:Ljava/lang/String; = "[DEFAULT]"

.field static final zza:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/FirebaseApp;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "LOCK"
    .end annotation
.end field

.field private static final zzb:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzc:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzd:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final zze:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzf:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzg:Ljava/lang/Object;

.field private static final zzh:Ljava/util/concurrent/Executor;


# instance fields
.field private final zzi:Landroid/content/Context;

.field private final zzj:Ljava/lang/String;

.field private final zzk:Lcom/google/firebase/FirebaseOptions;

.field private final zzl:Lcom/google/firebase/components/zzd;

.field private final zzm:Landroid/content/SharedPreferences;

.field private final zzn:Lcom/google/firebase/events/Publisher;

.field private final zzo:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final zzp:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final zzq:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final zzr:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/firebase/FirebaseApp$IdTokenListener;",
            ">;"
        }
    .end annotation
.end field

.field private final zzs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/firebase/FirebaseApp$BackgroundStateChangeListener;",
            ">;"
        }
    .end annotation
.end field

.field private final zzt:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/firebase/zza;",
            ">;"
        }
    .end annotation
.end field

.field private zzu:Lcom/google/firebase/internal/InternalTokenProvider;

.field private zzv:Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "com.google.firebase.auth.FirebaseAuth"

    const-string v1, "com.google.firebase.iid.FirebaseInstanceId"

    .line 105
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/FirebaseApp;->zzb:Ljava/util/List;

    const-string v0, "com.google.firebase.crash.FirebaseCrash"

    .line 113
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/FirebaseApp;->zzc:Ljava/util/List;

    const-string v0, "com.google.android.gms.measurement.AppMeasurement"

    .line 120
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 121
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/FirebaseApp;->zzd:Ljava/util/List;

    const/4 v0, 0x0

    .line 124
    new-array v1, v0, [Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/google/firebase/FirebaseApp;->zze:Ljava/util/List;

    .line 127
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    sput-object v1, Lcom/google/firebase/FirebaseApp;->zzf:Ljava/util/Set;

    .line 129
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Lcom/google/firebase/FirebaseApp;->zzg:Ljava/lang/Object;

    .line 131
    new-instance v1, Lcom/google/firebase/FirebaseApp$zza;

    invoke-direct {v1, v0}, Lcom/google/firebase/FirebaseApp$zza;-><init>(B)V

    sput-object v1, Lcom/google/firebase/FirebaseApp;->zzh:Ljava/util/concurrent/Executor;

    .line 135
    new-instance v0, Landroid/support/v4/util/ArrayMap;

    invoke-direct {v0}, Landroid/support/v4/util/ArrayMap;-><init>()V

    sput-object v0, Lcom/google/firebase/FirebaseApp;->zza:Ljava/util/Map;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/FirebaseOptions;)V
    .locals 6

    .line 486
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzo:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 147
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzp:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 150
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzr:Ljava/util/List;

    .line 151
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzs:Ljava/util/List;

    .line 153
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzt:Ljava/util/List;

    .line 487
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzi:Landroid/content/Context;

    .line 488
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/firebase/FirebaseApp;->zzj:Ljava/lang/String;

    .line 489
    invoke-static {p3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/firebase/FirebaseOptions;

    iput-object p2, p0, Lcom/google/firebase/FirebaseApp;->zzk:Lcom/google/firebase/FirebaseOptions;

    .line 490
    new-instance p2, Lcom/google/firebase/internal/zza;

    invoke-direct {p2}, Lcom/google/firebase/internal/zza;-><init>()V

    iput-object p2, p0, Lcom/google/firebase/FirebaseApp;->zzv:Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;

    const-string p2, "com.google.firebase.common.prefs"

    .line 493
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p2

    iput-object p2, p0, Lcom/google/firebase/FirebaseApp;->zzm:Landroid/content/SharedPreferences;

    .line 494
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzb()Z

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lcom/google/firebase/FirebaseApp;->zzq:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 496
    new-instance p2, Lcom/google/firebase/components/zzc;

    invoke-direct {p2, p1}, Lcom/google/firebase/components/zzc;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/google/firebase/components/zzc;->zza()Ljava/util/List;

    move-result-object p2

    .line 497
    new-instance v0, Lcom/google/firebase/components/zzd;

    sget-object v2, Lcom/google/firebase/FirebaseApp;->zzh:Ljava/util/concurrent/Executor;

    const/4 v3, 0x3

    new-array v3, v3, [Lcom/google/firebase/components/Component;

    const-class v4, Landroid/content/Context;

    new-array v5, v1, [Ljava/lang/Class;

    .line 501
    invoke-static {p1, v4, v5}, Lcom/google/firebase/components/Component;->of(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lcom/google/firebase/components/Component;

    move-result-object p1

    aput-object p1, v3, v1

    const-class p1, Lcom/google/firebase/FirebaseApp;

    new-array v4, v1, [Ljava/lang/Class;

    .line 502
    invoke-static {p0, p1, v4}, Lcom/google/firebase/components/Component;->of(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lcom/google/firebase/components/Component;

    move-result-object p1

    const/4 v4, 0x1

    aput-object p1, v3, v4

    const-class p1, Lcom/google/firebase/FirebaseOptions;

    new-array v1, v1, [Ljava/lang/Class;

    .line 503
    invoke-static {p3, p1, v1}, Lcom/google/firebase/components/Component;->of(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lcom/google/firebase/components/Component;

    move-result-object p1

    const/4 p3, 0x2

    aput-object p1, v3, p3

    invoke-direct {v0, v2, p2, v3}, Lcom/google/firebase/components/zzd;-><init>(Ljava/util/concurrent/Executor;Ljava/lang/Iterable;[Lcom/google/firebase/components/Component;)V

    iput-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzl:Lcom/google/firebase/components/zzd;

    .line 504
    iget-object p1, p0, Lcom/google/firebase/FirebaseApp;->zzl:Lcom/google/firebase/components/zzd;

    const-class p2, Lcom/google/firebase/events/Publisher;

    invoke-virtual {p1, p2}, Lcom/google/firebase/components/zzd;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/events/Publisher;

    iput-object p1, p0, Lcom/google/firebase/FirebaseApp;->zzn:Lcom/google/firebase/events/Publisher;

    return-void
.end method

.method public static clearInstancesForTest()V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 668
    sget-object v0, Lcom/google/firebase/FirebaseApp;->zzg:Ljava/lang/Object;

    monitor-enter v0

    .line 669
    :try_start_0
    sget-object v1, Lcom/google/firebase/FirebaseApp;->zza:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 670
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static getApps(Landroid/content/Context;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/firebase/FirebaseApp;",
            ">;"
        }
    .end annotation

    .line 200
    sget-object p0, Lcom/google/firebase/FirebaseApp;->zzg:Ljava/lang/Object;

    monitor-enter p0

    .line 201
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lcom/google/firebase/FirebaseApp;->zza:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 202
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static getInstance()Lcom/google/firebase/FirebaseApp;
    .locals 4
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 212
    sget-object v0, Lcom/google/firebase/FirebaseApp;->zzg:Ljava/lang/Object;

    monitor-enter v0

    .line 213
    :try_start_0
    sget-object v1, Lcom/google/firebase/FirebaseApp;->zza:Ljava/util/Map;

    const-string v2, "[DEFAULT]"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/FirebaseApp;

    if-eqz v1, :cond_0

    .line 222
    monitor-exit v0

    return-object v1

    .line 215
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Default FirebaseApp is not initialized in this process "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    invoke-static {}, Lcom/google/android/gms/common/util/ProcessUtils;->getMyProcessName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ". Make sure to call FirebaseApp.initializeApp(Context) first."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 223
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static getInstance(Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 234
    sget-object v0, Lcom/google/firebase/FirebaseApp;->zzg:Ljava/lang/Object;

    monitor-enter v0

    .line 235
    :try_start_0
    sget-object v1, Lcom/google/firebase/FirebaseApp;->zza:Ljava/util/Map;

    .line 1768
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 235
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/FirebaseApp;

    if-eqz v1, :cond_0

    .line 237
    monitor-exit v0

    return-object v1

    .line 240
    :cond_0
    invoke-static {}, Lcom/google/firebase/FirebaseApp;->zzd()Ljava/util/List;

    move-result-object v1

    .line 242
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v1, ""

    goto :goto_0

    .line 245
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Available app names: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, ", "

    .line 246
    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v2, "FirebaseApp with name %s doesn\'t exist. %s"

    const/4 v3, 0x2

    .line 248
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    const/4 p0, 0x1

    aput-object v1, v3, p0

    .line 249
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 251
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception p0

    .line 252
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static getPersistenceKey(Ljava/lang/String;Lcom/google/firebase/FirebaseOptions;)Ljava/lang/String;
    .locals 1

    .line 680
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/common/util/Base64Utils;->encodeUrlSafeNoPadding([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "+"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    invoke-virtual {p1}, Lcom/google/firebase/FirebaseOptions;->getApplicationId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/common/util/Base64Utils;->encodeUrlSafeNoPadding([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static initializeApp(Landroid/content/Context;)Lcom/google/firebase/FirebaseApp;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 273
    sget-object v0, Lcom/google/firebase/FirebaseApp;->zzg:Ljava/lang/Object;

    monitor-enter v0

    .line 274
    :try_start_0
    sget-object v1, Lcom/google/firebase/FirebaseApp;->zza:Ljava/util/Map;

    const-string v2, "[DEFAULT]"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 275
    invoke-static {}, Lcom/google/firebase/FirebaseApp;->getInstance()Lcom/google/firebase/FirebaseApp;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 277
    :cond_0
    invoke-static {p0}, Lcom/google/firebase/FirebaseOptions;->fromResource(Landroid/content/Context;)Lcom/google/firebase/FirebaseOptions;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 p0, 0x0

    .line 279
    monitor-exit v0

    return-object p0

    .line 281
    :cond_1
    invoke-static {p0, v1}, Lcom/google/firebase/FirebaseApp;->initializeApp(Landroid/content/Context;Lcom/google/firebase/FirebaseOptions;)Lcom/google/firebase/FirebaseApp;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 282
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static initializeApp(Landroid/content/Context;Lcom/google/firebase/FirebaseOptions;)Lcom/google/firebase/FirebaseApp;
    .locals 1

    const-string v0, "[DEFAULT]"

    .line 294
    invoke-static {p0, p1, v0}, Lcom/google/firebase/FirebaseApp;->initializeApp(Landroid/content/Context;Lcom/google/firebase/FirebaseOptions;Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;

    move-result-object p0

    return-object p0
.end method

.method public static initializeApp(Landroid/content/Context;Lcom/google/firebase/FirebaseOptions;Ljava/lang/String;)Lcom/google/firebase/FirebaseApp;
    .locals 4

    .line 1774
    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastIceCreamSandwich()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1775
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/app/Application;

    if-eqz v0, :cond_0

    .line 1776
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    .line 1777
    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->initialize(Landroid/app/Application;)V

    .line 1778
    invoke-static {}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->getInstance()Lcom/google/android/gms/common/api/internal/BackgroundDetector;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/FirebaseApp$1;

    invoke-direct {v1}, Lcom/google/firebase/FirebaseApp$1;-><init>()V

    .line 1779
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->addListener(Lcom/google/android/gms/common/api/internal/BackgroundDetector$BackgroundStateChangeListener;)V

    .line 2768
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    .line 312
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 316
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 318
    :goto_0
    sget-object v0, Lcom/google/firebase/FirebaseApp;->zzg:Ljava/lang/Object;

    monitor-enter v0

    .line 319
    :try_start_0
    sget-object v1, Lcom/google/firebase/FirebaseApp;->zza:Ljava/util/Map;

    .line 320
    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "FirebaseApp name "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " already exists!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 319
    invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(ZLjava/lang/Object;)V

    const-string v1, "Application context cannot be null."

    .line 323
    invoke-static {p0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    new-instance v1, Lcom/google/firebase/FirebaseApp;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/firebase/FirebaseApp;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/FirebaseOptions;)V

    .line 325
    sget-object p0, Lcom/google/firebase/FirebaseApp;->zza:Ljava/util/Map;

    invoke-interface {p0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 328
    invoke-direct {v1}, Lcom/google/firebase/FirebaseApp;->zze()V

    return-object v1

    :catchall_0
    move-exception p0

    .line 326
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static onBackgroundStateChanged(Z)V
    .locals 4

    .line 334
    sget-object v0, Lcom/google/firebase/FirebaseApp;->zzg:Ljava/lang/Object;

    monitor-enter v0

    .line 335
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    sget-object v2, Lcom/google/firebase/FirebaseApp;->zza:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/FirebaseApp;

    .line 336
    iget-object v3, v2, Lcom/google/firebase/FirebaseApp;->zzo:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 337
    invoke-direct {v2, p0}, Lcom/google/firebase/FirebaseApp;->zza(Z)V

    goto :goto_0

    .line 340
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static synthetic zza()Ljava/lang/Object;
    .locals 1

    .line 84
    sget-object v0, Lcom/google/firebase/FirebaseApp;->zzg:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic zza(Lcom/google/firebase/FirebaseApp;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zze()V

    return-void
.end method

.method private static zza(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Iterable;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;TT;",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 728
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz p3, :cond_1

    .line 730
    :try_start_0
    sget-object v1, Lcom/google/firebase/FirebaseApp;->zze:Ljava/util/List;

    .line 731
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 734
    :cond_1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getInstance"

    const/4 v3, 0x1

    .line 735
    new-array v4, v3, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object p0, v4, v5

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 736
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v2

    .line 738
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 739
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "FirebaseApp"

    .line 761
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to initialize "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "FirebaseApp"

    const-string v2, "Firebase API initialization failure."

    .line 758
    invoke-static {v1, v2, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 753
    :catch_2
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "#getInstance has been removed by Proguard. Add keep rule to prevent it."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_3
    nop

    .line 744
    sget-object v1, Lcom/google/firebase/FirebaseApp;->zzf:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "FirebaseApp"

    .line 750
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is not linked. Skipping initialization."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 745
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is missing, but is required. Check if it has been removed by Proguard."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    return-void
.end method

.method private zza(Z)V
    .locals 2

    const-string v0, "FirebaseApp"

    const-string v1, "Notifying background state change listeners."

    .line 558
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 559
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/FirebaseApp$BackgroundStateChangeListener;

    .line 560
    invoke-interface {v1, p1}, Lcom/google/firebase/FirebaseApp$BackgroundStateChangeListener;->onBackgroundStateChanged(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private zzb()Z
    .locals 4

    .line 508
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzm:Landroid/content/SharedPreferences;

    const-string v1, "firebase_automatic_data_collection_enabled"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 509
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzm:Landroid/content/SharedPreferences;

    const-string v2, "firebase_automatic_data_collection_enabled"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0

    .line 512
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzi:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 514
    iget-object v2, p0, Lcom/google/firebase/FirebaseApp;->zzi:Landroid/content/Context;

    .line 516
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x80

    .line 515
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 517
    iget-object v2, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v2, :cond_1

    iget-object v2, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v3, "firebase_automatic_data_collection_enabled"

    .line 519
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 520
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "firebase_automatic_data_collection_enabled"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :cond_1
    return v1
.end method

.method private zzc()V
    .locals 2

    .line 530
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzp:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "FirebaseApp was deleted"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkState(ZLjava/lang/Object;)V

    return-void
.end method

.method private static zzd()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 686
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 687
    sget-object v1, Lcom/google/firebase/FirebaseApp;->zzg:Ljava/lang/Object;

    monitor-enter v1

    .line 688
    :try_start_0
    sget-object v2, Lcom/google/firebase/FirebaseApp;->zza:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/firebase/FirebaseApp;

    .line 689
    invoke-virtual {v3}, Lcom/google/firebase/FirebaseApp;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 691
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 692
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0

    :catchall_0
    move-exception v0

    .line 691
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private zze()V
    .locals 4

    .line 698
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzi:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/ContextCompat;->isDeviceProtectedStorage(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 701
    iget-object v1, p0, Lcom/google/firebase/FirebaseApp;->zzi:Landroid/content/Context;

    invoke-static {v1}, Lcom/google/firebase/FirebaseApp$zzb;->zza(Landroid/content/Context;)V

    goto :goto_0

    .line 703
    :cond_0
    iget-object v1, p0, Lcom/google/firebase/FirebaseApp;->zzl:Lcom/google/firebase/components/zzd;

    invoke-virtual {p0}, Lcom/google/firebase/FirebaseApp;->isDefaultApp()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/firebase/components/zzd;->zza(Z)V

    .line 705
    :goto_0
    const-class v1, Lcom/google/firebase/FirebaseApp;

    sget-object v2, Lcom/google/firebase/FirebaseApp;->zzb:Ljava/util/List;

    invoke-static {v1, p0, v2, v0}, Lcom/google/firebase/FirebaseApp;->zza(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Iterable;Z)V

    .line 706
    invoke-virtual {p0}, Lcom/google/firebase/FirebaseApp;->isDefaultApp()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 707
    const-class v1, Lcom/google/firebase/FirebaseApp;

    sget-object v2, Lcom/google/firebase/FirebaseApp;->zzc:Ljava/util/List;

    invoke-static {v1, p0, v2, v0}, Lcom/google/firebase/FirebaseApp;->zza(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Iterable;Z)V

    .line 709
    const-class v1, Landroid/content/Context;

    iget-object v2, p0, Lcom/google/firebase/FirebaseApp;->zzi:Landroid/content/Context;

    sget-object v3, Lcom/google/firebase/FirebaseApp;->zzd:Ljava/util/List;

    invoke-static {v1, v2, v3, v0}, Lcom/google/firebase/FirebaseApp;->zza(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Iterable;Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public addBackgroundStateChangeListener(Lcom/google/firebase/FirebaseApp$BackgroundStateChangeListener;)V
    .locals 1

    .line 606
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 607
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzo:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 608
    invoke-static {}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->getInstance()Lcom/google/android/gms/common/api/internal/BackgroundDetector;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->isInBackground()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 609
    invoke-interface {p1, v0}, Lcom/google/firebase/FirebaseApp$BackgroundStateChangeListener;->onBackgroundStateChanged(Z)V

    .line 611
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addIdTokenListener(Lcom/google/firebase/FirebaseApp$IdTokenListener;)V
    .locals 1
    .param p1    # Lcom/google/firebase/FirebaseApp$IdTokenListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 573
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 574
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzr:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 576
    iget-object p1, p0, Lcom/google/firebase/FirebaseApp;->zzv:Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;

    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzr:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;->onListenerCountChanged(I)V

    return-void
.end method

.method public addLifecycleEventListener(Lcom/google/firebase/zza;)V
    .locals 1
    .param p1    # Lcom/google/firebase/zza;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 643
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 644
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzt:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public delete()V
    .locals 3

    .line 402
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzp:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 407
    :cond_0
    sget-object v0, Lcom/google/firebase/FirebaseApp;->zzg:Ljava/lang/Object;

    monitor-enter v0

    .line 408
    :try_start_0
    sget-object v1, Lcom/google/firebase/FirebaseApp;->zza:Ljava/util/Map;

    iget-object v2, p0, Lcom/google/firebase/FirebaseApp;->zzj:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3659
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzt:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 409
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 182
    instance-of v0, p1, Lcom/google/firebase/FirebaseApp;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzj:Ljava/lang/String;

    check-cast p1, Lcom/google/firebase/FirebaseApp;

    invoke-virtual {p1}, Lcom/google/firebase/FirebaseApp;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 420
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 421
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzl:Lcom/google/firebase/components/zzd;

    invoke-virtual {v0, p1}, Lcom/google/firebase/components/zzd;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getApplicationContext()Landroid/content/Context;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 162
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 163
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzi:Landroid/content/Context;

    return-object v0
.end method

.method public getListeners()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/firebase/FirebaseApp$IdTokenListener;",
            ">;"
        }
    .end annotation

    .line 535
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 536
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzr:Ljava/util/List;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 169
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 170
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzj:Ljava/lang/String;

    return-object v0
.end method

.method public getOptions()Lcom/google/firebase/FirebaseOptions;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 176
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 177
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzk:Lcom/google/firebase/FirebaseOptions;

    return-object v0
.end method

.method public getPersistenceKey()Ljava/lang/String;
    .locals 2

    .line 630
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/google/firebase/FirebaseApp;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/util/Base64Utils;->encodeUrlSafeNoPadding([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    invoke-virtual {p0}, Lcom/google/firebase/FirebaseApp;->getOptions()Lcom/google/firebase/FirebaseOptions;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/FirebaseOptions;->getApplicationId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/util/Base64Utils;->encodeUrlSafeNoPadding([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getToken(Z)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/firebase/auth/GetTokenResult;",
            ">;"
        }
    .end annotation

    .line 367
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 369
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzu:Lcom/google/firebase/internal/InternalTokenProvider;

    if-nez v0, :cond_0

    .line 370
    new-instance p1, Lcom/google/firebase/FirebaseApiNotAvailableException;

    const-string v0, "firebase-auth is not linked, please fall back to unauthenticated mode."

    invoke-direct {p1, v0}, Lcom/google/firebase/FirebaseApiNotAvailableException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    .line 374
    :cond_0
    invoke-interface {v0, p1}, Lcom/google/firebase/internal/InternalTokenProvider;->getAccessToken(Z)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public getUid()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/firebase/FirebaseApiNotAvailableException;
        }
    .end annotation

    .line 385
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 386
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzu:Lcom/google/firebase/internal/InternalTokenProvider;

    if-eqz v0, :cond_0

    .line 390
    invoke-interface {v0}, Lcom/google/firebase/internal/InternalTokenProvider;->getUid()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 387
    :cond_0
    new-instance v0, Lcom/google/firebase/FirebaseApiNotAvailableException;

    const-string v1, "firebase-auth is not linked, please fall back to unauthenticated mode."

    invoke-direct {v0, v1}, Lcom/google/firebase/FirebaseApiNotAvailableException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public hashCode()I
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzj:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isAutomaticDataCollectionEnabled()Z
    .locals 1

    .line 457
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 458
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzq:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public isDefaultApp()Z
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const-string v0, "[DEFAULT]"

    .line 542
    invoke-virtual {p0}, Lcom/google/firebase/FirebaseApp;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public notifyIdTokenListeners(Lcom/google/firebase/internal/InternalTokenResult;)V
    .locals 4
    .param p1    # Lcom/google/firebase/internal/InternalTokenResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    const-string v0, "FirebaseApp"

    const-string v1, "Notifying auth state listeners."

    .line 548
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 550
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzr:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/firebase/FirebaseApp$IdTokenListener;

    .line 551
    invoke-interface {v3, p1}, Lcom/google/firebase/FirebaseApp$IdTokenListener;->onIdTokenChanged(Lcom/google/firebase/internal/InternalTokenResult;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string p1, "FirebaseApp"

    const-string v0, "Notified %d auth state listeners."

    const/4 v3, 0x1

    .line 554
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v3, v1

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public removeBackgroundStateChangeListener(Lcom/google/firebase/FirebaseApp$BackgroundStateChangeListener;)V
    .locals 1

    .line 620
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 621
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeIdTokenListener(Lcom/google/firebase/FirebaseApp$IdTokenListener;)V
    .locals 1
    .param p1    # Lcom/google/firebase/FirebaseApp$IdTokenListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 588
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 589
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzr:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 591
    iget-object p1, p0, Lcom/google/firebase/FirebaseApp;->zzv:Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;

    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzr:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;->onListenerCountChanged(I)V

    return-void
.end method

.method public removeLifecycleEventListener(Lcom/google/firebase/zza;)V
    .locals 1
    .param p1    # Lcom/google/firebase/zza;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 650
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 651
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 652
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzt:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public setAutomaticDataCollectionEnabled(Z)V
    .locals 4

    .line 471
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 472
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzq:Ljava/util/concurrent/atomic/AtomicBoolean;

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 473
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzm:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "firebase_automatic_data_collection_enabled"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 475
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzn:Lcom/google/firebase/events/Publisher;

    new-instance v1, Lcom/google/firebase/events/Event;

    const-class v2, Lcom/google/firebase/AutomaticDataCollectionChange;

    new-instance v3, Lcom/google/firebase/AutomaticDataCollectionChange;

    invoke-direct {v3, p1}, Lcom/google/firebase/AutomaticDataCollectionChange;-><init>(Z)V

    invoke-direct {v1, v2, v3}, Lcom/google/firebase/events/Event;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lcom/google/firebase/events/Publisher;->publish(Lcom/google/firebase/events/Event;)V

    :cond_0
    return-void
.end method

.method public setAutomaticResourceManagementEnabled(Z)V
    .locals 2

    .line 429
    invoke-direct {p0}, Lcom/google/firebase/FirebaseApp;->zzc()V

    .line 430
    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzo:Ljava/util/concurrent/atomic/AtomicBoolean;

    xor-int/lit8 v1, p1, 0x1

    .line 431
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 434
    invoke-static {}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->getInstance()Lcom/google/android/gms/common/api/internal/BackgroundDetector;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->isInBackground()Z

    move-result v0

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    .line 438
    invoke-direct {p0, p1}, Lcom/google/firebase/FirebaseApp;->zza(Z)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    .line 442
    invoke-direct {p0, p1}, Lcom/google/firebase/FirebaseApp;->zza(Z)V

    :cond_1
    return-void
.end method

.method public setIdTokenListenersCountChangedListener(Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;)V
    .locals 1
    .param p1    # Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 351
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;

    iput-object p1, p0, Lcom/google/firebase/FirebaseApp;->zzv:Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;

    .line 354
    iget-object p1, p0, Lcom/google/firebase/FirebaseApp;->zzv:Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;

    iget-object v0, p0, Lcom/google/firebase/FirebaseApp;->zzr:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v0}, Lcom/google/firebase/FirebaseApp$IdTokenListenersCountChangedListener;->onListenerCountChanged(I)V

    return-void
.end method

.method public setTokenProvider(Lcom/google/firebase/internal/InternalTokenProvider;)V
    .locals 0
    .param p1    # Lcom/google/firebase/internal/InternalTokenProvider;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 345
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/internal/InternalTokenProvider;

    iput-object p1, p0, Lcom/google/firebase/FirebaseApp;->zzu:Lcom/google/firebase/internal/InternalTokenProvider;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 195
    invoke-static {p0}, Lcom/google/android/gms/common/internal/Objects;->toStringHelper(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "name"

    iget-object v2, p0, Lcom/google/firebase/FirebaseApp;->zzj:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "options"

    iget-object v2, p0, Lcom/google/firebase/FirebaseApp;->zzk:Lcom/google/firebase/FirebaseOptions;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/Objects$ToStringHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
