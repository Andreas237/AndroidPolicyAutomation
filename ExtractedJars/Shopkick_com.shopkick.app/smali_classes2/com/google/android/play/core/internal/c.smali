.class final Lcom/google/android/play/core/internal/c;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/nio/ByteBuffer;

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:Ljava/nio/ByteBuffer;


# direct methods
.method private constructor <init>(Ljava/nio/ByteBuffer;JJJLjava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/internal/c;->a:Ljava/nio/ByteBuffer;

    iput-wide p2, p0, Lcom/google/android/play/core/internal/c;->b:J

    iput-wide p4, p0, Lcom/google/android/play/core/internal/c;->c:J

    iput-wide p6, p0, Lcom/google/android/play/core/internal/c;->d:J

    iput-object p8, p0, Lcom/google/android/play/core/internal/c;->e:Ljava/nio/ByteBuffer;

    return-void
.end method

.method synthetic constructor <init>(Ljava/nio/ByteBuffer;JJJLjava/nio/ByteBuffer;B)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lcom/google/android/play/core/internal/c;-><init>(Ljava/nio/ByteBuffer;JJJLjava/nio/ByteBuffer;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/play/core/internal/c;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/internal/c;->a:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method static synthetic b(Lcom/google/android/play/core/internal/c;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/play/core/internal/c;->b:J

    return-wide v0
.end method

.method static synthetic c(Lcom/google/android/play/core/internal/c;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/play/core/internal/c;->c:J

    return-wide v0
.end method

.method static synthetic d(Lcom/google/android/play/core/internal/c;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/play/core/internal/c;->d:J

    return-wide v0
.end method

.method static synthetic e(Lcom/google/android/play/core/internal/c;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/internal/c;->e:Ljava/nio/ByteBuffer;

    return-object p0
.end method
