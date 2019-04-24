.class Lcom/huawei/health/sns/ui/HomeActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/HomeActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/HomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 0

    .line 1771
    iput-object p1, p0, Lcom/huawei/health/sns/ui/HomeActivity$3;->c:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1776
    invoke-static {}, Lo/arw;->c()Lo/asb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/HomeActivity$3;->c:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-virtual {v0, v1}, Lo/asb;->a(Landroid/app/Activity;)V

    .line 1777
    return-void
.end method
