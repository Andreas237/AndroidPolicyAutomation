.class final synthetic Lcom/google/firebase/iid/zzl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/iid/zzam;


# instance fields
.field private final zzau:Lcom/google/firebase/iid/FirebaseInstanceId;

.field private final zzav:Ljava/lang/String;

.field private final zzaw:Ljava/lang/String;

.field private final zzaz:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzl;->zzau:Lcom/google/firebase/iid/FirebaseInstanceId;

    iput-object p2, p0, Lcom/google/firebase/iid/zzl;->zzav:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/iid/zzl;->zzaw:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/iid/zzl;->zzaz:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zzo()Lcom/google/android/gms/tasks/Task;
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/iid/zzl;->zzau:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v1, p0, Lcom/google/firebase/iid/zzl;->zzav:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/iid/zzl;->zzaw:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/iid/zzl;->zzaz:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/firebase/iid/FirebaseInstanceId;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
