.class public Lorg/junit/c/a/k;
.super Ljava/lang/Exception;


# static fields
.field private static final serialVersionUID:J = 0x71755621d4fb93L


# instance fields
.field private final a:Ljava/util/concurrent/TimeUnit;

.field private final b:J


# direct methods
.method public constructor <init>(JLjava/util/concurrent/TimeUnit;)V
    .locals 4

    const-string v0, "test timed out after %d %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p3}, Ljava/util/concurrent/TimeUnit;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p3, p0, Lorg/junit/c/a/k;->a:Ljava/util/concurrent/TimeUnit;

    iput-wide p1, p0, Lorg/junit/c/a/k;->b:J

    return-void
.end method
