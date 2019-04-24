.class public final Lio/github/wax911/library/converter/GraphConverter$Companion;
.super Ljava/lang/Object;
.source "GraphConverter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/wax911/library/converter/GraphConverter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGraphConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphConverter.kt\nio/github/wax911/library/converter/GraphConverter$Companion\n*L\n1#1,110:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008J\u0018\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/github/wax911/library/converter/GraphConverter$Companion;",
        "",
        "()V",
        "MimeType",
        "",
        "create",
        "Lio/github/wax911/library/converter/GraphConverter;",
        "context",
        "Landroid/content/Context;",
        "gson",
        "Lcom/google/gson/Gson;",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Lio/github/wax911/library/converter/GraphConverter$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Landroid/content/Context;)Lio/github/wax911/library/converter/GraphConverter;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 87
    new-instance v0, Lio/github/wax911/library/converter/GraphConverter;

    invoke-direct {v0, p1}, Lio/github/wax911/library/converter/GraphConverter;-><init>(Landroid/content/Context;)V

    .line 88
    new-instance p1, Lcom/google/gson/GsonBuilder;

    invoke-direct {p1}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 89
    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->enableComplexMapKeySerialization()Lcom/google/gson/GsonBuilder;

    move-result-object p1

    .line 90
    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->serializeNulls()Lcom/google/gson/GsonBuilder;

    move-result-object p1

    .line 91
    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->setLenient()Lcom/google/gson/GsonBuilder;

    move-result-object p1

    .line 92
    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object p1

    const-string v1, "GsonBuilder()\n          \u2026                .create()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lio/github/wax911/library/converter/GraphConverter;->setGson(Lcom/google/gson/Gson;)V

    return-object v0
.end method
