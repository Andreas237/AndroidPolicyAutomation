.class public interface abstract Lorg/aspectj/lang/JoinPoint;
.super Ljava/lang/Object;
.source "JoinPoint.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/aspectj/lang/JoinPoint$EnclosingStaticPart;,
        Lorg/aspectj/lang/JoinPoint$StaticPart;
    }
.end annotation


# virtual methods
.method public abstract getArgs()[Ljava/lang/Object;
.end method

.method public abstract getKind()Ljava/lang/String;
.end method

.method public abstract getSignature()Lorg/aspectj/lang/Signature;
.end method

.method public abstract getSourceLocation()Lorg/aspectj/lang/reflect/SourceLocation;
.end method

.method public abstract getStaticPart()Lorg/aspectj/lang/JoinPoint$StaticPart;
.end method

.method public abstract getTarget()Ljava/lang/Object;
.end method

.method public abstract getThis()Ljava/lang/Object;
.end method

.method public abstract toLongString()Ljava/lang/String;
.end method

.method public abstract toShortString()Ljava/lang/String;
.end method

.method public abstract toString()Ljava/lang/String;
.end method
