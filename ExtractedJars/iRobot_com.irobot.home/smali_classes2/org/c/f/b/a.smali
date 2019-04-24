.class public final Lorg/c/f/b/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/c/f/b/a$f;,
        Lorg/c/f/b/a$b;,
        Lorg/c/f/b/a$e;,
        Lorg/c/f/b/a$a;,
        Lorg/c/f/b/a$c;,
        Lorg/c/f/b/a$d;
    }
.end annotation


# static fields
.field static final a:Lorg/c/f/b/a$c;

.field private static final b:Ljava/util/regex/Pattern;


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:I

.field private final g:Lorg/c/f/b/a$c;

.field private final h:Lorg/c/e/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/lang/String;

.field private final j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\\{([^/]+?)\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/c/f/b/a;->b:Ljava/util/regex/Pattern;

    new-instance v0, Lorg/c/f/b/a$1;

    invoke-direct {v0}, Lorg/c/f/b/a$1;-><init>()V

    sput-object v0, Lorg/c/f/b/a;->a:Lorg/c/f/b/a$c;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILorg/c/f/b/a$c;Lorg/c/e/g;Ljava/lang/String;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lorg/c/f/b/a$c;",
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "ZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/c/f/b/a;->c:Ljava/lang/String;

    iput-object p2, p0, Lorg/c/f/b/a;->d:Ljava/lang/String;

    iput-object p3, p0, Lorg/c/f/b/a;->e:Ljava/lang/String;

    iput p4, p0, Lorg/c/f/b/a;->f:I

    if-eqz p5, :cond_0

    goto :goto_0

    :cond_0
    sget-object p5, Lorg/c/f/b/a;->a:Lorg/c/f/b/a$c;

    :goto_0
    iput-object p5, p0, Lorg/c/f/b/a;->g:Lorg/c/f/b/a$c;

    if-eqz p6, :cond_1

    goto :goto_1

    :cond_1
    new-instance p6, Lorg/c/e/f;

    const/4 p1, 0x0

    invoke-direct {p6, p1}, Lorg/c/e/f;-><init>(I)V

    :goto_1
    invoke-static {p6}, Lorg/c/e/c;->a(Lorg/c/e/g;)Lorg/c/e/g;

    move-result-object p1

    iput-object p1, p0, Lorg/c/f/b/a;->h:Lorg/c/e/g;

    iput-object p7, p0, Lorg/c/f/b/a;->i:Ljava/lang/String;

    iput-boolean p8, p0, Lorg/c/f/b/a;->j:Z

    if-eqz p9, :cond_2

    invoke-direct {p0}, Lorg/c/f/b/a;->k()V

    :cond_2
    return-void
.end method

.method private static a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method static a(Ljava/lang/String;Ljava/lang/String;Lorg/c/f/b/a$d;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "\'encoding\' must not be empty"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    invoke-static {p0, p2}, Lorg/c/f/b/a;->a([BLorg/c/f/b/a$d;)[B

    move-result-object p0

    new-instance p1, Ljava/lang/String;

    const-string p2, "US-ASCII"

    invoke-direct {p1, p0, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object p1
.end method

.method static synthetic a(Ljava/lang/String;Lorg/c/f/b/a$e;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$e;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(Lorg/c/f/b/a$e;)Lorg/c/f/b/a;
    .locals 11

    iget-boolean v0, p0, Lorg/c/f/b/a;->j:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Cannot expand an already encoded UriComponents object"

    invoke-static {v0, v1}, Lorg/c/e/a;->b(ZLjava/lang/String;)V

    iget-object v0, p0, Lorg/c/f/b/a;->c:Ljava/lang/String;

    invoke-static {v0, p1}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$e;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lorg/c/f/b/a;->d:Ljava/lang/String;

    invoke-static {v0, p1}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$e;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lorg/c/f/b/a;->e:Ljava/lang/String;

    invoke-static {v0, p1}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$e;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lorg/c/f/b/a;->g:Lorg/c/f/b/a$c;

    invoke-interface {v0, p1}, Lorg/c/f/b/a$c;->a(Lorg/c/f/b/a$e;)Lorg/c/f/b/a$c;

    move-result-object v6

    new-instance v7, Lorg/c/e/f;

    iget-object v0, p0, Lorg/c/f/b/a;->h:Lorg/c/e/g;

    invoke-interface {v0}, Lorg/c/e/g;->size()I

    move-result v0

    invoke-direct {v7, v0}, Lorg/c/e/f;-><init>(I)V

    iget-object v0, p0, Lorg/c/f/b/a;->h:Lorg/c/e/g;

    invoke-interface {v0}, Lorg/c/e/g;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5, p1}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$e;)Ljava/lang/String;

    move-result-object v5

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-static {v9, p1}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$e;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-interface {v7, v5, v8}, Lorg/c/e/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/c/f/b/a;->i:Ljava/lang/String;

    invoke-static {v0, p1}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$e;)Ljava/lang/String;

    move-result-object v8

    new-instance p1, Lorg/c/f/b/a;

    iget v5, p0, Lorg/c/f/b/a;->f:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v10}, Lorg/c/f/b/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILorg/c/f/b/a$c;Lorg/c/e/g;Ljava/lang/String;ZZ)V

    return-object p1
.end method

.method static synthetic a(Ljava/lang/String;Lorg/c/f/b/a$d;)V
    .locals 0

    invoke-static {p0, p1}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$d;)V

    return-void
