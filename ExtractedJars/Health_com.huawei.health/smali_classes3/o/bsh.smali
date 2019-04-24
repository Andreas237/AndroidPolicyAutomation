.class public Lo/bsh;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# instance fields
.field private a:Lokio/BufferedSource;

.field private final d:Lokhttp3/ResponseBody;

.field private final e:Lo/bsg;


# direct methods
.method public constructor <init>(Lokhttp3/ResponseBody;Lo/bsg;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    .line 31
    iput-object p1, p0, Lo/bsh;->d:Lokhttp3/ResponseBody;

    .line 32
    iput-object p2, p0, Lo/bsh;->e:Lo/bsg;

    .line 33
    return-void
.end method

.method static synthetic b(Lo/bsh;)Lokhttp3/ResponseBody;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/bsh;->d:Lokhttp3/ResponseBody;

    return-object v0
.end method

.method static synthetic c(Lo/bsh;)Lo/bsg;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/bsh;->e:Lo/bsg;

    return-object v0
.end method

.method private e(Lokio/Source;)Lokio/Source;
    .locals 1

    .line 76
    new-instance v0, Lo/bsh$4;

    invoke-direct {v0, p0, p1}, Lo/bsh$4;-><init>(Lo/bsh;Lokio/Source;)V

    return-object v0
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 52
    iget-object v0, p0, Lo/bsh;->d:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/bsh;->d:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/bsh;->a:Lokio/BufferedSource;

    if-nez v0, :cond_0

    .line 64
    iget-object v0, p0, Lo/bsh;->d:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bsh;->e(Lokio/Source;)Lokio/Source;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    iput-object v0, p0, Lo/bsh;->a:Lokio/BufferedSource;

    .line 66
    :cond_0
    iget-object v0, p0, Lo/bsh;->a:Lokio/BufferedSource;

    return-object v0
.end method
