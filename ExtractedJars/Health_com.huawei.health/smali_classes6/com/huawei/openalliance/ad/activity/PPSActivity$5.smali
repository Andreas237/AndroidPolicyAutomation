.class Lcom/huawei/openalliance/ad/activity/PPSActivity$5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/activity/PPSActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/activity/PPSActivity;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/activity/PPSActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$5;->a:Lcom/huawei/openalliance/ad/activity/PPSActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$5;->a:Lcom/huawei/openalliance/ad/activity/PPSActivity;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->a(Lcom/huawei/openalliance/ad/activity/PPSActivity;)Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->cancel()V

    return-void
.end method
