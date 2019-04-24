.class Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;
.super Lcom/nytimes/android/external/cache/Futures$ImmediateFuture;
.source "Futures.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/Futures;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ImmediateSuccessfulFuture"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/nytimes/android/external/cache/Futures$ImmediateFuture<",
        "TV;>;"
    }
.end annotation


# static fields
.field static final NULL:Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 149
    new-instance v0, Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;->NULL:Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 154
    invoke-direct {p0, v0}, Lcom/nytimes/android/external/cache/Futures$ImmediateFuture;-><init>(Lcom/nytimes/android/external/cache/Futures$1;)V

    .line 155
    iput-object p1, p0, Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;->value:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 160
    iget-object v0, p0, Lcom/nytimes/android/external/cache/Futures$ImmediateSuccessfulFuture;->value:Ljava/lang/Object;

    return-object v0
.end method
