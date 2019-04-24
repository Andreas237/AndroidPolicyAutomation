.class final synthetic Lcom/google/firebase/iid/zzp;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field private final zzat:Lcom/google/firebase/iid/FirebaseInstanceId;

.field private final zzau:Ljava/lang/String;

.field private final zzav:Ljava/lang/String;

.field private final zzaw:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field private final zzax:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzp;->zzat:Lcom/google/firebase/iid/FirebaseInstanceId;

    iput-object p2, p0, Lcom/google/firebase/iid/zzp;->zzau:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/iid/zzp;->zzav:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/iid/zzp;->zzaw:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p5, p0, Lcom/google/firebase/iid/zzp;->zzax:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 6

    iget-object v0, p0, Lcom/google/firebase/iid/zzp;->zzat:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v1, p0, Lcom/google/firebase/iid/zzp;->zzau:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/iid/zzp;->zzav:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/iid/zzp;->zzaw:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v4, p0, Lcom/google/firebase/iid/zzp;->zzax:Ljava/lang/String;

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/firebase/iid/FirebaseInstanceId;->zza(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
