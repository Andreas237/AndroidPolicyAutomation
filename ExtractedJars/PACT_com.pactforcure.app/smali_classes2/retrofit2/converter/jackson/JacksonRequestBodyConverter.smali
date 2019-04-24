.class final Lretrofit2/converter/jackson/JacksonRequestBodyConverter;
.super Ljava/lang/Object;
.source "JacksonRequestBodyConverter.java"

# interfaces
.implements Lretrofit2/Converter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lretrofit2/Converter",
        "<TT;",
        "Lokhttp3/RequestBody;",
        ">;"
    }
.end annotation


# static fields
.field private static final MEDIA_TYPE:Lokhttp3/MediaType;


# instance fields
.field private final adapter:Lcom/fasterxml/jackson/databind/ObjectWriter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sput-object v0, Lretrofit2/converter/jackson/JacksonRequestBodyConverter;->MEDIA_TYPE:Lokhttp3/MediaType;

    return-void
.end method

.method constructor <init>(Lcom/fasterxml/jackson/databind/ObjectWriter;)V
    .locals 0
    .param p1, "adapter"    # Lcom/fasterxml/jackson/databind/ObjectWriter;

    .prologue
    .line 29
    .local p0, "this":Lretrofit2/converter/jackson/JacksonRequestBodyConverter;, "Lretrofit2/converter/jackson/JacksonRequestBodyConverter<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lretrofit2/converter/jackson/JacksonRequestBodyConverter;->adapter:Lcom/fasterxml/jackson/databind/ObjectWriter;

    .line 31
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 24
    .local p0, "this":Lretrofit2/converter/jackson/JacksonRequestBodyConverter;, "Lretrofit2/converter/jackson/JacksonRequestBodyConverter<TT;>;"
    invoke-virtual {p0, p1}, Lretrofit2/converter/jackson/JacksonRequestBodyConverter;->convert(Ljava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object v0

    return-object v0
.end method

.method public convert(Ljava/lang/Object;)Lokhttp3/RequestBody;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lokhttp3/RequestBody;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 34
    .local p0, "this":Lretrofit2/converter/jackson/JacksonRequestBodyConverter;, "Lretrofit2/converter/jackson/JacksonRequestBodyConverter<TT;>;"
    .local p1, "value":Ljava/lang/Object;, "TT;"
    iget-object v1, p0, Lretrofit2/converter/jackson/JacksonRequestBodyConverter;->adapter:Lcom/fasterxml/jackson/databind/ObjectWriter;

    invoke-virtual {v1, p1}, Lcom/fasterxml/jackson/databind/ObjectWriter;->writeValueAsBytes(Ljava/lang/Object;)[B

    move-result-object v0

    .line 35
    .local v0, "bytes":[B
    sget-object v1, Lretrofit2/converter/jackson/JacksonRequestBodyConverter;->MEDIA_TYPE:Lokhttp3/MediaType;

    invoke-static {v1, v0}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;[B)Lokhttp3/RequestBody;

    move-result-object v1

    return-object v1
.end method
