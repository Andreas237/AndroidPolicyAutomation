.class Lcom/shopkick/app/widget/ToolTipView$1;
.super Ljava/lang/Object;
.source "ToolTipView.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/widget/ToolTipView;->setupTooltipView(Landroid/view/ViewGroup;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/widget/ToolTipView;


# direct methods
.method constructor <init>(Lcom/shopkick/app/widget/ToolTipView;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/shopkick/app/widget/ToolTipView$1;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
