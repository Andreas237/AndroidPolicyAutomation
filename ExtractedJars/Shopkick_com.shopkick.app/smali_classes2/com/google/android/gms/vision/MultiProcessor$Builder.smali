.class public Lcom/google/android/gms/vision/MultiProcessor$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/MultiProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private zzbb:Lcom/google/android/gms/vision/MultiProcessor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/vision/MultiProcessor<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/vision/MultiProcessor$Factory;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/MultiProcessor$Factory<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/google/android/gms/vision/MultiProcessor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/vision/MultiProcessor;-><init>(Lcom/google/android/gms/vision/zze;)V

    iput-object v0, p0, Lcom/google/android/gms/vision/MultiProcessor$Builder;->zzbb:Lcom/google/android/gms/vision/MultiProcessor;

    if-eqz p1, :cond_0

    .line 5
    iget-object v0, p0, Lcom/google/android/gms/vision/MultiProcessor$Builder;->zzbb:Lcom/google/android/gms/vision/MultiProcessor;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/MultiProcessor;->zza(Lcom/google/android/gms/vision/MultiProcessor;Lcom/google/android/gms/vision/MultiProcessor$Factory;)Lcom/google/android/gms/vision/MultiProcessor$Factory;

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No factory supplied."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public build()Lcom/google/android/gms/vision/MultiProcessor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/vision/MultiProcessor<",
            "TT;>;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/google/android/gms/vision/MultiProcessor$Builder;->zzbb:Lcom/google/android/gms/vision/MultiProcessor;

    return-object v0
.end method

.method public setMaxGapFrames(I)Lcom/google/android/gms/vision/MultiProcessor$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/android/gms/vision/MultiProcessor$Builder<",
            "TT;>;"
        }
    .end annotation

    if-ltz p1, :cond_0

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/vision/MultiProcessor$Builder;->zzbb:Lcom/google/android/gms/vision/MultiProcessor;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/MultiProcessor;->zza(Lcom/google/android/gms/vision/MultiProcessor;I)I

    return-object p0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/16 v1, 0x1c

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Invalid max gap: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
