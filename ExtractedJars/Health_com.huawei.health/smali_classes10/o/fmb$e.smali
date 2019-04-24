.class public final Lo/fmb$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fmb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final a:I

.field private final c:I

.field private final d:I

.field private final e:[B


# direct methods
.method private constructor <init>(I[BI)V
    .locals 3

    .line 667
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 668
    if-ltz p1, :cond_0

    const v0, 0xffff

    if-le p1, v0, :cond_1

    .line 669
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MID must be a 16 bit unsigned int: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 670
    :cond_1
    if-nez p2, :cond_2

    .line 671
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "address must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 672
    :cond_2
    if-ltz p3, :cond_3

    const v0, 0xffff

    if-le p3, v0, :cond_4

    .line 673
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Port must be a 16 bit unsigned int"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 675
    :cond_4
    iput p1, p0, Lo/fmb$e;->d:I

    .line 676
    iput-object p2, p0, Lo/fmb$e;->e:[B

    .line 677
    iput p3, p0, Lo/fmb$e;->a:I

    .line 678
    invoke-direct {p0}, Lo/fmb$e;->c()I

    move-result v0

    iput v0, p0, Lo/fmb$e;->c:I

    .line 680
    return-void
.end method

.method public static b(Lo/flq;)Lo/fmb$e;
    .locals 5

    .line 740
    invoke-virtual {p0}, Lo/flq;->u()Lo/fow;

    move-result-object v0

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v4

    .line 741
    new-instance v0, Lo/fmb$e;

    invoke-virtual {p0}, Lo/flq;->a()I

    move-result v1

    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v2

    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/fmb$e;-><init>(I[BI)V

    return-object v0
.end method

.method private c()I
    .locals 4

    .line 688
    const/16 v2, 0x1f

    .line 689
    const/4 v3, 0x1

    .line 690
    iget v0, p0, Lo/fmb$e;->d:I

    add-int/lit8 v3, v0, 0x1f

    .line 691
    mul-int/lit8 v0, v3, 0x1f

    iget-object v1, p0, Lo/fmb$e;->e:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int v3, v0, v1

    .line 692
    mul-int/lit8 v0, v3, 0x1f

    iget v1, p0, Lo/fmb$e;->a:I

    add-int v3, v0, v1

    .line 693
    return v3
.end method

.method public static c(Lo/flq;)Lo/fmb$e;
    .locals 5

    .line 728
    invoke-virtual {p0}, Lo/flq;->r()Lo/fow;

    move-result-object v0

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v4

    .line 729
    new-instance v0, Lo/fmb$e;

    invoke-virtual {p0}, Lo/flq;->a()I

    move-result v1

    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object v2

    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lo/fmb$e;-><init>(I[BI)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 698
    if-ne p0, p1, :cond_0

    .line 699
    const/4 v0, 0x1

    return v0

    .line 700
    :cond_0
    if-nez p1, :cond_1

    .line 701
    const/4 v0, 0x0

    return v0

    .line 702
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 703
    const/4 v0, 0x0

    return v0

    .line 704
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/fmb$e;

    .line 705
    iget v0, p0, Lo/fmb$e;->d:I

    iget v1, v2, Lo/fmb$e;->d:I

    if-eq v0, v1, :cond_3

    .line 706
    const/4 v0, 0x0

    return v0

    .line 707
    :cond_3
    iget-object v0, p0, Lo/fmb$e;->e:[B

    iget-object v1, v2, Lo/fmb$e;->e:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_4

    .line 708
    const/4 v0, 0x0

    return v0

    .line 709
    :cond_4
    iget v0, p0, Lo/fmb$e;->a:I

    iget v1, v2, Lo/fmb$e;->a:I

    if-eq v0, v1, :cond_5

    .line 710
    const/4 v0, 0x0

    return v0

    .line 711
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 684
    iget v0, p0, Lo/fmb$e;->c:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 716
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KeyMID["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lo/fmb$e;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fmb$e;->e:[B

    invoke-static {v1}, Lo/fli;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/fmb$e;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
