.class public Lorg/c/f/b/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/c/f/b/b$a;,
        Lorg/c/f/b/b$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/regex/Pattern;

.field private static final b:Ljava/util/regex/Pattern;

.field private static final c:Ljava/util/regex/Pattern;

.field private static k:Lorg/c/f/b/b$b;


# instance fields
.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Lorg/c/f/b/b$b;

.field private final i:Lorg/c/e/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "([^&=]+)=?([^&=]+)?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/c/f/b/b;->a:Ljava/util/regex/Pattern;

    const-string v0, "^(([^:/?#]+):)?(//(([^@/]*)@)?([^/?#:]*)(:(\\d*))?)?([^?#]*)(\\?([^#]*))?(#(.*))?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/c/f/b/b;->b:Ljava/util/regex/Pattern;

    const-string v0, "^(http|https):(//(([^@/]*)@)?([^/?#:]*)(:(\\d*))?)?([^?#]*)(\\?(.*))?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/c/f/b/b;->c:Ljava/util/regex/Pattern;

    new-instance v0, Lorg/c/f/b/b$1;

    invoke-direct {v0}, Lorg/c/f/b/b$1;-><init>()V

    sput-object v0, Lorg/c/f/b/b;->k:Lorg/c/f/b/b$b;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lorg/c/f/b/b;->g:I

    sget-object v0, Lorg/c/f/b/b;->k:Lorg/c/f/b/b$b;

    iput-object v0, p0, Lorg/c/f/b/b;->h:Lorg/c/f/b/b$b;

    new-instance v0, Lorg/c/e/f;

    invoke-direct {v0}, Lorg/c/e/f;-><init>()V

    iput-object v0, p0, Lorg/c/f/b/b;->i:Lorg/c/e/g;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lorg/c/f/b/b;
    .locals 3

    const-string v0, "\'uri\' must not be empty"

    invoke-static {p0, v0}, Lorg/c/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lorg/c/f/b/b;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p0, Lorg/c/f/b/b;

    invoke-direct {p0}, Lorg/c/f/b/b;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/c/f/b/b;->b(Ljava/lang/String;)Lorg/c/f/b/b;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/c/f/b/b;->c(Ljava/lang/String;)Lorg/c/f/b/b;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/c/f/b/b;->d(Ljava/lang/String;)Lorg/c/f/b/b;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/c/e/i;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lorg/c/f/b/b;->a(I)Lorg/c/f/b/b;

    :cond_0
    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/c/f/b/b;->e(Ljava/lang/String;)Lorg/c/f/b/b;

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/c/f/b/b;->f(Ljava/lang/String;)Lorg/c/f/b/b;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/c/f/b/b;->g(Ljava/lang/String;)Lorg/c/f/b/b;

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] is not a valid URI"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()Lorg/c/f/b/a;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/c/f/b/b;->a(Z)Lorg/c/f/b/a;

    move-result-object v0

    return-object v0
.end method

.method public a(Z)Lorg/c/f/b/a;
    .locals 11

    new-instance v10, Lorg/c/f/b/a;

    iget-object v1, p0, Lorg/c/f/b/b;->d:Ljava/lang/String;

    iget-object v2, p0, Lorg/c/f/b/b;->e:Ljava/lang/String;

    iget-object v3, p0, Lorg/c/f/b/b;->f:Ljava/lang/String;

    iget v4, p0, Lorg/c/f/b/b;->g:I

    iget-object v0, p0, Lorg/c/f/b/b;->h:Lorg/c/f/b/b$b;

    invoke-interface {v0}, Lorg/c/f/b/b$b;->a()Lorg/c/f/b/a$c;

    move-result-object v5

    iget-object v6, p0, Lorg/c/f/b/b;->i:Lorg/c/e/g;

    iget-object v7, p0, Lorg/c/f/b/b;->j:Ljava/lang/String;

    const/4 v9, 0x1

    move-object v0, v10

    move v8, p1

    invoke-direct/range {v0 .. v9}, Lorg/c/f/b/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILorg/c/f/b/a$c;Lorg/c/e/g;Ljava/lang/String;ZZ)V

    return-object v10
.end method

.method public a(I)Lorg/c/f/b/b;
    .locals 2

    const/4 v0, -0x1

    if-lt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "\'port\' must not be < -1"

    invoke-static {v0, v1}, Lorg/c/e/a;->a(ZLjava/lang/String;)V

    iput p1, p0, Lorg/c/f/b/b;->g:I

    return-object p0
.end method

.method public varargs a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/c/f/b/b;
    .locals 5

    const-string v0, "\'name\' must not be null"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lorg/c/e/h;->a([Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    array-length v0, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p2, v2

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v3, v1

    :goto_1
    iget-object v4, p0, Lorg/c/f/b/b;->i:Lorg/c/e/g;

    invoke-interface {v4, p1, v3}, Lorg/c/e/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lorg/c/f/b/b;->i:Lorg/c/e/g;

    invoke-interface {p2, p1, v1}, Lorg/c/e/g;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lorg/c/f/b/b;
    .locals 0

    iput-object p1, p0, Lorg/c/f/b/b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lorg/c/f/b/b;
    .locals 0

    iput-object p1, p0, Lorg/c/f/b/b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lorg/c/f/b/b;
    .locals 0

    iput-object p1, p0, Lorg/c/f/b/b;->f:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lorg/c/f/b/b;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lorg/c/f/b/b;->h:Lorg/c/f/b/b$b;

    invoke-interface {v0, p1}, Lorg/c/f/b/b$b;->a(Ljava/lang/String;)Lorg/c/f/b/b$b;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lorg/c/f/b/b;->h:Lorg/c/f/b/b$b;

    return-object p0

    :cond_0
    sget-object p1, Lorg/c/f/b/b;->k:Lorg/c/f/b/b$b;

    goto :goto_0

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lorg/c/f/b/b;
    .locals 4

    if-eqz p1, :cond_0

    sget-object v0, Lorg/c/f/b/b;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v2, v0, v3

    invoke-virtual {p0, v1, v0}, Lorg/c/f/b/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Lorg/c/f/b/b;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lorg/c/f/b/b;->i:Lorg/c/e/g;

    invoke-interface {p1}, Lorg/c/e/g;->clear()V

    :cond_1
    return-object p0
.end method

.method public g(Ljava/lang/String;)Lorg/c/f/b/b;
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "\'fragment\' must not be empty"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iput-object p1, p0, Lorg/c/f/b/b;->j:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    return-object p0
.end method
