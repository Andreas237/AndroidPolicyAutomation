.class final enum Lcom/nytimes/android/external/cache/DirectExecutor;
.super Ljava/lang/Enum;
.source "DirectExecutor.java"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/nytimes/android/external/cache/DirectExecutor;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/nytimes/android/external/cache/DirectExecutor;

.field public static final enum INSTANCE:Lcom/nytimes/android/external/cache/DirectExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 8
    new-instance v0, Lcom/nytimes/android/external/cache/DirectExecutor;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/nytimes/android/external/cache/DirectExecutor;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nytimes/android/external/cache/DirectExecutor;->INSTANCE:Lcom/nytimes/android/external/cache/DirectExecutor;

    const/4 v0, 0x1

    .line 7
    new-array v0, v0, [Lcom/nytimes/android/external/cache/DirectExecutor;

    sget-object v1, Lcom/nytimes/android/external/cache/DirectExecutor;->INSTANCE:Lcom/nytimes/android/external/cache/DirectExecutor;

    aput-object v1, v0, v2

    sput-object v0, Lcom/nytimes/android/external/cache/DirectExecutor;->$VALUES:[Lcom/nytimes/android/external/cache/DirectExecutor;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nytimes/android/external/cache/DirectExecutor;
    .locals 1

    .line 7
    const-class v0, Lcom/nytimes/android/external/cache/DirectExecutor;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/nytimes/android/external/cache/DirectExecutor;

    return-object p0
.end method

.method public static values()[Lcom/nytimes/android/external/cache/DirectExecutor;
    .locals 1

    .line 7
    sget-object v0, Lcom/nytimes/android/external/cache/DirectExecutor;->$VALUES:[Lcom/nytimes/android/external/cache/DirectExecutor;

    invoke-virtual {v0}, [Lcom/nytimes/android/external/cache/DirectExecutor;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nytimes/android/external/cache/DirectExecutor;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # Ljava/lang/Runnable;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 10
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MoreExecutors.directExecutor()"

    return-object v0
.end method
