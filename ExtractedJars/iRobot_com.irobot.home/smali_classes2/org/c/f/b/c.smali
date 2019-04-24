.class public Lorg/c/f/b/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/c/f/b/c$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/regex/Pattern;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final b:Lorg/c/f/b/a;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/regex/Pattern;

.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\\{([^/]+?)\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/c/f/b/c;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/c/f/b/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lorg/c/f/b/c$a;-><init>(Ljava/lang/String;Lorg/c/f/b/c$1;)V

    iput-object p1, p0, Lorg/c/f/b/c;->e:Ljava/lang/String;

    invoke-static {v0}, Lorg/c/f/b/c$a;->a(Lorg/c/f/b/c$a;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lorg/c/f/b/c;->c:Ljava/util/List;

    invoke-static {v0}, Lorg/c/f/b/c$a;->b(Lorg/c/f/b/c$a;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lorg/c/f/b/c;->d:Ljava/util/regex/Pattern;

    invoke-static {p1}, Lorg/c/f/b/b;->a(Ljava/lang/String;)Lorg/c/f/b/b;

    move-result-object p1

    invoke-virtual {p1}, Lorg/c/f/b/b;->a()Lorg/c/f/b/a;

    move-result-object p1

    iput-object p1, p0, Lorg/c/f/b/c;->b:Lorg/c/f/b/a;

    return-void
.end method

.method static synthetic a()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lorg/c/f/b/c;->a:Ljava/util/regex/Pattern;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Map;)Ljava/net/URI;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Ljava/net/URI;"
        }
    .end annotation

    iget-object v0, p0, Lorg/c/f/b/c;->b:Lorg/c/f/b/a;

    invoke-virtual {v0, p1}, Lorg/c/f/b/a;->a(Ljava/util/Map;)Lorg/c/f/b/a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/c/f/b/a;->h()Lorg/c/f/b/a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/c/f/b/a;->j()Ljava/net/URI;

    move-result-object p1

    return-object p1
.end method

.method public varargs a([Ljava/lang/Object;)Ljava/net/URI;
    .locals 1

    iget-object v0, p0, Lorg/c/f/b/c;->b:Lorg/c/f/b/a;

    invoke-virtual {v0, p1}, Lorg/c/f/b/a;->a([Ljava/lang/Object;)Lorg/c/f/b/a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/c/f/b/a;->h()Lorg/c/f/b/a;

    move-result-object p1

    invoke-virtual {p1}, Lorg/c/f/b/a;->j()Ljava/net/URI;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/f/b/c;->e:Ljava/lang/String;

    return-object v0
.end method
