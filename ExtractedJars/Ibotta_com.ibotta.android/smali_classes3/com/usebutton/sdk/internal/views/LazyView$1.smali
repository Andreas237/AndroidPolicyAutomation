.class Lcom/usebutton/sdk/internal/views/LazyView$1;
.super Ljava/lang/Object;
.source "LazyView.java"

# interfaces
.implements Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$OnInflateFinishedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/views/LazyView;->load(ILcom/usebutton/sdk/internal/util/Receiver;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/LazyView;

.field final synthetic val$onReady:Lcom/usebutton/sdk/internal/util/Receiver;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/LazyView;Lcom/usebutton/sdk/internal/util/Receiver;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/LazyView$1;->this$0:Lcom/usebutton/sdk/internal/views/LazyView;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/LazyView$1;->val$onReady:Lcom/usebutton/sdk/internal/util/Receiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInflateFinished(Landroid/view/View;ILandroid/view/ViewGroup;)V
    .locals 0

    .line 42
    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/LazyView$1;->this$0:Lcom/usebutton/sdk/internal/views/LazyView;

    invoke-virtual {p2, p1}, Lcom/usebutton/sdk/internal/views/LazyView;->addView(Landroid/view/View;)V

    .line 43
    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/LazyView$1;->val$onReady:Lcom/usebutton/sdk/internal/util/Receiver;

    if-eqz p2, :cond_0

    .line 44
    invoke-interface {p2, p1}, Lcom/usebutton/sdk/internal/util/Receiver;->receive(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
