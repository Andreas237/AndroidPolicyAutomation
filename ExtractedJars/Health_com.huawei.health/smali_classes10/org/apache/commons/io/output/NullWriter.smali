.class public Lorg/apache/commons/io/output/NullWriter;
.super Ljava/io/Writer;
.source "SourceFile"


# static fields
.field public static final NULL_WRITER:Lorg/apache/commons/io/output/NullWriter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Lorg/apache/commons/io/output/NullWriter;

    invoke-direct {v0}, Lorg/apache/commons/io/output/NullWriter;-><init>()V

    sput-object v0, Lorg/apache/commons/io/output/NullWriter;->NULL_WRITER:Lorg/apache/commons/io/output/NullWriter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 39
    return-void
.end method


# virtual methods
.method public append(C)Ljava/io/Writer;
    .locals 0

    .line 50
    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 0

    .line 76
    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 0

    .line 64
    return-object p0
.end method

.method public bridge synthetic append(C)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/output/NullWriter;->append(C)Ljava/io/Writer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/output/NullWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/io/output/NullWriter;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 0

    .line 138
    return-void
.end method

.method public flush()V
    .locals 0

    .line 132
    return-void
.end method

.method public write(I)V
    .locals 0

    .line 86
    return-void
.end method

.method public write(Ljava/lang/String;)V
    .locals 0

    .line 115
    return-void
.end method

.method public write(Ljava/lang/String;II)V
    .locals 0

    .line 126
    return-void
.end method

.method public write([C)V
    .locals 0

    .line 95
    return-void
.end method

.method public write([CII)V
    .locals 0

    .line 106
    return-void
.end method
