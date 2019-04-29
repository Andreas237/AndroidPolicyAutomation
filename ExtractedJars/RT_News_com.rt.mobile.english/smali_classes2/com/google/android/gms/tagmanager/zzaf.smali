.class final Lcom/google/android/gms/tagmanager/zzaf;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/zzw;


# instance fields
.field private final synthetic zzaww:Lcom/google/android/gms/tagmanager/zzy;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/tagmanager/zzy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzaf;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/tagmanager/zzy;Lcom/google/android/gms/tagmanager/zzz;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/zzaf;-><init>(Lcom/google/android/gms/tagmanager/zzy;)V

    return-void
.end method


# virtual methods
.method public final zzcp(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzaf;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tagmanager/zzy;->zzcp(Ljava/lang/String;)V

    return-void
.end method

.method public final zzmk()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzaf;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/zzy;->zzmk()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzmm()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzaf;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzy;->zza(Lcom/google/android/gms/tagmanager/zzy;)Lcom/google/android/gms/tagmanager/zzej;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/zzej;->zzes()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzaf;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/tagmanager/zzy;->zza(Lcom/google/android/gms/tagmanager/zzy;J)V

    :cond_0
    return-void
.end method
