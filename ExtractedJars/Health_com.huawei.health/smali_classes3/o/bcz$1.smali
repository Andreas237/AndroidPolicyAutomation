.class Lo/bcz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bcz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bcz;


# direct methods
.method constructor <init>(Lo/bcz;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lo/bcz$1;->a:Lo/bcz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 142
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 144
    iget-object v0, p0, Lo/bcz$1;->a:Lo/bcz;

    invoke-static {v0}, Lo/bcz;->e(Lo/bcz;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    if-ltz v2, :cond_0

    iget-object v0, p0, Lo/bcz$1;->a:Lo/bcz;

    invoke-static {v0}, Lo/bcz;->e(Lo/bcz;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le v2, v0, :cond_1

    .line 146
    :cond_0
    return-void

    .line 148
    :cond_1
    iget-object v0, p0, Lo/bcz$1;->a:Lo/bcz;

    invoke-static {v0}, Lo/bcz;->e(Lo/bcz;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/chat/AssistantMenu;

    .line 149
    if-eqz v3, :cond_2

    .line 151
    iget-object v0, p0, Lo/bcz$1;->a:Lo/bcz;

    invoke-virtual {v0, p1, v3}, Lo/bcz;->b(Landroid/view/View;Lcom/huawei/health/sns/model/chat/AssistantMenu;)V

    .line 153
    :cond_2
    return-void
.end method
