.class final Lcom/google/android/gms/tagmanager/zzfc;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/zzs;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tagmanager/zzs<",
        "Lcom/google/android/gms/internal/measurement/zzwd;",
        "Lcom/google/android/gms/tagmanager/zzdz<",
        "Lcom/google/android/gms/internal/measurement/zzm;",
        ">;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/zzfb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p2, Lcom/google/android/gms/tagmanager/zzdz;

    invoke-virtual {p2}, Lcom/google/android/gms/tagmanager/zzdz;->getObject()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzacg;->zzvu()I

    move-result p1

    return p1
.end method
