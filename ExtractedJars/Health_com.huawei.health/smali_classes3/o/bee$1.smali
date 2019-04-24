.class Lo/bee$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bee;->e(Landroid/widget/ListView;Lo/bee$e;Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bee$e;

.field final synthetic b:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic c:Lo/beu;

.field final synthetic e:Lo/bee;


# direct methods
.method constructor <init>(Lo/bee;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;Lo/bee$e;)V
    .locals 0

    .line 255
    iput-object p1, p0, Lo/bee$1;->e:Lo/bee;

    iput-object p2, p0, Lo/bee$1;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/bee$1;->c:Lo/beu;

    iput-object p4, p0, Lo/bee$1;->a:Lo/bee$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 260
    iget-object v0, p0, Lo/bee$1;->e:Lo/bee;

    iget-object v0, v0, Lo/bee;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-nez v0, :cond_0

    .line 262
    iget-object v0, p0, Lo/bee$1;->e:Lo/bee;

    iget-object v1, p0, Lo/bee$1;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/bee$1;->c:Lo/beu;

    invoke-virtual {v0, v1, v2}, Lo/bee;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    goto :goto_0

    .line 267
    :cond_0
    const-string v0, "AssistantChatHeadLineView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AssistantChatHeadLineView onItemClick position: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    iget-object v1, p0, Lo/bee$1;->e:Lo/bee;

    iget-object v1, v1, Lo/bee;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-object v2, p0, Lo/bee$1;->e:Lo/bee;

    invoke-static {v2}, Lo/bee;->b(Lo/bee;)J

    move-result-wide v2

    iget-object v4, p0, Lo/bee$1;->e:Lo/bee;

    invoke-static {v4}, Lo/bee;->e(Lo/bee;)J

    move-result-wide v4

    iget-object v6, p0, Lo/bee$1;->e:Lo/bee;

    invoke-static {v6}, Lo/bee;->c(Lo/bee;)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v7, p3, 0x1

    iget-object v8, p0, Lo/bee$1;->e:Lo/bee;

    iget-object v8, v8, Lo/bee;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    .line 269
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->C()Ljava/lang/String;

    move-result-object v8

    .line 268
    invoke-virtual/range {v0 .. v8}, Lo/aow;->e(Landroid/content/Context;JJLjava/lang/String;ILjava/lang/String;)V

    .line 270
    iget-object v0, p0, Lo/bee$1;->e:Lo/bee;

    iget-object v1, p0, Lo/bee$1;->a:Lo/bee$e;

    invoke-virtual {v1, p3}, Lo/bee$e;->d(I)Lo/axq;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bee;->c(Lo/axq;)V

    .line 272
    :goto_0
    return-void
.end method
