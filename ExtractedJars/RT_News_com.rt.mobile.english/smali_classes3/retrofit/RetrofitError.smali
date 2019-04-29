.class public Lretrofit/RetrofitError;
.super Ljava/lang/RuntimeException;
.source "RetrofitError.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/RetrofitError$Kind;
    }
.end annotation


# instance fields
.field private final converter:Lretrofit/converter/Converter;

.field private final kind:Lretrofit/RetrofitError$Kind;

.field private final response:Lretrofit/client/Response;

.field private final successType:Ljava/lang/reflect/Type;

.field private final url:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lretrofit/client/Response;Lretrofit/converter/Converter;Ljava/lang/reflect/Type;Lretrofit/RetrofitError$Kind;Ljava/lang/Throwable;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1, p7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    iput-object p2, p0, Lretrofit/RetrofitError;->url:Ljava/lang/String;

    .line 73
    iput-object p3, p0, Lretrofit/RetrofitError;->response:Lretrofit/client/Response;

    .line 74
    iput-object p4, p0, Lretrofit/RetrofitError;->converter:Lretrofit/converter/Converter;

    .line 75
    iput-object p5, p0, Lretrofit/RetrofitError;->successType:Ljava/lang/reflect/Type;

    .line 76
    iput-object p6, p0, Lretrofit/RetrofitError;->kind:Lretrofit/RetrofitError$Kind;

    return-void
.end method

.method public static conversionError(Ljava/lang/String;Lretrofit/client/Response;Lretrofit/converter/Converter;Ljava/lang/reflect/Type;Lretrofit/converter/ConversionException;)Lretrofit/RetrofitError;
    .locals 9

    .line 33
    new-instance v8, Lretrofit/RetrofitError;

    invoke-virtual {p4}, Lretrofit/converter/ConversionException;->getMessage()Ljava/lang/String;

    move-result-object v1

    sget-object v6, Lretrofit/RetrofitError$Kind;->CONVERSION:Lretrofit/RetrofitError$Kind;

    move-object v0, v8

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lretrofit/RetrofitError;-><init>(Ljava/lang/String;Ljava/lang/String;Lretrofit/client/Response;Lretrofit/converter/Converter;Ljava/lang/reflect/Type;Lretrofit/RetrofitError$Kind;Ljava/lang/Throwable;)V

    return-object v8
.end method

.method public static httpError(Ljava/lang/String;Lretrofit/client/Response;Lretrofit/converter/Converter;Ljava/lang/reflect/Type;)Lretrofit/RetrofitError;
    .locals 10

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lretrofit/client/Response;->getStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lretrofit/client/Response;->getReason()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 40
    new-instance v0, Lretrofit/RetrofitError;

    sget-object v8, Lretrofit/RetrofitError$Kind;->HTTP:Lretrofit/RetrofitError$Kind;

    const/4 v9, 0x0

    move-object v2, v0

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v9}, Lretrofit/RetrofitError;-><init>(Ljava/lang/String;Ljava/lang/String;Lretrofit/client/Response;Lretrofit/converter/Converter;Ljava/lang/reflect/Type;Lretrofit/RetrofitError$Kind;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static networkError(Ljava/lang/String;Ljava/io/IOException;)Lretrofit/RetrofitError;
    .locals 9

    .line 27
    new-instance v8, Lretrofit/RetrofitError;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    sget-object v6, Lretrofit/RetrofitError$Kind;->NETWORK:Lretrofit/RetrofitError$Kind;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move-object v2, p0

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lretrofit/RetrofitError;-><init>(Ljava/lang/String;Ljava/lang/String;Lretrofit/client/Response;Lretrofit/converter/Converter;Ljava/lang/reflect/Type;Lretrofit/RetrofitError$Kind;Ljava/lang/Throwable;)V

    return-object v8
.end method

.method public static unexpectedError(Ljava/lang/String;Ljava/lang/Throwable;)Lretrofit/RetrofitError;
    .locals 9

    .line 44
    new-instance v8, Lretrofit/RetrofitError;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    sget-object v6, Lretrofit/RetrofitError$Kind;->UNEXPECTED:Lretrofit/RetrofitError$Kind;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    move-object v2, p0

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lretrofit/RetrofitError;-><init>(Ljava/lang/String;Ljava/lang/String;Lretrofit/client/Response;Lretrofit/converter/Converter;Ljava/lang/reflect/Type;Lretrofit/RetrofitError$Kind;Ljava/lang/Throwable;)V

    return-object v8
.end method


# virtual methods
.method public getBody()Ljava/lang/Object;
    .locals 1

    .line 112
    iget-object v0, p0, Lretrofit/RetrofitError;->successType:Ljava/lang/reflect/Type;

    invoke-virtual {p0, v0}, Lretrofit/RetrofitError;->getBodyAs(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getBodyAs(Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 2

    .line 129
    iget-object v0, p0, Lretrofit/RetrofitError;->response:Lretrofit/client/Response;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 132
    :cond_0
    iget-object v0, p0, Lretrofit/RetrofitError;->response:Lretrofit/client/Response;

    invoke-virtual {v0}, Lretrofit/client/Response;->getBody()Lretrofit/mime/TypedInput;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    .line 137
    :cond_1
    :try_start_0
    iget-object v1, p0, Lretrofit/RetrofitError;->converter:Lretrofit/converter/Converter;

    invoke-interface {v1, v0, p1}, Lretrofit/converter/Converter;->fromBody(Lretrofit/mime/TypedInput;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lretrofit/converter/ConversionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 139
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public getKind()Lretrofit/RetrofitError$Kind;
    .locals 1

    .line 100
    iget-object v0, p0, Lretrofit/RetrofitError;->kind:Lretrofit/RetrofitError$Kind;

    return-object v0
.end method

.method public getResponse()Lretrofit/client/Response;
    .locals 1

    .line 86
    iget-object v0, p0, Lretrofit/RetrofitError;->response:Lretrofit/client/Response;

    return-object v0
.end method

.method public getSuccessType()Ljava/lang/reflect/Type;
    .locals 1

    .line 120
    iget-object v0, p0, Lretrofit/RetrofitError;->successType:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lretrofit/RetrofitError;->url:Ljava/lang/String;

    return-object v0
.end method

.method public isNetworkError()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 95
    iget-object v0, p0, Lretrofit/RetrofitError;->kind:Lretrofit/RetrofitError$Kind;

    sget-object v1, Lretrofit/RetrofitError$Kind;->NETWORK:Lretrofit/RetrofitError$Kind;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
