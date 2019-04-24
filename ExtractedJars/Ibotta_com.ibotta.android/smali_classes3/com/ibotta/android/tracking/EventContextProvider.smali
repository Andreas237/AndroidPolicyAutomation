.class public interface abstract Lcom/ibotta/android/tracking/EventContextProvider;
.super Ljava/lang/Object;
.source "EventContextProvider.java"

# interfaces
.implements Ljava9/util/function/Consumer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava9/util/function/Consumer<",
        "Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract provideContext(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
.end method
