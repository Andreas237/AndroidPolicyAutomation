.class Lorg/b/a/d/c$i;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/b/a/d/k;
.implements Lorg/b/a/d/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/b/a/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "i"
.end annotation


# static fields
.field private static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/Locale;",
            "Ljava/util/Map<",
            "Lorg/b/a/d;",
            "[",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lorg/b/a/d;

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lorg/b/a/d/c$i;->a:Ljava/util/Map;

    return-void
.end method

.method constructor <init>(Lorg/b/a/d;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/b/a/d/c$i;->b:Lorg/b/a/d;

    iput-boolean p2, p0, Lorg/b/a/d/c$i;->c:Z

    return-void
.end method

.method private a(JLorg/b/a/a;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/c$i;->b:Lorg/b/a/d;

    invoke-virtual {v0, p3}, Lorg/b/a/d;->a(Lorg/b/a/a;)Lorg/b/a/c;

    move-result-object p3

    iget-boolean v0, p0, Lorg/b/a/d/c$i;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p3, p1, p2, p4}, Lorg/b/a/c;->b(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p3, p1, p2, p4}, Lorg/b/a/c;->a(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private a(Lorg/b/a/t;Ljava/util/Locale;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lorg/b/a/d/c$i;->b:Lorg/b/a/d;

    invoke-interface {p1, v0}, Lorg/b/a/t;->b(Lorg/b/a/d;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/b/a/d/c$i;->b:Lorg/b/a/d;

    invoke-interface {p1}, Lorg/b/a/t;->c()Lorg/b/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/b/a/d;->a(Lorg/b/a/a;)Lorg/b/a/c;

    move-result-object v0

    iget-boolean v1, p0, Lorg/b/a/d/c$i;->c:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->b(Lorg/b/a/t;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->a(Lorg/b/a/t;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, "\ufffd"

    return-object p1
.end method


# virtual methods
.method public estimateParsedLength()I
    .locals 1

    invoke-virtual {p0}, Lorg/b/a/d/c$i;->estimatePrintedLength()I

    move-result v0

    return v0
.end method

.method public estimatePrintedLength()I
    .locals 1

    iget-boolean v0, p0, Lorg/b/a/d/c$i;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    return v0

    :cond_0
    const/16 v0, 0x14

    return v0
.end method

.method public parseInto(Lorg/b/a/d/e;Ljava/lang/CharSequence;I)I
    .locals 11

    invoke-virtual {p1}, Lorg/b/a/d/e;->b()Ljava/util/Locale;

    move-result-object v0

    sget-object v1, Lorg/b/a/d/c$i;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sget-object v2, Lorg/b/a/d/c$i;->a:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v2, p0, Lorg/b/a/d/c$i;->b:Lorg/b/a/d;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_4

    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v5, 0x20

    invoke-direct {v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    new-instance v6, Lorg/b/a/o;

    const-wide/16 v7, 0x0

    sget-object v9, Lorg/b/a/f;->a:Lorg/b/a/f;

    invoke-direct {v6, v7, v8, v9}, Lorg/b/a/o;-><init>(JLorg/b/a/f;)V

    iget-object v7, p0, Lorg/b/a/d/c$i;->b:Lorg/b/a/d;

    invoke-virtual {v6, v7}, Lorg/b/a/o;->a(Lorg/b/a/d;)Lorg/b/a/o$a;

    move-result-object v6

    invoke-virtual {v6}, Lorg/b/a/o$a;->h()I

    move-result v7

    invoke-virtual {v6}, Lorg/b/a/o$a;->i()I

    move-result v8

    sub-int v9, v8, v7

    if-le v9, v5, :cond_1

    not-int p1, p3

    return p1

    :cond_1
    invoke-virtual {v6, v0}, Lorg/b/a/o$a;->c(Ljava/util/Locale;)I

    move-result v5

    :goto_0
    if-gt v7, v8, :cond_2

    invoke-virtual {v6, v7}, Lorg/b/a/o$a;->a(I)Lorg/b/a/o;

    invoke-virtual {v6, v0}, Lorg/b/a/o$a;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v0}, Lorg/b/a/o$a;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v0}, Lorg/b/a/o$a;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v0}, Lorg/b/a/o$a;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v0}, Lorg/b/a/o$a;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v0}, Lorg/b/a/o$a;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    const-string v6, "en"

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v6, p0, Lorg/b/a/d/c$i;->b:Lorg/b/a/d;

    invoke-static {}, Lorg/b/a/d;->w()Lorg/b/a/d;

    move-result-object v7

    if-ne v6, v7, :cond_3

    const-string v5, "BCE"

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "bce"

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "CE"

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "ce"

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x3

    :cond_3
    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v2, v6, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v6, v4

    iget-object v3, p0, Lorg/b/a/d/c$i;->b:Lorg/b/a/d;

    invoke-interface {v1, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v2

    goto :goto_1

    :cond_4
    aget-object v1, v2, v3

    check-cast v1, Ljava/util/Map;

    aget-object v2, v2, v4

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :goto_1
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    add-int/2addr v5, p3

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    :goto_2
    if-le v2, p3, :cond_6

    invoke-interface {p2, p3, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object p2, p0, Lorg/b/a/d/c$i;->b:Lorg/b/a/d;

    invoke-virtual {p1, p2, v3, v0}, Lorg/b/a/d/e;->a(Lorg/b/a/d;Ljava/lang/String;Ljava/util/Locale;)V

    return v2

    :cond_5
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_6
    not-int p1, p3

    return p1
.end method

.method public printTo(Ljava/lang/Appendable;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V
    .locals 0

    :try_start_0
    invoke-direct {p0, p2, p3, p4, p7}, Lorg/b/a/d/c$i;->a(JLorg/b/a/a;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const p2, 0xfffd

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public printTo(Ljava/lang/Appendable;Lorg/b/a/t;Ljava/util/Locale;)V
    .locals 0

    :try_start_0
    invoke-direct {p0, p2, p3}, Lorg/b/a/d/c$i;->a(Lorg/b/a/t;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const p2, 0xfffd

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method
