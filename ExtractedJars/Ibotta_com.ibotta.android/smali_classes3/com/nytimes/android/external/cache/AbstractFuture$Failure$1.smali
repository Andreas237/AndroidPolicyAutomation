.class final Lcom/nytimes/android/external/cache/AbstractFuture$Failure$1;
.super Ljava/lang/Throwable;
.source "AbstractFuture.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nytimes/android/external/cache/AbstractFuture$Failure;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 199
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized fillInStackTrace()Ljava/lang/Throwable;
    .locals 0
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    monitor-enter p0

    .line 202
    monitor-exit p0

    return-object p0
.end method
