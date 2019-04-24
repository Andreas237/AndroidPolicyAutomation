.class public Lcom/ibotta/android/aop/NoOpAdvice;
.super Ljava/lang/Object;
.source "NoOpAdvice.java"

# interfaces
.implements Lcom/ibotta/android/aop/JoinPointAdvice;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 0

    return-void
.end method

.method public onExecuteProceedingJoinPoint(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
