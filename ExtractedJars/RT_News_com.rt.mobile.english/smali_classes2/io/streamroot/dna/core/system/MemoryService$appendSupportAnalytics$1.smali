.class final Lio/streamroot/dna/core/system/MemoryService$appendSupportAnalytics$1;
.super Lkotlin/jvm/internal/Lambda;
.source "MemoryService.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/system/MemoryService;->appendSupportAnalytics(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lorg/json/JSONObject;",
        "Lkotlin/Unit;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lorg/json/JSONObject;",
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
.field final synthetic this$0:Lio/streamroot/dna/core/system/MemoryService;


# direct methods
.method constructor <init>(Lio/streamroot/dna/core/system/MemoryService;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/system/MemoryService$appendSupportAnalytics$1;->this$0:Lio/streamroot/dna/core/system/MemoryService;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 15
    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/system/MemoryService$appendSupportAnalytics$1;->invoke(Lorg/json/JSONObject;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device"

    .line 77
    new-instance v1, Lio/streamroot/dna/core/system/MemoryService$appendSupportAnalytics$1$1;

    invoke-direct {v1, p0}, Lio/streamroot/dna/core/system/MemoryService$appendSupportAnalytics$1$1;-><init>(Lio/streamroot/dna/core/system/MemoryService$appendSupportAnalytics$1;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->insert(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
