.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$1;
.super Lcom/huawei/ui/homewear21/home/WearHomeActivity$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 616
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$1;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0, p2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$d;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 620
    invoke-virtual {p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$1;->c()Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    move-result-object v1

    .line 621
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 622
    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 624
    :cond_0
    return-void
.end method
