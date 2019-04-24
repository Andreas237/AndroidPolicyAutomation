.class Lcom/huawei/bone/social/ui/LauncherActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/ui/LauncherActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/bone/social/ui/LauncherActivity;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lcom/huawei/bone/social/ui/LauncherActivity$1;->c:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 289
    new-instance v2, Lo/wq;

    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$1;->c:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->d(Lcom/huawei/bone/social/ui/LauncherActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Lo/wq;-><init>(Landroid/content/Context;)V

    .line 290
    new-instance v0, Lcom/huawei/bone/social/ui/LauncherActivity$1$2;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/ui/LauncherActivity$1$2;-><init>(Lcom/huawei/bone/social/ui/LauncherActivity$1;)V

    const/4 v1, 0x0

    invoke-virtual {v2, v1, v0}, Lo/wq;->a(ILo/wo;)V

    .line 318
    return-void
.end method
