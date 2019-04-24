.class Lorg/c/f/a/k$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/f/a/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field private static final a:Z

.field private static final b:Z

.field private static final c:Z

.field private static final d:Z

.field private static final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "javax.xml.transform.Source"

    const-class v1, Lorg/c/f/a/k;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/c/e/b;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Z

    move-result v0

    sput-boolean v0, Lorg/c/f/a/k$b;->a:Z

    const-string v0, "org.simpleframework.xml.Serializer"

    const-class v1, Lorg/c/f/a/k;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/c/e/b;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Z

    move-result v0

    sput-boolean v0, Lorg/c/f/a/k$b;->b:Z

    const-string v0, "org.codehaus.jackson.map.ObjectMapper"

    const-class v1, Lorg/c/f/a/k;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/c/e/b;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const-string v0, "org.codehaus.jackson.JsonGenerator"

    const-class v3, Lorg/c/f/a/k;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/c/e/b;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lorg/c/f/a/k$b;->c:Z

    const-string v0, "com.fasterxml.jackson.databind.ObjectMapper"

    const-class v3, Lorg/c/f/a/k;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/c/e/b;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "com.fasterxml.jackson.core.JsonGenerator"

    const-class v3, Lorg/c/f/a/k;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-static {v0, v3}, Lorg/c/e/b;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    sput-boolean v1, Lorg/c/f/a/k$b;->d:Z

    const-string v0, "com.google.code.rome.android.repackaged.com.sun.syndication.feed.synd.SyndFeed"

    const-class v1, Lorg/c/f/a/k;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/c/e/b;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Z

    move-result v0

    sput-boolean v0, Lorg/c/f/a/k$b;->e:Z

    return-void
.end method

.method public static a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/c/c/b/e<",
            "*>;>;)V"
        }
    .end annotation

    new-instance v0, Lorg/c/c/b/b;

    invoke-direct {v0}, Lorg/c/c/b/b;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/c/c/b/i;

    invoke-direct {v0}, Lorg/c/c/b/i;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/c/c/b/h;

    invoke-direct {v0}, Lorg/c/c/b/h;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-boolean v0, Lorg/c/f/a/k$b;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Lorg/c/c/b/c/c;

    invoke-direct {v0}, Lorg/c/c/b/c/c;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/c/c/b/c/d;

    invoke-direct {v0}, Lorg/c/c/b/c/d;-><init>()V

    :goto_0
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v0, Lorg/c/c/b/c;

    invoke-direct {v0}, Lorg/c/c/b/c;-><init>()V

    goto :goto_0

    :goto_1
    sget-boolean v0, Lorg/c/f/a/k$b;->b:Z

    if-eqz v0, :cond_1

    new-instance v0, Lorg/c/c/b/c/b;

    invoke-direct {v0}, Lorg/c/c/b/c/b;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    sget-boolean v0, Lorg/c/f/a/k$b;->d:Z

    if-eqz v0, :cond_2

    new-instance v0, Lorg/c/c/b/b/b;

    invoke-direct {v0}, Lorg/c/c/b/b/b;-><init>()V

    :goto_2
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    sget-boolean v0, Lorg/c/f/a/k$b;->c:Z

    if-eqz v0, :cond_3

    new-instance v0, Lorg/c/c/b/b/c;

    invoke-direct {v0}, Lorg/c/c/b/b/c;-><init>()V

    goto :goto_2

    :cond_3
    :goto_3
    sget-boolean v0, Lorg/c/f/a/k$b;->e:Z

    if-eqz v0, :cond_4

    new-instance v0, Lorg/c/c/b/a/a;

    invoke-direct {v0}, Lorg/c/c/b/a/a;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-void
.end method
