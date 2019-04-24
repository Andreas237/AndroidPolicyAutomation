.class Lcom/huawei/bone/social/ui/LauncherActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/ui/LauncherActivity;->b(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/bone/social/ui/LauncherActivity;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/huawei/bone/social/ui/LauncherActivity$2;->d:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 239
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$2;->d:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->c()V

    .line 240
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$2;->d:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->c(Lcom/huawei/bone/social/ui/LauncherActivity;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 241
    return-void
.end method
