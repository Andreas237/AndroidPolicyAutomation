.class public final Lcom/microblink/internal/services/ServiceGenerator;
.super Ljava/lang/Object;


# static fields
.field private static final retrofit:Lretrofit2/Retrofit;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private static final retrofitShort:Lretrofit2/Retrofit;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lcom/microblink/internal/ServiceHttpGenerator;->getInstance()Lcom/microblink/internal/ServiceHttpGenerator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/internal/ServiceHttpGenerator;->client()Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/services/ServiceGenerator;->retrofit(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit;

    move-result-object v0

    sput-object v0, Lcom/microblink/internal/services/ServiceGenerator;->retrofit:Lretrofit2/Retrofit;

    invoke-static {}, Lcom/microblink/internal/ServiceHttpGenerator;->getInstance()Lcom/microblink/internal/ServiceHttpGenerator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/internal/ServiceHttpGenerator;->client()Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x5

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/services/ServiceGenerator;->retrofit(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit;

    move-result-object v0

    sput-object v0, Lcom/microblink/internal/services/ServiceGenerator;->retrofitShort:Lretrofit2/Retrofit;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createService(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Class;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TS;>;)TS;"
        }
    .end annotation

    sget-object v0, Lcom/microblink/internal/services/ServiceGenerator;->retrofit:Lretrofit2/Retrofit;

    invoke-virtual {v0, p0}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static createShortService(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Class;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TS;>;)TS;"
        }
    .end annotation

    sget-object v0, Lcom/microblink/internal/services/ServiceGenerator;->retrofitShort:Lretrofit2/Retrofit;

    invoke-virtual {v0, p0}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static gson()Lcom/google/gson/Gson;
    .locals 3

    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    const-class v1, Lcom/microblink/FloatType;

    new-instance v2, Lcom/microblink/internal/services/FloatValueTypeConverter;

    invoke-direct {v2}, Lcom/microblink/internal/services/FloatValueTypeConverter;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    const-class v1, Lcom/microblink/StringType;

    new-instance v2, Lcom/microblink/internal/services/StringValueTypeConverter;

    invoke-direct {v2}, Lcom/microblink/internal/services/StringValueTypeConverter;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    const-class v1, Lcom/microblink/IntType;

    new-instance v2, Lcom/microblink/internal/services/IntValueTypeConverter;

    invoke-direct {v2}, Lcom/microblink/internal/services/IntValueTypeConverter;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    return-object v0
.end method

.method private static retrofit(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit;
    .locals 1
    .param p0    # Lokhttp3/OkHttpClient;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lretrofit2/Retrofit$Builder;

    invoke-direct {v0}, Lretrofit2/Retrofit$Builder;-><init>()V

    invoke-virtual {v0, p0}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    move-result-object p0

    invoke-static {}, Lretrofit2/converter/scalars/ScalarsConverterFactory;->create()Lretrofit2/converter/scalars/ScalarsConverterFactory;

    move-result-object v0

    invoke-virtual {p0, v0}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object p0

    invoke-static {}, Lcom/microblink/internal/services/ServiceGenerator;->gson()Lcom/google/gson/Gson;

    move-result-object v0

    invoke-static {v0}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Lcom/google/gson/Gson;)Lretrofit2/converter/gson/GsonConverterFactory;

    move-result-object v0

    invoke-virtual {p0, v0}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object p0

    const-string v0, "https://licensing.blinkreceipt.com"

    invoke-virtual {p0, v0}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    move-result-object p0

    return-object p0
.end method
