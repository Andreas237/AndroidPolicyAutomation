.class public Lo/bcs;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:[B


# instance fields
.field private a:Landroid/support/v4/util/SparseArrayCompat;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/SparseArrayCompat<Lo/bcy;>;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/bct;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private h:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lo/bcs;->b:[B

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/bct;)V
    .locals 2

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bcs;->e:Ljava/util/ArrayList;

    .line 55
    iput-object p1, p0, Lo/bcs;->h:Landroid/content/Context;

    .line 56
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/bcs;->d:Ljava/lang/ref/WeakReference;

    .line 57
    new-instance v0, Landroid/support/v4/util/SparseArrayCompat;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Landroid/support/v4/util/SparseArrayCompat;-><init>(I)V

    iput-object v0, p0, Lo/bcs;->a:Landroid/support/v4/util/SparseArrayCompat;

    .line 58
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .line 79
    iget-object v0, p0, Lo/bcs;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bct;

    .line 80
    if-eqz v2, :cond_0

    .line 82
    invoke-interface {v2, p1}, Lo/bct;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 86
    :cond_0
    const-string v0, "webview"

    const-string v1, "host bridgeAdapter not exist."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    :goto_0
    return-void
.end method

.method private b(ILjava/lang/String;)V
    .locals 4

    .line 93
    sget-object v2, Lo/bcs;->b:[B

    monitor-enter v2

    .line 95
    :try_start_0
    iget-object v0, p0, Lo/bcs;->a:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/SparseArrayCompat;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bcy;

    .line 96
    if-eqz v1, :cond_0

    .line 99
    iget-object v0, p0, Lo/bcs;->a:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/SparseArrayCompat;->remove(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 103
    :goto_0
    if-eqz v1, :cond_1

    .line 106
    invoke-interface {v1, p1, p2}, Lo/bcy;->b(ILjava/lang/String;)V

    .line 108
    :cond_1
    return-void
.end method

.method private c(I)V
    .locals 3

    .line 189
    iget-object v0, p0, Lo/bcs;->h:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 191
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 192
    iget-object v0, p0, Lo/bcs;->h:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 193
    const-string v0, "totalList"

    iget-object v1, p0, Lo/bcs;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 194
    const-string v0, "position"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 195
    const-string v0, "origin_url"

    iget-object v1, p0, Lo/bcs;->c:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 196
    iget-object v0, p0, Lo/bcs;->h:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 198
    :cond_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .line 62
    iget-object v0, p0, Lo/bcs;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bct;

    .line 63
    if-eqz v2, :cond_0

    .line 65
    invoke-interface {v2, p1}, Lo/bct;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 69
    :cond_0
    const-string v0, "webview"

    const-string v1, "host bridgeAdapter not exist."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    :goto_0
    return-void
.end method


# virtual methods
.method public a(ILo/bcy;)V
    .locals 3

    .line 117
    sget-object v1, Lo/bcs;->b:[B

    monitor-enter v1

    .line 119
    :try_start_0
    iget-object v0, p0, Lo/bcs;->a:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 121
    :goto_0
    return-void
.end method

.method public addImageList(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 162
    iget-object v0, p0, Lo/bcs;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    return-void
.end method

.method public callback(ILjava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 209
    invoke-direct {p0, p1, p2}, Lo/bcs;->b(ILjava/lang/String;)V

    .line 210
    return-void
.end method

.method public clearImageList()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 168
    iget-object v0, p0, Lo/bcs;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 169
    return-void
.end method

.method public openImage(I)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 173
    invoke-direct {p0, p1}, Lo/bcs;->c(I)V

    .line 174
    return-void
.end method

.method public setOriginUrl(Ljava/lang/String;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lo/bcs;->c:Ljava/lang/String;

    .line 182
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 130
    const-string v0, "webview"

    const-string v1, "set title from js."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 133
    invoke-direct {p0, p1}, Lo/bcs;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 137
    :cond_0
    const-string v0, "webview"

    const-string v1, "title is empty."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    :goto_0
    return-void
.end method

.method public showAccountInfo(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 148
    const-string v0, "webview"

    const-string v1, "showAccountInfoImpl account info from js."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 151
    invoke-direct {p0, p1}, Lo/bcs;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 155
    :cond_0
    const-string v0, "webview"

    const-string v1, "account uid is empty."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    :goto_0
    return-void
.end method
