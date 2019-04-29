.class public interface abstract Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;
.super Ljava/lang/Object;
.source "GetNewsTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/wear/GetNewsTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "GetNewsTaskCallBack"
.end annotation


# virtual methods
.method public abstract onNetworkError()V
.end method

.method public abstract onNewsReceived(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;)V"
        }
    .end annotation
.end method
