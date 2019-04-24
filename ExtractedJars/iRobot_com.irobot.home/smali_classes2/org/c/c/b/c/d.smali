.class public Lorg/c/c/b/c/d;
.super Lorg/c/c/b/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/c/c/b/c;-><init>()V

    new-instance v0, Lorg/c/c/b/c/c;

    invoke-direct {v0}, Lorg/c/c/b/c/c;-><init>()V

    invoke-virtual {p0, v0}, Lorg/c/c/b/c/d;->a(Lorg/c/c/b/e;)V

    return-void
.end method