.end method

.method private static a([BLorg/c/f/b/a$d;)[B
    .locals 5

    const-string v0, "\'source\' must not be null"

    invoke-static {p0, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "\'type\' must not be null"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    aget-byte v2, p0, v1

    if-gez v2, :cond_0

    add-int/lit16 v2, v2, 0x100

    :cond_0
    invoke-virtual {p1, v2}, Lorg/c/f/b/a$d;->isAllowed(I)Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_1
    invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_2

    :cond_1
    const/16 v3, 0x25

    invoke-virtual {v0, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    shr-int/lit8 v3, v2, 0x4

    and-int/lit8 v3, v3, 0xf

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Character;->forDigit(II)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    and-int/lit8 v2, v2, 0xf

    invoke-static {v2, v4}, Ljava/lang/Character;->forDigit(II)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v2

    invoke-virtual {v0, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x3a

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static b(Ljava/lang/String;Lorg/c/f/b/a$e;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/16 v0, 0x7b

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    return-object p0

    :cond_1
    sget-object v0, Lorg/c/f/b/a;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/c/f/b/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Lorg/c/f/b/a$e;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lorg/c/f/b/a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static b(Ljava/lang/String;Lorg/c/f/b/a$d;)V
    .locals 6

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_6

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x25

    if-ne v2, v3, :cond_4

    add-int/lit8 v2, v1, 0x2

    if-ge v2, v0, :cond_3

    add-int/lit8 v3, v1, 0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x10

    invoke-static {v3, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    invoke-static {v4, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    const/4 v5, -0x1

    if-eq v3, v5, :cond_2

    if-ne v4, v5, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    goto :goto_2

    :cond_2
    :goto_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid encoded sequence \""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\""

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid encoded sequence \""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\""

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {p1, v2}, Lorg/c/f/b/a$d;->isAllowed(I)Z

    move-result v3

    if-nez v3, :cond_5

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid character \'"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "\' for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lorg/c/f/b/a$d;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in \""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\""

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method private k()V
    .locals 4

    iget-boolean v0, p0, Lorg/c/f/b/a;->j:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lorg/c/f/b/a;->c:Ljava/lang/String;

    sget-object v1, Lorg/c/f/b/a$d;->SCHEME:Lorg/c/f/b/a$d;

    invoke-static {v0, v1}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$d;)V

    iget-object v0, p0, Lorg/c/f/b/a;->d:Ljava/lang/String;

    sget-object v1, Lorg/c/f/b/a$d;->USER_INFO:Lorg/c/f/b/a$d;

    invoke-static {v0, v1}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$d;)V

    iget-object v0, p0, Lorg/c/f/b/a;->e:Ljava/lang/String;

    sget-object v1, Lorg/c/f/b/a$d;->HOST:Lorg/c/f/b/a$d;

    invoke-static {v0, v1}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$d;)V

    iget-object v0, p0, Lorg/c/f/b/a;->g:Lorg/c/f/b/a$c;

    invoke-interface {v0}, Lorg/c/f/b/a$c;->b()V

    iget-object v0, p0, Lorg/c/f/b/a;->h:Lorg/c/e/g;

    invoke-interface {v0}, Lorg/c/e/g;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Lorg/c/f/b/a$d;->QUERY_PARAM:Lorg/c/f/b/a$d;

    invoke-static {v2, v3}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$d;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Lorg/c/f/b/a$d;->QUERY_PARAM:Lorg/c/f/b/a$d;

    invoke-static {v2, v3}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$d;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/c/f/b/a;->i:Ljava/lang/String;

    sget-object v1, Lorg/c/f/b/a$d;->FRAGMENT:Lorg/c/f/b/a$d;

    invoke-static {v0, v1}, Lorg/c/f/b/a;->b(Ljava/lang/String;Lorg/c/f/b/a$d;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/f/b/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lorg/c/f/b/a;
    .locals 12

    const-string v0, "\'encoding\' must not be empty"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lorg/c/f/b/a;->j:Z

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lorg/c/f/b/a;->c:Ljava/lang/String;

    sget-object v1, Lorg/c/f/b/a$d;->SCHEME:Lorg/c/f/b/a$d;

    invoke-static {v0, p1, v1}, Lorg/c/f/b/a;->a(Ljava/lang/String;Ljava/lang/String;Lorg/c/f/b/a$d;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lorg/c/f/b/a;->d:Ljava/lang/String;

    sget-object v1, Lorg/c/f/b/a$d;->USER_INFO:Lorg/c/f/b/a$d;

    invoke-static {v0, p1, v1}, Lorg/c/f/b/a;->a(Ljava/lang/String;Ljava/lang/String;Lorg/c/f/b/a$d;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lorg/c/f/b/a;->e:Ljava/lang/String;

    sget-object v1, Lorg/c/f/b/a$d;->HOST:Lorg/c/f/b/a$d;

    invoke-static {v0, p1, v1}, Lorg/c/f/b/a;->a(Ljava/lang/String;Ljava/lang/String;Lorg/c/f/b/a$d;)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lorg/c/f/b/a;->g:Lorg/c/f/b/a$c;

    invoke-interface {v0, p1}, Lorg/c/f/b/a$c;->a(Ljava/lang/String;)Lorg/c/f/b/a$c;

    move-result-object v7

    new-instance v8, Lorg/c/e/f;

    iget-object v0, p0, Lorg/c/f/b/a;->h:Lorg/c/e/g;

    invoke-interface {v0}, Lorg/c/e/g;->size()I

    move-result v0

    invoke-direct {v8, v0}, Lorg/c/e/f;-><init>(I)V

    iget-object v0, p0, Lorg/c/f/b/a;->h:Lorg/c/e/g;

    invoke-interface {v0}, Lorg/c/e/g;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v6, Lorg/c/f/b/a$d;->QUERY_PARAM:Lorg/c/f/b/a$d;

    invoke-static {v2, p1, v6}, Lorg/c/f/b/a;->a(Ljava/lang/String;Ljava/lang/String;Lorg/c/f/b/a$d;)Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    sget-object v10, Lorg/c/f/b/a$d;->QUERY_PARAM:Lorg/c/f/b/a$d;

    invoke-static {v9, p1, v10}, Lorg/c/f/b/a;->a(Ljava/lang/String;Ljava/lang/String;Lorg/c/f/b/a$d;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface {v8, v2, v6}, Lorg/c/e/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lorg/c/f/b/a;->i:Ljava/lang/String;

    sget-object v1, Lorg/c/f/b/a$d;->FRAGMENT:Lorg/c/f/b/a$d;

    invoke-static {v0, p1, v1}, Lorg/c/f/b/a;->a(Ljava/lang/String;Ljava/lang/String;Lorg/c/f/b/a$d;)Ljava/lang/String;

    move-result-object v9

    new-instance p1, Lorg/c/f/b/a;

    iget v6, p0, Lorg/c/f/b/a;->f:I

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v11}, Lorg/c/f/b/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILorg/c/f/b/a$c;Lorg/c/e/g;Ljava/lang/String;ZZ)V

    return-object p1
.end method

.method public a(Ljava/util/Map;)Lorg/c/f/b/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Lorg/c/f/b/a;"
        }
    .end annotation

    const-string v0, "\'uriVariables\' must not be null"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/c/f/b/a$b;

    invoke-direct {v0, p1}, Lorg/c/f/b/a$b;-><init>(Ljava/util/Map;)V

    invoke-direct {p0, v0}, Lorg/c/f/b/a;->a(Lorg/c/f/b/a$e;)Lorg/c/f/b/a;

    move-result-object p1

    return-object p1
.end method

.method public varargs a([Ljava/lang/Object;)Lorg/c/f/b/a;
    .locals 1

    const-string v0, "\'uriVariableValues\' must not be null"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/c/f/b/a$f;

    invoke-direct {v0, p1}, Lorg/c/f/b/a$f;-><init>([Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lorg/c/f/b/a;->a(Lorg/c/f/b/a$e;)Lorg/c/f/b/a;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/f/b/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/f/b/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lorg/c/f/b/a;->f:I

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/f/b/a;->g:Lorg/c/f/b/a$c;

    invoke-interface {v0}, Lorg/c/f/b/a$c;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/c/f/b/a;

    const/4 v2, 0x0

    if-eqz v1, :cond_c

    check-cast p1, Lorg/c/f/b/a;

    iget-object v1, p0, Lorg/c/f/b/a;->c:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/c/f/b/a;->c:Ljava/lang/String;

    iget-object v3, p1, Lorg/c/f/b/a;->c:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_1
    iget-object v1, p1, Lorg/c/f/b/a;->c:Ljava/lang/String;

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/c/f/b/a;->d:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lorg/c/f/b/a;->d:Ljava/lang/String;

    iget-object v3, p1, Lorg/c/f/b/a;->d:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_3
    iget-object v1, p1, Lorg/c/f/b/a;->d:Ljava/lang/String;

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lorg/c/f/b/a;->e:Ljava/lang/String;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lorg/c/f/b/a;->e:Ljava/lang/String;

    iget-object v3, p1, Lorg/c/f/b/a;->e:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_5
    iget-object v1, p1, Lorg/c/f/b/a;->e:Ljava/lang/String;

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lorg/c/f/b/a;->f:I

    iget v3, p1, Lorg/c/f/b/a;->f:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lorg/c/f/b/a;->g:Lorg/c/f/b/a$c;

    iget-object v3, p1, Lorg/c/f/b/a;->g:Lorg/c/f/b/a$c;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lorg/c/f/b/a;->h:Lorg/c/e/g;

    iget-object v3, p1, Lorg/c/f/b/a;->h:Lorg/c/e/g;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lorg/c/f/b/a;->i:Ljava/lang/String;

    if-eqz v1, :cond_a

    iget-object v1, p0, Lorg/c/f/b/a;->i:Ljava/lang/String;

    iget-object p1, p1, Lorg/c/f/b/a;->i:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_a
    iget-object p1, p1, Lorg/c/f/b/a;->i:Ljava/lang/String;

    if-eqz p1, :cond_b

    return v2

    :cond_b
    return v0

    :cond_c
    return v2
.end method

.method public f()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lorg/c/f/b/a;->h:Lorg/c/e/g;

    invoke-interface {v0}, Lorg/c/e/g;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/c/f/b/a;->h:Lorg/c/e/g;

    invoke-interface {v1}, Lorg/c/e/g;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lorg/c/e/c;->a(Ljava/util/Collection;)Z

    move-result v4

    const/16 v5, 0x26

    if-eqz v4, :cond_2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v4, :cond_3

    const/16 v6, 0x3d

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_6
    const/4 v0, 0x0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/f/b/a;->i:Ljava/lang/String;

    return-object v0
.end method

.method public h()Lorg/c/f/b/a;
    .locals 2

    :try_start_0
    const-string v0, "UTF-8"

    invoke-virtual {p0, v0}, Lorg/c/f/b/a;->a(Ljava/lang/String;)Lorg/c/f/b/a;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    const-string v1, "\"UTF-8\" not supported"

    invoke-direct {v0, v1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lorg/c/f/b/a;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/c/f/b/a;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/c/f/b/a;->d:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lorg/c/f/b/a;->d:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/c/f/b/a;->e:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lorg/c/f/b/a;->e:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lorg/c/f/b/a;->f:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/c/f/b/a;->g:Lorg/c/f/b/a$c;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/c/f/b/a;->h:Lorg/c/e/g;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lorg/c/f/b/a;->i:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v1, p0, Lorg/c/f/b/a;->i:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_3
    add-int/2addr v0, v1

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/c/f/b/a;->c:Ljava/lang/String;

    const/16 v2, 0x3a

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/c/f/b/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lorg/c/f/b/a;->d:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p0, Lorg/c/f/b/a;->e:Ljava/lang/String;

    if-eqz v1, :cond_4

    :cond_1
    const-string v1, "//"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/c/f/b/a;->d:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/c/f/b/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lorg/c/f/b/a;->e:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lorg/c/f/b/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget v1, p0, Lorg/c/f/b/a;->f:I

    const/4 v3, -0x1

    if-eq v1, v3, :cond_4

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/c/f/b/a;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {p0}, Lorg/c/f/b/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/c/e/i;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2f

    if-eq v2, v3, :cond_5

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    invoke-virtual {p0}, Lorg/c/f/b/a;->f()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    const/16 v2, 0x3f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    iget-object v1, p0, Lorg/c/f/b/a;->i:Ljava/lang/String;

    if-eqz v1, :cond_8

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/c/f/b/a;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/net/URI;
    .locals 9

    :try_start_0
    iget-boolean v0, p0, Lorg/c/f/b/a;->j:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/net/URI;

    invoke-virtual {p0}, Lorg/c/f/b/a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lorg/c/f/b/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/c/e/i;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2f

    if-eq v1, v2, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v6, v0

    new-instance v0, Ljava/net/URI;

    invoke-virtual {p0}, Lorg/c/f/b/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lorg/c/f/b/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lorg/c/f/b/a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lorg/c/f/b/a;->d()I

    move-result v5

    invoke-virtual {p0}, Lorg/c/f/b/a;->f()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lorg/c/f/b/a;->g()Ljava/lang/String;

    move-result-object v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not create URI object: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lorg/c/f/b/a;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
