.class final Lretrofit/RestMethodInfo;
.super Ljava/lang/Object;
.source "SourceFile"


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
            "Ljava/util/List<Lretrofit/client/Header;>;"
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
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field responseObjectType:Ljava/lang/reflect/Type;

.field final responseType:Lretrofit/RestMethodInfo$ResponseType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    const-string v0, "[a-zA-Z][a-zA-Z0-9_-]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lretrofit/RestMethodInfo;->PARAM_NAME_REGEX:Ljava/util/regex/Pattern;

    .line 62
    const-string v0, "\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lretrofit/RestMethodInfo;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    return-void
.end method

.method constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 2

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lretrofit/RestMethodInfo;->loaded:Z

    .line 82
    sget-object v0, Lretrofit/RestMethodInfo$RequestType;->SIMPLE:Lretrofit/RestMethodInfo$RequestType;

    iput-object v0, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    .line 96
    iput-object p1, p0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    .line 97
    invoke-direct {p0}, Lretrofit/RestMethodInfo;->parseResponseType()Lretrofit/RestMethodInfo$ResponseType;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestMethodInfo;->responseType:Lretrofit/RestMethodInfo$ResponseType;

    .line 98
    iget-object v0, p0, Lretrofit/RestMethodInfo;->responseType:Lretrofit/RestMethodInfo$ResponseType;

    sget-object v1, Lretrofit/RestMethodInfo$ResponseType;->OBJECT:Lretrofit/RestMethodInfo$ResponseType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lretrofit/RestMethodInfo;->isSynchronous:Z

    .line 99
    iget-object v0, p0, Lretrofit/RestMethodInfo;->responseType:Lretrofit/RestMethodInfo$ResponseType;

    sget-object v1, Lretrofit/RestMethodInfo$ResponseType;->OBSERVABLE:Lretrofit/RestMethodInfo$ResponseType;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lretrofit/RestMethodInfo;->isObservable:Z

    .line 100
    return-void
.end method

