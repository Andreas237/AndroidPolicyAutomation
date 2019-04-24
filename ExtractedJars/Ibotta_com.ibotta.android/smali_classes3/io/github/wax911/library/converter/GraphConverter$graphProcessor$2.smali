.class final Lio/github/wax911/library/converter/GraphConverter$graphProcessor$2;
.super Lkotlin/jvm/internal/Lambda;
.source "GraphConverter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/wax911/library/converter/GraphConverter;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/github/wax911/library/annotation/processor/GraphProcessor;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lio/github/wax911/library/annotation/processor/GraphProcessor;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lio/github/wax911/library/converter/GraphConverter$graphProcessor$2;->$context:Landroid/content/Context;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lio/github/wax911/library/annotation/processor/GraphProcessor;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 31
    sget-object v0, Lio/github/wax911/library/annotation/processor/GraphProcessor;->Companion:Lio/github/wax911/library/annotation/processor/GraphProcessor$Companion;

    iget-object v1, p0, Lio/github/wax911/library/converter/GraphConverter$graphProcessor$2;->$context:Landroid/content/Context;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lio/github/wax911/library/annotation/processor/GraphProcessor$Companion;->getInstance(Landroid/content/res/AssetManager;)Lio/github/wax911/library/annotation/processor/GraphProcessor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lio/github/wax911/library/converter/GraphConverter$graphProcessor$2;->invoke()Lio/github/wax911/library/annotation/processor/GraphProcessor;

    move-result-object v0

    return-object v0
.end method
