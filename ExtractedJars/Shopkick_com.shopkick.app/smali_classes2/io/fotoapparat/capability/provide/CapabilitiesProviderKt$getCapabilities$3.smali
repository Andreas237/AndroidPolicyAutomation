.class final Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$3;
.super Lkotlin/jvm/internal/FunctionReference;
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
        "Lkotlin/jvm/internal/FunctionReference;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lio/fotoapparat/parameter/AntiBandingMode;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lio/fotoapparat/parameter/AntiBandingMode;",
        "p1",
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
.field public static final INSTANCE:Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$3;

    invoke-direct {v0}, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$3;-><init>()V

    sput-object v0, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$3;->INSTANCE:Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$3;

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

    const-string/jumbo v0, "toAntiBandingMode"

    return-object v0
.end method

.method public final getOwner()Lkotlin/reflect/KDeclarationContainer;
    .locals 2

    const-class v0, Lio/fotoapparat/parameter/camera/convert/AntiBandingConverterKt;

    const-string v1, "fotoapparat_release"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinPackage(Ljava/lang/Class;Ljava/lang/String;)Lkotlin/reflect/KDeclarationContainer;

    move-result-object v0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "toAntiBandingMode(Ljava/lang/String;)Lio/fotoapparat/parameter/AntiBandingMode;"

    return-object v0
.end method

.method public final invoke(Ljava/lang/String;)Lio/fotoapparat/parameter/AntiBandingMode;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "p1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-static {p1}, Lio/fotoapparat/parameter/camera/convert/AntiBandingConverterKt;->toAntiBandingMode(Ljava/lang/String;)Lio/fotoapparat/parameter/AntiBandingMode;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/fotoapparat/capability/provide/CapabilitiesProviderKt$getCapabilities$3;->invoke(Ljava/lang/String;)Lio/fotoapparat/parameter/AntiBandingMode;

    move-result-object p1

    return-object p1
.end method
