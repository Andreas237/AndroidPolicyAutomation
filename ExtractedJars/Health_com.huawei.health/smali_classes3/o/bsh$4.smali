.class Lo/bsh$4;
.super Lokio/ForwardingSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsh;->e(Lokio/Source;)Lokio/Source;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsh;

.field e:J


# direct methods
.method constructor <init>(Lo/bsh;Lokio/Source;)V
    .locals 2

    .line 76
    iput-object p1, p0, Lo/bsh$4;->a:Lo/bsh;

    invoke-direct {p0, p2}, Lokio/ForwardingSource;-><init>(Lokio/Source;)V

    .line 78
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/bsh$4;->e:J

    return-void
.end method


# virtual methods
.method public read(Lokio/Buffer;J)J
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 81
    invoke-super {p0, p1, p2, p3}, Lokio/ForwardingSource;->read(Lokio/Buffer;J)J

    move-result-wide v7

    .line 83
    iget-wide v0, p0, Lo/bsh$4;->e:J

    const-wide/16 v2, -0x1

    cmp-long v2, v7, v2

    if-eqz v2, :cond_0

    move-wide v2, v7

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/bsh$4;->e:J

    .line 85
    iget-object v0, p0, Lo/bsh$4;->a:Lo/bsh;

    invoke-static {v0}, Lo/bsh;->c(Lo/bsh;)Lo/bsg;

    move-result-object v0

    iget-wide v1, p0, Lo/bsh$4;->e:J

    iget-object v3, p0, Lo/bsh$4;->a:Lo/bsh;

    invoke-static {v3}, Lo/bsh;->b(Lo/bsh;)Lokhttp3/ResponseBody;

    move-result-object v3

    invoke-virtual {v3}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v5, v7, v5

    if-nez v5, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    invoke-interface/range {v0 .. v5}, Lo/bsg;->b(JJZ)V

    .line 86
    return-wide v7
.end method
