.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/lang/String;)V
    .locals 0

    .line 1223
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iput-object p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1227
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->h(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 1228
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showUnbindDialog ok click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1229
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->k(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 1230
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lo/egv;)Lo/egv;

    .line 1231
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/der;->e(Landroid/content/Context;)Lo/der;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;->e:Ljava/lang/String;

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$3$5;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$3;)V

    invoke-virtual {v0, v1, v2}, Lo/der;->d(Ljava/lang/String;Lo/dgg;)V

    .line 1249
    return-void
.end method
