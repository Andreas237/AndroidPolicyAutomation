.class public Lorg/apache/sanselan/util/DebugInputStream;
.super Ljava/io/InputStream;
.source "DebugInputStream.java"


# instance fields
.field private bytes_read:J

.field private final is:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const-wide/16 v0, 0x0

    .line 32
    iput-wide v0, p0, Lorg/apache/sanselan/util/DebugInputStream;->bytes_read:J

    .line 29
    iput-object p1, p0, Lorg/apache/sanselan/util/DebugInputStream;->is:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public available()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lorg/apache/sanselan/util/DebugInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lorg/apache/sanselan/util/DebugInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public getBytesRead()J
    .locals 2

    .line 60
    iget-wide v0, p0, Lorg/apache/sanselan/util/DebugInputStream;->bytes_read:J

    return-wide v0
.end method

.method public read()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lorg/apache/sanselan/util/DebugInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 37
    iget-wide v1, p0, Lorg/apache/sanselan/util/DebugInputStream;->bytes_read:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lorg/apache/sanselan/util/DebugInputStream;->bytes_read:J

    return v0
.end method

.method public skip(J)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lorg/apache/sanselan/util/DebugInputStream;->is:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v0

    .line 44
    iget-wide v2, p0, Lorg/apache/sanselan/util/DebugInputStream;->bytes_read:J

    add-long/2addr v2, p1

    iput-wide v2, p0, Lorg/apache/sanselan/util/DebugInputStream;->bytes_read:J

    return-wide v0
.end method
