.class Lo/bhk$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bhk;->e(Lo/bhk$b;ILcom/huawei/health/sns/model/group/GroupMember;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bhk;

.field final synthetic d:Lo/bhk$b;

.field final synthetic e:Lcom/huawei/health/sns/model/group/GroupMember;


# direct methods
.method constructor <init>(Lo/bhk;Lo/bhk$b;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lo/bhk$2;->b:Lo/bhk;

    iput-object p2, p0, Lo/bhk$2;->d:Lo/bhk$b;

    iput-object p3, p0, Lo/bhk$2;->e:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 113
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 114
    if-eqz p2, :cond_2

    .line 115
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/bhk$2;->b:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->a(Lo/bhk;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 116
    iget-object v0, p0, Lo/bhk$2;->b:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->a(Lo/bhk;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lo/bhk$2;->d:Lo/bhk$b;

    invoke-static {v1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 117
    iget-object v0, p0, Lo/bhk$2;->b:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->a(Lo/bhk;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_1

    .line 119
    :cond_0
    iget-object v0, p0, Lo/bhk$2;->b:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->a(Lo/bhk;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 115
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 122
    :cond_1
    iget-object v0, p0, Lo/bhk$2;->b:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->b(Lo/bhk;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 123
    iget-object v0, p0, Lo/bhk$2;->b:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->b(Lo/bhk;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bhk$2;->e:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 125
    :cond_2
    iget-object v0, p0, Lo/bhk$2;->b:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->b(Lo/bhk;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bhk$2;->e:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 126
    iget-object v0, p0, Lo/bhk$2;->b:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->b(Lo/bhk;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bhk$2;->e:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 129
    :cond_3
    :goto_2
    iget-object v0, p0, Lo/bhk$2;->b:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->d(Lo/bhk;)Lo/bhk$d;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 130
    iget-object v0, p0, Lo/bhk$2;->b:Lo/bhk;

    invoke-static {v0}, Lo/bhk;->d(Lo/bhk;)Lo/bhk$d;

    move-result-object v0

    invoke-interface {v0}, Lo/bhk$d;->e()V

    .line 133
    :cond_4
    return-void
.end method
