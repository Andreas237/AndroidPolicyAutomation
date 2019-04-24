.class final Lcom/google/c/a/a$q;
.super Lcom/google/c/a/a$m;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "q"
.end annotation


# static fields
.field static final o:I

.field static final p:Lcom/google/c/a/a$q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1f

    .line 1326
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    sput v0, Lcom/google/c/a/a$q;->o:I

    .line 1328
    new-instance v0, Lcom/google/c/a/a$q;

    invoke-direct {v0}, Lcom/google/c/a/a$q;-><init>()V

    sput-object v0, Lcom/google/c/a/a$q;->p:Lcom/google/c/a/a$q;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.whitespace()"

    .line 1331
    invoke-direct {p0, v0}, Lcom/google/c/a/a$m;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(C)Z
    .locals 3

    const-string v0, "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001\u202f\u00a0\u000c\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000"

    const v1, 0x6449bf0a

    mul-int v1, v1, p1

    .line 1336
    sget v2, Lcom/google/c/a/a$q;->o:I

    ushr-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
