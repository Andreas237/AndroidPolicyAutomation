.class public interface abstract Lcom/shopkick/sdk/sensor/ReadingListener;
.super Ljava/lang/Object;
.source "ReadingListener.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/shopkick/sdk/sensor/Reading;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/sdk/sensor/Sensor;",
            "TT;)V"
        }
    .end annotation
.end method
