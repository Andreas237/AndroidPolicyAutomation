.class Lo/ber$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ber;->c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/ui/chat/ChatActivity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/huawei/health/sns/ui/chat/ChatActivity;

.field final synthetic c:Lo/beu;

.field final synthetic d:Lo/ber;

.field final synthetic e:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lo/ber;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/ui/chat/ChatActivity;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lo/ber$5;->d:Lo/ber;

    iput-object p2, p0, Lo/ber$5;->c:Lo/beu;

    iput-object p3, p0, Lo/ber$5;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-boolean p4, p0, Lo/ber$5;->a:Z

    iput-object p5, p0, Lo/ber$5;->b:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 189
    iget-object v0, p0, Lo/ber$5;->d:Lo/ber;

    iget-object v1, p0, Lo/ber$5;->c:Lo/beu;

    iget-object v2, p0, Lo/ber$5;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-boolean v3, p0, Lo/ber$5;->a:Z

    iget-object v4, p0, Lo/ber$5;->b:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-static {v0, v1, v2, v3, v4}, Lo/ber;->a(Lo/ber;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/ui/chat/ChatActivity;)V

    .line 190
    return-void
.end method
