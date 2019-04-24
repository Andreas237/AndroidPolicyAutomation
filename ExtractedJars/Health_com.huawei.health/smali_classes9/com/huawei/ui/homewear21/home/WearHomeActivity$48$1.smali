.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$48$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$48;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$48;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$48;Ljava/lang/String;)V
    .locals 0

    .line 5169
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$48$1;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$48;

    iput-object p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$48$1;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 5172
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$48$1;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$48;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$48;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$48$1;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$48;

    iget-object v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$48;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$48$1;->b:Ljava/lang/String;

    const/16 v3, 0x1a

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/util/ArrayList;Ljava/lang/String;)V

    .line 5173
    return-void
.end method
