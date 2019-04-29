.class public interface abstract Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;
.super Ljava/lang/Object;
.source "ArticlesAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/ArticlesAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation


# virtual methods
.method public abstract onArticleClicked(ILjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onBreakingNews(Lcom/rt/mobile/english/data/Message;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Lcom/rt/mobile/english/data/articles/Breaking;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onRateAppFinished()V
.end method
