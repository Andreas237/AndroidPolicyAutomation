.class public Lorg/apache/commons/lang3/concurrent/ConstantInitializer;
.super Ljava/lang/Object;
.source "ConstantInitializer.java"

# interfaces
.implements Lorg/apache/commons/lang3/concurrent/ConcurrentInitializer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/apache/commons/lang3/concurrent/ConcurrentInitializer",
        "<TT;>;"
    }
.end annotation


# static fields
.field private static final FMT_TO_STRING:Ljava/lang/String; = "ConstantInitializer@%d [ object = %s ]"


# instance fields
.field private final object:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 57
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/ConstantInitializer;, "Lorg/apache/commons/lang3/concurrent/ConstantInitializer<TT;>;"
    .local p1, "obj":Ljava/lang/Object;, "TT;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lorg/apache/commons/lang3/concurrent/ConstantInitializer;->object:Ljava/lang/Object;

    .line 59
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    .line 105
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/ConstantInitializer;, "Lorg/apache/commons/lang3/concurrent/ConstantInitializer<TT;>;"
    if-ne p0, p1, :cond_0

    .line 106
    const/4 v1, 0x1

    .line 113
    :goto_0
    return v1

    .line 108
    :cond_0
    instance-of v1, p1, Lorg/apache/commons/lang3/concurrent/ConstantInitializer;

    if-nez v1, :cond_1

    .line 109
    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    move-object v0, p1

    .line 112
    check-cast v0, Lorg/apache/commons/lang3/concurrent/ConstantInitializer;

    .line 113
    .local v0, "c":Lorg/apache/commons/lang3/concurrent/ConstantInitializer;, "Lorg/apache/commons/lang3/concurrent/ConstantInitializer<*>;"
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/ConstantInitializer;->getObject()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lorg/apache/commons/lang3/concurrent/ConstantInitializer;->getObject()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/apache/commons/lang3/ObjectUtils;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/lang3/concurrent/ConcurrentException;
        }
    .end annotation

    .prologue
    .line 80
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/ConstantInitializer;, "Lorg/apache/commons/lang3/concurrent/ConstantInitializer<TT;>;"
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/ConstantInitializer;->getObject()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getObject()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 69
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/ConstantInitializer;, "Lorg/apache/commons/lang3/concurrent/ConstantInitializer<TT;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/ConstantInitializer;->object:Ljava/lang/Object;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 91
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/ConstantInitializer;, "Lorg/apache/commons/lang3/concurrent/ConstantInitializer<TT;>;"
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/ConstantInitializer;->getObject()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/ConstantInitializer;->getObject()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 125
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/ConstantInitializer;, "Lorg/apache/commons/lang3/concurrent/ConstantInitializer<TT;>;"
    const-string v0, "ConstantInitializer@%d [ object = %s ]"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/ConstantInitializer;->getObject()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
