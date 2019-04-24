.class public final Lo/bbs;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/widget/ImageView;)Lo/bbp$c;
    .locals 3

    .line 25
    if-eqz p0, :cond_0

    .line 27
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 28
    instance-of v0, v1, Lo/bbp$a;

    if-eqz v0, :cond_0

    .line 30
    move-object v2, v1

    check-cast v2, Lo/bbp$a;

    .line 31
    invoke-virtual {v2}, Lo/bbp$a;->c()Lo/bbp$c;

    move-result-object v0

    return-object v0

    .line 34
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Lo/bbf;Landroid/content/Context;)V
    .locals 4

    .line 69
    const-string v0, "ImageWorkerHelper2"

    const-string v1, "sendUserImageUrlChangeBroadcast. image url change."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    new-instance v3, Landroid/content/Intent;

    const-string v0, "user_detail_info_change"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 71
    const-string v0, "bundleKeyUserId"

    invoke-virtual {p0}, Lo/bbf;->c()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 72
    invoke-static {v3}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 73
    return-void
.end method

.method public static c(Lo/bbi;)Ljava/lang/String;
    .locals 2

    .line 45
    const/4 v1, 0x0

    .line 46
    instance-of v0, p0, Lo/bbf;

    if-eqz v0, :cond_0

    .line 48
    move-object v0, p0

    check-cast v0, Lo/bbf;

    invoke-virtual {v0}, Lo/bbf;->e()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 50
    :cond_0
    instance-of v0, p0, Lo/baw;

    if-eqz v0, :cond_1

    .line 52
    move-object v0, p0

    check-cast v0, Lo/baw;

    invoke-virtual {v0}, Lo/baw;->e()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 56
    :cond_1
    iget-object v1, p0, Lo/bbi;->c:Ljava/lang/String;

    .line 58
    :goto_0
    return-object v1
.end method
