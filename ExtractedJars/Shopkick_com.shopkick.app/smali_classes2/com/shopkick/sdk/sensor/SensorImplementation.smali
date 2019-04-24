.class public interface abstract Lcom/shopkick/sdk/sensor/SensorImplementation;
.super Ljava/lang/Object;
.source "SensorImplementation.java"


# virtual methods
.method public abstract addStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
.end method

.method public abstract getLastReading()Lcom/shopkick/sdk/sensor/Reading;
.end method

.method public abstract removeStatusListener(Lcom/shopkick/sdk/sensor/SensorStatusListener;)V
.end method

.method public abstract setReadingListener(Lcom/shopkick/sdk/sensor/ReadingListener;)V
.end method

.method public abstract setStatusListener(Lcom/shopkick/sdk/sensor/StatusListener;)V
.end method

.method public abstract start()Z
.end method

.method public abstract stop()V
.end method
