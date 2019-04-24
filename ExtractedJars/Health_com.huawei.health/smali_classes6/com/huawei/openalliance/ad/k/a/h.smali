.class public Lcom/huawei/openalliance/ad/k/a/h;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/k/a/g;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/a/h;->a:Landroid/content/Context;

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/metadata/MetaData;)I
    .locals 4

    if-nez p1, :cond_0

    const/4 v0, 0x3

    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getApkInfo()Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;

    move-result-object v2

    if-nez v2, :cond_1

    const/4 v0, 0x3

    return v0

    :cond_1
    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    return v0

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a/h;->a:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/c;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x2

    :goto_0
    return v0
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/metadata/MetaData;Lcom/huawei/openalliance/ad/k/c;)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/k/a/h;->a(Lcom/huawei/openalliance/ad/beans/metadata/MetaData;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v2, 0x1

    goto :goto_1

    :pswitch_1
    const/4 v2, 0x6

    goto :goto_1

    :goto_0
    :pswitch_2
    const/16 v2, 0x9

    :goto_1
    invoke-virtual {p2, v2}, Lcom/huawei/openalliance/ad/k/c;->b(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/metadata/MetaData;Ljava/lang/String;Lcom/huawei/openalliance/ad/k/c;)V
    .locals 4

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/k/a/h;->a(Lcom/huawei/openalliance/ad/beans/metadata/MetaData;)I

    move-result v1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a/h;->a:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/huawei/openalliance/ad/utils/c;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    if-nez v2, :cond_0

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v3, 0x3

    goto :goto_1

    :pswitch_1
    const/4 v3, 0x2

    goto :goto_1

    :goto_0
    :pswitch_2
    const/4 v3, 0x7

    :goto_1
    invoke-virtual {p3, v3}, Lcom/huawei/openalliance/ad/k/c;->b(I)V

    goto :goto_4

    :cond_0
    packed-switch v1, :pswitch_data_1

    goto :goto_2

    :pswitch_3
    const/4 v3, 0x4

    goto :goto_3

    :pswitch_4
    const/4 v3, 0x5

    goto :goto_3

    :goto_2
    :pswitch_5
    const/16 v3, 0x8

    :goto_3
    invoke-virtual {p3, v3}, Lcom/huawei/openalliance/ad/k/c;->b(I)V

    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/a/h;Ljava/lang/String;ILcom/huawei/openalliance/ad/beans/metadata/Content;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/k/a/h;->b(Ljava/lang/String;ILcom/huawei/openalliance/ad/beans/metadata/Content;)V

    return-void
.end method

.method private b(Ljava/lang/String;ILcom/huawei/openalliance/ad/beans/metadata/Content;)V
    .locals 6

    invoke-virtual {p3}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getMetaData()Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {p1, p3, p2}, Lcom/huawei/openalliance/ad/k/g;->a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Content;I)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v3

    new-instance v4, Lcom/huawei/openalliance/ad/k/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a/h;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/a/h;->a:Landroid/content/Context;

    invoke-static {v1, p2}, Lcom/huawei/openalliance/ad/m/a/c;->a(Landroid/content/Context;I)Lcom/huawei/openalliance/ad/m/a/a/b;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    invoke-virtual {v4, v3}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getIntent__()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, v2, v5, v4}, Lcom/huawei/openalliance/ad/k/a/h;->a(Lcom/huawei/openalliance/ad/beans/metadata/MetaData;Ljava/lang/String;Lcom/huawei/openalliance/ad/k/c;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, v2, v4}, Lcom/huawei/openalliance/ad/k/a/h;->a(Lcom/huawei/openalliance/ad/beans/metadata/MetaData;Lcom/huawei/openalliance/ad/k/c;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;ILcom/huawei/openalliance/ad/beans/metadata/Content;)Z
    .locals 5

    if-eqz p3, :cond_1

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "PreCheckFilter"

    const-string v1, "filterContents adType: %d contentid: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p3}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getContentid__()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/k/a/h$1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/k/a/h$1;-><init>(Lcom/huawei/openalliance/ad/k/a/h;Ljava/lang/String;ILcom/huawei/openalliance/ad/beans/metadata/Content;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
