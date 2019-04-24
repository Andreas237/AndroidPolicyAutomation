.class final Lcom/google/android/gms/internal/measurement/zzco;
.super Lcom/google/android/gms/internal/measurement/zzar;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final zzabb:[B


# instance fields
.field private final zzaaz:Ljava/lang/String;

.field private final zzaba:Lcom/google/android/gms/internal/measurement/zzcz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\n"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzco;->zzabb:[B

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzat;)V
    .locals 9

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzar;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    const-string v0, "GoogleAnalytics"

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzas;->VERSION:Ljava/lang/String;

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzdd;->zza(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v5, Landroid/os/Build;->ID:Ljava/lang/String;

    const-string v6, "%s/%s (Linux; U; Android %s; %s; %s Build/%s)"

    const/4 v7, 0x6

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v0, v7, v8

    const/4 v0, 0x1

    aput-object v1, v7, v0

    const/4 v0, 0x2

    aput-object v2, v7, v0

    const/4 v0, 0x3

    aput-object v3, v7, v0

    const/4 v0, 0x4

    aput-object v4, v7, v0

    const/4 v0, 0x5

    aput-object v5, v7, v0

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzco;->zzaaz:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcz;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzat;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/zzcz;-><init>(Lcom/google/android/gms/common/util/Clock;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzco;->zzaba:Lcom/google/android/gms/internal/measurement/zzcz;

    return-void
.end method

.method private final zza(Ljava/net/URL;)I
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "GET request"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzco;->zzb(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Ljava/net/HttpURLConnection;)V

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    const/16 v1, 0xc8

    if-ne p1, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzby()Lcom/google/android/gms/internal/measurement/zzai;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzai;->zzbr()V

    :cond_0
    const-string v1, "GET status"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzaq;->zzb(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1
    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    const-string v1, "Network GET connection error"

    invoke-virtual {p0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzd(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_2
    const/4 p1, 0x0

    return p1

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_3
    throw p1
.end method

.method private final zza(Ljava/net/URL;[B)I
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "POST bytes, url"

    array-length v1, p2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzb(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzco;->zzcg()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Post payload\n"

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzco;->zzb(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    :try_start_1
    invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    array-length v1, p2

    invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->connect()V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/io/OutputStream;->write([B)V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Ljava/net/HttpURLConnection;)V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p2

    const/16 v1, 0xc8

    if-ne p2, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzby()Lcom/google/android/gms/internal/measurement/zzai;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzai;->zzbr()V

    :cond_1
    const-string v1, "POST status"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzaq;->zzb(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v0, :cond_2

    :try_start_2
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Error closing http post connection output stream"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_3
    return p2

    :catch_1
    move-exception p2

    goto :goto_1

    :catchall_0
    move-exception p2

    move-object p1, v0

    goto :goto_3

    :catch_2
    move-exception p2

    move-object p1, v0

    :goto_1
    :try_start_3
    const-string v1, "Network POST connection error"

    invoke-virtual {p0, v1, p2}, Lcom/google/android/gms/internal/measurement/zzaq;->zzd(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_4

    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_2

    :catch_3
    move-exception p2

    const-string v0, "Error closing http post connection output stream"

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    :goto_2
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_5
    const/4 p1, 0x0

    return p1

    :catchall_1
    move-exception p2

    :goto_3
    if-eqz v0, :cond_6

    :try_start_5
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_4

    :catch_4
    move-exception v0

    const-string v1, "Error closing http post connection output stream"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_6
    :goto_4
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_7
    throw p2
.end method

.method private static zza(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x26

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const-string v0, "UTF-8"

    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3d

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p1, "UTF-8"

    invoke-static {p2, p1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private final zza(Ljava/net/HttpURLConnection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v0, 0x400

    :try_start_1
    new-array v0, v0, [B

    :cond_0
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gtz v1, :cond_0

    if-eqz p1, :cond_1

    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Error closing http connection input stream"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    const-string v1, "Error closing http connection input stream"

    invoke-virtual {p0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    :goto_1
    throw v0
.end method

.method private final zzb(Ljava/net/URL;[B)I
    .locals 9

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v2, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v2, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {v2, p2}, Ljava/util/zip/GZIPOutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/util/zip/GZIPOutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    const-string v2, "POST compressed size, ratio %, url"

    array-length v3, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-wide/16 v4, 0x64

    array-length v6, v1

    int-to-long v6, v6

    mul-long v6, v6, v4

    array-length v4, p2

    int-to-long v4, v4

    div-long/2addr v6, v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {p0, v2, v3, v4, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    array-length v2, v1

    array-length v3, p2

    if-le v2, v3, :cond_0

    const-string v2, "Compressed payload is larger then uncompressed. compressed, uncompressed"

    array-length v3, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    array-length v4, p2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzaq;->zzc(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzco;->zzcg()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "Post payload"

    const-string v3, "\n"

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, p2}, Ljava/lang/String;-><init>([B)V

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0, v2, p2}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzco;->zzb(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 p2, 0x1

    :try_start_1
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const-string p2, "Content-Encoding"

    const-string v2, "gzip"

    invoke-virtual {p1, p2, v2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    array-length p2, v1

    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->connect()V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p2, v1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Ljava/net/HttpURLConnection;)V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p2

    const/16 v1, 0xc8

    if-ne p2, v1, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzby()Lcom/google/android/gms/internal/measurement/zzai;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzai;->zzbr()V

    :cond_3
    const-string v1, "POST status"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzaq;->zzb(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_4
    return p2

    :catchall_0
    move-exception v0

    move-object v8, p2

    move-object p2, p1

    move-object p1, v0

    move-object v0, v8

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v8, p2

    move-object p2, p1

    move-object p1, v0

    move-object v0, v8

    goto :goto_1

    :catchall_1
    move-exception p2

    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    goto :goto_3

    :catch_1
    move-exception p2

    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    goto :goto_1

    :catchall_2
    move-exception p1

    move-object p2, v0

    goto :goto_3

    :catch_2
    move-exception p1

    move-object p2, v0

    :goto_1
    :try_start_4
    const-string v1, "Network compressed POST connection error"

    invoke-virtual {p0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzd(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz v0, :cond_5

    :try_start_5
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_2

    :catch_3
    move-exception p1

    const-string v0, "Error closing http compressed post connection output stream"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    :goto_2
    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_6
    const/4 p1, 0x0

    return p1

    :catchall_3
    move-exception p1

    :goto_3
    if-eqz v0, :cond_7

    :try_start_6
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_4

    :catch_4
    move-exception v0

    const-string v1, "Error closing http compressed post connection output stream"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_7
    :goto_4
    if-eqz p2, :cond_8

    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_8
    throw p1
.end method

.method private final zzb(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 2
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/URLConnectionInstrumentation;->openConnection(Ljava/net/URLConnection;)Ljava/net/URLConnection;

    move-result-object p1

    instance-of v0, p1, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/net/HttpURLConnection;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDefaultUseCaches(Z)V

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzcc;->zzzo:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzcc;->zzzp:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const-string v0, "User-Agent"

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzco;->zzaaz:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Failed to obtain http connection"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final zzb(Lcom/google/android/gms/internal/measurement/zzch;Ljava/lang/String;)Ljava/net/URL;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzch;->zzep()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzdz()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzeb()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzea()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzeb()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v1, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_0
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "?"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :try_start_0
    new-instance p2, Ljava/net/URL;

    invoke-direct {p2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    const-string p2, "Error trying to parse the hardcoded host url"

    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private final zzd(Lcom/google/android/gms/internal/measurement/zzch;)Ljava/net/URL;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzch;->zzep()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzdz()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzeb()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_1
    move-object p1, v0

    goto :goto_2

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzea()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzeb()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :goto_2
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    const-string v0, "Error trying to parse the hardcoded host url"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private final zzey()Ljava/net/URL;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzdz()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzcc;->zzzd:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    const-string v1, "Error trying to parse the hardcoded host url"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic zzez()[B
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzco;->zzabb:[B

    return-object v0
.end method


# virtual methods
.method final zza(Lcom/google/android/gms/internal/measurement/zzch;Z)Ljava/lang/String;
    .locals 5
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzch;->zzcs()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "ht"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "qt"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "AppUID"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "z"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "_gmsv"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v3, v2}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v1, "ht"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzch;->zzen()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbt()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzch;->zzen()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-string v3, "qt"

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzch;->zzeq()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p2, v1, v3

    if-eqz p2, :cond_2

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzch;->zzem()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    :goto_1
    const-string p2, "z"

    invoke-static {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string p2, "Failed to encode name or value"

    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected final zzac()V
    .locals 2

    const-string v0, "Network initialized. User agent"

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzco;->zzaaz:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzb(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzch;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbv()Lcom/google/android/gms/internal/measurement/zzbu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzbu;->zzec()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzco;->zzaba:Lcom/google/android/gms/internal/measurement/zzcz;

    sget-object v3, Lcom/google/android/gms/internal/measurement/zzcc;->zzzm:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v3, v3

    const-wide/16 v5, 0x3e8

    mul-long v3, v3, v5

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/measurement/zzcz;->zzj(J)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzcc;->zzzf:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzbk;->zzz(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzbk;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/internal/measurement/zzbk;->zzxl:Lcom/google/android/gms/internal/measurement/zzbk;

    if-eq v0, v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sget-object v3, Lcom/google/android/gms/internal/measurement/zzcc;->zzzg:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzbq;->zzaa(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzbq;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/measurement/zzbq;->zzxw:Lcom/google/android/gms/internal/measurement/zzbq;

    if-ne v3, v4, :cond_3

    move v3, v0

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x0

    :cond_3
    move v3, v0

    const/4 v0, 0x0

    :goto_2
    const/16 v4, 0xc8

    if-eqz v3, :cond_a

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v2

    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(Z)V

    const-string v1, "Uploading batched hits. compression, count"

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzcp;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/measurement/zzcp;-><init>(Lcom/google/android/gms/internal/measurement/zzco;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzch;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/zzcp;->zze(Lcom/google/android/gms/internal/measurement/zzch;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzch;->zzem()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzcp;->zzfa()I

    move-result p1

    if-nez p1, :cond_5

    return-object v2

    :cond_5
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzco;->zzey()Ljava/net/URL;

    move-result-object p1

    if-nez p1, :cond_6

    const-string p1, "Failed to build batching endpoint url"

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzu(Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    if-eqz v0, :cond_7

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzcp;->getPayload()[B

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzco;->zzb(Ljava/net/URL;[B)I

    move-result p1

    goto :goto_4

    :cond_7
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzcp;->getPayload()[B

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Ljava/net/URL;[B)I

    move-result p1

    :goto_4
    if-ne v4, p1, :cond_8

    const-string p1, "Batched upload completed. Hits batched"

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzcp;->zzfa()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v2

    :cond_8
    const-string v0, "Network error uploading hits. status code"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbv()Lcom/google/android/gms/internal/measurement/zzbu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzbu;->zzec()Ljava/util/Set;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    const-string p1, "Server instructed the client to stop batching"

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zzt(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzco;->zzaba:Lcom/google/android/gms/internal/measurement/zzcz;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzcz;->start()V

    :cond_9
    :goto_5
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzch;

    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzch;->zzep()Z

    move-result v5

    xor-int/2addr v5, v2

    invoke-virtual {p0, v3, v5}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Lcom/google/android/gms/internal/measurement/zzch;Z)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_c

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v5

    const-string v6, "Error formatting hit for upload"

    :goto_6
    invoke-virtual {v5, v3, v6}, Lcom/google/android/gms/internal/measurement/zzcm;->zza(Lcom/google/android/gms/internal/measurement/zzch;Ljava/lang/String;)V

    :goto_7
    const/4 v5, 0x1

    goto :goto_b

    :cond_c
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    sget-object v7, Lcom/google/android/gms/internal/measurement/zzcc;->zzze:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-gt v6, v7, :cond_f

    invoke-direct {p0, v3, v5}, Lcom/google/android/gms/internal/measurement/zzco;->zzb(Lcom/google/android/gms/internal/measurement/zzch;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v5

    if-nez v5, :cond_d

    const-string v5, "Failed to build collect GET endpoint url"

    :goto_8
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zzu(Ljava/lang/String;)V

    goto :goto_a

    :cond_d
    invoke-direct {p0, v5}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Ljava/net/URL;)I

    move-result v5

    if-ne v5, v4, :cond_e

    :goto_9
    goto :goto_7

    :cond_e
    :goto_a
    const/4 v5, 0x0

    goto :goto_b

    :cond_f
    invoke-virtual {p0, v3, v1}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Lcom/google/android/gms/internal/measurement/zzch;Z)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_10

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v5

    const-string v6, "Error formatting hit for POST upload"

    goto :goto_6

    :cond_10
    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    array-length v6, v5

    sget-object v7, Lcom/google/android/gms/internal/measurement/zzcc;->zzzj:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-le v6, v7, :cond_11

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v5

    const-string v6, "Hit payload exceeds size limit"

    goto :goto_6

    :cond_11
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/measurement/zzco;->zzd(Lcom/google/android/gms/internal/measurement/zzch;)Ljava/net/URL;

    move-result-object v6

    if-nez v6, :cond_12

    const-string v5, "Failed to build collect POST endpoint url"

    goto :goto_8

    :cond_12
    invoke-direct {p0, v6, v5}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Ljava/net/URL;[B)I

    move-result v5

    if-ne v5, v4, :cond_e

    goto :goto_9

    :goto_b
    if-eqz v5, :cond_13

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/zzch;->zzem()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzdx()I

    move-result v5

    if-lt v3, v5, :cond_b

    :cond_13
    return-object v0
.end method

.method public final zzex()Z
    .locals 2

    invoke-static {}, Lcom/google/android/gms/analytics/zzk;->zzab()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    :try_start_0
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_1
    const-string v0, "No network connectivity"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzq(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method
