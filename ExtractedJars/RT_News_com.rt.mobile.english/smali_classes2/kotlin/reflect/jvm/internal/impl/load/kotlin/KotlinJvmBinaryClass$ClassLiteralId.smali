.class public final Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$ClassLiteralId;
.super Ljava/lang/Object;
.source "KotlinJvmBinaryClass.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ClassLiteralId"
.end annotation


# instance fields
.field private final arrayNestedness:I

.field private final classId:Lkotlin/reflect/jvm/internal/impl/name/ClassId;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/name/ClassId;I)V
    .locals 1
    .param p1    # Lkotlin/reflect/jvm/internal/impl/name/ClassId;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$ClassLiteralId;->classId:Lkotlin/reflect/jvm/internal/impl/name/ClassId;

    iput p2, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$ClassLiteralId;->arrayNestedness:I

    return-void
.end method


# virtual methods
.method public final getArrayNestedness()I
    .locals 1

    .line 56
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$ClassLiteralId;->arrayNestedness:I

    return v0
.end method

.method public final getClassId()Lkotlin/reflect/jvm/internal/impl/name/ClassId;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 56
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$ClassLiteralId;->classId:Lkotlin/reflect/jvm/internal/impl/name/ClassId;

    return-object v0
.end method
