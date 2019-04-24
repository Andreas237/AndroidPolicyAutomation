.class public interface abstract Lcom/usebutton/thirdparty/com/squareup/ObjectQueue$Listener;
.super Ljava/lang/Object;
.source "ObjectQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/thirdparty/com/squareup/ObjectQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Listener"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract onAdd(Lcom/usebutton/thirdparty/com/squareup/ObjectQueue;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/thirdparty/com/squareup/ObjectQueue<",
            "TT;>;TT;)V"
        }
    .end annotation
.end method

.method public abstract onRemove(Lcom/usebutton/thirdparty/com/squareup/ObjectQueue;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/thirdparty/com/squareup/ObjectQueue<",
            "TT;>;)V"
        }
    .end annotation
.end method
