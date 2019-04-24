.class Lcom/huawei/hwbtsdk/ui/NotifyActivity$3;
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
.field final synthetic c:Lcom/huawei/hwbtsdk/ui/NotifyActivity;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/hwbtsdk/ui/NotifyActivity;Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/hwbtsdk/ui/NotifyActivity$3;->c:Lcom/huawei/hwbtsdk/ui/NotifyActivity;

    iput-object p2, p0, Lcom/huawei/hwbtsdk/ui/NotifyActivity$3;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 58
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/NotifyActivity$3;->c:Lcom/huawei/hwbtsdk/ui/NotifyActivity;

    iget-object v1, p0, Lcom/huawei/hwbtsdk/ui/NotifyActivity$3;->e:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/hwbtsdk/ui/NotifyActivity;->e(Lcom/huawei/hwbtsdk/ui/NotifyActivity;ILjava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/NotifyActivity$3;->c:Lcom/huawei/hwbtsdk/ui/NotifyActivity;

    invoke-virtual {v0}, Lcom/huawei/hwbtsdk/ui/NotifyActivity;->finish()V

    .line 60
    return-void
.end method
