.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$78$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$78;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$78;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$78;)V
    .locals 0

    .line 6787
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$78$3;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$78;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 6790
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$78$3;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$78;

    iget v1, v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$78;->d:I

    invoke-virtual {v0, v1}, Lo/dde;->c(I)V

    .line 6791
    return-void
.end method
