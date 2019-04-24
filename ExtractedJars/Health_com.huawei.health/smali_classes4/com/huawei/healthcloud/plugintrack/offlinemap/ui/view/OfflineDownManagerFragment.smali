.class public Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;"
        }
    .end annotation
.end field

.field private b:Lo/cge;

.field private c:Lo/cfq;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;"
        }
    .end annotation
.end field

.field private e:Lo/cfq;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Lo/cge;

.field private k:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 73
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->a:Ljava/util/ArrayList;

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->d:Ljava/util/ArrayList;

    .line 74
    return-void
.end method

.method static synthetic a(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;I)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->c(I)V

    return-void
.end method

.method private a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)V"
        }
    .end annotation

    .line 135
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processShowListEnable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 138
    :cond_0
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processShowListEnable loadingCityList or downCityList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-void

    .line 141
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 143
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 145
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;->b:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;)V

    goto :goto_0

    .line 149
    :cond_2
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;)V

    goto :goto_0

    .line 154
    :cond_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_4

    .line 156
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;)V

    goto :goto_0

    .line 160
    :cond_4
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;)V

    .line 163
    :goto_0
    return-void
.end method

.method private b(I)V
    .locals 6

    .line 229
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteConfirmDialog() position:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    .line 231
    invoke-virtual {v4}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getCity()Ljava/lang/String;

    move-result-object v5

    .line 232
    invoke-direct {p0, v5}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->b(Ljava/lang/String;)V

    .line 233
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 10

    .line 270
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteCityDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_confirm_delete_map:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 272
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 273
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v9

    .line 274
    instance-of v0, v9, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    if-nez v0, :cond_0

    .line 276
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteCityDialog factivity != OfflineMapTabActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    return-void

    .line 279
    :cond_0
    invoke-static {v9}, Lo/cgd;->b(Landroid/content/Context;)Lo/cgd;

    move-result-object v0

    invoke-virtual {v0}, Lo/cgd;->e()Lo/cfy;

    move-result-object v0

    move-object v2, v8

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_cancel:I

    sget v5, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_contact_delete:I

    new-instance v6, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$2;

    invoke-direct {v6, p0, v9, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$2;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;Landroid/support/v4/app/FragmentActivity;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v6}, Lo/cfy;->b(Ljava/lang/String;Ljava/lang/String;ZIILo/cfy$d;)V

    .line 296
    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)V"
        }
    .end annotation

    .line 215
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->e:Lo/cfq;

    invoke-virtual {v0, p1}, Lo/cfq;->c(Ljava/util/List;)V

    .line 216
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->e:Lo/cfq;

    invoke-virtual {v0}, Lo/cfq;->notifyDataSetChanged()V

    .line 217
    return-void
.end method

