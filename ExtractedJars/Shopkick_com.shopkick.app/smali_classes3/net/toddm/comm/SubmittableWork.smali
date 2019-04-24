.class public interface abstract Lnet/toddm/comm/SubmittableWork;
.super Ljava/lang/Object;
.source "SubmittableWork.java"


# virtual methods
.method public abstract getCachingBehavior()Lnet/toddm/comm/CacheBehavior;
.end method

.method public abstract getCachingPriority()Lnet/toddm/cache/CachePriority;
.end method

.method public abstract getId()I
.end method

.method public abstract getRequest()Lnet/toddm/comm/Request;
.end method

.method public abstract getRequestPriority()Lnet/toddm/comm/Priority;
.end method

.method public abstract setDependentWork(Lnet/toddm/comm/SubmittableWork;Lnet/toddm/comm/DependentWorkListener;)V
.end method
