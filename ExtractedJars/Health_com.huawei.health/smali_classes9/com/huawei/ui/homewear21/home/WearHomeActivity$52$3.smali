.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$52$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$52;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$52;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$52;)V
    .locals 0

    .line 5389
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$52$3;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$52;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 5392
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$52$3;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$52;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$52;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_homewear_turn_on_location_services_tip:I

    const/16 v2, 0x66

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(II)V

    .line 5393
    return-void
.end method
