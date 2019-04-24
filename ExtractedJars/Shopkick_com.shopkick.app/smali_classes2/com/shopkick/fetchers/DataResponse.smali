.class public Lcom/shopkick/fetchers/DataResponse;
.super Ljava/lang/Object;
.source "DataResponse.java"

# interfaces
.implements Lcom/shopkick/fetchers/RequestDetails;


# static fields
.field public static final AUTH_ERROR:Ljava/lang/String; = "X-Auth-Error"

.field public static final TOKEN_HEADER:Ljava/lang/String; = "X-Token"


# instance fields
.field public clientError:I

.field private final headersMap:Ljava/util/Map;
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

.field private final httpStatusCode:I

.field public responseData:Ljava/lang/Object;

.field public success:Z

.field private final work:Lnet/toddm/comm/SubmittableWork;


# direct methods
.method public constructor <init>(ZIILjava/lang/Object;)V
    .locals 7

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    .line 43
    invoke-direct/range {v0 .. v6}, Lcom/shopkick/fetchers/DataResponse;-><init>(ZIILjava/lang/Object;Ljava/util/Map;Lnet/toddm/comm/SubmittableWork;)V

    return-void
.end method

.method public constructor <init>(ZIILjava/lang/Object;Ljava/util/Map;Lnet/toddm/comm/SubmittableWork;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lnet/toddm/comm/SubmittableWork;",
            ")V"
        }
    .end annotation

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-boolean p1, p0, Lcom/shopkick/fetchers/DataResponse;->success:Z

    .line 35
    iput p2, p0, Lcom/shopkick/fetchers/DataResponse;->httpStatusCode:I

    .line 36
    iput p3, p0, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    .line 37
    iput-object p4, p0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    .line 38
    iput-object p5, p0, Lcom/shopkick/fetchers/DataResponse;->headersMap:Ljava/util/Map;

    .line 39
    iput-object p6, p0, Lcom/shopkick/fetchers/DataResponse;->work:Lnet/toddm/comm/SubmittableWork;

    return-void
.end method


# virtual methods
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

    .line 57
    iget-object v0, p0, Lcom/shopkick/fetchers/DataResponse;->headersMap:Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "Set-Cookie"

    .line 58
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDataResponse()Lcom/shopkick/fetchers/DataResponse;
    .locals 0

    return-object p0
.end method

.method public getHeader(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/shopkick/fetchers/DataResponse;->headersMap:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 48
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 49
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 50
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getRequestWork()Lnet/toddm/comm/SubmittableWork;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/shopkick/fetchers/DataResponse;->work:Lnet/toddm/comm/SubmittableWork;

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

    .line 67
    iget-object v0, p0, Lcom/shopkick/fetchers/DataResponse;->headersMap:Ljava/util/Map;

    return-object v0
.end method

.method public getStatusCode()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/shopkick/fetchers/DataResponse;->httpStatusCode:I

    return v0
.end method
