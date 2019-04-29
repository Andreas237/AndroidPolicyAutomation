.class public final Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner$DefaultImpls;
.super Ljava/lang/Object;
.source "ReflectJavaModifierListOwner.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nReflectJavaModifierListOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaModifierListOwner.kt\nkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner$DefaultImpls\n*L\n1#1,49:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static getVisibility(Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;)Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 38
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;->getModifiers()I

    move-result p0

    .line 40
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lkotlin/reflect/jvm/internal/impl/descriptors/Visibilities;->PUBLIC:Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;

    const-string v0, "Visibilities.PUBLIC"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    .line 41
    :cond_0
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lkotlin/reflect/jvm/internal/impl/descriptors/Visibilities;->PRIVATE:Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;

    const-string v0, "Visibilities.PRIVATE"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    .line 42
    :cond_1
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 43
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lkotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities;->PROTECTED_STATIC_VISIBILITY:Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;

    goto :goto_0

    .line 44
    :cond_2
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities;->PROTECTED_AND_PACKAGE:Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;

    :goto_0
    const-string v0, "if (Modifier.isStatic(mo\u2026ies.PROTECTED_AND_PACKAGE"

    .line 43
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    .line 45
    :cond_3
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities;->PACKAGE_VISIBILITY:Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;

    const-string v0, "JavaVisibilities.PACKAGE_VISIBILITY"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p0
.end method

.method public static isAbstract(Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;)Z
    .locals 0

    .line 29
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;->getModifiers()I

    move-result p0

    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result p0

    return p0
.end method

.method public static isFinal(Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;)Z
    .locals 0

    .line 35
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;->getModifiers()I

    move-result p0

    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result p0

    return p0
.end method

.method public static isStatic(Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;)Z
    .locals 0

    .line 32
    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;->getModifiers()I

    move-result p0

    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result p0

    return p0
.end method
