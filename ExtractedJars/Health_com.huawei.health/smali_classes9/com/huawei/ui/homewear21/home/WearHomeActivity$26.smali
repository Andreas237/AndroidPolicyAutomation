.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$26;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


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
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 3137
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$26;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 7

    .line 3140
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Rotate switch screem is onCheckedChanged isChecked = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3141
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setClickable(Z)V

    .line 3142
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$26;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->r(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 3143
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$26;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$26;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/ArrayList;

    move-result-object v1

    const/16 v2, 0x19

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/util/ArrayList;I)Lo/eoq;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/eoq;->e(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3144
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 3145
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$26;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/enz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$26;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/homewear21/home/WearHomeActivity$26$2;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$26$2;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$26;Landroid/widget/CompoundButton;)V

    invoke-virtual {v0, v1, p2, v2}, Lo/enz;->c(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3156
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$26$5;

    invoke-direct {v0, p0, p2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$26$5;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$26;Z)V

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3171
    return-void
.end method
