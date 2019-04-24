.class public final Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;
.super Ljava/lang/Object;
.source "DebugFeatureFlagRowViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDebugFeatureFlagRowViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugFeatureFlagRowViewState.kt\ncom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder\n*L\n1#1,25:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0008R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;",
        "",
        "()V",
        "isDebugVisible",
        "",
        "rowIndex",
        "",
        "testDescription",
        "",
        "testName",
        "build",
        "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;",
        "value",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private isDebugVisible:Z

.field private rowIndex:I

.field private testDescription:Ljava/lang/String;

.field private testName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "unknown"

    .line 13
    iput-object v0, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->testName:Ljava/lang/String;

    const-string v0, ""

    .line 14
    iput-object v0, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->testDescription:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final build()Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    new-instance v0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;

    .line 23
    iget v1, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->rowIndex:I

    iget-object v2, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->testName:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->testDescription:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->isDebugVisible:Z

    .line 22
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public final isDebugVisible(Z)Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;

    iput-boolean p1, v0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->isDebugVisible:Z

    return-object v0
.end method

.method public final rowIndex(I)Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 17
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;

    iput p1, v0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->rowIndex:I

    return-object v0
.end method

.method public final testDescription(Ljava/lang/String;)Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->testDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final testName(Ljava/lang/String;)Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->testName:Ljava/lang/String;

    return-object v0
.end method
