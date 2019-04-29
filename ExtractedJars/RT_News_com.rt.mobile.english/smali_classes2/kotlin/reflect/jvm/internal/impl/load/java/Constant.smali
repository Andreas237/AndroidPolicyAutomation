.class public final Lkotlin/reflect/jvm/internal/impl/load/java/Constant;
.super Lkotlin/reflect/jvm/internal/impl/load/java/JavaDefaultValue;
.source "utils.kt"


# instance fields
.field private final value:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/load/java/JavaDefaultValue;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/load/java/Constant;->value:Ljava/lang/Object;

    return-void
.end method
