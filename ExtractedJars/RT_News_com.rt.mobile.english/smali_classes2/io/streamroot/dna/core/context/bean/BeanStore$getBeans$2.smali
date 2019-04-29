.class final Lio/streamroot/dna/core/context/bean/BeanStore$getBeans$2;
.super Lkotlin/jvm/internal/Lambda;
.source "BeanStore.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/streamroot/dna/core/context/bean/BeanStore;->getBeans(Ljava/lang/Class;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0004\u0008\u0000\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "T",
        "kotlin.jvm.PlatformType",
        "it",
        "Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;",
        "invoke",
        "(Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic $clazz:Ljava/lang/Class;


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lio/streamroot/dna/core/context/bean/BeanStore$getBeans$2;->$clazz:Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;",
            ")TT;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lio/streamroot/dna/core/context/bean/BeanStore$getBeans$2;->$clazz:Ljava/lang/Class;

    invoke-virtual {p1}, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;->getBean()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 12
    check-cast p1, Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;

    invoke-virtual {p0, p1}, Lio/streamroot/dna/core/context/bean/BeanStore$getBeans$2;->invoke(Lio/streamroot/dna/core/context/bean/BeanStore$BeanDefinition;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
