.class public Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lo/cfr$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$e;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$d;,
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;"
        }
    .end annotation
.end field

.field private c:Landroid/widget/ExpandableListView;

.field private d:Lo/cfq;

.field private e:Lo/cfm;

.field private f:Landroid/widget/ListView;

.field private g:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$e;

.field private h:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$d;

.field private i:Landroid/widget/TextView;

.field private k:Ljava/lang/String;

.field private l:Landroid/widget/ImageView;

.field private m:Landroid/widget/ImageView;

.field private o:Lo/cfr;

.field private p:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 107
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 57
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->b:Ljava/util/HashMap;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->a:Ljava/util/List;

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->k:Ljava/lang/String;

    .line 87
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$d;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$d;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$d;

    .line 90
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$e;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$e;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->g:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$e;

    .line 108
    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->m:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)Ljava/util/HashMap;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->b:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->k:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->l:Landroid/widget/ImageView;

    return-object v0
.end method

.method private d(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;)V
    .locals 4

    .line 273
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enableShowList  type : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$2;->b:[I

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 277
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 278
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->f:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 279
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->c:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 281
    goto :goto_0

    .line 283
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 284
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->f:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 285
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->c:Landroid/widget/ExpandableListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 287
    goto :goto_0

    .line 289
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 290
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->f:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 291
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->c:Landroid/widget/ExpandableListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 293
    .line 298
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private d(Ljava/util/ArrayList;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapProvince;>;Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;)V"
        }
    .end annotation

    .line 267
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->e:Lo/cfm;

    invoke-virtual {v0, p2, p1}, Lo/cfm;->c(Ljava/util/HashMap;Ljava/util/ArrayList;)V

    .line 268
    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)V"
        }
    .end annotation

    .line 259
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d:Lo/cfq;

    invoke-virtual {v0, p1}, Lo/cfq;->c(Ljava/util/List;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d:Lo/cfq;

    invoke-virtual {v0}, Lo/cfq;->notifyDataSetChanged()V

    .line 261
    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)Landroid/widget/EditText;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->p:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->k:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;Ljava/util/List;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d(Ljava/util/List;)V

    return-void
.end method

.method static synthetic h(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)Lo/cfr;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->o:Lo/cfr;

    return-object v0
.end method


# virtual methods
.method public c(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)V"
        }
    .end annotation

    .line 389
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSearchResult() cities size:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$d;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 392
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSearchResult() mHandler null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    return-void

    .line 395
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$d;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$d;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 396
    const/16 v0, 0x64

    iput v0, v4, Landroid/os/Message;->what:I

    .line 397
    iput-object p1, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 398
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->h:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$d;

    invoke-virtual {v0, v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$d;->sendMessage(Landroid/os/Message;)Z

    .line 399
    return-void
.end method

.method public d()V
    .locals 3

    .line 404
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->p:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->clearFocus()V

    .line 405
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->p:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setCursorVisible(Z)V

    .line 406
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->m:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 408
    .line 409
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 410
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->p:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 411
    return-void
.end method

.method public e(Ljava/util/ArrayList;Ljava/util/HashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapProvince;>;Ljava/util/HashMap<Ljava/lang/Integer;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CityListBean;>;)V"
        }
    .end annotation

    .line 243
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updataMap() provinceList:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ",cityMap:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/util/HashMap;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->b:Ljava/util/HashMap;

    .line 245
    invoke-direct {p0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d(Ljava/util/ArrayList;Ljava/util/HashMap;)V

    .line 246
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->k:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 248
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->o:Lo/cfr;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->k:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v1, v2}, Lo/cfr;->a(Ljava/lang/String;Ljava/util/HashMap;)V

    goto :goto_0

    .line 252
    :cond_0
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;)V

    .line 254
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 163
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_offlinemap_citylist_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 165
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->list:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ExpandableListView;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->c:Landroid/widget/ExpandableListView;

    .line 166
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->list_search_city:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->f:Landroid/widget/ListView;

    .line 167
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->txt_no_city:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->i:Landroid/widget/TextView;

    .line 169
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->search_editor:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->p:Landroid/widget/EditText;

    .line 170
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->image_cancel:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->m:Landroid/widget/ImageView;

    .line 171
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->image_search:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->l:Landroid/widget/ImageView;

    .line 172
    return-object v4
.end method

.method public onDestroy()V
    .locals 4

    .line 326
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 328
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->o:Lo/cfr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 330
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->o:Lo/cfr;

    invoke-virtual {v0}, Lo/cfr;->b()V

    .line 332
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d()V

    .line 333
    return-void
.end method

.method public onDetach()V
    .locals 0

    .line 156
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 157
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 318
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 320
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 311
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 313
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 304
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 306
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .line 180
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onViewCreated()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->p:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->g:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$e;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 183
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->p:Landroid/widget/EditText;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$1;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->p:Landroid/widget/EditText;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$4;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->m:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$5;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 228
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->c:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setGroupIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 229
    new-instance v0, Lo/cfm;

    .line 230
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->b:Ljava/util/HashMap;

    invoke-direct {v0, v1, v2, v3}, Lo/cfm;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;Ljava/util/HashMap;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->e:Lo/cfm;

    .line 231
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->c:Landroid/widget/ExpandableListView;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->e:Lo/cfm;

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 232
    new-instance v0, Lo/cfq;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->a:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lo/cfq;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d:Lo/cfq;

    .line 233
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->f:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d:Lo/cfq;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 234
    new-instance v0, Lo/cfr;

    invoke-direct {v0}, Lo/cfr;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->o:Lo/cfr;

    .line 235
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->o:Lo/cfr;

    invoke-virtual {v0, p0}, Lo/cfr;->d(Lo/cfr$e;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->o:Lo/cfr;

    invoke-virtual {v0}, Lo/cfr;->c()V

    .line 237
    return-void
.end method
