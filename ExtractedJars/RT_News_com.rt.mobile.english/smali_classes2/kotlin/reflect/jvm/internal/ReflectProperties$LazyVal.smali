.class public Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;
.super Lkotlin/reflect/jvm/internal/ReflectProperties$Val;
.source "ReflectProperties.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/ReflectProperties;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LazyVal"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/reflect/jvm/internal/ReflectProperties$Val<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final initializer:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "TT;>;"
        }
    .end annotation
.end field

.field private value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "TT;>;)V"
        }
    .end annotation

    .line 51
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/ReflectProperties$Val;-><init>()V

    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;->value:Ljava/lang/Object;

    .line 52
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;->initializer:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;->value:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 59
    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;->unescape(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 62
    :cond_0
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;->initializer:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    .line 63
    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;->escape(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;->value:Ljava/lang/Object;

    return-object v0
.end method
