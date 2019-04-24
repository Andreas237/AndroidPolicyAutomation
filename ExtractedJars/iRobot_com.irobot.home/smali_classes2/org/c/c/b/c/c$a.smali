.class Lorg/c/c/b/c/c$a;
.super Ljava/io/OutputStream;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/c/b/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:J


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/c/c/b/c/c$a;->a:J

    return-void
.end method

.method synthetic constructor <init>(Lorg/c/c/b/c/c$1;)V
    .locals 0

    invoke-direct {p0}, Lorg/c/c/b/c/c$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lorg/c/c/b/c/c$a;)J
    .locals 2

    iget-wide v0, p0, Lorg/c/c/b/c/c$a;->a:J

    return-wide v0
.end method


# virtual methods
.method public write(I)V
    .locals 4

    iget-wide v0, p0, Lorg/c/c/b/c/c$a;->a:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/c/c/b/c/c$a;->a:J

    return-void
.end method

.method public write([B)V
    .locals 4

    iget-wide v0, p0, Lorg/c/c/b/c/c$a;->a:J

    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/c/c/b/c/c$a;->a:J

    return-void
.end method

.method public write([BII)V
    .locals 2

    iget-wide p1, p0, Lorg/c/c/b/c/c$a;->a:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lorg/c/c/b/c/c$a;->a:J

    return-void
.end method
