.class public Lo/dyl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dyl$e;
    }
.end annotation


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/widget/ListView;

.field private c:Lo/elp;

.field private d:Landroid/content/Context;

.field private e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Landroid/os/Bundle;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/HashMap;Landroid/view/View;Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Landroid/view/View;Ljava/util/HashMap<Ljava/lang/String;Landroid/os/Bundle;>;)V"
        }
    .end annotation

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dyl;->e:Ljava/util/HashMap;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dyl;->k:Ljava/util/HashMap;

    .line 42
    iput-object p1, p0, Lo/dyl;->d:Landroid/content/Context;

    .line 43
    iput-object p2, p0, Lo/dyl;->e:Ljava/util/HashMap;

    .line 44
    iput-object p3, p0, Lo/dyl;->a:Landroid/view/View;

    .line 45
    iput-object p4, p0, Lo/dyl;->k:Ljava/util/HashMap;

    .line 47
    invoke-direct {p0}, Lo/dyl;->c()V

    .line 48
    invoke-direct {p0}, Lo/dyl;->d()V

    .line 49
    iget-object v0, p0, Lo/dyl;->c:Lo/elp;

    iget-object v1, p0, Lo/dyl;->a:Landroid/view/View;

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 50
    return-void
.end method

.method static synthetic b(Lo/dyl;)Landroid/content/Context;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dyl;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lo/dyl;)Ljava/util/HashMap;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dyl;->e:Ljava/util/HashMap;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 53
    iget-object v0, p0, Lo/dyl;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->achieve_popup_window:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 54
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_popup_window_tab:I

    invoke-static {v4, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lo/dyl;->b:Landroid/widget/ListView;

    .line 55
    iget-object v0, p0, Lo/dyl;->b:Landroid/widget/ListView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOverScrollMode(I)V

    .line 56
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lo/dyl;->d:Landroid/content/Context;

    invoke-direct {v0, v1, v4}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lo/dyl;->c:Lo/elp;

    .line 58
    const-string v0, "achievePopWnd"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    return-void
.end method

.method static synthetic d(Lo/dyl;)Ljava/util/HashMap;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dyl;->k:Ljava/util/HashMap;

    return-object v0
.end method

.method private d()V
    .locals 8

    .line 72
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 73
    iget-object v0, p0, Lo/dyl;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 74
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 76
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 77
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    const-string v0, "achievePopWnd"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "init add key:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    new-instance v6, Lo/dyl$e;

    iget-object v0, p0, Lo/dyl;->d:Landroid/content/Context;

    invoke-direct {v6, v0, v4}, Lo/dyl$e;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 81
    iget-object v0, p0, Lo/dyl;->b:Landroid/widget/ListView;

    invoke-virtual {v0, v6}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 82
    iget-object v0, p0, Lo/dyl;->b:Landroid/widget/ListView;

    new-instance v1, Lo/dyl$2;

    invoke-direct {v1, p0, v4}, Lo/dyl$2;-><init>(Lo/dyl;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 97
    return-void
.end method

.method static synthetic e(Lo/dyl;)Lo/elp;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dyl;->c:Lo/elp;

    return-object v0
.end method
