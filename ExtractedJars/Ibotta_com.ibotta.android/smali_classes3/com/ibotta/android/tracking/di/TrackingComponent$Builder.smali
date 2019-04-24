.class public interface abstract Lcom/ibotta/android/tracking/di/TrackingComponent$Builder;
.super Ljava/lang/Object;
.source "TrackingComponent.java"


# annotations
.annotation build Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/di/TrackingComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation


# virtual methods
.method public abstract build()Lcom/ibotta/android/tracking/di/TrackingComponent;
.end method

.method public abstract exceptionReporter(Lcom/ibotta/android/abstractions/ExceptionReporter;)Lcom/ibotta/android/tracking/di/TrackingComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract jsonModule(Lcom/ibotta/android/tracking/di/JsonModule;)Lcom/ibotta/android/tracking/di/TrackingComponent$Builder;
.end method
