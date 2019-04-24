.class final Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$4;
.super Lkotlin/jvm/internal/Lambda;
.source "CapabilitiesProvider.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/capability/provide/CapabilitiesProviderKt;->getCapabilities(Lio/fotoapparat/parameter/SupportedParameters;)Lio/fotoapparat/capability/Capabilities;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "[I",
        "Lio/fotoapparat/parameter/FpsRange;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lio/fotoapparat/parameter/FpsRange;",
        "it",
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
.field public static final INSTANCE:Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$4;

    invoke-direct {v0}, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$4;-><init>()V

    sput-object v0, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$4;->INSTANCE:Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$4;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke([I)Lio/fotoapparat/parameter/FpsRange;
    .locals 1
    .param p1    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-static {p1}, Lio/fotoapparat/parameter/camera/convert/FpsRangeConverterKt;->toFpsRange([I)Lio/fotoapparat/parameter/FpsRange;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [I

    invoke-virtual {p0, p1}, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$4;->invoke([I)Lio/fotoapparat/parameter/FpsRange;

    move-result-object p1

    return-object p1
.end method
