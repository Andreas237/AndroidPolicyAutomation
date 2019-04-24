.class public interface abstract Lcom/ibotta/android/tracking/di/TrackingComponent;
.super Ljava/lang/Object;
.source "TrackingComponent.java"


# annotations
.annotation runtime Ldagger/Component;
    modules = {
        Lcom/ibotta/android/tracking/di/JsonModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/di/TrackingComponent$Builder;
    }
.end annotation


# virtual methods
.method public abstract getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;
.end method

.method public abstract inject(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingBodyConverter;)V
.end method
