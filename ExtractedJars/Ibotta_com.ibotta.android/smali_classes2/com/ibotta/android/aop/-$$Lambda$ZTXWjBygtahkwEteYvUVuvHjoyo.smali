.class public final synthetic Lcom/ibotta/android/aop/-$$Lambda$ZTXWjBygtahkwEteYvUVuvHjoyo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/aop/AbstractAspect$ProceedingJoinPointHandler;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/aop/AbstractAspect;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/aop/AbstractAspect;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/aop/-$$Lambda$ZTXWjBygtahkwEteYvUVuvHjoyo;->f$0:Lcom/ibotta/android/aop/AbstractAspect;

    return-void
.end method


# virtual methods
.method public final handle(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/aop/-$$Lambda$ZTXWjBygtahkwEteYvUVuvHjoyo;->f$0:Lcom/ibotta/android/aop/AbstractAspect;

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/aop/AbstractAspect;->handleAroundHook(Ljava/lang/annotation/Annotation;Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
