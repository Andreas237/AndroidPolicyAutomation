.class public abstract Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;
.super Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$b;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$c;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private c:I

.field public d:Landroid/support/v4/app/FragmentManager;

.field private e:Landroid/support/v4/view/ViewPager;

.field private k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;-><init>()V

    .line 21
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->d:Landroid/support/v4/app/FragmentManager;

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->b:Ljava/util/List;

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->a:Ljava/util/List;

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->c:I

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;

    return-void
.end method

.method private b(Landroid/support/v4/app/Fragment;I)V
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->d:Landroid/support/v4/app/FragmentManager;

    if-nez v0, :cond_0

    .line 118
    return-void

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->d:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 120
    invoke-virtual {v1, p2, p1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 121
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 122
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;>;)V"
        }
    .end annotation

    .line 206
    const/4 v1, 0x0

    .line 207
    const/4 v2, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->c:I

    if-ge v2, v0, :cond_2

    .line 208
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;

    invoke-interface {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 209
    instance-of v0, v3, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 210
    move-object v1, v3

    check-cast v1, Landroid/widget/TextView;

    .line 212
    :cond_0
    if-eqz v1, :cond_1

    .line 213
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;

    invoke-interface {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;->c()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 207
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 216
    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;

    return-object v0
.end method

.method private d(ILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;>;)V"
        }
    .end annotation

    .line 129
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTabFragment modelList : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    if-eqz p2, :cond_0

    .line 131
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->c:I

    goto :goto_0

    .line 133
    :cond_0
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTabFragment modelList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-void

    .line 137
    :goto_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->c:I

    if-lez v0, :cond_1

    .line 138
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->b:Ljava/util/List;

    goto :goto_1

    .line 140
    :cond_1
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTabFragment modelList.size() is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    return-void

    .line 144
    :goto_1
    invoke-direct {p0, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->d(Ljava/util/List;)V

    .line 145
    invoke-direct {p0, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->b(Ljava/util/List;)V

    .line 146
    invoke-direct {p0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->e(ILjava/util/List;)V

    .line 147
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTabFragment end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;>;)V"
        }
    .end annotation

    .line 220
    const/4 v2, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->c:I

    if-ge v2, v0, :cond_1

    .line 221
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;

    invoke-interface {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;->d()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 222
    if-eqz v1, :cond_0

    .line 223
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 224
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 225
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$3;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 233
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 236
    :cond_1
    return-void
.end method

.method private e()V
    .locals 5

    .line 82
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeActivity() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->a()Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$b;

    move-result-object v4

    .line 84
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 85
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeActivity model is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->finish()V

    goto/16 :goto_1

    .line 88
    :cond_0
    invoke-interface {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$b;->e()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 90
    :sswitch_0
    invoke-interface {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$b;->c()Landroid/support/v4/app/Fragment;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 91
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeActivity model.getmFragment() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->finish()V

    goto :goto_1

    .line 94
    :cond_1
    invoke-interface {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$b;->c()Landroid/support/v4/app/Fragment;

    move-result-object v0

    invoke-interface {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$b;->a()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->b(Landroid/support/v4/app/Fragment;I)V

    .line 96
    goto :goto_1

    .line 99
    :sswitch_1
    invoke-interface {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$b;->d()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 100
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeActivity model.getmTabList() is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->finish()V

    goto :goto_1

    .line 103
    :cond_2
    invoke-interface {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$b;->a()I

    move-result v0

    invoke-interface {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$b;->d()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->d(ILjava/util/List;)V

    .line 105
    goto :goto_1

    .line 108
    :goto_0
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeActivity invalid type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->finish()V

    .line 113
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method private e(ILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;>;)V"
        }
    .end annotation

    .line 151
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 152
    instance-of v0, v4, Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    .line 153
    move-object v0, v4

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->e:Landroid/support/v4/view/ViewPager;

    .line 155
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->e:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_2

    .line 156
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->e:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$4;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 187
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->a:Ljava/util/List;

    .line 188
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 190
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->a:Ljava/util/List;

    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;

    invoke-interface {v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;->b()Landroid/support/v4/app/Fragment;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 193
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->e:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$c;

    .line 194
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->a:Ljava/util/List;

    invoke-direct {v1, v2, v3}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$c;-><init>(Landroid/support/v4/app/FragmentManager;Ljava/util/List;)V

    .line 193
    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->e:Landroid/support/v4/view/ViewPager;

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->c:I

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 197
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->a_(I)V

    goto :goto_1

    .line 199
    :cond_2
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initTabFragment mListViewPager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mListViewPager is null!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 203
    :goto_1
    return-void
.end method


# virtual methods
.method public abstract a()Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$b;
.end method

.method public a_(I)V
    .locals 5

    .line 53
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTab() enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->b:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 55
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTab() mTab != null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 57
    if-ne v4, p1, :cond_0

    .line 59
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->b:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->b:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 56
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 68
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->e:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_2

    .line 69
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTab() seleted : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_2

    .line 72
    :cond_2
    const-string v0, "common.ui.BaseFragmentActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setTab() mListViewPager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    :goto_2
    return-void
.end method

.method public b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->k:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$d;

    .line 79
    return-void
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->a:Ljava/util/List;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 30
    invoke-super {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;->onCreate(Landroid/os/Bundle;)V

    .line 31
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->e()V

    .line 32
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 36
    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;->onDestroy()V

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->e:Landroid/support/v4/view/ViewPager;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity;->a:Ljava/util/List;

    .line 39
    return-void
.end method
