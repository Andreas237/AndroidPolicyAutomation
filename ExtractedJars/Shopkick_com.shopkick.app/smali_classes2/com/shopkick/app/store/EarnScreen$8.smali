.class Lcom/shopkick/app/store/EarnScreen$8;
.super Lcom/shopkick/app/widget/ToolTipView;
.source "EarnScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/EarnScreen;->showTooltip(ILandroid/view/View;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/EarnScreen;

.field final synthetic val$stage:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/EarnScreen;Landroid/view/ViewGroup;Landroid/view/View;II)V
    .locals 0

    .line 1739
    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen$8;->this$0:Lcom/shopkick/app/store/EarnScreen;

    iput p5, p0, Lcom/shopkick/app/store/EarnScreen$8;->val$stage:I

    invoke-direct {p0, p2, p3, p4}, Lcom/shopkick/app/widget/ToolTipView;-><init>(Landroid/view/ViewGroup;Landroid/view/View;I)V

    return-void
.end method


# virtual methods
.method public after(Lcom/shopkick/app/widget/ToolTipView;)V
    .locals 1

    .line 1741
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$8;->this$0:Lcom/shopkick/app/store/EarnScreen;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/store/EarnScreen;->access$1802(Lcom/shopkick/app/store/EarnScreen;Lcom/shopkick/app/widget/ToolTipView;)Lcom/shopkick/app/widget/ToolTipView;

    .line 1742
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$8;->this$0:Lcom/shopkick/app/store/EarnScreen;

    iget v0, p0, Lcom/shopkick/app/store/EarnScreen$8;->val$stage:I

    invoke-static {p1, v0}, Lcom/shopkick/app/store/EarnScreen;->access$1900(Lcom/shopkick/app/store/EarnScreen;I)V

    .line 1743
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$8;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$2000(Lcom/shopkick/app/store/EarnScreen;)V

    return-void
.end method
