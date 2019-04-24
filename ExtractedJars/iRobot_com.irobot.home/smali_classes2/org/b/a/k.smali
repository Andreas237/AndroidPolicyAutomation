.class public final Lorg/b/a/k;
.super Lorg/b/a/a/b;

# interfaces
.implements Ljava/io/Serializable;
.implements Lorg/b/a/s;


# static fields
.field private static final serialVersionUID:J = 0x2dc8bed0c60e9ccdL


# instance fields
.field private final a:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lorg/b/a/a/b;-><init>()V

    invoke-static {}, Lorg/b/a/e;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/b/a/k;->a:J

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Lorg/b/a/a/b;-><init>()V

    iput-wide p1, p0, Lorg/b/a/k;->a:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lorg/b/a/k;->a:J

    return-wide v0
.end method

.method public b()Lorg/b/a/a;
    .locals 1

    invoke-static {}, Lorg/b/a/b/q;->N()Lorg/b/a/b/q;

    move-result-object v0

    return-object v0
.end method
