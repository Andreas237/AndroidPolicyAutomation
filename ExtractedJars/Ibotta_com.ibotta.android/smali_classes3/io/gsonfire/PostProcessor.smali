.class public interface abstract Lio/gsonfire/PostProcessor;
.super Ljava/lang/Object;
.source "PostProcessor.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract postDeserialize(Ljava/lang/Object;Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/gson/JsonElement;",
            "Lcom/google/gson/Gson;",
            ")V"
        }
    .end annotation
.end method

.method public abstract postSerialize(Lcom/google/gson/JsonElement;Ljava/lang/Object;Lcom/google/gson/Gson;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonElement;",
            "TT;",
            "Lcom/google/gson/Gson;",
            ")V"
        }
    .end annotation
.end method
