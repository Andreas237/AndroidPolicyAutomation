.class public final Lretrofit2/converter/jackson/JacksonConverterFactory;
.super Lretrofit2/Converter$Factory;
.source "JacksonConverterFactory.java"


# instance fields
.field private final mapper:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method private constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 2
    .param p1, "mapper"    # Lcom/fasterxml/jackson/databind/ObjectMapper;

    .prologue
    .line 50
    invoke-direct {p0}, Lretrofit2/Converter$Factory;-><init>()V

    .line 51
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "mapper == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_0
    iput-object p1, p0, Lretrofit2/converter/jackson/JacksonConverterFactory;->mapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 53
    return-void
.end method

.method public static create()Lretrofit2/converter/jackson/JacksonConverterFactory;
    .locals 1

    .prologue
    .line 40
    new-instance v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;-><init>()V

    invoke-static {v0}, Lretrofit2/converter/jackson/JacksonConverterFactory;->create(Lcom/fasterxml/jackson/databind/ObjectMapper;)Lretrofit2/converter/jackson/JacksonConverterFactory;

    move-result-object v0

    return-object v0
.end method

.method public static create(Lcom/fasterxml/jackson/databind/ObjectMapper;)Lretrofit2/converter/jackson/JacksonConverterFactory;
    .locals 1
    .param p0, "mapper"    # Lcom/fasterxml/jackson/databind/ObjectMapper;

    .prologue
    .line 45
    new-instance v0, Lretrofit2/converter/jackson/JacksonConverterFactory;

    invoke-direct {v0, p0}, Lretrofit2/converter/jackson/JacksonConverterFactory;-><init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-object v0
.end method


# virtual methods
.method public requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;
    .locals 3
    .param p1, "type"    # Ljava/lang/reflect/Type;
    .param p2, "parameterAnnotations"    # [Ljava/lang/annotation/Annotation;
    .param p3, "methodAnnotations"    # [Ljava/lang/annotation/Annotation;
    .param p4, "retrofit"    # Lretrofit2/Retrofit;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lretrofit2/Retrofit;",
            ")",
            "Lretrofit2/Converter",
            "<*",
            "Lokhttp3/RequestBody;",
            ">;"
        }
    .end annotation

    .prologue
    .line 66
    iget-object v2, p0, Lretrofit2/converter/jackson/JacksonConverterFactory;->mapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->getTypeFactory()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    .line 67
    .local v0, "javaType":Lcom/fasterxml/jackson/databind/JavaType;
    iget-object v2, p0, Lretrofit2/converter/jackson/JacksonConverterFactory;->mapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->writerWithType(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectWriter;

    move-result-object v1

    .line 68
    .local v1, "writer":Lcom/fasterxml/jackson/databind/ObjectWriter;
    new-instance v2, Lretrofit2/converter/jackson/JacksonRequestBodyConverter;

    invoke-direct {v2, v1}, Lretrofit2/converter/jackson/JacksonRequestBodyConverter;-><init>(Lcom/fasterxml/jackson/databind/ObjectWriter;)V

    return-object v2
.end method

.method public responseBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;
    .locals 3
    .param p1, "type"    # Ljava/lang/reflect/Type;
    .param p2, "annotations"    # [Ljava/lang/annotation/Annotation;
    .param p3, "retrofit"    # Lretrofit2/Retrofit;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lretrofit2/Retrofit;",
            ")",
            "Lretrofit2/Converter",
            "<",
            "Lokhttp3/ResponseBody;",
            "*>;"
        }
    .end annotation

    .prologue
    .line 58
    iget-object v2, p0, Lretrofit2/converter/jackson/JacksonConverterFactory;->mapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->getTypeFactory()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    .line 59
    .local v0, "javaType":Lcom/fasterxml/jackson/databind/JavaType;
    iget-object v2, p0, Lretrofit2/converter/jackson/JacksonConverterFactory;->mapper:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->reader(Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/ObjectReader;

    move-result-object v1

    .line 60
    .local v1, "reader":Lcom/fasterxml/jackson/databind/ObjectReader;
    new-instance v2, Lretrofit2/converter/jackson/JacksonResponseBodyConverter;

    invoke-direct {v2, v1}, Lretrofit2/converter/jackson/JacksonResponseBodyConverter;-><init>(Lcom/fasterxml/jackson/databind/ObjectReader;)V

    return-object v2
.end method
