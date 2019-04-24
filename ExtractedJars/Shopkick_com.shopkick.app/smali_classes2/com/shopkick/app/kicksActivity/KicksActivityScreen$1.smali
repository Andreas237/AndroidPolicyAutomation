.class Lcom/shopkick/app/kicksActivity/KicksActivityScreen$1;
.super Ljava/lang/Object;
.source "KicksActivityScreen.java"

# interfaces
.implements Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/kicksActivity/KicksActivityScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/kicksActivity/KicksActivityScreen;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen$1;->this$0:Lcom/shopkick/app/kicksActivity/KicksActivityScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen$1;->this$0:Lcom/shopkick/app/kicksActivity/KicksActivityScreen;

    invoke-static {v0}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->access$000(Lcom/shopkick/app/kicksActivity/KicksActivityScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->clear()V

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityScreen$1;->this$0:Lcom/shopkick/app/kicksActivity/KicksActivityScreen;

    invoke-static {v0}, Lcom/shopkick/app/kicksActivity/KicksActivityScreen;->access$100(Lcom/shopkick/app/kicksActivity/KicksActivityScreen;)V

    return-void
.end method
