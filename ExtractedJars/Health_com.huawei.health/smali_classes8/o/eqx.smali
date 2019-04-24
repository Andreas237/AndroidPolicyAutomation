.class public Lo/eqx;
.super Lo/eqv;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/era;

.field private d:Lo/eaa;

.field private e:I

.field private f:Landroid/os/Handler;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field

.field private h:Landroid/os/HandlerThread;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field

.field private m:Z

.field private n:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

.field private o:Ljava/lang/String;

.field private p:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 63
    invoke-direct {p0}, Lo/eqv;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/eqx;->e:I

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqx;->d:Lo/eaa;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqx;->h:Landroid/os/HandlerThread;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqx;->f:Landroid/os/Handler;

    .line 59
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eqx;->m:Z

    .line 61
    const-string v0, "https://club.huawei.com/"

    iput-object v0, p0, Lo/eqx;->o:Ljava/lang/String;

    .line 128
    new-instance v0, Lo/eqx$3;

    invoke-direct {v0, p0}, Lo/eqx$3;-><init>(Lo/eqx;)V

    iput-object v0, p0, Lo/eqx;->n:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    .line 172
    new-instance v0, Lo/eqx$4;

    invoke-direct {v0, p0}, Lo/eqx$4;-><init>(Lo/eqx;)V

    iput-object v0, p0, Lo/eqx;->p:Landroid/os/Handler;

    .line 64
    const-string v0, "OperationCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OperationCardData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    iput-object p1, p0, Lo/eqx;->a:Landroid/content/Context;

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eqx;->g:Ljava/util/List;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eqx;->k:Ljava/util/List;

    .line 68
    invoke-direct {p0}, Lo/eqx;->e()V

    .line 69
    return-void
.end method

.method static synthetic a(Lo/eqx;)Landroid/os/Handler;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/eqx;->f:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lo/eqx;)Lo/era;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/eqx;->b:Lo/era;

    return-object v0
.end method

.method private b()V
    .locals 4

    .line 149
    const-string v0, "OperationCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Start register"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    iget-object v0, p0, Lo/eqx;->d:Lo/eaa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/eqx;->n:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 151
    const-string v0, "OperationCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerObserver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    iget-object v0, p0, Lo/eqx;->d:Lo/eaa;

    iget-object v1, p0, Lo/eqx;->n:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    invoke-virtual {v0, v1}, Lo/eaa;->e(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 154
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/eqx;I)I
    .locals 0

    .line 28
    iput p1, p0, Lo/eqx;->e:I

    return p1
.end method

.method static synthetic c(Lo/eqx;)Ljava/util/List;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/eqx;->k:Ljava/util/List;

    return-object v0
.end method

.method private c()V
    .locals 2

    .line 97
    iget-object v0, p0, Lo/eqx;->b:Lo/era;

    iget-object v1, p0, Lo/eqx;->g:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/era;->e(Ljava/util/List;)V

    .line 98
    iget-object v0, p0, Lo/eqx;->b:Lo/era;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/era;->d(I)V

    .line 99
    invoke-direct {p0}, Lo/eqx;->g()V

    .line 100
    iget-object v0, p0, Lo/eqx;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 101
    return-void
.end method

.method static synthetic c(Lo/eqx;Z)Z
    .locals 0

    .line 28
    iput-boolean p1, p0, Lo/eqx;->m:Z

    return p1
.end method

