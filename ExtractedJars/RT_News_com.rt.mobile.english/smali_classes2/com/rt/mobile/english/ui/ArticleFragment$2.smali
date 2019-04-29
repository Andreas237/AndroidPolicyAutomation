.class Lcom/rt/mobile/english/ui/ArticleFragment$2;
.super Ljava/lang/Object;
.source "ArticleFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ArticleFragment;->PrepareFab()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/ArticleFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ArticleFragment;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$2;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 214
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment$2;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$2;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-static {v1}, Lcom/rt/mobile/english/ui/ArticleFragment;->access$100(Lcom/rt/mobile/english/ui/ArticleFragment;)Lcom/rt/mobile/english/data/articles/Article;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/data/articles/Article;->getTitle()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticleFragment$2;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-static {v2}, Lcom/rt/mobile/english/ui/ArticleFragment;->access$100(Lcom/rt/mobile/english/ui/ArticleFragment;)Lcom/rt/mobile/english/data/articles/Article;

    move-result-object v2

    invoke-virtual {v2}, Lcom/rt/mobile/english/data/articles/Article;->getURL()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/rt/mobile/english/Utils;->share(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
