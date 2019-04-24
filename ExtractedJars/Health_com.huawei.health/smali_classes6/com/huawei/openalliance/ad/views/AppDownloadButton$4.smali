.class Lcom/huawei/openalliance/ad/views/AppDownloadButton$4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Landroid/content/Context;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/AppDownloadButton;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$4;->a:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$4;->a:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->setAllowedNonWifiNetwork(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$4;->a:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->a(Lcom/huawei/openalliance/ad/views/AppDownloadButton;)V

    return-void
.end method
