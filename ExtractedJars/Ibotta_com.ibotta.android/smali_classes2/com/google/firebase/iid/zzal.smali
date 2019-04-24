.class final synthetic Lcom/google/firebase/iid/zzal;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field private final zzci:Lcom/google/firebase/iid/zzak;

.field private final zzcj:Landroid/util/Pair;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/zzak;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzal;->zzci:Lcom/google/firebase/iid/zzak;

    iput-object p2, p0, Lcom/google/firebase/iid/zzal;->zzcj:Landroid/util/Pair;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/iid/zzal;->zzci:Lcom/google/firebase/iid/zzak;

    iget-object v1, p0, Lcom/google/firebase/iid/zzal;->zzcj:Landroid/util/Pair;

    invoke-virtual {v0, v1, p1}, Lcom/google/firebase/iid/zzak;->zza(Landroid/util/Pair;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
