.class Lo/bel$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bel;->b(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic c:Lo/bel$d;

.field final synthetic e:Lo/bel;


# direct methods
.method constructor <init>(Lo/bel;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bel$d;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lo/bel$1;->e:Lo/bel;

    iput-object p2, p0, Lo/bel$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/bel$1;->c:Lo/bel$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 151
    iget-object v0, p0, Lo/bel$1;->e:Lo/bel;

    iget-object v1, p0, Lo/bel$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/bel$1;->c:Lo/bel$d;

    invoke-static {v0, v1, v2}, Lo/bel;->e(Lo/bel;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 152
    return-void
.end method
