.class Lcom/rt/mobile/english/ui/ArticleFragment$1;
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

    .line 200
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 203
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/ArticleFragment;->access$000(Lcom/rt/mobile/english/ui/ArticleFragment;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/ArticleFragment;->access$000(Lcom/rt/mobile/english/ui/ArticleFragment;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 204
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ArticleFragment;->onBookmarkClicked()V

    goto :goto_0

    .line 206
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ArticleFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticleFragment;

    invoke-virtual {v0}, Lcom/rt/mobile/english/ui/ArticleFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f10007a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void
.end method
