.class public final Lcom/google/firebase/components/zzc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/components/zzc$zza;,
        Lcom/google/firebase/components/zzc$zzb;
    }
.end annotation


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/firebase/components/zzc$zzb;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 45
    new-instance v0, Lcom/google/firebase/components/zzc$zza;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/firebase/components/zzc$zza;-><init>(B)V

    invoke-direct {p0, p1, v0}, Lcom/google/firebase/components/zzc;-><init>(Landroid/content/Context;Lcom/google/firebase/components/zzc$zzb;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/firebase/components/zzc$zzb;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/google/firebase/components/zzc;->zza:Landroid/content/Context;

    .line 51
    iput-object p2, p0, Lcom/google/firebase/components/zzc;->zzb:Lcom/google/firebase/components/zzc$zzb;

    return-void
.end method

.method private static zza(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/google/firebase/components/ComponentRegistrar;",
            ">;"
        }
    .end annotation

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 61
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 63
    :try_start_0
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 64
    const-class v5, Lcom/google/firebase/components/ComponentRegistrar;

    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v4, "ComponentDiscovery"

    const-string v5, "Class %s is not an instance of %s"

    const/4 v6, 0x2

    .line 65
    new-array v6, v6, [Ljava/lang/Object;

    aput-object v1, v6, v2

    const-string v7, "com.google.firebase.components.ComponentRegistrar"

    aput-object v7, v6, v3

    .line 67
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 65
    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/firebase/components/ComponentRegistrar;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v5, "ComponentDiscovery"

    const-string v6, "Could not instantiate %s."

    .line 76
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v1, v3, v2

    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    move-exception v4

    const-string v5, "ComponentDiscovery"

    const-string v6, "Could not instantiate %s."

    .line 74
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v1, v3, v2

    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_2
    move-exception v4

    const-string v5, "ComponentDiscovery"

    const-string v6, "Class %s is not an found."

    .line 72
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v1, v3, v2

    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final zza()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/firebase/components/ComponentRegistrar;",
            ">;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/google/firebase/components/zzc;->zzb:Lcom/google/firebase/components/zzc$zzb;

    iget-object v1, p0, Lcom/google/firebase/components/zzc;->zza:Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/google/firebase/components/zzc$zzb;->zza(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/components/zzc;->zza(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
