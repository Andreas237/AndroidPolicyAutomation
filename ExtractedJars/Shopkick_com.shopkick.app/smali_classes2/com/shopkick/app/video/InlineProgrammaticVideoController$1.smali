.class Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;
.super Ljava/lang/Object;
.source "InlineProgrammaticVideoController.java"

# interfaces
.implements Landroid/support/v7/widget/RecyclerView$ItemAnimator$ItemAnimatorFinishedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/video/InlineProgrammaticVideoController;->removeInlineProgrammaticVideoSection(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

.field final synthetic val$sectionHeaderPos:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/video/InlineProgrammaticVideoController;I)V
    .locals 0

    .line 237
    iput-object p1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;->this$0:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    iput p2, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;->val$sectionHeaderPos:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$onAnimationsFinished$57(Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;I)V
    .locals 3

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;->this$0:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    invoke-static {v0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->access$100(Lcom/shopkick/app/video/InlineProgrammaticVideoController;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;->this$0:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    invoke-static {v1}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->access$100(Lcom/shopkick/app/video/InlineProgrammaticVideoController;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->getItemCount()I

    move-result v1

    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, 0x1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v1, v2}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->notifyItemRangeChanged(IILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onAnimationsFinished()V
    .locals 5

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;->this$0:Lcom/shopkick/app/video/InlineProgrammaticVideoController;

    invoke-static {v0}, Lcom/shopkick/app/video/InlineProgrammaticVideoController;->access$000(Lcom/shopkick/app/video/InlineProgrammaticVideoController;)Landroid/os/Handler;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;->val$sectionHeaderPos:I

    new-instance v2, Lcom/shopkick/app/video/-$$Lambda$InlineProgrammaticVideoController$1$MBy3ISNWFqaxWFaIY1x_Oy2fQuE;

    invoke-direct {v2, p0, v1}, Lcom/shopkick/app/video/-$$Lambda$InlineProgrammaticVideoController$1$MBy3ISNWFqaxWFaIY1x_Oy2fQuE;-><init>(Lcom/shopkick/app/video/InlineProgrammaticVideoController$1;I)V

    const-wide/16 v3, 0x32

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
