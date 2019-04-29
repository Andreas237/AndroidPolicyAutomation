.class final Lretrofit/RestMethodInfo;
.super Ljava/lang/Object;
.source "RestMethodInfo.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/RestMethodInfo$RxSupport;,
        Lretrofit/RestMethodInfo$RequestType;,
        Lretrofit/RestMethodInfo$ResponseType;
    }
.end annotation


# static fields
.field private static final PARAM:Ljava/lang/String; = "[a-zA-Z][a-zA-Z0-9_-]*"

.field private static final PARAM_NAME_REGEX:Ljava/util/regex/Pattern;

.field private static final PARAM_URL_REGEX:Ljava/util/regex/Pattern;


# instance fields
.field contentTypeHeader:Ljava/lang/String;

.field headers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lretrofit/client/Header;",
            ">;"
        }
    .end annotation
.end field

.field final isObservable:Z

.field isStreaming:Z

.field final isSynchronous:Z

.field loaded:Z

.field final method:Ljava/lang/reflect/Method;

.field requestHasBody:Z

.field requestMethod:Ljava/lang/String;

.field requestParamAnnotations:[Ljava/lang/annotation/Annotation;

.field requestQuery:Ljava/lang/String;

.field requestType:Lretrofit/RestMethodInfo$RequestType;

.field requestUrl:Ljava/lang/String;

.field requestUrlParamNames:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field responseObjectType:Ljava/lang/reflect/Type;

.field final responseType:Lretrofit/RestMethodInfo$ResponseType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "[a-zA-Z][a-zA-Z0-9_-]*"

    .line 61
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lretrofit/RestMethodInfo;->PARAM_NAME_REGEX:Ljava/util/regex/Pattern;

    const-string v0, "\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}"

    .line 62
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lretrofit/RestMethodInfo;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    return-void
.end method

.method constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 3

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 75
    iput-boolean v0, p0, Lretrofit/RestMethodInfo;->loaded:Z

    .line 82
    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->SIMPLE:Lretrofit/RestMethodInfo$RequestType;

    iput-object v1, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    .line 96
    iput-object p1, p0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    .line 97
    invoke-direct {p0}, Lretrofit/RestMethodInfo;->parseResponseType()Lretrofit/RestMethodInfo$ResponseType;

    move-result-object p1

    iput-object p1, p0, Lretrofit/RestMethodInfo;->responseType:Lretrofit/RestMethodInfo$ResponseType;

    .line 98
    iget-object p1, p0, Lretrofit/RestMethodInfo;->responseType:Lretrofit/RestMethodInfo$ResponseType;

    sget-object v1, Lretrofit/RestMethodInfo$ResponseType;->OBJECT:Lretrofit/RestMethodInfo$ResponseType;

    const/4 v2, 0x1

    if-ne p1, v1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    iput-boolean p1, p0, Lretrofit/RestMethodInfo;->isSynchronous:Z

    .line 99
    iget-object p1, p0, Lretrofit/RestMethodInfo;->responseType:Lretrofit/RestMethodInfo$ResponseType;

    sget-object v1, Lretrofit/RestMethodInfo$ResponseType;->OBSERVABLE:Lretrofit/RestMethodInfo$ResponseType;

    if-ne p1, v1, :cond_1

    move v0, v2

    :cond_1
    iput-boolean v0, p0, Lretrofit/RestMethodInfo;->isObservable:Z

    return-void
.end method

.method private static getParameterUpperBound(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;
    .locals 4

    .line 296
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    .line 297
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 298
    aget-object v2, p0, v1

    .line 299
    instance-of v3, v2, Ljava/lang/reflect/WildcardType;

    if-eqz v3, :cond_0

    .line 300
    check-cast v2, Ljava/lang/reflect/WildcardType;

    invoke-interface {v2}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v2

    aget-object v2, v2, v0

    aput-object v2, p0, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 303
    :cond_1
    aget-object p0, p0, v0

    return-object p0
.end method

.method private varargs methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;
    .locals 2

    .line 103
    array-length v0, p2

    if-lez v0, :cond_0

    .line 104
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 106
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    .line 107
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object p2
.end method

.method private varargs parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;
    .locals 1

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " (parameter #"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    return-object p1
.end method

.method private parseMethodAnnotations()V
    .locals 13

    .line 125
    iget-object v0, p0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    const/4 v1, 0x0

    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_c

    aget-object v4, v0, v3

    .line 126
    invoke-interface {v4}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v5

    const/4 v6, 0x0

    .line 130
    invoke-virtual {v5}, Ljava/lang/Class;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v7

    array-length v8, v7

    move v9, v1

    :goto_1
    if-ge v9, v8, :cond_1

    aget-object v10, v7, v9

    .line 131
    const-class v11, Lretrofit/http/RestMethod;

    invoke-interface {v10}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v12

    if-ne v11, v12, :cond_0

    .line 132
    move-object v6, v10

    check-cast v6, Lretrofit/http/RestMethod;

    goto :goto_2

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v6, :cond_3

    .line 138
    iget-object v9, p0, Lretrofit/RestMethodInfo;->requestMethod:Ljava/lang/String;

    if-eqz v9, :cond_2

    const-string v0, "Only one HTTP method is allowed. Found: %s and %s."

    .line 139
    new-array v2, v7, [Ljava/lang/Object;

    iget-object v3, p0, Lretrofit/RestMethodInfo;->requestMethod:Ljava/lang/String;

    aput-object v3, v2, v1

    .line 140
    invoke-interface {v6}, Lretrofit/http/RestMethod;->value()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v8

    .line 139
    invoke-direct {p0, v0, v2}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_2
    :try_start_0
    const-string v7, "value"

    .line 144
    new-array v9, v1, [Ljava/lang/Class;

    invoke-virtual {v5, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    new-array v9, v1, [Ljava/lang/Object;

    invoke-virtual {v7, v4, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    invoke-direct {p0, v4}, Lretrofit/RestMethodInfo;->parsePath(Ljava/lang/String;)V

    .line 150
    invoke-interface {v6}, Lretrofit/http/RestMethod;->value()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lretrofit/RestMethodInfo;->requestMethod:Ljava/lang/String;

    .line 151
    invoke-interface {v6}, Lretrofit/http/RestMethod;->hasBody()Z

    move-result v4

    iput-boolean v4, p0, Lretrofit/RestMethodInfo;->requestHasBody:Z

    goto/16 :goto_3

    :catch_0
    const-string v0, "Failed to extract String \'value\' from @%s annotation."

    .line 146
    new-array v2, v8, [Ljava/lang/Object;

    .line 147
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    .line 146
    invoke-direct {p0, v0, v2}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 152
    :cond_3
    const-class v6, Lretrofit/http/Headers;

    if-ne v5, v6, :cond_5

    .line 153
    check-cast v4, Lretrofit/http/Headers;

    invoke-interface {v4}, Lretrofit/http/Headers;->value()[Ljava/lang/String;

    move-result-object v4

    .line 154
    array-length v5, v4

    if-nez v5, :cond_4

    const-string v0, "@Headers annotation is empty."

    .line 155
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 157
    :cond_4
    invoke-virtual {p0, v4}, Lretrofit/RestMethodInfo;->parseHeaders([Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Lretrofit/RestMethodInfo;->headers:Ljava/util/List;

    goto :goto_3

    .line 158
    :cond_5
    const-class v4, Lretrofit/http/Multipart;

    if-ne v5, v4, :cond_7

    .line 159
    iget-object v4, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v5, Lretrofit/RestMethodInfo$RequestType;->SIMPLE:Lretrofit/RestMethodInfo$RequestType;

    if-eq v4, v5, :cond_6

    const-string v0, "Only one encoding annotation is allowed."

    .line 160
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 162
    :cond_6
    sget-object v4, Lretrofit/RestMethodInfo$RequestType;->MULTIPART:Lretrofit/RestMethodInfo$RequestType;

    iput-object v4, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    goto :goto_3

    .line 163
    :cond_7
    const-class v4, Lretrofit/http/FormUrlEncoded;

    if-ne v5, v4, :cond_9

    .line 164
    iget-object v4, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v5, Lretrofit/RestMethodInfo$RequestType;->SIMPLE:Lretrofit/RestMethodInfo$RequestType;

    if-eq v4, v5, :cond_8

    const-string v0, "Only one encoding annotation is allowed."

    .line 165
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 167
    :cond_8
    sget-object v4, Lretrofit/RestMethodInfo$RequestType;->FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

    iput-object v4, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    goto :goto_3

    .line 168
    :cond_9
    const-class v4, Lretrofit/http/Streaming;

    if-ne v5, v4, :cond_b

    .line 169
    iget-object v4, p0, Lretrofit/RestMethodInfo;->responseObjectType:Ljava/lang/reflect/Type;

    const-class v5, Lretrofit/client/Response;

    if-eq v4, v5, :cond_a

    const-string v0, "Only methods having %s as data type are allowed to have @%s annotation."

    .line 170
    new-array v2, v7, [Ljava/lang/Object;

    const-class v3, Lretrofit/client/Response;

    .line 172
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    const-class v1, Lretrofit/http/Streaming;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v8

    .line 170
    invoke-direct {p0, v0, v2}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 174
    :cond_a
    iput-boolean v8, p0, Lretrofit/RestMethodInfo;->isStreaming:Z

    :cond_b
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 178
    :cond_c
    iget-object v0, p0, Lretrofit/RestMethodInfo;->requestMethod:Ljava/lang/String;

    if-nez v0, :cond_d

    const-string v0, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    .line 179
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 181
    :cond_d
    iget-boolean v0, p0, Lretrofit/RestMethodInfo;->requestHasBody:Z

    if-nez v0, :cond_f

    .line 182
    iget-object v0, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v2, Lretrofit/RestMethodInfo$RequestType;->MULTIPART:Lretrofit/RestMethodInfo$RequestType;

    if-ne v0, v2, :cond_e

    const-string v0, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    .line 183
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 186
    :cond_e
    iget-object v0, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v2, Lretrofit/RestMethodInfo$RequestType;->FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

    if-ne v0, v2, :cond_f

    const-string v0, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    .line 187
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_f
    return-void
.end method

.method private parseParameters()V
    .locals 18

    move-object/from16 v0, p0

    .line 310
    iget-object v1, v0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    .line 312
    iget-object v2, v0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v2

    .line 313
    array-length v3, v2

    .line 314
    iget-boolean v4, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez v4, :cond_0

    iget-boolean v4, v0, Lretrofit/RestMethodInfo;->isObservable:Z

    if-nez v4, :cond_0

    add-int/lit8 v3, v3, -0x1

    .line 318
    :cond_0
    new-array v4, v3, [Ljava/lang/annotation/Annotation;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    if-ge v6, v3, :cond_18

    .line 325
    aget-object v10, v1, v6

    .line 326
    aget-object v11, v2, v6

    if-eqz v11, :cond_16

    .line 328
    array-length v12, v11

    move v13, v9

    move v9, v8

    move v8, v7

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v12, :cond_15

    aget-object v14, v11, v7

    .line 330
    invoke-interface {v14}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v15

    .line 332
    const-class v5, Lretrofit/http/Path;

    const/16 v16, 0x1

    if-ne v15, v5, :cond_1

    .line 333
    move-object v5, v14

    check-cast v5, Lretrofit/http/Path;

    invoke-interface {v5}, Lretrofit/http/Path;->value()Ljava/lang/String;

    move-result-object v5

    .line 334
    invoke-direct {v0, v6, v5}, Lretrofit/RestMethodInfo;->validatePathName(ILjava/lang/String;)V

    goto :goto_2

    .line 335
    :cond_1
    const-class v5, Lretrofit/http/EncodedPath;

    if-ne v15, v5, :cond_2

    .line 336
    move-object v5, v14

    check-cast v5, Lretrofit/http/EncodedPath;

    invoke-interface {v5}, Lretrofit/http/EncodedPath;->value()Ljava/lang/String;

    move-result-object v5

    .line 337
    invoke-direct {v0, v6, v5}, Lretrofit/RestMethodInfo;->validatePathName(ILjava/lang/String;)V

    goto :goto_2

    .line 338
    :cond_2
    const-class v5, Lretrofit/http/Query;

    if-ne v15, v5, :cond_3

    goto :goto_2

    .line 340
    :cond_3
    const-class v5, Lretrofit/http/EncodedQuery;

    if-ne v15, v5, :cond_4

    goto :goto_2

    .line 342
    :cond_4
    const-class v5, Lretrofit/http/QueryMap;

    if-ne v15, v5, :cond_5

    .line 343
    const-class v5, Ljava/util/Map;

    invoke-virtual {v5, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_7

    const-string v1, "@QueryMap parameter type must be Map."

    const/4 v5, 0x0

    .line 344
    new-array v2, v5, [Ljava/lang/Object;

    invoke-direct {v0, v6, v1, v2}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    .line 347
    :cond_5
    const-class v5, Lretrofit/http/EncodedQueryMap;

    if-ne v15, v5, :cond_6

    .line 348
    const-class v5, Ljava/util/Map;

    invoke-virtual {v5, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_7

    const-string v1, "@EncodedQueryMap parameter type must be Map."

    const/4 v2, 0x0

    .line 349
    new-array v2, v2, [Ljava/lang/Object;

    invoke-direct {v0, v6, v1, v2}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    .line 352
    :cond_6
    const-class v5, Lretrofit/http/Header;

    if-ne v15, v5, :cond_8

    :cond_7
    :goto_2
    move-object/from16 v17, v1

    goto/16 :goto_3

    .line 354
    :cond_8
    const-class v5, Lretrofit/http/Field;

    if-ne v15, v5, :cond_a

    .line 355
    iget-object v5, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v9, Lretrofit/RestMethodInfo$RequestType;->FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

    if-eq v5, v9, :cond_9

    const-string v1, "@Field parameters can only be used with form encoding."

    const/4 v5, 0x0

    .line 356
    new-array v2, v5, [Ljava/lang/Object;

    invoke-direct {v0, v6, v1, v2}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    :cond_9
    move-object/from16 v17, v1

    move/from16 v9, v16

    goto/16 :goto_3

    .line 360
    :cond_a
    const-class v5, Lretrofit/http/FieldMap;

    if-ne v15, v5, :cond_c

    .line 361
    iget-object v5, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v9, Lretrofit/RestMethodInfo$RequestType;->FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

    if-eq v5, v9, :cond_b

    const-string v1, "@FieldMap parameters can only be used with form encoding."

    const/4 v5, 0x0

    .line 362
    new-array v2, v5, [Ljava/lang/Object;

    invoke-direct {v0, v6, v1, v2}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    :cond_b
    const/4 v5, 0x0

    .line 364
    const-class v9, Ljava/util/Map;

    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-nez v9, :cond_9

    const-string v1, "@FieldMap parameter type must be Map."

    .line 365
    new-array v2, v5, [Ljava/lang/Object;

    invoke-direct {v0, v6, v1, v2}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    .line 369
    :cond_c
    const-class v5, Lretrofit/http/Part;

    if-ne v15, v5, :cond_e

    .line 370
    iget-object v5, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v13, Lretrofit/RestMethodInfo$RequestType;->MULTIPART:Lretrofit/RestMethodInfo$RequestType;

    if-eq v5, v13, :cond_d

    const-string v1, "@Part parameters can only be used with multipart encoding."

    const/4 v5, 0x0

    .line 371
    new-array v2, v5, [Ljava/lang/Object;

    invoke-direct {v0, v6, v1, v2}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    :cond_d
    move-object/from16 v17, v1

    move/from16 v13, v16

    goto :goto_3

    .line 375
    :cond_e
    const-class v5, Lretrofit/http/PartMap;

    if-ne v15, v5, :cond_10

    .line 376
    iget-object v5, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v13, Lretrofit/RestMethodInfo$RequestType;->MULTIPART:Lretrofit/RestMethodInfo$RequestType;

    if-eq v5, v13, :cond_f

    const-string v1, "@PartMap parameters can only be used with multipart encoding."

    const/4 v5, 0x0

    .line 377
    new-array v2, v5, [Ljava/lang/Object;

    invoke-direct {v0, v6, v1, v2}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    :cond_f
    const/4 v5, 0x0

    .line 380
    const-class v13, Ljava/util/Map;

    invoke-virtual {v13, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v13

    if-nez v13, :cond_d

    const-string v1, "@PartMap parameter type must be Map."

    .line 381
    new-array v2, v5, [Ljava/lang/Object;

    invoke-direct {v0, v6, v1, v2}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    .line 385
    :cond_10
    const-class v5, Lretrofit/http/Body;

    if-ne v15, v5, :cond_14

    .line 386
    iget-object v5, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    move-object/from16 v17, v1

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->SIMPLE:Lretrofit/RestMethodInfo$RequestType;

    if-eq v5, v1, :cond_11

    const-string v1, "@Body parameters cannot be used with form or multi-part encoding."

    const/4 v5, 0x0

    .line 387
    new-array v2, v5, [Ljava/lang/Object;

    invoke-direct {v0, v6, v1, v2}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    :cond_11
    const/4 v5, 0x0

    if-eqz v8, :cond_12

    const-string v1, "Multiple @Body method annotations found."

    .line 391
    new-array v2, v5, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    :cond_12
    move/from16 v8, v16

    .line 400
    :goto_3
    aget-object v1, v4, v6

    if-eqz v1, :cond_13

    const-string v1, "Multiple Retrofit annotations found, only one allowed: @%s, @%s."

    const/4 v2, 0x2

    .line 401
    new-array v2, v2, [Ljava/lang/Object;

    aget-object v3, v4, v6

    .line 403
    invoke-interface {v3}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 404
    invoke-virtual {v15}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v16

    .line 401
    invoke-direct {v0, v6, v1, v2}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    .line 406
    :cond_13
    aput-object v14, v4, v6

    goto :goto_4

    :cond_14
    move-object/from16 v17, v1

    :goto_4
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, v17

    goto/16 :goto_1

    :cond_15
    move-object/from16 v17, v1

    move v7, v8

    move v8, v9

    move v9, v13

    goto :goto_5

    :cond_16
    move-object/from16 v17, v1

    .line 410
    :goto_5
    aget-object v1, v4, v6

    if-nez v1, :cond_17

    const-string v1, "No Retrofit annotation found."

    const/4 v2, 0x0

    .line 411
    new-array v2, v2, [Ljava/lang/Object;

    invoke-direct {v0, v6, v1, v2}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    :cond_17
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, v17

    goto/16 :goto_0

    .line 415
    :cond_18
    iget-object v1, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v2, Lretrofit/RestMethodInfo$RequestType;->SIMPLE:Lretrofit/RestMethodInfo$RequestType;

    if-ne v1, v2, :cond_19

    iget-boolean v1, v0, Lretrofit/RestMethodInfo;->requestHasBody:Z

    if-nez v1, :cond_19

    if-eqz v7, :cond_19

    const-string v1, "Non-body HTTP method cannot contain @Body or @TypedOutput."

    const/4 v2, 0x0

    .line 416
    new-array v2, v2, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    :cond_19
    const/4 v2, 0x0

    .line 418
    iget-object v1, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v3, Lretrofit/RestMethodInfo$RequestType;->FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

    if-ne v1, v3, :cond_1a

    if-nez v8, :cond_1a

    const-string v1, "Form-encoded method must contain at least one @Field."

    .line 419
    new-array v2, v2, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    .line 421
    :cond_1a
    iget-object v1, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v3, Lretrofit/RestMethodInfo$RequestType;->MULTIPART:Lretrofit/RestMethodInfo$RequestType;

    if-ne v1, v3, :cond_1b

    if-nez v9, :cond_1b

    const-string v1, "Multipart method must contain at least one @Part."

    .line 422
    new-array v2, v2, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1

    .line 425
    :cond_1b
    iput-object v4, v0, Lretrofit/RestMethodInfo;->requestParamAnnotations:[Ljava/lang/annotation/Annotation;

    return-void
.end method

.method private parsePath(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 195
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2f

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const/16 v3, 0x3f

    .line 202
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    .line 203
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v0

    if-ge v3, v4, :cond_1

    .line 204
    invoke-virtual {p1, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/2addr v3, v0

    .line 205
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 208
    sget-object v4, Lretrofit/RestMethodInfo;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 209
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_2

    const-string p1, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query."

    .line 210
    new-array v0, v0, [Ljava/lang/Object;

    aput-object v3, v0, v1

    invoke-direct {p0, p1, v0}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_1
    move-object v3, v2

    move-object v2, p1

    .line 215
    :cond_2
    invoke-static {p1}, Lretrofit/RestMethodInfo;->parsePathParameters(Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    .line 217
    iput-object v2, p0, Lretrofit/RestMethodInfo;->requestUrl:Ljava/lang/String;

    .line 218
    iput-object p1, p0, Lretrofit/RestMethodInfo;->requestUrlParamNames:Ljava/util/Set;

    .line 219
    iput-object v3, p0, Lretrofit/RestMethodInfo;->requestQuery:Ljava/lang/String;

    return-void

    :cond_3
    :goto_0
    const-string v2, "URL path \"%s\" must start with \'/\'."

    .line 196
    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    invoke-direct {p0, v2, v0}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method static parsePathParameters(Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 444
    sget-object v0, Lretrofit/RestMethodInfo;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 445
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 446
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 447
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private parseResponseType()Lretrofit/RestMethodInfo$ResponseType;
    .locals 7

    .line 245
    iget-object v0, p0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 250
    iget-object v1, p0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 251
    array-length v4, v1

    if-lez v4, :cond_1

    .line 252
    array-length v4, v1

    sub-int/2addr v4, v3

    aget-object v1, v1, v4

    .line 254
    instance-of v4, v1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v4, :cond_0

    .line 255
    move-object v4, v1

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v1

    .line 257
    :goto_0
    instance-of v5, v4, Ljava/lang/Class;

    if-eqz v5, :cond_2

    .line 258
    move-object v2, v4

    check-cast v2, Ljava/lang/Class;

    goto :goto_1

    :cond_1
    move-object v1, v2

    .line 262
    :cond_2
    :goto_1
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x0

    if-eq v0, v4, :cond_3

    move v4, v3

    goto :goto_2

    :cond_3
    move v4, v5

    :goto_2
    if-eqz v2, :cond_4

    .line 263
    const-class v6, Lretrofit/Callback;

    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    move v3, v5

    :goto_3
    if-eqz v4, :cond_5

    if-eqz v3, :cond_5

    const-string v0, "Must have return type or Callback as last argument, not both."

    .line 267
    new-array v1, v5, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_5
    if-nez v4, :cond_6

    if-nez v3, :cond_6

    const-string v0, "Must have either a return type or Callback as last argument."

    .line 270
    new-array v1, v5, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_6
    if-eqz v4, :cond_8

    .line 274
    sget-boolean v1, Lretrofit/Platform;->HAS_RX_JAVA:Z

    if-eqz v1, :cond_7

    .line 275
    invoke-static {v0}, Lretrofit/Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    .line 276
    invoke-static {v1}, Lretrofit/RestMethodInfo$RxSupport;->isObservable(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 277
    invoke-static {v0, v1}, Lretrofit/RestMethodInfo$RxSupport;->getObservableType(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 278
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v0}, Lretrofit/RestMethodInfo;->getParameterUpperBound(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestMethodInfo;->responseObjectType:Ljava/lang/reflect/Type;

    .line 279
    sget-object v0, Lretrofit/RestMethodInfo$ResponseType;->OBSERVABLE:Lretrofit/RestMethodInfo$ResponseType;

    return-object v0

    .line 282
    :cond_7
    iput-object v0, p0, Lretrofit/RestMethodInfo;->responseObjectType:Ljava/lang/reflect/Type;

    .line 283
    sget-object v0, Lretrofit/RestMethodInfo$ResponseType;->OBJECT:Lretrofit/RestMethodInfo$ResponseType;

    return-object v0

    .line 286
    :cond_8
    invoke-static {v1}, Lretrofit/Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v2, Lretrofit/Callback;

    invoke-static {v1, v0, v2}, Lretrofit/Types;->getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 287
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_9

    .line 288
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v0}, Lretrofit/RestMethodInfo;->getParameterUpperBound(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestMethodInfo;->responseObjectType:Ljava/lang/reflect/Type;

    .line 289
    sget-object v0, Lretrofit/RestMethodInfo$ResponseType;->VOID:Lretrofit/RestMethodInfo$ResponseType;

    return-object v0

    :cond_9
    const-string v0, "Last parameter must be of type Callback<X> or Callback<? super X>."

    .line 292
    new-array v1, v5, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0
.end method

.method private validatePathName(ILjava/lang/String;)V
    .locals 5

    .line 429
    sget-object v0, Lretrofit/RestMethodInfo;->PARAM_NAME_REGEX:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-nez v0, :cond_0

    const-string v0, "@Path parameter name must match %s. Found: %s"

    .line 430
    new-array v3, v3, [Ljava/lang/Object;

    sget-object v4, Lretrofit/RestMethodInfo;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    .line 431
    invoke-virtual {v4}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    aput-object p2, v3, v1

    .line 430
    invoke-direct {p0, p1, v0, v3}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    .line 434
    :cond_0
    iget-object v0, p0, Lretrofit/RestMethodInfo;->requestUrlParamNames:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "URL \"%s\" does not contain \"{%s}\"."

    .line 435
    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lretrofit/RestMethodInfo;->requestUrl:Ljava/lang/String;

    aput-object v4, v3, v2

    aput-object p2, v3, v1

    invoke-direct {p0, p1, v0, v3}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_1
    return-void
.end method


# virtual methods
.method declared-synchronized init()V
    .locals 1

    monitor-enter p0

    .line 115
    :try_start_0
    iget-boolean v0, p0, Lretrofit/RestMethodInfo;->loaded:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 117
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lretrofit/RestMethodInfo;->parseMethodAnnotations()V

    .line 118
    invoke-direct {p0}, Lretrofit/RestMethodInfo;->parseParameters()V

    const/4 v0, 0x1

    .line 120
    iput-boolean v0, p0, Lretrofit/RestMethodInfo;->loaded:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 114
    monitor-exit p0

    throw v0
.end method

.method parseHeaders([Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lretrofit/client/Header;",
            ">;"
        }
    .end annotation

    .line 223
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 224
    array-length v2, p1

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, p1, v3

    const/16 v5, 0x3a

    .line 225
    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v6, -0x1

    const/4 v7, 0x1

    if-eq v5, v6, :cond_2

    if-eqz v5, :cond_2

    .line 226
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v7

    if-ne v5, v6, :cond_0

    goto :goto_2

    .line 230
    :cond_0
    invoke-virtual {v4, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    .line 231
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Content-Type"

    .line 232
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 233
    iput-object v4, p0, Lretrofit/RestMethodInfo;->contentTypeHeader:Ljava/lang/String;

    goto :goto_1

    .line 235
    :cond_1
    new-instance v5, Lretrofit/client/Header;

    invoke-direct {v5, v6, v4}, Lretrofit/client/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    const-string p1, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    .line 227
    new-array v0, v7, [Ljava/lang/Object;

    aput-object v4, v0, v1

    invoke-direct {p0, p1, v0}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :cond_3
    return-object v0
.end method
