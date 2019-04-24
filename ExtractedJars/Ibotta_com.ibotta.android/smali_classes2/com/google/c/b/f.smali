.class public final Lcom/google/c/b/f;
.super Ljava/lang/Object;
.source "IMASDK"


# static fields
.field static final a:Lcom/google/c/a/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, ", "

    .line 330
    invoke-static {v0}, Lcom/google/c/a/d;->a(Ljava/lang/String;)Lcom/google/c/a/d;

    move-result-object v0

    const-string v1, "null"

    invoke-virtual {v0, v1}, Lcom/google/c/a/d;->b(Ljava/lang/String;)Lcom/google/c/a/d;

    move-result-object v0

    sput-object v0, Lcom/google/c/b/f;->a:Lcom/google/c/a/d;

    return-void
.end method

.method static a(I)Ljava/lang/StringBuilder;
    .locals 5

    const-string v0, "size"

    .line 319
    invoke-static {p0, v0}, Lcom/google/c/b/e;->a(ILjava/lang/String;)I

    .line 320
    new-instance v0, Ljava/lang/StringBuilder;

    int-to-long v1, p0

    const-wide/16 v3, 0x8

    mul-long v1, v1, v3

    const-wide/32 v3, 0x40000000

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int p0, v1

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    return-object v0
.end method
