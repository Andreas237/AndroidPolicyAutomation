.class final Lcom/microblink/internal/DiskUtils$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$deleteRoot:Z

.field final synthetic val$exclusion:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/DiskUtils$3;->val$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/microblink/internal/DiskUtils$3;->val$exclusion:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/microblink/internal/DiskUtils$3;->val$deleteRoot:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/DiskUtils$3;->val$context:Landroid/content/Context;

    const-string v1, "/microblink/captured"

    iget-object v2, p0, Lcom/microblink/internal/DiskUtils$3;->val$exclusion:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/microblink/internal/DiskUtils$3;->val$deleteRoot:Z

    invoke-static {v0, v1, v2, v3}, Lcom/microblink/internal/DiskUtils;->access$100(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/microblink/internal/DiskUtils$3;->val$context:Landroid/content/Context;

    const-string v1, "/microblink/tmp"

    iget-object v2, p0, Lcom/microblink/internal/DiskUtils$3;->val$exclusion:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/microblink/internal/DiskUtils$3;->val$deleteRoot:Z

    invoke-static {v0, v1, v2, v3}, Lcom/microblink/internal/DiskUtils;->access$100(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "DiskUtils"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
