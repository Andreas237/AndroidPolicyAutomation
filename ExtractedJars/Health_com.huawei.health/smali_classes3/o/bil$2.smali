.class Lo/bil$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bil;->d(Lo/bil$c;ILcom/huawei/health/sns/model/group/GroupMember;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bil;

.field final synthetic b:Lcom/huawei/health/sns/model/group/GroupMember;

.field final synthetic e:Lo/bil$c;


# direct methods
.method constructor <init>(Lo/bil;Lo/bil$c;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lo/bil$2;->a:Lo/bil;

    iput-object p2, p0, Lo/bil$2;->e:Lo/bil$c;

    iput-object p3, p0, Lo/bil$2;->b:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3

    .line 116
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 117
    if-eqz p2, :cond_2

    .line 118
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/bil$2;->a:Lo/bil;

    invoke-static {v0}, Lo/bil;->c(Lo/bil;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 119
    iget-object v0, p0, Lo/bil$2;->a:Lo/bil;

    invoke-static {v0}, Lo/bil;->c(Lo/bil;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lo/bil$2;->e:Lo/bil$c;

    invoke-static {v1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 120
    iget-object v0, p0, Lo/bil$2;->a:Lo/bil;

    invoke-static {v0}, Lo/bil;->c(Lo/bil;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_1

    .line 122
    :cond_0
    iget-object v0, p0, Lo/bil$2;->a:Lo/bil;

    invoke-static {v0}, Lo/bil;->c(Lo/bil;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 118
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 125
    :cond_1
    iget-object v0, p0, Lo/bil$2;->a:Lo/bil;

    invoke-static {v0}, Lo/bil;->a(Lo/bil;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 126
    iget-object v0, p0, Lo/bil$2;->a:Lo/bil;

    invoke-static {v0}, Lo/bil;->a(Lo/bil;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bil$2;->b:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 128
    :cond_2
    iget-object v0, p0, Lo/bil$2;->a:Lo/bil;

    invoke-static {v0}, Lo/bil;->a(Lo/bil;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bil$2;->b:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 129
    iget-object v0, p0, Lo/bil$2;->a:Lo/bil;

    invoke-static {v0}, Lo/bil;->a(Lo/bil;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lo/bil$2;->b:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 132
    :cond_3
    :goto_2
    iget-object v0, p0, Lo/bil$2;->a:Lo/bil;

    invoke-static {v0}, Lo/bil;->e(Lo/bil;)Lo/bil$d;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 133
    iget-object v0, p0, Lo/bil$2;->a:Lo/bil;

    invoke-static {v0}, Lo/bil;->e(Lo/bil;)Lo/bil$d;

    move-result-object v0

    invoke-interface {v0}, Lo/bil$d;->c()V

    .line 136
    :cond_4
    return-void
.end method
