.class public Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/content/Context;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/RelativeLayout;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Lo/egy;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private u:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->l:Ljava/lang/String;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->p:Ljava/lang/String;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->o:Ljava/lang/String;

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->m:Ljava/lang/String;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->r:Ljava/lang/String;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->u:Ljava/lang/String;

    return-void
.end method

.method private a(Ljava/io/File;)J
    .locals 10

    .line 225
    const-wide/16 v4, 0x0

    .line 226
    const/4 v6, 0x0

    .line 227
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 229
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 230
    invoke-virtual {v6}, Ljava/io/FileInputStream;->available()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    int-to-long v0, v0

    move-wide v4, v0

    .line 235
    if-eqz v6, :cond_0

    .line 236
    :try_start_1
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 240
    :cond_0
    goto :goto_1

    .line 238
    :catch_0
    move-exception v7

    .line 239
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close fis exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    goto :goto_1

    .line 231
    :catch_1
    move-exception v7

    .line 232
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "read log file IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 235
    if-eqz v6, :cond_1

    .line 236
    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 240
    :cond_1
    goto :goto_1

    .line 238
    :catch_2
    move-exception v7

    .line 239
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close fis exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    goto :goto_1

    .line 234
    :catchall_0
    move-exception v8

    .line 235
    if-eqz v6, :cond_2

    .line 236
    :try_start_4
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 240
    :cond_2
    goto :goto_0

    .line 238
    :catch_3
    move-exception v9

    .line 239
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close fis exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    :goto_0
    throw v8

    .line 243
    :cond_3
    :goto_1
    return-wide v4
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)Landroid/widget/TextView;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->i:Landroid/widget/TextView;

    return-object v0
.end method

.method private a()V
    .locals 8

    .line 207
    invoke-static {}, Lo/dhu;->a()Ljava/lang/String;

    move-result-object v4

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "com.huawei.health"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->m:Ljava/lang/String;

    .line 209
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "logPath is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->m:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    new-instance v5, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->m:Ljava/lang/String;

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 211
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b(Ljava/io/File;)J

    move-result-wide v6

    .line 212
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->o:Ljava/lang/String;

    invoke-direct {p0, v0, v6, v7}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->o:Ljava/lang/String;

    .line 215
    :cond_0
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "logSizeUI is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    return-void
.end method

.method private b(Ljava/io/File;)J
    .locals 11

    .line 183
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 184
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "file is null:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    const-wide/16 v0, 0x0

    return-wide v0

    .line 187
    :cond_0
    const-wide/16 v4, 0x0

    .line 188
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->a(Ljava/io/File;)J

    move-result-wide v0

    add-long/2addr v4, v0

    goto :goto_1

    .line 190
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 191
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    .line 192
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 193
    move-object v7, v6

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_2

    aget-object v10, v7, v9

    .line 194
    invoke-direct {p0, v10}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b(Ljava/io/File;)J

    move-result-wide v0

    add-long/2addr v4, v0

    .line 193
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    goto :goto_1

    .line 197
    :cond_3
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "files is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    :cond_4
    :goto_1
    return-wide v4
.end method

.method private b()V
    .locals 6

    .line 155
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->r()J

    move-result-wide v4

    .line 156
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->l:Ljava/lang/String;

    invoke-direct {p0, v0, v4, v5}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->l:Ljava/lang/String;

    .line 159
    :cond_0
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mfitnessCacheSizeUI is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)Lo/egy;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->n:Lo/egy;

    return-object v0
.end method

.method private c()V
    .locals 6

    .line 84
    sget v0, Lcom/huawei/ui/main/R$id;->hw_clear_fitness_data_right_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->a:Landroid/widget/ImageView;

    .line 85
    sget v0, Lcom/huawei/ui/main/R$id;->hw_clear_medal_data_right_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->e:Landroid/widget/ImageView;

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->hw_clear_other_data_right_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->d:Landroid/widget/ImageView;

    .line 87
    sget v0, Lcom/huawei/ui/main/R$id;->clear_fitness_data_cache_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->c:Landroid/widget/RelativeLayout;

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    sget v0, Lcom/huawei/ui/main/R$id;->clear_medal_data_cache_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->k:Landroid/widget/RelativeLayout;

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    sget v0, Lcom/huawei/ui/main/R$id;->clear_other_data_cache_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->g:Landroid/widget/RelativeLayout;

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_clear_fitness_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->i:Landroid/widget/TextView;

    .line 94
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_clear_medal_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->h:Landroid/widget/TextView;

    .line 95
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_clear_other_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->f:Landroid/widget/TextView;

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->i:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "B"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->p:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 104
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "B"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->o:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 109
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "B"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->a:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->e:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    .line 116
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->a:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->e:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 120
    :goto_3
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 353
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 354
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 356
    const-string v0, "type"

    invoke-interface {v3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 359
    return-void
.end method

.method private d(Ljava/lang/String;J)Ljava/lang/String;
    .locals 11

    .line 247
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getSizeUI "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    new-instance v4, Ljava/text/DecimalFormat;

    const-string v0, "##0.0"

    invoke-direct {v4, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 249
    const-wide/16 v0, 0x400

    cmp-long v0, p2, v0

    if-gez v0, :cond_0

    .line 250
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "B"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_0

    .line 253
    :cond_0
    long-to-double v0, p2

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    div-double v5, v0, v2

    .line 254
    const-wide/high16 v0, 0x4090000000000000L    # 1024.0

    cmpg-double v0, v5, v0

    if-gez v0, :cond_1

    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5, v6}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "KB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 257
    :cond_1
    const-wide/high16 v0, 0x4090000000000000L    # 1024.0

    div-double v7, v5, v0

    .line 258
    const-wide/high16 v0, 0x4090000000000000L    # 1024.0

    cmpg-double v0, v7, v0

    if-gez v0, :cond_2

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v7, v8}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "MB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 261
    :cond_2
    const-wide/high16 v0, 0x4090000000000000L    # 1024.0

    div-double v9, v7, v0

    .line 262
    const-wide/high16 v0, 0x4090000000000000L    # 1024.0

    cmpg-double v0, v9, v0

    if-gez v0, :cond_3

    .line 263
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v9, v10}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "GB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 265
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/high16 v1, 0x4090000000000000L    # 1024.0

    div-double v1, v9, v1

    invoke-virtual {v4, v1, v2}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "TB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 270
    :goto_0
    return-object p1
