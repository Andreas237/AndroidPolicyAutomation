.class public interface abstract Lkotlinx/coroutines/EventLoop;
.super Ljava/lang/Object;
.source "EventLoop.kt"

# interfaces
.implements Lkotlin/coroutines/ContinuationInterceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/coroutines/EventLoop$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0008`\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"
    }
    d2 = {
        "Lkotlinx/coroutines/EventLoop;",
        "Lkotlin/coroutines/ContinuationInterceptor;",
        "processNextEvent",
        "",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract processNextEvent()J
.end method
