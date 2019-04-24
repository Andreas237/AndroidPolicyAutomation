.class public Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field private A:[Ljava/lang/String;

.field private B:[Ljava/lang/String;

.field private C:[Ljava/lang/String;

.field private D:[Ljava/lang/String;

.field private E:Landroid/content/Context;

.field private F:Ljava/lang/String;

.field private G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;>;"
        }
    .end annotation
.end field

.field private H:Ljava/lang/String;

.field private I:Ljava/lang/String;

.field private M:I

.field private a:Landroid/widget/RadioButton;

.field private b:Landroid/widget/RadioButton;

.field private c:Landroid/widget/RadioButton;

.field private d:Landroid/widget/RadioButton;

.field private e:Landroid/widget/RadioButton;

.field private f:Landroid/widget/EditText;

.field private g:Landroid/widget/RadioButton;

.field private h:Landroid/widget/RadioButton;

.field private i:Landroid/widget/LinearLayout;

.field private j:[Ljava/lang/String;

.field private k:Landroid/widget/Button;

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/RadioButton;>;"
        }
    .end annotation
.end field

.field private m:Landroid/widget/EditText;

.field private n:Landroid/widget/EditText;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation
.end field

.field private w:Ljava/lang/String;

.field private x:[Ljava/lang/String;

.field private y:[Ljava/lang/String;

.field private z:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 58
    const-string v0, "random"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->p:Ljava/lang/String;

    .line 59
    const-string v0, "insert"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->o:Ljava/lang/String;

    .line 60
    const-string v0, "low"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->u:Ljava/lang/String;

    .line 61
    const-string v0, "high"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->s:Ljava/lang/String;

    .line 62
    const-string v0, "heart"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->r:Ljava/lang/String;

    .line 63
    const-string v0, "weight"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->q:Ljava/lang/String;

    .line 64
    const-string v0, "bloodsugar"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->t:Ljava/lang/String;

    .line 65
    const-string v0, "heart"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->w:Ljava/lang/String;

    .line 76
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "kangkangYMBPA15"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "mumu"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "omronHEM7081"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "omron9200T"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "yuwel680A"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->y:[Ljava/lang/String;

    .line 77
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "4ff7df35-c532-4247-ab42-12b260917bc0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "54af062d-b049-4880-beda-f0cbe64e9205"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "825c82bd-84fe-44a0-9884-6a764bd73183"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "408553b8-0535-4561-8dbf-55c2bbd61b77"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "c647e381-165c-44d2-8e7b-6339c7904fde"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->z:[Ljava/lang/String;

    .line 84
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "honor"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "yolandaCS20E"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "picoocS1S2"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "picoocS1pro"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "HUAWEI Body Fat Scale"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->x:[Ljava/lang/String;

    .line 85
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "7a1063dd-0e0f-4a72-9939-461476ff0259"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "578d0675-cece-4426-bf28-43ce31eb7b5d"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "6ab08ad8-753b-4dd9-bf3a-798a0a1d81bf"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "9684a253-0fb5-4560-8fa3-b925163f8b67"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "34fa0346-d46c-439d-9cb0-2f696618846b"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->A:[Ljava/lang/String;

    .line 92
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "huaweiFit"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "jabra"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "suunto"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "polarH7"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->C:[Ljava/lang/String;

    .line 93
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "9323f6b7-b459-44f4-a698-988d1769832a"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "f83a5e21-3686-42f8-9a13-7296172a7ced"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "79da9d7e-561c-4e14-8a6b-b1d5dc07198a"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "fe33600f-dbb2-4382-9417-21ab8eeb6e42"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->D:[Ljava/lang/String;

    .line 99
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "ultra"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "dnurse"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->j:[Ljava/lang/String;

    .line 100
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "e570b133-357b-4b49-b894-600a27a0e826"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "9bf158ba-49b0-46aa-9fdf-ed75da1569cf"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->B:[Ljava/lang/String;

    .line 106
    const-string v0, "deviceautotest"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->I:Ljava/lang/String;

    .line 108
    const-string v0, "deviceautotestdata"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->F:Ljava/lang/String;

    .line 111
    const-string v0, "deviceautotestinterdata"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->H:Ljava/lang/String;

    .line 117
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->M:I

    return-void
.end method

.method private a(I)V
    .locals 2

    .line 366
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->f:Landroid/widget/EditText;

    const-string v1, "\u8f93\u5165\u9ad8\u538b\u503c"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 368
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->m:Landroid/widget/EditText;

    const-string v1, "\u8f93\u5165\u4f4e\u538b\u503c"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->n:Landroid/widget/EditText;

    const-string v1, "\u8f93\u5165\u5fc3\u7387\u503c"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 370
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->f:Landroid/widget/EditText;

    const-string v1, "\u8f93\u5165\u8840\u7cd6\u503c"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->f:Landroid/widget/EditText;

    const/16 v1, 0x2002

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->m:Landroid/widget/EditText;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setVisibility(I)V

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->n:Landroid/widget/EditText;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setVisibility(I)V

    goto :goto_0

    .line 375
    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->f:Landroid/widget/EditText;

    const-string v1, "\u8f93\u5165\u4f53\u91cd\u503c"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->f:Landroid/widget/EditText;

    const/16 v1, 0x2002

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->m:Landroid/widget/EditText;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setVisibility(I)V

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->n:Landroid/widget/EditText;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setVisibility(I)V

    goto :goto_0

    .line 380
    :cond_2
    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->f:Landroid/widget/EditText;

    const-string v1, "\u8f93\u5165\u5fc3\u7387\u503c"

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->m:Landroid/widget/EditText;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setVisibility(I)V

    .line 383
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->n:Landroid/widget/EditText;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setVisibility(I)V

    .line 385
    :cond_3
    :goto_0
    return-void
.end method

.method private b(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 346
    const-string v0, ""

    .line 347
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 348
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    .line 349
    return-object v0
.end method

.method private b(I)V
    .locals 6

    .line 186
    const-string v0, "DeviceAutoTestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device auto test initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->v:Ljava/util/Map;

    .line 188
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 189
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->y:[Ljava/lang/String;

    array-length v0, v0

    if-ge v4, v0, :cond_0

    .line 190
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 191
    const-string v0, "product_id"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->z:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    const-string v0, "product_bluetoothname"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->y:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    const-string v0, "product_mac"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AA:BB:CC:DD:EE:A"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->v:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->y:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    goto/16 :goto_4

    .line 197
    :cond_1
    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    .line 198
    const/4 v4, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->C:[Ljava/lang/String;

    array-length v0, v0

    if-ge v4, v0, :cond_2

    .line 199
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 200
    const-string v0, "product_id"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->D:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    const-string v0, "product_bluetoothname"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->C:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    const-string v0, "product_mac"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BB:CC:DD:EE:BB:E"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->v:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->C:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    goto/16 :goto_4

    .line 205
    :cond_3
    const/4 v0, 0x2

    if-ne p1, v0, :cond_5

    .line 206
    const/4 v4, 0x0

    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->j:[Ljava/lang/String;

    array-length v0, v0

    if-ge v4, v0, :cond_4

    .line 207
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 208
    const-string v0, "product_id"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->B:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    const-string v0, "product_bluetoothname"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->j:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    const-string v0, "product_mac"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CC:DD:EE:FF:GG:B"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->v:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->j:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    goto :goto_4

    .line 213
    :cond_5
    const/4 v0, 0x3

    if-ne p1, v0, :cond_6

    .line 214
    const/4 v4, 0x0

    :goto_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->x:[Ljava/lang/String;

    array-length v0, v0

    if-ge v4, v0, :cond_6

    .line 215
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 216
    const-string v0, "product_id"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->A:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    const-string v0, "product_bluetoothname"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->x:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    const-string v0, "product_mac"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DD:EE:FF:GG:HH:D"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->v:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->x:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 222
    :cond_6
    :goto_4
    return-void
.end method

.method private c(Ljava/util/Map;)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 328
    const-string v4, ""

    .line 329
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 330
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 331
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 332
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 333
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 334
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 336
    :try_start_0
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 339
    goto :goto_1

    .line 337
    :catch_0
    move-exception v10

    .line 338
    const-string v0, "DeviceAutoTestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonexception e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    :goto_1
    goto :goto_0

    .line 341
    :cond_0
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    .line 342
    return-object v4
.end method

.method private d(I)V
    .locals 8

    .line 225
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 226
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->G:Ljava/util/List;

    .line 227
    const/4 v2, 0x0

    :goto_0
    const/16 v0, 0x64

    if-ge v2, v0, :cond_0

    .line 228
    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 229
    const/16 v0, 0x78

    invoke-virtual {v3, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    rem-int/lit8 v0, v0, 0x5b

    add-int/lit8 v4, v0, 0x1e

    .line 230
    const/16 v0, 0xc8

    invoke-virtual {v3, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    rem-int/lit8 v0, v0, 0x6f

    add-int/lit8 v5, v0, 0x5a

    .line 231
    const/16 v0, 0x104

    invoke-virtual {v3, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    rem-int/lit16 v0, v0, 0xdd

    add-int/lit8 v6, v0, 0x28

    .line 232
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->u:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->s:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->r:Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->G:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_0
    goto/16 :goto_4

    .line 238
    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 239
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->G:Ljava/util/List;

    .line 240
    const/4 v2, 0x0

    :goto_1
    const/16 v0, 0x64

    if-ge v2, v0, :cond_2

    .line 241
    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 242
    const/16 v0, 0x21

    invoke-virtual {v3, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 243
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->t:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->G:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 240
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    goto/16 :goto_4

    .line 247
    :cond_3
    const/4 v0, 0x3

    if-ne p1, v0, :cond_5

    .line 248
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->G:Ljava/util/List;

    .line 249
    const/4 v2, 0x0

    :goto_2
    const/16 v0, 0x64

    if-ge v2, v0, :cond_4

    .line 250
    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 251
    const/16 v0, 0xc8

    invoke-virtual {v3, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 252
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->q:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->G:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 249
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    goto :goto_4

    .line 256
    :cond_5
    const/4 v0, 0x4

    if-ne p1, v0, :cond_6

    .line 257
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->G:Ljava/util/List;

    .line 258
    const/4 v2, 0x0

    :goto_3
    const/16 v0, 0x64

    if-ge v2, v0, :cond_6

    .line 259
    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 260
    const/16 v0, 0xe6

    invoke-virtual {v3, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    rem-int/lit16 v0, v0, 0xab

    add-int/lit8 v4, v0, 0x3c

    .line 261
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->w:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->G:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 258
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 267
    :cond_6
    :goto_4
    return-void
.end method

.method private e(I)V
    .locals 8

    .line 139
    const-string v0, "DeviceAutoTestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device auto test initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    sget v0, Lcom/huawei/ui/main/R$id;->me_develop_button_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->k:Landroid/widget/Button;

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->k:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 142
    sget v0, Lcom/huawei/ui/main/R$id;->measure_test1:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->g:Landroid/widget/RadioButton;

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->g:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->g:Landroid/widget/RadioButton;

    invoke-virtual {v0, p0}, Landroid/widget/RadioButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 145
    sget v0, Lcom/huawei/ui/main/R$id;->measure_test2:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->h:Landroid/widget/RadioButton;

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->h:Landroid/widget/RadioButton;

    invoke-virtual {v0, p0}, Landroid/widget/RadioButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 148
    sget v0, Lcom/huawei/ui/main/R$id;->measure_inter_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->i:Landroid/widget/LinearLayout;

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 150
    sget v0, Lcom/huawei/ui/main/R$id;->edittext_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->f:Landroid/widget/EditText;

    .line 151
    sget v0, Lcom/huawei/ui/main/R$id;->edittext_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->m:Landroid/widget/EditText;

    .line 152
    sget v0, Lcom/huawei/ui/main/R$id;->edittext_three:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->n:Landroid/widget/EditText;

    .line 154
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->l:Ljava/util/ArrayList;

    .line 156
    sget v0, Lcom/huawei/ui/main/R$id;->test1:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->c:Landroid/widget/RadioButton;

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->c:Landroid/widget/RadioButton;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->l:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->c:Landroid/widget/RadioButton;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    sget v0, Lcom/huawei/ui/main/R$id;->test2:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->d:Landroid/widget/RadioButton;

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->d:Landroid/widget/RadioButton;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->l:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->d:Landroid/widget/RadioButton;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    sget v0, Lcom/huawei/ui/main/R$id;->test3:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->b:Landroid/widget/RadioButton;

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->b:Landroid/widget/RadioButton;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->l:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->b:Landroid/widget/RadioButton;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    sget v0, Lcom/huawei/ui/main/R$id;->test4:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->a:Landroid/widget/RadioButton;

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->a:Landroid/widget/RadioButton;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->l:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->a:Landroid/widget/RadioButton;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    sget v0, Lcom/huawei/ui/main/R$id;->test5:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->e:Landroid/widget/RadioButton;

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->e:Landroid/widget/RadioButton;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->l:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->e:Landroid/widget/RadioButton;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->v:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 172
    const/4 v4, 0x0

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->v:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 174
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 175
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 176
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    invoke-virtual {v0, v7}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    .line 179
    add-int/lit8 v4, v4, 0x1

    .line 180
    goto :goto_0

    .line 183
    :cond_0
    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->g:Landroid/widget/RadioButton;

    if-ne p1, v0, :cond_0

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->g:Landroid/widget/RadioButton;

    invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 356
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 358
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->h:Landroid/widget/RadioButton;

    if-ne p1, v0, :cond_1

    .line 359
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->h:Landroid/widget/RadioButton;

    invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 363
    :cond_1
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 12

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->k:Landroid/widget/Button;

    if-ne p1, v0, :cond_8

    .line 272
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_8

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    invoke-virtual {v0}, Landroid/widget/RadioButton;->getVisibility()I

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->v:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->l:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    invoke-virtual {v1}, Landroid/widget/RadioButton;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->g:Landroid/widget/RadioButton;

    invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    const-string v0, "product_random_insert"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->p:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->h:Landroid/widget/RadioButton;

    invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 279
    const-string v0, "product_random_insert"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->o:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    :cond_1
    :goto_1
    invoke-direct {p0, v3}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->c(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    .line 282
    new-instance v5, Lo/ffz;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->E:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->I:Ljava/lang/String;

    invoke-direct {v5, v0, v1}, Lo/ffz;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 283
    const-string v0, "product_id"

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0, v4}, Lo/ffz;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->g:Landroid/widget/RadioButton;

    invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 287
    new-instance v6, Lo/ffz;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->E:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->F:Ljava/lang/String;

    invoke-direct {v6, v0, v1}, Lo/ffz;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->G:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v7

    .line 289
    const-string v0, "product_id"

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0, v7}, Lo/ffz;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    goto/16 :goto_3

    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->h:Landroid/widget/RadioButton;

    invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 291
    new-instance v6, Lo/ffz;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->E:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->H:Ljava/lang/String;

    invoke-direct {v6, v0, v1}, Lo/ffz;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 292
    const-string v7, ""

    .line 293
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->M:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->m:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->n:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    .line 297
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->u:Ljava/lang/String;

    invoke-interface {v11, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->s:Ljava/lang/String;

    invoke-interface {v11, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->r:Ljava/lang/String;

    invoke-interface {v11, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    invoke-direct {p0, v11}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->c(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    .line 303
    goto/16 :goto_2

    :cond_3
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->M:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    .line 305
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->w:Ljava/lang/String;

    invoke-interface {v9, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->c(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    .line 309
    goto :goto_2

    :cond_4
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->M:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    .line 311
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->t:Ljava/lang/String;

    invoke-interface {v9, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->c(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    .line 314
    goto :goto_2

    :cond_5
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->M:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    .line 316
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->q:Ljava/lang/String;

    invoke-interface {v9, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->c(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    .line 320
    :cond_6
    :goto_2
    const-string v0, "product_id"

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v0, v7}, Lo/ffz;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    :cond_7
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 325
    :cond_8
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 121
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 122
    const-string v0, "DeviceAutoTestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "device auto test onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_developer_device_auto_test:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->setContentView(I)V

    .line 124
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->E:Landroid/content/Context;

    .line 125
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 126
    if-nez v4, :cond_0

    .line 127
    const-string v0, "DeviceAutoTestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    return-void

    .line 130
    :cond_0
    const-string v0, "device"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 131
    iput v5, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->M:I

    .line 132
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->b(I)V

    .line 133
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->d(I)V

    .line 134
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->e(I)V

    .line 135
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/DeviceAutoTestActivity;->a(I)V

    .line 136
    return-void
.end method
