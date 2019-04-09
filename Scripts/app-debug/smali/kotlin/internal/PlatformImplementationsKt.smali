.class public final Lkotlin/internal/PlatformImplementationsKt;
.super Ljava/lang/Object;
.source "PlatformImplementations.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementationsKt\n*L\n1#1,54:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u001a\u0008\u0010\u0002\u001a\u00020\u0003H\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "IMPLEMENTATIONS",
        "Lkotlin/internal/PlatformImplementations;",
        "getJavaVersion",
        "",
        "kotlin-stdlib"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0x7
    }
.end annotation


# static fields
.field public static final IMPLEMENTATIONS:Lkotlin/internal/PlatformImplementations;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 20
    nop

    .line 21
    invoke-static {}, Lkotlin/internal/PlatformImplementationsKt;->getJavaVersion()I

    move-result v0

    .line 22
    .local v0, "version":I
    nop

    .line 23
    const v1, 0x10008

    if-lt v0, v1, :cond_0

    .line 24
    :try_start_0
    const-string/jumbo v1, "kotlin.internal.JRE8PlatformImplementations"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Lkotlin/TypeCastException;

    const-string/jumbo v2, "null cannot be cast to non-null type kotlin.internal.PlatformImplementations"

    invoke-direct {v1, v2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :catch_0
    move-exception v1

    .line 27
    :cond_0
    nop

    .line 28
    const v1, 0x10007

    if-lt v0, v1, :cond_1

    .line 29
    :try_start_1
    const-string/jumbo v1, "kotlin.internal.JRE7PlatformImplementations"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Lkotlin/TypeCastException;

    const-string/jumbo v2, "null cannot be cast to non-null type kotlin.internal.PlatformImplementations"

    invoke-direct {v1, v2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    :catch_1
    move-exception v1

    .line 32
    :cond_1
    new-instance v1, Lkotlin/internal/PlatformImplementations;

    invoke-direct {v1}, Lkotlin/internal/PlatformImplementations;-><init>()V

    nop

    .line 20
    :goto_0
    sput-object v1, Lkotlin/internal/PlatformImplementationsKt;->IMPLEMENTATIONS:Lkotlin/internal/PlatformImplementations;

    return-void

    .line 24
    :cond_2
    :try_start_2
    check-cast v1, Lkotlin/internal/PlatformImplementations;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 29
    :cond_3
    :try_start_3
    check-cast v1, Lkotlin/internal/PlatformImplementations;
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0
.end method

.method private static final getJavaVersion()I
    .locals 13

    .prologue
    .line 36
    const v6, 0x10006

    .line 37
    .local v6, "default":I
    const-string/jumbo v0, "java.specification.version"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_0

    .local v12, "version":Ljava/lang/String;
    move-object v0, v12

    .line 38
    check-cast v0, Ljava/lang/CharSequence;

    const/16 v1, 0x2e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v8

    .line 39
    .local v8, "firstDot":I
    if-gez v8, :cond_1

    .line 40
    nop

    :try_start_0
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/high16 v1, 0x10000

    mul-int v6, v0, v1

    .line 47
    .end local v6    # "default":I
    .local v9, "firstPart":Ljava/lang/String;
    .local v10, "secondDot":I
    .local v11, "secondPart":Ljava/lang/String;
    :cond_0
    :goto_0
    return v6

    .line 40
    .end local v9    # "firstPart":Ljava/lang/String;
    .end local v10    # "secondDot":I
    .end local v11    # "secondPart":Ljava/lang/String;
    .restart local v6    # "default":I
    :catch_0
    move-exception v7

    .local v7, "e":Ljava/lang/NumberFormatException;
    goto :goto_0

    .end local v7    # "e":Ljava/lang/NumberFormatException;
    :cond_1
    move-object v0, v12

    .line 42
    check-cast v0, Ljava/lang/CharSequence;

    const/16 v1, 0x2e

    add-int/lit8 v2, v8, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v10

    .line 43
    .restart local v10    # "secondDot":I
    if-gez v10, :cond_2

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v10

    .line 45
    :cond_2
    const/4 v0, 0x0

    if-nez v12, :cond_3

    new-instance v0, Lkotlin/TypeCastException;

    const-string/jumbo v1, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {v12, v0, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    const-string/jumbo v0, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .restart local v9    # "firstPart":Ljava/lang/String;
    add-int/lit8 v0, v8, 0x1

    if-nez v12, :cond_4

    new-instance v0, Lkotlin/TypeCastException;

    const-string/jumbo v1, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-virtual {v12, v0, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    const-string/jumbo v0, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .restart local v11    # "secondPart":Ljava/lang/String;
    nop

    .line 48
    :try_start_1
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/high16 v1, 0x10000

    mul-int/2addr v0, v1

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v1

    add-int v6, v0, v1

    goto :goto_0

    .line 49
    :catch_1
    move-exception v7

    .line 50
    .restart local v7    # "e":Ljava/lang/NumberFormatException;
    goto :goto_0
.end method
