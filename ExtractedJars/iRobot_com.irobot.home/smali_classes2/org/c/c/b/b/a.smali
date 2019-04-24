.class public Lorg/c/c/b/b/a;
.super Lorg/c/c/b/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/c/c/b/a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# instance fields
.field private b:Lcom/google/gson/Gson;

.field private c:Ljava/lang/reflect/Type;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lorg/c/c/b/b/a;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-direct {p0, v0}, Lorg/c/c/b/b/a;-><init>(Lcom/google/gson/Gson;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/gson/Gson;)V
    .locals 4

    new-instance v0, Lorg/c/c/j;

    const-string v1, "application"

    const-string v2, "json"

    sget-object v3, Lorg/c/c/b/b/a;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2, v3}, Lorg/c/c/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    invoke-direct {p0, v0}, Lorg/c/c/b/a;-><init>(Lorg/c/c/j;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/c/c/b/b/a;->c:Ljava/lang/reflect/Type;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/c/c/b/b/a;->d:Z

    invoke-virtual {p0, p1}, Lorg/c/c/b/b/a;->a(Lcom/google/gson/Gson;)V

    return-void
.end method

.method private a(Lorg/c/c/c;)Ljava/nio/charset/Charset;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v0

    invoke-virtual {v0}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object p1

    invoke-virtual {p1}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lorg/c/c/b/b/a;->a:Ljava/nio/charset/Charset;

    return-object p1
.end method


# virtual methods
.method public a(Lcom/google/gson/Gson;)V
    .locals 1

    const-string v0, "\'gson\' must not be null"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/c/c/b/b/a;->b:Lcom/google/gson/Gson;

    return-void
.end method

.method protected a(Ljava/lang/Object;Lorg/c/c/g;)V
    .locals 2

    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-interface {p2}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object v1

    invoke-interface {p2}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object p2

    invoke-direct {p0, p2}, Lorg/c/c/b/b/a;->a(Lorg/c/c/c;)Ljava/nio/charset/Charset;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    :try_start_0
    iget-boolean p2, p0, Lorg/c/c/b/b/a;->d:Z

    if-eqz p2, :cond_0

    const-string p2, "{} && "

    invoke-virtual {v0, p2}, Ljava/io/OutputStreamWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    :cond_0
    invoke-virtual {p0}, Lorg/c/c/b/b/a;->b()Ljava/lang/reflect/Type;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object v1, p0, Lorg/c/c/b/b/a;->b:Lcom/google/gson/Gson;

    invoke-virtual {v1, p1, p2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lorg/c/c/b/b/a;->b:Lcom/google/gson/Gson;

    invoke-virtual {p2, p1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/Appendable;)V

    :goto_0
    invoke-virtual {v0}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_0
    .catch Lcom/google/gson/JsonIOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lorg/c/c/b/g;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not write JSON: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/gson/JsonIOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lorg/c/c/b/g;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method protected a(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public a(Ljava/lang/Class;Lorg/c/c/j;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lorg/c/c/j;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lorg/c/c/b/b/a;->a(Lorg/c/c/j;)Z

    move-result p1

    return p1
.end method

.method protected b(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lorg/c/c/d;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-interface {p2}, Lorg/c/c/d;->a()Ljava/io/InputStream;

    move-result-object v1

    invoke-interface {p2}, Lorg/c/c/d;->getHeaders()Lorg/c/c/c;

    move-result-object p2

    invoke-direct {p0, p2}, Lorg/c/c/b/b/a;->a(Lorg/c/c/c;)Ljava/nio/charset/Charset;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    :try_start_0
    invoke-virtual {p0}, Lorg/c/c/b/b/a;->b()Ljava/lang/reflect/Type;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lorg/c/c/b/b/a;->b:Lcom/google/gson/Gson;

    invoke-virtual {p1, v0, p2}, Lcom/google/gson/Gson;->fromJson(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p2, p0, Lorg/c/c/b/b/a;->b:Lcom/google/gson/Gson;

    invoke-virtual {p2, v0, p1}, Lcom/google/gson/Gson;->fromJson(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/gson/JsonIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/gson/JsonParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Lorg/c/c/b/f;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not read JSON: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/gson/JsonParseException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lorg/c/c/b/f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Lorg/c/c/b/f;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not read JSON: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/gson/JsonIOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lorg/c/c/b/f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    move-exception p1

    new-instance p2, Lorg/c/c/b/f;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not read JSON: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lorg/c/c/b/f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public b()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lorg/c/c/b/b/a;->c:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public b(Ljava/lang/Class;Lorg/c/c/j;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lorg/c/c/j;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lorg/c/c/b/b/a;->b(Lorg/c/c/j;)Z

    move-result p1

    return p1
.end method
