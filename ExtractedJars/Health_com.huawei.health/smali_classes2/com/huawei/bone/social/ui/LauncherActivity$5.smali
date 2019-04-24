.class Lcom/huawei/bone/social/ui/LauncherActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/ui/LauncherActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/bone/social/ui/LauncherActivity;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/huawei/bone/social/ui/LauncherActivity$5;->a:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 130
    invoke-static {}, Lcom/huawei/bone/social/ui/LauncherActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick socialTitlebar"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$5;->a:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0, p1}, Lcom/huawei/bone/social/ui/LauncherActivity;->a(Lcom/huawei/bone/social/ui/LauncherActivity;Landroid/view/View;)V

    .line 132
    return-void
.end method
