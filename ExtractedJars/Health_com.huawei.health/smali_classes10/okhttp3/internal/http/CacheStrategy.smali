.class public final Lokhttp3/internal/http/CacheStrategy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http/CacheStrategy$Factory;
    }
.end annotation


# instance fields
.field public final cacheResponse:Lokhttp3/Response;

.field public final networkRequest:Lokhttp3/Request;


# direct methods
.method private constructor <init>(Lokhttp3/Request;Lokhttp3/Response;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lokhttp3/internal/http/CacheStrategy;->networkRequest:Lokhttp3/Request;

    .line 54
    iput-object p2, p0, Lokhttp3/internal/http/CacheStrategy;->cacheResponse:Lokhttp3/Response;

    .line 55
    return-void
.end method

.method synthetic constructor <init>(Lokhttp3/Request;Lokhttp3/Response;Lokhttp3/internal/http/CacheStrategy$1;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/http/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;)V

    return-void
.end method

.method public static isCacheable(Lokhttp3/Response;Lokhttp3/Request;)Z
    .locals 2

    .line 61
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 74
    :sswitch_0
    goto :goto_1

    .line 81
    :sswitch_1
    const-string v0, "Expires"

    invoke-virtual {p0, v0}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 82
    invoke-virtual {p0}, Lokhttp3/Response;->cacheControl()Lokhttp3/CacheControl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/CacheControl;->maxAgeSeconds()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 83
    invoke-virtual {p0}, Lokhttp3/Response;->cacheControl()Lokhttp3/CacheControl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/CacheControl;->isPublic()Z

    move-result v0

    if-nez v0, :cond_1

    .line 84
    invoke-virtual {p0}, Lokhttp3/Response;->cacheControl()Lokhttp3/CacheControl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/CacheControl;->isPrivate()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    goto :goto_1

    .line 91
    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 95
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lokhttp3/Response;->cacheControl()Lokhttp3/CacheControl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/CacheControl;->noStore()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lokhttp3/Request;->cacheControl()Lokhttp3/CacheControl;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/CacheControl;->noStore()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return v0

    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_0
        0xcb -> :sswitch_0
        0xcc -> :sswitch_0
        0x12c -> :sswitch_0
        0x12d -> :sswitch_0
        0x12e -> :sswitch_1
        0x133 -> :sswitch_1
        0x134 -> :sswitch_0
        0x194 -> :sswitch_0
        0x195 -> :sswitch_0
        0x19a -> :sswitch_0
        0x19e -> :sswitch_0
        0x1f5 -> :sswitch_0
    .end sparse-switch
.end method
