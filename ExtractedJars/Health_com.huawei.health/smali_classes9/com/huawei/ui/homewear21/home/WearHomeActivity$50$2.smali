.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$50$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$50;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$50;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$50;Ljava/lang/String;)V
    .locals 0

    .line 5131
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$50$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$50;

    iput-object p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$50$2;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 5134
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$50$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$50;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$50;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$50$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$50;

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$50;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$50$2;->b:Ljava/lang/String;

    const/4 v3, 0x7

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/util/ArrayList;Ljava/lang/String;)V

    .line 5135
    return-void
.end method
