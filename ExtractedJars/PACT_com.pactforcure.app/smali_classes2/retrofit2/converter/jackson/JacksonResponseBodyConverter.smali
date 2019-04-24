.class final Lretrofit2/converter/jackson/JacksonResponseBodyConverter;
.super Ljava/lang/Object;
.source "JacksonResponseBodyConverter.java"

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
        "<",
        "Lokhttp3/ResponseBody;",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final adapter:Lcom/fasterxml/jackson/databind/ObjectReader;


# direct methods
.method constructor <init>(Lcom/fasterxml/jackson/databind/ObjectReader;)V
    .locals 0
    .param p1, "adapter"    # Lcom/fasterxml/jackson/databind/ObjectReader;

    .prologue
    .line 26
    .local p0, "this":Lretrofit2/converter/jackson/JacksonResponseBodyConverter;, "Lretrofit2/converter/jackson/JacksonResponseBodyConverter<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lretrofit2/converter/jackson/JacksonResponseBodyConverter;->adapter:Lcom/fasterxml/jackson/databind/ObjectReader;

    .line 28
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
    .line 23
    .local p0, "this":Lretrofit2/converter/jackson/JacksonResponseBodyConverter;, "Lretrofit2/converter/jackson/JacksonResponseBodyConverter<TT;>;"
    check-cast p1, Lokhttp3/ResponseBody;

    invoke-virtual {p0, p1}, Lretrofit2/converter/jackson/JacksonResponseBodyConverter;->convert(Lokhttp3/ResponseBody;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public convert(Lokhttp3/ResponseBody;)Ljava/lang/Object;
    .locals 2
    .param p1, "value"    # Lokhttp3/ResponseBody;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/ResponseBody;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 32
    .local p0, "this":Lretrofit2/converter/jackson/JacksonResponseBodyConverter;, "Lretrofit2/converter/jackson/JacksonResponseBodyConverter<TT;>;"
    :try_start_0
    iget-object v0, p0, Lretrofit2/converter/jackson/JacksonResponseBodyConverter;->adapter:Lcom/fasterxml/jackson/databind/ObjectReader;

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->charStream()Ljava/io/Reader;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/ObjectReader;->readValue(Ljava/io/Reader;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 34
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    .line 32
    return-object v0

    .line 34
    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->close()V

    throw v0
.end method
