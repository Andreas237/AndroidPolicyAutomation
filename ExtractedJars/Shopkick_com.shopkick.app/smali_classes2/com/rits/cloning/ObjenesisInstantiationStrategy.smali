.class public Lcom/rits/cloning/ObjenesisInstantiationStrategy;
.super Ljava/lang/Object;
.source "ObjenesisInstantiationStrategy.java"

# interfaces
.implements Lcom/rits/cloning/IInstantiationStrategy;


# static fields
.field private static instance:Lcom/rits/cloning/ObjenesisInstantiationStrategy;


# instance fields
.field private final objenesis:Lorg/objenesis/Objenesis;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Lcom/rits/cloning/ObjenesisInstantiationStrategy;

    invoke-direct {v0}, Lcom/rits/cloning/ObjenesisInstantiationStrategy;-><init>()V

    sput-object v0, Lcom/rits/cloning/ObjenesisInstantiationStrategy;->instance:Lcom/rits/cloning/ObjenesisInstantiationStrategy;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Lorg/objenesis/ObjenesisStd;

    invoke-direct {v0}, Lorg/objenesis/ObjenesisStd;-><init>()V

    iput-object v0, p0, Lcom/rits/cloning/ObjenesisInstantiationStrategy;->objenesis:Lorg/objenesis/Objenesis;

    return-void
.end method

.method public static getInstance()Lcom/rits/cloning/ObjenesisInstantiationStrategy;
    .locals 1

    .line 25
    sget-object v0, Lcom/rits/cloning/ObjenesisInstantiationStrategy;->instance:Lcom/rits/cloning/ObjenesisInstantiationStrategy;

    return-object v0
.end method


# virtual methods
.method public newInstance(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/rits/cloning/ObjenesisInstantiationStrategy;->objenesis:Lorg/objenesis/Objenesis;

    invoke-interface {v0, p1}, Lorg/objenesis/Objenesis;->newInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
