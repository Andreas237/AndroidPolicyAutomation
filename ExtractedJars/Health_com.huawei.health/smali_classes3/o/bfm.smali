.class public Lo/bfm;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"

# interfaces
.implements Lo/bfq$c;


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private a:Landroid/view/LayoutInflater;

.field private c:Landroid/content/Context;

.field private final d:I

.field private e:Lo/bfq;

.field private f:Lo/bfn;

.field private g:Lo/bfp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const-class v0, Lo/bfm;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bfm;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/bfq;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 26
    const/16 v0, 0x35

    iput v0, p0, Lo/bfm;->d:I

    .line 40
    iput-object p1, p0, Lo/bfm;->c:Landroid/content/Context;

    .line 41
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bfm;->a:Landroid/view/LayoutInflater;

    .line 43
    iput-object p2, p0, Lo/bfm;->e:Lo/bfq;

    .line 44
    iget-object v0, p0, Lo/bfm;->e:Lo/bfq;

    invoke-virtual {v0, p0}, Lo/bfq;->c(Lo/bfq$c;)V

    .line 45
    return-void
.end method

.method private e(Lo/bfk;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lo/bfm;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_list_container:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 146
    sget v0, Lcom/huawei/android/sns/R$id;->list_container:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 148
    invoke-virtual {p1, v4, p2}, Lo/bfk;->e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    invoke-virtual {v3, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 153
    :cond_0
    return-object v3
.end method


# virtual methods
.method public a(Lo/bfn;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lo/bfm;->f:Lo/bfn;

    .line 165
    return-void
.end method

.method public b()V
    .locals 0

    .line 159
    invoke-virtual {p0}, Lo/bfm;->notifyDataSetChanged()V

    .line 160
    return-void
.end method

.method public b(Lo/bfp;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/bfm;->g:Lo/bfp;

    .line 61
    return-void
.end method

.method public getCount()I
    .locals 2

    .line 66
    iget-object v0, p0, Lo/bfm;->e:Lo/bfq;

    invoke-virtual {v0}, Lo/bfq;->e()I

    move-result v1

    .line 67
    return v1
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 73
    iget-object v0, p0, Lo/bfm;->e:Lo/bfq;

    invoke-virtual {v0, p1}, Lo/bfq;->e(I)Lo/bfq$e;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 79
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 85
    iget-object v0, p0, Lo/bfm;->e:Lo/bfq;

    invoke-virtual {v0, p1}, Lo/bfq;->c(I)I

    move-result v0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 97
    const/4 v3, 0x0

    .line 98
    iget-object v0, p0, Lo/bfm;->e:Lo/bfq;

    invoke-virtual {v0, p1}, Lo/bfq;->e(I)Lo/bfq$e;

    move-result-object v4

    .line 99
    if-nez p2, :cond_4

    .line 102
    iget-object v0, p0, Lo/bfm;->f:Lo/bfn;

    if-nez v0, :cond_0

    .line 104
    const/4 v0, 0x0

    return-object v0

    .line 106
    :cond_0
    iget-object v0, p0, Lo/bfm;->f:Lo/bfn;

    iget-object v1, p0, Lo/bfm;->c:Landroid/content/Context;

    iget-object v2, p0, Lo/bfm;->e:Lo/bfq;

    invoke-virtual {v2, p1}, Lo/bfq;->c(I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/bfn;->b(Landroid/content/Context;I)Lo/bfk;

    move-result-object v3

    .line 108
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 110
    const/4 v0, 0x0

    return-object v0

    .line 113
    :cond_1
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lo/bfq$e;->b()I

    move-result v0

    if-lez v0, :cond_3

    .line 115
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/bfq$e;->b(I)Lo/bfh;

    move-result-object v5

    .line 116
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 118
    const/4 v0, 0x0

    return-object v0

    .line 120
    :cond_2
    invoke-virtual {v5}, Lo/bfh;->getSubCardNum()I

    move-result v0

    invoke-virtual {v3, v0}, Lo/bfk;->a(I)V

    .line 122
    :cond_3
    invoke-direct {p0, v3, p3}, Lo/bfm;->e(Lo/bfk;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 126
    :cond_4
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bfk;

    .line 129
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    invoke-virtual {v3}, Lo/bfk;->a()I

    move-result v0

    iget-object v1, v4, Lo/bfq$e;->c:Lo/bfk;

    invoke-virtual {v1}, Lo/bfk;->a()I

    move-result v1

    if-eq v0, v1, :cond_5

    .line 131
    sget-object v0, Lo/bfm;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Card Type DONOT match,ViewType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0, p1}, Lo/bfm;->getItemViewType(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    :cond_5
    const/4 v0, 0x0

    if-eq v0, v4, :cond_6

    .line 136
    invoke-virtual {v3, v4}, Lo/bfk;->e(Lo/bfq$e;)Z

    .line 138
    :cond_6
    iget-object v0, p0, Lo/bfm;->g:Lo/bfp;

    invoke-virtual {v3, v0}, Lo/bfk;->d(Lo/bfp;)V

    .line 139
    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x35

    return v0
.end method
