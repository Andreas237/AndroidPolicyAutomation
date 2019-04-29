.class final Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;
.super Ljava/lang/Object;
.source "InMemoryCookieJar.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/core/utils/InMemoryCookieJar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "CookieKey"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;",
        "",
        "cookie",
        "Lokhttp3/Cookie;",
        "(Lokhttp3/Cookie;)V",
        "domain",
        "",
        "kotlin.jvm.PlatformType",
        "name",
        "path",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final domain:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final path:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lokhttp3/Cookie;)V
    .locals 1
    .param p1    # Lokhttp3/Cookie;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cookie"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-virtual {p1}, Lokhttp3/Cookie;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;->name:Ljava/lang/String;

    .line 32
    invoke-virtual {p1}, Lokhttp3/Cookie;->domain()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;->domain:Ljava/lang/String;

    .line 33
    invoke-virtual {p1}, Lokhttp3/Cookie;->path()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;->path:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 36
    move-object v0, p0

    check-cast v0, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;

    const/4 v1, 0x1

    if-ne v0, p1, :cond_0

    return v1

    .line 37
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    if-nez p1, :cond_3

    .line 39
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type io.streamroot.dna.core.utils.InMemoryCookieJar.CookieKey"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    check-cast p1, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;

    .line 41
    iget-object v0, p0, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;->name:Ljava/lang/String;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_4

    return v2

    .line 42
    :cond_4
    iget-object v0, p0, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;->domain:Ljava/lang/String;

    iget-object v3, p1, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;->domain:Ljava/lang/String;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_5

    return v2

    .line 43
    :cond_5
    iget-object v0, p0, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;->path:Ljava/lang/String;

    iget-object p1, p1, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;->path:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v1

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v1
.end method

.method public hashCode()I
    .locals 4

    .line 49
    iget-object v0, p0, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;->name:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    .line 50
    iget-object v3, p0, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;->domain:Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v2, v0

    .line 51
    iget-object v0, p0, Lio/streamroot/dna/core/utils/InMemoryCookieJar$CookieKey;->path:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v2, v1

    return v2
.end method
