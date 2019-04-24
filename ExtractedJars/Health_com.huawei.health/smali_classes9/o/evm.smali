.class public Lo/evm;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# instance fields
.field private final b:Lo/evk;

.field private d:Lokio/BufferedSource;

.field private final e:Lokhttp3/ResponseBody;


# direct methods
.method public constructor <init>(Lokhttp3/ResponseBody;Lo/evk;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    .line 32
    iput-object p1, p0, Lo/evm;->e:Lokhttp3/ResponseBody;

    .line 33
    iput-object p2, p0, Lo/evm;->b:Lo/evk;

    .line 34
    return-void
.end method

.method static synthetic a(Lo/evm;)Lo/evk;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/evm;->b:Lo/evk;

    return-object v0
.end method

.method private a(Lokio/Source;)Lokio/Source;
    .locals 1

    .line 77
    new-instance v0, Lo/evm$5;

    invoke-direct {v0, p0, p1}, Lo/evm$5;-><init>(Lo/evm;Lokio/Source;)V

    return-object v0
.end method

.method static synthetic e(Lo/evm;)Lokhttp3/ResponseBody;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/evm;->e:Lokhttp3/ResponseBody;

    return-object v0
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 53
    iget-object v0, p0, Lo/evm;->e:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/evm;->e:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    .line 63
    iget-object v0, p0, Lo/evm;->d:Lokio/BufferedSource;

    if-nez v0, :cond_0

    .line 65
    iget-object v0, p0, Lo/evm;->e:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/evm;->a(Lokio/Source;)Lokio/Source;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    iput-object v0, p0, Lo/evm;->d:Lokio/BufferedSource;

    .line 67
    :cond_0
    iget-object v0, p0, Lo/evm;->d:Lokio/BufferedSource;

    return-object v0
.end method
