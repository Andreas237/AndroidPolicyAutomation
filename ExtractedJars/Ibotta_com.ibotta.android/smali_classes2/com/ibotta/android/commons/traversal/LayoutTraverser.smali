.class public final Lcom/ibotta/android/commons/traversal/LayoutTraverser;
.super Ljava/lang/Object;
.source "LayoutTraverser.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/commons/traversal/LayoutTraverser$Processor;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ibotta/android/commons/traversal/LayoutTraverser;",
        "",
        "processor",
        "Lcom/ibotta/android/commons/traversal/LayoutTraverser$Processor;",
        "(Lcom/ibotta/android/commons/traversal/LayoutTraverser$Processor;)V",
        "traverse",
        "",
        "root",
        "Landroid/view/ViewGroup;",
        "Processor",
        "ibotta-commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final processor:Lcom/ibotta/android/commons/traversal/LayoutTraverser$Processor;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/commons/traversal/LayoutTraverser$Processor;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/commons/traversal/LayoutTraverser$Processor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "processor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/commons/traversal/LayoutTraverser;->processor:Lcom/ibotta/android/commons/traversal/LayoutTraverser$Processor;

    return-void
.end method


# virtual methods
.method public final traverse(Landroid/view/ViewGroup;)V
    .locals 5
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 23
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 24
    iget-object v3, p0, Lcom/ibotta/android/commons/traversal/LayoutTraverser;->processor:Lcom/ibotta/android/commons/traversal/LayoutTraverser$Processor;

    const-string v4, "child"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v2}, Lcom/ibotta/android/commons/traversal/LayoutTraverser$Processor;->process(Landroid/view/View;)V

    .line 26
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    .line 27
    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {p0, v2}, Lcom/ibotta/android/commons/traversal/LayoutTraverser;->traverse(Landroid/view/ViewGroup;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
