.class public Lcom/ibotta/tracking/generated/invoker/ApiException;
.super Ljava/lang/Exception;
.source "ApiException.java"


# instance fields
.field private code:I

.field private responseBody:Ljava/lang/String;

.field private responseHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->code:I

    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseHeaders:Ljava/util/Map;

    .line 23
    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseBody:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 21
    iput p2, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->code:I

    const/4 p2, 0x0

    .line 22
    iput-object p2, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseHeaders:Ljava/util/Map;

    .line 23
    iput-object p2, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseBody:Ljava/lang/String;

    .line 56
    iput p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->code:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 60
    invoke-direct {p0, p1, p2}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(ILjava/lang/String;)V

    .line 61
    iput-object p3, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseHeaders:Ljava/util/Map;

    .line 62
    iput-object p4, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseBody:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/util/Map;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 51
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    move-object v3, v0

    check-cast v3, Ljava/lang/Throwable;

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->code:I

    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseHeaders:Ljava/util/Map;

    .line 23
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseBody:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 43
    move-object v3, v0

    check-cast v3, Ljava/lang/Throwable;

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    .line 47
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/tracking/generated/invoker/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;ILjava/util/Map;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->code:I

    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseHeaders:Ljava/util/Map;

    .line 23
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseBody:Ljava/lang/String;

    .line 37
    iput p3, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->code:I

    .line 38
    iput-object p4, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseHeaders:Ljava/util/Map;

    .line 39
    iput-object p5, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseBody:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->code:I

    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseHeaders:Ljava/util/Map;

    .line 23
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseBody:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCode()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->code:I

    return v0
.end method

.method public getResponseBody()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseBody:Ljava/lang/String;

    return-object v0
.end method

.method public getResponseHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ApiException;->responseHeaders:Ljava/util/Map;

    return-object v0
.end method
