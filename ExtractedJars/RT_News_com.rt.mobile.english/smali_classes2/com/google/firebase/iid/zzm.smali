.class final synthetic Lcom/google/firebase/iid/zzm;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzaq:Lcom/google/firebase/iid/FirebaseInstanceId;

.field private final zzar:Ljava/lang/String;

.field private final zzas:Ljava/lang/String;

.field private final zzat:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field private final zzau:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzm;->zzaq:Lcom/google/firebase/iid/FirebaseInstanceId;

    iput-object p2, p0, Lcom/google/firebase/iid/zzm;->zzar:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/iid/zzm;->zzas:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/iid/zzm;->zzat:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p5, p0, Lcom/google/firebase/iid/zzm;->zzau:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/iid/zzm;->zzaq:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v1, p0, Lcom/google/firebase/iid/zzm;->zzar:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/iid/zzm;->zzas:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/iid/zzm;->zzat:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v4, p0, Lcom/google/firebase/iid/zzm;->zzau:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/firebase/iid/FirebaseInstanceId;->zza(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;)V

    return-void
.end method
