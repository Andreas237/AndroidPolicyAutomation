.class Lcom/huawei/openalliance/ad/views/AppDownloadButton$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/AppDownloadButton;->onAttachedToWindow()V
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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$1;->a:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/AppDownloadButton$1;->a:Lcom/huawei/openalliance/ad/views/AppDownloadButton;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/AppDownloadButton;->refreshStatus()Lcom/huawei/openalliance/ad/download/app/AppStatus;

    return-void
.end method
