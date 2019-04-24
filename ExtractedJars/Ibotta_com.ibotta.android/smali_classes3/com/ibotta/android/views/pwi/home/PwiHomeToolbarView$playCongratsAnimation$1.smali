.class final Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView$playCongratsAnimation$1;
.super Ljava/lang/Object;
.source "PwiHomeToolbarView.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;->playCongratsAnimation(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;)V
    .locals 0

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView$playCongratsAnimation$1;->this$0:Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView$playCongratsAnimation$1;->this$0:Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;

    sget v1, Lcom/ibotta/views/R$id;->clYouEarned:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    const-string v1, "clYouEarned"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintLayout;->setVisibility(I)V

    return-void
.end method
