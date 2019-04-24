.class final Lcom/microblink/internal/PriorityThreadFactory;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field private threadPriority:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/microblink/internal/PriorityThreadFactory;->threadPriority:I

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/internal/PriorityThreadFactory;)I
    .locals 0

    iget p0, p0, Lcom/microblink/internal/PriorityThreadFactory;->threadPriority:I

    return p0
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/microblink/internal/PriorityThreadFactory$1;

    invoke-direct {v1, p0, p1}, Lcom/microblink/internal/PriorityThreadFactory$1;-><init>(Lcom/microblink/internal/PriorityThreadFactory;Ljava/lang/Runnable;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    return-object v0
.end method
