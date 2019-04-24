.class final Lcom/google/firebase/iid/zzr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/Continuation<",
        "Landroid/os/Bundle;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzbj:Lcom/google/firebase/iid/zzo;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/zzo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/iid/zzr;->zzbj:Lcom/google/firebase/iid/zzo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lcom/google/android/gms/tasks/Task;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-class v0, Ljava/io/IOException;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->getResult(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    iget-object v0, p0, Lcom/google/firebase/iid/zzr;->zzbj:Lcom/google/firebase/iid/zzo;

    invoke-static {v0, p1}, Lcom/google/firebase/iid/zzo;->zza(Lcom/google/firebase/iid/zzo;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
