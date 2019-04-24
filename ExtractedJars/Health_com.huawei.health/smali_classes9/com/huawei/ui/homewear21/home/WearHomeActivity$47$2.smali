.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$47$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$47;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$47;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$47;Ljava/lang/String;)V
    .locals 0

    .line 5282
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$47$2;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$47;

    iput-object p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$47$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 5285
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$47$2;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$47;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$47;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$47$2;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$47;

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$47;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$47$2;->a:Ljava/lang/String;

    const/16 v3, 0x23

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/util/ArrayList;Ljava/lang/String;)V

    .line 5286
    return-void
.end method
