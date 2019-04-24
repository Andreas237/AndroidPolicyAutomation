.class final Lcom/ibotta/android/views/search/suggested/SpanHelperKt$sanitize$2;
.super Lkotlin/jvm/internal/FunctionReference;
.source "SpanHelper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/search/suggested/SpanHelperKt;->sanitize(Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReference;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/ibotta/android/views/search/suggested/TextSpan;",
        "Ljava/lang/Boolean;",
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
        "\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\u0008(\u0006\u00a2\u0006\u0002\u0008\u0007"
    }
    d2 = {
        "<anonymous>",
        "",
        "p1",
        "Lcom/ibotta/android/views/search/suggested/TextSpan;",
        "Lkotlin/ParameterName;",
        "name",
        "span",
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
.field public static final INSTANCE:Lcom/ibotta/android/views/search/suggested/SpanHelperKt$sanitize$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/views/search/suggested/SpanHelperKt$sanitize$2;

    invoke-direct {v0}, Lcom/ibotta/android/views/search/suggested/SpanHelperKt$sanitize$2;-><init>()V

    sput-object v0, Lcom/ibotta/android/views/search/suggested/SpanHelperKt$sanitize$2;->INSTANCE:Lcom/ibotta/android/views/search/suggested/SpanHelperKt$sanitize$2;

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

    const-string v0, "isSanitary"

    return-object v0
.end method

.method public final getOwner()Lkotlin/reflect/KDeclarationContainer;
    .locals 2

    const-class v0, Lcom/ibotta/android/views/search/suggested/SpanHelperKt;

    const-string v1, "ibotta-views_release"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinPackage(Ljava/lang/Class;Ljava/lang/String;)Lkotlin/reflect/KDeclarationContainer;

    move-result-object v0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    const-string v0, "isSanitary(Lcom/ibotta/android/views/search/suggested/TextSpan;)Z"

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ibotta/android/views/search/suggested/TextSpan;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/search/suggested/SpanHelperKt$sanitize$2;->invoke(Lcom/ibotta/android/views/search/suggested/TextSpan;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lcom/ibotta/android/views/search/suggested/TextSpan;)Z
    .locals 1
    .param p1    # Lcom/ibotta/android/views/search/suggested/TextSpan;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "p1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-static {p1}, Lcom/ibotta/android/views/search/suggested/SpanHelperKt;->access$isSanitary(Lcom/ibotta/android/views/search/suggested/TextSpan;)Z

    move-result p1

    return p1
.end method
