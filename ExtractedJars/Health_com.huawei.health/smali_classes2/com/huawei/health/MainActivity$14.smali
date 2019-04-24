.class Lcom/huawei/health/MainActivity$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity;->am()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 3516
    iput-object p1, p0, Lcom/huawei/health/MainActivity$14;->a:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 3519
    iget-object v0, p0, Lcom/huawei/health/MainActivity$14;->a:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->I(Lcom/huawei/health/MainActivity;)Lo/elw;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity$14;->a:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->s(Lcom/huawei/health/MainActivity;)Lo/abc;

    move-result-object v1

    invoke-virtual {v1}, Lo/abc;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/elw;->setItemChecked(I)V

    .line 3520
    return-void
.end method
