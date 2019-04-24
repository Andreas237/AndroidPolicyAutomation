.class public Lretrofit/converter/GsonConverter;
.super Ljava/lang/Object;
.source "SourceFile"

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

    .line 43
    const-string v0, "UTF-8"

    invoke-direct {p0, p1, v0}, Lretrofit/converter/GsonConverter;-><init>(Lcom/google/gson/Gson;Ljava/lang/String;)V

    .line 44
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

    .line 53
    return-void
.end method


# virtual methods
.method public fromBody(Lretrofit/mime/TypedInput;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lretrofit/converter/ConversionException;
        }
    .end annotation

    .line 56
    iget-object v2, p0, Lretrofit/converter/GsonConverter;->charset:Ljava/lang/String;

    .line 57
    invoke-interface {p1}, Lretrofit/mime/TypedInput;->mimeType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 58
    invoke-interface {p1}, Lretrofit/mime/TypedInput;->mimeType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lretrofit/mime/MimeUtil;->parseCharset(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 60
    :cond_0
    const/4 v3, 0x0

    .line 62
    :try_start_0
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-interface {p1}, Lretrofit/mime/TypedInput;->in()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v3, v0

    .line 63
    iget-object v0, p0, Lretrofit/converter/GsonConverter;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v0, v3, p2}, Lcom/google/gson/Gson;->fromJson(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/gson/JsonParseException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 69
    if-eqz v3, :cond_1

    .line 71
    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 73
    goto :goto_0

    .line 72
    :catch_0
    move-exception v5

    .line 73
    :cond_1
    :goto_0
    return-object v4

    .line 64
    :catch_1
    move-exception v4

    .line 65
    :try_start_2
    new-instance v0, Lretrofit/converter/ConversionException;

    invoke-direct {v0, v4}, Lretrofit/converter/ConversionException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 66
    :catch_2
    move-exception v4

    .line 67
    new-instance v0, Lretrofit/converter/ConversionException;

    invoke-direct {v0, v4}, Lretrofit/converter/ConversionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    :catchall_0
    move-exception v6

    if-eqz v3, :cond_2

    .line 71
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 73
    goto :goto_1

    .line 72
    :catch_3
    move-exception v7

    .line 73
    :cond_2
    :goto_1
    throw v6
.end method

.method public toBody(Ljava/lang/Object;)Lretrofit/mime/TypedOutput;
    .locals 4

    .line 80
    :try_start_0
    new-instance v0, Lretrofit/converter/GsonConverter$JsonTypedOutput;

    iget-object v1, p0, Lretrofit/converter/GsonConverter;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v1, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lretrofit/converter/GsonConverter;->charset:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    iget-object v2, p0, Lretrofit/converter/GsonConverter;->charset:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lretrofit/converter/GsonConverter$JsonTypedOutput;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 81
    :catch_0
    move-exception v3

    .line 82
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method
