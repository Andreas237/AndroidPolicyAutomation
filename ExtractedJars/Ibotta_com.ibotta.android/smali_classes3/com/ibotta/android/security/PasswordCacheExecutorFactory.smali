.class public Lcom/ibotta/android/security/PasswordCacheExecutorFactory;
.super Ljava/lang/Object;
.source "PasswordCacheExecutorFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newScheduledThreadPoolExecutor(I)Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    .locals 1

    .line 7
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-direct {v0, p1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    return-object v0
.end method
