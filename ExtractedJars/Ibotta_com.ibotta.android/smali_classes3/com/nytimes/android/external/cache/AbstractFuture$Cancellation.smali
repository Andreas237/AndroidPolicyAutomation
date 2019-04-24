.class final Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;
.super Ljava/lang/Object;
.source "AbstractFuture.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/AbstractFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Cancellation"
.end annotation


# instance fields
.field final cause:Ljava/lang/Throwable;

.field final wasInterrupted:Z


# direct methods
.method constructor <init>(ZLjava/lang/Throwable;)V
    .locals 0

    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 219
    iput-boolean p1, p0, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;->wasInterrupted:Z

    .line 220
    iput-object p2, p0, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;->cause:Ljava/lang/Throwable;

    return-void
.end method
