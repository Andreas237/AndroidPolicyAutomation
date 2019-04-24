.class interface abstract Lcom/ibotta/android/aop/AbstractAspect$ProceedingJoinPointHandler;
.super Ljava/lang/Object;
.source "AbstractAspect.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/aop/AbstractAspect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x60a
    name = "ProceedingJoinPointHandler"
.end annotation


# virtual methods
.method public abstract handle(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
