.class Lorg/b/a/d/h;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/b/a/d/m;


# instance fields
.field private final a:Lorg/b/a/d/g;


# direct methods
.method private constructor <init>(Lorg/b/a/d/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/b/a/d/h;->a:Lorg/b/a/d/g;

    return-void
.end method

.method static a(Lorg/b/a/d/g;)Lorg/b/a/d/m;
    .locals 1

    instance-of v0, p0, Lorg/b/a/d/n;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/b/a/d/m;

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    new-instance v0, Lorg/b/a/d/h;

    invoke-direct {v0, p0}, Lorg/b/a/d/h;-><init>(Lorg/b/a/d/g;)V

    return-object v0
.end method


# virtual methods
.method public estimatePrintedLength()I
    .locals 1

    iget-object v0, p0, Lorg/b/a/d/h;->a:Lorg/b/a/d/g;

    invoke-interface {v0}, Lorg/b/a/d/g;->estimatePrintedLength()I

    move-result v0

    return v0
.end method

.method public printTo(Ljava/lang/Appendable;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V
    .locals 13

    move-object v0, p0

    move-object v1, p1

    instance-of v2, v1, Ljava/lang/StringBuffer;

    if-eqz v2, :cond_0

    move-object v4, v1

    check-cast v4, Ljava/lang/StringBuffer;

    iget-object v3, v0, Lorg/b/a/d/h;->a:Lorg/b/a/d/g;

    move-wide v5, p2

    move-object/from16 v7, p4

    move/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-interface/range {v3 .. v10}, Lorg/b/a/d/g;->a(Ljava/lang/StringBuffer;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V

    :cond_0
    instance-of v2, v1, Ljava/io/Writer;

    if-eqz v2, :cond_1

    move-object v4, v1

    check-cast v4, Ljava/io/Writer;

    iget-object v3, v0, Lorg/b/a/d/h;->a:Lorg/b/a/d/g;

    move-wide v5, p2

    move-object/from16 v7, p4

    move/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-interface/range {v3 .. v10}, Lorg/b/a/d/g;->a(Ljava/io/Writer;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V

    :cond_1
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Lorg/b/a/d/h;->estimatePrintedLength()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuffer;-><init>(I)V

    iget-object v5, v0, Lorg/b/a/d/h;->a:Lorg/b/a/d/g;

    move-object v6, v2

    move-wide v7, p2

    move-object/from16 v9, p4

    move/from16 v10, p5

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    invoke-interface/range {v5 .. v12}, Lorg/b/a/d/g;->a(Ljava/lang/StringBuffer;JLorg/b/a/a;ILorg/b/a/f;Ljava/util/Locale;)V

    invoke-interface {v1, v2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public printTo(Ljava/lang/Appendable;Lorg/b/a/t;Ljava/util/Locale;)V
    .locals 2

    instance-of v0, p1, Ljava/lang/StringBuffer;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/lang/StringBuffer;

    iget-object v1, p0, Lorg/b/a/d/h;->a:Lorg/b/a/d/g;

    invoke-interface {v1, v0, p2, p3}, Lorg/b/a/d/g;->a(Ljava/lang/StringBuffer;Lorg/b/a/t;Ljava/util/Locale;)V

    :cond_0
    instance-of v0, p1, Ljava/io/Writer;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/io/Writer;

    iget-object v1, p0, Lorg/b/a/d/h;->a:Lorg/b/a/d/g;

    invoke-interface {v1, v0, p2, p3}, Lorg/b/a/d/g;->a(Ljava/io/Writer;Lorg/b/a/t;Ljava/util/Locale;)V

    :cond_1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lorg/b/a/d/h;->estimatePrintedLength()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    iget-object v1, p0, Lorg/b/a/d/h;->a:Lorg/b/a/d/g;

    invoke-interface {v1, v0, p2, p3}, Lorg/b/a/d/g;->a(Ljava/lang/StringBuffer;Lorg/b/a/t;Ljava/util/Locale;)V

    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method
