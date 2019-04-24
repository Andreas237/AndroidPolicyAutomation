.class public abstract Lorg/jivesoftware/smack/util/Async$ThrowingRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jivesoftware/smack/util/Async;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ThrowingRunnable"
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "ThrowingRunnable"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 69
    :try_start_0
    invoke-virtual {p0}, Lorg/jivesoftware/smack/util/Async$ThrowingRunnable;->runOrThrow()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    goto :goto_0

    .line 71
    :catch_0
    move-exception v2

    .line 72
    const-string v0, "ThrowingRunnable"

    const-string v1, "Catched Exception"

    invoke-static {v0, v1}, Lorg/jivesoftware/smack/android/LogXS;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    :goto_0
    return-void
.end method

.method public abstract runOrThrow()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method
