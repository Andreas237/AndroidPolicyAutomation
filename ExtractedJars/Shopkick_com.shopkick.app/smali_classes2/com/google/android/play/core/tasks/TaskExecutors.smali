.class public final Lcom/google/android/play/core/tasks/TaskExecutors;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/play/core/tasks/TaskExecutors$a;
    }
.end annotation


# static fields
.field public static final MAIN_THREAD:Ljava/util/concurrent/Executor;

.field static final a:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/play/core/tasks/TaskExecutors$a;

    invoke-direct {v0}, Lcom/google/android/play/core/tasks/TaskExecutors$a;-><init>()V

    sput-object v0, Lcom/google/android/play/core/tasks/TaskExecutors;->MAIN_THREAD:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/google/android/play/core/tasks/j;

    invoke-direct {v0}, Lcom/google/android/play/core/tasks/j;-><init>()V

    sput-object v0, Lcom/google/android/play/core/tasks/TaskExecutors;->a:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
