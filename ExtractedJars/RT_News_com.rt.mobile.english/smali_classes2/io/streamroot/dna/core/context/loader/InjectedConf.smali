.class public final Lio/streamroot/dna/core/context/loader/InjectedConf;
.super Ljava/lang/Object;
.source "Payload.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/streamroot/dna/core/context/loader/InjectedConf;",
        "",
        "confLabel",
        "",
        "nativeConf",
        "Lio/streamroot/dna/core/context/loader/NativeConf;",
        "paConf",
        "Lorg/json/JSONObject;",
        "(Ljava/lang/String;Lio/streamroot/dna/core/context/loader/NativeConf;Lorg/json/JSONObject;)V",
        "getConfLabel",
        "()Ljava/lang/String;",
        "getNativeConf",
        "()Lio/streamroot/dna/core/context/loader/NativeConf;",
        "getPaConf",
        "()Lorg/json/JSONObject;",
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
.field private final confLabel:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nativeConf:Lio/streamroot/dna/core/context/loader/NativeConf;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final paConf:Lorg/json/JSONObject;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/streamroot/dna/core/context/loader/NativeConf;Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/streamroot/dna/core/context/loader/NativeConf;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "confLabel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeConf"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paConf"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/context/loader/InjectedConf;->confLabel:Ljava/lang/String;

    iput-object p2, p0, Lio/streamroot/dna/core/context/loader/InjectedConf;->nativeConf:Lio/streamroot/dna/core/context/loader/NativeConf;

    iput-object p3, p0, Lio/streamroot/dna/core/context/loader/InjectedConf;->paConf:Lorg/json/JSONObject;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/streamroot/dna/core/context/loader/NativeConf;Lorg/json/JSONObject;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 38
    new-instance p2, Lio/streamroot/dna/core/context/loader/NativeConf;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lio/streamroot/dna/core/context/loader/NativeConf;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 39
    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/streamroot/dna/core/context/loader/InjectedConf;-><init>(Ljava/lang/String;Lio/streamroot/dna/core/context/loader/NativeConf;Lorg/json/JSONObject;)V

    return-void
.end method


# virtual methods
.method public final getConfLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 37
    iget-object v0, p0, Lio/streamroot/dna/core/context/loader/InjectedConf;->confLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getNativeConf()Lio/streamroot/dna/core/context/loader/NativeConf;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 38
    iget-object v0, p0, Lio/streamroot/dna/core/context/loader/InjectedConf;->nativeConf:Lio/streamroot/dna/core/context/loader/NativeConf;

    return-object v0
.end method

.method public final getPaConf()Lorg/json/JSONObject;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 39
    iget-object v0, p0, Lio/streamroot/dna/core/context/loader/InjectedConf;->paConf:Lorg/json/JSONObject;

    return-object v0
.end method
