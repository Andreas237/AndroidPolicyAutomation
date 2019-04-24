.class final Lretrofit/RequestBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit/RequestInterceptor$RequestFacade;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/RequestBuilder$MimeOverridingTypedOutput;
    }
.end annotation


# instance fields
.field private final apiUrl:Ljava/lang/String;

.field private body:Lretrofit/mime/TypedOutput;

.field private contentTypeHeader:Ljava/lang/String;

.field private final converter:Lretrofit/converter/Converter;

.field private final formBody:Lretrofit/mime/FormUrlEncodedTypedOutput;

.field private headers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lretrofit/client/Header;>;"
        }
    .end annotation
.end field

.field private final isObservable:Z

.field private final isSynchronous:Z

.field private final multipartBody:Lretrofit/mime/MultipartTypedOutput;

.field private final paramAnnotations:[Ljava/lang/annotation/Annotation;

.field private queryParams:Ljava/lang/StringBuilder;

.field private relativeUrl:Ljava/lang/String;

.field private final requestMethod:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lretrofit/RestMethodInfo;Lretrofit/converter/Converter;)V
    .locals 4

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lretrofit/RequestBuilder;->apiUrl:Ljava/lang/String;

    .line 66
    iput-object p3, p0, Lretrofit/RequestBuilder;->converter:Lretrofit/converter/Converter;

    .line 68
    iget-object v0, p2, Lretrofit/RestMethodInfo;->requestParamAnnotations:[Ljava/lang/annotation/Annotation;

    iput-object v0, p0, Lretrofit/RequestBuilder;->paramAnnotations:[Ljava/lang/annotation/Annotation;

    .line 69
    iget-object v0, p2, Lretrofit/RestMethodInfo;->requestMethod:Ljava/lang/String;

    iput-object v0, p0, Lretrofit/RequestBuilder;->requestMethod:Ljava/lang/String;

    .line 70
    iget-boolean v0, p2, Lretrofit/RestMethodInfo;->isSynchronous:Z

    iput-boolean v0, p0, Lretrofit/RequestBuilder;->isSynchronous:Z

    .line 71
    iget-boolean v0, p2, Lretrofit/RestMethodInfo;->isObservable:Z

    iput-boolean v0, p0, Lretrofit/RequestBuilder;->isObservable:Z

    .line 73
    iget-object v0, p2, Lretrofit/RestMethodInfo;->headers:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p2, Lretrofit/RestMethodInfo;->headers:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lretrofit/RequestBuilder;->headers:Ljava/util/List;

    .line 76
    :cond_0
    iget-object v0, p2, Lretrofit/RestMethodInfo;->contentTypeHeader:Ljava/lang/String;

    iput-object v0, p0, Lretrofit/RequestBuilder;->contentTypeHeader:Ljava/lang/String;

    .line 78
    iget-object v0, p2, Lretrofit/RestMethodInfo;->requestUrl:Ljava/lang/String;

    iput-object v0, p0, Lretrofit/RequestBuilder;->relativeUrl:Ljava/lang/String;

    .line 80
    iget-object v3, p2, Lretrofit/RestMethodInfo;->requestQuery:Ljava/lang/String;

    .line 81
    if-eqz v3, :cond_1

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RequestBuilder;->queryParams:Ljava/lang/StringBuilder;

    .line 85
    :cond_1
    sget-object v0, Lretrofit/RequestBuilder$1;->$SwitchMap$retrofit$RestMethodInfo$RequestType:[I

    iget-object v1, p2, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    invoke-virtual {v1}, Lretrofit/RestMethodInfo$RequestType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 87
    :pswitch_0
    new-instance v0, Lretrofit/mime/FormUrlEncodedTypedOutput;

    invoke-direct {v0}, Lretrofit/mime/FormUrlEncodedTypedOutput;-><init>()V

    iput-object v0, p0, Lretrofit/RequestBuilder;->formBody:Lretrofit/mime/FormUrlEncodedTypedOutput;

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lretrofit/RequestBuilder;->multipartBody:Lretrofit/mime/MultipartTypedOutput;

    .line 89
    iget-object v0, p0, Lretrofit/RequestBuilder;->formBody:Lretrofit/mime/FormUrlEncodedTypedOutput;

    iput-object v0, p0, Lretrofit/RequestBuilder;->body:Lretrofit/mime/TypedOutput;

    .line 90
    goto :goto_1

    .line 92
    :pswitch_1
    const/4 v0, 0x0

    iput-object v0, p0, Lretrofit/RequestBuilder;->formBody:Lretrofit/mime/FormUrlEncodedTypedOutput;

    .line 93
    new-instance v0, Lretrofit/mime/MultipartTypedOutput;

    invoke-direct {v0}, Lretrofit/mime/MultipartTypedOutput;-><init>()V

    iput-object v0, p0, Lretrofit/RequestBuilder;->multipartBody:Lretrofit/mime/MultipartTypedOutput;

    .line 94
    iget-object v0, p0, Lretrofit/RequestBuilder;->multipartBody:Lretrofit/mime/MultipartTypedOutput;

    iput-object v0, p0, Lretrofit/RequestBuilder;->body:Lretrofit/mime/TypedOutput;

    .line 95
    goto :goto_1

    .line 97
    :pswitch_2
    const/4 v0, 0x0

    iput-object v0, p0, Lretrofit/RequestBuilder;->formBody:Lretrofit/mime/FormUrlEncodedTypedOutput;

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lretrofit/RequestBuilder;->multipartBody:Lretrofit/mime/MultipartTypedOutput;

    .line 100
    goto :goto_1

    .line 102
    :goto_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown request type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p2, Lretrofit/RestMethodInfo;->requestType:Lretrofit/RestMethodInfo$RequestType;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 104
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private addPathParam(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .line 131
    if-nez p1, :cond_0

    .line 132
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Path replacement name must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 134
    :cond_0
    if-nez p2, :cond_1

    .line 135
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Path replacement \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" value must not be null."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 139
    :cond_1
    if-eqz p3, :cond_2

    .line 140
    :try_start_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 144
    const-string v0, "+"

    const-string v1, "%20"

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 145
    iget-object v0, p0, Lretrofit/RequestBuilder;->relativeUrl:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "{"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RequestBuilder;->relativeUrl:Ljava/lang/String;

    .line 146
    goto :goto_0

    .line 147
    :cond_2
    iget-object v0, p0, Lretrofit/RequestBuilder;->relativeUrl:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "{"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lretrofit/RequestBuilder;->relativeUrl:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    :goto_0
    goto :goto_1

    .line 149
    :catch_0
    move-exception v3

    .line 150
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to convert path parameter \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" value to UTF-8:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 153
    :goto_1
    return-void
.end method

.method private addQueryParam(Ljava/lang/String;Ljava/lang/Object;ZZ)V
    .locals 4

    .line 164
    instance-of v0, p2, Ljava/lang/Iterable;

    if-eqz v0, :cond_2

    .line 165
    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 166
    if-eqz v2, :cond_0

    .line 167
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p3, p4}, Lretrofit/RequestBuilder;->addQueryParam(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 169
    :cond_0
    goto :goto_0

    :cond_1
    goto :goto_2

    .line 170
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 171
    const/4 v1, 0x0

    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_4

    .line 172
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    .line 173
    if-eqz v3, :cond_3

    .line 174
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p3, p4}, Lretrofit/RequestBuilder;->addQueryParam(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 171
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    goto :goto_2

    .line 178
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p3, p4}, Lretrofit/RequestBuilder;->addQueryParam(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 180
    :goto_2
    return-void
.end method

.method private addQueryParam(Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 4

    .line 183
    if-nez p1, :cond_0

    .line 184
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Query param name must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 186
    :cond_0
    if-nez p2, :cond_1

    .line 187
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Query param \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" value must not be null."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 190
    :cond_1
    :try_start_0
    iget-object v3, p0, Lretrofit/RequestBuilder;->queryParams:Ljava/lang/StringBuilder;

    .line 191
    if-nez v3, :cond_2

    .line 192
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v3, p0, Lretrofit/RequestBuilder;->queryParams:Ljava/lang/StringBuilder;

    .line 195
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_3

    const/16 v0, 0x26

    goto :goto_0

    :cond_3
    const/16 v0, 0x3f

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 197
    if-eqz p3, :cond_4

    .line 198
    const-string v0, "UTF-8"

    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object p1, v0

    .line 200
    :cond_4
    if-eqz p4, :cond_5

    .line 201
    const-string v0, "UTF-8"

    invoke-static {p2, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object p2, v0

    .line 203
    :cond_5
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 207
    goto :goto_1

    .line 204
    :catch_0
    move-exception v3

    .line 205
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to convert query parameter \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" value to UTF-8: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 208
    :goto_1
    return-void
.end method

.method private addQueryParamMap(ILjava/util/Map;ZZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map<**>;ZZ)V"
        }
    .end annotation

    .line 212
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 213
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    .line 214
    if-nez v5, :cond_0

    .line 215
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parameter #"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, p1, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " query map contained null key."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_0
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    .line 219
    if-eqz v6, :cond_1

    .line 220
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1, p3, p4}, Lretrofit/RequestBuilder;->addQueryParam(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 222
    :cond_1
    goto :goto_0

    .line 223
    :cond_2
    return-void
.end method


# virtual methods
.method public addEncodedPathParam(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 127
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lretrofit/RequestBuilder;->addPathParam(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 128
    return-void
.end method

.method public addEncodedQueryParam(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 160
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lretrofit/RequestBuilder;->addQueryParam(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 161
    return-void
.end method

.method public addHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 107
    if-nez p1, :cond_0

    .line 108
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Header name must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_0
    const-string v0, "Content-Type"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 111
    iput-object p2, p0, Lretrofit/RequestBuilder;->contentTypeHeader:Ljava/lang/String;

    .line 112
    return-void

    .line 115
    :cond_1
    iget-object v2, p0, Lretrofit/RequestBuilder;->headers:Ljava/util/List;

    .line 116
    if-nez v2, :cond_2

    .line 117
    new-instance v2, Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, p0, Lretrofit/RequestBuilder;->headers:Ljava/util/List;

    .line 119
    :cond_2
    new-instance v0, Lretrofit/client/Header;

    invoke-direct {v0, p1, p2}, Lretrofit/client/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    return-void
.end method

.method public addPathParam(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 123
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lretrofit/RequestBuilder;->addPathParam(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 124
    return-void
.end method

.method public addQueryParam(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 156
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v0, v1}, Lretrofit/RequestBuilder;->addQueryParam(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 157
    return-void
.end method

.method build()Lretrofit/client/Request;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 385
    iget-object v0, p0, Lretrofit/RequestBuilder;->multipartBody:Lretrofit/mime/MultipartTypedOutput;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lretrofit/RequestBuilder;->multipartBody:Lretrofit/mime/MultipartTypedOutput;

    invoke-virtual {v0}, Lretrofit/mime/MultipartTypedOutput;->getPartCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 386
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Multipart requests must contain at least one part."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 389
    :cond_0
    iget-object v3, p0, Lretrofit/RequestBuilder;->apiUrl:Ljava/lang/String;

    .line 390
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 391
    const-string v0, "/"

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 393
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 396
    :cond_1
    iget-object v0, p0, Lretrofit/RequestBuilder;->relativeUrl:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    iget-object v5, p0, Lretrofit/RequestBuilder;->queryParams:Ljava/lang/StringBuilder;

    .line 399
    if-eqz v5, :cond_2

    .line 400
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 403
    :cond_2
    iget-object v6, p0, Lretrofit/RequestBuilder;->body:Lretrofit/mime/TypedOutput;

    .line 404
    iget-object v7, p0, Lretrofit/RequestBuilder;->headers:Ljava/util/List;

    .line 405
    iget-object v0, p0, Lretrofit/RequestBuilder;->contentTypeHeader:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 406
    if-eqz v6, :cond_3

    .line 407
    new-instance v0, Lretrofit/RequestBuilder$MimeOverridingTypedOutput;

    iget-object v1, p0, Lretrofit/RequestBuilder;->contentTypeHeader:Ljava/lang/String;

    invoke-direct {v0, v6, v1}, Lretrofit/RequestBuilder$MimeOverridingTypedOutput;-><init>(Lretrofit/mime/TypedOutput;Ljava/lang/String;)V

    move-object v6, v0

    goto :goto_0

    .line 409
    :cond_3
    new-instance v8, Lretrofit/client/Header;

    const-string v0, "Content-Type"

    iget-object v1, p0, Lretrofit/RequestBuilder;->contentTypeHeader:Ljava/lang/String;

    invoke-direct {v8, v0, v1}, Lretrofit/client/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    if-nez v7, :cond_4

    .line 411
    invoke-static {v8}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    goto :goto_0

    .line 413
    :cond_4
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 418
    :cond_5
    :goto_0
    new-instance v0, Lretrofit/client/Request;

    iget-object v1, p0, Lretrofit/RequestBuilder;->requestMethod:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, v7, v6}, Lretrofit/client/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lretrofit/mime/TypedOutput;)V

    return-object v0
.end method

.method setArguments([Ljava/lang/Object;)V
    .locals 16

    .line 226
    if-nez p1, :cond_0

    .line 227
    return-void

    .line 229
    :cond_0
    move-object/from16 v0, p1

    array-length v4, v0

    .line 230
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit/RequestBuilder;->isSynchronous:Z

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lretrofit/RequestBuilder;->isObservable:Z

    if-nez v0, :cond_1

    .line 231
    add-int/lit8 v4, v4, -0x1

    .line 233
    :cond_1
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_29

    .line 234
    aget-object v6, p1, v5

    .line 236
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RequestBuilder;->paramAnnotations:[Ljava/lang/annotation/Annotation;

    aget-object v7, v0, v5

    .line 237
    invoke-interface {v7}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v8

    .line 238
    const-class v0, Lretrofit/http/Path;

    if-ne v8, v0, :cond_3

    .line 239
    move-object v9, v7

    check-cast v9, Lretrofit/http/Path;

    .line 240
    invoke-interface {v9}, Lretrofit/http/Path;->value()Ljava/lang/String;

    move-result-object v10

    .line 241
    if-nez v6, :cond_2

    .line 242
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Path parameter \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" value must not be null."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 245
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9}, Lretrofit/http/Path;->encode()Z

    move-result v1

    move-object/from16 v2, p0

    invoke-direct {v2, v10, v0, v1}, Lretrofit/RequestBuilder;->addPathParam(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 246
    goto/16 :goto_b

    :cond_3
    const-class v0, Lretrofit/http/EncodedPath;

    if-ne v8, v0, :cond_5

    .line 247
    move-object v0, v7

    check-cast v0, Lretrofit/http/EncodedPath;

    invoke-interface {v0}, Lretrofit/http/EncodedPath;->value()Ljava/lang/String;

    move-result-object v9

    .line 248
    if-nez v6, :cond_4

    .line 249
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Path parameter \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" value must not be null."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 252
    :cond_4
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    const/4 v2, 0x0

    invoke-direct {v1, v9, v0, v2}, Lretrofit/RequestBuilder;->addPathParam(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 253
    goto/16 :goto_b

    :cond_5
    const-class v0, Lretrofit/http/Query;

    if-ne v8, v0, :cond_6

    .line 254
    if-eqz v6, :cond_28

    .line 255
    move-object v9, v7

    check-cast v9, Lretrofit/http/Query;

    .line 256
    invoke-interface {v9}, Lretrofit/http/Query;->value()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9}, Lretrofit/http/Query;->encodeName()Z

    move-result v1

    invoke-interface {v9}, Lretrofit/http/Query;->encodeValue()Z

    move-result v2

    move-object/from16 v3, p0

    invoke-direct {v3, v0, v6, v1, v2}, Lretrofit/RequestBuilder;->addQueryParam(Ljava/lang/String;Ljava/lang/Object;ZZ)V

    .line 257
    goto/16 :goto_b

    .line 258
    :cond_6
    const-class v0, Lretrofit/http/EncodedQuery;

    if-ne v8, v0, :cond_7

    .line 259
    if-eqz v6, :cond_28

    .line 260
    move-object v9, v7

    check-cast v9, Lretrofit/http/EncodedQuery;

    .line 261
    invoke-interface {v9}, Lretrofit/http/EncodedQuery;->value()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v0, v6, v2, v3}, Lretrofit/RequestBuilder;->addQueryParam(Ljava/lang/String;Ljava/lang/Object;ZZ)V

    .line 262
    goto/16 :goto_b

    .line 263
    :cond_7
    const-class v0, Lretrofit/http/QueryMap;

    if-ne v8, v0, :cond_8

    .line 264
    if-eqz v6, :cond_28

    .line 265
    move-object v9, v7

    check-cast v9, Lretrofit/http/QueryMap;

    .line 266
    move-object v0, v6

    check-cast v0, Ljava/util/Map;

    invoke-interface {v9}, Lretrofit/http/QueryMap;->encodeNames()Z

    move-result v1

    invoke-interface {v9}, Lretrofit/http/QueryMap;->encodeValues()Z

    move-result v2

    move-object/from16 v3, p0

    invoke-direct {v3, v5, v0, v1, v2}, Lretrofit/RequestBuilder;->addQueryParamMap(ILjava/util/Map;ZZ)V

    .line 267
    goto/16 :goto_b

    .line 268
    :cond_8
    const-class v0, Lretrofit/http/EncodedQueryMap;

    if-ne v8, v0, :cond_9

    .line 269
    if-eqz v6, :cond_28

    .line 270
    move-object v0, v6

    check-cast v0, Ljava/util/Map;

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v5, v0, v2, v3}, Lretrofit/RequestBuilder;->addQueryParamMap(ILjava/util/Map;ZZ)V

    goto/16 :goto_b

    .line 272
    :cond_9
    const-class v0, Lretrofit/http/Header;

    if-ne v8, v0, :cond_10

    .line 273
    if-eqz v6, :cond_28

    .line 274
    move-object v0, v7

    check-cast v0, Lretrofit/http/Header;

    invoke-interface {v0}, Lretrofit/http/Header;->value()Ljava/lang/String;

    move-result-object v9

    .line 275
    instance-of v0, v6, Ljava/lang/Iterable;

    if-eqz v0, :cond_c

    .line 276
    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 277
    if-eqz v11, :cond_a

    .line 278
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v9, v0}, Lretrofit/RequestBuilder;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    :cond_a
    goto :goto_1

    :cond_b
    goto :goto_3

    .line 281
    :cond_c
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 282
    const/4 v10, 0x0

    invoke-static {v6}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v11

    :goto_2
    if-ge v10, v11, :cond_e

    .line 283
    invoke-static {v6, v10}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v12

    .line 284
    if-eqz v12, :cond_d

    .line 285
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v9, v0}, Lretrofit/RequestBuilder;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    :cond_d
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_e
    goto :goto_3

    .line 289
    :cond_f
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v9, v0}, Lretrofit/RequestBuilder;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    :goto_3
    goto/16 :goto_b

    .line 292
    :cond_10
    const-class v0, Lretrofit/http/Field;

    if-ne v8, v0, :cond_17

    .line 293
    if-eqz v6, :cond_28

    .line 294
    move-object v9, v7

    check-cast v9, Lretrofit/http/Field;

    .line 295
    invoke-interface {v9}, Lretrofit/http/Field;->value()Ljava/lang/String;

    move-result-object v10

    .line 296
    invoke-interface {v9}, Lretrofit/http/Field;->encodeName()Z

    move-result v11

    .line 297
    invoke-interface {v9}, Lretrofit/http/Field;->encodeValue()Z

    move-result v12

    .line 298
    instance-of v0, v6, Ljava/lang/Iterable;

    if-eqz v0, :cond_13

    .line 299
    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 300
    if-eqz v14, :cond_11

    .line 301
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RequestBuilder;->formBody:Lretrofit/mime/FormUrlEncodedTypedOutput;

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v10, v11, v1, v12}, Lretrofit/mime/FormUrlEncodedTypedOutput;->addField(Ljava/lang/String;ZLjava/lang/String;Z)V

    .line 303
    :cond_11
    goto :goto_4

    :cond_12
    goto :goto_6

    .line 304
    :cond_13
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 305
    const/4 v13, 0x0

    invoke-static {v6}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v14

    :goto_5
    if-ge v13, v14, :cond_15

    .line 306
    invoke-static {v6, v13}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v15

    .line 307
    if-eqz v15, :cond_14

    .line 308
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RequestBuilder;->formBody:Lretrofit/mime/FormUrlEncodedTypedOutput;

    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v10, v11, v1, v12}, Lretrofit/mime/FormUrlEncodedTypedOutput;->addField(Ljava/lang/String;ZLjava/lang/String;Z)V

    .line 305
    :cond_14
    add-int/lit8 v13, v13, 0x1

    goto :goto_5

    :cond_15
    goto :goto_6

    .line 312
    :cond_16
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RequestBuilder;->formBody:Lretrofit/mime/FormUrlEncodedTypedOutput;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v10, v11, v1, v12}, Lretrofit/mime/FormUrlEncodedTypedOutput;->addField(Ljava/lang/String;ZLjava/lang/String;Z)V

    .line 314
    :goto_6
    goto/16 :goto_b

    .line 315
    :cond_17
    const-class v0, Lretrofit/http/FieldMap;

    if-ne v8, v0, :cond_1b

    .line 316
    if-eqz v6, :cond_28

    .line 317
    move-object v9, v7

    check-cast v9, Lretrofit/http/FieldMap;

    .line 318
    invoke-interface {v9}, Lretrofit/http/FieldMap;->encodeNames()Z

    move-result v10

    .line 319
    invoke-interface {v9}, Lretrofit/http/FieldMap;->encodeValues()Z

    move-result v11

    .line 320
    move-object v0, v6

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/util/Map$Entry;

    .line 321
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    .line 322
    if-nez v14, :cond_18

    .line 323
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parameter #"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v5, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " field map contained null key."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 326
    :cond_18
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v15

    .line 327
    if-eqz v15, :cond_19

    .line 328
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RequestBuilder;->formBody:Lretrofit/mime/FormUrlEncodedTypedOutput;

    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v10, v2, v11}, Lretrofit/mime/FormUrlEncodedTypedOutput;->addField(Ljava/lang/String;ZLjava/lang/String;Z)V

    .line 331
    :cond_19
    goto :goto_7

    .line 332
    :cond_1a
    goto/16 :goto_b

    .line 333
    :cond_1b
    const-class v0, Lretrofit/http/Part;

    if-ne v8, v0, :cond_1e

    .line 334
    if-eqz v6, :cond_28

    .line 335
    move-object v0, v7

    check-cast v0, Lretrofit/http/Part;

    invoke-interface {v0}, Lretrofit/http/Part;->value()Ljava/lang/String;

    move-result-object v9

    .line 336
    move-object v0, v7

    check-cast v0, Lretrofit/http/Part;

    invoke-interface {v0}, Lretrofit/http/Part;->encoding()Ljava/lang/String;

    move-result-object v10

    .line 337
    instance-of v0, v6, Lretrofit/mime/TypedOutput;

    if-eqz v0, :cond_1c

    .line 338
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RequestBuilder;->multipartBody:Lretrofit/mime/MultipartTypedOutput;

    move-object v1, v6

    check-cast v1, Lretrofit/mime/TypedOutput;

    invoke-virtual {v0, v9, v10, v1}, Lretrofit/mime/MultipartTypedOutput;->addPart(Ljava/lang/String;Ljava/lang/String;Lretrofit/mime/TypedOutput;)V

    goto :goto_8

    .line 339
    :cond_1c
    instance-of v0, v6, Ljava/lang/String;

    if-eqz v0, :cond_1d

    .line 340
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RequestBuilder;->multipartBody:Lretrofit/mime/MultipartTypedOutput;

    new-instance v1, Lretrofit/mime/TypedString;

    move-object v2, v6

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, v2}, Lretrofit/mime/TypedString;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9, v10, v1}, Lretrofit/mime/MultipartTypedOutput;->addPart(Ljava/lang/String;Ljava/lang/String;Lretrofit/mime/TypedOutput;)V

    goto :goto_8

    .line 342
    :cond_1d
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RequestBuilder;->multipartBody:Lretrofit/mime/MultipartTypedOutput;

    move-object/from16 v1, p0

    iget-object v1, v1, Lretrofit/RequestBuilder;->converter:Lretrofit/converter/Converter;

    invoke-interface {v1, v6}, Lretrofit/converter/Converter;->toBody(Ljava/lang/Object;)Lretrofit/mime/TypedOutput;

    move-result-object v1

    invoke-virtual {v0, v9, v10, v1}, Lretrofit/mime/MultipartTypedOutput;->addPart(Ljava/lang/String;Ljava/lang/String;Lretrofit/mime/TypedOutput;)V

    .line 344
    :goto_8
    goto/16 :goto_b

    .line 345
    :cond_1e
    const-class v0, Lretrofit/http/PartMap;

    if-ne v8, v0, :cond_24

    .line 346
    if-eqz v6, :cond_28

    .line 347
    move-object v0, v7

    check-cast v0, Lretrofit/http/PartMap;

    invoke-interface {v0}, Lretrofit/http/PartMap;->encoding()Ljava/lang/String;

    move-result-object v9

    .line 348
    move-object v0, v6

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/Map$Entry;

    .line 349
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    .line 350
    if-nez v12, :cond_1f

    .line 351
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parameter #"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v5, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " part map contained null key."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 354
    :cond_1f
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    .line 355
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    .line 356
    if-eqz v14, :cond_22

    .line 357
    instance-of v0, v14, Lretrofit/mime/TypedOutput;

    if-eqz v0, :cond_20

    .line 358
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RequestBuilder;->multipartBody:Lretrofit/mime/MultipartTypedOutput;

    move-object v1, v14

    check-cast v1, Lretrofit/mime/TypedOutput;

    invoke-virtual {v0, v13, v9, v1}, Lretrofit/mime/MultipartTypedOutput;->addPart(Ljava/lang/String;Ljava/lang/String;Lretrofit/mime/TypedOutput;)V

    goto :goto_a

    .line 359
    :cond_20
    instance-of v0, v14, Ljava/lang/String;

    if-eqz v0, :cond_21

    .line 360
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RequestBuilder;->multipartBody:Lretrofit/mime/MultipartTypedOutput;

    new-instance v1, Lretrofit/mime/TypedString;

    move-object v2, v14

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, v2}, Lretrofit/mime/TypedString;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v13, v9, v1}, Lretrofit/mime/MultipartTypedOutput;->addPart(Ljava/lang/String;Ljava/lang/String;Lretrofit/mime/TypedOutput;)V

    goto :goto_a

    .line 363
    :cond_21
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RequestBuilder;->multipartBody:Lretrofit/mime/MultipartTypedOutput;

    move-object/from16 v1, p0

    iget-object v1, v1, Lretrofit/RequestBuilder;->converter:Lretrofit/converter/Converter;

    invoke-interface {v1, v14}, Lretrofit/converter/Converter;->toBody(Ljava/lang/Object;)Lretrofit/mime/TypedOutput;

    move-result-object v1

    invoke-virtual {v0, v13, v9, v1}, Lretrofit/mime/MultipartTypedOutput;->addPart(Ljava/lang/String;Ljava/lang/String;Lretrofit/mime/TypedOutput;)V

    .line 366
    :cond_22
    :goto_a
    goto/16 :goto_9

    .line 367
    :cond_23
    goto :goto_b

    .line 368
    :cond_24
    const-class v0, Lretrofit/http/Body;

    if-ne v8, v0, :cond_27

    .line 369
    if-nez v6, :cond_25

    .line 370
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Body parameter value must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 372
    :cond_25
    instance-of v0, v6, Lretrofit/mime/TypedOutput;

    if-eqz v0, :cond_26

    .line 373
    move-object v0, v6

    check-cast v0, Lretrofit/mime/TypedOutput;

    move-object/from16 v1, p0

    iput-object v0, v1, Lretrofit/RequestBuilder;->body:Lretrofit/mime/TypedOutput;

    goto :goto_b

    .line 375
    :cond_26
    move-object/from16 v0, p0

    iget-object v0, v0, Lretrofit/RequestBuilder;->converter:Lretrofit/converter/Converter;

    invoke-interface {v0, v6}, Lretrofit/converter/Converter;->toBody(Ljava/lang/Object;)Lretrofit/mime/TypedOutput;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lretrofit/RequestBuilder;->body:Lretrofit/mime/TypedOutput;

    goto :goto_b

    .line 378
    :cond_27
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown annotation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 379
    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 233
    :cond_28
    :goto_b
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 382
    :cond_29
    return-void
.end method
