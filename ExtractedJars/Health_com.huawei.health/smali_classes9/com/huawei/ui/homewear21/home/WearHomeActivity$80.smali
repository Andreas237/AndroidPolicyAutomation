.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V
    .locals 0

    .line 6745
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$80;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iput p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$80;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 6748
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$80;->d:I

    invoke-virtual {v0, v1}, Lo/dde;->c(I)V

    .line 6749
    return-void
.end method
