.class Ldagger/internal/Loader$1$1;
.super Ldagger/internal/Memoizer;
.source "Loader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldagger/internal/Loader$1;->create(Ljava/lang/ClassLoader;)Ldagger/internal/Memoizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldagger/internal/Memoizer<",
        "Ljava/lang/String;",
        "Ljava/lang/Class<",
        "*>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Ldagger/internal/Loader$1;

.field final synthetic val$classLoader:Ljava/lang/ClassLoader;


# direct methods
.method constructor <init>(Ldagger/internal/Loader$1;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 31
    iput-object p1, p0, Ldagger/internal/Loader$1$1;->this$1:Ldagger/internal/Loader$1;

    iput-object p2, p0, Ldagger/internal/Loader$1$1;->val$classLoader:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Ldagger/internal/Memoizer;-><init>()V

    return-void
.end method


# virtual methods
.method protected create(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 34
    :try_start_0
    iget-object v0, p0, Ldagger/internal/Loader$1$1;->val$classLoader:Ljava/lang/ClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 36
    :catch_0
    const-class p1, Ljava/lang/Void;

    return-object p1
.end method

.method protected bridge synthetic create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 31
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ldagger/internal/Loader$1$1;->create(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method
