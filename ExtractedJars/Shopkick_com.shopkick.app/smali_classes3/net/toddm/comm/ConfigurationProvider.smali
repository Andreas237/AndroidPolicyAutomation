.class public interface abstract Lnet/toddm/comm/ConfigurationProvider;
.super Ljava/lang/Object;
.source "ConfigurationProvider.java"


# virtual methods
.method public abstract contains(Ljava/lang/String;)Z
.end method

.method public abstract get(Ljava/lang/String;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/toddm/comm/ConfigurationException;
        }
    .end annotation
.end method

.method public abstract getBoolean(Ljava/lang/String;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/toddm/comm/ConfigurationException;
        }
    .end annotation
.end method

.method public abstract getInt(Ljava/lang/String;)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/toddm/comm/ConfigurationException;
        }
    .end annotation
.end method

.method public abstract getLong(Ljava/lang/String;)J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/toddm/comm/ConfigurationException;
        }
    .end annotation
.end method

.method public abstract getString(Ljava/lang/String;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/toddm/comm/ConfigurationException;
        }
    .end annotation
.end method
