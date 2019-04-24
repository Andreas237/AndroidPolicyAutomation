.class public interface abstract Lnet/toddm/comm/RetryPolicyProvider;
.super Ljava/lang/Object;
.source "RetryPolicyProvider.java"


# virtual methods
.method public abstract shouldRetry(Lnet/toddm/comm/Work;Ljava/lang/Exception;)Lnet/toddm/comm/RetryProfile;
.end method

.method public abstract shouldRetry(Lnet/toddm/comm/Work;Lnet/toddm/comm/Response;)Lnet/toddm/comm/RetryProfile;
.end method
