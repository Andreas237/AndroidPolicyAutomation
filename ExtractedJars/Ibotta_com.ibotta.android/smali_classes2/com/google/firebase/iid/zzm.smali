.class final synthetic Lcom/google/firebase/iid/zzm;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field private final zzau:Lcom/google/firebase/iid/FirebaseInstanceId;

.field private final zzav:Ljava/lang/String;

.field private final zzaw:Ljava/lang/String;

.field private final zzax:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzm;->zzau:Lcom/google/firebase/iid/FirebaseInstanceId;

    iput-object p2, p0, Lcom/google/firebase/iid/zzm;->zzav:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/iid/zzm;->zzaw:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/iid/zzm;->zzax:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/iid/zzm;->zzau:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v1, p0, Lcom/google/firebase/iid/zzm;->zzav:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/iid/zzm;->zzaw:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/iid/zzm;->zzax:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/firebase/iid/FirebaseInstanceId;->zza(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
