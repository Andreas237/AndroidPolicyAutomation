.class public abstract Lorg/c/c/b/c/a;
.super Lorg/c/c/b/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/c/c/b/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljavax/xml/transform/TransformerFactory;


# direct methods
.method protected constructor <init>()V
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Lorg/c/c/j;

    sget-object v1, Lorg/c/c/j;->h:Lorg/c/c/j;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/j;->p:Lorg/c/c/j;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lorg/c/c/j;

    const-string v2, "application"

    const-string v3, "*+xml"

    invoke-direct {v1, v2, v3}, Lorg/c/c/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lorg/c/c/b/a;-><init>([Lorg/c/c/j;)V

    invoke-static {}, Ljavax/xml/transform/TransformerFactory;->newInstance()Ljavax/xml/transform/TransformerFactory;

    move-result-object v0

    iput-object v0, p0, Lorg/c/c/b/c/a;->a:Ljavax/xml/transform/TransformerFactory;

    return-void
.end method


# virtual methods
.method protected abstract a(Ljava/lang/Class;Lorg/c/c/c;Ljavax/xml/transform/Source;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+TT;>;",
            "Lorg/c/c/c;",
            "Ljavax/xml/transform/Source;",
            ")TT;"
        }
    .end annotation
.end method

.method protected abstract a(Ljava/lang/Object;Lorg/c/c/c;Ljavax/xml/transform/Result;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/c/c/c;",
            "Ljavax/xml/transform/Result;",
            ")V"
        }
    .end annotation
.end method

.method protected final a(Ljava/lang/Object;Lorg/c/c/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/c/c/g;",
            ")V"
        }
    .end annotation

    invoke-interface {p2}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object v0

    new-instance v1, Ljavax/xml/transform/stream/StreamResult;

    invoke-interface {p2}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object p2

    invoke-direct {v1, p2}, Ljavax/xml/transform/stream/StreamResult;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {p0, p1, v0, v1}, Lorg/c/c/b/c/a;->a(Ljava/lang/Object;Lorg/c/c/c;Ljavax/xml/transform/Result;)V

    return-void
.end method

.method protected a(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V
    .locals 1

    iget-object v0, p0, Lorg/c/c/b/c/a;->a:Ljavax/xml/transform/TransformerFactory;

    invoke-virtual {v0}, Ljavax/xml/transform/TransformerFactory;->newTransformer()Ljavax/xml/transform/Transformer;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljavax/xml/transform/Transformer;->transform(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V

    return-void
.end method

.method public final b(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+TT;>;",
            "Lorg/c/c/d;",
            ")TT;"
        }
    .end annotation

    invoke-interface {p2}, Lorg/c/c/d;->getHeaders()Lorg/c/c/c;

    move-result-object v0

    new-instance v1, Ljavax/xml/transform/stream/StreamSource;

    invoke-interface {p2}, Lorg/c/c/d;->a()Ljava/io/InputStream;

    move-result-object p2

    invoke-direct {v1, p2}, Ljavax/xml/transform/stream/StreamSource;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {p0, p1, v0, v1}, Lorg/c/c/b/c/a;->a(Ljava/lang/Class;Lorg/c/c/c;Ljavax/xml/transform/Source;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
