.class final Lcom/microblink/internal/DiskUtils$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic val$bitmap:Landroid/graphics/Bitmap;

.field final synthetic val$characteristics:Lcom/microblink/FrameCharacteristics;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$name:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/microblink/FrameCharacteristics;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/DiskUtils$2;->val$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/microblink/internal/DiskUtils$2;->val$name:Ljava/lang/String;

    iput-object p3, p0, Lcom/microblink/internal/DiskUtils$2;->val$bitmap:Landroid/graphics/Bitmap;

    iput-object p4, p0, Lcom/microblink/internal/DiskUtils$2;->val$characteristics:Lcom/microblink/FrameCharacteristics;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/DiskUtils$2;->val$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/microblink/internal/DiskUtils$2;->val$name:Ljava/lang/String;

    iget-object v2, p0, Lcom/microblink/internal/DiskUtils$2;->val$bitmap:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/microblink/internal/DiskUtils$2;->val$characteristics:Lcom/microblink/FrameCharacteristics;

    invoke-static {v0, v1, v2, v3}, Lcom/microblink/internal/DiskUtils;->writeToDisk(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/microblink/FrameCharacteristics;)V
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
