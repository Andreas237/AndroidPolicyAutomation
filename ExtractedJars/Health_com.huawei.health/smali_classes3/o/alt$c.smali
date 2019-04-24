.class Lo/alt$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/alt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private a:I

.field private c:I

.field private d:I

.field private e:J


# direct methods
.method private constructor <init>(JIII)V
    .locals 0

    .line 1713
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1714
    iput-wide p1, p0, Lo/alt$c;->e:J

    .line 1715
    iput p3, p0, Lo/alt$c;->d:I

    .line 1716
    iput p4, p0, Lo/alt$c;->a:I

    .line 1717
    iput p5, p0, Lo/alt$c;->c:I

    .line 1718
    return-void
.end method

.method synthetic constructor <init>(JIIILo/alt$4;)V
    .locals 0

    .line 1707
    invoke-direct/range {p0 .. p5}, Lo/alt$c;-><init>(JIII)V

    return-void
.end method

.method static synthetic a(Lo/alt$c;)I
    .locals 1

    .line 1707
    iget v0, p0, Lo/alt$c;->a:I

    return v0
.end method

.method static synthetic b(Lo/alt$c;)J
    .locals 2

    .line 1707
    iget-wide v0, p0, Lo/alt$c;->e:J

    return-wide v0
.end method

.method static synthetic c(Lo/alt$c;)I
    .locals 1

    .line 1707
    iget v0, p0, Lo/alt$c;->c:I

    return v0
.end method

.method static synthetic d(Lo/alt$c;)I
    .locals 1

    .line 1707
    iget v0, p0, Lo/alt$c;->d:I

    return v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1722
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
