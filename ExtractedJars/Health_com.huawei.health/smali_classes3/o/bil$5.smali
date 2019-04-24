.class Lo/bil$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bil;->c(Lo/bil$c;ILcom/huawei/health/sns/model/group/GroupMember;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/model/group/GroupMember;

.field final synthetic e:Lo/bil;


# direct methods
.method constructor <init>(Lo/bil;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lo/bil$5;->e:Lo/bil;

    iput-object p2, p0, Lo/bil$5;->a:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 159
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 160
    if-eqz p2, :cond_0

    .line 161
    iget-object v0, p0, Lo/bil$5;->e:Lo/bil;

    invoke-static {v0}, Lo/bil;->a(Lo/bil;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bil$5;->a:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 162
    iget-object v0, p0, Lo/bil$5;->e:Lo/bil;

    invoke-static {v0}, Lo/bil;->a(Lo/bil;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bil$5;->a:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 165
    :cond_0
    iget-object v0, p0, Lo/bil$5;->e:Lo/bil;

    invoke-static {v0}, Lo/bil;->a(Lo/bil;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bil$5;->a:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 166
    iget-object v0, p0, Lo/bil$5;->e:Lo/bil;

    invoke-static {v0}, Lo/bil;->a(Lo/bil;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bil$5;->a:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 169
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/bil$5;->e:Lo/bil;

    invoke-static {v0}, Lo/bil;->e(Lo/bil;)Lo/bil$d;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 170
    iget-object v0, p0, Lo/bil$5;->e:Lo/bil;

    invoke-static {v0}, Lo/bil;->e(Lo/bil;)Lo/bil$d;

    move-result-object v0

    invoke-interface {v0}, Lo/bil$d;->c()V

    .line 174
    :cond_2
    return-void
.end method
