.class final Lcom/google/firebase/components/zzh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/firebase/inject/Provider<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final zza:Ljava/lang/Object;


# instance fields
.field private volatile zzb:Ljava/lang/Object;

.field private volatile zzc:Lcom/google/firebase/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/inject/Provider<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/firebase/components/zzh;->zza:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>(Lcom/google/firebase/components/ComponentFactory;Lcom/google/firebase/components/ComponentContainer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/components/ComponentFactory<",
            "TT;>;",
            "Lcom/google/firebase/components/ComponentContainer;",
            ")V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    sget-object v0, Lcom/google/firebase/components/zzh;->zza:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/firebase/components/zzh;->zzb:Ljava/lang/Object;

    .line 28
    new-instance v0, Lcom/google/firebase/components/zzi;

    invoke-direct {v0, p1, p2}, Lcom/google/firebase/components/zzi;-><init>(Lcom/google/firebase/components/ComponentFactory;Lcom/google/firebase/components/ComponentContainer;)V

    iput-object v0, p0, Lcom/google/firebase/components/zzh;->zzc:Lcom/google/firebase/inject/Provider;

    return-void
.end method

.method static final synthetic zza(Lcom/google/firebase/components/ComponentFactory;Lcom/google/firebase/components/ComponentContainer;)Ljava/lang/Object;
    .locals 0

    .line 28
    invoke-interface {p0, p1}, Lcom/google/firebase/components/ComponentFactory;->create(Lcom/google/firebase/components/ComponentContainer;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/google/firebase/components/zzh;->zzb:Ljava/lang/Object;

    .line 35
    sget-object v1, Lcom/google/firebase/components/zzh;->zza:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    .line 36
    monitor-enter p0

    .line 37
    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/components/zzh;->zzb:Ljava/lang/Object;

    .line 38
    sget-object v1, Lcom/google/firebase/components/zzh;->zza:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    .line 39
    iget-object v0, p0, Lcom/google/firebase/components/zzh;->zzc:Lcom/google/firebase/inject/Provider;

    invoke-interface {v0}, Lcom/google/firebase/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    .line 40
    iput-object v0, p0, Lcom/google/firebase/components/zzh;->zzb:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 43
    iput-object v1, p0, Lcom/google/firebase/components/zzh;->zzc:Lcom/google/firebase/inject/Provider;

    .line 45
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method
