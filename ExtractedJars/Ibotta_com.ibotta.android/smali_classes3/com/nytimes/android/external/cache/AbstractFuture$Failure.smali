.class final Lcom/nytimes/android/external/cache/AbstractFuture$Failure;
.super Ljava/lang/Object;
.source "AbstractFuture.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/AbstractFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Failure"
.end annotation


# static fields
.field static final FALLBACK_INSTANCE:Lcom/nytimes/android/external/cache/AbstractFuture$Failure;


# instance fields
.field final exception:Ljava/lang/Throwable;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 198
    new-instance v0, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;

    new-instance v1, Lcom/nytimes/android/external/cache/AbstractFuture$Failure$1;

    const-string v2, "Failure occurred while trying to finish a future."

    invoke-direct {v1, v2}, Lcom/nytimes/android/external/cache/AbstractFuture$Failure$1;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;-><init>(Ljava/lang/Throwable;)V

    sput-object v0, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;->FALLBACK_INSTANCE:Lcom/nytimes/android/external/cache/AbstractFuture$Failure;

    return-void
.end method

.method constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    invoke-static {p1}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    iput-object p1, p0, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;->exception:Ljava/lang/Throwable;

    return-void
.end method
