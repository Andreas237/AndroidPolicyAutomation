.class public final Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;
.super Ljava/lang/Object;
.source "SemiModalViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSemiModalViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemiModalViewState.kt\ncom/ibotta/android/views/messages/alert/SemiModalViewState$Builder\n*L\n1#1,44:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0008R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;",
        "",
        "()V",
        "body",
        "",
        "checkBoxText",
        "imageId",
        "",
        "Ljava/lang/Integer;",
        "primaryButtonText",
        "secondaryButtonText",
        "subtitle",
        "title",
        "value",
        "build",
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewState;",
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
.field private body:Ljava/lang/String;

.field private checkBoxText:Ljava/lang/String;

.field private imageId:Ljava/lang/Integer;

.field private primaryButtonText:Ljava/lang/String;

.field private secondaryButtonText:Ljava/lang/String;

.field private subtitle:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final body(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final build()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 34
    new-instance v8, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    .line 35
    iget-object v1, p0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->imageId:Ljava/lang/Integer;

    .line 36
    iget-object v2, p0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->title:Ljava/lang/String;

    .line 37
    iget-object v3, p0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->subtitle:Ljava/lang/String;

    .line 38
    iget-object v4, p0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->body:Ljava/lang/String;

    .line 39
    iget-object v5, p0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText:Ljava/lang/String;

    .line 40
    iget-object v6, p0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->secondaryButtonText:Ljava/lang/String;

    .line 41
    iget-object v7, p0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->checkBoxText:Ljava/lang/String;

    move-object v0, v8

    .line 34
    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v8
.end method

.method public final checkBoxText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->checkBoxText:Ljava/lang/String;

    return-object v0
.end method

.method public final imageId(I)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 26
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->imageId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final primaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;
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

    check-cast v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final secondaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->secondaryButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final subtitle(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;
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

    check-cast v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final title(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    iput-object p1, v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->title:Ljava/lang/String;

    return-object v0
.end method
