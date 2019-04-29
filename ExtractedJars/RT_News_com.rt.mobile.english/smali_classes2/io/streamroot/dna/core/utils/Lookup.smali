.class public final Lio/streamroot/dna/core/utils/Lookup;
.super Ljava/lang/Object;
.source "Lookup.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/streamroot/dna/core/utils/Lookup;",
        "",
        "()V",
        "streamrootKey",
        "",
        "context",
        "Landroid/content/Context;",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/streamroot/dna/core/utils/Lookup;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 6
    new-instance v0, Lio/streamroot/dna/core/utils/Lookup;

    invoke-direct {v0}, Lio/streamroot/dna/core/utils/Lookup;-><init>()V

    sput-object v0, Lio/streamroot/dna/core/utils/Lookup;->INSTANCE:Lio/streamroot/dna/core/utils/Lookup;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final streamrootKey(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    sget-object v0, Lio/streamroot/dna/core/utils/ManifestMetaDataLookup;->INSTANCE:Lio/streamroot/dna/core/utils/ManifestMetaDataLookup;

    const-string v1, "io.streamroot.dna.StreamrootKey"

    invoke-virtual {v0, p1, v1}, Lio/streamroot/dna/core/utils/ManifestMetaDataLookup;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
