.class final Lretrofit2/ServiceMethod$Builder;
.super Ljava/lang/Object;
.source "ServiceMethod.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit2/ServiceMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field callAdapter:Lretrofit2/CallAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lretrofit2/CallAdapter",
            "<*>;"
        }
    .end annotation
.end field

.field contentType:Lokhttp3/MediaType;

.field gotBody:Z

.field gotField:Z

.field gotPart:Z

.field gotPath:Z

.field gotQuery:Z

.field gotUrl:Z

.field hasBody:Z

.field headers:Lokhttp3/Headers;

.field httpMethod:Ljava/lang/String;

.field isFormEncoded:Z

.field isMultipart:Z

.field final method:Ljava/lang/reflect/Method;

.field final methodAnnotations:[Ljava/lang/annotation/Annotation;

.field final parameterAnnotationsArray:[[Ljava/lang/annotation/Annotation;

.field parameterHandlers:[Lretrofit2/ParameterHandler;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lretrofit2/ParameterHandler",
            "<*>;"
        }
    .end annotation
.end field

.field final parameterTypes:[Ljava/lang/reflect/Type;

.field relativeUrl:Ljava/lang/String;

.field relativeUrlParamNames:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field responseConverter:Lretrofit2/Converter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lretrofit2/Converter",
            "<",
            "Lokhttp3/ResponseBody;",
            "TT;>;"
        }
    .end annotation
.end field

.field responseType:Ljava/lang/reflect/Type;

.field final retrofit:Lretrofit2/Retrofit;


# direct methods
.method public constructor <init>(Lretrofit2/Retrofit;Ljava/lang/reflect/Method;)V
    .locals 1
    .param p1, "retrofit"    # Lretrofit2/Retrofit;
    .param p2, "method"    # Ljava/lang/reflect/Method;

    .prologue
    .line 151
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 152
    iput-object p1, p0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    .line 153
    iput-object p2, p0, Lretrofit2/ServiceMethod$Builder;->method:Ljava/lang/reflect/Method;

    .line 154
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    iput-object v0, p0, Lretrofit2/ServiceMethod$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    .line 155
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lretrofit2/ServiceMethod$Builder;->parameterTypes:[Ljava/lang/reflect/Type;

    .line 156
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v0

    iput-object v0, p0, Lretrofit2/ServiceMethod$Builder;->parameterAnnotationsArray:[[Ljava/lang/annotation/Annotation;

    .line 157
    return-void
.end method

.method private createCallAdapter()Lretrofit2/CallAdapter;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/CallAdapter",
            "<*>;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 222
    iget-object v3, p0, Lretrofit2/ServiceMethod$Builder;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 223
    .local v2, "returnType":Ljava/lang/reflect/Type;
    invoke-static {v2}, Lretrofit2/Utils;->hasUnresolvableType(Ljava/lang/reflect/Type;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 224
    const-string v3, "Method return type must not include a type variable or wildcard: %s"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v5

    invoke-direct {p0, v3, v4}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v3

    throw v3

    .line 227
    :cond_0
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_1

    .line 228
    const-string v3, "Service methods cannot return void."

    new-array v4, v5, [Ljava/lang/Object;

    invoke-direct {p0, v3, v4}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v3

    throw v3

    .line 230
    :cond_1
    iget-object v3, p0, Lretrofit2/ServiceMethod$Builder;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    .line 232
    .local v0, "annotations":[Ljava/lang/annotation/Annotation;
    :try_start_0
    iget-object v3, p0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    invoke-virtual {v3, v2, v0}, Lretrofit2/Retrofit;->callAdapter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/CallAdapter;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    return-object v3

    .line 233
    :catch_0
    move-exception v1

    .line 234
    .local v1, "e":Ljava/lang/RuntimeException;
    const-string v3, "Unable to create call adapter for %s"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v5

    invoke-direct {p0, v1, v3, v4}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v3

    throw v3
.end method

.method private createResponseConverter()Lretrofit2/Converter;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lretrofit2/Converter",
            "<",
            "Lokhttp3/ResponseBody;",
            "TT;>;"
        }
    .end annotation

    .prologue
    .line 702
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    iget-object v2, p0, Lretrofit2/ServiceMethod$Builder;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    .line 704
    .local v0, "annotations":[Ljava/lang/annotation/Annotation;
    :try_start_0
    iget-object v2, p0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    iget-object v3, p0, Lretrofit2/ServiceMethod$Builder;->responseType:Ljava/lang/reflect/Type;

    invoke-virtual {v2, v3, v0}, Lretrofit2/Retrofit;->responseBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    return-object v2

    .line 705
    :catch_0
    move-exception v1

    .line 706
    .local v1, "e":Ljava/lang/RuntimeException;
    const-string v2, "Unable to create converter for %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lretrofit2/ServiceMethod$Builder;->responseType:Ljava/lang/reflect/Type;

    aput-object v5, v3, v4

    invoke-direct {p0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v2

    throw v2
.end method

.method private varargs methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;
    .locals 1
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "args"    # [Ljava/lang/Object;

    .prologue
    .line 711
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    return-object v0
.end method

.method private varargs methodError(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;
    .locals 3
    .param p1, "cause"    # Ljava/lang/Throwable;
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "args"    # [Ljava/lang/Object;

    .prologue
    .line 715
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 716
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n    for method "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lretrofit2/ServiceMethod$Builder;->method:Ljava/lang/reflect/Method;

    .line 718
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lretrofit2/ServiceMethod$Builder;->method:Ljava/lang/reflect/Method;

    .line 720
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 716
    return-object v0
.end method

.method private varargs parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;
    .locals 2
    .param p1, "p"    # I
    .param p2, "message"    # Ljava/lang/String;
    .param p3, "args"    # [Ljava/lang/Object;

    .prologue
    .line 729
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " (parameter #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    return-object v0
.end method

.method private varargs parameterError(Ljava/lang/Throwable;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;
    .locals 2
    .param p1, "cause"    # Ljava/lang/Throwable;
    .param p2, "p"    # I
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "args"    # [Ljava/lang/Object;

    .prologue
    .line 725
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " (parameter #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, p2, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p4}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    return-object v0
.end method

.method private parseHeaders([Ljava/lang/String;)Lokhttp3/Headers;
    .locals 11
    .param p1, "headers"    # [Ljava/lang/String;

    .prologue
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    const/4 v10, 0x1

    const/4 v7, 0x0

    .line 307
    new-instance v0, Lokhttp3/Headers$Builder;

    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    .line 308
    .local v0, "builder":Lokhttp3/Headers$Builder;
    array-length v8, p1

    move v6, v7

    :goto_0
    if-ge v6, v8, :cond_4

    aget-object v2, p1, v6

    .line 309
    .local v2, "header":Ljava/lang/String;
    const/16 v9, 0x3a

    invoke-virtual {v2, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 310
    .local v1, "colon":I
    const/4 v9, -0x1

    if-eq v1, v9, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    if-ne v1, v9, :cond_1

    .line 311
    :cond_0
    const-string v6, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    new-array v8, v10, [Ljava/lang/Object;

    aput-object v2, v8, v7

    invoke-direct {p0, v6, v8}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v6

    throw v6

    .line 314
    :cond_1
    invoke-virtual {v2, v7, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 315
    .local v3, "headerName":Ljava/lang/String;
    add-int/lit8 v9, v1, 0x1

    invoke-virtual {v2, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 316
    .local v4, "headerValue":Ljava/lang/String;
    const-string v9, "Content-Type"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 317
    invoke-static {v4}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v5

    .line 318
    .local v5, "type":Lokhttp3/MediaType;
    if-nez v5, :cond_2

    .line 319
    const-string v6, "Malformed content type: %s"

    new-array v8, v10, [Ljava/lang/Object;

    aput-object v4, v8, v7

    invoke-direct {p0, v6, v8}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v6

    throw v6

    .line 321
    :cond_2
    iput-object v5, p0, Lretrofit2/ServiceMethod$Builder;->contentType:Lokhttp3/MediaType;

    .line 308
    .end local v5    # "type":Lokhttp3/MediaType;
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 323
    :cond_3
    invoke-virtual {v0, v3, v4}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    goto :goto_1

    .line 326
    .end local v1    # "colon":I
    .end local v2    # "header":Ljava/lang/String;
    .end local v3    # "headerName":Ljava/lang/String;
    .end local v4    # "headerValue":Ljava/lang/String;
    :cond_4
    invoke-virtual {v0}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object v6

    return-object v6
.end method

.method private parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 8
    .param p1, "httpMethod"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;
    .param p3, "hasBody"    # Z

    .prologue
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 279
    iget-object v3, p0, Lretrofit2/ServiceMethod$Builder;->httpMethod:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 280
    const-string v3, "Only one HTTP method is allowed. Found: %s and %s."

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lretrofit2/ServiceMethod$Builder;->httpMethod:Ljava/lang/String;

    aput-object v5, v4, v6

    aput-object p1, v4, v7

    invoke-direct {p0, v3, v4}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v3

    throw v3

    .line 283
    :cond_0
    iput-object p1, p0, Lretrofit2/ServiceMethod$Builder;->httpMethod:Ljava/lang/String;

    .line 284
    iput-boolean p3, p0, Lretrofit2/ServiceMethod$Builder;->hasBody:Z

    .line 286
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 304
    :goto_0
    return-void

    .line 291
    :cond_1
    const/16 v3, 0x3f

    invoke-virtual {p2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 292
    .local v2, "question":I
    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v2, v3, :cond_2

    .line 294
    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 295
    .local v1, "queryParams":Ljava/lang/String;
    sget-object v3, Lretrofit2/ServiceMethod;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 296
    .local v0, "queryParamMatcher":Ljava/util/regex/Matcher;
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 297
    const-string v3, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query."

    new-array v4, v7, [Ljava/lang/Object;

    aput-object v1, v4, v6

    invoke-direct {p0, v3, v4}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v3

    throw v3

    .line 302
    .end local v0    # "queryParamMatcher":Ljava/util/regex/Matcher;
    .end local v1    # "queryParams":Ljava/lang/String;
    :cond_2
    iput-object p2, p0, Lretrofit2/ServiceMethod$Builder;->relativeUrl:Ljava/lang/String;

    .line 303
    invoke-static {p2}, Lretrofit2/ServiceMethod;->parsePathParameters(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v3

    iput-object v3, p0, Lretrofit2/ServiceMethod$Builder;->relativeUrlParamNames:Ljava/util/Set;

    goto :goto_0
.end method

.method private parseMethodAnnotation(Ljava/lang/annotation/Annotation;)V
    .locals 6
    .param p1, "annotation"    # Ljava/lang/annotation/Annotation;

    .prologue
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 239
    instance-of v2, p1, Lretrofit2/http/DELETE;

    if-eqz v2, :cond_1

    .line 240
    const-string v2, "DELETE"

    check-cast p1, Lretrofit2/http/DELETE;

    .end local p1    # "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {p1}, Lretrofit2/http/DELETE;->value()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, v4}, Lretrofit2/ServiceMethod$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 276
    :cond_0
    :goto_0
    return-void

    .line 241
    .restart local p1    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_1
    instance-of v2, p1, Lretrofit2/http/GET;

    if-eqz v2, :cond_2

    .line 242
    const-string v2, "GET"

    check-cast p1, Lretrofit2/http/GET;

    .end local p1    # "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {p1}, Lretrofit2/http/GET;->value()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, v4}, Lretrofit2/ServiceMethod$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 243
    .restart local p1    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_2
    instance-of v2, p1, Lretrofit2/http/HEAD;

    if-eqz v2, :cond_3

    .line 244
    const-string v2, "HEAD"

    check-cast p1, Lretrofit2/http/HEAD;

    .end local p1    # "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {p1}, Lretrofit2/http/HEAD;->value()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, v4}, Lretrofit2/ServiceMethod$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 245
    const-class v2, Ljava/lang/Void;

    iget-object v3, p0, Lretrofit2/ServiceMethod$Builder;->responseType:Ljava/lang/reflect/Type;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 246
    const-string v2, "HEAD method must use Void as response type."

    new-array v3, v4, [Ljava/lang/Object;

    invoke-direct {p0, v2, v3}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v2

    throw v2

    .line 248
    .restart local p1    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_3
    instance-of v2, p1, Lretrofit2/http/PATCH;

    if-eqz v2, :cond_4

    .line 249
    const-string v2, "PATCH"

    check-cast p1, Lretrofit2/http/PATCH;

    .end local p1    # "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {p1}, Lretrofit2/http/PATCH;->value()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, v5}, Lretrofit2/ServiceMethod$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 250
    .restart local p1    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_4
    instance-of v2, p1, Lretrofit2/http/POST;

    if-eqz v2, :cond_5

    .line 251
    const-string v2, "POST"

    check-cast p1, Lretrofit2/http/POST;

    .end local p1    # "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {p1}, Lretrofit2/http/POST;->value()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, v5}, Lretrofit2/ServiceMethod$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 252
    .restart local p1    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_5
    instance-of v2, p1, Lretrofit2/http/PUT;

    if-eqz v2, :cond_6

    .line 253
    const-string v2, "PUT"

    check-cast p1, Lretrofit2/http/PUT;

    .end local p1    # "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {p1}, Lretrofit2/http/PUT;->value()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, v5}, Lretrofit2/ServiceMethod$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 254
    .restart local p1    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_6
    instance-of v2, p1, Lretrofit2/http/OPTIONS;

    if-eqz v2, :cond_7

    .line 255
    const-string v2, "OPTIONS"

    check-cast p1, Lretrofit2/http/OPTIONS;

    .end local p1    # "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {p1}, Lretrofit2/http/OPTIONS;->value()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3, v4}, Lretrofit2/ServiceMethod$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 256
    .restart local p1    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_7
    instance-of v2, p1, Lretrofit2/http/HTTP;

    if-eqz v2, :cond_8

    move-object v1, p1

    .line 257
    check-cast v1, Lretrofit2/http/HTTP;

    .line 258
    .local v1, "http":Lretrofit2/http/HTTP;
    invoke-interface {v1}, Lretrofit2/http/HTTP;->method()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Lretrofit2/http/HTTP;->path()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Lretrofit2/http/HTTP;->hasBody()Z

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lretrofit2/ServiceMethod$Builder;->parseHttpMethodAndPath(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 259
    .end local v1    # "http":Lretrofit2/http/HTTP;
    :cond_8
    instance-of v2, p1, Lretrofit2/http/Headers;

    if-eqz v2, :cond_a

    .line 260
    check-cast p1, Lretrofit2/http/Headers;

    .end local p1    # "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {p1}, Lretrofit2/http/Headers;->value()[Ljava/lang/String;

    move-result-object v0

    .line 261
    .local v0, "headersToParse":[Ljava/lang/String;
    array-length v2, v0

    if-nez v2, :cond_9

    .line 262
    const-string v2, "@Headers annotation is empty."

    new-array v3, v4, [Ljava/lang/Object;

    invoke-direct {p0, v2, v3}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v2

    throw v2

    .line 264
    :cond_9
    invoke-direct {p0, v0}, Lretrofit2/ServiceMethod$Builder;->parseHeaders([Ljava/lang/String;)Lokhttp3/Headers;

    move-result-object v2

    iput-object v2, p0, Lretrofit2/ServiceMethod$Builder;->headers:Lokhttp3/Headers;

    goto/16 :goto_0

    .line 265
    .end local v0    # "headersToParse":[Ljava/lang/String;
    .restart local p1    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_a
    instance-of v2, p1, Lretrofit2/http/Multipart;

    if-eqz v2, :cond_c

    .line 266
    iget-boolean v2, p0, Lretrofit2/ServiceMethod$Builder;->isFormEncoded:Z

    if-eqz v2, :cond_b

    .line 267
    const-string v2, "Only one encoding annotation is allowed."

    new-array v3, v4, [Ljava/lang/Object;

    invoke-direct {p0, v2, v3}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v2

    throw v2

    .line 269
    :cond_b
    iput-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->isMultipart:Z

    goto/16 :goto_0

    .line 270
    :cond_c
    instance-of v2, p1, Lretrofit2/http/FormUrlEncoded;

    if-eqz v2, :cond_0

    .line 271
    iget-boolean v2, p0, Lretrofit2/ServiceMethod$Builder;->isMultipart:Z

    if-eqz v2, :cond_d

    .line 272
    const-string v2, "Only one encoding annotation is allowed."

    new-array v3, v4, [Ljava/lang/Object;

    invoke-direct {p0, v2, v3}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v2

    throw v2

    .line 274
    :cond_d
    iput-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->isFormEncoded:Z

    goto/16 :goto_0
.end method

.method private parseParameter(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/ParameterHandler;
    .locals 6
    .param p1, "p"    # I
    .param p2, "parameterType"    # Ljava/lang/reflect/Type;
    .param p3, "annotations"    # [Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lretrofit2/ParameterHandler",
            "<*>;"
        }
    .end annotation

    .prologue
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    const/4 v4, 0x0

    .line 331
    const/4 v2, 0x0

    .line 332
    .local v2, "result":Lretrofit2/ParameterHandler;, "Lretrofit2/ParameterHandler<*>;"
    array-length v5, p3

    move v3, v4

    :goto_0
    if-ge v3, v5, :cond_2

    aget-object v0, p3, v3

    .line 333
    .local v0, "annotation":Ljava/lang/annotation/Annotation;
    invoke-direct {p0, p1, p2, p3, v0}, Lretrofit2/ServiceMethod$Builder;->parseParameterAnnotation(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Lretrofit2/ParameterHandler;

    move-result-object v1

    .line 336
    .local v1, "annotationAction":Lretrofit2/ParameterHandler;, "Lretrofit2/ParameterHandler<*>;"
    if-nez v1, :cond_0

    .line 332
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 340
    :cond_0
    if-eqz v2, :cond_1

    .line 341
    const-string v3, "Multiple Retrofit annotations found, only one allowed."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-direct {p0, p1, v3, v4}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v3

    throw v3

    .line 344
    :cond_1
    move-object v2, v1

    goto :goto_1

    .line 347
    .end local v0    # "annotation":Ljava/lang/annotation/Annotation;
    .end local v1    # "annotationAction":Lretrofit2/ParameterHandler;, "Lretrofit2/ParameterHandler<*>;"
    :cond_2
    if-nez v2, :cond_3

    .line 348
    const-string v3, "No Retrofit annotation found."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-direct {p0, p1, v3, v4}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v3

    throw v3

    .line 351
    :cond_3
    return-object v2
.end method

.method private parseParameterAnnotation(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/lang/annotation/Annotation;)Lretrofit2/ParameterHandler;
    .locals 30
    .param p1, "p"    # I
    .param p2, "type"    # Ljava/lang/reflect/Type;
    .param p3, "annotations"    # [Ljava/lang/annotation/Annotation;
    .param p4, "annotation"    # Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Lretrofit2/ParameterHandler",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 356
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    move-object/from16 v0, p4

    instance-of v0, v0, Lretrofit2/http/Url;

    move/from16 v26, v0

    if-eqz v26, :cond_6

    .line 357
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit2/ServiceMethod$Builder;->gotUrl:Z

    move/from16 v26, v0

    if-eqz v26, :cond_0

    .line 358
    const-string v26, "Multiple @Url method annotations found."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 360
    :cond_0
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit2/ServiceMethod$Builder;->gotPath:Z

    move/from16 v26, v0

    if-eqz v26, :cond_1

    .line 361
    const-string v26, "@Path parameters may not be used with @Url."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 363
    :cond_1
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit2/ServiceMethod$Builder;->gotQuery:Z

    move/from16 v26, v0

    if-eqz v26, :cond_2

    .line 364
    const-string v26, "A @Url parameter must not come after a @Query"

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 366
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->relativeUrl:Ljava/lang/String;

    move-object/from16 v26, v0

    if-eqz v26, :cond_3

    .line 367
    const-string v26, "@Url cannot be used with @%s URL"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    const/16 v28, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->httpMethod:Ljava/lang/String;

    move-object/from16 v29, v0

    aput-object v29, v27, v28

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 370
    :cond_3
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lretrofit2/ServiceMethod$Builder;->gotUrl:Z

    .line 372
    const-class v26, Lokhttp3/HttpUrl;

    move-object/from16 v0, p2

    move-object/from16 v1, v26

    if-eq v0, v1, :cond_4

    const-class v26, Ljava/lang/String;

    move-object/from16 v0, p2

    move-object/from16 v1, v26

    if-eq v0, v1, :cond_4

    const-class v26, Ljava/net/URI;

    move-object/from16 v0, p2

    move-object/from16 v1, v26

    if-eq v0, v1, :cond_4

    move-object/from16 v0, p2

    instance-of v0, v0, Ljava/lang/Class;

    move/from16 v26, v0

    if-eqz v26, :cond_5

    const-string v26, "android.net.Uri"

    check-cast p2, Ljava/lang/Class;

    .line 375
    .end local p2    # "type":Ljava/lang/reflect/Type;
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_5

    .line 376
    :cond_4
    new-instance v26, Lretrofit2/ParameterHandler$RelativeUrl;

    invoke-direct/range {v26 .. v26}, Lretrofit2/ParameterHandler$RelativeUrl;-><init>()V

    .line 687
    .end local p4    # "annotation":Ljava/lang/annotation/Annotation;
    :goto_0
    return-object v26

    .line 378
    .restart local p4    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_5
    const-string v26, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 382
    .restart local p2    # "type":Ljava/lang/reflect/Type;
    :cond_6
    move-object/from16 v0, p4

    instance-of v0, v0, Lretrofit2/http/Path;

    move/from16 v26, v0

    if-eqz v26, :cond_a

    .line 383
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit2/ServiceMethod$Builder;->gotQuery:Z

    move/from16 v26, v0

    if-eqz v26, :cond_7

    .line 384
    const-string v26, "A @Path parameter must not come after a @Query."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 386
    :cond_7
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit2/ServiceMethod$Builder;->gotUrl:Z

    move/from16 v26, v0

    if-eqz v26, :cond_8

    .line 387
    const-string v26, "@Path parameters may not be used with @Url."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 389
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->relativeUrl:Ljava/lang/String;

    move-object/from16 v26, v0

    if-nez v26, :cond_9

    .line 390
    const-string v26, "@Path can only be used with relative url on @%s"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    const/16 v28, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->httpMethod:Ljava/lang/String;

    move-object/from16 v29, v0

    aput-object v29, v27, v28

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 392
    :cond_9
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lretrofit2/ServiceMethod$Builder;->gotPath:Z

    move-object/from16 v20, p4

    .line 394
    check-cast v20, Lretrofit2/http/Path;

    .line 395
    .local v20, "path":Lretrofit2/http/Path;
    invoke-interface/range {v20 .. v20}, Lretrofit2/http/Path;->value()Ljava/lang/String;

    move-result-object v15

    .line 396
    .local v15, "name":Ljava/lang/String;
    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v0, v1, v15}, Lretrofit2/ServiceMethod$Builder;->validatePathName(ILjava/lang/String;)V

    .line 398
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v2}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v5

    .line 399
    .local v5, "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Path;

    invoke-interface/range {v20 .. v20}, Lretrofit2/http/Path;->encoded()Z

    move-result v27

    move-object/from16 v0, v26

    move/from16 v1, v27

    invoke-direct {v0, v15, v5, v1}, Lretrofit2/ParameterHandler$Path;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    goto/16 :goto_0

    .line 401
    .end local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    .end local v15    # "name":Ljava/lang/String;
    .end local v20    # "path":Lretrofit2/http/Path;
    :cond_a
    move-object/from16 v0, p4

    instance-of v0, v0, Lretrofit2/http/Query;

    move/from16 v26, v0

    if-eqz v26, :cond_e

    move-object/from16 v21, p4

    .line 402
    check-cast v21, Lretrofit2/http/Query;

    .line 403
    .local v21, "query":Lretrofit2/http/Query;
    invoke-interface/range {v21 .. v21}, Lretrofit2/http/Query;->value()Ljava/lang/String;

    move-result-object v15

    .line 404
    .restart local v15    # "name":Ljava/lang/String;
    invoke-interface/range {v21 .. v21}, Lretrofit2/http/Query;->encoded()Z

    move-result v8

    .line 406
    .local v8, "encoded":Z
    invoke-static/range {p2 .. p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v22

    .line 407
    .local v22, "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lretrofit2/ServiceMethod$Builder;->gotQuery:Z

    .line 408
    const-class v26, Ljava/lang/Iterable;

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-eqz v26, :cond_c

    .line 409
    move-object/from16 v0, p2

    instance-of v0, v0, Ljava/lang/reflect/ParameterizedType;

    move/from16 v26, v0

    if-nez v26, :cond_b

    .line 410
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, " must include generic type (e.g., "

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    .line 412
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "<String>)"

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    .line 410
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    :cond_b
    move-object/from16 v16, p2

    .line 415
    check-cast v16, Ljava/lang/reflect/ParameterizedType;

    .line 416
    .local v16, "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    const/16 v26, 0x0

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v12

    .line 417
    .local v12, "iterableType":Ljava/lang/reflect/Type;
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    .line 418
    move-object/from16 v0, v26

    move-object/from16 v1, p3

    invoke-virtual {v0, v12, v1}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v5

    .line 419
    .restart local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Query;

    move-object/from16 v0, v26

    invoke-direct {v0, v15, v5, v8}, Lretrofit2/ParameterHandler$Query;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    invoke-virtual/range {v26 .. v26}, Lretrofit2/ParameterHandler$Query;->iterable()Lretrofit2/ParameterHandler;

    move-result-object v26

    goto/16 :goto_0

    .line 420
    .end local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    .end local v12    # "iterableType":Ljava/lang/reflect/Type;
    .end local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    :cond_c
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->isArray()Z

    move-result v26

    if-eqz v26, :cond_d

    .line 421
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Lretrofit2/ServiceMethod;->boxIfPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 422
    .local v4, "arrayComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    .line 423
    move-object/from16 v0, v26

    move-object/from16 v1, p3

    invoke-virtual {v0, v4, v1}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v5

    .line 424
    .restart local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Query;

    move-object/from16 v0, v26

    invoke-direct {v0, v15, v5, v8}, Lretrofit2/ParameterHandler$Query;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    invoke-virtual/range {v26 .. v26}, Lretrofit2/ParameterHandler$Query;->array()Lretrofit2/ParameterHandler;

    move-result-object v26

    goto/16 :goto_0

    .line 426
    .end local v4    # "arrayComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    :cond_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    .line 427
    move-object/from16 v0, v26

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v2}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v5

    .line 428
    .restart local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Query;

    move-object/from16 v0, v26

    invoke-direct {v0, v15, v5, v8}, Lretrofit2/ParameterHandler$Query;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    goto/16 :goto_0

    .line 431
    .end local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    .end local v8    # "encoded":Z
    .end local v15    # "name":Ljava/lang/String;
    .end local v21    # "query":Lretrofit2/http/Query;
    .end local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_e
    move-object/from16 v0, p4

    instance-of v0, v0, Lretrofit2/http/QueryMap;

    move/from16 v26, v0

    if-eqz v26, :cond_12

    .line 432
    invoke-static/range {p2 .. p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v22

    .line 433
    .restart local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v26, Ljava/util/Map;

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-nez v26, :cond_f

    .line 434
    const-string v26, "@QueryMap parameter type must be Map."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 436
    :cond_f
    const-class v26, Ljava/util/Map;

    move-object/from16 v0, p2

    move-object/from16 v1, v22

    move-object/from16 v2, v26

    invoke-static {v0, v1, v2}, Lretrofit2/Utils;->getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v14

    .line 437
    .local v14, "mapType":Ljava/lang/reflect/Type;
    instance-of v0, v14, Ljava/lang/reflect/ParameterizedType;

    move/from16 v26, v0

    if-nez v26, :cond_10

    .line 438
    const-string v26, "Map must include generic types (e.g., Map<String, String>)"

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    :cond_10
    move-object/from16 v16, v14

    .line 440
    check-cast v16, Ljava/lang/reflect/ParameterizedType;

    .line 441
    .restart local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    const/16 v26, 0x0

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v13

    .line 442
    .local v13, "keyType":Ljava/lang/reflect/Type;
    const-class v26, Ljava/lang/String;

    move-object/from16 v0, v26

    if-eq v0, v13, :cond_11

    .line 443
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    const-string v27, "@QueryMap keys must be of type String: "

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 445
    :cond_11
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v25

    .line 446
    .local v25, "valueType":Ljava/lang/reflect/Type;
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    .line 447
    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v2}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v23

    .line 449
    .local v23, "valueConverter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    new-instance v26, Lretrofit2/ParameterHandler$QueryMap;

    check-cast p4, Lretrofit2/http/QueryMap;

    .end local p4    # "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface/range {p4 .. p4}, Lretrofit2/http/QueryMap;->encoded()Z

    move-result v27

    move-object/from16 v0, v26

    move-object/from16 v1, v23

    move/from16 v2, v27

    invoke-direct {v0, v1, v2}, Lretrofit2/ParameterHandler$QueryMap;-><init>(Lretrofit2/Converter;Z)V

    goto/16 :goto_0

    .line 451
    .end local v13    # "keyType":Ljava/lang/reflect/Type;
    .end local v14    # "mapType":Ljava/lang/reflect/Type;
    .end local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    .end local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v23    # "valueConverter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    .end local v25    # "valueType":Ljava/lang/reflect/Type;
    .restart local p4    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_12
    move-object/from16 v0, p4

    instance-of v0, v0, Lretrofit2/http/Header;

    move/from16 v26, v0

    if-eqz v26, :cond_16

    move-object/from16 v10, p4

    .line 452
    check-cast v10, Lretrofit2/http/Header;

    .line 453
    .local v10, "header":Lretrofit2/http/Header;
    invoke-interface {v10}, Lretrofit2/http/Header;->value()Ljava/lang/String;

    move-result-object v15

    .line 455
    .restart local v15    # "name":Ljava/lang/String;
    invoke-static/range {p2 .. p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v22

    .line 456
    .restart local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v26, Ljava/lang/Iterable;

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-eqz v26, :cond_14

    .line 457
    move-object/from16 v0, p2

    instance-of v0, v0, Ljava/lang/reflect/ParameterizedType;

    move/from16 v26, v0

    if-nez v26, :cond_13

    .line 458
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, " must include generic type (e.g., "

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    .line 460
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "<String>)"

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    .line 458
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    :cond_13
    move-object/from16 v16, p2

    .line 463
    check-cast v16, Ljava/lang/reflect/ParameterizedType;

    .line 464
    .restart local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    const/16 v26, 0x0

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v12

    .line 465
    .restart local v12    # "iterableType":Ljava/lang/reflect/Type;
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    .line 466
    move-object/from16 v0, v26

    move-object/from16 v1, p3

    invoke-virtual {v0, v12, v1}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v5

    .line 467
    .restart local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Header;

    move-object/from16 v0, v26

    invoke-direct {v0, v15, v5}, Lretrofit2/ParameterHandler$Header;-><init>(Ljava/lang/String;Lretrofit2/Converter;)V

    invoke-virtual/range {v26 .. v26}, Lretrofit2/ParameterHandler$Header;->iterable()Lretrofit2/ParameterHandler;

    move-result-object v26

    goto/16 :goto_0

    .line 468
    .end local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    .end local v12    # "iterableType":Ljava/lang/reflect/Type;
    .end local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    :cond_14
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->isArray()Z

    move-result v26

    if-eqz v26, :cond_15

    .line 469
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Lretrofit2/ServiceMethod;->boxIfPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 470
    .restart local v4    # "arrayComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    .line 471
    move-object/from16 v0, v26

    move-object/from16 v1, p3

    invoke-virtual {v0, v4, v1}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v5

    .line 472
    .restart local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Header;

    move-object/from16 v0, v26

    invoke-direct {v0, v15, v5}, Lretrofit2/ParameterHandler$Header;-><init>(Ljava/lang/String;Lretrofit2/Converter;)V

    invoke-virtual/range {v26 .. v26}, Lretrofit2/ParameterHandler$Header;->array()Lretrofit2/ParameterHandler;

    move-result-object v26

    goto/16 :goto_0

    .line 474
    .end local v4    # "arrayComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    :cond_15
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    .line 475
    move-object/from16 v0, v26

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v2}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v5

    .line 476
    .restart local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Header;

    move-object/from16 v0, v26

    invoke-direct {v0, v15, v5}, Lretrofit2/ParameterHandler$Header;-><init>(Ljava/lang/String;Lretrofit2/Converter;)V

    goto/16 :goto_0

    .line 479
    .end local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    .end local v10    # "header":Lretrofit2/http/Header;
    .end local v15    # "name":Ljava/lang/String;
    .end local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_16
    move-object/from16 v0, p4

    instance-of v0, v0, Lretrofit2/http/HeaderMap;

    move/from16 v26, v0

    if-eqz v26, :cond_1a

    .line 480
    invoke-static/range {p2 .. p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v22

    .line 481
    .restart local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v26, Ljava/util/Map;

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-nez v26, :cond_17

    .line 482
    const-string v26, "@HeaderMap parameter type must be Map."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 484
    :cond_17
    const-class v26, Ljava/util/Map;

    move-object/from16 v0, p2

    move-object/from16 v1, v22

    move-object/from16 v2, v26

    invoke-static {v0, v1, v2}, Lretrofit2/Utils;->getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v14

    .line 485
    .restart local v14    # "mapType":Ljava/lang/reflect/Type;
    instance-of v0, v14, Ljava/lang/reflect/ParameterizedType;

    move/from16 v26, v0

    if-nez v26, :cond_18

    .line 486
    const-string v26, "Map must include generic types (e.g., Map<String, String>)"

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    :cond_18
    move-object/from16 v16, v14

    .line 488
    check-cast v16, Ljava/lang/reflect/ParameterizedType;

    .line 489
    .restart local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    const/16 v26, 0x0

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v13

    .line 490
    .restart local v13    # "keyType":Ljava/lang/reflect/Type;
    const-class v26, Ljava/lang/String;

    move-object/from16 v0, v26

    if-eq v0, v13, :cond_19

    .line 491
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    const-string v27, "@HeaderMap keys must be of type String: "

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 493
    :cond_19
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v25

    .line 494
    .restart local v25    # "valueType":Ljava/lang/reflect/Type;
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    .line 495
    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v2}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v23

    .line 497
    .restart local v23    # "valueConverter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    new-instance v26, Lretrofit2/ParameterHandler$HeaderMap;

    move-object/from16 v0, v26

    move-object/from16 v1, v23

    invoke-direct {v0, v1}, Lretrofit2/ParameterHandler$HeaderMap;-><init>(Lretrofit2/Converter;)V

    goto/16 :goto_0

    .line 499
    .end local v13    # "keyType":Ljava/lang/reflect/Type;
    .end local v14    # "mapType":Ljava/lang/reflect/Type;
    .end local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    .end local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v23    # "valueConverter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    .end local v25    # "valueType":Ljava/lang/reflect/Type;
    :cond_1a
    move-object/from16 v0, p4

    instance-of v0, v0, Lretrofit2/http/Field;

    move/from16 v26, v0

    if-eqz v26, :cond_1f

    .line 500
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit2/ServiceMethod$Builder;->isFormEncoded:Z

    move/from16 v26, v0

    if-nez v26, :cond_1b

    .line 501
    const-string v26, "@Field parameters can only be used with form encoding."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    :cond_1b
    move-object/from16 v9, p4

    .line 503
    check-cast v9, Lretrofit2/http/Field;

    .line 504
    .local v9, "field":Lretrofit2/http/Field;
    invoke-interface {v9}, Lretrofit2/http/Field;->value()Ljava/lang/String;

    move-result-object v15

    .line 505
    .restart local v15    # "name":Ljava/lang/String;
    invoke-interface {v9}, Lretrofit2/http/Field;->encoded()Z

    move-result v8

    .line 507
    .restart local v8    # "encoded":Z
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lretrofit2/ServiceMethod$Builder;->gotField:Z

    .line 509
    invoke-static/range {p2 .. p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v22

    .line 510
    .restart local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v26, Ljava/lang/Iterable;

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-eqz v26, :cond_1d

    .line 511
    move-object/from16 v0, p2

    instance-of v0, v0, Ljava/lang/reflect/ParameterizedType;

    move/from16 v26, v0

    if-nez v26, :cond_1c

    .line 512
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, " must include generic type (e.g., "

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    .line 514
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "<String>)"

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    .line 512
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    :cond_1c
    move-object/from16 v16, p2

    .line 517
    check-cast v16, Ljava/lang/reflect/ParameterizedType;

    .line 518
    .restart local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    const/16 v26, 0x0

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v12

    .line 519
    .restart local v12    # "iterableType":Ljava/lang/reflect/Type;
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    .line 520
    move-object/from16 v0, v26

    move-object/from16 v1, p3

    invoke-virtual {v0, v12, v1}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v5

    .line 521
    .restart local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Field;

    move-object/from16 v0, v26

    invoke-direct {v0, v15, v5, v8}, Lretrofit2/ParameterHandler$Field;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    invoke-virtual/range {v26 .. v26}, Lretrofit2/ParameterHandler$Field;->iterable()Lretrofit2/ParameterHandler;

    move-result-object v26

    goto/16 :goto_0

    .line 522
    .end local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    .end local v12    # "iterableType":Ljava/lang/reflect/Type;
    .end local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    :cond_1d
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->isArray()Z

    move-result v26

    if-eqz v26, :cond_1e

    .line 523
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Lretrofit2/ServiceMethod;->boxIfPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 524
    .restart local v4    # "arrayComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    .line 525
    move-object/from16 v0, v26

    move-object/from16 v1, p3

    invoke-virtual {v0, v4, v1}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v5

    .line 526
    .restart local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Field;

    move-object/from16 v0, v26

    invoke-direct {v0, v15, v5, v8}, Lretrofit2/ParameterHandler$Field;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    invoke-virtual/range {v26 .. v26}, Lretrofit2/ParameterHandler$Field;->array()Lretrofit2/ParameterHandler;

    move-result-object v26

    goto/16 :goto_0

    .line 528
    .end local v4    # "arrayComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    :cond_1e
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    .line 529
    move-object/from16 v0, v26

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v2}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v5

    .line 530
    .restart local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Field;

    move-object/from16 v0, v26

    invoke-direct {v0, v15, v5, v8}, Lretrofit2/ParameterHandler$Field;-><init>(Ljava/lang/String;Lretrofit2/Converter;Z)V

    goto/16 :goto_0

    .line 533
    .end local v5    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    .end local v8    # "encoded":Z
    .end local v9    # "field":Lretrofit2/http/Field;
    .end local v15    # "name":Ljava/lang/String;
    .end local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_1f
    move-object/from16 v0, p4

    instance-of v0, v0, Lretrofit2/http/FieldMap;

    move/from16 v26, v0

    if-eqz v26, :cond_24

    .line 534
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit2/ServiceMethod$Builder;->isFormEncoded:Z

    move/from16 v26, v0

    if-nez v26, :cond_20

    .line 535
    const-string v26, "@FieldMap parameters can only be used with form encoding."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 537
    :cond_20
    invoke-static/range {p2 .. p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v22

    .line 538
    .restart local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v26, Ljava/util/Map;

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-nez v26, :cond_21

    .line 539
    const-string v26, "@FieldMap parameter type must be Map."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 541
    :cond_21
    const-class v26, Ljava/util/Map;

    move-object/from16 v0, p2

    move-object/from16 v1, v22

    move-object/from16 v2, v26

    invoke-static {v0, v1, v2}, Lretrofit2/Utils;->getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v14

    .line 542
    .restart local v14    # "mapType":Ljava/lang/reflect/Type;
    instance-of v0, v14, Ljava/lang/reflect/ParameterizedType;

    move/from16 v26, v0

    if-nez v26, :cond_22

    .line 543
    const-string v26, "Map must include generic types (e.g., Map<String, String>)"

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    :cond_22
    move-object/from16 v16, v14

    .line 546
    check-cast v16, Ljava/lang/reflect/ParameterizedType;

    .line 547
    .restart local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    const/16 v26, 0x0

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v13

    .line 548
    .restart local v13    # "keyType":Ljava/lang/reflect/Type;
    const-class v26, Ljava/lang/String;

    move-object/from16 v0, v26

    if-eq v0, v13, :cond_23

    .line 549
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    const-string v27, "@FieldMap keys must be of type String: "

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 551
    :cond_23
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v25

    .line 552
    .restart local v25    # "valueType":Ljava/lang/reflect/Type;
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    .line 553
    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v2}, Lretrofit2/Retrofit;->stringConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v23

    .line 555
    .restart local v23    # "valueConverter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lretrofit2/ServiceMethod$Builder;->gotField:Z

    .line 556
    new-instance v26, Lretrofit2/ParameterHandler$FieldMap;

    check-cast p4, Lretrofit2/http/FieldMap;

    .end local p4    # "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface/range {p4 .. p4}, Lretrofit2/http/FieldMap;->encoded()Z

    move-result v27

    move-object/from16 v0, v26

    move-object/from16 v1, v23

    move/from16 v2, v27

    invoke-direct {v0, v1, v2}, Lretrofit2/ParameterHandler$FieldMap;-><init>(Lretrofit2/Converter;Z)V

    goto/16 :goto_0

    .line 558
    .end local v13    # "keyType":Ljava/lang/reflect/Type;
    .end local v14    # "mapType":Ljava/lang/reflect/Type;
    .end local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    .end local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v23    # "valueConverter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Ljava/lang/String;>;"
    .end local v25    # "valueType":Ljava/lang/reflect/Type;
    .restart local p4    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_24
    move-object/from16 v0, p4

    instance-of v0, v0, Lretrofit2/http/Part;

    move/from16 v26, v0

    if-eqz v26, :cond_33

    .line 559
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit2/ServiceMethod$Builder;->isMultipart:Z

    move/from16 v26, v0

    if-nez v26, :cond_25

    .line 560
    const-string v26, "@Part parameters can only be used with multipart encoding."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    :cond_25
    move-object/from16 v17, p4

    .line 562
    check-cast v17, Lretrofit2/http/Part;

    .line 563
    .local v17, "part":Lretrofit2/http/Part;
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lretrofit2/ServiceMethod$Builder;->gotPart:Z

    .line 565
    invoke-interface/range {v17 .. v17}, Lretrofit2/http/Part;->value()Ljava/lang/String;

    move-result-object v19

    .line 566
    .local v19, "partName":Ljava/lang/String;
    invoke-static/range {p2 .. p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v22

    .line 567
    .restart local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->isEmpty()Z

    move-result v26

    if-eqz v26, :cond_2c

    .line 568
    const-class v26, Ljava/lang/Iterable;

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-eqz v26, :cond_28

    .line 569
    move-object/from16 v0, p2

    instance-of v0, v0, Ljava/lang/reflect/ParameterizedType;

    move/from16 v26, v0

    if-nez v26, :cond_26

    .line 570
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, " must include generic type (e.g., "

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    .line 572
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "<String>)"

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    .line 570
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    :cond_26
    move-object/from16 v16, p2

    .line 575
    check-cast v16, Ljava/lang/reflect/ParameterizedType;

    .line 576
    .restart local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    const/16 v26, 0x0

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v12

    .line 577
    .restart local v12    # "iterableType":Ljava/lang/reflect/Type;
    const-class v26, Lokhttp3/MultipartBody$Part;

    invoke-static {v12}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-nez v26, :cond_27

    .line 578
    const-string v26, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 581
    :cond_27
    sget-object v26, Lretrofit2/ParameterHandler$RawPart;->INSTANCE:Lretrofit2/ParameterHandler$RawPart;

    invoke-virtual/range {v26 .. v26}, Lretrofit2/ParameterHandler$RawPart;->iterable()Lretrofit2/ParameterHandler;

    move-result-object v26

    goto/16 :goto_0

    .line 582
    .end local v12    # "iterableType":Ljava/lang/reflect/Type;
    .end local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    :cond_28
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->isArray()Z

    move-result v26

    if-eqz v26, :cond_2a

    .line 583
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v4

    .line 584
    .restart local v4    # "arrayComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v26, Lokhttp3/MultipartBody$Part;

    move-object/from16 v0, v26

    invoke-virtual {v0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-nez v26, :cond_29

    .line 585
    const-string v26, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 588
    :cond_29
    sget-object v26, Lretrofit2/ParameterHandler$RawPart;->INSTANCE:Lretrofit2/ParameterHandler$RawPart;

    invoke-virtual/range {v26 .. v26}, Lretrofit2/ParameterHandler$RawPart;->array()Lretrofit2/ParameterHandler;

    move-result-object v26

    goto/16 :goto_0

    .line 589
    .end local v4    # "arrayComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_2a
    const-class v26, Lokhttp3/MultipartBody$Part;

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-eqz v26, :cond_2b

    .line 590
    sget-object v26, Lretrofit2/ParameterHandler$RawPart;->INSTANCE:Lretrofit2/ParameterHandler$RawPart;

    goto/16 :goto_0

    .line 592
    :cond_2b
    const-string v26, "@Part annotation must supply a name or use MultipartBody.Part parameter type."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 596
    :cond_2c
    const/16 v26, 0x4

    move/from16 v0, v26

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v26, v0

    const/16 v27, 0x0

    const-string v28, "Content-Disposition"

    aput-object v28, v26, v27

    const/16 v27, 0x1

    new-instance v28, Ljava/lang/StringBuilder;

    invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V

    const-string v29, "form-data; name=\""

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    move-object/from16 v0, v28

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    const-string v29, "\""

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    aput-object v28, v26, v27

    const/16 v27, 0x2

    const-string v28, "Content-Transfer-Encoding"

    aput-object v28, v26, v27

    const/16 v27, 0x3

    .line 598
    invoke-interface/range {v17 .. v17}, Lretrofit2/http/Part;->encoding()Ljava/lang/String;

    move-result-object v28

    aput-object v28, v26, v27

    .line 597
    invoke-static/range {v26 .. v26}, Lokhttp3/Headers;->of([Ljava/lang/String;)Lokhttp3/Headers;

    move-result-object v11

    .line 600
    .local v11, "headers":Lokhttp3/Headers;
    const-class v26, Ljava/lang/Iterable;

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-eqz v26, :cond_2f

    .line 601
    move-object/from16 v0, p2

    instance-of v0, v0, Ljava/lang/reflect/ParameterizedType;

    move/from16 v26, v0

    if-nez v26, :cond_2d

    .line 602
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, " must include generic type (e.g., "

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    .line 604
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "<String>)"

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    .line 602
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    :cond_2d
    move-object/from16 v16, p2

    .line 607
    check-cast v16, Ljava/lang/reflect/ParameterizedType;

    .line 608
    .restart local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    const/16 v26, 0x0

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v12

    .line 609
    .restart local v12    # "iterableType":Ljava/lang/reflect/Type;
    const-class v26, Lokhttp3/MultipartBody$Part;

    invoke-static {v12}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-eqz v26, :cond_2e

    .line 610
    const-string v26, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 613
    :cond_2e
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    move-object/from16 v27, v0

    .line 614
    move-object/from16 v0, v26

    move-object/from16 v1, p3

    move-object/from16 v2, v27

    invoke-virtual {v0, v12, v1, v2}, Lretrofit2/Retrofit;->requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v6

    .line 615
    .local v6, "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Lokhttp3/RequestBody;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Part;

    move-object/from16 v0, v26

    invoke-direct {v0, v11, v6}, Lretrofit2/ParameterHandler$Part;-><init>(Lokhttp3/Headers;Lretrofit2/Converter;)V

    invoke-virtual/range {v26 .. v26}, Lretrofit2/ParameterHandler$Part;->iterable()Lretrofit2/ParameterHandler;

    move-result-object v26

    goto/16 :goto_0

    .line 616
    .end local v6    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Lokhttp3/RequestBody;>;"
    .end local v12    # "iterableType":Ljava/lang/reflect/Type;
    .end local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    :cond_2f
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->isArray()Z

    move-result v26

    if-eqz v26, :cond_31

    .line 617
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Lretrofit2/ServiceMethod;->boxIfPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4

    .line 618
    .restart local v4    # "arrayComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v26, Lokhttp3/MultipartBody$Part;

    move-object/from16 v0, v26

    invoke-virtual {v0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-eqz v26, :cond_30

    .line 619
    const-string v26, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 622
    :cond_30
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    move-object/from16 v27, v0

    .line 623
    move-object/from16 v0, v26

    move-object/from16 v1, p3

    move-object/from16 v2, v27

    invoke-virtual {v0, v4, v1, v2}, Lretrofit2/Retrofit;->requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v6

    .line 624
    .restart local v6    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Lokhttp3/RequestBody;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Part;

    move-object/from16 v0, v26

    invoke-direct {v0, v11, v6}, Lretrofit2/ParameterHandler$Part;-><init>(Lokhttp3/Headers;Lretrofit2/Converter;)V

    invoke-virtual/range {v26 .. v26}, Lretrofit2/ParameterHandler$Part;->array()Lretrofit2/ParameterHandler;

    move-result-object v26

    goto/16 :goto_0

    .line 625
    .end local v4    # "arrayComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v6    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Lokhttp3/RequestBody;>;"
    :cond_31
    const-class v26, Lokhttp3/MultipartBody$Part;

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-eqz v26, :cond_32

    .line 626
    const-string v26, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 629
    :cond_32
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    move-object/from16 v27, v0

    .line 630
    move-object/from16 v0, v26

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, v27

    invoke-virtual {v0, v1, v2, v3}, Lretrofit2/Retrofit;->requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v6

    .line 631
    .restart local v6    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Lokhttp3/RequestBody;>;"
    new-instance v26, Lretrofit2/ParameterHandler$Part;

    move-object/from16 v0, v26

    invoke-direct {v0, v11, v6}, Lretrofit2/ParameterHandler$Part;-><init>(Lokhttp3/Headers;Lretrofit2/Converter;)V

    goto/16 :goto_0

    .line 635
    .end local v6    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Lokhttp3/RequestBody;>;"
    .end local v11    # "headers":Lokhttp3/Headers;
    .end local v17    # "part":Lretrofit2/http/Part;
    .end local v19    # "partName":Ljava/lang/String;
    .end local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_33
    move-object/from16 v0, p4

    instance-of v0, v0, Lretrofit2/http/PartMap;

    move/from16 v26, v0

    if-eqz v26, :cond_39

    .line 636
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit2/ServiceMethod$Builder;->isMultipart:Z

    move/from16 v26, v0

    if-nez v26, :cond_34

    .line 637
    const-string v26, "@PartMap parameters can only be used with multipart encoding."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 639
    :cond_34
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lretrofit2/ServiceMethod$Builder;->gotPart:Z

    .line 640
    invoke-static/range {p2 .. p2}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v22

    .line 641
    .restart local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v26, Ljava/util/Map;

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-nez v26, :cond_35

    .line 642
    const-string v26, "@PartMap parameter type must be Map."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 644
    :cond_35
    const-class v26, Ljava/util/Map;

    move-object/from16 v0, p2

    move-object/from16 v1, v22

    move-object/from16 v2, v26

    invoke-static {v0, v1, v2}, Lretrofit2/Utils;->getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v14

    .line 645
    .restart local v14    # "mapType":Ljava/lang/reflect/Type;
    instance-of v0, v14, Ljava/lang/reflect/ParameterizedType;

    move/from16 v26, v0

    if-nez v26, :cond_36

    .line 646
    const-string v26, "Map must include generic types (e.g., Map<String, String>)"

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    :cond_36
    move-object/from16 v16, v14

    .line 648
    check-cast v16, Ljava/lang/reflect/ParameterizedType;

    .line 650
    .restart local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    const/16 v26, 0x0

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v13

    .line 651
    .restart local v13    # "keyType":Ljava/lang/reflect/Type;
    const-class v26, Ljava/lang/String;

    move-object/from16 v0, v26

    if-eq v0, v13, :cond_37

    .line 652
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    const-string v27, "@PartMap keys must be of type String: "

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 655
    :cond_37
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lretrofit2/Utils;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v25

    .line 656
    .restart local v25    # "valueType":Ljava/lang/reflect/Type;
    const-class v26, Lokhttp3/MultipartBody$Part;

    invoke-static/range {v25 .. v25}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v26

    if-eqz v26, :cond_38

    .line 657
    const-string v26, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 661
    :cond_38
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    move-object/from16 v27, v0

    .line 662
    move-object/from16 v0, v26

    move-object/from16 v1, v25

    move-object/from16 v2, p3

    move-object/from16 v3, v27

    invoke-virtual {v0, v1, v2, v3}, Lretrofit2/Retrofit;->requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;

    move-result-object v24

    .local v24, "valueConverter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Lokhttp3/RequestBody;>;"
    move-object/from16 v18, p4

    .line 664
    check-cast v18, Lretrofit2/http/PartMap;

    .line 665
    .local v18, "partMap":Lretrofit2/http/PartMap;
    new-instance v26, Lretrofit2/ParameterHandler$PartMap;

    invoke-interface/range {v18 .. v18}, Lretrofit2/http/PartMap;->encoding()Ljava/lang/String;

    move-result-object v27

    move-object/from16 v0, v26

    move-object/from16 v1, v24

    move-object/from16 v2, v27

    invoke-direct {v0, v1, v2}, Lretrofit2/ParameterHandler$PartMap;-><init>(Lretrofit2/Converter;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 667
    .end local v13    # "keyType":Ljava/lang/reflect/Type;
    .end local v14    # "mapType":Ljava/lang/reflect/Type;
    .end local v16    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    .end local v18    # "partMap":Lretrofit2/http/PartMap;
    .end local v22    # "rawParameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v24    # "valueConverter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Lokhttp3/RequestBody;>;"
    .end local v25    # "valueType":Ljava/lang/reflect/Type;
    :cond_39
    move-object/from16 v0, p4

    instance-of v0, v0, Lretrofit2/http/Body;

    move/from16 v26, v0

    if-eqz v26, :cond_3d

    .line 668
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit2/ServiceMethod$Builder;->isFormEncoded:Z

    move/from16 v26, v0

    if-nez v26, :cond_3a

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit2/ServiceMethod$Builder;->isMultipart:Z

    move/from16 v26, v0

    if-eqz v26, :cond_3b

    .line 669
    :cond_3a
    const-string v26, "@Body parameters cannot be used with form or multi-part encoding."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 672
    :cond_3b
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit2/ServiceMethod$Builder;->gotBody:Z

    move/from16 v26, v0

    if-eqz v26, :cond_3c

    .line 673
    const-string v26, "Multiple @Body method annotations found."

    const/16 v27, 0x0

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 678
    :cond_3c
    :try_start_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->retrofit:Lretrofit2/Retrofit;

    move-object/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit2/ServiceMethod$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    move-object/from16 v27, v0

    move-object/from16 v0, v26

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, v27

    invoke-virtual {v0, v1, v2, v3}, Lretrofit2/Retrofit;->requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lretrofit2/Converter;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 683
    .restart local v6    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Lokhttp3/RequestBody;>;"
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lretrofit2/ServiceMethod$Builder;->gotBody:Z

    .line 684
    new-instance v26, Lretrofit2/ParameterHandler$Body;

    move-object/from16 v0, v26

    invoke-direct {v0, v6}, Lretrofit2/ParameterHandler$Body;-><init>(Lretrofit2/Converter;)V

    goto/16 :goto_0

    .line 679
    .end local v6    # "converter":Lretrofit2/Converter;, "Lretrofit2/Converter<*Lokhttp3/RequestBody;>;"
    :catch_0
    move-exception v7

    .line 681
    .local v7, "e":Ljava/lang/RuntimeException;
    const-string v26, "Unable to create @Body converter for %s"

    const/16 v27, 0x1

    move/from16 v0, v27

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v27, v0

    const/16 v28, 0x0

    aput-object p2, v27, v28

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v26

    move-object/from16 v3, v27

    invoke-direct {v0, v7, v1, v2, v3}, Lretrofit2/ServiceMethod$Builder;->parameterError(Ljava/lang/Throwable;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v26

    throw v26

    .line 687
    .end local v7    # "e":Ljava/lang/RuntimeException;
    :cond_3d
    const/16 v26, 0x0

    goto/16 :goto_0
.end method

.method private validatePathName(ILjava/lang/String;)V
    .locals 5
    .param p1, "p"    # I
    .param p2, "name"    # Ljava/lang/String;

    .prologue
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    const/4 v1, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 691
    sget-object v0, Lretrofit2/ServiceMethod;->PARAM_NAME_REGEX:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    .line 692
    const-string v0, "@Path parameter name must match %s. Found: %s"

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lretrofit2/ServiceMethod;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    .line 693
    invoke-virtual {v2}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    aput-object p2, v1, v4

    .line 692
    invoke-direct {p0, p1, v0, v1}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 696
    :cond_0
    iget-object v0, p0, Lretrofit2/ServiceMethod$Builder;->relativeUrlParamNames:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 697
    const-string v0, "URL \"%s\" does not contain \"{%s}\"."

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lretrofit2/ServiceMethod$Builder;->relativeUrl:Ljava/lang/String;

    aput-object v2, v1, v3

    aput-object p2, v1, v4

    invoke-direct {p0, p1, v0, v1}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 699
    :cond_1
    return-void
.end method


# virtual methods
.method public build()Lretrofit2/ServiceMethod;
    .locals 10

    .prologue
    .local p0, "this":Lretrofit2/ServiceMethod$Builder;, "Lretrofit2/ServiceMethod$Builder<TT;>;"
    const/4 v9, 0x1

    const/4 v6, 0x0

    .line 160
    invoke-direct {p0}, Lretrofit2/ServiceMethod$Builder;->createCallAdapter()Lretrofit2/CallAdapter;

    move-result-object v5

    iput-object v5, p0, Lretrofit2/ServiceMethod$Builder;->callAdapter:Lretrofit2/CallAdapter;

    .line 161
    iget-object v5, p0, Lretrofit2/ServiceMethod$Builder;->callAdapter:Lretrofit2/CallAdapter;

    invoke-interface {v5}, Lretrofit2/CallAdapter;->responseType()Ljava/lang/reflect/Type;

    move-result-object v5

    iput-object v5, p0, Lretrofit2/ServiceMethod$Builder;->responseType:Ljava/lang/reflect/Type;

    .line 162
    iget-object v5, p0, Lretrofit2/ServiceMethod$Builder;->responseType:Ljava/lang/reflect/Type;

    const-class v7, Lretrofit2/Response;

    if-eq v5, v7, :cond_0

    iget-object v5, p0, Lretrofit2/ServiceMethod$Builder;->responseType:Ljava/lang/reflect/Type;

    const-class v7, Lokhttp3/Response;

    if-ne v5, v7, :cond_1

    .line 163
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\'"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v7, p0, Lretrofit2/ServiceMethod$Builder;->responseType:Ljava/lang/reflect/Type;

    .line 164
    invoke-static {v7}, Lretrofit2/Utils;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "\' is not a valid response body type. Did you mean ResponseBody?"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v6, [Ljava/lang/Object;

    .line 163
    invoke-direct {p0, v5, v6}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v5

    throw v5

    .line 167
    :cond_1
    invoke-direct {p0}, Lretrofit2/ServiceMethod$Builder;->createResponseConverter()Lretrofit2/Converter;

    move-result-object v5

    iput-object v5, p0, Lretrofit2/ServiceMethod$Builder;->responseConverter:Lretrofit2/Converter;

    .line 169
    iget-object v7, p0, Lretrofit2/ServiceMethod$Builder;->methodAnnotations:[Ljava/lang/annotation/Annotation;

    array-length v8, v7

    move v5, v6

    :goto_0
    if-ge v5, v8, :cond_2

    aget-object v0, v7, v5

    .line 170
    .local v0, "annotation":Ljava/lang/annotation/Annotation;
    invoke-direct {p0, v0}, Lretrofit2/ServiceMethod$Builder;->parseMethodAnnotation(Ljava/lang/annotation/Annotation;)V

    .line 169
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 173
    .end local v0    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_2
    iget-object v5, p0, Lretrofit2/ServiceMethod$Builder;->httpMethod:Ljava/lang/String;

    if-nez v5, :cond_3

    .line 174
    const-string v5, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    new-array v6, v6, [Ljava/lang/Object;

    invoke-direct {p0, v5, v6}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v5

    throw v5

    .line 177
    :cond_3
    iget-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->hasBody:Z

    if-nez v5, :cond_5

    .line 178
    iget-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->isMultipart:Z

    if-eqz v5, :cond_4

    .line 179
    const-string v5, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    new-array v6, v6, [Ljava/lang/Object;

    invoke-direct {p0, v5, v6}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v5

    throw v5

    .line 182
    :cond_4
    iget-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->isFormEncoded:Z

    if-eqz v5, :cond_5

    .line 183
    const-string v5, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    new-array v6, v6, [Ljava/lang/Object;

    invoke-direct {p0, v5, v6}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v5

    throw v5

    .line 188
    :cond_5
    iget-object v5, p0, Lretrofit2/ServiceMethod$Builder;->parameterAnnotationsArray:[[Ljava/lang/annotation/Annotation;

    array-length v3, v5

    .line 189
    .local v3, "parameterCount":I
    new-array v5, v3, [Lretrofit2/ParameterHandler;

    iput-object v5, p0, Lretrofit2/ServiceMethod$Builder;->parameterHandlers:[Lretrofit2/ParameterHandler;

    .line 190
    const/4 v1, 0x0

    .local v1, "p":I
    :goto_1
    if-ge v1, v3, :cond_8

    .line 191
    iget-object v5, p0, Lretrofit2/ServiceMethod$Builder;->parameterTypes:[Ljava/lang/reflect/Type;

    aget-object v4, v5, v1

    .line 192
    .local v4, "parameterType":Ljava/lang/reflect/Type;
    invoke-static {v4}, Lretrofit2/Utils;->hasUnresolvableType(Ljava/lang/reflect/Type;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 193
    const-string v5, "Parameter type must not include a type variable or wildcard: %s"

    new-array v7, v9, [Ljava/lang/Object;

    aput-object v4, v7, v6

    invoke-direct {p0, v1, v5, v7}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v5

    throw v5

    .line 197
    :cond_6
    iget-object v5, p0, Lretrofit2/ServiceMethod$Builder;->parameterAnnotationsArray:[[Ljava/lang/annotation/Annotation;

    aget-object v2, v5, v1

    .line 198
    .local v2, "parameterAnnotations":[Ljava/lang/annotation/Annotation;
    if-nez v2, :cond_7

    .line 199
    const-string v5, "No Retrofit annotation found."

    new-array v6, v6, [Ljava/lang/Object;

    invoke-direct {p0, v1, v5, v6}, Lretrofit2/ServiceMethod$Builder;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v5

    throw v5

    .line 202
    :cond_7
    iget-object v5, p0, Lretrofit2/ServiceMethod$Builder;->parameterHandlers:[Lretrofit2/ParameterHandler;

    invoke-direct {p0, v1, v4, v2}, Lretrofit2/ServiceMethod$Builder;->parseParameter(ILjava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/ParameterHandler;

    move-result-object v7

    aput-object v7, v5, v1

    .line 190
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 205
    .end local v2    # "parameterAnnotations":[Ljava/lang/annotation/Annotation;
    .end local v4    # "parameterType":Ljava/lang/reflect/Type;
    :cond_8
    iget-object v5, p0, Lretrofit2/ServiceMethod$Builder;->relativeUrl:Ljava/lang/String;

    if-nez v5, :cond_9

    iget-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->gotUrl:Z

    if-nez v5, :cond_9

    .line 206
    const-string v5, "Missing either @%s URL or @Url parameter."

    new-array v7, v9, [Ljava/lang/Object;

    iget-object v8, p0, Lretrofit2/ServiceMethod$Builder;->httpMethod:Ljava/lang/String;

    aput-object v8, v7, v6

    invoke-direct {p0, v5, v7}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v5

    throw v5

    .line 208
    :cond_9
    iget-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->isFormEncoded:Z

    if-nez v5, :cond_a

    iget-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->isMultipart:Z

    if-nez v5, :cond_a

    iget-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->hasBody:Z

    if-nez v5, :cond_a

    iget-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->gotBody:Z

    if-eqz v5, :cond_a

    .line 209
    const-string v5, "Non-body HTTP method cannot contain @Body."

    new-array v6, v6, [Ljava/lang/Object;

    invoke-direct {p0, v5, v6}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v5

    throw v5

    .line 211
    :cond_a
    iget-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->isFormEncoded:Z

    if-eqz v5, :cond_b

    iget-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->gotField:Z

    if-nez v5, :cond_b

    .line 212
    const-string v5, "Form-encoded method must contain at least one @Field."

    new-array v6, v6, [Ljava/lang/Object;

    invoke-direct {p0, v5, v6}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v5

    throw v5

    .line 214
    :cond_b
    iget-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->isMultipart:Z

    if-eqz v5, :cond_c

    iget-boolean v5, p0, Lretrofit2/ServiceMethod$Builder;->gotPart:Z

    if-nez v5, :cond_c

    .line 215
    const-string v5, "Multipart method must contain at least one @Part."

    new-array v6, v6, [Ljava/lang/Object;

    invoke-direct {p0, v5, v6}, Lretrofit2/ServiceMethod$Builder;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v5

    throw v5

    .line 218
    :cond_c
    new-instance v5, Lretrofit2/ServiceMethod;

    invoke-direct {v5, p0}, Lretrofit2/ServiceMethod;-><init>(Lretrofit2/ServiceMethod$Builder;)V

    return-object v5
.end method
