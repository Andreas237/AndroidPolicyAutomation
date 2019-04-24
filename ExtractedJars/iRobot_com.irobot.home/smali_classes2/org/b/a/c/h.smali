.class public abstract Lorg/b/a/c/h;
.super Lorg/b/a/c/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/b/a/c/h$a;
    }
.end annotation


# instance fields
.field private final a:Lorg/b/a/g;

.field final b:J


# direct methods
.method public constructor <init>(Lorg/b/a/d;J)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/b/a/c/b;-><init>(Lorg/b/a/d;)V

    iput-wide p2, p0, Lorg/b/a/c/h;->b:J

    new-instance p2, Lorg/b/a/c/h$a;

    invoke-virtual {p1}, Lorg/b/a/d;->y()Lorg/b/a/h;

    move-result-object p1

    invoke-direct {p2, p0, p1}, Lorg/b/a/c/h$a;-><init>(Lorg/b/a/c/h;Lorg/b/a/h;)V

    iput-object p2, p0, Lorg/b/a/c/h;->a:Lorg/b/a/g;

    return-void
.end method


# virtual methods
.method public abstract a(JI)J
.end method

.method public abstract a(JJ)J
.end method

.method public final d()Lorg/b/a/g;
    .locals 1

    iget-object v0, p0, Lorg/b/a/c/h;->a:Lorg/b/a/g;

    return-object v0
.end method
