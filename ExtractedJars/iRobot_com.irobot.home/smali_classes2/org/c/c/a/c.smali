.class public abstract Lorg/c/c/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/c/c/a/g;


# instance fields
.field private final a:Lorg/c/c/a/g;


# direct methods
.method protected constructor <init>(Lorg/c/c/a/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "\'requestFactory\' must not be null"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/c/c/a/c;->a:Lorg/c/c/a/g;

    return-void
.end method


# virtual methods
.method protected abstract a(Ljava/net/URI;Lorg/c/c/f;Lorg/c/c/a/g;)Lorg/c/c/a/e;
.end method

.method public final createRequest(Ljava/net/URI;Lorg/c/c/f;)Lorg/c/c/a/e;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a/c;->a:Lorg/c/c/a/g;

    invoke-virtual {p0, p1, p2, v0}, Lorg/c/c/a/c;->a(Ljava/net/URI;Lorg/c/c/f;Lorg/c/c/a/g;)Lorg/c/c/a/e;

    move-result-object p1

    return-object p1
.end method
