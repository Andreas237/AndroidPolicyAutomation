.class Lcom/microblink/CameraScanActivity$9;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/CameraScanActivity;

.field final synthetic val$media:Lcom/microblink/Media;

.field final synthetic val$results:Lcom/microblink/ScanResults;


# direct methods
.method constructor <init>(Lcom/microblink/CameraScanActivity;Lcom/microblink/ScanResults;Lcom/microblink/Media;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/CameraScanActivity$9;->this$0:Lcom/microblink/CameraScanActivity;

    iput-object p2, p0, Lcom/microblink/CameraScanActivity$9;->val$results:Lcom/microblink/ScanResults;

    iput-object p3, p0, Lcom/microblink/CameraScanActivity$9;->val$media:Lcom/microblink/Media;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$9;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-static {v0}, Lcom/microblink/CameraScanActivity;->access$000(Lcom/microblink/CameraScanActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$9;->this$0:Lcom/microblink/CameraScanActivity;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "dataExtra"

    iget-object v3, p0, Lcom/microblink/CameraScanActivity$9;->val$results:Lcom/microblink/ScanResults;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "mediaExtra"

    iget-object v3, p0, Lcom/microblink/CameraScanActivity$9;->val$media:Lcom/microblink/Media;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v0, v2, v1}, Lcom/microblink/CameraScanActivity;->setResult(ILandroid/content/Intent;)V

    iget-object v0, p0, Lcom/microblink/CameraScanActivity$9;->this$0:Lcom/microblink/CameraScanActivity;

    invoke-virtual {v0}, Lcom/microblink/CameraScanActivity;->finish()V

    return-void
.end method
