.class public Lo/bdl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/bel;

.field private b:Lo/bfa;

.field private c:Lo/bev;

.field private d:Lo/beq;

.field private e:Lo/beg;

.field private f:Lo/bef;

.field private g:Lo/bee;

.field private h:Lo/bfc;

.field private i:Lo/ben;

.field private k:Lo/beh;

.field private n:Lo/bet;

.field private p:Lo/bem;


# direct methods
.method public constructor <init>(Lo/bfa;)V
    .locals 1

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdl;->d:Lo/beq;

    .line 109
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdl;->a:Lo/bel;

    .line 114
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdl;->c:Lo/bev;

    .line 119
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdl;->e:Lo/beg;

    .line 124
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdl;->k:Lo/beh;

    .line 129
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdl;->g:Lo/bee;

    .line 134
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdl;->f:Lo/bef;

    .line 139
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdl;->h:Lo/bfc;

    .line 144
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdl;->i:Lo/ben;

    .line 149
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdl;->p:Lo/bem;

    .line 154
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdl;->n:Lo/bet;

    .line 158
    iput-object p1, p0, Lo/bdl;->b:Lo/bfa;

    .line 159
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 173
    iget-object v0, p0, Lo/bdl;->h:Lo/bfc;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 175
    new-instance v0, Lo/bfc;

    iget-object v1, p0, Lo/bdl;->b:Lo/bfa;

    invoke-interface {v1}, Lo/bfa;->i()Lcom/huawei/health/sns/ui/chat/ChatActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bdl;->b:Lo/bfa;

    invoke-direct {v0, v1, v2}, Lo/bfc;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    iput-object v0, p0, Lo/bdl;->h:Lo/bfc;

    .line 177
    :cond_0
    iget-object v0, p0, Lo/bdl;->h:Lo/bfc;

    invoke-virtual {v0, p1, p2, p3}, Lo/bfc;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 178
    return-object v3
.end method

