.class public final Lretrofit/client/Response;
.super Ljava/lang/Object;
.source "Response.java"


# instance fields
.field private final body:Lretrofit/mime/TypedInput;

.field private final headers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lretrofit/client/Header;",
            ">;"
        }
    .end annotation
.end field

.field private final reason:Ljava/lang/String;

.field private final status:I

.field private final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lretrofit/mime/TypedInput;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lretrofit/client/Header;",
            ">;",
            "Lretrofit/mime/TypedInput;",
            ")V"
        }
    .end annotation

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 39
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "url == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const/16 v0, 0xc8

    if-ge p2, v0, :cond_1

    .line 42
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Invalid status code: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-nez p3, :cond_2

    .line 45
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "reason == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    if-nez p4, :cond_3

    .line 48
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "headers == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 51
    :cond_3
    iput-object p1, p0, Lretrofit/client/Response;->url:Ljava/lang/String;

    .line 52
    iput p2, p0, Lretrofit/client/Response;->status:I

    .line 53
    iput-object p3, p0, Lretrofit/client/Response;->reason:Ljava/lang/String;

    .line 54
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lretrofit/client/Response;->headers:Ljava/util/List;

    .line 55
    iput-object p5, p0, Lretrofit/client/Response;->body:Lretrofit/mime/TypedInput;

    return-void
.end method


# virtual methods
.method public getBody()Lretrofit/mime/TypedInput;
    .locals 1

    .line 80
    iget-object v0, p0, Lretrofit/client/Response;->body:Lretrofit/mime/TypedInput;

    return-object v0
.end method

.method public getHeaders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lretrofit/client/Header;",
            ">;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lretrofit/client/Response;->headers:Ljava/util/List;

    return-object v0
.end method

.method public getReason()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lretrofit/client/Response;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()I
    .locals 1

    .line 65
    iget v0, p0, Lretrofit/client/Response;->status:I

    return v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lretrofit/client/Response;->url:Ljava/lang/String;

    return-object v0
.end method
