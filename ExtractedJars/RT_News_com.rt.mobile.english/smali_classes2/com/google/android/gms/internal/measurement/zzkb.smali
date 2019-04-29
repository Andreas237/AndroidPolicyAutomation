.class final Lcom/google/android/gms/internal/measurement/zzkb;
.super Ljava/lang/Object;


# instance fields
.field final name:Ljava/lang/String;

.field final origin:Ljava/lang/String;

.field final value:Ljava/lang/Object;

.field final zzarl:J

.field final zzti:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzkb;->zzti:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzkb;->origin:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzkb;->name:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/internal/measurement/zzkb;->zzarl:J

    iput-object p6, p0, Lcom/google/android/gms/internal/measurement/zzkb;->value:Ljava/lang/Object;

    return-void
.end method
