.class public abstract Lorg/c/f/a/e;
.super Lorg/c/f/a/j;


# static fields
.field private static final a:Ljava/nio/charset/Charset;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final b:Lorg/c/c/i;

.field private final c:Ljava/lang/String;

.field private final d:[B

.field private final e:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "ISO-8859-1"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lorg/c/f/a/e;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method protected constructor <init>(Lorg/c/c/i;Ljava/lang/String;[BLjava/nio/charset/Charset;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lorg/c/c/i;->value()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/c/f/a/j;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lorg/c/f/a/e;->b:Lorg/c/c/i;

    iput-object p2, p0, Lorg/c/f/a/e;->c:Ljava/lang/String;

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    new-array p3, p1, [B

    :goto_0
    iput-object p3, p0, Lorg/c/f/a/e;->d:[B

    if-eqz p4, :cond_1

    goto :goto_1

    :cond_1
    sget-object p4, Lorg/c/f/a/e;->a:Ljava/nio/charset/Charset;

    :goto_1
    iput-object p4, p0, Lorg/c/f/a/e;->e:Ljava/nio/charset/Charset;

    return-void
.end method
