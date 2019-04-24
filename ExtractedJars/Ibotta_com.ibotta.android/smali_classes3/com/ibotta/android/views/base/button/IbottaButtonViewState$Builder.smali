.class public final Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;
.super Ljava/lang/Object;
.source "IbottaButtonViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIbottaButtonViewState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IbottaButtonViewState.kt\ncom/ibotta/android/views/base/button/IbottaButtonViewState$Builder\n*L\n1#1,39:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;",
        "",
        "()V",
        "contentDescription",
        "",
        "drawableResource",
        "isCircleRipple",
        "",
        "selected",
        "showMicroNudge",
        "build",
        "Lcom/ibotta/android/views/base/button/IbottaButtonViewState;",
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
.field private contentDescription:I

.field private drawableResource:I

.field private isCircleRipple:Z

.field private selected:Z

.field private showMicroNudge:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final build()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 27
    new-instance v6, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    .line 28
    iget-boolean v1, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->selected:Z

    .line 29
    iget v2, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->contentDescription:I

    .line 30
    iget v3, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->drawableResource:I

    .line 31
    iget-boolean v4, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->isCircleRipple:Z

    .line 32
    iget-boolean v5, p0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->showMicroNudge:Z

    move-object v0, v6

    .line 27
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;-><init>(ZIIZZ)V

    return-object v6
.end method

.method public final contentDescription(I)Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;

    iput p1, v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->contentDescription:I

    return-object v0
.end method

.method public final drawableResource(I)Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;

    iput p1, v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->drawableResource:I

    return-object v0
.end method

.method public final isCircleRipple(Z)Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 24
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;

    iput-boolean p1, v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->isCircleRipple:Z

    return-object v0
.end method

.method public final selected(Z)Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;

    iput-boolean p1, v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->selected:Z

    return-object v0
.end method

.method public final showMicroNudge(Z)Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 25
    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;

    iput-boolean p1, v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState$Builder;->showMicroNudge:Z

    return-object v0
.end method
