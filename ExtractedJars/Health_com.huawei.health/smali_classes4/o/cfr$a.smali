.class Lo/cfr$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cfr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/cfr;>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lo/cfr;Ljava/util/HashMap;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/cfr;Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;I)V"
        }
    .end annotation

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iput-object p1, p0, Lo/cfr$a;->d:Ljava/lang/String;

    .line 103
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/cfr$a;->b:Ljava/lang/ref/WeakReference;

    .line 104
    iput-object p3, p0, Lo/cfr$a;->a:Ljava/util/HashMap;

    .line 105
    iput p4, p0, Lo/cfr$a;->c:I

    .line 106
    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 111
    iget-object v0, p0, Lo/cfr$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cfr;

    .line 112
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 114
    const-string v0, "OfflineMapSearchThreadManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyRunnable run() fragment null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    return-void

    .line 117
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 118
    iget-object v0, p0, Lo/cfr$a;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v6

    .line 119
    const/4 v0, 0x1

    if-gt v6, v0, :cond_1

    .line 121
    const-string v0, "OfflineMapSearchThreadManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyRunnable run() size <=1 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    return-void

    .line 125
    :cond_1
    const/4 v7, 0x1

    :goto_0
    if-ge v7, v6, :cond_5

    .line 127
    iget-object v0, p0, Lo/cfr$a;->a:Ljava/util/HashMap;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/ArrayList;

    .line 128
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    .line 130
    invoke-virtual {v10}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getCity()Ljava/lang/String;

    move-result-object v11

    .line 131
    invoke-virtual {v10}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getJianpin()Ljava/lang/String;

    move-result-object v12

    .line 132
    iget-object v0, p0, Lo/cfr$a;->d:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v13

    .line 133
    iget-object v0, p0, Lo/cfr$a;->d:Ljava/lang/String;

    invoke-virtual {v11, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 134
    invoke-virtual {v10}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getPinyin()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 136
    :cond_2
    const-string v0, "OfflineMapSearchThreadManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "city:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    const-string v2, "pinyin:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    invoke-interface {v5, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    :cond_3
    goto :goto_1

    .line 125
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 141
    :cond_5
    const-string v0, "OfflineMapSearchThreadManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyRunnable run() end mCurrentCount:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cfr$a;->c:I

    .line 143
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",mThreadCount:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 145
    invoke-static {v4}, Lo/cfr;->c(Lo/cfr;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 141
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget v0, p0, Lo/cfr$a;->c:I

    invoke-static {v4}, Lo/cfr;->c(Lo/cfr;)I

    move-result v1

    if-eq v0, v1, :cond_6

    .line 148
    const-string v0, "OfflineMapSearchThreadManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyRunnable run() mCurrentCount != mThreadCount:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    return-void

    .line 152
    :cond_6
    invoke-static {v4}, Lo/cfr;->b(Lo/cfr;)Lo/cfr$e;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 154
    invoke-static {v4}, Lo/cfr;->b(Lo/cfr;)Lo/cfr$e;

    move-result-object v0

    invoke-interface {v0, v5}, Lo/cfr$e;->c(Ljava/util/List;)V

    .line 156
    :cond_7
    return-void
.end method
