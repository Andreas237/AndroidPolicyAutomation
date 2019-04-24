.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$35;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 3912
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$35;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 3915
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showLoginFail cancel click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3916
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$35;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->S(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 3917
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$35;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lo/egv;)Lo/egv;

    .line 3918
    return-void
.end method
