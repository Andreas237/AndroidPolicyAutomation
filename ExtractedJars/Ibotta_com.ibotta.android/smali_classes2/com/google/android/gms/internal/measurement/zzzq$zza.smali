.class public abstract Lcom/google/android/gms/internal/measurement/zzzq$zza;
.super Lcom/google/android/gms/internal/measurement/zzzq;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzaam;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzzq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/measurement/zzzq$zza<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/measurement/zzzq<",
        "TMessageType;TBuilderType;>;",
        "Lcom/google/android/gms/internal/measurement/zzaam;"
    }
.end annotation


# instance fields
.field protected zzbsb:Lcom/google/android/gms/internal/measurement/zzzm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzzm<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzzq;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzm;->zzti()Lcom/google/android/gms/internal/measurement/zzzm;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzzq$zza;->zzbsb:Lcom/google/android/gms/internal/measurement/zzzm;

    return-void
.end method
