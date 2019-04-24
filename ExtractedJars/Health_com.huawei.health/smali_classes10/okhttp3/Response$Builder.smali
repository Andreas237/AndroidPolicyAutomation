.class public Lokhttp3/Response$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/Response;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private body:Lokhttp3/ResponseBody;

.field private cacheResponse:Lokhttp3/Response;

.field private code:I

.field private handshake:Lokhttp3/Handshake;

.field private headers:Lokhttp3/Headers$Builder;

.field private message:Ljava/lang/String;

.field private networkResponse:Lokhttp3/Response;

.field private priorResponse:Lokhttp3/Response;

.field private protocol:Lokhttp3/Protocol;

.field private request:Lokhttp3/Request;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 253
    const/4 v0, -0x1

    iput v0, p0, Lokhttp3/Response$Builder;->code:I

    .line 263
    new-instance v0, Lokhttp3/Headers$Builder;

    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    iput-object v0, p0, Lokhttp3/Response$Builder;->headers:Lokhttp3/Headers$Builder;

    .line 264
    return-void
.end method

.method private constructor <init>(Lokhttp3/Response;)V
    .locals 1

    .line 266
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 253
    const/4 v0, -0x1

    iput v0, p0, Lokhttp3/Response$Builder;->code:I

    .line 267
    invoke-static {p1}, Lokhttp3/Response;->access$1100(Lokhttp3/Response;)Lokhttp3/Request;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Response$Builder;->request:Lokhttp3/Request;

    .line 268
    invoke-static {p1}, Lokhttp3/Response;->access$1200(Lokhttp3/Response;)Lokhttp3/Protocol;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Response$Builder;->protocol:Lokhttp3/Protocol;

    .line 269
    invoke-static {p1}, Lokhttp3/Response;->access$1300(Lokhttp3/Response;)I

    move-result v0

    iput v0, p0, Lokhttp3/Response$Builder;->code:I

    .line 270
    invoke-static {p1}, Lokhttp3/Response;->access$1400(Lokhttp3/Response;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Response$Builder;->message:Ljava/lang/String;

    .line 271
    invoke-static {p1}, Lokhttp3/Response;->access$1500(Lokhttp3/Response;)Lokhttp3/Handshake;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Response$Builder;->handshake:Lokhttp3/Handshake;

    .line 272
    invoke-static {p1}, Lokhttp3/Response;->access$1600(Lokhttp3/Response;)Lokhttp3/Headers;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Headers;->newBuilder()Lokhttp3/Headers$Builder;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Response$Builder;->headers:Lokhttp3/Headers$Builder;

    .line 273
    invoke-static {p1}, Lokhttp3/Response;->access$1700(Lokhttp3/Response;)Lokhttp3/ResponseBody;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Response$Builder;->body:Lokhttp3/ResponseBody;

    .line 274
    invoke-static {p1}, Lokhttp3/Response;->access$1800(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Response$Builder;->networkResponse:Lokhttp3/Response;

    .line 275
    invoke-static {p1}, Lokhttp3/Response;->access$1900(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Response$Builder;->cacheResponse:Lokhttp3/Response;

    .line 276
    invoke-static {p1}, Lokhttp3/Response;->access$2000(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Response$Builder;->priorResponse:Lokhttp3/Response;

    .line 277
    return-void
.end method

.method synthetic constructor <init>(Lokhttp3/Response;Lokhttp3/Response$1;)V
    .locals 0

    .line 250
    invoke-direct {p0, p1}, Lokhttp3/Response$Builder;-><init>(Lokhttp3/Response;)V

    return-void
.end method

.method static synthetic access$000(Lokhttp3/Response$Builder;)Lokhttp3/Request;
    .locals 1

    .line 250
    iget-object v0, p0, Lokhttp3/Response$Builder;->request:Lokhttp3/Request;

    return-object v0
.end method

.method static synthetic access$100(Lokhttp3/Response$Builder;)Lokhttp3/Protocol;
    .locals 1

    .line 250
    iget-object v0, p0, Lokhttp3/Response$Builder;->protocol:Lokhttp3/Protocol;

    return-object v0
.end method

.method static synthetic access$200(Lokhttp3/Response$Builder;)I
    .locals 1

    .line 250
    iget v0, p0, Lokhttp3/Response$Builder;->code:I

    return v0
.end method

.method static synthetic access$300(Lokhttp3/Response$Builder;)Ljava/lang/String;
    .locals 1

    .line 250
    iget-object v0, p0, Lokhttp3/Response$Builder;->message:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lokhttp3/Response$Builder;)Lokhttp3/Handshake;
    .locals 1

    .line 250
    iget-object v0, p0, Lokhttp3/Response$Builder;->handshake:Lokhttp3/Handshake;

    return-object v0
.end method

.method static synthetic access$500(Lokhttp3/Response$Builder;)Lokhttp3/Headers$Builder;
    .locals 1

    .line 250
    iget-object v0, p0, Lokhttp3/Response$Builder;->headers:Lokhttp3/Headers$Builder;

    return-object v0
.end method

.method static synthetic access$600(Lokhttp3/Response$Builder;)Lokhttp3/ResponseBody;
    .locals 1

    .line 250
    iget-object v0, p0, Lokhttp3/Response$Builder;->body:Lokhttp3/ResponseBody;

    return-object v0
.end method

.method static synthetic access$700(Lokhttp3/Response$Builder;)Lokhttp3/Response;
    .locals 1

    .line 250
    iget-object v0, p0, Lokhttp3/Response$Builder;->networkResponse:Lokhttp3/Response;

    return-object v0
.end method

.method static synthetic access$800(Lokhttp3/Response$Builder;)Lokhttp3/Response;
    .locals 1

    .line 250
    iget-object v0, p0, Lokhttp3/Response$Builder;->cacheResponse:Lokhttp3/Response;

    return-object v0
.end method

.method static synthetic access$900(Lokhttp3/Response$Builder;)Lokhttp3/Response;
    .locals 1

    .line 250
    iget-object v0, p0, Lokhttp3/Response$Builder;->priorResponse:Lokhttp3/Response;

    return-object v0
.end method

.method private checkPriorResponse(Lokhttp3/Response;)V
    .locals 2

    .line 369
    invoke-static {p1}, Lokhttp3/Response;->access$1700(Lokhttp3/Response;)Lokhttp3/ResponseBody;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 370
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "priorResponse.body != null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 372
    :cond_0
    return-void
.end method

.method private checkSupportResponse(Ljava/lang/String;Lokhttp3/Response;)V
    .locals 3

    .line 351
    invoke-static {p2}, Lokhttp3/Response;->access$1700(Lokhttp3/Response;)Lokhttp3/ResponseBody;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 352
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".body != null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 353
    :cond_0
    invoke-static {p2}, Lokhttp3/Response;->access$1800(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 354
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".networkResponse != null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 355
    :cond_1
    invoke-static {p2}, Lokhttp3/Response;->access$1900(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 356
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".cacheResponse != null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 357
    :cond_2
    invoke-static {p2}, Lokhttp3/Response;->access$2000(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 358
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".priorResponse != null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 360
    :cond_3
    return-void
.end method


# virtual methods
.method public addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;
    .locals 1

    .line 318
    iget-object v0, p0, Lokhttp3/Response$Builder;->headers:Lokhttp3/Headers$Builder;

    invoke-virtual {v0, p1, p2}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 319
    return-object p0
.end method

.method public body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;
    .locals 0

    .line 334
    iput-object p1, p0, Lokhttp3/Response$Builder;->body:Lokhttp3/ResponseBody;

    .line 335
    return-object p0
.end method

.method public build()Lokhttp3/Response;
    .locals 3

    .line 375
    iget-object v0, p0, Lokhttp3/Response$Builder;->request:Lokhttp3/Request;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "request == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 376
    :cond_0
    iget-object v0, p0, Lokhttp3/Response$Builder;->protocol:Lokhttp3/Protocol;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "protocol == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 377
    :cond_1
    iget v0, p0, Lokhttp3/Response$Builder;->code:I

    if-gez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lokhttp3/Response$Builder;->code:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 378
    :cond_2
    new-instance v0, Lokhttp3/Response;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lokhttp3/Response;-><init>(Lokhttp3/Response$Builder;Lokhttp3/Response$1;)V

    return-object v0
.end method

.method public cacheResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;
    .locals 1

    .line 345
    if-eqz p1, :cond_0

    const-string v0, "cacheResponse"

    invoke-direct {p0, v0, p1}, Lokhttp3/Response$Builder;->checkSupportResponse(Ljava/lang/String;Lokhttp3/Response;)V

    .line 346
    :cond_0
    iput-object p1, p0, Lokhttp3/Response$Builder;->cacheResponse:Lokhttp3/Response;

    .line 347
    return-object p0
.end method

.method public code(I)Lokhttp3/Response$Builder;
    .locals 0

    .line 290
    iput p1, p0, Lokhttp3/Response$Builder;->code:I

    .line 291
    return-object p0
.end method

.method public handshake(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;
    .locals 0

    .line 300
    iput-object p1, p0, Lokhttp3/Response$Builder;->handshake:Lokhttp3/Handshake;

    .line 301
    return-object p0
.end method

.method public header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;
    .locals 1

    .line 309
    iget-object v0, p0, Lokhttp3/Response$Builder;->headers:Lokhttp3/Headers$Builder;

    invoke-virtual {v0, p1, p2}, Lokhttp3/Headers$Builder;->set(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 310
    return-object p0
.end method

.method public headers(Lokhttp3/Headers;)Lokhttp3/Response$Builder;
    .locals 1

    .line 329
    invoke-virtual {p1}, Lokhttp3/Headers;->newBuilder()Lokhttp3/Headers$Builder;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Response$Builder;->headers:Lokhttp3/Headers$Builder;

    .line 330
    return-object p0
.end method

.method public message(Ljava/lang/String;)Lokhttp3/Response$Builder;
    .locals 0

    .line 295
    iput-object p1, p0, Lokhttp3/Response$Builder;->message:Ljava/lang/String;

    .line 296
    return-object p0
.end method

.method public networkResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;
    .locals 1

    .line 339
    if-eqz p1, :cond_0

    const-string v0, "networkResponse"

    invoke-direct {p0, v0, p1}, Lokhttp3/Response$Builder;->checkSupportResponse(Ljava/lang/String;Lokhttp3/Response;)V

    .line 340
    :cond_0
    iput-object p1, p0, Lokhttp3/Response$Builder;->networkResponse:Lokhttp3/Response;

    .line 341
    return-object p0
.end method

.method public priorResponse(Lokhttp3/Response;)Lokhttp3/Response$Builder;
    .locals 0

    .line 363
    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lokhttp3/Response$Builder;->checkPriorResponse(Lokhttp3/Response;)V

    .line 364
    :cond_0
    iput-object p1, p0, Lokhttp3/Response$Builder;->priorResponse:Lokhttp3/Response;

    .line 365
    return-object p0
.end method

.method public protocol(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;
    .locals 0

    .line 285
    iput-object p1, p0, Lokhttp3/Response$Builder;->protocol:Lokhttp3/Protocol;

    .line 286
    return-object p0
.end method

.method public removeHeader(Ljava/lang/String;)Lokhttp3/Response$Builder;
    .locals 1

    .line 323
    iget-object v0, p0, Lokhttp3/Response$Builder;->headers:Lokhttp3/Headers$Builder;

    invoke-virtual {v0, p1}, Lokhttp3/Headers$Builder;->removeAll(Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 324
    return-object p0
.end method

.method public request(Lokhttp3/Request;)Lokhttp3/Response$Builder;
    .locals 0

    .line 280
    iput-object p1, p0, Lokhttp3/Response$Builder;->request:Lokhttp3/Request;

    .line 281
    return-object p0
.end method
