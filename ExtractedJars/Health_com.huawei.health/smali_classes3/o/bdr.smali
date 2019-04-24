.class public Lo/bdr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bdr$d;
    }
.end annotation


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private a:Lo/bdo;

.field private b:Ljava/lang/String;

.field private c:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

.field private d:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const-class v0, Lo/bdr;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bdr;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdr;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdr;->b:Ljava/lang/String;

    .line 77
    iput-object p2, p0, Lo/bdr;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 78
    iput-object p1, p0, Lo/bdr;->c:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    .line 79
    return-void
.end method

.method static synthetic a(Lo/bdr;)Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/bdr;->c:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    return-object v0
.end method

.method private a()Z
    .locals 2

    .line 88
    iget-object v0, p0, Lo/bdr;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    if-nez v0, :cond_0

    .line 90
    const/4 v0, 0x0

    return v0

    .line 93
    :cond_0
    iget-object v0, p0, Lo/bdr;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 95
    iget-object v0, p0, Lo/bdr;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getDownloadStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lo/bdr;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 96
    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getOriginalDownStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 98
    const/4 v0, 0x0

    return v0

    .line 101
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private b()V
    .locals 4

    .line 207
    new-instance v3, Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lo/bdr;->c:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 208
    new-instance v0, Lo/bdo;

    iget-object v1, p0, Lo/bdr;->c:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    invoke-direct {v0, v1}, Lo/bdo;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bdr;->a:Lo/bdo;

    .line 209
    iget-object v0, p0, Lo/bdr;->a:Lo/bdo;

    new-instance v1, Lo/bdr$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/bdr$d;-><init>(Lo/bdr;Lo/bdr$5;)V

    invoke-virtual {v3, v0, v1}, Landroid/app/AlertDialog$Builder;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 210
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 211
    return-void
.end method

.method static synthetic b(Lo/bdr;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/bdr;->e()V

    return-void
.end method

.method private c()V
    .locals 0

    .line 282
    return-void
.end method

.method static synthetic c(Lo/bdr;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/bdr;->c()V

    return-void
.end method

.method static synthetic d(Lo/bdr;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/bdr;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 290
    new-instance v0, Lo/bdr$5;

    invoke-direct {v0, p0}, Lo/bdr$5;-><init>(Lo/bdr;)V

    sget-object v1, Lo/bbp;->c:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    .line 305
    invoke-virtual {v0, v1, v2}, Lo/bdr$5;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 306
    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 107
    invoke-direct {p0}, Lo/bdr;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    const/4 v0, 0x0

    return v0

    .line 112
    :cond_0
    invoke-direct {p0}, Lo/bdr;->b()V

    .line 116
    const/4 v0, 0x0

    return v0
.end method
