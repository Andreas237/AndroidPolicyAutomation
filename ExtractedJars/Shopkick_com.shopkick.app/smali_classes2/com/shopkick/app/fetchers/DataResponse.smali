.class public Lcom/shopkick/app/fetchers/DataResponse;
.super Ljava/lang/Object;
.source "DataResponse.java"


# static fields
.field public static final AUTH_ERROR:Ljava/lang/String; = "X-Auth-Error"

.field public static final TOKEN_HEADER:Ljava/lang/String; = "X-Token"


# instance fields
.field public clientError:I

.field headers:[Lorg/apache/http/Header;

.field private headersMap:Ljava/util/Map;
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

.field public httpStatusCode:I

.field public responseData:Ljava/lang/Object;

.field public success:Z


# direct methods
.method public constructor <init>(ZIILjava/lang/Object;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-boolean p1, p0, Lcom/shopkick/app/fetchers/DataResponse;->success:Z

    .line 45
    iput p2, p0, Lcom/shopkick/app/fetchers/DataResponse;->httpStatusCode:I

    .line 46
    iput p3, p0, Lcom/shopkick/app/fetchers/DataResponse;->clientError:I

    .line 47
    iput-object p4, p0, Lcom/shopkick/app/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 48
    iput-object p1, p0, Lcom/shopkick/app/fetchers/DataResponse;->headers:[Lorg/apache/http/Header;

    return-void
.end method

.method public constructor <init>(ZIILjava/lang/Object;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-boolean p1, p0, Lcom/shopkick/app/fetchers/DataResponse;->success:Z

    .line 37
    iput p2, p0, Lcom/shopkick/app/fetchers/DataResponse;->httpStatusCode:I

    .line 38
    iput p3, p0, Lcom/shopkick/app/fetchers/DataResponse;->clientError:I

    .line 39
    iput-object p4, p0, Lcom/shopkick/app/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    .line 40
    iput-object p5, p0, Lcom/shopkick/app/fetchers/DataResponse;->headersMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(ZIILjava/lang/Object;[Lorg/apache/http/Header;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-boolean p1, p0, Lcom/shopkick/app/fetchers/DataResponse;->success:Z

    .line 25
    iput p2, p0, Lcom/shopkick/app/fetchers/DataResponse;->httpStatusCode:I

    .line 26
    iput p3, p0, Lcom/shopkick/app/fetchers/DataResponse;->clientError:I

    .line 27
    iput-object p4, p0, Lcom/shopkick/app/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    .line 28
    iput-object p5, p0, Lcom/shopkick/app/fetchers/DataResponse;->headers:[Lorg/apache/http/Header;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 91
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 95
    :cond_2
    check-cast p1, Lcom/shopkick/app/fetchers/DataResponse;

    .line 96
    iget-boolean v2, p0, Lcom/shopkick/app/fetchers/DataResponse;->success:Z

    iget-boolean v3, p1, Lcom/shopkick/app/fetchers/DataResponse;->success:Z

    if-eq v2, v3, :cond_3

    return v1

    .line 100
    :cond_3
    iget v2, p0, Lcom/shopkick/app/fetchers/DataResponse;->httpStatusCode:I

    iget v3, p1, Lcom/shopkick/app/fetchers/DataResponse;->httpStatusCode:I

    if-eq v2, v3, :cond_4

    return v1

    .line 104
    :cond_4
    iget v2, p0, Lcom/shopkick/app/fetchers/DataResponse;->clientError:I

    iget v3, p1, Lcom/shopkick/app/fetchers/DataResponse;->clientError:I

    if-eq v2, v3, :cond_5

    return v1

    .line 108
    :cond_5
    iget-object v2, p0, Lcom/shopkick/app/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-nez v2, :cond_6

    iget-object v2, p1, Lcom/shopkick/app/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v2, :cond_6

    return v1

    .line 112
    :cond_6
    iget-object v2, p0, Lcom/shopkick/app/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v2, :cond_7

    iget-object v3, p1, Lcom/shopkick/app/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    .line 116
    :cond_7
    iget-object v2, p0, Lcom/shopkick/app/fetchers/DataResponse;->headersMap:Ljava/util/Map;

    if-nez v2, :cond_8

    iget-object v2, p1, Lcom/shopkick/app/fetchers/DataResponse;->headersMap:Ljava/util/Map;

    if-eqz v2, :cond_8

    return v1

    .line 120
    :cond_8
    iget-object v2, p0, Lcom/shopkick/app/fetchers/DataResponse;->headersMap:Ljava/util/Map;

    if-eqz v2, :cond_9

    iget-object p1, p1, Lcom/shopkick/app/fetchers/DataResponse;->headersMap:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v1

    :cond_9
    return v0
.end method

.method public getCookies()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DataResponse;->headersMap:Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "Set-Cookie"

    .line 76
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHeader(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DataResponse;->headersMap:Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 53
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 54
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 55
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 60
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/DataResponse;->headers:[Lorg/apache/http/Header;

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    if-nez p1, :cond_1

    goto :goto_2

    .line 64
    :cond_1
    array-length v3, v0

    :goto_0
    if-ge v1, v3, :cond_3

    aget-object v4, v0, v1

    .line 65
    invoke-interface {v4}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 66
    invoke-interface {v4}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object v2

    :cond_4
    :goto_2
    return-object v2
.end method
