.class Lo/bhc$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bhc;->e(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/bhc;


# direct methods
.method constructor <init>(Lo/bhc;I)V
    .locals 0

    .line 288
    iput-object p1, p0, Lo/bhc$4;->b:Lo/bhc;

    iput p2, p0, Lo/bhc$4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 288
    invoke-virtual {p0, p1}, Lo/bhc$4;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 11

    .line 292
    iget-object v0, p0, Lo/bhc$4;->b:Lo/bhc;

    invoke-static {v0}, Lo/bhc;->e(Lo/bhc;)Lo/bhc$b;

    move-result-object v0

    iget v1, p0, Lo/bhc$4;->a:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/bhc$b;->e(I)Lo/bfh;

    move-result-object v4

    .line 293
    if-eqz v4, :cond_1

    instance-of v0, v4, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_1

    .line 295
    move-object v5, v4

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 296
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    .line 297
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v1

    .line 296
    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/ath;->b(JZ)Ljava/util/ArrayList;

    move-result-object v6

    .line 298
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 299
    const/4 v8, 0x0

    .line 300
    new-array v8, v7, [J

    .line 301
    const/4 v9, 0x0

    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v9, v0, :cond_0

    .line 303
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 304
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    aput-wide v0, v8, v9

    .line 301
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 306
    :cond_0
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    .line 307
    iget-object v0, p0, Lo/bhc$4;->b:Lo/bhc;

    invoke-static {v0}, Lo/bhc;->b(Lo/bhc;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 309
    const-string v0, "select_type"

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 311
    const-string v0, "ignore_list"

    invoke-virtual {v9, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[J)Landroid/content/Intent;

    .line 313
    const-string v0, "isCreateGroup"

    const/4 v1, 0x1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 314
    iget-object v0, p0, Lo/bhc$4;->b:Lo/bhc;

    invoke-static {v0}, Lo/bhc;->a(Lo/bhc;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 316
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
