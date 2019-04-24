.class public abstract Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;
.super Landroid/widget/ArrayAdapter;
.source "SimplifiedArrayAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/widget/ArrayAdapter<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002B%\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u00a2\u0006\u0002\u0010\tB%\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u00a2\u0006\u0002\u0010\u000cJ\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\n \u0018*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0004J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00062\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0012H&J1\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0008\u0010 \u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010!R\u0014\u0010\r\u001a\u00020\u000eX\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;",
        "T",
        "Landroid/widget/ArrayAdapter;",
        "context",
        "Landroid/content/Context;",
        "layoutId",
        "",
        "data",
        "",
        "(Landroid/content/Context;ILjava/util/List;)V",
        "layoutIds",
        "Landroid/util/SparseIntArray;",
        "(Landroid/content/Context;Landroid/util/SparseIntArray;Ljava/util/List;)V",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "getInflater",
        "()Landroid/view/LayoutInflater;",
        "getView",
        "Landroid/view/View;",
        "position",
        "convertView",
        "parent",
        "Landroid/view/ViewGroup;",
        "instantiateView",
        "kotlin.jvm.PlatformType",
        "makeViewHolder",
        "Lcom/ibotta/android/commons/view/list/ViewHolder;",
        "viewType",
        "view",
        "updateView",
        "",
        "vh",
        "item",
        "(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/Object;)V",
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
.field private final inflater:Landroid/view/LayoutInflater;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private layoutIds:Landroid/util/SparseIntArray;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/util/List;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 14
    new-instance p3, Landroid/util/SparseIntArray;

    invoke-direct {p3}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p3, p0, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->layoutIds:Landroid/util/SparseIntArray;

    .line 21
    iget-object p3, p0, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->layoutIds:Landroid/util/SparseIntArray;

    invoke-virtual {p3, v0, p2}, Landroid/util/SparseIntArray;->put(II)V

    const-string p2, "layout_inflater"

    .line 22
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->inflater:Landroid/view/LayoutInflater;

    return-void

    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type android.view.LayoutInflater"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/SparseIntArray;Ljava/util/List;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/SparseIntArray;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/util/SparseIntArray;",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 25
    invoke-direct {p0, p1, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 14
    new-instance p3, Landroid/util/SparseIntArray;

    invoke-direct {p3}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p3, p0, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->layoutIds:Landroid/util/SparseIntArray;

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->layoutIds:Landroid/util/SparseIntArray;

    const-string p2, "layout_inflater"

    .line 27
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->inflater:Landroid/view/LayoutInflater;

    return-void

    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type android.view.LayoutInflater"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected final getInflater()Landroid/view/LayoutInflater;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->inflater:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "parent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    .line 32
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_0

    check-cast p3, Lcom/ibotta/android/commons/view/list/ViewHolder;

    .line 33
    invoke-virtual {p0, p1}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->getItemViewType(I)I

    move-result v0

    invoke-virtual {p0, p1}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, v0, p3, v1}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/Object;)V

    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string p2, "null cannot be cast to non-null type com.ibotta.android.commons.view.list.ViewHolder"

    invoke-direct {p1, p2}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 36
    :cond_1
    invoke-virtual {p0, p1, p3}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->instantiateView(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 37
    invoke-virtual {p0, p1}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->getItemViewType(I)I

    move-result p3

    invoke-virtual {p0, p3, p2}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->makeViewHolder(ILandroid/view/View;)Lcom/ibotta/android/commons/view/list/ViewHolder;

    move-result-object p3

    const-string v0, "internalConvertView"

    .line 38
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 39
    invoke-virtual {p0, p1}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->getItemViewType(I)I

    move-result v0

    invoke-virtual {p0, p1}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, v0, p3, v1}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/Object;)V

    :goto_0
    return-object p2
.end method

.method protected final instantiateView(ILandroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "parent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->inflater:Landroid/view/LayoutInflater;

    iget-object v1, p0, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->layoutIds:Landroid/util/SparseIntArray;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;->getItemViewType(I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/util/SparseIntArray;->get(I)I

    move-result p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public abstract makeViewHolder(ILandroid/view/View;)Lcom/ibotta/android/commons/view/list/ViewHolder;
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/Object;)V
    .param p3    # Lcom/ibotta/android/commons/view/list/ViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/ibotta/android/commons/view/list/ViewHolder;",
            "TT;)V"
        }
    .end annotation
.end method
