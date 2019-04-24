.class public Lio/github/wax911/library/converter/GraphConverter;
.super Lretrofit2/Converter$Factory;
.source "GraphConverter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/wax911/library/converter/GraphConverter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGraphConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphConverter.kt\nio/github/wax911/library/converter/GraphConverter\n*L\n1#1,110:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\u0008\u0004\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004JK\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016\u00a2\u0006\u0002\u0010\u001dJ9\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0002\u0008\u0003\u0018\u00010\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0016\u00a2\u0006\u0002\u0010!R\u001b\u0010\u0005\u001a\u00020\u00068DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000b\u001a\u00020\u000cX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u00a8\u0006#"
    }
    d2 = {
        "Lio/github/wax911/library/converter/GraphConverter;",
        "Lretrofit2/Converter$Factory;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "graphProcessor",
        "Lio/github/wax911/library/annotation/processor/GraphProcessor;",
        "getGraphProcessor",
        "()Lio/github/wax911/library/annotation/processor/GraphProcessor;",
        "graphProcessor$delegate",
        "Lkotlin/Lazy;",
        "gson",
        "Lcom/google/gson/Gson;",
        "getGson",
        "()Lcom/google/gson/Gson;",
        "setGson",
        "(Lcom/google/gson/Gson;)V",
        "requestBodyConverter",
        "Lretrofit2/Converter;",
        "Lio/github/wax911/library/model/request/QueryContainerBuilder;",
        "Lokhttp3/RequestBody;",
        "type",
        "Ljava/lang/reflect/Type;",
        "parameterAnnotations",
        "",
        "",
        "methodAnnotations",
        "retrofit",
        "Lretrofit2/Retrofit;",
        "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;",
        "responseBodyConverter",
        "Lokhttp3/ResponseBody;",
        "annotations",
        "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;",
        "Companion",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;

.field public static final Companion:Lio/github/wax911/library/converter/GraphConverter$Companion;


# instance fields
.field private final graphProcessor$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field protected gson:Lcom/google/gson/Gson;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/PropertyReference1Impl;

    const-class v2, Lio/github/wax911/library/converter/GraphConverter;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    const-string v3, "graphProcessor"

    const-string v4, "getGraphProcessor()Lio/github/wax911/library/annotation/processor/GraphProcessor;"

    invoke-direct {v1, v2, v3, v4}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lio/github/wax911/library/converter/GraphConverter;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    new-instance v0, Lio/github/wax911/library/converter/GraphConverter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/wax911/library/converter/GraphConverter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/github/wax911/library/converter/GraphConverter;->Companion:Lio/github/wax911/library/converter/GraphConverter$Companion;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 28
    invoke-direct {p0}, Lretrofit2/Converter$Factory;-><init>()V

    .line 30
    new-instance v0, Lio/github/wax911/library/converter/GraphConverter$graphProcessor$2;

    invoke-direct {v0, p1}, Lio/github/wax911/library/converter/GraphConverter$graphProcessor$2;-><init>(Landroid/content/Context;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lio/github/wax911/library/converter/GraphConverter;->graphProcessor$delegate:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method protected final getGraphProcessor()Lio/github/wax911/library/annotation/processor/GraphProcessor;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lio/github/wax911/library/converter/GraphConverter;->graphProcessor$delegate:Lkotlin/Lazy;

    sget-object v1, Lio/github/wax911/library/converter/GraphConverter;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/wax911/library/annotation/processor/GraphProcessor;

    return-object v0
.end method

.method public requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;
    .locals 1
    .param p1    # Ljava/lang/reflect/Type;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/annotation/Annotation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [Ljava/lang/annotation/Annotation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lretrofit2/Retrofit;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lretrofit2/Retrofit;",
            ")",
            "Lretrofit2/Converter<",
            "Lio/github/wax911/library/model/request/QueryContainerBuilder;",
            "Lokhttp3/RequestBody;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string p1, "parameterAnnotations"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "methodAnnotations"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    new-instance p1, Lio/github/wax911/library/converter/request/GraphRequestConverter;

    invoke-virtual {p0}, Lio/github/wax911/library/converter/GraphConverter;->getGraphProcessor()Lio/github/wax911/library/annotation/processor/GraphProcessor;

    move-result-object p2

    iget-object p4, p0, Lio/github/wax911/library/converter/GraphConverter;->gson:Lcom/google/gson/Gson;

    if-nez p4, :cond_0

    const-string v0, "gson"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-direct {p1, p3, p2, p4}, Lio/github/wax911/library/converter/request/GraphRequestConverter;-><init>([Ljava/lang/annotation/Annotation;Lio/github/wax911/library/annotation/processor/GraphProcessor;Lcom/google/gson/Gson;)V

    check-cast p1, Lretrofit2/Converter;

    return-object p1
.end method

.method public responseBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;
    .locals 1
    .param p1    # Ljava/lang/reflect/Type;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/annotation/Annotation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lretrofit2/Retrofit;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "Lretrofit2/Retrofit;",
            ")",
            "Lretrofit2/Converter<",
            "Lokhttp3/ResponseBody;",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "annotations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retrofit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    instance-of v0, p1, Lokhttp3/ResponseBody;

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Lretrofit2/Converter$Factory;->responseBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;

    move-result-object p1

    goto :goto_0

    .line 52
    :cond_0
    new-instance p2, Lio/github/wax911/library/converter/response/GraphResponseConverter;

    iget-object p3, p0, Lio/github/wax911/library/converter/GraphConverter;->gson:Lcom/google/gson/Gson;

    if-nez p3, :cond_1

    const-string v0, "gson"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    invoke-direct {p2, p1, p3}, Lio/github/wax911/library/converter/response/GraphResponseConverter;-><init>(Ljava/lang/reflect/Type;Lcom/google/gson/Gson;)V

    move-object p1, p2

    check-cast p1, Lretrofit2/Converter;

    :goto_0
    return-object p1
.end method

.method protected final setGson(Lcom/google/gson/Gson;)V
    .locals 1
    .param p1    # Lcom/google/gson/Gson;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iput-object p1, p0, Lio/github/wax911/library/converter/GraphConverter;->gson:Lcom/google/gson/Gson;

    return-void
.end method
