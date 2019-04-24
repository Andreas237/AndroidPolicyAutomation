.class public Lcom/microblink/internal/PriorityRunnable;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final priority:Lcom/microblink/internal/Priority;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/microblink/internal/Priority;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/Priority;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/PriorityRunnable;->priority:Lcom/microblink/internal/Priority;

    return-void
.end method


# virtual methods
.method public priority()Lcom/microblink/internal/Priority;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/PriorityRunnable;->priority:Lcom/microblink/internal/Priority;

    return-object v0
.end method

.method public run()V
    .locals 0

    return-void
.end method
