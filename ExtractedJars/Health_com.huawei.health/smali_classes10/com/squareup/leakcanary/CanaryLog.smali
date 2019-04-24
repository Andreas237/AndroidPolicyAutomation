.class public final Lcom/squareup/leakcanary/CanaryLog;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/leakcanary/CanaryLog$DefaultLogger;,
        Lcom/squareup/leakcanary/CanaryLog$Logger;
    }
.end annotation


# static fields
.field private static volatile logger:Lcom/squareup/leakcanary/CanaryLog$Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 7
    new-instance v0, Lcom/squareup/leakcanary/CanaryLog$DefaultLogger;

    invoke-direct {v0}, Lcom/squareup/leakcanary/CanaryLog$DefaultLogger;-><init>()V

    sput-object v0, Lcom/squareup/leakcanary/CanaryLog;->logger:Lcom/squareup/leakcanary/CanaryLog$Logger;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public static varargs d(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 41
    sget-object v0, Lcom/squareup/leakcanary/CanaryLog;->logger:Lcom/squareup/leakcanary/CanaryLog$Logger;

    .line 42
    if-nez v0, :cond_0

    .line 43
    return-void

    .line 45
    :cond_0
    invoke-interface {v0, p0, p1}, Lcom/squareup/leakcanary/CanaryLog$Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-void
.end method

.method public static varargs d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 50
    sget-object v0, Lcom/squareup/leakcanary/CanaryLog;->logger:Lcom/squareup/leakcanary/CanaryLog$Logger;

    .line 51
    if-nez v0, :cond_0

    .line 52
    return-void

    .line 54
    :cond_0
    invoke-interface {v0, p0, p1, p2}, Lcom/squareup/leakcanary/CanaryLog$Logger;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    return-void
.end method

.method public static setLogger(Lcom/squareup/leakcanary/CanaryLog$Logger;)V
    .locals 0

    .line 36
    sput-object p0, Lcom/squareup/leakcanary/CanaryLog;->logger:Lcom/squareup/leakcanary/CanaryLog$Logger;

    .line 37
    return-void
.end method