.method static synthetic d(Lo/eqx;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lo/eqx;->f()V

    return-void
.end method

.method static synthetic e(Lo/eqx;)Ljava/util/List;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/eqx;->g:Ljava/util/List;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 72
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "OperationCardData"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/eqx;->h:Landroid/os/HandlerThread;

    .line 73
    iget-object v0, p0, Lo/eqx;->h:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 74
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lo/eqx;->h:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/eqx;->f:Landroid/os/Handler;

    .line 75
    iget-object v0, p0, Lo/eqx;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    iput-object v0, p0, Lo/eqx;->d:Lo/eaa;

    .line 76
    invoke-direct {p0}, Lo/eqx;->b()V

    .line 77
    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;)V"
        }
    .end annotation

    .line 249
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 250
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 252
    invoke-virtual {v2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v3

    .line 253
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 254
    iget-object v0, p0, Lo/eqx;->o:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 258
    :cond_0
    goto :goto_0

    .line 259
    :cond_1
    return-void
.end method

.method static synthetic f(Lo/eqx;)Landroid/os/Handler;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/eqx;->p:Landroid/os/Handler;

    return-object v0
.end method

.method private f()V
    .locals 6

    .line 229
    iget-object v0, p0, Lo/eqx;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 230
    iget-object v0, p0, Lo/eqx;->d:Lo/eaa;

    invoke-virtual {v0}, Lo/eaa;->h()Ljava/util/List;

    move-result-object v4

    .line 231
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 232
    invoke-direct {p0, v4}, Lo/eqx;->e(Ljava/util/List;)V

    .line 233
    new-instance v0, Lo/eqs;

    invoke-direct {v0}, Lo/eqs;-><init>()V

    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 234
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    const/4 v0, 0x3

    if-ge v5, v0, :cond_0

    .line 235
    iget-object v0, p0, Lo/eqx;->k:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 234
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 238
    :cond_0
    const-string v0, "OperationCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8fd0\u8425\u63a8\u5e7f\u4f4d\u7684\u6d88\u606f\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eqx;->k:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    iget-object v0, p0, Lo/eqx;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 242
    return-void
.end method

.method static synthetic g(Lo/eqx;)I
    .locals 1

    .line 28
    iget v0, p0, Lo/eqx;->e:I

    return v0
.end method

.method private g()V
    .locals 2

    .line 217
    iget-object v0, p0, Lo/eqx;->f:Landroid/os/Handler;

    new-instance v1, Lo/eqx$1;

    invoke-direct {v1, p0}, Lo/eqx$1;-><init>(Lo/eqx;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 225
    return-void
.end method

.method static synthetic h(Lo/eqx;)I
    .locals 2

    .line 28
    iget v0, p0, Lo/eqx;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/eqx;->e:I

    return v0
.end method

.method private h()V
    .locals 1

    .line 165
    invoke-direct {p0}, Lo/eqx;->i()V

    .line 166
    iget-object v0, p0, Lo/eqx;->h:Landroid/os/HandlerThread;

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lo/eqx;->h:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 168
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqx;->h:Landroid/os/HandlerThread;

    .line 170
    :cond_0
    return-void
.end method

.method private i()V
    .locals 4

    .line 158
    iget-object v0, p0, Lo/eqx;->d:Lo/eaa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/eqx;->n:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 159
    const-string v0, "OperationCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterObserver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    iget-object v0, p0, Lo/eqx;->d:Lo/eaa;

    iget-object v1, p0, Lo/eqx;->n:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    invoke-virtual {v0, v1}, Lo/eaa;->d(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 162
    :cond_0
    return-void
.end method

.method static synthetic i(Lo/eqx;)Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lo/eqx;->m:Z

    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 110
    invoke-super {p0}, Lo/eqv;->a()V

    .line 111
    invoke-direct {p0}, Lo/eqx;->h()V

    .line 113
    iget-object v0, p0, Lo/eqx;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 114
    iget-object v0, p0, Lo/eqx;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 115
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqx;->f:Landroid/os/Handler;

    .line 118
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqx;->d:Lo/eaa;

    .line 119
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqx;->b:Lo/era;

    .line 121
    iget-object v0, p0, Lo/eqx;->p:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 122
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqx;->n:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    .line 123
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqx;->c:Lo/eqw;

    .line 124
    iget-object v0, p0, Lo/eqx;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 125
    iget-object v0, p0, Lo/eqx;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 126
    return-void
.end method

.method public b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 86
    const-string v0, "OperationCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCardViewHolder"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    const-string v0, "OperationCardData-getCardViewHolder enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 89
    new-instance v0, Lo/era;

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->home_item_layout_operation:I

    const/4 v2, 0x0

    invoke-virtual {p2, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lo/eqx;->a:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/era;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    iput-object v0, p0, Lo/eqx;->b:Lo/era;

    .line 91
    invoke-direct {p0}, Lo/eqx;->c()V

    .line 92
    const-string v0, "OperationCardData-getCardViewHolder end"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lo/eqx;->b:Lo/era;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 82
    return-void
.end method
