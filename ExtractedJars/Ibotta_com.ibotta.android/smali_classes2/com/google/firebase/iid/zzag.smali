.class final Lcom/google/firebase/iid/zzag;
.super Lcom/google/firebase/iid/zzae;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/iid/zzae<",
        "Landroid/os/Bundle;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(IILandroid/os/Bundle;)V
    .locals 0

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/iid/zzae;-><init>(IILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method final zzb(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "data"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/firebase/iid/zzae;->finish(Ljava/lang/Object;)V

    return-void
.end method

.method final zzv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
