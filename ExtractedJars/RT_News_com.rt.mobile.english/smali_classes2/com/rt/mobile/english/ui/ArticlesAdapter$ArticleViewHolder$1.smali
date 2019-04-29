.class Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;
.super Ljava/lang/Object;
.source "ArticlesAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;-><init>(Lcom/rt/mobile/english/ui/ArticlesAdapter;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

.field final synthetic val$this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;Lcom/rt/mobile/english/ui/ArticlesAdapter;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->val$this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 288
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$000(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x5

    const v1, 0x7f10011d

    if-eqz p1, :cond_2

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object v2, v2, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {v2}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$100(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 289
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->getAdapterPosition()I

    move-result p1

    if-nez p1, :cond_0

    .line 290
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$300(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$200(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Lcom/rt/mobile/english/data/Message;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;->onBreakingNews(Lcom/rt/mobile/english/data/Message;)V

    return-void

    .line 293
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->getAdapterPosition()I

    move-result p1

    if-lt p1, v0, :cond_1

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$100(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 294
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$300(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->getAdapterPosition()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$400(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;->onArticleClicked(ILjava/util/List;)V

    return-void

    .line 297
    :cond_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$300(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->getAdapterPosition()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$400(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;->onArticleClicked(ILjava/util/List;)V

    return-void

    .line 303
    :cond_2
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->getAdapterPosition()I

    move-result p1

    if-lt p1, v0, :cond_3

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object v0, v0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$100(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 304
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$300(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->getAdapterPosition()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$400(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;->onArticleClicked(ILjava/util/List;)V

    goto :goto_0

    .line 306
    :cond_3
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object p1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$300(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->getAdapterPosition()I

    move-result v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder$1;->this$1:Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    iget-object v1, v1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->this$0:Lcom/rt/mobile/english/ui/ArticlesAdapter;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/ArticlesAdapter;->access$400(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;->onArticleClicked(ILjava/util/List;)V

    :goto_0
    return-void
.end method
