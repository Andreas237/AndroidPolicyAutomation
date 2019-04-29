.class final synthetic Lcom/google/firebase/iid/zzad;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbt:Lcom/google/firebase/iid/zzab;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/zzab;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzad;->zzbt:Lcom/google/firebase/iid/zzab;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/iid/zzad;->zzbt:Lcom/google/firebase/iid/zzab;

    invoke-virtual {v0}, Lcom/google/firebase/iid/zzab;->zzz()V

    return-void
.end method
