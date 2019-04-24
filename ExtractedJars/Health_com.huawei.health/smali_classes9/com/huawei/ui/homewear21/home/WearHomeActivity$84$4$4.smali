.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4;ZLjava/lang/String;)V
    .locals 0

    .line 1196
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4$4;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4;

    iput-boolean p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4$4;->e:Z

    iput-object p3, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4$4;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1199
    iget-boolean v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4$4;->e:Z

    if-eqz v0, :cond_0

    .line 1200
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4$4;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$84;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4$4;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/lang/String;)V

    goto :goto_0

    .line 1202
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4$4;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$84;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a()V

    .line 1204
    :goto_0
    return-void
.end method
