.class public interface abstract annotation Lcom/newrelic/agent/android/instrumentation/WrapReturn;
.super Ljava/lang/Object;
.source "WrapReturn.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract className()Ljava/lang/String;
.end method

.method public abstract methodDesc()Ljava/lang/String;
.end method

.method public abstract methodName()Ljava/lang/String;
.end method
