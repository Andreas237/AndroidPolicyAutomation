.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$65;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->aK()V
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

    .line 6047
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$65;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 6050
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "showOpenSystemBluetoothDialog 3333 !!!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 6051
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 6052
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6053
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/etq;->c(Z)V

    .line 6055
    :cond_0
    return-void
.end method