.end method

.method private d()V
    .locals 0

    .line 146
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->a()V

    .line 147
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b()V

    .line 148
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->e()V

    .line 149
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->g()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)Landroid/content/Context;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->l:Ljava/lang/String;

    return-object p1
.end method

.method private e()V
    .locals 7

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "achievemedal"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->r:Ljava/lang/String;

    .line 167
    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->r:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 168
    invoke-direct {p0, v4}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b(Ljava/io/File;)J

    move-result-wide v5

    .line 169
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "medalSize is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-lez v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->p:Ljava/lang/String;

    invoke-direct {p0, v0, v5, v6}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->p:Ljava/lang/String;

    .line 173
    :cond_0
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mmedalCacheSizeUI is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->p:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    return-void
.end method

.method private f()V
    .locals 5

    .line 274
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    .line 275
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_clear_cache_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_privacy_clear:I

    sget v2, Lcom/huawei/ui/main/R$color;->common_text_red_color:I

    new-instance v3, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$1;

    invoke-direct {v3, p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$1;-><init>(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)V

    .line 276
    invoke-virtual {v0, v1, v2, v3}, Lo/egy$b;->c(IILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal_ios_btn:I

    sget v2, Lcom/huawei/ui/main/R$color;->common_ui_text_color:I

    new-instance v3, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$4;

    invoke-direct {v3, p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$4;-><init>(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)V

    .line 283
    invoke-virtual {v0, v1, v2, v3}, Lo/egy$b;->d(IILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v4

    .line 289
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->n:Lo/egy;

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->n:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 291
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->n:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 294
    :cond_0
    return-void
.end method

.method private g()V
    .locals 4

    .line 300
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter confirm clear cache"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->u:Ljava/lang/String;

    const-string v1, "fitness"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 302
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;-><init>(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)V

    invoke-virtual {v0, v1}, Lo/brt;->c(Lo/bui;)V

    goto/16 :goto_0

    .line 323
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->u:Ljava/lang/String;

    const-string v1, "medal"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dub;->c(Landroid/content/Context;)Lo/dub;

    move-result-object v0

    invoke-virtual {v0}, Lo/dub;->d()V

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->h:Landroid/widget/TextView;

    const-string v1, "0B"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    const-string v0, "0B"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->p:Ljava/lang/String;

    .line 327
    sget-object v0, Lo/dae;->er:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_clear_cache_complish:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 330
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->u:Ljava/lang/String;

    const-string v1, "other"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 331
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->i()V

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->f:Landroid/widget/TextView;

    const-string v1, "0B"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 333
    const-string v0, "0B"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->o:Ljava/lang/String;

    .line 334
    sget-object v0, Lo/dae;->er:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "2"

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_clear_cache_complish:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 337
    :cond_2
    :goto_0
    return-void
.end method

.method private i()V
    .locals 6

    .line 343
    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->m:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 344
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 345
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 346
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "delete log cache is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dub;->c(Landroid/content/Context;)Lo/dub;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dub;->e(Ljava/io/File;)V

    .line 350
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->c:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 125
    const-string v0, "fitness"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->u:Ljava/lang/String;

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->l:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->l:Ljava/lang/String;

    const-string v1, "0B"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 127
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->f()V

    goto :goto_0

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->k:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1

    .line 130
    const-string v0, "medal"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->u:Ljava/lang/String;

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->p:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->p:Ljava/lang/String;

    const-string v1, "0B"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 132
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->f()V

    goto :goto_0

    .line 134
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->g:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_2

    .line 135
    const-string v0, "other"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->u:Ljava/lang/String;

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->o:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->o:Ljava/lang/String;

    const-string v1, "0B"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 137
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->f()V

    .line 140
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 64
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 65
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_clear_data_cache:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->setContentView(I)V

    .line 67
    iput-object p0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b:Landroid/content/Context;

    .line 68
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->d()V

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->c()V

    .line 70
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 79
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 80
    const-string v0, "ClearDataCacheActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 74
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 75
    return-void
.end method
