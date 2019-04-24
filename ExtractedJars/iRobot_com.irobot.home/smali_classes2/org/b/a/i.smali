.class public Lorg/b/a/i;
.super Ljava/lang/IllegalArgumentException;


# static fields
.field private static final serialVersionUID:J = 0x578263712b904f39L


# instance fields
.field private final a:Lorg/b/a/d;

.field private final b:Lorg/b/a/h;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/Number;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/Number;

.field private final g:Ljava/lang/Number;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/b/a/d;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
    .locals 2

    invoke-virtual {p1}, Lorg/b/a/d;->x()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p2, p3, p4, v1}, Lorg/b/a/i;->a(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lorg/b/a/i;->a:Lorg/b/a/d;

    iput-object v1, p0, Lorg/b/a/i;->b:Lorg/b/a/h;

    invoke-virtual {p1}, Lorg/b/a/d;->x()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/b/a/i;->c:Ljava/lang/String;

    iput-object p2, p0, Lorg/b/a/i;->d:Ljava/lang/Number;

    iput-object v1, p0, Lorg/b/a/i;->e:Ljava/lang/String;

    iput-object p3, p0, Lorg/b/a/i;->f:Ljava/lang/Number;

    iput-object p4, p0, Lorg/b/a/i;->g:Ljava/lang/Number;

    invoke-super {p0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/b/a/i;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lorg/b/a/d;Ljava/lang/Number;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Lorg/b/a/d;->x()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p2, v1, v1, p3}, Lorg/b/a/i;->a(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lorg/b/a/i;->a:Lorg/b/a/d;

    iput-object v1, p0, Lorg/b/a/i;->b:Lorg/b/a/h;

    invoke-virtual {p1}, Lorg/b/a/d;->x()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/b/a/i;->c:Ljava/lang/String;

    iput-object p2, p0, Lorg/b/a/i;->d:Ljava/lang/Number;

    iput-object v1, p0, Lorg/b/a/i;->e:Ljava/lang/String;

    iput-object v1, p0, Lorg/b/a/i;->f:Ljava/lang/Number;

    iput-object v1, p0, Lorg/b/a/i;->g:Ljava/lang/Number;

    invoke-super {p0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/b/a/i;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lorg/b/a/d;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Lorg/b/a/d;->x()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lorg/b/a/i;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lorg/b/a/i;->a:Lorg/b/a/d;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/b/a/i;->b:Lorg/b/a/h;

    invoke-virtual {p1}, Lorg/b/a/d;->x()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/b/a/i;->c:Ljava/lang/String;

    iput-object p2, p0, Lorg/b/a/i;->e:Ljava/lang/String;

    iput-object v0, p0, Lorg/b/a/i;->d:Ljava/lang/Number;

    iput-object v0, p0, Lorg/b/a/i;->f:Ljava/lang/Number;

    iput-object v0, p0, Lorg/b/a/i;->g:Ljava/lang/Number;

    invoke-super {p0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/b/a/i;->h:Ljava/lang/String;

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Value "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x20

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-nez p2, :cond_1

    if-nez p3, :cond_0

    const-string p0, "is not supported"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string p0, "must not be larger than "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    if-nez p3, :cond_2

    const-string p0, "must not be smaller than "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    const-string p0, "must be in the range ["

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2c

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_0
    if-eqz p4, :cond_3

    const-string p0, ": "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "Value "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-nez p1, :cond_0

    const-string p1, "null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_0
    const/16 v1, 0x22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_0
    const-string p1, " for "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 p0, 0x20

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const-string p0, "is not supported"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lorg/b/a/i;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    :goto_0
    iput-object p1, p0, Lorg/b/a/i;->h:Ljava/lang/String;

    return-void

    :cond_0
    if-eqz p1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lorg/b/a/i;->h:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/b/a/i;->h:Ljava/lang/String;

    return-object v0
.end method
