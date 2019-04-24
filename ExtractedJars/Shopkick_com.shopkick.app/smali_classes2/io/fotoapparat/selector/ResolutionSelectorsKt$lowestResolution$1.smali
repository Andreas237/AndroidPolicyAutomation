.class final Lio/fotoapparat/selector/ResolutionSelectorsKt$lowestResolution$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ResolutionSelectors.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/selector/ResolutionSelectorsKt;->lowestResolution()Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Iterable<",
        "+",
        "Lio/fotoapparat/parameter/Resolution;",
        ">;",
        "Lio/fotoapparat/parameter/Resolution;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nResolutionSelectors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolutionSelectors.kt\nio/fotoapparat/selector/ResolutionSelectorsKt$lowestResolution$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1715#2,13:16\n*E\n*S KotlinDebug\n*F\n+ 1 ResolutionSelectors.kt\nio/fotoapparat/selector/ResolutionSelectorsKt$lowestResolution$1\n*L\n15#1,13:16\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "Lio/fotoapparat/parameter/Resolution;",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/fotoapparat/selector/ResolutionSelectorsKt$lowestResolution$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/fotoapparat/selector/ResolutionSelectorsKt$lowestResolution$1;

    invoke-direct {v0}, Lio/fotoapparat/selector/ResolutionSelectorsKt$lowestResolution$1;-><init>()V

    sput-object v0, Lio/fotoapparat/selector/ResolutionSelectorsKt$lowestResolution$1;->INSTANCE:Lio/fotoapparat/selector/ResolutionSelectorsKt$lowestResolution$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Iterable;)Lio/fotoapparat/parameter/Resolution;
    .locals 4
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lio/fotoapparat/parameter/Resolution;",
            ">;)",
            "Lio/fotoapparat/parameter/Resolution;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    .line 18
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 19
    move-object v1, v0

    check-cast v1, Lio/fotoapparat/parameter/Resolution;

    .line 15
    invoke-virtual {v1}, Lio/fotoapparat/parameter/Resolution;->getArea()I

    move-result v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 22
    move-object v3, v2

    check-cast v3, Lio/fotoapparat/parameter/Resolution;

    .line 15
    invoke-virtual {v3}, Lio/fotoapparat/parameter/Resolution;->getArea()I

    move-result v3

    if-le v1, v3, :cond_1

    move-object v0, v2

    move v1, v3

    goto :goto_0

    :cond_2
    move-object p1, v0

    .line 28
    :goto_1
    check-cast p1, Lio/fotoapparat/parameter/Resolution;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p1}, Lio/fotoapparat/selector/ResolutionSelectorsKt$lowestResolution$1;->invoke(Ljava/lang/Iterable;)Lio/fotoapparat/parameter/Resolution;

    move-result-object p1

    return-object p1
.end method
