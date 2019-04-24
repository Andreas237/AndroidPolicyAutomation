.class Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;>;"
        }
    .end annotation
.end field

.field final synthetic d:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V
    .locals 1

    .line 388
    iput-object p1, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$b;->d:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    .line 389
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 390
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$b;->a:Ljava/lang/ref/WeakReference;

    .line 391
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 394
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyCloseOnClickListener onClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$b;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    .line 396
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 397
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyCloseOnClickListener Aw70ModeSelectActivity =null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    return-void

    .line 400
    :cond_0
    invoke-static {v4}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->d(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 401
    invoke-static {v4}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 402
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->c(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;I)I

    .line 403
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$b;->d:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->c(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$b;->d:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->b(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->hide()V

    .line 406
    return-void
.end method
