.class Lretrofit/Platform$Android$2;
.super Ljava/lang/Object;
.source "Platform.java"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lretrofit/Platform$Android;->defaultHttpExecutor()Ljava/util/concurrent/Executor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lretrofit/Platform$Android;


# direct methods
.method constructor <init>(Lretrofit/Platform$Android;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lretrofit/Platform$Android$2;->this$0:Lretrofit/Platform$Android;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 139
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lretrofit/Platform$Android$2$1;

    invoke-direct {v1, p0, p1}, Lretrofit/Platform$Android$2$1;-><init>(Lretrofit/Platform$Android$2;Ljava/lang/Runnable;)V

    const-string p1, "Retrofit-Idle"

    invoke-direct {v0, v1, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-object v0
.end method
