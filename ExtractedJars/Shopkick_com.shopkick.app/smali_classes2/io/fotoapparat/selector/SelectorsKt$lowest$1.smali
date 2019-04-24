.class final Lio/fotoapparat/selector/SelectorsKt$lowest$1;
.super Lkotlin/jvm/internal/FunctionReference;
.source "Selectors.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/selector/SelectorsKt;->lowest()Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReference;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Iterable<",
        "+TT;>;TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u001c\n\u0002\u0008\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u000e\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u0002H\u00010\u00022\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u0002H\u00010\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "T",
        "",
        "p1",
        "",
        "invoke",
        "(Ljava/lang/Iterable;)Ljava/lang/Comparable;"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/fotoapparat/selector/SelectorsKt$lowest$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/fotoapparat/selector/SelectorsKt$lowest$1;

    invoke-direct {v0}, Lio/fotoapparat/selector/SelectorsKt$lowest$1;-><init>()V

    sput-object v0, Lio/fotoapparat/selector/SelectorsKt$lowest$1;->INSTANCE:Lio/fotoapparat/selector/SelectorsKt$lowest$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/FunctionReference;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "min"

    return-object v0
.end method

.method public final getOwner()Lkotlin/reflect/KDeclarationContainer;
    .locals 2

    const-class v0, Lkotlin/collections/CollectionsKt;

    const-string v1, "fotoapparat_release"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinPackage(Ljava/lang/Class;Ljava/lang/String;)Lkotlin/reflect/KDeclarationContainer;

    move-result-object v0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    const-string v0, "min(Ljava/lang/Iterable;)Ljava/lang/Comparable;"

    return-object v0
.end method

.method public final invoke(Ljava/lang/Iterable;)Ljava/lang/Comparable;
    .locals 1
    .param p1    # Ljava/lang/Iterable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+TT;>;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "p1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->min(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p1}, Lio/fotoapparat/selector/SelectorsKt$lowest$1;->invoke(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1
.end method
