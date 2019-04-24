.class public abstract Lcom/ibotta/android/commons/view/pager/PageViewHolder;
.super Ljava/lang/Object;
.source "PageViewHolder.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/ibotta/android/commons/view/pager/PageViewHolder;",
        "",
        "()V",
        "position",
        "",
        "getPosition",
        "()I",
        "setPosition",
        "(I)V",
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
.field private position:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getPosition()I
    .locals 1

    .line 7
    iget v0, p0, Lcom/ibotta/android/commons/view/pager/PageViewHolder;->position:I

    return v0
.end method

.method public final setPosition(I)V
    .locals 0

    .line 7
    iput p1, p0, Lcom/ibotta/android/commons/view/pager/PageViewHolder;->position:I

    return-void
.end method