.method public b(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 230
    iget-object v0, p0, Lo/bdl;->e:Lo/beg;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 232
    new-instance v0, Lo/beg;

    iget-object v1, p0, Lo/bdl;->b:Lo/bfa;

    invoke-interface {v1}, Lo/bfa;->i()Lcom/huawei/health/sns/ui/chat/ChatActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bdl;->b:Lo/bfa;

    invoke-direct {v0, v1, v2}, Lo/beg;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    iput-object v0, p0, Lo/bdl;->e:Lo/beg;

    .line 234
    :cond_0
    iget-object v0, p0, Lo/bdl;->e:Lo/beg;

    invoke-virtual {v0, p1, p2, p3}, Lo/beg;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 235
    return-object v3
.end method

.method public c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 211
    iget-object v0, p0, Lo/bdl;->g:Lo/bee;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 213
    new-instance v0, Lo/bee;

    iget-object v1, p0, Lo/bdl;->b:Lo/bfa;

    invoke-interface {v1}, Lo/bfa;->i()Lcom/huawei/health/sns/ui/chat/ChatActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bdl;->b:Lo/bfa;

    invoke-direct {v0, v1, v2}, Lo/bee;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    iput-object v0, p0, Lo/bdl;->g:Lo/bee;

    .line 215
    :cond_0
    iget-object v0, p0, Lo/bdl;->g:Lo/bee;

    invoke-virtual {v0, p1, p2, p3}, Lo/bee;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 216
    return-object v3
.end method

.method public d(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 241
    iget-object v0, p0, Lo/bdl;->c:Lo/bev;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 243
    new-instance v0, Lo/bev;

    iget-object v1, p0, Lo/bdl;->b:Lo/bfa;

    invoke-interface {v1}, Lo/bfa;->i()Lcom/huawei/health/sns/ui/chat/ChatActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bdl;->b:Lo/bfa;

    invoke-direct {v0, v1, v2}, Lo/bev;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    iput-object v0, p0, Lo/bdl;->c:Lo/bev;

    .line 245
    :cond_0
    iget-object v0, p0, Lo/bdl;->c:Lo/bev;

    invoke-virtual {v0, p1, p2, p3}, Lo/bev;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 246
    return-object v3
.end method

.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 192
    iget-object v0, p0, Lo/bdl;->f:Lo/bef;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 194
    new-instance v0, Lo/bef;

    iget-object v1, p0, Lo/bdl;->b:Lo/bfa;

    invoke-interface {v1}, Lo/bfa;->i()Lcom/huawei/health/sns/ui/chat/ChatActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bdl;->b:Lo/bfa;

    invoke-direct {v0, v1, v2}, Lo/bef;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    iput-object v0, p0, Lo/bdl;->f:Lo/bef;

    .line 196
    :cond_0
    iget-object v0, p0, Lo/bdl;->f:Lo/bef;

    invoke-virtual {v0, p1, p2, p3}, Lo/bef;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 197
    return-object v3
.end method

.method public f(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 260
    iget-object v0, p0, Lo/bdl;->a:Lo/bel;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 262
    new-instance v0, Lo/bel;

    iget-object v1, p0, Lo/bdl;->b:Lo/bfa;

    invoke-interface {v1}, Lo/bfa;->i()Lcom/huawei/health/sns/ui/chat/ChatActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bdl;->b:Lo/bfa;

    invoke-direct {v0, v1, v2}, Lo/bel;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    iput-object v0, p0, Lo/bdl;->a:Lo/bel;

    .line 264
    :cond_0
    iget-object v0, p0, Lo/bdl;->a:Lo/bel;

    invoke-virtual {v0, p1, p2, p3}, Lo/bel;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 265
    return-object v3
.end method

.method public g(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 279
    iget-object v0, p0, Lo/bdl;->d:Lo/beq;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 281
    new-instance v0, Lo/beq;

    iget-object v1, p0, Lo/bdl;->b:Lo/bfa;

    invoke-interface {v1}, Lo/bfa;->i()Lcom/huawei/health/sns/ui/chat/ChatActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bdl;->b:Lo/bfa;

    invoke-direct {v0, v1, v2}, Lo/beq;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    iput-object v0, p0, Lo/bdl;->d:Lo/beq;

    .line 283
    :cond_0
    iget-object v0, p0, Lo/bdl;->d:Lo/beq;

    invoke-virtual {v0, p1, p2, p3}, Lo/beq;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 284
    return-object v3
.end method

.method public h(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 298
    iget-object v0, p0, Lo/bdl;->k:Lo/beh;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 300
    new-instance v0, Lo/beh;

    iget-object v1, p0, Lo/bdl;->b:Lo/bfa;

    invoke-interface {v1}, Lo/bfa;->i()Lcom/huawei/health/sns/ui/chat/ChatActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bdl;->b:Lo/bfa;

    invoke-direct {v0, v1, v2}, Lo/beh;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    iput-object v0, p0, Lo/bdl;->k:Lo/beh;

    .line 302
    :cond_0
    iget-object v0, p0, Lo/bdl;->k:Lo/beh;

    invoke-virtual {v0, p1, p2, p3}, Lo/beh;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 303
    return-object v3
.end method

.method public i(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 336
    iget-object v0, p0, Lo/bdl;->p:Lo/bem;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 338
    new-instance v0, Lo/bem;

    iget-object v1, p0, Lo/bdl;->b:Lo/bfa;

    invoke-interface {v1}, Lo/bfa;->i()Lcom/huawei/health/sns/ui/chat/ChatActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bdl;->b:Lo/bfa;

    invoke-direct {v0, v1, v2}, Lo/bem;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    iput-object v0, p0, Lo/bdl;->p:Lo/bem;

    .line 340
    :cond_0
    iget-object v0, p0, Lo/bdl;->p:Lo/bem;

    invoke-virtual {v0, p1, p2, p3}, Lo/bem;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 341
    return-object v3
.end method

.method public k(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 317
    iget-object v0, p0, Lo/bdl;->i:Lo/ben;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 319
    new-instance v0, Lo/ben;

    iget-object v1, p0, Lo/bdl;->b:Lo/bfa;

    invoke-interface {v1}, Lo/bfa;->i()Lcom/huawei/health/sns/ui/chat/ChatActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bdl;->b:Lo/bfa;

    invoke-direct {v0, v1, v2}, Lo/ben;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    iput-object v0, p0, Lo/bdl;->i:Lo/ben;

    .line 321
    :cond_0
    iget-object v0, p0, Lo/bdl;->i:Lo/ben;

    invoke-virtual {v0, p1, p2, p3}, Lo/ben;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 322
    return-object v3
.end method

.method public o(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 356
    iget-object v0, p0, Lo/bdl;->n:Lo/bet;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 358
    new-instance v0, Lo/bet;

    iget-object v1, p0, Lo/bdl;->b:Lo/bfa;

    invoke-interface {v1}, Lo/bfa;->i()Lcom/huawei/health/sns/ui/chat/ChatActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bdl;->b:Lo/bfa;

    invoke-direct {v0, v1, v2}, Lo/bet;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    iput-object v0, p0, Lo/bdl;->n:Lo/bet;

    .line 360
    :cond_0
    iget-object v0, p0, Lo/bdl;->n:Lo/bet;

    invoke-virtual {v0, p1, p2, p3}, Lo/bet;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 361
    return-object v3
.end method
