.class Lo/bhk$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bhk;->b(Lo/bhk$b;ILcom/huawei/health/sns/model/group/GroupMember;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/model/group/GroupMember;

.field final synthetic e:Lo/bhk;


# direct methods
.method constructor <init>(Lo/bhk;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lo/bhk$1;->e:Lo/bhk;

    iput-object p2, p0, Lo/bhk$1;->b:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 156
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 157
    if-eqz p2, :cond_0

    .line 158
    iget-object v0, p0, Lo/bhk$1;->e:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->b(Lo/bhk;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bhk$1;->b:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 159
    iget-object v0, p0, Lo/bhk$1;->e:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->b(Lo/bhk;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bhk$1;->b:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 162
    :cond_0
    iget-object v0, p0, Lo/bhk$1;->e:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->b(Lo/bhk;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bhk$1;->b:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 163
    iget-object v0, p0, Lo/bhk$1;->e:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->b(Lo/bhk;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bhk$1;->b:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 166
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/bhk$1;->e:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->d(Lo/bhk;)Lo/bhk$d;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 167
    iget-object v0, p0, Lo/bhk$1;->e:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->d(Lo/bhk;)Lo/bhk$d;

    move-result-object v0

    invoke-interface {v0}, Lo/bhk$d;->e()V

    .line 171
    :cond_2
    return-void
.end method
