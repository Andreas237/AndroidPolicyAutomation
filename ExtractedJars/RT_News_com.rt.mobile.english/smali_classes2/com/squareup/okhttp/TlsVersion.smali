.class public final enum Lcom/squareup/okhttp/TlsVersion;
.super Ljava/lang/Enum;
.source "TlsVersion.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/squareup/okhttp/TlsVersion;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/squareup/okhttp/TlsVersion;

.field public static final enum SSL_3_0:Lcom/squareup/okhttp/TlsVersion;

.field public static final enum TLS_1_0:Lcom/squareup/okhttp/TlsVersion;

.field public static final enum TLS_1_1:Lcom/squareup/okhttp/TlsVersion;

.field public static final enum TLS_1_2:Lcom/squareup/okhttp/TlsVersion;


# instance fields
.field final javaName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 25
    new-instance v0, Lcom/squareup/okhttp/TlsVersion;

    const-string v1, "TLS_1_2"

    const-string v2, "TLSv1.2"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/squareup/okhttp/TlsVersion;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/squareup/okhttp/TlsVersion;->TLS_1_2:Lcom/squareup/okhttp/TlsVersion;

    .line 26
    new-instance v0, Lcom/squareup/okhttp/TlsVersion;

    const-string v1, "TLS_1_1"

    const-string v2, "TLSv1.1"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/squareup/okhttp/TlsVersion;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/squareup/okhttp/TlsVersion;->TLS_1_1:Lcom/squareup/okhttp/TlsVersion;

    .line 27
    new-instance v0, Lcom/squareup/okhttp/TlsVersion;

    const-string v1, "TLS_1_0"

    const-string v2, "TLSv1"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/squareup/okhttp/TlsVersion;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/squareup/okhttp/TlsVersion;->TLS_1_0:Lcom/squareup/okhttp/TlsVersion;

    .line 28
    new-instance v0, Lcom/squareup/okhttp/TlsVersion;

    const-string v1, "SSL_3_0"

    const-string v2, "SSLv3"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/squareup/okhttp/TlsVersion;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/squareup/okhttp/TlsVersion;->SSL_3_0:Lcom/squareup/okhttp/TlsVersion;

    const/4 v0, 0x4

    .line 24
    new-array v0, v0, [Lcom/squareup/okhttp/TlsVersion;

    sget-object v1, Lcom/squareup/okhttp/TlsVersion;->TLS_1_2:Lcom/squareup/okhttp/TlsVersion;

    aput-object v1, v0, v3

    sget-object v1, Lcom/squareup/okhttp/TlsVersion;->TLS_1_1:Lcom/squareup/okhttp/TlsVersion;

    aput-object v1, v0, v4

    sget-object v1, Lcom/squareup/okhttp/TlsVersion;->TLS_1_0:Lcom/squareup/okhttp/TlsVersion;

    aput-object v1, v0, v5

    sget-object v1, Lcom/squareup/okhttp/TlsVersion;->SSL_3_0:Lcom/squareup/okhttp/TlsVersion;

    aput-object v1, v0, v6

    sput-object v0, Lcom/squareup/okhttp/TlsVersion;->$VALUES:[Lcom/squareup/okhttp/TlsVersion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 33
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 34
    iput-object p3, p0, Lcom/squareup/okhttp/TlsVersion;->javaName:Ljava/lang/String;

    return-void
.end method

.method public static forJavaName(Ljava/lang/String;)Lcom/squareup/okhttp/TlsVersion;
    .locals 3

    .line 38
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "TLSv1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :sswitch_1
    const-string v0, "SSLv3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_2
    const-string v0, "TLSv1.2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_3
    const-string v0, "TLSv1.1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected TLS version: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 42
    :pswitch_0
    sget-object p0, Lcom/squareup/okhttp/TlsVersion;->SSL_3_0:Lcom/squareup/okhttp/TlsVersion;

    return-object p0

    .line 41
    :pswitch_1
    sget-object p0, Lcom/squareup/okhttp/TlsVersion;->TLS_1_0:Lcom/squareup/okhttp/TlsVersion;

    return-object p0

    .line 40
    :pswitch_2
    sget-object p0, Lcom/squareup/okhttp/TlsVersion;->TLS_1_1:Lcom/squareup/okhttp/TlsVersion;

    return-object p0

    .line 39
    :pswitch_3
    sget-object p0, Lcom/squareup/okhttp/TlsVersion;->TLS_1_2:Lcom/squareup/okhttp/TlsVersion;

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1dfc3f27 -> :sswitch_3
        -0x1dfc3f26 -> :sswitch_2
        0x4b88569 -> :sswitch_1
        0x4c38896 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/squareup/okhttp/TlsVersion;
    .locals 1

    .line 24
    const-class v0, Lcom/squareup/okhttp/TlsVersion;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/squareup/okhttp/TlsVersion;

    return-object p0
.end method

.method public static values()[Lcom/squareup/okhttp/TlsVersion;
    .locals 1

    .line 24
    sget-object v0, Lcom/squareup/okhttp/TlsVersion;->$VALUES:[Lcom/squareup/okhttp/TlsVersion;

    invoke-virtual {v0}, [Lcom/squareup/okhttp/TlsVersion;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/okhttp/TlsVersion;

    return-object v0
.end method
