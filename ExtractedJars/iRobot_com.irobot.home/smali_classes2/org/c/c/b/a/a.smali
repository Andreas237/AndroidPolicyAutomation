.class public Lorg/c/c/b/a/a;
.super Lorg/c/c/b/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/c/c/b/a<",
        "Lcom/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lorg/c/c/b/a/a;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lorg/c/c/j;

    sget-object v1, Lorg/c/c/j;->c:Lorg/c/c/j;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/j;->b:Lorg/c/c/j;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lorg/c/c/b/a;-><init>([Lorg/c/c/j;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected a(Lcom/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed;Lorg/c/c/g;)V
    .locals 5

    invoke-interface {p1}, Lcom/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed;->getEncoding()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/c/e/i;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v0, Lorg/c/c/b/a/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-interface {p2}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object v1

    invoke-virtual {v1}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    new-instance v3, Lorg/c/c/j;

    invoke-virtual {v1}, Lorg/c/c/j;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lorg/c/c/j;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v4, v1, v2}, Lorg/c/c/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    invoke-interface {p2}, Lorg/c/c/g;->getHeaders()Lorg/c/c/c;

    move-result-object v1

    invoke-virtual {v1, v3}, Lorg/c/c/c;->a(Lorg/c/c/j;)V

    :cond_1
    new-instance v1, Lcom/google/code/rome/android/repackaged/com/sun/syndication/io/SyndFeedOutput;

    invoke-direct {v1}, Lcom/google/code/rome/android/repackaged/com/sun/syndication/io/SyndFeedOutput;-><init>()V

    :try_start_0
    new-instance v2, Ljava/io/OutputStreamWriter;

    invoke-interface {p2}, Lorg/c/c/g;->a()Ljava/io/OutputStream;

    move-result-object p2

    invoke-direct {v2, p2, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-virtual {v1, p1, v2}, Lcom/google/code/rome/android/repackaged/com/sun/syndication/io/SyndFeedOutput;->output(Lcom/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed;Ljava/io/Writer;)V
    :try_end_0
    .catch Lcom/google/code/rome/android/repackaged/com/sun/syndication/io/FeedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lorg/c/c/b/g;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not write SyndFeed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/code/rome/android/repackaged/com/sun/syndication/io/FeedException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lorg/c/c/b/g;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lorg/c/c/g;)V
    .locals 0

    check-cast p1, Lcom/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed;

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/a/a;->a(Lcom/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed;Lorg/c/c/g;)V

    return-void
.end method

.method protected a(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    const-class v0, Lcom/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method protected synthetic b(Ljava/lang/Class;Lorg/c/c/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/c/c/b/a/a;->c(Ljava/lang/Class;Lorg/c/c/d;)Lcom/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed;

    move-result-object p1

    return-object p1
.end method

.method protected c(Ljava/lang/Class;Lorg/c/c/d;)Lcom/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed;",
            ">;",
            "Lorg/c/c/d;",
            ")",
            "Lcom/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed;"
        }
    .end annotation

    new-instance p1, Lcom/google/code/rome/android/repackaged/com/sun/syndication/io/SyndFeedInput;

    invoke-direct {p1}, Lcom/google/code/rome/android/repackaged/com/sun/syndication/io/SyndFeedInput;-><init>()V

    invoke-interface {p2}, Lorg/c/c/d;->getHeaders()Lorg/c/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/c/c/c;->c()Lorg/c/c/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lorg/c/c/j;->e()Ljava/nio/charset/Charset;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lorg/c/c/b/a/a;->a:Ljava/nio/charset/Charset;

    :goto_0
    :try_start_0
    new-instance v1, Ljava/io/InputStreamReader;

    invoke-interface {p2}, Lorg/c/c/d;->a()Ljava/io/InputStream;

    move-result-object p2

    invoke-direct {v1, p2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-virtual {p1, v1}, Lcom/google/code/rome/android/repackaged/com/sun/syndication/io/SyndFeedInput;->build(Ljava/io/Reader;)Lcom/google/code/rome/android/repackaged/com/sun/syndication/feed/synd/SyndFeed;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/code/rome/android/repackaged/com/sun/syndication/io/FeedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Lorg/c/c/b/f;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not read SyndFeed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/code/rome/android/repackaged/com/sun/syndication/io/FeedException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lorg/c/c/b/f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
