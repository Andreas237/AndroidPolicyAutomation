.class Lo/fik$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fik$3;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fik$3;


# direct methods
.method constructor <init>(Lo/fik$3;)V
    .locals 0

    .line 418
    iput-object p1, p0, Lo/fik$3$1;->a:Lo/fik$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 421
    const-string v0, "PersonalCenterAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose open BT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 424
    iget-object v0, p0, Lo/fik$3$1;->a:Lo/fik$3;

    iget-object v0, v0, Lo/fik$3;->d:Lo/fik;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fik;->d(Lo/fik;I)I

    .line 425
    iget-object v0, p0, Lo/fik$3$1;->a:Lo/fik$3;

    iget-object v0, v0, Lo/fik$3;->d:Lo/fik;

    iget-object v1, p0, Lo/fik$3$1;->a:Lo/fik$3;

    iget-object v1, v1, Lo/fik$3;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lo/fik$3$1;->a:Lo/fik$3;

    iget-object v2, v2, Lo/fik$3;->c:Lo/ahh;

    iget-object v3, p0, Lo/fik$3$1;->a:Lo/fik$3;

    iget-object v3, v3, Lo/fik$3;->a:Landroid/widget/TextView;

    iget-object v4, p0, Lo/fik$3$1;->a:Lo/fik$3;

    iget-object v4, v4, Lo/fik$3;->e:Landroid/widget/LinearLayout;

    invoke-static {v0, v1, v2, v3, v4}, Lo/fik;->d(Lo/fik;Landroid/widget/LinearLayout;Lo/ahh;Landroid/widget/TextView;Landroid/widget/LinearLayout;)V

    .line 427
    iget-object v0, p0, Lo/fik$3$1;->a:Lo/fik$3;

    iget-object v0, v0, Lo/fik$3;->d:Lo/fik;

    iget-object v0, v0, Lo/fik;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    iget-object v1, p0, Lo/fik$3$1;->a:Lo/fik$3;

    iget-object v1, v1, Lo/fik$3;->d:Lo/fik;

    iget-object v1, v1, Lo/fik;->a:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d:Lo/acl$a;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lo/acl$a;)V

    .line 428
    iget-object v0, p0, Lo/fik$3$1;->a:Lo/fik$3;

    iget-object v0, v0, Lo/fik$3;->d:Lo/fik;

    invoke-virtual {v0}, Lo/fik;->notifyDataSetChanged()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 432
    :cond_0
    goto :goto_0

    .line 430
    :catch_0
    move-exception v5

    .line 431
    const-string v0, "PersonalCenterAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user choose open BT error :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    :goto_0
    return-void
.end method