.method private c(I)V
    .locals 7

    .line 238
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteLoadingConfirmDialog() position:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/amap/api/maps/offlinemap/OfflineMapCity;

    .line 240
    invoke-virtual {v4}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getCity()Ljava/lang/String;

    move-result-object v5

    .line 241
    invoke-virtual {v4}, Lcom/amap/api/maps/offlinemap/OfflineMapCity;->getState()I

    move-result v6

    .line 242
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteLoadingConfirmDialog state:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    .line 246
    :sswitch_0
    goto :goto_1

    .line 248
    :sswitch_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_pause:I

    .line 249
    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 248
    const/16 v1, 0x64

    invoke-direct {p0, v5, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->d(Ljava/lang/String;Ljava/lang/String;I)V

    .line 251
    goto :goto_1

    .line 253
    :sswitch_2
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_start:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x66

    invoke-direct {p0, v5, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->d(Ljava/lang/String;Ljava/lang/String;I)V

    .line 254
    goto :goto_1

    .line 259
    :sswitch_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_offlinemap_download_start:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x65

    invoke-direct {p0, v5, v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->d(Ljava/lang/String;Ljava/lang/String;I)V

    .line 260
    goto :goto_1

    .line 262
    :goto_0
    invoke-direct {p0, v5}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->b(Ljava/lang/String;)V

    .line 265
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_0
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x5 -> :sswitch_3
        0x6 -> :sswitch_3
        0x65 -> :sswitch_3
    .end sparse-switch
.end method

.method private c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;)V
    .locals 4

    .line 168
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enableShowList  type : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$5;->d:[I

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 172
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 173
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 174
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 175
    goto :goto_0

    .line 177
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 178
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 179
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 180
    goto :goto_0

    .line 182
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 183
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 184
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 185
    goto :goto_0

    .line 187
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 188
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 189
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 190
    goto :goto_0

    .line 192
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 193
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 194
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 195
    .line 199
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private c(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)V"
        }
    .end annotation

    .line 222
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->c:Lo/cfq;

    invoke-virtual {v0, p1}, Lo/cfq;->c(Ljava/util/List;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->c:Lo/cfq;

    invoke-virtual {v0}, Lo/cfq;->notifyDataSetChanged()V

    .line 224
    return-void
.end method

.method private d()V
    .locals 4

    .line 102
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    new-instance v0, Lo/cfq;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->a:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lo/cfq;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->e:Lo/cfq;

    .line 104
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->i:Lo/cge;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->e:Lo/cfq;

    invoke-virtual {v0, v1}, Lo/cge;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 105
    new-instance v0, Lo/cfq;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->d:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lo/cfq;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->c:Lo/cfq;

    .line 106
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->b:Lo/cge;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->c:Lo/cfq;

    invoke-virtual {v0, v1}, Lo/cge;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->b:Lo/cge;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$4;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;)V

    invoke-virtual {v0, v1}, Lo/cge;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->i:Lo/cge;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$1;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;)V

    invoke-virtual {v0, v1}, Lo/cge;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 128
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;

    invoke-direct {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$a;)V

    .line 129
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 12

    .line 302
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$style;->common_ui_CustomDialog:I

    invoke-direct {v3, v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 303
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v4

    .line 304
    const/4 v0, 0x2

    new-array v5, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p2, v5, v0

    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_contact_delete:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 305
    new-instance v6, Landroid/widget/ArrayAdapter;

    .line 306
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_offlinemap_common_ui_dialog_cornerlistview:I

    invoke-direct {v6, v0, v1, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 307
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v7

    .line 308
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_offlinemap_common_ui_dialog_listview:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v7, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v8

    .line 309
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->listView:I

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/cfw;

    .line 310
    invoke-virtual {v9, v6}, Lo/cfw;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 311
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;

    invoke-direct {v0, p0, p3, p1, v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment$3;-><init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;ILjava/lang/String;Landroid/app/AlertDialog;)V

    invoke-virtual {v9, v0}, Lo/cfw;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 358
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Lo/cfw;->measure(II)V

    .line 359
    invoke-virtual {v9}, Lo/cfw;->getMeasuredHeight()I

    move-result v0

    mul-int/lit8 v10, v0, 0x2

    .line 360
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cfy;->a(Landroid/content/Context;)I

    move-result v11

    .line 361
    invoke-virtual {v4}, Landroid/app/AlertDialog;->show()V

    .line 362
    invoke-virtual {v4}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 363
    invoke-virtual {v4}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/high16 v2, 0x42200000    # 40.0f

    invoke-static {v1, v2}, Lo/cfy;->a(Landroid/content/Context;F)I

    move-result v1

    sub-int v1, v11, v1

    invoke-virtual {v0, v1, v10}, Landroid/view/Window;->setLayout(II)V

    .line 364
    return-void
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;I)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->b(I)V

    return-void
.end method


# virtual methods
.method public b(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;Ljava/util/ArrayList<Lcom/amap/api/maps/offlinemap/OfflineMapCity;>;)V"
        }
    .end annotation

    .line 204
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDownCityList size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "mLoadingCityList size"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->a:Ljava/util/ArrayList;

    .line 206
    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->d:Ljava/util/ArrayList;

    .line 207
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->b(Ljava/util/ArrayList;)V

    .line 208
    invoke-direct {p0, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->c(Ljava/util/ArrayList;)V

    .line 209
    invoke-direct {p0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 210
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 80
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_offlinemap_down_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 82
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->list_load_ok:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/cge;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->b:Lo/cge;

    .line 83
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->list_loading:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/cge;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->i:Lo/cge;

    .line 84
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->ll_load_ok:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->h:Landroid/widget/LinearLayout;

    .line 85
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->ll_loading:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->k:Landroid/widget/LinearLayout;

    .line 86
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->ll_warn:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->g:Landroid/widget/LinearLayout;

    .line 87
    return-object v4
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .line 94
    const-string v0, "OfflineDownManagerFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onViewCreated()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 96
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineDownManagerFragment;->d()V

    .line 97
    return-void
.end method
