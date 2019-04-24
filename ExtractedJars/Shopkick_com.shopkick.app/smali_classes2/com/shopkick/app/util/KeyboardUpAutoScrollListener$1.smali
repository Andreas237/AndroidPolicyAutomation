.class Lcom/shopkick/app/util/KeyboardUpAutoScrollListener$1;
.super Ljava/lang/Object;
.source "KeyboardUpAutoScrollListener.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;->onGlobalLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;

.field final synthetic val$mainView:Landroid/view/View;

.field final synthetic val$scrollToPos:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;Landroid/view/View;I)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener$1;->this$0:Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;

    iput-object p2, p0, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener$1;->val$mainView:Landroid/view/View;

    iput p3, p0, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener$1;->val$scrollToPos:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener$1;->val$mainView:Landroid/view/View;

    iget v1, p0, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener$1;->val$scrollToPos:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/view/View;->scrollTo(II)V

    return-void
.end method
