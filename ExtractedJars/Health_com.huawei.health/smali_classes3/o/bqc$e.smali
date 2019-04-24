.class Lo/bqc$e;
.super Ljava/io/OutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bqc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private d:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 250
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/bqc$5;)V
    .locals 0

    .line 250
    invoke-direct {p0}, Lo/bqc$e;-><init>()V

    return-void
.end method


# virtual methods
.method public e()J
    .locals 2

    .line 275
    iget-wide v0, p0, Lo/bqc$e;->d:J

    return-wide v0
.end method

.method public write(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 257
    iget-wide v0, p0, Lo/bqc$e;->d:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/bqc$e;->d:J

    .line 258
    return-void
.end method

.method public write([B)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 263
    iget-wide v0, p0, Lo/bqc$e;->d:J

    array-length v2, p1

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/bqc$e;->d:J

    .line 264
    return-void
.end method

.method public write([BII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 269
    iget-wide v0, p0, Lo/bqc$e;->d:J

    int-to-long v2, p3

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/bqc$e;->d:J

    .line 270
    return-void
.end method
