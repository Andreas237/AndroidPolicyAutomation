.class public Lretrofit/converter/GsonConverter;
.super Ljava/lang/Object;
.source "GsonConverter.java"

# interfaces
.implements Lretrofit/converter/Converter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/converter/GsonConverter$JsonTypedOutput;
    }
.end annotation


# instance fields
.field private charset:Ljava/lang/String;

.field private final gson:Lcom/google/gson/Gson;


# direct methods
.method public constructor <init>(Lcom/google/gson/Gson;)V
    .locals 1

    const-string v0, "UTF-8"

    .line 43
    invoke-direct {p0, p1, v0}, Lretrofit/converter/GsonConverter;-><init>(Lcom/google/gson/Gson;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/gson/Gson;Ljava/lang/String;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lretrofit/converter/GsonConverter;->gson:Lcom/google/gson/Gson;

    .line 52
    iput-object p2, p0, Lretrofit/converter/GsonConverter;->charset:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public fromBody(Lretrofit/mime/TypedInput;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lretrofit/converter/ConversionException;
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lretrofit/converter/GsonConverter;->charset:Ljava/lang/String;

    .line 57
    invoke-interface {p1}, Lretrofit/mime/TypedInput;->mimeType()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 58
    invoke-interface {p1}, Lretrofit/mime/TypedInput;->mimeType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lretrofit/mime/MimeUtil;->parseCharset(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const/4 v1, 0x0

    .line 62
    :try_start_0
    new-instance v2, Ljava/io/InputStreamReader;

    invoke-interface {p1}, Lretrofit/mime/TypedInput;->in()Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v2, p1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lcom/google/gson/JsonParseException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 63
    :try_start_1
    iget-object p1, p0, Lretrofit/converter/GsonConverter;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p1, v2, p2}, Lcom/google/gson/Gson;->fromJson(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/google/gson/JsonParseException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_1

    .line 71
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStreamReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_1
    return-object p1

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto :goto_2

    :catch_1
    move-exception p1

    move-object v1, v2

    goto :goto_0

    :catch_2
    move-exception p1

    move-object v1, v2

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_3
    move-exception p1

    .line 67
    :goto_0
    :try_start_3
    new-instance p2, Lretrofit/converter/ConversionException;

    invoke-direct {p2, p1}, Lretrofit/converter/ConversionException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_4
    move-exception p1

    .line 65
    :goto_1
    new-instance p2, Lretrofit/converter/ConversionException;

    invoke-direct {p2, p1}, Lretrofit/converter/ConversionException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    if-eqz v1, :cond_2

    .line 71
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStreamReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    .line 73
    :catch_5
    :cond_2
    throw p1
.end method

.method public toBody(Ljava/lang/Object;)Lretrofit/mime/TypedOutput;
    .locals 2

    .line 80
    :try_start_0
    new-instance v0, Lretrofit/converter/GsonConverter$JsonTypedOutput;

    iget-object v1, p0, Lretrofit/converter/GsonConverter;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v1, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lretrofit/converter/GsonConverter;->charset:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    iget-object v1, p0, Lretrofit/converter/GsonConverter;->charset:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lretrofit/converter/GsonConverter$JsonTypedOutput;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 82
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method
