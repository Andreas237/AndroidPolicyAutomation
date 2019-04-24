.class Lcom/ibotta/android/App$1;
.super Ljava/lang/Object;
.source "App.java"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/App;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/App;


# direct methods
.method constructor <init>(Lcom/ibotta/android/App;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/ibotta/android/App$1;->this$0:Lcom/ibotta/android/App;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    .line 91
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 92
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 93
    invoke-virtual {p2, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 95
    invoke-static {}, Lcom/ibotta/android/App;->isDebug()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "App"

    const-string v1, "Ibotta Crashed"

    .line 96
    invoke-static {v0, v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 99
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/App$1;->this$0:Lcom/ibotta/android/App;

    invoke-static {v0}, Lcom/ibotta/android/App;->access$000(Lcom/ibotta/android/App;)Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
