.class public final Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;
.super Ljava/lang/Object;
.source "ImDetailHeaderViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nImDetailHeaderViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImDetailHeaderViewState.kt\ncom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder\n*L\n1#1,45:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0008J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;",
        "",
        "()V",
        "errorSubtitleText",
        "",
        "imConnectionViewState",
        "Lcom/ibotta/android/views/im/connection/ImConnectionViewState;",
        "isErrorSubtitleTextVisible",
        "",
        "isSubtitleTextVisible",
        "primaryMessage",
        "subtitleText",
        "titleText",
        "build",
        "Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;",
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
.field private errorSubtitleText:Ljava/lang/String;

.field private imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

.field private isErrorSubtitleTextVisible:Z

.field private isSubtitleTextVisible:Z

.field private primaryMessage:Ljava/lang/String;

.field private subtitleText:Ljava/lang/String;

.field private titleText:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3, v1}, Lcom/ibotta/android/views/im/connection/ImConnectionViewState;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    const-string v0, ""

    .line 18
    iput-object v0, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->titleText:Ljava/lang/String;

    const-string v0, ""

    .line 19
    iput-object v0, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->subtitleText:Ljava/lang/String;

    const-string v0, ""

    .line 21
    iput-object v0, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->errorSubtitleText:Ljava/lang/String;

    const-string v0, ""

    .line 23
    iput-object v0, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->primaryMessage:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final build()Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 32
    new-instance v8, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;

    .line 33
    iget-object v1, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    .line 34
    iget-object v2, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->titleText:Ljava/lang/String;

    .line 35
    iget-object v3, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->subtitleText:Ljava/lang/String;

    .line 36
    iget-boolean v4, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->isSubtitleTextVisible:Z

    .line 37
    iget-object v5, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->errorSubtitleText:Ljava/lang/String;

    .line 38
    iget-boolean v6, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->isErrorSubtitleTextVisible:Z

    .line 39
    iget-object v7, p0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->primaryMessage:Ljava/lang/String;

    move-object v0, v8

    .line 32
    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState;-><init>(Lcom/ibotta/android/views/im/connection/ImConnectionViewState;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)V

    return-object v8
.end method

.method public final errorSubtitleText(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->errorSubtitleText:Ljava/lang/String;

    return-object v0
.end method

.method public final imConnectionViewState(Lcom/ibotta/android/views/im/connection/ImConnectionViewState;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;
    .locals 1
    .param p1    # Lcom/ibotta/android/views/im/connection/ImConnectionViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->imConnectionViewState:Lcom/ibotta/android/views/im/connection/ImConnectionViewState;

    return-object v0
.end method

.method public final isErrorSubtitleTextVisible(Z)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 29
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    iput-boolean p1, v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->isErrorSubtitleTextVisible:Z

    return-object v0
.end method

.method public final isSubtitleTextVisible(Z)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    iput-boolean p1, v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->isSubtitleTextVisible:Z

    return-object v0
.end method

.method public final primaryMessage(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->primaryMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final titleText(Ljava/lang/String;)Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/im/detail/ImDetailHeaderViewState$Builder;->titleText:Ljava/lang/String;

    return-object v0
.end method
