.class final Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpsURLConnection;
.super Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;
.source "JavaApiConverter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/huc/JavaApiConverter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "CacheHttpsURLConnection"
.end annotation


# instance fields
.field private final delegate:Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;)V
    .locals 0

    .line 629
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/huc/DelegatingHttpsURLConnection;-><init>(Ljava/net/HttpURLConnection;)V

    .line 630
    iput-object p1, p0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpsURLConnection;->delegate:Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;

    return-void
.end method


# virtual methods
.method public getContentLengthLong()J
    .locals 2

    .line 654
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpsURLConnection;->delegate:Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;->getContentLengthLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public getHeaderFieldLong(Ljava/lang/String;J)J
    .locals 1

    .line 662
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpsURLConnection;->delegate:Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;

    invoke-virtual {v0, p1, p2, p3}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;->getHeaderFieldLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 642
    invoke-static {}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->access$400()Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0
.end method

.method public getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 650
    invoke-static {}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->access$400()Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0
.end method

.method protected handshake()Lcom/squareup/okhttp/Handshake;
    .locals 1

    .line 634
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpsURLConnection;->delegate:Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;->access$300(Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;)Lcom/squareup/okhttp/Response;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Response;->handshake()Lcom/squareup/okhttp/Handshake;

    move-result-object v0

    return-object v0
.end method

.method public setFixedLengthStreamingMode(J)V
    .locals 1

    .line 658
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpsURLConnection;->delegate:Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$CacheHttpURLConnection;->setFixedLengthStreamingMode(J)V

    return-void
.end method

.method public setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 0

    .line 638
    invoke-static {}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->access$000()Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method

.method public setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 0

    .line 646
    invoke-static {}, Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->access$000()Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method
