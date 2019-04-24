.class public Lo/bjm;
.super Landroid/widget/CursorAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bjm$a;
    }
.end annotation


# instance fields
.field private final b:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/database/Cursor;ZLandroid/widget/ListView;)V
    .locals 1

    .line 42
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;Z)V

    .line 43
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bjm;->b:Landroid/view/LayoutInflater;

    .line 44
    return-void
.end method

.method private final b(Lo/bjm$a;Lo/axv;)V
    .locals 6

    .line 93
    invoke-virtual {p2}, Lo/axv;->f()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 95
    iget-object v0, p1, Lo/bjm$a;->e:Landroid/widget/ImageView;

    invoke-virtual {p2}, Lo/axv;->b()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p2}, Lo/axv;->b()J

    move-result-wide v0

    iget-object v2, p1, Lo/bjm$a;->e:Landroid/widget/ImageView;

    .line 100
    invoke-virtual {p2}, Lo/axv;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lo/axv;->e()Ljava/lang/String;

    move-result-object v4

    .line 101
    invoke-virtual {p2}, Lo/axv;->g()Ljava/lang/String;

    move-result-object v5

    .line 99
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    :goto_0
    return-void
.end method

.method private c(Lo/bjm$a;Lo/axv;)V
    .locals 2

    .line 79
    iget-object v0, p1, Lo/bjm$a;->a:Landroid/widget/TextView;

    invoke-virtual {p2}, Lo/axv;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    return-void
.end method

.method private final e(Landroid/view/View;Lo/bjm$a;)Lo/bjm$a;
    .locals 1

    .line 120
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_friend_images:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lo/bjm$a;->e:Landroid/widget/ImageView;

    .line 121
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_friend_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lo/bjm$a;->a:Landroid/widget/TextView;

    .line 122
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_friend_name:I

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 123
    return-object p2
.end method


# virtual methods
.method public bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 4

    .line 49
    const/4 v1, 0x0

    .line 50
    sget v0, Lcom/huawei/android/sns/R$id;->chatlogs_friend_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    .line 51
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 53
    new-instance v1, Lo/bjm$a;

    invoke-direct {v1}, Lo/bjm$a;-><init>()V

    .line 54
    invoke-direct {p0, p1, v1}, Lo/bjm;->e(Landroid/view/View;Lo/bjm$a;)Lo/bjm$a;

    goto :goto_0

    .line 58
    :cond_0
    move-object v1, v2

    check-cast v1, Lo/bjm$a;

    .line 61
    :goto_0
    invoke-static {p3}, Lo/axv;->b(Landroid/database/Cursor;)Lo/axv;

    move-result-object v3

    .line 62
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 65
    invoke-direct {p0, v1, v3}, Lo/bjm;->c(Lo/bjm$a;Lo/axv;)V

    .line 67
    invoke-direct {p0, v1, v3}, Lo/bjm;->b(Lo/bjm$a;Lo/axv;)V

    .line 69
    return-void
.end method

.method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 108
    iget-object v0, p0, Lo/bjm;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_transmit_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
