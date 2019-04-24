.class Lcom/huawei/hwbtsdk/ui/NotifyActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwbtsdk/ui/NotifyActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbtsdk/ui/NotifyActivity;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/hwbtsdk/ui/NotifyActivity;Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/hwbtsdk/ui/NotifyActivity$4;->a:Lcom/huawei/hwbtsdk/ui/NotifyActivity;

    iput-object p2, p0, Lcom/huawei/hwbtsdk/ui/NotifyActivity$4;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 50
    const-string v0, "NotifyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/NotifyActivity$4;->a:Lcom/huawei/hwbtsdk/ui/NotifyActivity;

    iget-object v1, p0, Lcom/huawei/hwbtsdk/ui/NotifyActivity$4;->b:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Lcom/huawei/hwbtsdk/ui/NotifyActivity;->e(Lcom/huawei/hwbtsdk/ui/NotifyActivity;ILjava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/NotifyActivity$4;->a:Lcom/huawei/hwbtsdk/ui/NotifyActivity;

    invoke-virtual {v0}, Lcom/huawei/hwbtsdk/ui/NotifyActivity;->finish()V

    .line 53
    return-void
.end method
