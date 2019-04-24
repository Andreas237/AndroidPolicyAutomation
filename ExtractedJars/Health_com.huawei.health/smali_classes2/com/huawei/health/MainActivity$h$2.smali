.class Lcom/huawei/health/MainActivity$h$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity$h;->c(Lcom/huawei/health/MainActivity;Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/MainActivity$h;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity$h;)V
    .locals 0

    .line 2046
    iput-object p1, p0, Lcom/huawei/health/MainActivity$h$2;->c:Lcom/huawei/health/MainActivity$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 2049
    iget-object v0, p0, Lcom/huawei/health/MainActivity$h$2;->c:Lcom/huawei/health/MainActivity$h;

    iget-object v0, v0, Lcom/huawei/health/MainActivity$h;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ale;->e(Z)V

    .line 2050
    return-void
.end method
