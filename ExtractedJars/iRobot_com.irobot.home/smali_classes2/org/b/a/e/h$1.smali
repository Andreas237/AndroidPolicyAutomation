.class Lorg/b/a/e/h$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/b/a/e/h;->b(Ljava/lang/String;)Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/security/PrivilegedAction<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lorg/b/a/e/h;


# direct methods
.method constructor <init>(Lorg/b/a/e/h;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/b/a/e/h$1;->b:Lorg/b/a/e/h;

    iput-object p2, p0, Lorg/b/a/e/h$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/InputStream;
    .locals 2

    iget-object v0, p0, Lorg/b/a/e/h$1;->b:Lorg/b/a/e/h;

    invoke-static {v0}, Lorg/b/a/e/h;->a(Lorg/b/a/e/h;)Ljava/lang/ClassLoader;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/b/a/e/h$1;->b:Lorg/b/a/e/h;

    invoke-static {v0}, Lorg/b/a/e/h;->a(Lorg/b/a/e/h;)Ljava/lang/ClassLoader;

    move-result-object v0

    iget-object v1, p0, Lorg/b/a/e/h$1;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/b/a/e/h$1;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/ClassLoader;->getSystemResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public synthetic run()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/e/h$1;->a()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
