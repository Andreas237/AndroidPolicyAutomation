.class Lcom/shopkick/app/feed/animate/WidgetItemAnimator$MoveInfo;
.super Ljava/lang/Object;
.source "WidgetItemAnimator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/feed/animate/WidgetItemAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "MoveInfo"
.end annotation


# instance fields
.field public fromX:I

.field public fromY:I

.field public holder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

.field public toX:I

.field public toY:I


# direct methods
.method constructor <init>(Landroid/support/v7/widget/RecyclerView$ViewHolder;IIII)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$MoveInfo;->holder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    .line 53
    iput p2, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$MoveInfo;->fromX:I

    .line 54
    iput p3, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$MoveInfo;->fromY:I

    .line 55
    iput p4, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$MoveInfo;->toX:I

    .line 56
    iput p5, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$MoveInfo;->toY:I

    return-void
.end method
