.class public abstract Lo/flg$a;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 226
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract b(I)I
.end method

.method public abstract b(ILandroid/content/Context;)Landroid/view/View;
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 242
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lo/flg$a;->getItemCount()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 243
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 245
    :cond_1
    invoke-virtual {p0, p1}, Lo/flg$a;->b(I)I

    move-result v0

    return v0
.end method
