.class public interface abstract Lcom/ibotta/android/di/MainComponent$Builder;
.super Ljava/lang/Object;
.source "MainComponent.java"


# annotations
.annotation build Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/di/MainComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation


# virtual methods
.method public abstract application(Lcom/ibotta/android/App;)Lcom/ibotta/android/di/MainComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract build()Lcom/ibotta/android/di/MainComponent;
.end method
