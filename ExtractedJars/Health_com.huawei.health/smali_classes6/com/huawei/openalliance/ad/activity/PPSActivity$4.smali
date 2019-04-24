.class Lcom/huawei/openalliance/ad/activity/PPSActivity$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/AppDownloadButton$ButtonTextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/activity/PPSActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

.field final synthetic b:Lcom/huawei/openalliance/ad/activity/PPSActivity;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/activity/PPSActivity;Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$4;->b:Lcom/huawei/openalliance/ad/activity/PPSActivity;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$4;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public beforeTextChanged(Ljava/lang/CharSequence;Lcom/huawei/openalliance/ad/download/app/AppStatus;)Ljava/lang/CharSequence;
    .locals 5

    if-eqz p2, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/download/app/AppStatus;->DOWNLOAD:Lcom/huawei/openalliance/ad/download/app/AppStatus;

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$4;->b:Lcom/huawei/openalliance/ad/activity/PPSActivity;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$4;->a:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getFileSize()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/i;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/activity/PPSActivity$4;->b:Lcom/huawei/openalliance/ad/activity/PPSActivity;

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_download_download_with_size:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/huawei/openalliance/ad/activity/PPSActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p1
.end method