.method private static getParameterUpperBound(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;
    .locals 5

    .line 296
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v2

    .line 297
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_1

    .line 298
    aget-object v4, v2, v3

    .line 299
    instance-of v0, v4, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_0

    .line 300
    move-object v0, v4

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    aput-object v0, v2, v3

    .line 297
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 303
    :cond_1
    const/4 v0, 0x0

    aget-object v0, v2, v0

    return-object v0
.end method

.method private varargs methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;
    .locals 3

    .line 103
    array-length v0, p2

    if-lez v0, :cond_0

    .line 104
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 106
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    .line 107
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private varargs parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;
    .locals 2

    .line 111
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

    invoke-direct {p0, v0, p3}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    return-object v0
.end method

.method private parseMethodAnnotations()V
    .locals 14

    .line 125
    iget-object v0, p0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_c

    aget-object v7, v4, v6

    .line 126
    invoke-interface {v7}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v8

    .line 127
    const/4 v9, 0x0

    .line 130
    invoke-virtual {v8}, Ljava/lang/Class;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v10

    array-length v11, v10

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_1

    aget-object v13, v10, v12

    .line 131
    const-class v0, Lretrofit/http/RestMethod;

    invoke-interface {v13}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 132
    move-object v9, v13

    check-cast v9, Lretrofit/http/RestMethod;

    .line 133
    goto :goto_2

    .line 130
    :cond_0
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 137
    :cond_1
    :goto_2
    if-eqz v9, :cond_3

    .line 138
    iget-object v0, p0, Lretrofit/RestMethodInfo;->requestMethod:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 139
    const-string v0, "Only one HTTP method is allowed. Found: %s and %s."

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lretrofit/RestMethodInfo;->requestMethod:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 140
    invoke-interface {v9}, Lretrofit/http/RestMethod;->value()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 139
    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 144
    :cond_2
    const-string v0, "value"

    const/4 v1, 0x0

    :try_start_0
    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {v8, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v7, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    goto :goto_3

    .line 145
    :catch_0
    move-exception v11

    .line 146
    const-string v0, "Failed to extract String \'value\' from @%s annotation."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 147
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 146
    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 149
    :goto_3
    invoke-direct {p0, v10}, Lretrofit/RestMethodInfo;->parsePath(Ljava/lang/String;)V

    .line 150
    invoke-interface {v9}, Lretrofit/http/RestMethod;->value()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestMethodInfo;->requestMethod:Ljava/lang/String;

    .line 151
    invoke-interface {v9}, Lretrofit/http/RestMethod;->hasBody()Z

    move-result v0

    iput-boolean v0, p0, Lretrofit/RestMethodInfo;->requestHasBody:Z

    .line 152
    goto/16 :goto_4

    :cond_3
    const-class v0, Lretrofit/http/Headers;

    if-ne v8, v0, :cond_5

    .line 153
    move-object v0, v7

    check-cast v0, Lretrofit/http/Headers;

    invoke-interface {v0}, Lretrofit/http/Headers;->value()[Ljava/lang/String;

    move-result-object v10

    .line 154
    array-length v0, v10

    if-nez v0, :cond_4

    .line 155
    const-string v0, "@Headers annotation is empty."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 157
    :cond_4
    invoke-virtual {p0, v10}, Lretrofit/RestMethodInfo;->parseHeaders([Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestMethodInfo;->headers:Ljava/util/List;

    .line 158
    goto :goto_4

    :cond_5
    const-class v0, Lretrofit/http/Multipart;

    if-ne v8, v0, :cond_7

    .line 159
    iget-object v0, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->SIMPLE:Lretrofit/RestMethodInfo$RequestType;

    if-eq v0, v1, :cond_6

    .line 160
    const-string v0, "Only one encoding annotation is allowed."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 162
    :cond_6
    sget-object v0, Lretrofit/RestMethodInfo$RequestType;->MULTIPART:Lretrofit/RestMethodInfo$RequestType;

    iput-object v0, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    goto :goto_4

    .line 163
    :cond_7
    const-class v0, Lretrofit/http/FormUrlEncoded;

    if-ne v8, v0, :cond_9

    .line 164
    iget-object v0, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->SIMPLE:Lretrofit/RestMethodInfo$RequestType;

    if-eq v0, v1, :cond_8

    .line 165
    const-string v0, "Only one encoding annotation is allowed."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 167
    :cond_8
    sget-object v0, Lretrofit/RestMethodInfo$RequestType;->FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

    iput-object v0, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    goto :goto_4

    .line 168
    :cond_9
    const-class v0, Lretrofit/http/Streaming;

    if-ne v8, v0, :cond_b

    .line 169
    iget-object v0, p0, Lretrofit/RestMethodInfo;->responseObjectType:Ljava/lang/reflect/Type;

    const-class v1, Lretrofit/client/Response;

    if-eq v0, v1, :cond_a

    .line 170
    const-string v0, "Only methods having %s as data type are allowed to have @%s annotation."

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-class v2, Lretrofit/client/Response;

    .line 172
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lretrofit/http/Streaming;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 170
    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 174
    :cond_a
    const/4 v0, 0x1

    iput-boolean v0, p0, Lretrofit/RestMethodInfo;->isStreaming:Z

    .line 125
    :cond_b
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 178
    :cond_c
    iget-object v0, p0, Lretrofit/RestMethodInfo;->requestMethod:Ljava/lang/String;

    if-nez v0, :cond_d

    .line 179
    const-string v0, "HTTP method annotation is required (e.g., @GET, @POST, etc.)."

    const/4 v1, 0x0

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

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->MULTIPART:Lretrofit/RestMethodInfo$RequestType;

    if-ne v0, v1, :cond_e

    .line 183
    const-string v0, "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 186
    :cond_e
    iget-object v0, p0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

    if-ne v0, v1, :cond_f

    .line 187
    const-string v0, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 191
    :cond_f
    return-void
.end method

.method private parseParameters()V
    .locals 20

    .line 310
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    .line 312
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v5

    .line 313
    array-length v6, v5

    .line 314
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isSynchronous:Z

    if-nez v0, :cond_0

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->isObservable:Z

    if-nez v0, :cond_0

    .line 315
    add-int/lit8 v6, v6, -0x1

    .line 318
    :cond_0
    new-array v7, v6, [Ljava/lang/annotation/Annotation;

    .line 320
    const/4 v8, 0x0

    .line 321
    const/4 v9, 0x0

    .line 322
    const/4 v10, 0x0

    .line 324
    const/4 v11, 0x0

    :goto_0
    if-ge v11, v6, :cond_19

    .line 325
    aget-object v12, v4, v11

    .line 326
    aget-object v13, v5, v11

    .line 327
    if-eqz v13, :cond_17

    .line 328
    move-object v14, v13

    array-length v15, v14

    const/16 v16, 0x0

    :goto_1
    move/from16 v0, v16

    if-ge v0, v15, :cond_17

    aget-object v17, v14, v16

    .line 329
    .line 330
    invoke-interface/range {v17 .. v17}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v18

    .line 332
    const-class v0, Lretrofit/http/Path;

    move-object/from16 v1, v18

    if-ne v1, v0, :cond_1

    .line 333
    move-object/from16 v0, v17

    check-cast v0, Lretrofit/http/Path;

    invoke-interface {v0}, Lretrofit/http/Path;->value()Ljava/lang/String;

    move-result-object v19

    .line 334
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    invoke-direct {v0, v11, v1}, Lretrofit/RestMethodInfo;->validatePathName(ILjava/lang/String;)V

    .line 335
    goto/16 :goto_2

    :cond_1
    const-class v0, Lretrofit/http/EncodedPath;

    move-object/from16 v1, v18

    if-ne v1, v0, :cond_2

    .line 336
    move-object/from16 v0, v17

    check-cast v0, Lretrofit/http/EncodedPath;

    invoke-interface {v0}, Lretrofit/http/EncodedPath;->value()Ljava/lang/String;

    move-result-object v19

    .line 337
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    invoke-direct {v0, v11, v1}, Lretrofit/RestMethodInfo;->validatePathName(ILjava/lang/String;)V

    .line 338
    goto/16 :goto_2

    :cond_2
    const-class v0, Lretrofit/http/Query;

    move-object/from16 v1, v18

    if-ne v1, v0, :cond_3

    goto/16 :goto_2

    .line 340
    :cond_3
    const-class v0, Lretrofit/http/EncodedQuery;

    move-object/from16 v1, v18

    if-ne v1, v0, :cond_4

    goto/16 :goto_2

    .line 342
    :cond_4
    const-class v0, Lretrofit/http/QueryMap;

    move-object/from16 v1, v18

    if-ne v1, v0, :cond_5

    .line 343
    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_14

    .line 344
    const-string v0, "@QueryMap parameter type must be Map."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v11, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 347
    :cond_5
    const-class v0, Lretrofit/http/EncodedQueryMap;

    move-object/from16 v1, v18

    if-ne v1, v0, :cond_6

    .line 348
    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_14

    .line 349
    const-string v0, "@EncodedQueryMap parameter type must be Map."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v11, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 352
    :cond_6
    const-class v0, Lretrofit/http/Header;

    move-object/from16 v1, v18

    if-ne v1, v0, :cond_7

    goto/16 :goto_2

    .line 354
    :cond_7
    const-class v0, Lretrofit/http/Field;

    move-object/from16 v1, v18

    if-ne v1, v0, :cond_9

    .line 355
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

    if-eq v0, v1, :cond_8

    .line 356
    const-string v0, "@Field parameters can only be used with form encoding."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v11, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 359
    :cond_8
    const/4 v8, 0x1

    goto/16 :goto_2

    .line 360
    :cond_9
    const-class v0, Lretrofit/http/FieldMap;

    move-object/from16 v1, v18

    if-ne v1, v0, :cond_c

    .line 361
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

    if-eq v0, v1, :cond_a

    .line 362
    const-string v0, "@FieldMap parameters can only be used with form encoding."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v11, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 364
    :cond_a
    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 365
    const-string v0, "@FieldMap parameter type must be Map."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v11, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 368
    :cond_b
    const/4 v8, 0x1

    goto/16 :goto_2

    .line 369
    :cond_c
    const-class v0, Lretrofit/http/Part;

    move-object/from16 v1, v18

    if-ne v1, v0, :cond_e

    .line 370
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->MULTIPART:Lretrofit/RestMethodInfo$RequestType;

    if-eq v0, v1, :cond_d

    .line 371
    const-string v0, "@Part parameters can only be used with multipart encoding."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v11, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 374
    :cond_d
    const/4 v9, 0x1

    goto :goto_2

    .line 375
    :cond_e
    const-class v0, Lretrofit/http/PartMap;

    move-object/from16 v1, v18

    if-ne v1, v0, :cond_11

    .line 376
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->MULTIPART:Lretrofit/RestMethodInfo$RequestType;

    if-eq v0, v1, :cond_f

    .line 377
    const-string v0, "@PartMap parameters can only be used with multipart encoding."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v11, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 380
    :cond_f
    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 381
    const-string v0, "@PartMap parameter type must be Map."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v11, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 384
    :cond_10
    const/4 v9, 0x1

    goto :goto_2

    .line 385
    :cond_11
    const-class v0, Lretrofit/http/Body;

    move-object/from16 v1, v18

    if-ne v1, v0, :cond_16

    .line 386
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->SIMPLE:Lretrofit/RestMethodInfo$RequestType;

    if-eq v0, v1, :cond_12

    .line 387
    const-string v0, "@Body parameters cannot be used with form or multi-part encoding."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v11, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 390
    :cond_12
    if-eqz v10, :cond_13

    .line 391
    const-string v0, "Multiple @Body method annotations found."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 394
    :cond_13
    const/4 v10, 0x1

    .line 400
    :cond_14
    :goto_2
    aget-object v0, v7, v11

    if-eqz v0, :cond_15

    .line 401
    const-string v0, "Multiple Retrofit annotations found, only one allowed: @%s, @%s."

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aget-object v2, v7, v11

    .line 403
    invoke-interface {v2}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 404
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 401
    move-object/from16 v2, p0

    invoke-direct {v2, v11, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 406
    :cond_15
    aput-object v17, v7, v11

    .line 328
    :cond_16
    add-int/lit8 v16, v16, 0x1

    goto/16 :goto_1

    .line 410
    :cond_17
    aget-object v0, v7, v11

    if-nez v0, :cond_18

    .line 411
    const-string v0, "No Retrofit annotation found."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v11, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 324
    :cond_18
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 415
    :cond_19
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->SIMPLE:Lretrofit/RestMethodInfo$RequestType;

    if-ne v0, v1, :cond_1a

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit/RestMethodInfo;->requestHasBody:Z

    if-nez v0, :cond_1a

    if-eqz v10, :cond_1a

    .line 416
    const-string v0, "Non-body HTTP method cannot contain @Body or @TypedOutput."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 418
    :cond_1a
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

    if-ne v0, v1, :cond_1b

    if-nez v8, :cond_1b

    .line 419
    const-string v0, "Form-encoded method must contain at least one @Field."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 421
    :cond_1b
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->MULTIPART:Lretrofit/RestMethodInfo$RequestType;

    if-ne v0, v1, :cond_1c

    if-nez v9, :cond_1c

    .line 422
    const-string v0, "Multipart method must contain at least one @Part."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 425
    :cond_1c
    move-object/from16 v0, p0

    iput-object v7, v0, Lretrofit/RestMethodInfo;->requestParamAnnotations:[Ljava/lang/annotation/Annotation;

    .line 426
    return-void
.end method

.method private parsePath(Ljava/lang/String;)V
    .locals 7

    .line 195
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_1

    .line 196
    :cond_0
    const-string v0, "URL path \"%s\" must start with \'/\'."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 200
    :cond_1
    move-object v3, p1

    .line 201
    const/4 v4, 0x0

    .line 202
    const/16 v0, 0x3f

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    .line 203
    const/4 v0, -0x1

    if-eq v5, v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v5, v0, :cond_2

    .line 204
    const/4 v0, 0x0

    invoke-virtual {p1, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 205
    add-int/lit8 v0, v5, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 208
    sget-object v0, Lretrofit/RestMethodInfo;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    .line 209
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 210
    const-string v0, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 215
    :cond_2
    invoke-static {p1}, Lretrofit/RestMethodInfo;->parsePathParameters(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v6

    .line 217
    iput-object v3, p0, Lretrofit/RestMethodInfo;->requestUrl:Ljava/lang/String;

    .line 218
    iput-object v6, p0, Lretrofit/RestMethodInfo;->requestUrlParamNames:Ljava/util/Set;

    .line 219
    iput-object v4, p0, Lretrofit/RestMethodInfo;->requestQuery:Ljava/lang/String;

    .line 220
    return-void
.end method

.method static parsePathParameters(Ljava/lang/String;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    .line 444
    sget-object v0, Lretrofit/RestMethodInfo;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 445
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 446
    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 447
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 449
    :cond_0
    return-object v2
.end method

.method private parseResponseType()Lretrofit/RestMethodInfo$ResponseType;
    .locals 9

    .line 245
    iget-object v0, p0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 248
    const/4 v3, 0x0

    .line 249
    const/4 v4, 0x0

    .line 250
    iget-object v0, p0, Lretrofit/RestMethodInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v5

    .line 251
    array-length v0, v5

    if-lez v0, :cond_1

    .line 252
    array-length v0, v5

    add-int/lit8 v0, v0, -0x1

    aget-object v6, v5, v0

    .line 253
    move-object v3, v6

    .line 254
    instance-of v0, v6, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_0

    .line 255
    move-object v0, v6

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v6

    .line 257
    :cond_0
    instance-of v0, v6, Ljava/lang/Class;

    if-eqz v0, :cond_1

    .line 258
    move-object v4, v6

    check-cast v4, Ljava/lang/Class;

    .line 262
    :cond_1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eq v2, v0, :cond_2

    const/4 v6, 0x1

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    .line 263
    :goto_0
    if-eqz v4, :cond_3

    const-class v0, Lretrofit/Callback;

    invoke-virtual {v0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    .line 266
    :goto_1
    if-eqz v6, :cond_4

    if-eqz v7, :cond_4

    .line 267
    const-string v0, "Must have return type or Callback as last argument, not both."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 269
    :cond_4
    if-nez v6, :cond_5

    if-nez v7, :cond_5

    .line 270
    const-string v0, "Must have either a return type or Callback as last argument."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 273
    :cond_5
    if-eqz v6, :cond_7

    .line 274
    sget-boolean v0, Lretrofit/Platform;->HAS_RX_JAVA:Z

    if-eqz v0, :cond_6

    .line 275
    invoke-static {v2}, Lretrofit/Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v8

    .line 276
    invoke-static {v8}, Lretrofit/RestMethodInfo$RxSupport;->isObservable(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 277
    invoke-static {v2, v8}, Lretrofit/RestMethodInfo$RxSupport;->getObservableType(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v2

    .line 278
    move-object v0, v2

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v0}, Lretrofit/RestMethodInfo;->getParameterUpperBound(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestMethodInfo;->responseObjectType:Ljava/lang/reflect/Type;

    .line 279
    sget-object v0, Lretrofit/RestMethodInfo$ResponseType;->OBSERVABLE:Lretrofit/RestMethodInfo$ResponseType;

    return-object v0

    .line 282
    :cond_6
    iput-object v2, p0, Lretrofit/RestMethodInfo;->responseObjectType:Ljava/lang/reflect/Type;

    .line 283
    sget-object v0, Lretrofit/RestMethodInfo$ResponseType;->OBJECT:Lretrofit/RestMethodInfo$ResponseType;

    return-object v0

    .line 286
    :cond_7
    invoke-static {v3}, Lretrofit/Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lretrofit/Callback;

    invoke-static {v3, v0, v1}, Lretrofit/Types;->getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v3

    .line 287
    instance-of v0, v3, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_8

    .line 288
    move-object v0, v3

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v0}, Lretrofit/RestMethodInfo;->getParameterUpperBound(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RestMethodInfo;->responseObjectType:Ljava/lang/reflect/Type;

    .line 289
    sget-object v0, Lretrofit/RestMethodInfo$ResponseType;->VOID:Lretrofit/RestMethodInfo$ResponseType;

    return-object v0

    .line 292
    :cond_8
    const-string v0, "Last parameter must be of type Callback<X> or Callback<? super X>."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0
.end method

.method private validatePathName(ILjava/lang/String;)V
    .locals 4

    .line 429
    sget-object v0, Lretrofit/RestMethodInfo;->PARAM_NAME_REGEX:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    .line 430
    const-string v0, "@Path parameter name must match %s. Found: %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lretrofit/RestMethodInfo;->PARAM_URL_REGEX:Ljava/util/regex/Pattern;

    .line 431
    invoke-virtual {v2}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    .line 430
    invoke-direct {p0, p1, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 434
    :cond_0
    iget-object v0, p0, Lretrofit/RestMethodInfo;->requestUrlParamNames:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 435
    const-string v0, "URL \"%s\" does not contain \"{%s}\"."

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lretrofit/RestMethodInfo;->requestUrl:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-direct {p0, p1, v0, v1}, Lretrofit/RestMethodInfo;->parameterError(ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 437
    :cond_1
    return-void
.end method


# virtual methods
.method declared-synchronized init()V
    .locals 2

    monitor-enter p0

    .line 115
    :try_start_0
    iget-boolean v0, p0, Lretrofit/RestMethodInfo;->loaded:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 117
    :cond_0
    invoke-direct {p0}, Lretrofit/RestMethodInfo;->parseMethodAnnotations()V

    .line 118
    invoke-direct {p0}, Lretrofit/RestMethodInfo;->parseParameters()V

    .line 120
    const/4 v0, 0x1

    iput-boolean v0, p0, Lretrofit/RestMethodInfo;->loaded:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method parseHeaders([Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;)Ljava/util/List<Lretrofit/client/Header;>;"
        }
    .end annotation

    .line 223
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 224
    move-object v4, p1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    aget-object v7, v4, v6

    .line 225
    const/16 v0, 0x3a

    invoke-virtual {v7, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    .line 226
    const/4 v0, -0x1

    if-eq v8, v0, :cond_0

    if-eqz v8, :cond_0

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v8, v0, :cond_1

    .line 227
    :cond_0
    const-string v0, "@Headers value must be in the form \"Name: Value\". Found: \"%s\""

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    invoke-direct {p0, v0, v1}, Lretrofit/RestMethodInfo;->methodError(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 230
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v7, v0, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 231
    add-int/lit8 v0, v8, 0x1

    invoke-virtual {v7, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 232
    const-string v0, "Content-Type"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 233
    iput-object v10, p0, Lretrofit/RestMethodInfo;->contentTypeHeader:Ljava/lang/String;

    goto :goto_1

    .line 235
    :cond_2
    new-instance v0, Lretrofit/client/Header;

    invoke-direct {v0, v9, v10}, Lretrofit/client/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 238
    :cond_3
    return-object v3
.end method
