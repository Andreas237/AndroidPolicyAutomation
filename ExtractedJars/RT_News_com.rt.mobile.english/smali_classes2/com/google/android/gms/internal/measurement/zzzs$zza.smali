.class public abstract Lcom/google/android/gms/internal/measurement/zzzs$zza;
.super Lcom/google/android/gms/internal/measurement/zzzs;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzaao;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzzs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/measurement/zzzs$zza<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/measurement/zzzs<",
        "TMessageType;TBuilderType;>;",
        "Lcom/google/android/gms/internal/measurement/zzaao;"
    }
.end annotation


# instance fields
.field protected zzbsl:Lcom/google/android/gms/internal/measurement/zzzo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzzo<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzzs;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzzo;->zztr()Lcom/google/android/gms/internal/measurement/zzzo;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzzs$zza;->zzbsl:Lcom/google/android/gms/internal/measurement/zzzo;

    return-void
.end method
