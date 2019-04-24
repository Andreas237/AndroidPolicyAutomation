.class public Lo/fss$c;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fss;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Z

.field private d:I

.field private e:[B

.field private f:[B

.field private g:I

.field private h:[B

.field private i:Z

.field private k:Z


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 1

    .line 1936
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 1937
    and-int/lit8 v0, p2, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/fss$c;->k:Z

    .line 1938
    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lo/fss$c;->c:Z

    .line 1939
    iget-boolean v0, p0, Lo/fss$c;->c:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    goto :goto_2

    :cond_2
    const/4 v0, 0x4

    :goto_2
    iput v0, p0, Lo/fss$c;->d:I

    .line 1940
    iget v0, p0, Lo/fss$c;->d:I

    new-array v0, v0, [B

    iput-object v0, p0, Lo/fss$c;->e:[B

    .line 1941
    const/4 v0, 0x0

    iput v0, p0, Lo/fss$c;->b:I

    .line 1942
    const/4 v0, 0x0

    iput v0, p0, Lo/fss$c;->a:I

    .line 1943
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fss$c;->i:Z

    .line 1944
    const/4 v0, 0x4

    new-array v0, v0, [B

    iput-object v0, p0, Lo/fss$c;->h:[B

    .line 1945
    iput p2, p0, Lo/fss$c;->g:I

    .line 1946
    invoke-static {p2}, Lo/fss;->b(I)[B

    move-result-object v0

    iput-object v0, p0, Lo/fss$c;->f:[B

    .line 1947
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2061
    invoke-virtual {p0}, Lo/fss$c;->e()V

    .line 2065
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    .line 2067
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fss$c;->e:[B

    .line 2068
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fss$c;->out:Ljava/io/OutputStream;

    .line 2069
    return-void
.end method

.method public e()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2040
    iget v0, p0, Lo/fss$c;->b:I

    if-lez v0, :cond_1

    .line 2041
    iget-boolean v0, p0, Lo/fss$c;->c:Z

    if-eqz v0, :cond_0

    .line 2042
    iget-object v0, p0, Lo/fss$c;->out:Ljava/io/OutputStream;

    iget-object v1, p0, Lo/fss$c;->h:[B

    iget-object v2, p0, Lo/fss$c;->e:[B

    iget v3, p0, Lo/fss$c;->b:I

    iget v4, p0, Lo/fss$c;->g:I

    invoke-static {v1, v2, v3, v4}, Lo/fss;->c([B[BII)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 2043
    const/4 v0, 0x0

    iput v0, p0, Lo/fss$c;->b:I

    goto :goto_0

    .line 2046
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Base64 input not properly padded."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2050
    :cond_1
    :goto_0
    return-void
.end method

.method public write(I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1966
    iget-boolean v0, p0, Lo/fss$c;->i:Z

    if-eqz v0, :cond_0

    .line 1967
    iget-object v0, p0, Lo/fss$c;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 1968
    return-void

    .line 1972
    :cond_0
    iget-boolean v0, p0, Lo/fss$c;->c:Z

    if-eqz v0, :cond_2

    .line 1973
    iget-object v0, p0, Lo/fss$c;->e:[B

    iget v1, p0, Lo/fss$c;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lo/fss$c;->b:I

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    .line 1974
    iget v0, p0, Lo/fss$c;->b:I

    iget v1, p0, Lo/fss$c;->d:I

    if-lt v0, v1, :cond_4

    .line 1976
    iget-object v0, p0, Lo/fss$c;->out:Ljava/io/OutputStream;

    iget-object v1, p0, Lo/fss$c;->h:[B

    iget-object v2, p0, Lo/fss$c;->e:[B

    iget v3, p0, Lo/fss$c;->d:I

    iget v4, p0, Lo/fss$c;->g:I

    invoke-static {v1, v2, v3, v4}, Lo/fss;->c([B[BII)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 1978
    iget v0, p0, Lo/fss$c;->a:I

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Lo/fss$c;->a:I

    .line 1979
    iget-boolean v0, p0, Lo/fss$c;->k:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lo/fss$c;->a:I

    const/16 v1, 0x4c

    if-lt v0, v1, :cond_1

    .line 1980
    iget-object v0, p0, Lo/fss$c;->out:Ljava/io/OutputStream;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 1981
    const/4 v0, 0x0

    iput v0, p0, Lo/fss$c;->a:I

    .line 1984
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lo/fss$c;->b:I

    goto :goto_0

    .line 1991
    :cond_2
    iget-object v0, p0, Lo/fss$c;->f:[B

    and-int/lit8 v1, p1, 0x7f

    aget-byte v0, v0, v1

    const/4 v1, -0x5

    if-le v0, v1, :cond_3

    .line 1992
    iget-object v0, p0, Lo/fss$c;->e:[B

    iget v1, p0, Lo/fss$c;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lo/fss$c;->b:I

    int-to-byte v2, p1

    aput-byte v2, v0, v1

    .line 1993
    iget v0, p0, Lo/fss$c;->b:I

    iget v1, p0, Lo/fss$c;->d:I

    if-lt v0, v1, :cond_4

    .line 1995
    iget-object v0, p0, Lo/fss$c;->e:[B

    iget-object v1, p0, Lo/fss$c;->h:[B

    iget v2, p0, Lo/fss$c;->g:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v3, v1, v4, v2}, Lo/fss;->a([BI[BII)I

    move-result v5

    .line 1996
    iget-object v0, p0, Lo/fss$c;->out:Ljava/io/OutputStream;

    iget-object v1, p0, Lo/fss$c;->h:[B

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v5}, Ljava/io/OutputStream;->write([BII)V

    .line 1997
    const/4 v0, 0x0

    iput v0, p0, Lo/fss$c;->b:I

    .line 1998
    goto :goto_0

    .line 2000
    :cond_3
    iget-object v0, p0, Lo/fss$c;->f:[B

    and-int/lit8 v1, p1, 0x7f

    aget-byte v0, v0, v1

    const/4 v1, -0x5

    if-eq v0, v1, :cond_4

    .line 2001
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid character in Base64 data."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2004
    :cond_4
    :goto_0
    return-void
.end method

.method public write([BII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2021
    iget-boolean v0, p0, Lo/fss$c;->i:Z

    if-eqz v0, :cond_0

    .line 2022
    iget-object v0, p0, Lo/fss$c;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 2023
    return-void

    .line 2026
    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_1

    .line 2027
    add-int v0, p2, v1

    aget-byte v0, p1, v0

    invoke-virtual {p0, v0}, Lo/fss$c;->write(I)V

    .line 2026
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2030
    :cond_1
    return-void
.end method
